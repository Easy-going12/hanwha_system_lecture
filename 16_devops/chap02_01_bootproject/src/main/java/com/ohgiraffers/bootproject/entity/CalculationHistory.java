package com.ohgiraffers.bootproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="calculation_history")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CalculationHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private Integer num1;

    @Column(nullable=false)
    private Integer num2;

    @Column(nullable=false)
    private Integer result;

    @Column(name ="created_at", nullable=false, updatable=false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now().plusHours(9);
    }

    public CalculationHistory(Integer num1, Integer num2, Integer result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
}
