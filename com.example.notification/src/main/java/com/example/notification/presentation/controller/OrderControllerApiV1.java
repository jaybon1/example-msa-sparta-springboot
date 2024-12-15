package com.example.notification.presentation.controller;

import com.example.notification.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/notifications")
public class OrderControllerApiV1 {

    @GetMapping
    public ResponseEntity<ResDTO<Object>> getNotifications() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("알림 목록 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> getNotificationsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("알림 개별 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> deleteNotificationsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("알림 삭제에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}

