package sigma.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sigma.server.entity.Problems; // Импортируем Problems
import sigma.server.repository.ProblemsRepository; // Импортируем ProblemsRepository

import java.util.List;

@RestController
@CrossOrigin(origins = "http://194.87.56.253:8080")
@RequestMapping("/api/problems") // Изменяем базовый путь
public class ProblemsController {

    @Autowired
    private ProblemsRepository problemsRepository; // Используем ProblemsRepository

    @GetMapping // /api/problems
    public List<Problems> getAllProblems() {
        return problemsRepository.findAll();
    }
}