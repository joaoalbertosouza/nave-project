package br.org.nave.nave_project.models.dto;

import br.org.nave.nave_project.models.SchoolSubject;
import br.org.nave.nave_project.models.Student;
import br.org.nave.nave_project.utils.enums.GradeEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class StudentDTO {

    @NotNull(message = "Username is required")
    @NotEmpty(message = "Username is required")
    private String username;

    @NotNull(message = "Password is required")
    @NotEmpty(message = "Password is required")
    private String password;

    @NotNull(message = "FullName is required")
    @NotEmpty(message = "FullName is required")
    private String fullName;

    @NotNull(message = "GradeEnum is required")
    private GradeEnum gradeEnum;

    private SchoolSubject schoolSubject;

    private String uuid;

    public StudentDTO() {}

    public StudentDTO(Student student) {
        this.username = student.getUsername();
        this.password = student.getPassword();
        this.fullName = student.getFullName();
        this.gradeEnum = student.getGradeEnum();
        this.schoolSubject = student.getSchoolSubject();
        this.uuid = student.getUuid();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GradeEnum getGradeEnum() {
        return gradeEnum;
    }

    public void setGradeEnum(GradeEnum gradeEnum) {
        this.gradeEnum = gradeEnum;
    }

    public SchoolSubject getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(SchoolSubject schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public String getUuid() {
        return uuid;
    }

}
