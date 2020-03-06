package chang.controller;

import chang.mapper.VideoMapper;
import chang.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class VlistController {

    @Autowired
    private VideoMapper videoMapper;

    @GetMapping("/vlist/{cid}")
    public String vlist(@PathVariable("cid") String cid, Model model){
        List<Video> videos = videoMapper.findByCid(cid);
        model.addAttribute("videos",videos);
        return "page/vlist";
    }
// 播放视频
    @GetMapping("/playvideo/{vid}")
    public String playvideo(@PathVariable("vid") String vid, Model model){
        Video video = videoMapper.findOneById(vid);
        model.addAttribute("video_url",video.getVurl());
        return "page/playvideo";
    }

}
