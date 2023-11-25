package sopt.org.sopkathonServer.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public record RegisterCryRequest(
        @JsonProperty("user_nickname") @NotBlank(message = "닉네임은 필수 입력 값입니다.") String userNickname,
        @JsonProperty("cry_reason") @NotBlank(message = "울음 사유는 필수 입력 값입니다.") String cryReason
) {

}
