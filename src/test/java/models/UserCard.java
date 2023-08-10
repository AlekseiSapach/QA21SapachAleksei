package models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCard {
    private String firstName;
    private String lastName;
    private String zipCode;
}
