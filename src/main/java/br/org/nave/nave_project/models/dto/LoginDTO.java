package br.org.nave.nave_project.models.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginDTO {

    @NotEmpty(message = "Username is required")
    @Size(min = 5, message = "Username must be at least 5 characters long")
    private String username;

    @NotEmpty(message = "Password is required")
    @Size(min = 3, message = "Password must be at least 3 characters long")
    private String password;

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
}
