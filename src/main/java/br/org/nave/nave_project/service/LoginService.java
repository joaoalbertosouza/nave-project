package br.org.nave.nave_project.service;

import br.org.nave.nave_project.models.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final StudentService studentService;

    public LoginService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Boolean login(String email, String password) {
        Optional<Student> studentOptional = this.studentService.getStudentByEmail(email);

        if (studentOptional.isPresent()) {
            return studentOptional.get().isLoginMatch(email, password);
        }
        return false;
    }


}
