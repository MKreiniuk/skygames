package skytecgames.com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
public class Clan {
    @GeneratedValue
    @Id
    @Column(name = "clan_id", length = 10, unique = true, nullable = false)
    private long id;
    private String name;
    @Setter
    private int gold;

}
