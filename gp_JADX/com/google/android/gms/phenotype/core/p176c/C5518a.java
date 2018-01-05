package com.google.android.gms.phenotype.core.p176c;

import com.google.android.gms.phenotype.core.p305b.C5515a;
import com.google.common.c.b;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import com.google.d.a.b.f;
import com.google.d.a.b.g;
import com.google.protobuf.nano.C0757i;
import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;

public final class C5518a implements C5517i {
    public static final c f28359a = c.a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport");
    public final HttpClient f28360b;
    public final String f28361c;
    public final C5521e f28362d;

    public C5518a(HttpClient httpClient, String str, C5521e c5521e) {
        this.f28360b = httpClient;
        this.f28361c = str;
        this.f28362d = c5521e;
    }

    public final C5523j mo5041a(f fVar, String str, String str2) {
        if (this.f28361c.isEmpty()) {
            ((d) ((d) f28359a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "sendRequest", 44, "ApacheHttpTransport.java")).a("Abort attempt to contact server without URL");
            return C5523j.m26451a();
        }
        HttpUriRequest httpPost = new HttpPost(this.f28361c);
        if (!(str2 == null || str2.isEmpty())) {
            httpPost.addHeader("X-SERVER-TOKEN", str2);
        }
        if (!(str == null || str.isEmpty())) {
            String str3 = "Authorization";
            String str4 = "Bearer ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str4.concat(valueOf);
            } else {
                valueOf = new String(str4);
            }
            httpPost.addHeader(str3, valueOf);
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(C0757i.m4909a((C0757i) fVar));
        gZIPOutputStream.close();
        HttpEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.setContentType("application/x-protobuf");
        httpPost.setEntity(byteArrayEntity);
        if (((Boolean) C5515a.f28348f.m27280a()).booleanValue() || "https".equals(httpPost.getURI().getScheme())) {
            ((d) ((d) f28359a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "sendRequest", 54, "ApacheHttpTransport.java")).a("Contacting Heterodyne at %s", httpPost.getURI());
            HttpResponse execute = this.f28360b.execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            this.f28362d.mo5044b();
            if (200 <= statusCode && statusCode < 300) {
                return new C5523j(C5518a.m26440a(execute), C5518a.m26441b(execute), true);
            }
            if (statusCode == 401) {
                ((d) ((d) f28359a.a(Level.WARNING)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "sendRequest", 65, "ApacheHttpTransport.java")).a("Server returned 401, invalidating auth token");
                return new C5523j(null, 0, false);
            }
            ((d) ((d) f28359a.a(Level.WARNING)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "sendRequest", 68, "ApacheHttpTransport.java")).a("Server returned %d", statusCode);
            return C5523j.m26451a();
        }
        ((d) ((d) f28359a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "sendRequest", 50, "ApacheHttpTransport.java")).a("Abort attempt to contact server without HTTPS: %s", httpPost.getURI());
        return C5523j.m26451a();
    }

    private static g m26440a(HttpResponse httpResponse) {
        InputStream inputStream = null;
        try {
            HttpEntity entity = httpResponse.getEntity();
            if ("gzip".equals(entity.getContentEncoding() != null ? entity.getContentEncoding().getValue() : "")) {
                inputStream = new GZIPInputStream(entity.getContent());
            } else {
                inputStream = entity.getContent();
            }
            g gVar = (g) C0757i.m4905a(new g(), b.a(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            return gVar;
        } catch (Throwable e) {
            throw new IOException(e);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    private static int m26441b(HttpResponse httpResponse) {
        Header lastHeader = httpResponse.getLastHeader("Retry-After");
        if (lastHeader == null || lastHeader.getValue() == null) {
            return 0;
        }
        try {
            return Integer.parseInt(lastHeader.getValue());
        } catch (Throwable e) {
            ((d) ((d) ((d) f28359a.a(Level.WARNING)).a(e)).a("com/google/android/gms/phenotype/core/sync/ApacheHttpTransport", "handleRetryAfter", HprofParser.ROOT_REFERENCE_CLEANUP, "ApacheHttpTransport.java")).a("Retry-After with invalid value: %s", lastHeader.getValue());
            return 0;
        }
    }
}
