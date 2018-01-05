package com.google.android.volley;

import com.google.android.volley.p363a.C6458b;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

final class C6466c extends DefaultHttpClient {
    public final /* synthetic */ boolean f32456a = true;
    public final /* synthetic */ C6464a f32457b;

    C6466c(C6464a c6464a, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f32457b = c6464a;
        super(clientConnectionManager, httpParams);
    }

    protected final BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(C6464a.f32452b);
        createHttpProcessor.addRequestInterceptor(new C6468e(this.f32457b));
        return createHttpProcessor;
    }

    protected final HttpContext createHttpContext() {
        HttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    protected final HttpRequestRetryHandler createHttpRequestRetryHandler() {
        if (this.f32456a) {
            return super.createHttpRequestRetryHandler();
        }
        return new C6467d();
    }

    protected final RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new C6458b(httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectHandler, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }
}
