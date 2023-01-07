package task_2;

import java.time.LocalDate;

public class FacebookClient implements Client{
    private final FacebookUser user;

    public FacebookClient(FacebookUser user){
        this.user = user;
    }


    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getUserCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public String getLastActiveTime() {
        return user.getGetUserActiveTime().toString();
    }
}
