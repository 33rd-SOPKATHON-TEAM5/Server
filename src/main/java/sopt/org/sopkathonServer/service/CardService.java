package sopt.org.sopkathonServer.service;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.Message;
import org.springframework.stereotype.Service;
import sopt.org.sopkathonServer.common.exception.ErrorType;
import sopt.org.sopkathonServer.common.exception.model.CustomException;
import sopt.org.sopkathonServer.controller.dto.request.CardMessageAIRequest;
import sopt.org.sopkathonServer.controller.dto.request.GetGiftCardResponse;
import sopt.org.sopkathonServer.domain.Cry;
import sopt.org.sopkathonServer.infrastructure.CryRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardService {

    private final ChatgptService chatgptService;
    private final CryRepository cryRepository;

    public GetGiftCardResponse getGiftCard(Long cryId) {
        Cry cry = getCryById(cryId);
        String message = getChatResponse(CardMessageAIRequest.requestQuery(cry.getCryReason()));

        int lastDotIndex = message.lastIndexOf(".");
        if (lastDotIndex != -1 && lastDotIndex < message.length() - 1) {
            String substring = message.substring(0, lastDotIndex + 1);
            log.info(".을 기준으로 자름: {}", substring);
            message = substring;
        } else {
            log.info(".을 기준으로 자르지 않고 그냥 반환: {}", message);
        }
        log.info("응답 message: {}", message);
        return GetGiftCardResponse.of(cry, message);
    }

    public String getChatResponse(String prompt) {
        return chatgptService.sendMessage(prompt);
    }

    private Cry getCryById(Long cryId) {
        return cryRepository.findById(cryId).orElseThrow(
                () -> new CustomException(ErrorType.NOT_FOUND_CRY)
        );
    }
}
