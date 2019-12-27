package singh.mahabir.zpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul Proxy Gateway Service Class use @EnableZuulProxy to enable service
 *
 * @author Mahabir Singh
 *
 */
@SpringBootApplication
@EnableZuulProxy
/**
 * By having "spring-cloud-starter-netflix-eureka-client" on the classpath your
 * application will automatically register with the Eureka Server
 * without @EnableDiscoveryClient
 *
 * since 1.4.7.RELEASE
 *
 * Upto 1.3.6.RELEASE we required @EnableDiscoveryClient
 */
//@EnableEurekaClient
//@EnableZuulServer
public class ZuulProxyGatewayServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(ZuulProxyGatewayServiceApplication.class, args);
    }
}
