package itacademy.persistance;

import itacademy.domain.AbstractUser;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final List<AbstractUser> users = new ArrayList<>();

    public UserRepository(){

    }

    public List<AbstractUser> getUsers(){
        return new ArrayList<>(users);
    }

    public void addUser(AbstractUser user) throws Exception {
        if (user==null) throw new Exception();
        users.add(user);
    }
}
