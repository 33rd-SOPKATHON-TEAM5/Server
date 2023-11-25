package sopt.org.sopkathonServer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.sopkathonServer.controller.dto.request.RegisterCryRequest;
import sopt.org.sopkathonServer.domain.Cry;
import sopt.org.sopkathonServer.infrastructure.CryRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CryService {

    private final CryRepository cryRepository;

    @Transactional
    public void registerCry(final RegisterCryRequest request) {
        Cry cry = Cry.builder()
                    .userNickname(request.userNickname())
                    .cryReason(request.cryReason())
                    .build();
        cryRepository.save(cry);
    }
}
