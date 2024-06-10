package br.org.nave.nave_project.controller;

import br.org.nave.nave_project.models.SchoolSubject;
import br.org.nave.nave_project.models.dto.SchoolSubjectDTO;
import br.org.nave.nave_project.service.SchoolSubjectService;
import jakarta.validation.constraints.NotNull;
import org.atmosphere.config.service.Get;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SchoolSubjectController {

    private final SchoolSubjectService schoolSubjectService;

    public SchoolSubjectController(SchoolSubjectService schoolSubjectService) {
        this.schoolSubjectService = schoolSubjectService;
    }

    @GetMapping
    public ResponseEntity<List<SchoolSubject>> findAll() {
        List<SchoolSubject> schoolSubjects = this.schoolSubjectService.getAllSchoolSubjects();

        if (schoolSubjects.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(schoolSubjects);
    }

    @PutMapping("add-student")
    public ResponseEntity<?> addStudentInSubject(@NotNull @RequestBody SchoolSubjectDTO schoolSubject) {
        try {
            this.schoolSubjectService.addStudentInSchoolSubject(schoolSubject);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("School subject added successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error on add student in school subject");
        }
    }
}
