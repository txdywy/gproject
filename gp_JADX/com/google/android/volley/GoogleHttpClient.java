package com.google.android.volley;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.common.http.C0935c;
import com.google.android.common.http.UrlRules;
import com.google.android.p105f.C0945b;
import java.net.URI;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class GoogleHttpClient implements HttpClient {
    public final a f31616a;
    public final g f31617b;
    public final ContentResolver f31618c;
    public final String f31619d;
    public final ThreadLocal f31620e;

    public GoogleHttpClient(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private final org.apache.http.HttpResponse m28970a(org.apache.http.client.methods.HttpUriRequest r19) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0070
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.rerun(BlockProcessor.java:44)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:57)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r18 = this;
        r15 = -1;
        r16 = android.os.SystemClock.elapsedRealtime();
        r0 = r18;	 Catch:{ all -> 0x00c5 }
        r2 = r0.f31620e;	 Catch:{ all -> 0x00c5 }
        r3 = 0;	 Catch:{ all -> 0x00c5 }
        r2.set(r3);	 Catch:{ all -> 0x00c5 }
        r0 = r18;	 Catch:{ all -> 0x00c5 }
        r2 = r0.f31618c;	 Catch:{ all -> 0x00c5 }
        r3 = "http_stats";	 Catch:{ all -> 0x00c5 }
        r4 = 0;	 Catch:{ all -> 0x00c5 }
        r2 = com.google.android.p102c.C0925g.m5657a(r2, r3, r4);	 Catch:{ all -> 0x00c5 }
        if (r2 == 0) goto L_0x009e;	 Catch:{ all -> 0x00c5 }
    L_0x001a:
        r5 = android.os.Process.myUid();	 Catch:{ all -> 0x00c5 }
        r6 = android.net.TrafficStats.getUidTxBytes(r5);	 Catch:{ all -> 0x00c5 }
        r8 = android.net.TrafficStats.getUidRxBytes(r5);	 Catch:{ all -> 0x00c5 }
        r0 = r18;	 Catch:{ all -> 0x00c5 }
        r2 = r0.f31617b;	 Catch:{ all -> 0x00c5 }
        r3 = r2.a;	 Catch:{ all -> 0x00c5 }
        r4 = r2.b;	 Catch:{ all -> 0x00c5 }
        r0 = r19;	 Catch:{ all -> 0x00c5 }
        r4 = com.google.android.p105f.C0945b.m5691a(r0, r4);	 Catch:{ all -> 0x00c5 }
        r3 = r3.execute(r4);	 Catch:{ all -> 0x00c5 }
        r2 = r2.b;	 Catch:{ all -> 0x00c5 }
        r0 = r19;	 Catch:{ all -> 0x00c5 }
        r14 = com.google.android.p105f.C0945b.m5690a(r0, r3, r2);	 Catch:{ all -> 0x00c5 }
        if (r14 != 0) goto L_0x0099;	 Catch:{ all -> 0x00c5 }
    L_0x0042:
        r3 = 0;	 Catch:{ all -> 0x00c5 }
    L_0x0043:
        if (r3 == 0) goto L_0x0057;	 Catch:{ all -> 0x00c5 }
    L_0x0045:
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00c5 }
        r10 = r12 - r16;	 Catch:{ all -> 0x00c5 }
        r2 = new com.google.android.common.http.a;	 Catch:{ all -> 0x00c5 }
        r0 = r18;	 Catch:{ all -> 0x00c5 }
        r4 = r0.f31619d;	 Catch:{ all -> 0x00c5 }
        r2.<init>(r3, r4, r5, r6, r8, r10, r12);	 Catch:{ all -> 0x00c5 }
        r14.setEntity(r2);	 Catch:{ all -> 0x00c5 }
    L_0x0057:
        r3 = r14;	 Catch:{ all -> 0x00c5 }
    L_0x0058:
        r2 = r3.getStatusLine();	 Catch:{ all -> 0x00c5 }
        r4 = r2.getStatusCode();	 Catch:{ all -> 0x00c5 }
        r6 = android.os.SystemClock.elapsedRealtime();
        r6 = r6 - r16;
        r0 = r18;
        r2 = r0.f31620e;
        r2 = r2.get();
        if (r2 != 0) goto L_0x00ba;
    L_0x0070:
        if (r4 < 0) goto L_0x00ba;	 Catch:{ Exception -> 0x00bc }
    L_0x0072:
        r2 = 1;	 Catch:{ Exception -> 0x00bc }
    L_0x0073:
        r5 = 203002; // 0x318fa float:2.84466E-40 double:1.002963E-318;	 Catch:{ Exception -> 0x00bc }
        r8 = 4;	 Catch:{ Exception -> 0x00bc }
        r8 = new java.lang.Object[r8];	 Catch:{ Exception -> 0x00bc }
        r9 = 0;	 Catch:{ Exception -> 0x00bc }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x00bc }
        r8[r9] = r6;	 Catch:{ Exception -> 0x00bc }
        r6 = 1;	 Catch:{ Exception -> 0x00bc }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x00bc }
        r8[r6] = r4;	 Catch:{ Exception -> 0x00bc }
        r4 = 2;	 Catch:{ Exception -> 0x00bc }
        r0 = r18;	 Catch:{ Exception -> 0x00bc }
        r6 = r0.f31619d;	 Catch:{ Exception -> 0x00bc }
        r8[r4] = r6;	 Catch:{ Exception -> 0x00bc }
        r4 = 3;	 Catch:{ Exception -> 0x00bc }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x00bc }
        r8[r4] = r2;	 Catch:{ Exception -> 0x00bc }
        android.util.EventLog.writeEvent(r5, r8);	 Catch:{ Exception -> 0x00bc }
    L_0x0098:
        return r3;
    L_0x0099:
        r3 = r14.getEntity();	 Catch:{ all -> 0x00c5 }
        goto L_0x0043;	 Catch:{ all -> 0x00c5 }
    L_0x009e:
        r0 = r18;	 Catch:{ all -> 0x00c5 }
        r2 = r0.f31617b;	 Catch:{ all -> 0x00c5 }
        r3 = r2.a;	 Catch:{ all -> 0x00c5 }
        r4 = r2.b;	 Catch:{ all -> 0x00c5 }
        r0 = r19;	 Catch:{ all -> 0x00c5 }
        r4 = com.google.android.p105f.C0945b.m5691a(r0, r4);	 Catch:{ all -> 0x00c5 }
        r3 = r3.execute(r4);	 Catch:{ all -> 0x00c5 }
        r2 = r2.b;	 Catch:{ all -> 0x00c5 }
        r0 = r19;	 Catch:{ all -> 0x00c5 }
        r2 = com.google.android.p105f.C0945b.m5690a(r0, r3, r2);	 Catch:{ all -> 0x00c5 }
        r3 = r2;
        goto L_0x0058;
    L_0x00ba:
        r2 = 0;
        goto L_0x0073;
    L_0x00bc:
        r2 = move-exception;
        r4 = "GoogleHttpClient";
        r5 = "Error recording stats";
        android.util.Log.e(r4, r5, r2);
        goto L_0x0098;
    L_0x00c5:
        r2 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x00fd }
        r4 = r4 - r16;	 Catch:{ Exception -> 0x00fd }
        r0 = r18;	 Catch:{ Exception -> 0x00fd }
        r3 = r0.f31620e;	 Catch:{ Exception -> 0x00fd }
        r3 = r3.get();	 Catch:{ Exception -> 0x00fd }
        if (r3 != 0) goto L_0x00d6;	 Catch:{ Exception -> 0x00fd }
    L_0x00d6:
        r3 = 0;	 Catch:{ Exception -> 0x00fd }
        r6 = 203002; // 0x318fa float:2.84466E-40 double:1.002963E-318;	 Catch:{ Exception -> 0x00fd }
        r7 = 4;	 Catch:{ Exception -> 0x00fd }
        r7 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x00fd }
        r8 = 0;	 Catch:{ Exception -> 0x00fd }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x00fd }
        r7[r8] = r4;	 Catch:{ Exception -> 0x00fd }
        r4 = 1;	 Catch:{ Exception -> 0x00fd }
        r5 = java.lang.Integer.valueOf(r15);	 Catch:{ Exception -> 0x00fd }
        r7[r4] = r5;	 Catch:{ Exception -> 0x00fd }
        r4 = 2;	 Catch:{ Exception -> 0x00fd }
        r0 = r18;	 Catch:{ Exception -> 0x00fd }
        r5 = r0.f31619d;	 Catch:{ Exception -> 0x00fd }
        r7[r4] = r5;	 Catch:{ Exception -> 0x00fd }
        r4 = 3;	 Catch:{ Exception -> 0x00fd }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x00fd }
        r7[r4] = r3;	 Catch:{ Exception -> 0x00fd }
        android.util.EventLog.writeEvent(r6, r7);	 Catch:{ Exception -> 0x00fd }
    L_0x00fc:
        throw r2;
    L_0x00fd:
        r3 = move-exception;
        r4 = "GoogleHttpClient";
        r5 = "Error recording stats";
        android.util.Log.e(r4, r5, r3);
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.volley.GoogleHttpClient.a(org.apache.http.client.methods.HttpUriRequest):org.apache.http.HttpResponse");
    }

    private GoogleHttpClient(Context context, String str, byte b) {
        this(context, str, '\u0000');
    }

    private GoogleHttpClient(Context context, String str, char c) {
        this.f31620e = new ThreadLocal();
        String str2 = Build.DEVICE;
        String str3 = Build.ID;
        this.f31616a = a.a(String.valueOf(new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(" (").append(str2).append(" ").append(str3).append(")").toString()).concat("; gzip"), context);
        this.f31617b = new g(this.f31616a);
        this.f31618c = context.getContentResolver();
        this.f31619d = str;
        SchemeRegistry schemeRegistry = getConnectionManager().getSchemeRegistry();
        for (String str22 : schemeRegistry.getSchemeNames()) {
            Scheme unregister = schemeRegistry.unregister(str22);
            SocketFactory socketFactory = unregister.getSocketFactory();
            if (socketFactory instanceof LayeredSocketFactory) {
                socketFactory = new i(this, (LayeredSocketFactory) socketFactory);
            } else {
                Object jVar = new j(this, socketFactory);
            }
            schemeRegistry.register(new Scheme(str22, socketFactory, unregister.getDefaultPort()));
        }
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        String uri = httpUriRequest.getURI().toString();
        C0935c a = UrlRules.m5671a(this.f31618c).m5672a(uri);
        String a2 = a.m5673a(uri);
        if (a2 == null) {
            String str = a.f5728a;
            Log.w("GoogleHttpClient", new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(uri).length()).append("Blocked by ").append(str).append(": ").append(uri).toString());
            throw new BlockedRequestException(a);
        } else if (a2 == uri) {
            return m28970a(httpUriRequest);
        } else {
            try {
                URI uri2 = new URI(a2);
                HttpUriRequest b = m28972b(httpUriRequest);
                b.setURI(uri2);
                if (Log.isLoggable("GoogleHttpClient", 3)) {
                    String str2 = a.f5728a;
                    Log.d("GoogleHttpClient", new StringBuilder(((String.valueOf(str2).length() + 11) + String.valueOf(uri).length()) + String.valueOf(a2).length()).append("Rule ").append(str2).append(": ").append(uri).append(" -> ").append(a2).toString());
                }
                return m28970a(b);
            } catch (Throwable e) {
                Throwable th = e;
                String str3 = "Bad URL from rule: ";
                uri = String.valueOf(a.f5728a);
                throw new RuntimeException(uri.length() != 0 ? str3.concat(uri) : new String(str3), th);
            }
        }
    }

    private static RequestWrapper m28972b(HttpUriRequest httpUriRequest) {
        try {
            RequestWrapper entityEnclosingRequestWrapper;
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpUriRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (Throwable e) {
            throw new ClientProtocolException(e);
        }
    }

    public final HttpParams getParams() {
        return this.f31616a.getParams();
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f31616a.getConnectionManager();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, null);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        g gVar = this.f31617b;
        return C0945b.m5690a(m28971a(httpRequest), gVar.a.execute(httpHost, C0945b.m5691a(m28971a(httpRequest), gVar.b)), gVar.b);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        g gVar = this.f31617b;
        return C0945b.m5690a(m28971a(httpRequest), gVar.a.execute(httpHost, C0945b.m5691a(m28971a(httpRequest), gVar.b), httpContext), gVar.b);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        g gVar = this.f31617b;
        return gVar.a.execute(C0945b.m5691a(httpUriRequest, gVar.b), new h(responseHandler, httpUriRequest, gVar.b));
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        g gVar = this.f31617b;
        return gVar.a.execute(httpUriRequest, new h(responseHandler, httpUriRequest, gVar.b), httpContext);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        g gVar = this.f31617b;
        HttpUriRequest a = m28971a(httpRequest);
        return gVar.a.execute(httpHost, C0945b.m5691a(a, gVar.b), new h(responseHandler, a, gVar.b));
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        g gVar = this.f31617b;
        HttpUriRequest a = m28971a(httpRequest);
        return gVar.a.execute(httpHost, C0945b.m5691a(a, gVar.b), new h(responseHandler, a, gVar.b), httpContext);
    }

    private static RequestWrapper m28971a(HttpRequest httpRequest) {
        try {
            RequestWrapper entityEnclosingRequestWrapper;
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (Throwable e) {
            throw new ClientProtocolException(e);
        }
    }
}
