package task_2;


public class MessageSender {
    public static void send(String text, Client user, String country) {
        if (user.getUserCountry().equals("Ukraine")) {
            System.out.println("Sending to " + user.getEmail() + ": " + text);
        }
    }

}
