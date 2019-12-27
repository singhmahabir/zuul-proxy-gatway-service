/**
 *
 */
package singh.mahabir.zpg.filter;

import java.time.Instant;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * <p>
 * pre filter
 * </p>
 * If you use @Configuration here then this class can't be disable using
 * properties file
 *
 * @author Mahabir Singh
 *
 */
//@Configuration
public class StartPreFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
	return true;
    }

    @Override
    public Object run() throws ZuulException {
	System.out.println("StartPreFilter running");
	final RequestContext ctx = RequestContext.getCurrentContext();
	ctx.set("starttime", Instant.now());
	return null;
    }

    @Override
    public String filterType() {

	return "pre";
    }

    @Override
    public int filterOrder() {
	return 1;
    }

}
