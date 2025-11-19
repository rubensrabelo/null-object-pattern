package domain.nullobject;

import domain.contract.IUser;

public class NullUser implements IUser {

    @Override
    public Long getId() { return -1L; }

    @Override
    public String getName() { return "Usuário Desconhecido"; }

    @Override
    public void sendNotification(String msg) {
    }
}
