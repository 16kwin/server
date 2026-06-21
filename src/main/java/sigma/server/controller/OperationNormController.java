package sigma.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sigma.server.entity.OperationNorm;
import sigma.server.repository.OperationNormRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://192.168.88.7:8081")
@RequestMapping("/api/operationsnorm")
public class OperationNormController {

    private static final Logger log = LoggerFactory.getLogger(OperationNormController.class);

    @Autowired
    private OperationNormRepository operationNormRepository;

    @GetMapping
    public List<OperationNorm> getAllOperations() {
        log.info("=== OPERATION_NORM CONTROLLER START ===");
        
        // Диагностика репозитория
        
        List<OperationNorm> operations = operationNormRepository.findAll();
        
        // Логируем что отправляем
        log.info("=== SENDING OPERATION_NORM DATA ===");
        log.info("Operations list size: {}", operations.size());
        
        for (int i = 0; i < operations.size(); i++) {
            OperationNorm operation = operations.get(i);
            if (operation == null) {
                log.error("Operation {}: NULL", i);
            } else {
                log.info("Operation {}: entity={}, id={}, machineType={}, workPpp={}", 
                    i, 
                    operation, 
                    operation.getMachineType(),
                    operation.getWorkPpp()
                );
            }
        }
        
        log.info("=== OPERATION_NORM CONTROLLER END ===");
        return operations;
    }
}