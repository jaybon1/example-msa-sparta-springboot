package com.example.payment.presentation.controller;

import com.example.payment.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/payments")
public class PaymentControllerApiV1 {

    @GetMapping
    public ResponseEntity<ResDTO<Object>> getPayments() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("결제 목록 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> getPaymentsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("결제 개별 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> putPaymentsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("결제 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<ResDTO<Object>> patchPaymentsByIdForStatus(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("결제 상태 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> deletePaymentsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("결제 삭제에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}

