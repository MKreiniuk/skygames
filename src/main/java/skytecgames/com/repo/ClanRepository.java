package skytecgames.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import skytecgames.com.entities.Clan;

public interface ClanRepository extends JpaRepository<Clan, Long> {
}
