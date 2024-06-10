package br.org.nave.nave_project.service;

import br.org.nave.nave_project.models.SchoolSubject;
import br.org.nave.nave_project.models.Student;
import br.org.nave.nave_project.models.dto.StudentDTO;
import br.org.nave.nave_project.utils.fakeDatabase.StudentDb;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDb studentRepository;

    public StudentService() {
        this.studentRepository = new StudentDb();
    }

    public Optional<Student> getStudentByEmail(String email) {
        return this.getAllStudents().stream().filter(student -> student.getFormatedLogin().equals(email)).findFirst();
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.getStudents();
    }

    public void insertStudent(StudentDTO studentObject) throws Exception {
        try {
            Student student = new Student(studentObject);
            this.studentRepository.save(student);
        } catch (Exception e){
            System.out.println("Error on insert student caused by: " + e);
            throw new Exception("Error on insert student");
        }
    }

    public void addNewSchoolSubject(String studentUuid, SchoolSubject schoolSubject) {
        Optional<Student> studentOptional = this.studentRepository.getStudentById(studentUuid);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            this.studentRepository.remove(student);
            student.setSchoolSubject(schoolSubject);
            this.studentRepository.save(student);
        }
    }
}
