package sigma.server.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sigma.server.entity.Operation;
import sigma.server.entity.OperationNorm;
import sigma.server.repository.OperationNormRepository;
import sigma.server.repository.OperationRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://194.87.56.253:8080")
@RequestMapping("/api/operationsnorm")
public class OperationNormController {

    @Autowired
    private OperationNormRepository operationNormRepository;

    @GetMapping
    public List<OperationNorm> getAllOperations() {
        return operationNormRepository.findAll();
    }
}