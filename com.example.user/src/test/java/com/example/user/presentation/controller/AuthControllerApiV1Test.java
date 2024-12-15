package com.example.user.presentation.controller;

import com.epages.restdocs.apispec.MockMvcRestDocumentationWrapper;
import com.epages.restdocs.apispec.ResourceDocumentation;
import com.epages.restdocs.apispec.ResourceSnippetParameters;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureRestDocs
@AutoConfigureMockMvc
@ActiveProfiles("dev")
public class AuthControllerApiV1Test {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testPostAuthRegisterSuccess() throws Exception {

//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();

        mockMvc.perform(
                        RestDocumentationRequestBuilders.post("/v1/auth/register")
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "회원가입 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("AUTH-SERVICE V1")
                                                .summary("회원가입")
                                                .description(
                                                        """
                                                                ## 회원가입 엔드포인트 입니다.
                                                                
                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
//                                                .queryParameters(
//                                                        ResourceDocumentation.parameterWithName("tempData").optional().description("이름")
//                                                )
//                                                .requestFields(
//                                                        fieldWithPath("user.name").type(JsonFieldType.STRING).description("유저명")
//                                                )
                                                .build()
                                )

                        )
                );

    }

    @Test
    public void testPostAuthLoginSuccess() throws Exception {

//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();

        mockMvc.perform(
                        RestDocumentationRequestBuilders.post("/v1/auth/login")
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "로그인 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("AUTH-SERVICE V1")
                                                .summary("로그인")
                                                .description(
                                                        """
                                                                ## 로그인 엔드포인트 입니다.
                                                                
                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
//                                                .queryParameters(
//                                                        ResourceDocumentation.parameterWithName("tempData").optional().description("이름")
//                                                )
//                                                .requestFields(
//                                                        fieldWithPath("user.name").type(JsonFieldType.STRING).description("유저명")
//                                                )
                                                .build()
                                )

                        )
                );

    }

    @Test
    public void testPostAuthRefreshSuccess() throws Exception {

//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();

        mockMvc.perform(
                        RestDocumentationRequestBuilders.post("/v1/auth/refresh")
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "토큰 재발급 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("AUTH-SERVICE V1")
                                                .summary("토큰 재발급")
                                                .description(
                                                        """
                                                                ## 토큰 재발급 엔드포인트 입니다.
                                                                
                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
//                                                .queryParameters(
//                                                        ResourceDocumentation.parameterWithName("tempData").optional().description("이름")
//                                                )
//                                                .requestFields(
//                                                        fieldWithPath("user.name").type(JsonFieldType.STRING).description("유저명")
//                                                )
                                                .build()
                                )

                        )
                );

    }



//    @Test
//    public void testTempSuccess() throws Exception {
//
//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();
//
//        String reqDtoJson = objectMapper.writeValueAsString(reqPutUsersByIdDTOApiV1);
//
//        mockMvc.perform(
//                        RestDocumentationRequestBuilders.put("/v1/users/{id}", 1)
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
//                )
//                .andExpectAll(
//                        MockMvcResultMatchers.status().isOk()
//                )
//                .andDo(
//                        MockMvcRestDocumentationWrapper.document(
//                                "USER 수정 성공",
//                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
//                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
//                                ResourceDocumentation.resource(
//                                        ResourceSnippetParameters.builder()
//                                                .tag("USER-SERVICE V1")
//                                                .summary("USER 수정")
//                                                .description(
//                                                        """
//                                                                ## USER 수정 엔드포인트 입니다.
//                                                                
//                                                                ---
//                                                                
//                                                                - 경로에는 유저 ID 값을 입력해주세요.
//                                                                - 쿼리에는 임시 데이터를 입력해주세요.
//                                                                - Body에는 유저 정보를 입력해주세요.
//                                                                
//                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
//                                                .queryParameters(
//                                                        ResourceDocumentation.parameterWithName("tempData").optional().description("이름")
//                                                )
//                                                .requestFields(
//                                                        fieldWithPath("user.name").type(JsonFieldType.STRING).description("유저명")
//                                                )
//                                                .build()
//                                )
//
//                        )
//                );
//
//    }

}
