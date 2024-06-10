package br.org.nave.nave_project.service;

import br.org.nave.nave_project.models.SchoolSubject;
import br.org.nave.nave_project.models.Student;
import br.org.nave.nave_project.models.dto.SchoolSubjectDTO;
import br.org.nave.nave_project.utils.fakeDatabase.SchoolSubjectDb;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolSubjectService {

    private final SchoolSubjectDb schoolSubjectRepository;

    private final StudentService studentService;

    public SchoolSubjectService() {
        this.schoolSubjectRepository = new SchoolSubjectDb();
        this.studentService = new StudentService();
    }

    public void addStudentInSchoolSubject(SchoolSubjectDTO schoolSubject) throws Exception {
        List<String> studentsUuid = schoolSubject.getStudents().stream().map(Student::getUuid).toList();
        Optional<SchoolSubject> schoolSubjectOptional = this.schoolSubjectRepository.findByUuid(schoolSubject.getUuid());

        if (schoolSubjectOptional.isPresent()) {
            SchoolSubject schSubject = schoolSubjectOptional.get();
            for (String uuid : studentsUuid) {
                this.addNewStudentInSchoolSubject(schSubject, uuid);
            }
        } else {
            throw new Exception("School Subject not found!");
        }

    }

    private void addNewStudentInSchoolSubject(SchoolSubject schoolSubject, String studentUuid) {
        schoolSubject.addStudentsUuid(studentUuid);
        this.studentService.addNewSchoolSubject(studentUuid, schoolSubject);
    }

    public List<SchoolSubject> getAllSchoolSubjects() {
        return this.schoolSubjectRepository.getSchoolSubjects();
    }

}
