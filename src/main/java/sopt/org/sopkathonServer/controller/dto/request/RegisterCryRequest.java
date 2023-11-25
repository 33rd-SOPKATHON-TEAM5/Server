package sopt.org.sopkathonServer.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RegisterCryRequest(
        @JsonProperty("user_nickname") String userNickname,
        @JsonProperty("cry_reason") String cryReason
) {
}
