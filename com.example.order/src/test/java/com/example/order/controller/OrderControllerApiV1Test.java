package com.example.order.controller;

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
public class OrderControllerApiV1Test {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetOrdersSuccess() throws Exception {

        mockMvc.perform(
                        RestDocumentationRequestBuilders.get("/v1/orders")
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "주문 목록 조회 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("ORDER-SERVICE V1")
                                                .summary("주문 목록 조회")
                                                .description(
                                                        """
                                                                ## 주문 목록 조회 엔드포인트 입니다.
                                                                
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
    public void testGetOrdersByIdSuccess() throws Exception {

        mockMvc.perform(
                        RestDocumentationRequestBuilders.get("/v1/orders/{id}", 1)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "주문 개별 조회 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("ORDER-SERVICE V1")
                                                .summary("주문 개별 조회")
                                                .description(
                                                        """
                                                                ## 주문 개별 조회 엔드포인트 입니다.
                                                                
                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
                                                .build()
                                )

                        )
                );

    }

    @Test
    public void testPutOrdersByIdSuccess() throws Exception {

//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();
//
//        String reqDtoJson = objectMapper.writeValueAsString(reqPutUsersByIdDTOApiV1);

        mockMvc.perform(
                        RestDocumentationRequestBuilders.put("/v1/orders/{id}", 1)
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "주문 수정 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("ORDER-SERVICE V1")
                                                .summary("주문 수정")
                                                .description(
                                                        """
                                                                ## 주문 수정 엔드포인트 입니다.
                                                                
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
    public void testPatchOrdersByIdForStatusSuccess() throws Exception {

//        ReqPutUsersByIdDTOApiV1 reqPutUsersByIdDTOApiV1 = ReqPutUsersByIdDTOApiV1.builder()
//                .user(
//                        ReqPutUsersByIdDTOApiV1.UserDTO.builder()
//                                .name("이름")
//                                .build()
//                )
//                .build();
//
//        String reqDtoJson = objectMapper.writeValueAsString(reqPutUsersByIdDTOApiV1);

        mockMvc.perform(
                        RestDocumentationRequestBuilders.patch("/v1/orders/{id}/status", 1)
//                                .queryParam("tempData", "어떤데이터")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(reqDtoJson)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "주문 상태 수정 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("ORDER-SERVICE V1")
                                                .summary("주문 상태 수정")
                                                .description(
                                                        """
                                                                ## 주문 상태 수정 엔드포인트 입니다.
                                                                
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
    public void testDeleteOrdersByIdSuccess() throws Exception {

        mockMvc.perform(
                        RestDocumentationRequestBuilders.delete("/v1/orders/{id}", 1)
                )
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk()
                )
                .andDo(
                        MockMvcRestDocumentationWrapper.document(
                                "주문 삭제 성공",
                                Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
                                Preprocessors.preprocessResponse(Preprocessors.prettyPrint()),
                                ResourceDocumentation.resource(
                                        ResourceSnippetParameters.builder()
                                                .tag("ORDER-SERVICE V1")
                                                .summary("주문 삭제")
                                                .description(
                                                        """
                                                                ## 주문 삭제 엔드포인트 입니다.
                                                                
                                                                """)
//                                                .pathParameters(
//                                                        ResourceDocumentation.parameterWithName("id").description("아이디")
//                                                )
                                                .build()
                                )

                        )
                );

    }

}
