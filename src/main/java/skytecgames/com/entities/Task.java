package skytecgames.com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Task {
    @GeneratedValue
    @Id
    @Column(name = "task_id", length = 10, unique = true, nullable = false)
    long taskId;
    int reward;
}
