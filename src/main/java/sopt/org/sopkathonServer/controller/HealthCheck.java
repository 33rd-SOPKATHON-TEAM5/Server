package sopt.org.sopkathonServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathonServer.common.exception.SuccessType;
import sopt.org.sopkathonServer.common.exception.dto.ApiResponse;

@RestController
@RequestMapping("/health")
public class HealthCheck {

    @GetMapping
    public ApiResponse<String> healthCheck() {
        return ApiResponse.success(SuccessType.HEALTH_CHECK_SUCCESS, "test success!");
    }
}
