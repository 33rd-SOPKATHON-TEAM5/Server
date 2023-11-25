package sopt.org.sopkathonServer.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import sopt.org.sopkathonServer.domain.Cry;

public interface CryRepository extends JpaRepository<Cry, Long> {
}
