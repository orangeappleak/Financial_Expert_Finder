package com.finder.expert.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Fin Experts")
public class FinancialExpertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String expertise;
    private String location;
    private Double rating;
    private Integer reviews;
    private String hourlyRate;
    private String description;
    private String availability;
    private String password;
}