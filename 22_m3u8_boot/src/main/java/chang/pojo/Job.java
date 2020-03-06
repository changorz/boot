package chang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Job {

    private Integer id;
    private Integer cid;
    private String content;
    private Date start_time;
    private Date end_time;

}
