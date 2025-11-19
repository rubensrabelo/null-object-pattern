package domain.nullobject;

import domain.contract.IUser;

public class NullUser implements IUser {

    @Override
    public Long getId() { return null; }

    @Override
    public String getName() { return null; }

    @Override
    public void sendNotification(String msg) {
    }
}
