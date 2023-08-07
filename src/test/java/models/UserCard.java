package models;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCard {
    private String firstName;
    private String lastName;
    @ToString.Exclude
    private String zipCode;

}
