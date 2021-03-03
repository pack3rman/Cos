package pl.kurs.java.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPeerson {

    private String name;
    private String lastName;
    private String pesel;
}
