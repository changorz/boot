package chang.service;

import chang.pojo.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void findAllTest(){
        List<Course> all = courseService.findAll();
        all.forEach(System.out::println);

    }
}
