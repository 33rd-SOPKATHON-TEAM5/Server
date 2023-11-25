package sopt.org.sopkathonServer.infrastructure;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sopt.org.sopkathonServer.domain.Cry;

public interface CryRepository extends JpaRepository<Cry, Long> {

    @Query(value = "SELECT * FROM cry ORDER BY created_at DESC LIMIT 10", nativeQuery = true)
    List<Cry> findCriesRandomList();

}
