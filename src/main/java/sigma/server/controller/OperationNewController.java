package sigma.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sigma.server.entity.OperationNew;
import sigma.server.repository.OperationNewRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://192.168.88.7:8081")
@RequestMapping("/api/operations_new")
public class OperationNewController {

    @Autowired
    private OperationNewRepository operationNewRepository;

    @GetMapping
    public List<OperationNew> getAllOperationsNew() {
        return operationNewRepository.findAll();
    }
}