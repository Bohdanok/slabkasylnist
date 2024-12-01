package bohdan.task1;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userCountry;
    private LocalDate userActiveTime;
    private String email;
}