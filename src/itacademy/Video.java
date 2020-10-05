package itacademy;

import java.util.*;

public class Video {

    public Video() {
    }

    public String createVideo(String title, List<String> tags) throws Exception{
        System.out.println("Título: " + title);

        if (title == null || title == "") {
            throw new Exception("El título no puede estar vacío");
        }

        return VideoUrl();
    }

    public String VideoUrl(){
        String url;
        int n = 10;
        // Get and display the alphanumeric string
        url = RandomUrl.getAlphaNumericString(n);
        return url;
    }
}
