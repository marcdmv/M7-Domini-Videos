package itacademy.domain;

import java.util.*;

public class Video extends AbstractVideo {
    protected String title;
    protected List<String> tags;

    public Video(String title, List<String> tags) throws Exception{
        super(title, tags);

    }
/**
    public String VideoUrl(){
        String url;
        int n = 10;
        // Get and display the alphanumeric string
        url = RandomUrl.getAlphaNumericString(n);
        return url;
    }
 **/
}
