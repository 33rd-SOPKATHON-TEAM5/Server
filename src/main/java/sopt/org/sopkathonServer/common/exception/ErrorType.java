package sopt.org.sopkathonServer.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public enum ErrorType {

    /**
     * 400 BAD REQUEST
     */
    VALIDATION_WRONG_TYPE_EXCEPTION(HttpStatus.BAD_REQUEST, "잘못된 타입이 입력되었습니다."),
    HEADER_REQUEST_MISSING_EXCEPTION(HttpStatus.BAD_REQUEST, "요청에 필요한 헤더값이 존재하지 않습니다."),
    INVALID_HTTP_METHOD(HttpStatus.BAD_REQUEST, "지원되지 않는 HTTP Method 요청입니다."),


    /**
     * 404 NOT FOUND
     */
    NOT_FOUND_CRY(HttpStatus.NOT_FOUND, "존재하지 않는 눈물 기록 ID입니다."),

    /**
     * 500 INTERNAL SERVER ERROR
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 서버 에러가 발생했습니다"),
    INDEX_OUT_OF_BOUNDS(HttpStatus.INTERNAL_SERVER_ERROR, "인덱스 범위를 초과했습니다.")

    ;

    private final HttpStatus httpStatus;
    private final String message;

    public final int getHttpStatusCode() {
        return httpStatus.value();
    }

}
