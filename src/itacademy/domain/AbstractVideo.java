package itacademy.domain;

import java.util.List;

public abstract class AbstractVideo {
    public int id;
    public String title;
    public List<String> tags;

    private static int COUNTER_VIDEOS = 1;

    public AbstractVideo(String title, List<String> tags) throws Exception {
        if (title.equals(""))
            throw new Exception("El título no puede estar vacío");
        if (tags.isEmpty())
            throw new Exception("Se requiere al menos un tag por video");
        this.title = title;
        this.tags = tags;
        id = COUNTER_VIDEOS;
        COUNTER_VIDEOS++;
    }
}


