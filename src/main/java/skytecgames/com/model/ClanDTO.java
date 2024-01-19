package skytecgames.com.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class ClanDTO {
    private long id;
    private String name;
    private int gold;
}
