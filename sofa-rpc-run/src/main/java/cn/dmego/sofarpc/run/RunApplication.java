package cn.dmego.sofarpc.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author dmego
 * @date 2021/08/11 10:55
 */
//@ImportResource("classpath*:invoke-client.xml")
@SpringBootApplication
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
