package sopt.org.sopkathonServer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathonServer.common.exception.SuccessType;
import sopt.org.sopkathonServer.common.exception.dto.ApiResponse;
import sopt.org.sopkathonServer.controller.dto.request.CardMessageAIRequest;
import sopt.org.sopkathonServer.controller.dto.response.GetGiftCardResponse;
import sopt.org.sopkathonServer.service.CardService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    @GetMapping("/{cryId}")
    public ApiResponse<GetGiftCardResponse> getGiftCard(@PathVariable Long cryId) {
        return ApiResponse.success(SuccessType.GET_GIFT_CARD_SUCCESS, cardService.getGiftCard(cryId));
    }

    // Test용
    @PostMapping
    public ApiResponse<String> sendQuestion(@RequestBody String request) {

        return ApiResponse.success(SuccessType.GPT_QUERY_SUCCESS, cardService.getChatResponse(CardMessageAIRequest.requestQuery(request)));
    }
}
