package sopt.org.sopkathonServer.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathonServer.domain.Cry;

import java.util.List;

@Builder
@Getter
public class CryDto {
    private String userNickname;
    private String cryReason;

    public static CryDto of(Cry cry){
        return CryDto.builder()
                .userNickname(cry.getUserNickname())
                .cryReason(cry.getCryReason())
                .build();
    }
}
