package chang.mapper;

import chang.pojo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VideoMapper {

    List<Video> findByCid(String cid);

    void addVideo(Video video);

    Video findOneById(String vid);

    List<Video> findAll();

    void deleteVideoById(String vid);

}
