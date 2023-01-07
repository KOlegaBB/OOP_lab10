package task_2;

import java.time.LocalDate;

public class Login {
    public static Client login(String email, Country country, LocalDate last_activity_time, String login_method){
        if (login_method.equals("facebook")){
            return new FacebookClient(new FacebookUser(email, country, last_activity_time));
        } else if (login_method.equals("twitter")){
            return new TwitterClient(new TwitterUser(email, country.toString(), last_activity_time.toString()));
        }else{
            return null;
        }
    }
}
