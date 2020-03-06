package chang.service.impl;

import chang.mapper.VideoMapper;
import chang.pojo.Video;
import chang.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findByCid(String cid) {
        return videoMapper.findByCid(cid);
    }

    @Override
    public void addVideo(Video video) {
        videoMapper.addVideo(video);
    }

    @Override
    public Video findOneById(String vid) {
        return videoMapper.findOneById(vid);
    }

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public void deleteVideoById(String vid) {
        videoMapper.deleteVideoById(vid);
    }
}
