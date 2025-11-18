package domain.contract;

public interface IUser {
    Long getId();
    String getName();
    void sendNotification(String msg);
}
