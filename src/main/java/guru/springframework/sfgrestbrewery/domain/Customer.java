package guru.springframework.sfgrestbrewery.domain;

import lombok.*;

import java.util.UUID;

/**
 * Created by jt on 2019-05-25.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
