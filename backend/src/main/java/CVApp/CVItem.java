package CVApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
public class CVItem {
    @Id
    private String id;
    private Date startDate;
    private Date endDate;
    private String position;
    private String company;
    private String task1;
    private String task2;
    private String task3;

}
