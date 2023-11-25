package sopt.org.sopkathonServer.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import sopt.org.sopkathonServer.domain.GiftCard;

public interface GiftCardRepository extends JpaRepository<GiftCard, Long> {
}
