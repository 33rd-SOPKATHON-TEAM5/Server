package sopt.org.sopkathonServer.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public enum SuccessType {

    HEALTH_CHECK_SUCCESS(HttpStatus.OK, "헬스 체크에 성공했습니다."),
    GPT_QUERY_SUCCESS(HttpStatus.OK, "ChatGPT 요청에 성공했습니다."),
    GET_GIFT_CARD_SUCCESS(HttpStatus.OK, "선물 카드 조회에 성공했습니다."),

    CRY_REGISTER_SUCCESS(HttpStatus.CREATED, "나의 눈물 기록 등록에 성공했습니다."),

    CRY_FIND_SUCCESS(HttpStatus.OK, "전체 눈물 기록 조회에 성공했습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public final int getHttpStatusCode() {
        return httpStatus.value();
    }

}
