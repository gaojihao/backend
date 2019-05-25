package me.lizhi;

//import me.lizhi.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;


@SpringBootApplication
@EnableTransactionManagement
//@EnableWebSocketMessageBroker

public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

//    @Bean
//    public SpringContextHolder springContextHolder() {
//        return new SpringContextHolder();
//    }
}
