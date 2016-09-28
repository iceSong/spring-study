package hello;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @version 0.01
 * @date 2016-07-15 16:55
 */

@SpringBootApplication
public class  Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication sa = new SpringApplication(Application.class);
        sa.setBannerMode(Banner.Mode.OFF);  // 关闭spring标志，标志可以更改
        sa.run(args);
    }
}
