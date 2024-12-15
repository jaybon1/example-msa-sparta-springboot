package com.example.product.presentation.controller;

import com.example.product.presentation.dto.ResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/products")
public class ProductControllerApiV1 {

    @GetMapping
    public ResponseEntity<ResDTO<Object>> getProducts() {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("상품 목록 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> getProductsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("상품 개별 조회에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> putProductsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("상품 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @PatchMapping("/{id}/amount")
    public ResponseEntity<ResDTO<Object>> patchProductsByIdForAmount(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("상품 수량 수정에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResDTO<Object>> deleteProductsById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(
                ResDTO.builder()
                        .code(0)
                        .message("상품 삭제에 성공했습니다.")
                        .data(null)
                        .build()
        );
    }

}
