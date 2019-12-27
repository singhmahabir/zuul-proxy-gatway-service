/**
 *
 */
package singh.mahabir.zpg.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * <p>
 * pre filter
 * </p>
 * If you use <code>@Configuration </code> here then this class can't be disable
 * using properties file
 *
 * @author Mahabir Singh
 *
 */
//@Configuration
public class ProxyPreFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
	final RequestContext ctx = RequestContext.getCurrentContext();
	final String source = ctx.getRequest().getParameter("source");
	boolean isMobile = false;
	if (source != null && source.equals("mobile")) {
	    isMobile = true;
	}
	System.out.println("shouldFilter with mobile is " + isMobile);
	return isMobile;
    }

    @Override
    public Object run() throws ZuulException {
	System.out.println("calling a Filter run");
	return null;
    }

    @Override
    public String filterType() {
	System.out.println("PreProxyFilter filterType");
	return "pre";
    }

    @Override
    public int filterOrder() {
	System.out.println("PreProxyFilter filterOrder");
	return 2;
    }

}
