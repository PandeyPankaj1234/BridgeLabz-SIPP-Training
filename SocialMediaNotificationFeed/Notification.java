package SocialMediaNotificationFeed;

import java.time.LocalDateTime;

public abstract class Notification {
    private String message;
    private LocalDateTime timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public abstract String getNotificationType();

    @Override
    public String toString() {
        return "[" + getNotificationType() + "] " + message + " at " + timestamp;
    }
}
