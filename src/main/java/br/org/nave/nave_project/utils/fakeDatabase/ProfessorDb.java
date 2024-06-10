package br.org.nave.nave_project.utils.fakeDatabase;

import br.org.nave.nave_project.models.Professor;
import br.org.nave.nave_project.models.Student;
import br.org.nave.nave_project.utils.DomainUtils;
import br.org.nave.nave_project.utils.enums.GradeEnum;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDb {

    private List<Professor> professors = new ArrayList<>(List.of(
            new Professor("Maria Silva", "222.222.222-22", "maria.silva", "456", "9a0b345f-8a25-4d8a-bf29-1234567890ab"),
            new Professor("Carlos Souza", "333.333.333-33", "carlos.souza", "789", "7c8b99e7-fdd5-4c47-bc38-9876543210cd"),
            new Professor("Ana Costa", "444.444.444-44", "ana.costa", "321", "6d0e9b27-45fa-4b19-abb9-67890abcdef1"),
            new Professor("Rafael Lima", "555.555.555-55", "rafael.lima", "654", "0a1b2c3d-5e6f-4a8b-9c9d-87654321abcf"),
            new Professor("Fernanda Rocha", "666.666.666-66", "fernanda.rocha", "987", "11223344-5566-7788-99aa-bbccddeeff00"),
            new Professor("Roberto Nunes", "777.777.777-77", "roberto.nunes", "159", "12345678-9abc-def0-1234-56789abcdef0"),
            new Professor("Beatriz Oliveira", "888.888.888-88", "beatriz.oliveira", "753", "a1b2c3d4-5e6f-7890-1234-56789abcdef1"),
            new Professor("Lucas Martins", "999.999.999-99", "lucas.martins", "951", "abcdef12-3456-7890-abcd-ef1234567890")
    ));

    public List<Professor> getProfessors() {
        return professors;
    }
}
