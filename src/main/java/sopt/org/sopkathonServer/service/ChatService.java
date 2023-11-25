package sopt.org.sopkathonServer.service;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathonServer.controller.dto.request.CardMessageAIRequest;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatgptService chatgptService;

    public String getChatResponse(String prompt) {
        return chatgptService.sendMessage(prompt);
    }
}
