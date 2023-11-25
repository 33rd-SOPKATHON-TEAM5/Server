package sopt.org.sopkathonServer.controller.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record RegisterCryRequest(
        String userNickname,
        String cryReason
) {
}
