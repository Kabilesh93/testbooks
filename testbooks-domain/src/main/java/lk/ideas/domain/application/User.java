package lk.ideas.domain.application;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private int id;
    private String userName;
    private Date createdTime;
}
