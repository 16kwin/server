package sigma.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sigma.server.entity.PlanPPP;
import sigma.server.repository.PlanRepository;

@RestController
@RequestMapping("/api/plan")
public class Controller {

    @Autowired
    private PlanRepository planRepository;

    @GetMapping
    public List<PlanPPP> getAllFullPPP() { // Changed method name to reflect the functionality
        String availability = "Полное ППП";
        return planRepository.findByAvailability(availability);
    }
}