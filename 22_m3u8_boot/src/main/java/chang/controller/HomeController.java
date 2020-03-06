package chang.controller;

import chang.pojo.Course;
import chang.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String index(Model model){
        List<Course> all = courseService.findAll();
        model.addAttribute("c_list",all);
        return "index";
    }
}
