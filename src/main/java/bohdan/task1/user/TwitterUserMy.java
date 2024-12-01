package bohdan.task1.user;

import java.time.LocalDate;

import bohdan.task1.TwitterUser;

public class TwitterUserMy implements User {
    private final TwitterUser twitterUser;

    public TwitterUserMy(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public LocalDate getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry().toString();
    }

}
