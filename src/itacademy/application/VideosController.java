package itacademy.application;

import itacademy.domain.AbstractVideo;
import itacademy.domain.Video;
import itacademy.persistance.VideoRepository;

import java.util.List;

public class VideosController {

    private final VideoRepository repository = new VideoRepository();

    public VideosController(){

    }

    public void createVideo(String title, List<String> tags, int userId) throws Exception {
        Video video = new Video(title, tags, userId);
        repository.addVideo(video);
    }

    public String getAllVideos() throws Exception {
        String allVideos = new String();
        for (AbstractVideo av : repository.getAllVideos()) {
            if (av.title.equals(""))
                throw new Exception("El título está vacío");
            if (av.tags.isEmpty())
                throw new Exception("Se requiere al menos un tag por video");
            allVideos = allVideos + "id: " + av.id + " | title: " + av.title + " | tags: " + av.tags + " | userId: " + av.userId + " | idUrl: " + av.url + "\n";
        }
        return allVideos;
    }

    public String getVideosByUserId(int userId) throws Exception {
        String allVideosByUserId = new String();
        for (AbstractVideo avUserId : repository.getAllVideos()) {
            if (avUserId.title.equals(""))
                throw new Exception("El título está vacío");
            if (avUserId.tags.isEmpty())
                throw new Exception("Se requiere al menos un tag por video");
            if (avUserId.userId == userId){
                allVideosByUserId = allVideosByUserId + "id: " + avUserId.id + " | title: " + avUserId.title + " | tags: " + avUserId.tags + " | userId: " + avUserId.userId + " | idUrl: " + avUserId.url + "\n";
            }
        }
        return allVideosByUserId;
    }
}
