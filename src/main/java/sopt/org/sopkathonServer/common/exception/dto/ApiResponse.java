package sopt.org.sopkathonServer.common.exception.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sopt.org.sopkathonServer.common.exception.ErrorType;
import sopt.org.sopkathonServer.common.exception.SuccessType;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiResponse<T> {

    private final int status;
    private final String message;

    @JsonInclude(Include.NON_NULL)
    private T data;

    public static <T> ApiResponse<T> success(SuccessType successType, T data) {
        return new ApiResponse<>(successType.getHttpStatusCode(), successType.getMessage(), data);
    }

    public static ApiResponse error(ErrorType errorType, String message) {
        return new ApiResponse<>(errorType.getHttpStatusCode(), message);
    }

    public static ApiResponse error(ErrorType errorType) {
        return new ApiResponse<>(errorType.getHttpStatusCode(), errorType.getMessage());
    }

    public static ApiResponse error(ErrorType errorType, Exception e) {
        return new ApiResponse<>(errorType.getHttpStatusCode(), errorType.getMessage(), e);
    }


}
