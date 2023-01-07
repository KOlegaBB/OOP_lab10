package task_2;

import java.time.LocalDate;

public class TwitterClient implements Client{
    private final TwitterUser user;

    public TwitterClient(TwitterUser user){
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getUserCountry() {
        return user.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return user.getLastActiveTime();
    }
}
