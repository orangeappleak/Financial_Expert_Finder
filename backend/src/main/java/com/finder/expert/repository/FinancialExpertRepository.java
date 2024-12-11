package com.finder.expert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finder.expert.model.FinancialExpertModel;

public interface FinancialExpertRepository extends JpaRepository<FinancialExpertModel, Long> {

}