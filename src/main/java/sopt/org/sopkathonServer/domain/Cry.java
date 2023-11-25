package sopt.org.sopkathonServer.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Cry extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private String cryReason;

    @Builder
    public Cry(String userNickname, String cryReason) {
        this.userNickname = userNickname;
        this.cryReason = cryReason;
    }
}
