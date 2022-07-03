package CVApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
@NoArgsConstructor
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private String birthday;
    private String email;
    private int mobile;

}
