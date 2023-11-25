package sopt.org.sopkathonServer.controller.dto.response;


import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathonServer.domain.Cry;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class GetCryListResponse {

    private List<CryDto> cryDtoList;

    public static GetCryListResponse of(List<Cry> cryDtoList){
        return GetCryListResponse.builder()
                .cryDtoList(cryDtoList.stream().map(b->CryDto.of(b))
                        .collect(Collectors.toList()))
                .build();
    }

}
