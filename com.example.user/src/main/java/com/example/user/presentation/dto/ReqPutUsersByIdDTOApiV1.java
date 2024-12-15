package com.example.user.presentation.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqPutUsersByIdDTOApiV1 {

    private UserDTO user;

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserDTO {

        private String name;

    }

}
