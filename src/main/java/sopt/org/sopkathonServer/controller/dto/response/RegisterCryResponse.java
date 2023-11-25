package sopt.org.sopkathonServer.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import sopt.org.sopkathonServer.domain.Cry;

public record RegisterCryResponse(
        @JsonProperty("cry_id") Long cryId,
        @JsonProperty("user_nickname") String userNickname
) {

    public static RegisterCryResponse of(Cry cry) {
        return new RegisterCryResponse(
                cry.getId(),
                cry.getUserNickname()
        );
    }
}
