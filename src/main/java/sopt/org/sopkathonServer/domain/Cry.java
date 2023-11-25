package sopt.org.sopkathonServer.domain;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
>>>>>>> 4a5e59c4ca25752d855918b698827689d74bbca0

@Getter
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
