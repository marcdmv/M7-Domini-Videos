package itacademy.persistance;

import itacademy.domain.AbstractVideo;

import java.util.ArrayList;
import java.util.List;

public class VideoRepository {
    private static List<AbstractVideo> videos = new ArrayList<>();

    public VideoRepository(){

    }

    public void addVideo(AbstractVideo video) throws Exception {
        if (video==null) throw new Exception();
        videos.add(video);
    }
}
