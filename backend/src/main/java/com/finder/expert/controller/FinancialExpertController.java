package com.finder.expert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.finder.expert.model.FinancialExpertModel;
import com.finder.expert.service.FinancialExpertService;

import java.util.List;


@RestController
@RequestMapping("/api/experts")
@CrossOrigin(origins = "http://localhost:3000/")
public class FinancialExpertController {
    @Autowired
    private FinancialExpertService expertService;

    @PostMapping("/register")
    public ResponseEntity<FinancialExpertModel> registerExpert(@RequestBody FinancialExpertModel expert) {
        FinancialExpertModel  registeredExpert = expertService.registerExpert(expert);
        return ResponseEntity.ok(registeredExpert);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinancialExpertModel> getExpertById(@PathVariable Long id) {
        return expertService.getExpertById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping()
    public ResponseEntity<List<FinancialExpertModel>> getAllExperts() {
        List<FinancialExpertModel> experts = expertService.getAllExperts();
        return ResponseEntity.ok(experts);
    }
}