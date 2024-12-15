package com.example.user.presentation.controller;

import com.example.user.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/auth")
public class AuthControllerApiV1 {

    @PostMapping("/register")
    public ResponseEntity<ResDTO<Object>> postAuthRegister() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("회원가입에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PostMapping("/login")
    public ResponseEntity<ResDTO<Object>> postAuthLogin() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("로그인에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PostMapping("/refresh")
    public ResponseEntity<ResDTO<Object>> postAuthRefresh() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("토큰 재발급에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}
