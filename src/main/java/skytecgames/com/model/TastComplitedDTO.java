package skytecgames.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TastComplitedDTO {
    TaskDTO task;
    ClanDTO clan;
    boolean isCompleted;
}
