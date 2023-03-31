package app.reddot.controller;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    //things we want to capture when client sends request
    private final String pseudo;
    private final String password;
    private final String email;
}
