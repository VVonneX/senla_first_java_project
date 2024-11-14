package ru.senla.user.results;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultsJson {
    private String gender;
    private Name name;
    private Location locations;
    private String email;
    private Login login;
    private Dob dob;
    private Register registered;
    private String phone;
    private String cell;
    private Identification id;
    private Picture picture;
    private String nat;
}
