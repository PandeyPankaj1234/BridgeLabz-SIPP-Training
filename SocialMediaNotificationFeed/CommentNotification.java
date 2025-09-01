package SocialMediaNotificationFeed;

public class CommentNotification extends Notification {

    public CommentNotification(String message) {
        super(message);
    }

    @Override
    public String getNotificationType() {
        return "Comment";
    }
}