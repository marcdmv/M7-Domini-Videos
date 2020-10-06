package itacademy.view;

import java.util.*;

import itacademy.application.UsersController;
import itacademy.application.VideosController;

public class Main {

    private static final VideosController videosController = new VideosController();
    private static final UsersController usersController = new UsersController();

    public static void main(String[] args) throws Exception {
        int action;
        //int userId = 4;

        Scanner actionInput = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer? \n" +
                "1. Subir video \n" +
                "2. Ver todos los vídeos subidos \n" +
                "3. Ver los videos del usuario con un id específico \n" +
                "4. Crear nuevo usuario");
        action = actionInput.nextInt();
        usersController.createUser("Carlos", "García", "1234abcd");
        usersController.createUser("Juan", "Pérez", "jp1977");
        usersController.createUser("Jonatan", "Carreño", "contraseñainsegura");

        videosController.createVideo("vacaciones verano", Arrays.asList("verano", "personal", "2018"), 2);
        videosController.createVideo("fortnite OMG", Arrays.asList("gaming", "trending", "2019"), 3);
        videosController.createVideo("tutorial tortilla", Arrays.asList("cocina", "principiante", "barcelona"), 1);

        if (action == 1) {

            String title;
            Scanner titleInput = new Scanner(System.in);
            System.out.println("Dime el título del video:");
            title = titleInput.nextLine();
            List<String> tags;
            Scanner tagsInput = new Scanner(System.in);
            System.out.println("Dime los tags del video separados por comas:");
            tags = Arrays.asList(tagsInput.nextLine().split(","));
            int userId = 4; // Para este ejercicio definimos manualmente el id de usuario del video, pero en
            // la vida real sería el id del usuario que sube el video.
            videosController.createVideo(title, tags, userId);

        } else if (action == 2) {
            String allVideos = videosController.getAllVideos();
            System.out.println(allVideos + "\n");

        } else if (action == 3) {
            int userId;
            Scanner userIdInput = new Scanner(System.in);
            System.out.println("¿De qué id quieres ver la lista de vídeos?");
            userId = userIdInput.nextInt();

            String allVideosByUserId = videosController.getVideosByUserId(userId);
            System.out.println(allVideosByUserId + "\n");

        } else if (action == 4) {
            String name;
            Scanner nameInput = new Scanner(System.in);
            System.out.println("Introduce el nombre:");
            name = nameInput.nextLine();
            String surname;
            Scanner surnameInput = new Scanner(System.in);
            System.out.println("Introduce el apellido:");
            surname = surnameInput.nextLine();
            String password;
            Scanner passwordInput = new Scanner(System.in);
            System.out.println("Introduce la contraseña:");
            password = passwordInput.nextLine();
            usersController.createUser(name, surname, password);

            String allUsers = usersController.getUsers();
            System.out.println(allUsers + "\n");
        }
    }
}
