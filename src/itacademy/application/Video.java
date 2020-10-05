package itacademy.application;

import java.util.*;

public class Video {
    protected String title;
    protected List<String> tags;

    public Video(String title, List<String> tags) {
        this.title = title;
        this.tags = tags;
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
