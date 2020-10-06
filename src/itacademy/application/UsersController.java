package itacademy.application;

import itacademy.domain.AbstractUser;
import itacademy.domain.User;
import itacademy.persistance.UserRepository;

public class UsersController {

    private final UserRepository repository = new UserRepository();

    public UsersController() {

    }

    public void createUser(String name, String surname, String password) throws Exception {
        User user = new User(name, surname, password);
        repository.addUser(user);
    }

    public String getUsers() throws Exception {
        String allUsers = new String();
        for (AbstractUser au : repository.getUsers()) {
            if (au.name.equals(""))
                throw new Exception("El nombre está vacío");
            if (au.surname.equals(""))
                throw new Exception("El apellido está vacío");
            if (au.password.equals(""))
                throw new Exception("La contraseña está vacía");
            allUsers = allUsers + "id: " + au.id + " | nombre: " + au.name + " | apellido: " + au.surname + " | contraseña: " + au.password + " | creado: " + au.joined + "\n";
        }
        return allUsers;
    }


}
