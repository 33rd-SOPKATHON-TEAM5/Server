package sopt.org.sopkathonServer.domain;

import jakarta.persistence.*;

@Entity
public class Cry extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private String cryReason;
}
