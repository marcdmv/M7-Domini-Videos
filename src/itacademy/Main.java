package itacademy;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String title;
        List<String> tags;

        Scanner titleInput = new Scanner(System.in);
        System.out.println("Dime el título del video:");
        title = titleInput.nextLine();
        Scanner tagsInput = new Scanner(System.in);
        System.out.println("Dime los tags del video separados por comas:");
        tags = Arrays.asList(tagsInput.nextLine().split(","));


        Video video = new Video();

        String url = video.createVideo(title,tags);

        System.out.println(url);
    }

}
