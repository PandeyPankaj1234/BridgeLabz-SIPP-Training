package SocialMediaNotificationFeed;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("abc");
        user.addNotification(new LikeNotification("SomeOne Liked Your Photo"));
        user.addNotification(new CommentNotification("Someone commented on your post"));
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        user.displayFeed(min);
    }
}