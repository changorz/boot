package chang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Video {

    private Integer id;
    // 课程id
    private Integer cid;
    // 视频的更新时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date update;
    // 视频的名字
    private String vname;
    // 视频的路径
    private String vurl;
    // 上课资源的名字
    private String resources_name;
    // 上课资源的路径
    private String resources_url;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public String getUpdate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(this.update);
    }
}
