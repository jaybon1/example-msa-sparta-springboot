package com.example.order.presentation.controller;

import com.example.order.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/orders")
public class OrderControllerApiV1 {

    @GetMapping
    public ResponseEntity<ResDTO<Object>> getOrders() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("주문 목록 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> getOrdersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("주문 개별 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> putOrdersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("주문 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<ResDTO<Object>> patchOrdersByIdForStatus(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("주문 상태 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> deleteOrdersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("주문 삭제에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}

