package com.example.user.presentation.controller;

import com.example.user.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserControllerApiV1 {

    @GetMapping
    public ResponseEntity<ResDTO<Object>> getUsers() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("유저 목록 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> getUsersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("유저 개별 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> putUsersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("유저 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PatchMapping("/{id}/address")
    public ResponseEntity<ResDTO<Object>> patchUsersByIdForAddress(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("유저 주소 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> deleteUsersById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("유저 삭제에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}
