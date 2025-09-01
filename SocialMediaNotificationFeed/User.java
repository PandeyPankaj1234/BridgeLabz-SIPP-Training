package SocialMediaNotificationFeed;

import java.util.LinkedList;
import java.time.LocalDateTime;

public class User {
    private String username;
    private LinkedList<Notification> notifications;

    public User(String username) {
        this.username = username;
        this.notifications = new LinkedList<Notification>();
    }

    public void addNotification(Notification notification) {
        notifications.addFirst(notification);
    }

    public void displayFeed(long minutes) {
        LocalDateTime now = LocalDateTime.now();
        boolean found = false;
        System.out.println("Showing notifications for " + username + " from last " + minutes + " minutes:");
        for (Notification n : notifications) {
            long diff = java.time.Duration.between(n.getTimestamp(), now).toMinutes();
            if (diff <= minutes) {
                System.out.println(n);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No notifications found in this time period.");
        }
    }
}