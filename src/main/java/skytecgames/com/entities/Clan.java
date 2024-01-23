package skytecgames.com.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.concurrent.atomic.AtomicInteger;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
public class Clan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "clan_id", length = 10, unique = true, nullable = false)
    private long id;
    private String name;
    @Setter
    private AtomicInteger gold;

}
