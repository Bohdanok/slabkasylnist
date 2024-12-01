package bohdan.task1;


import java.time.LocalDate;

import bohdan.task1.user.User;
import bohdan.task1.user.TwitterUserMy;
import bohdan.task1.TwitterCountry;
import bohdan.task1.TwitterUser;

import bohdan.task1.FacebookUser;
import bohdan.task1.user.FacebookUserMy;

public class Main {
    public static void main(String[] args) {
        User twitterUser = new TwitterUserMy(
            new TwitterUser(
                "ivam.dot.com", TwitterCountry.UKRAINE, LocalDate.now()
            )
        );
        User facebookUser = new FacebookUserMy(
            new FacebookUser(
                "345t6yuiopds.gmad.cdm", LocalDate.now(), "Zhovrna"
            )
        );
    }

}