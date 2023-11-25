package sopt.org.sopkathonServer.controller.dto.request;

import lombok.Getter;

@Getter
public class CardMessageAIRequest {

    public static String requestQuery(String cryReason) {
        return String.format(QueryTemplate.CRY_SANTA.value, cryReason);
    }

    enum QueryTemplate {
        CRY_SANTA("너는 공감을 잘 해주는 사람이고, 울었던 경험에 대한 메세지를 읽고, 따뜻한 위로를 담은 메세지를 한글로 150자 이내로 작성해줘. 그리고 마지막은 크리스마스 멘트로 써줘\n"
                + "\n\"%s\"");

        private final String value;

        QueryTemplate(String value) {
            this.value = value;
        }
    }
}
