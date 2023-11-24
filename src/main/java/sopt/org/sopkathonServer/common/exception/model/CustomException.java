package sopt.org.sopkathonServer.common.exception.model;

import lombok.Getter;
import sopt.org.sopkathonServer.common.exception.ErrorType;

@Getter
public class CustomException extends RuntimeException {

    private final ErrorType errorType;

    public CustomException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public int getHttpStatus() {
        return errorType.getHttpStatusCode();
    }
}
