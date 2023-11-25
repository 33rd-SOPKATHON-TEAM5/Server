package sopt.org.sopkathonServer.controller.dto.request;

import sopt.org.sopkathonServer.domain.Cry;

public record GetGiftCardResponse(
        int index,
        String userNickname,
        String message

) {
    public static GetGiftCardResponse of(Cry cry, String message) {
        return new GetGiftCardResponse(
                Math.toIntExact(cry.getId()),
                cry.getUserNickname(),
                message
        );
    }
}
