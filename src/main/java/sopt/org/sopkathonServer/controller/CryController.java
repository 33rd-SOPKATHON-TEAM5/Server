package sopt.org.sopkathonServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathonServer.common.exception.SuccessType;
import sopt.org.sopkathonServer.common.exception.dto.ApiResponse;
import sopt.org.sopkathonServer.controller.dto.request.RegisterCryRequest;
import sopt.org.sopkathonServer.service.CryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cry")
public class CryController {

    private final CryService cryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse registerCry(@RequestBody RegisterCryRequest request) {
        cryService.registerCry(request);
        return ApiResponse.success(SuccessType.CRY_REGISTER_SUCCESS);
    }


}
