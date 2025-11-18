package infra.repository;

import java.util.HashMap;
import java.util.Map;

import domain.contract.IUser;
import domain.entity.User;
import domain.nullobject.NullUser;
public class UserRepository {

    private Map<Long, User> database = new HashMap<>();

    public UserRepository() {
        database.put(1L, new User(1L, "Alice"));
        database.put(2L, new User(2L, "Bob"));
    }

    public IUser findById(Long id) {
        if (database.containsKey(id)) {
            return database.get(id);
        }
        return new NullUser();
    }
}
