package infra.repository;

import java.util.HashMap;
import java.util.Map;

import domain.contract.IUser;
import domain.entity.User;
import domain.nullobject.NullUser;

public class UserRepository {

    private Map<Long, User> db = new HashMap<>();

    public UserRepository() {
        db.put(1L, new User(1L, "Alice"));
        db.put(2L, new User(2L, "Bob"));
    }

    public IUser findById(Long id) {
        if (db.containsKey(id))
            return db.get(id);
        
        return new NullUser();
    }
}
