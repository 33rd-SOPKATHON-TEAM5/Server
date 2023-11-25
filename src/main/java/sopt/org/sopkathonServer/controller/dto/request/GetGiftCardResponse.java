package sopt.org.sopkathonServer.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import sopt.org.sopkathonServer.domain.Cry;

public record GetGiftCardResponse(
        int index,
        @JsonProperty("user_nickname") String userNickname,
        @JsonProperty("message") String message

) {
    public static GetGiftCardResponse of(Cry cry, String message) {
        return new GetGiftCardResponse(
                Math.toIntExact(cry.getId()),
                cry.getUserNickname(),
                message
        );
    }
}
