package domain.entity;

import domain.contract.IUser;

public class User implements IUser {

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Long getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Enviando mensagem para " + name + ": " + msg);
    }
}
