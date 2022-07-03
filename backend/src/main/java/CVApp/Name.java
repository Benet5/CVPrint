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
public class Name {
    @Id
    private int id;
    private String firstName;
    private String lastName;
}
