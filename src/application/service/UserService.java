package application.service;

import domain.contract.IUser;
import infra.repository.UserRepository;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void notifyUser(Long id, String message) {
        IUser user = repository.findById(id);
        user.sendNotification(message);
    }
}
