/**
 *
 */
package singh.mahabir.zpg.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * <p>
 * route filter
 * </p>
 * If you use @Configuration here then this class can't be disable using
 * properties file
 *
 * @author Mahabir Singh
 *
 */
//@Configuration
public class RouteFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
	return true;
    }

    @Override
    public Object run() throws ZuulException {
	System.out.println("RouteFilter running");
	return null;
    }

    @Override
    public String filterType() {

	return "route";
    }

    @Override
    public int filterOrder() {
	return 1;
    }

}
