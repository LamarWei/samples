package studio.keepgo.samples.des;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * </p>
 *
 * @author KeepGo Lamar
 * @email lamar_7950@hotmail.com
 * @date 2017/4/13
 */
@SpringBootApplication
@ComponentScan(basePackages = {"studio.keepgo.samples.des"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WebApplication.class);
        application.run();
    }
}
