package br.org.nave.nave_project.models;

import br.org.nave.nave_project.models.dto.StudentDTO;
import br.org.nave.nave_project.utils.AppUtils;
import br.org.nave.nave_project.utils.DomainUtils;
import br.org.nave.nave_project.utils.enums.GradeEnum;

public class Student {

    private String username;
    private String password;
    private String fullName;
    private String formatedLogin;
    private GradeEnum gradeEnum;
    private SchoolSubject schoolSubject;
    private String uuid;

    public Student() {
    }

    public Student(String username, String password, String fullName, String formatedLogin, GradeEnum gradeEnum, SchoolSubject schoolSubject, String uuid) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.formatedLogin = formatedLogin;
        this.gradeEnum = gradeEnum;
        this.schoolSubject = schoolSubject;
        this.uuid = uuid;
    }

    public Student(StudentDTO studentDTO) {
        this.username = studentDTO.getUsername();
        this.password = studentDTO.getPassword();
        this.fullName = studentDTO.getFullName();
        this.gradeEnum = studentDTO.getGradeEnum();
        this.schoolSubject = studentDTO.getSchoolSubject();
        this.uuid = AppUtils.generateRandomUuid();
        this.formatedLogin = studentDTO.getUsername().contains(DomainUtils.loginDomain) ? studentDTO.getUsername()
                : DomainUtils.buildDomain(studentDTO.getUsername());
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

    public String getFormatedLogin() {
        return formatedLogin;
    }

    public void setFormatedLogin(String formatedLogin) {
        this.formatedLogin = formatedLogin;
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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", formatedLogin='" + formatedLogin + '\'' +
                ", gradeEnum=" + gradeEnum +
                ", schoolSubject=" + schoolSubject +
                '}';
    }

    public Boolean isLoginMatch(String email, String password) {
        return this.formatedLogin.equals(email) && this.password.equals(password);
    }
}
