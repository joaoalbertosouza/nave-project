package br.org.nave.nave_project.utils.fakeDatabase;

import br.org.nave.nave_project.models.Student;
import br.org.nave.nave_project.utils.DomainUtils;
import br.org.nave.nave_project.utils.enums.GradeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDb {

    private static List<Student> students = new ArrayList<>(List.of(
            new Student("joao.alberto", "123", "João Alberto", DomainUtils.buildDomain("joao.alberto"), GradeEnum.THIRD, null, "993dbfec-1e92-421d-9383-edc3a3fc3613"),
            new Student("thaisa.rodrigues", "123", "Thaisa Rodrigues", DomainUtils.buildDomain("thaisa.rodrigues"), GradeEnum.SECOND, null, "01074c4d-a282-4c3c-ac28-61dec220e83c"),
            new Student("jessica.santos", "123", "Jessica Santos", DomainUtils.buildDomain("essica.santos"), GradeEnum.FIRST, null, "3d1666cd-a58d-4c79-87fc-4c80bdb462f0"),
            new Student("felipe.vital", "123", "Felipe Vital", DomainUtils.buildDomain("felipe.vital"), GradeEnum.SECOND, null, "03315584-5ed6-40fb-8255-cd1d8b579ddd"),
            new Student("jose.victor", "123", "José Victor", DomainUtils.buildDomain("jose.victor"), GradeEnum.THIRD, null, "2603e827-ee46-42b1-bf37-472d8458d142")
    ));

    public StudentDb() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public Optional<Student> getStudentById(String uuid) {
        return this.students.stream().filter(student -> student.getUuid().equals(uuid)).findFirst();
    }
}
