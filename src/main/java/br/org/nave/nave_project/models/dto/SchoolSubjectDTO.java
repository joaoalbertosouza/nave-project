package br.org.nave.nave_project.models.dto;

import br.org.nave.nave_project.models.Professor;
import br.org.nave.nave_project.models.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolSubjectDTO {

    private String uuid;
    private String name;
    private String description;
    private int studentsCount;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public SchoolSubjectDTO() {}

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "SchoolSubjectDTO{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", studentsCount=" + studentsCount +
                ", professor=" + professor +
                ", students=" + students +
                '}';
    }
}
