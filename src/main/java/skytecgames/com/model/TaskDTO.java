package skytecgames.com.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "taskId")
@ToString
public class TaskDTO {
    long taskId;
    int reward;

}
