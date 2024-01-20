package skytecgames.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClanAddGoldDTO {
    Long clanId;
    @Getter
    boolean isAdded;
}
