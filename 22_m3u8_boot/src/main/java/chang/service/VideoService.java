package chang.service;

import chang.pojo.Video;

import java.util.List;

public interface VideoService {

    List<Video> findByCid(String cid);

    void addVideo(Video video);

    Video findOneById(String vid);

    List<Video> findAll();

    void deleteVideoById(String vid);

}
