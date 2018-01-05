package com.google.android.f;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;

private static class com.google.android.f.b
{

    public static final int a;
    public static final String[] b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        com.google.android.f.b.a = ".".codePointAt(0);
        v0 = new String[2];
        v0[0] = "google.com";
        v0[1] = "googleapis.com";
        com.google.android.f.b.b = v0;
        Pattern.compile("[^()<>@,;:\\\"/\\[\\]\\?={}\\s]+");
        com.google.android.f.b.c = Pattern.compile("[^,;\\s\"]+");
        com.google.android.f.b.d = Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");
    }

    private static String a(String p0) {
        if (p0 == 0)
            p0 = "\"\"";
        else if (!com.google.android.f.b.c.matcher(p0).matches())
            p0 = (String.valueOf(p0).length() + 2) + "\"" + p0 + "\"";
        return p0;
    }

    private static String a(String p0, String p1) {
        v0 = com.google.android.f.b.d.matcher(p0);
        while (true) {
            if (!v0.find()) {
                v0 = 0;
                return v0;
            }
            if (v0.group(2).equals(p1)) {
                v0 = v0.group();
                v0 = v0.substring(v0.indexOf("=") + 1).trim();
                if (v0.startsWith("\""))
                    v0 = v0.substring(1, v0.length() - 1);
                return v0;
            }
        }
    }

    private static String a(String p0, String p1, String p2) {
        v0 = com.google.android.f.b.d.matcher(p0);
        v1 = new StringBuffer();
        while (v0.find()) {
            if (v0.group(2).equals(p1)) {
                v2 = v0.group(1);
                v3 = com.google.android.f.b.a(p2);
                v0.appendReplacement(v1, (String.valueOf(v2).length() + 1 + String.valueOf(p1).length() + String.valueOf(v3).length()) + v2 + p1 + "=" + v3);
            }
            else
                v0.appendReplacement(v1, v0.group());
        }
        v0.appendTail(v1);
        return v1.toString();
    }

    public static HttpResponse a(HttpUriRequest p0, HttpResponse p1, com.google.android.f.a p2) {
        v0 = 0;
        if (com.google.android.f.b.b(p0, p2)) {
            v2 = p2.a();
            v3 = p1.getHeaders("Set-Cookie");
            v1 = 0;
            while (v1 < v3.length) {
                if (com.google.android.f.b.a(v3[v1].getValue(), v2) != 0)
                    p2.c();
                v1 = v1 + 1;
            }
            v1 = p1.getHeaders("Set-Cookie2");
            while (v0 < v1.length) {
                if (com.google.android.f.b.a(v1[v0].getValue(), v2) != 0)
                    p2.c();
                v0 = v0 + 1;
            }
        }
        return p1;
    }

    public static HttpUriRequest a(HttpUriRequest p0, com.google.android.f.a p1) {
  6:    if (!com.google.android.f.b.b(p0, p1)) {
167:        v0 = p0;
168:        return v0;
        }
  8:    v6 = p1.a();
 12:    v7 = p1.b();
 18:    v8 = p0.getHeaders("Cookie");
 23:    v5 = 0;
 24:    v2 = 0;
 25:    v0 = p0;
 26:    if (v5 >= v8.length) {
104:        if (v2 == 0) {
110:            v3 = com.google.android.f.b.a(v7);
159:            v0.addHeader(new BasicHeader("Cookie", (String.valueOf(v6).length() + 1 + String.valueOf(v3).length()) + v6 + "=" + v3));
            }
162:        return v0;
        }
 36:    v3 = com.google.android.f.b.d.matcher(v8[v5].getValue());
 44:    if (!v3.find()) goto 102;
 55:    if (!v3.group(2).equals(v6)) goto 40;
 57:    v3 = 1;
 58:    if (v3 != 0) {
 60:        if (v2 == 0 && !(v0 instanceof RequestWrapper))
 66:            v0 = com.google.android.f.b.a(v0);
 70:        v0.removeHeader(v8[v5]);
 90:        v0.addHeader(new BasicHeader(v8[v5].getName(), com.google.android.f.b.a(v8[v5].getValue(), v6, v7)));
 93:        v2 = v0;
 94:        v0 = 1;
        }
        else {
163:        v12 = v2;
164:        v2 = v0;
165:        v0 = v12;
        }
 97:    v5 = v5 + 1;
 98:    v12 = v0;
 99:    v0 = v2;
100:    v2 = v12;
101:    goto 26;
102:    v3 = 0;
103:    goto 58;
104:    if (v2 == 0) {
110:        v3 = com.google.android.f.b.a(v7);
159:        v0.addHeader(new BasicHeader("Cookie", (String.valueOf(v6).length() + 1 + String.valueOf(v3).length()) + v6 + "=" + v3));
        }
162:    return v0;
    }

    private static RequestWrapper a(HttpUriRequest p0) {
        try {
            if (p0 instanceof HttpEntityEnclosingRequest)
                v0 = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)p0);
            else
                v0 = new RequestWrapper(p0);
            v0.resetHeaders();
            return v0;
        }
        catch (ProtocolException ex) {
            throw new ClientProtocolException(ex);
        }
    }

    private static boolean b(HttpUriRequest p0, com.google.android.f.a p1) {
  0:    v0 = 1;
  2:    if (p1 == 0) {
 95:        v0 = 0;
 96:        return v0;
        }
  7:    v4 = 0;
  8:    if (v4 >= com.google.android.f.b.b.length) {
 93:        v0 = 0;
 94:        return v0;
        }
 16:    v8 = p0.getURI().getHost();
 28:    if (com.google.android.f.b.b[v4].length() > v8.length()) goto 87;
 34:    if (!com.google.android.f.b.b[v4].equalsIgnoreCase(v8)) goto 40;
 36:    v2 = 1;
 37:    if (v2 != 0)
 39:        return v0;
 38:    goto 89;
 44:    v3 = v8.length() - 1;
 50:    v2 = com.google.android.f.b.b[v4].length() - 1;
 52:    if (v2 < 0) goto 77;
 70:    if (Character.toLowerCase(v8.codePointAt(v3)) != Character.toLowerCase(com.google.android.f.b.b[v4].codePointAt(v2))) goto 87;
 72:    v3 = v3 - 1;
 74:    v2 = v2 - 1;
 76:    goto 52;
 83:    if (v8.codePointAt(v3) == com.google.android.f.b.a)
 85:        v2 = 1;
        else
 87:        v2 = 0;
 86:    goto 37;
 87:    v2 = 0;
 88:    goto 37;
 91:    v4 = v4 + 1;
 92:    goto 8;
    }

}
