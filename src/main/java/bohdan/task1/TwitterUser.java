package bohdan.task1;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private TwitterCountry country;
    private LocalDate lastActiveTime;
}