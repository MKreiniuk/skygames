package skytecgames.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskComplitedDTO {
    Long taskId;
    Long clanId;
    boolean isCompleted;
}
