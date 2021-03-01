package pl.kurs.java.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestPeerson {

    private String name;
    private String lastName;
    private String pesel;
}
