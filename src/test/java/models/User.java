package models;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private boolean isActive;


}
