package br.org.nave.nave_project.utils.fakeDatabase;

import br.org.nave.nave_project.models.SchoolSubject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SchoolSubjectDb {

    private List<SchoolSubject> schoolSubjects = new ArrayList<>(List.of(
            new SchoolSubject("491970b7-f603-4dd2-b490-ead101d5a6e5", "POO",
                    "Disciplina de Programação Orientada a Objetos em Java", "9a0b345f-8a25-4d8a-bf29-1234567890ab", new ArrayList<>()),
            new SchoolSubject("e1a3faba-4eaf-4b9b-b2a0-0d1d0f7c9b21", "Matemática Básica",
                    "Disciplina de fundamentos de matemática", "7c8b99e7-fdd5-4c47-bc38-9876543210cd", new ArrayList<>()),
            new SchoolSubject("34d3bcf3-a5a1-4b8d-8a2e-daf71527a1d6", "Física",
                    "Disciplina de introdução à física clássica", "6d0e9b27-45fa-4b19-abb9-67890abcdef1", new ArrayList<>()),
            new SchoolSubject("12bcb0d7-5aaf-4c2b-a233-8496d5ad7c9f", "Química",
                    "Disciplina de química orgânica e inorgânica", "0a1b2c3d-5e6f-4a8b-9c9d-87654321abcf", new ArrayList<>()),
            new SchoolSubject("ca91b637-ec5f-4f4e-b8db-0985f68d1b8e", "História",
                    "Disciplina de história mundial e nacional", "11223344-5566-7788-99aa-bbccddeeff00", new ArrayList<>()),
            new SchoolSubject("af6c8a64-0e1b-4ad4-9f67-7809e8a7b8c1", "Geografia",
                    "Disciplina de geografia física e política", "12345678-9abc-def0-1234-56789abcdef0", new ArrayList<>()),
            new SchoolSubject("1f8b1a64-cb41-4cfa-902f-f9d1e0d6e7a1", "Biologia",
                    "Disciplina de biologia geral e humana", "a1b2c3d4-5e6f-7890-1234-56789abcdef1", new ArrayList<>()),
            new SchoolSubject("5f5c1bfa-2d45-4ec9-8bcd-7b8d4e1d6e7a", "Literatura",
                    "Disciplina de literatura brasileira e mundial", "abcdef12-3456-7890-abcd-ef1234567890", new ArrayList<>()),
            new SchoolSubject("7a8d1a64-4c21-4e9a-8b7c-8d1e7a9b0d5f", "Educação Física",
                    "Disciplina de práticas esportivas e saúde", "9a0b345f-8a25-4d8a-bf29-1234567890ab", new ArrayList<>())

    ));

    public SchoolSubjectDb(){}

    public List<SchoolSubject> getSchoolSubjects() {
        return schoolSubjects;
    }

    public Optional<SchoolSubject> findByUuid(String uuid) {
        return this.schoolSubjects.stream().filter(schoolSubject -> schoolSubject.getUuid().equals(uuid)).findFirst();
    }
}
