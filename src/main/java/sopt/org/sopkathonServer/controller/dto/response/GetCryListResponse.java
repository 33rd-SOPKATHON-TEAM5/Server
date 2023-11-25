package sopt.org.sopkathonServer.controller.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathonServer.domain.Cry;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class GetCryListResponse {

    @JsonProperty("cry_list")
    private List<CryDto> cryList;

    public static GetCryListResponse of(List<Cry> cryDtoList){
        return GetCryListResponse.builder()
                .cryList(cryDtoList.stream().map(b->CryDto.of(b))
                        .collect(Collectors.toList()))
                .build();
    }

}
