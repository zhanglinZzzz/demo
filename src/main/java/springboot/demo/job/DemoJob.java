package springboot.demo.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DemoJob extends QuartzJobBean {

    private String name;

    @Override
    protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        System.out.println("现在时间为：" + sdf.format(new Date()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
