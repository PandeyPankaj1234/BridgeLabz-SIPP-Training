package SocialMediaNotificationFeed;

public class LikeNotification extends Notification {

    public LikeNotification(String message) {
        super(message);
    }

    @Override
    public String getNotificationType() {
        return "Like";
    }
}