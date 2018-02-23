import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Authir : skevin
 * @Description:
 * @Date : create in 10:43 2018/2/23
 * @Mail :shenkai_cd@keruyun.com
 */
@SpringBootApplication
@EnableConfigServer
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}