package cn.dmego.sofarpc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author dmego
 * @date 2021/08/11 10:58
 */
//@ImportResource({"classpath*:invoke-server.xml","classpath*:invoke-client.xml"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
