package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCard {
    private String firstName;
    private String lastName;
    @ToString.Exclude
    private String zipCode;

}
