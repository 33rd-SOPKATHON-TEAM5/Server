package sopt.org.sopkathonServer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathonServer.common.exception.SuccessType;
import sopt.org.sopkathonServer.common.exception.dto.ApiResponse;
import sopt.org.sopkathonServer.controller.dto.request.CardMessageAIRequest;
import sopt.org.sopkathonServer.service.ChatService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ApiResponse<String> sendQuestion(@RequestBody String request) {
        return ApiResponse.success(SuccessType.GPT_QUERY_SUCCESS, chatService.getChatResponse(CardMessageAIRequest.requestQuery(request)));
    }
}
