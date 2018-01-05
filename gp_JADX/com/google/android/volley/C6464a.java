package com.google.android.volley;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import com.google.android.volley.p363a.C6457a;
import com.google.android.volley.p363a.C6459c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParamBean;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

public final class C6464a implements HttpClient {
    public static String[] f32451a = new String[]{"text/", "application/xml", "application/json"};
    public static final HttpRequestInterceptor f32452b = new C6465b();
    public final HttpClient f32453c;
    public RuntimeException f32454d = new IllegalStateException("AndroidHttpClient created and never closed");
    public volatile C6469f f32455e;

    public static C6464a m29520a(String str, Context context) {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        SSLSessionCache sSLSessionCache = context == null ? null : new SSLSessionCache(context);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", C6457a.f32441a, 80));
        schemeRegistry.register(new Scheme("https", C6464a.m29522a(sSLSessionCache), 443));
        ConnManagerParamBean connManagerParamBean = new ConnManagerParamBean(basicHttpParams);
        connManagerParamBean.setConnectionsPerRoute(new ConnPerRouteBean(4));
        connManagerParamBean.setMaxTotalConnections(8);
        return new C6464a(new C6459c(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private static SSLSocketFactory m29522a(SSLSessionCache sSLSessionCache) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        try {
            return (SSLSocketFactory) SSLSocketFactory.class.getConstructor(new Class[]{javax.net.ssl.SSLSocketFactory.class}).newInstance(new Object[]{sSLSocketFactory});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable e22) {
            throw new IllegalStateException(e22);
        } catch (Throwable e222) {
            throw new IllegalStateException(e222);
        }
    }

    private C6464a(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f32453c = new C6466c(this, clientConnectionManager, httpParams);
    }

    protected final void finalize() {
        super.finalize();
        if (this.f32454d != null) {
            Log.e("AndroidHttpClient", "Leak found", this.f32454d);
            this.f32454d = null;
        }
    }

    public final HttpParams getParams() {
        return this.f32453c.getParams();
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f32453c.getConnectionManager();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f32453c.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f32453c.execute(httpUriRequest, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f32453c.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f32453c.execute(httpHost, httpRequest, httpContext);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return this.f32453c.execute(httpUriRequest, responseHandler);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f32453c.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        return this.f32453c.execute(httpHost, httpRequest, responseHandler);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f32453c.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    static String m29521a(HttpUriRequest httpUriRequest) {
        Object uri;
        HttpEntity entity;
        OutputStream byteArrayOutputStream;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curl ");
        stringBuilder.append("-X ");
        stringBuilder.append(httpUriRequest.getMethod());
        stringBuilder.append(" ");
        for (Object obj : httpUriRequest.getAllHeaders()) {
            stringBuilder.append("--header \"");
            stringBuilder.append(obj.toString().trim());
            stringBuilder.append("\" ");
        }
        URI uri2 = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
                stringBuilder.append("\"");
                stringBuilder.append(uri);
                stringBuilder.append("\"");
                if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                    entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
                    if (entity != null && entity.isRepeatable()) {
                        if (entity.getContentLength() >= 1024) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            entity.writeTo(byteArrayOutputStream);
                            if (C6464a.m29523b(httpUriRequest)) {
                                stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                            } else {
                                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString).length() + 35).append("echo '").append(encodeToString).append("' | base64 -d > /tmp/$$.bin; ").toString());
                                stringBuilder.append(" --data-binary @/tmp/$$.bin");
                            }
                        } else {
                            stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
        URI uri3 = uri2;
        stringBuilder.append("\"");
        stringBuilder.append(uri);
        stringBuilder.append("\"");
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            if (entity.getContentLength() >= 1024) {
                stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (C6464a.m29523b(httpUriRequest)) {
                    stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                } else {
                    String encodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    stringBuilder.insert(0, new StringBuilder(String.valueOf(encodeToString2).length() + 35).append("echo '").append(encodeToString2).append("' | base64 -d > /tmp/$$.bin; ").toString());
                    stringBuilder.append(" --data-binary @/tmp/$$.bin");
                }
            }
        }
        return stringBuilder.toString();
    }

    private static boolean m29523b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header value : headers) {
                if ("gzip".equalsIgnoreCase(value.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 == null) {
            return true;
        }
        for (Header header : headers2) {
            for (String startsWith : f32451a) {
                if (header.getValue().startsWith(startsWith)) {
                    return false;
                }
            }
        }
        return true;
    }
}
