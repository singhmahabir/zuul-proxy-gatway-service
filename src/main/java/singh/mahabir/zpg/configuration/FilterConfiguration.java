/**
 *
 */
package singh.mahabir.zpg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;

import singh.mahabir.zpg.filter.ProxyPreFilter;
import singh.mahabir.zpg.filter.RouteFilter;
import singh.mahabir.zpg.filter.StartPreFilter;
import singh.mahabir.zpg.filter.StopPostFilter;

/**
 * FilterConfiguration is required for registering the beans with Spring Context
 * and if We want to disable the {@link ZuulFilter} using property file
 *
 * @author Mahabir Singh
 *
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public ProxyPreFilter getProxyPreFilter() {
	return new ProxyPreFilter();
    }

    @Bean
    public StartPreFilter getStartPreFilter() {
	return new StartPreFilter();
    }

    @Bean
    public StopPostFilter getStopPostFilter() {
	return new StopPostFilter();
    }

    @Bean
    public RouteFilter getRouteFilter() {
	return new RouteFilter();
    }
}
