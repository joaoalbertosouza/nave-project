package br.org.nave.nave_project.models;

import java.util.ArrayList;
import java.util.List;

public class SchoolSubject {

    private String uuid;
    private String name;
    private String description;
    private int studentsCount;
    private String professorUuid;
    private List<String> studentsUuids = new ArrayList<>();

    public SchoolSubject() {
    }

    public SchoolSubject(String uuid, String name, String description, String professorUuid, List<String> studentsUuids) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.professorUuid = professorUuid;
        this.studentsUuids = studentsUuids;
    }

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

    public String getProfessorUuid() {
        return professorUuid;
    }

    public void setProfessorUuid(String professorUuid) {
        this.professorUuid = professorUuid;
    }

    public List<String> getStudentsUuids() {
        return studentsUuids;
    }

    public void setStudentsUuids(List<String> studentsUuids) {
        this.studentsUuids = studentsUuids;
    }

    public void addStudentsUuid(String studentsUuid) {
        this.studentsUuids.add(studentsUuid);
        this.studentsCount++;
    }

    @Override
    public String toString() {
        return "SchoolSubject{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", studentsCount=" + studentsCount +
                ", professorId=" + professorUuid +
                ", studentsIds=" + studentsUuids +
                '}';
    }
}
