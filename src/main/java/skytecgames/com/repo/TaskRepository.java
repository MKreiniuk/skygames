package skytecgames.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import skytecgames.com.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
