package bohdan.task1.user;

import java.time.LocalDate;

import bohdan.task1.FacebookUser;

public class FacebookUserMy implements User {
    private final FacebookUser facebookUser;

    public FacebookUserMy(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry().toString();
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }


    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
