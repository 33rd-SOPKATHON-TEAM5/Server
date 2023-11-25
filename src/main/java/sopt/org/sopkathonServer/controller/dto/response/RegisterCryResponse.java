package sopt.org.sopkathonServer.controller.dto.response;

import sopt.org.sopkathonServer.domain.Cry;

public record RegisterCryResponse(
        Long userId,
        String userNickname
) {

    public static RegisterCryResponse of(Cry cry) {
        return new RegisterCryResponse(
                cry.getId(),
                cry.getUserNickname()
        );
    }
}
