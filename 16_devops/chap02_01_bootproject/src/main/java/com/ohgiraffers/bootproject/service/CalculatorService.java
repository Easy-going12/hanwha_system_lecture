package com.ohgiraffers.bootproject.service;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;
import com.ohgiraffers.bootproject.entity.CalculationHistory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class CalculatorService {

    private final CalculationHistoryRepository calculationHistoryRepository;

    public CalculatorService(CalculationHistoryRepository calculationHistoryRepository) {
        this.calculationHistoryRepository = calculationHistoryRepository;
    }

    @Transactional
    public int plusTwoNumbers(CalculatorDTO calculatorDTO) {
//        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
        int result = calculatorDTO.getNum1() + calculatorDTO.getNum2();

        /* 설명. 계산 결과를 DB에 저장 */
        CalculationHistory history =
                new CalculationHistory(calculatorDTO.getNum1(), calculatorDTO.getNum2(), result);

        calculationHistoryRepository.save(history);
        log.info("계산 이력 저장 완료: {}", history);

        return result;
    }

    public List<CalculationHistory> getAllHistory() {
        return calculationHistoryRepository.findAllByOrderByCreatedAtDesc();
    }
}
