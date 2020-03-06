package chang.service;

import chang.pojo.Video;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoServiceImplTest {

    @Autowired
    private VideoService videoService;

    @Test
    public void findAllTest(){
        List<Video> all = videoService.findByCid("1");
        all.forEach(System.out::println);

        System.out.println( all.get(0).getUpdate().toString());

    }


    @Test
    public void addVideoTest(){
        Video v = new Video();
        v.setCid(1);
        v.setUpdate(new Date());
        v.setVname("ff");
        v.setVurl("fdf");
        videoService.addVideo(v);
    }



    @Test
    public void findOneById(){
        Video oneById = videoService.findOneById("1");
        System.out.println(oneById);
    }

    @Test
    public void findAll(){
        List<Video> list = videoService.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void deleteVideoById(){
        videoService.deleteVideoById("1");
    }
}
