package itacademy.application;

import itacademy.domain.AbstractVideo;
import itacademy.domain.Video;
import itacademy.persistance.VideoRepository;

import java.util.List;

public class VideosController {

    private VideoRepository repository = new VideoRepository();

    public VideosController(){

    }

    public void createVideo(String title, List<String> tags) throws Exception {
        Video video = new Video(title, tags);
        repository.addVideo(video);
    }
}
