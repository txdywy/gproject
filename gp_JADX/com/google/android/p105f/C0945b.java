package com.google.android.p105f;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;

public final class C0945b {
    public static final int f5750a = ".".codePointAt(0);
    public static final String[] f5751b = new String[]{"google.com", "googleapis.com"};
    public static final Pattern f5752c = Pattern.compile("[^,;\\s\"]+");
    public static final Pattern f5753d = Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");

    public static HttpUriRequest m5691a(HttpUriRequest httpUriRequest, C0944a c0944a) {
        if (!C0945b.m5693b(httpUriRequest, c0944a)) {
            return httpUriRequest;
        }
        String a = c0944a.m5684a();
        String b = c0944a.m5685b();
        Header[] headers = httpUriRequest.getHeaders("Cookie");
        int length = headers.length;
        int i = 0;
        Object obj = null;
        HttpUriRequest httpUriRequest2 = httpUriRequest;
        while (i < length) {
            Object obj2;
            HttpUriRequest httpUriRequest3;
            Object obj3;
            Object obj4;
            Header header = headers[i];
            Matcher matcher = f5753d.matcher(header.getValue());
            while (matcher.find()) {
                if (matcher.group(2).equals(a)) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            if (obj2 != null) {
                if (obj == null && !(httpUriRequest2 instanceof RequestWrapper)) {
                    httpUriRequest2 = C0945b.m5692a(httpUriRequest2);
                }
                httpUriRequest2.removeHeader(header);
                httpUriRequest2.addHeader(new BasicHeader(header.getName(), C0945b.m5689a(header.getValue(), a, b)));
                httpUriRequest3 = httpUriRequest2;
                obj3 = 1;
            } else {
                obj4 = obj;
                httpUriRequest3 = httpUriRequest2;
                obj3 = obj4;
            }
            i++;
            obj4 = obj3;
            httpUriRequest2 = httpUriRequest3;
            obj = obj4;
        }
        if (obj != null) {
            return httpUriRequest2;
        }
        String a2 = C0945b.m5687a(b);
        httpUriRequest2.addHeader(new BasicHeader("Cookie", new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length()).append(a).append("=").append(a2).toString()));
        return httpUriRequest2;
    }

    public static HttpResponse m5690a(HttpUriRequest httpUriRequest, HttpResponse httpResponse, C0944a c0944a) {
        int i = 0;
        if (C0945b.m5693b(httpUriRequest, c0944a)) {
            String a = c0944a.m5684a();
            for (Header value : httpResponse.getHeaders("Set-Cookie")) {
                if (C0945b.m5688a(value.getValue(), a) != null) {
                    c0944a.m5686c();
                }
            }
            Header[] headers = httpResponse.getHeaders("Set-Cookie2");
            int length = headers.length;
            while (i < length) {
                if (C0945b.m5688a(headers[i].getValue(), a) != null) {
                    c0944a.m5686c();
                }
                i++;
            }
        }
        return httpResponse;
    }

    private static boolean m5693b(HttpUriRequest httpUriRequest, C0944a c0944a) {
        if (c0944a == null) {
            return false;
        }
        for (String str : f5751b) {
            boolean z;
            String host = httpUriRequest.getURI().getHost();
            if (str.length() <= host.length()) {
                if (str.equalsIgnoreCase(host)) {
                    z = true;
                } else {
                    int length = host.length() - 1;
                    for (int length2 = str.length() - 1; length2 >= 0; length2--) {
                        if (Character.toLowerCase(host.codePointAt(length)) != Character.toLowerCase(str.codePointAt(length2))) {
                            break;
                        }
                        length--;
                    }
                    if (host.codePointAt(length) == f5750a) {
                        z = true;
                    }
                }
                if (z) {
                    return true;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static RequestWrapper m5692a(HttpUriRequest httpUriRequest) {
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

    private static String m5689a(String str, String str2, String str3) {
        Matcher matcher = f5753d.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                String group = matcher.group(1);
                String a = C0945b.m5687a(str3);
                matcher.appendReplacement(stringBuffer, new StringBuilder(((String.valueOf(group).length() + 1) + String.valueOf(str2).length()) + String.valueOf(a).length()).append(group).append(str2).append("=").append(a).toString());
            } else {
                matcher.appendReplacement(stringBuffer, matcher.group());
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String m5688a(String str, String str2) {
        Matcher matcher = f5753d.matcher(str);
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                String group = matcher.group();
                group = group.substring(group.indexOf("=") + 1).trim();
                if (group.startsWith("\"")) {
                    return group.substring(1, group.length() - 1);
                }
                return group;
            }
        }
        return null;
    }

    private static String m5687a(String str) {
        if (str == null) {
            return "\"\"";
        }
        return !f5752c.matcher(str).matches() ? new StringBuilder(String.valueOf(str).length() + 2).append("\"").append(str).append("\"").toString() : str;
    }

    static {
        Pattern.compile("[^()<>@,;:\\\"/\\[\\]\\?={}\\s]+");
    }
}
