package chang.controller;

import chang.pojo.Video;
import chang.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private VideoService videoService;

    @PostMapping("/addv")
    public String addv( Video video){
        videoService.addVideo(video);
        return "page/vinput";
    }

    @GetMapping("/videoAdmin")
    public String videoAdmin(Model model){
        List<Video> videoList = videoService.findAll();
        model.addAttribute("videoList",videoList);
        return "page/videoList";
    }

    @GetMapping("/deletev/{vid}")
    public String deletev(@PathVariable("vid") String vid, Model model){
        videoService.deleteVideoById(vid);
        return "redirect:/admin/videoAdmin";
    }


}
