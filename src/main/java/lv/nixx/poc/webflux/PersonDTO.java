package lv.nixx.poc.webflux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
@AllArgsConstructor
public class PersonDTO {

    private final long id;
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;

}