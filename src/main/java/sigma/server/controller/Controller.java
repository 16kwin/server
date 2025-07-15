package sigma.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sigma.server.entity.PlanPPP;
import sigma.server.repository.PlanRepository;

@RestController
@RequestMapping("/api/plan")
@CrossOrigin(origins = "http://194.87.56.253:8080") // Разрешаем запросы со всех доменов
public class Controller {

    @Autowired
    private PlanRepository planRepository;

    @GetMapping
    public List<PlanPPP> getAllFullPPP() {
        String availability = "Полное ППП";
        return planRepository.findByAvailability(availability);
    }
}