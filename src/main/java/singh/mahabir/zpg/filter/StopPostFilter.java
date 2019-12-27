/**
 *
 */
package singh.mahabir.zpg.filter;

import java.time.Duration;
import java.time.Instant;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * <p>
 * post filter
 * </p>
 * If you use @Configuration here then this class can't be disable using
 * properties file
 *
 * @author Mahabir Singh
 *
 */
//@Configuration
public class StopPostFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
	return true;
    }

    @Override
    public Object run() throws ZuulException {
	System.out.println("StopPostFilter running");
	final Instant stop = Instant.now();
	final RequestContext ctx = RequestContext.getCurrentContext();
	final Instant start = (Instant) ctx.get("starttime");
	final Duration duration = Duration.between(start, stop);
	System.out.println("call took " + duration.toMillis() + " seconds");
	return null;
    }

    @Override
    public String filterType() {

	return "post";
    }

    @Override
    public int filterOrder() {
	return 1;
    }

}
