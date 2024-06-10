package br.org.nave.nave_project.models;

import br.org.nave.nave_project.utils.AppUtils;

public class Professor {

    private String fullName;

    private String cpf;

    // Unique Key
    private String username;

    private String password;

    private String uuid;

    public Professor(String fullName, String cpf, String username, String password, String uuid) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
