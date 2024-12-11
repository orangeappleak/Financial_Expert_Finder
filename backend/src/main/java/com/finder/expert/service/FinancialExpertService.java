package com.finder.expert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.finder.expert.model.FinancialExpertModel;
import com.finder.expert.repository.FinancialExpertRepository;

@Service
public class FinancialExpertService {
    @Autowired
    private FinancialExpertRepository expertRepository;

    public FinancialExpertModel registerExpert(FinancialExpertModel expert) {
        // Add validation logic if needed
        return expertRepository.save(expert);
    }

    public Optional<FinancialExpertModel> getExpertById(Long id) {
        return expertRepository.findById(id);
    }

    public List<FinancialExpertModel> getAllExperts(){
        return expertRepository.findAll();
    }
}