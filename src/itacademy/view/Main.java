package itacademy.view;

import java.util.*;
import itacademy.application.Video;
import itacademy.domain.Usuari;

public class Main {

    public static void main(String[] args) throws Exception {
        int action;

        Scanner actionInput = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer? \n" +
                "1. Subir video \n" +
                "2. Ver videos subidos");
        action = actionInput.nextInt();

        if (action == 1) {

            String title;
            Scanner titleInput = new Scanner(System.in);
            System.out.println("Dime el título del video:");
            title = titleInput.nextLine();
            List<String> tags;
            Scanner tagsInput = new Scanner(System.in);
            System.out.println("Dime los tags del video separados por comas:");
            tags = Arrays.asList(tagsInput.nextLine().split(","));

            Video video = new Video(title, tags);

            String url = video.createVideo(title,tags);
            System.out.println(url);
        }
        else if (action == 2) {

        }

    }

}
