package sopt.org.sopkathonServer.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "`user`")
public class User extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String cryReason;

}
