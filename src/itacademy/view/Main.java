package itacademy.view;

import java.util.*;

import itacademy.application.UsersController;
import itacademy.application.VideosController;

public class Main {

    private static final VideosController videosController = new VideosController();
    private static final UsersController usersController = new UsersController();

    public static void main(String[] args) throws Exception {
        int action;

        Scanner actionInput = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer? \n" +
                "1. Subir video \n" +
                "2. Ver todos los vídeos subidos \n" +
                "3. Ver los videos del usuario con un id específico \n" +
                "4. Crear nuevo usuario");
        action = actionInput.nextInt(); //Elegimos la acción que queremos ejecutar.
        usersController.createUser("Carlos", "García", "1234abcd"); // Rellenamos con algunos usuarios el repositorio de usuarios
        usersController.createUser("Juan", "Pérez", "jp1977");
        usersController.createUser("Jonatan", "Carreño", "contraseñainsegura");

        videosController.createVideo("vacaciones verano", Arrays.asList("verano", "personal", "2018"), 2); // Rellenamos con algunos vídeos el repositorio de vídeos
        videosController.createVideo("fortnite OMG", Arrays.asList("gaming", "trending", "2019"), 3);
        videosController.createVideo("tutorial tortilla", Arrays.asList("cocina", "principiante", "barcelona"), 1);

        if (action == 1) { // Subir vídeo: Pedimos los datos del vídeo y luego lo añadimos al repositorio.
            String title;
            Scanner titleInput = new Scanner(System.in);
            System.out.println("Título del vídeo:");
            title = titleInput.nextLine();
            List<String> tags;
            Scanner tagsInput = new Scanner(System.in);
            System.out.println("Tags del video (separados por comas):");
            tags = Arrays.asList(tagsInput.nextLine().split(","));
            int userId = 4; // Para este ejercicio definimos manualmente el id de usuario en 4 ya que es nuestro usuario, pero en
            // la vida real sería el id del usuario que está logueado.
            videosController.createVideo(title, tags, userId); //Creamos el vídeo en el repositorio.
            System.out.println("Vídeo subido correctamente.");

        } else if (action == 2) { // Ver todos los vídeos del repositorio.
            String allVideos = videosController.getAllVideos();
            System.out.println(allVideos + "\n");

        } else if (action == 3) { // Ver todos los vídeos del repositorio filtrados por id de usuario.
            int userId;
            Scanner userIdInput = new Scanner(System.in);
            System.out.println("¿De qué id quieres ver la lista de vídeos?");
            try {
                userId = userIdInput.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                throw new Exception("Error de formato de id: " + e);
            }

            String allVideosByUserId = videosController.getVideosByUserId(userId);
            System.out.println(allVideosByUserId + "\n");

        } else if (action == 4) { // Crear un nuevo usuario. Pedimos datos, contraseña y lo añadimos al repositorio de usuarios.
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
            System.out.println("Nuevo usuario creado correctamente.");
        } else {
            System.out.println("No has elegido una opción válida");
        }
    }
}
