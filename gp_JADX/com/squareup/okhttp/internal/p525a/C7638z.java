package com.squareup.okhttp.internal.p525a;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p526e.C7728j;

final class C7638z {
    public static final C7636x[] f39553a = new C7636x[]{new C7636x(C7636x.f39542e, ""), new C7636x(C7636x.f39539b, "GET"), new C7636x(C7636x.f39539b, "POST"), new C7636x(C7636x.f39540c, "/"), new C7636x(C7636x.f39540c, "/index.html"), new C7636x(C7636x.f39541d, "http"), new C7636x(C7636x.f39541d, "https"), new C7636x(C7636x.f39538a, "200"), new C7636x(C7636x.f39538a, "204"), new C7636x(C7636x.f39538a, "206"), new C7636x(C7636x.f39538a, "304"), new C7636x(C7636x.f39538a, "400"), new C7636x(C7636x.f39538a, "404"), new C7636x(C7636x.f39538a, "500"), new C7636x("accept-charset", ""), new C7636x("accept-encoding", "gzip, deflate"), new C7636x("accept-language", ""), new C7636x("accept-ranges", ""), new C7636x("accept", ""), new C7636x("access-control-allow-origin", ""), new C7636x("age", ""), new C7636x("allow", ""), new C7636x("authorization", ""), new C7636x("cache-control", ""), new C7636x("content-disposition", ""), new C7636x("content-encoding", ""), new C7636x("content-language", ""), new C7636x("content-length", ""), new C7636x("content-location", ""), new C7636x("content-range", ""), new C7636x("content-type", ""), new C7636x("cookie", ""), new C7636x("date", ""), new C7636x("etag", ""), new C7636x("expect", ""), new C7636x("expires", ""), new C7636x("from", ""), new C7636x("host", ""), new C7636x("if-match", ""), new C7636x("if-modified-since", ""), new C7636x("if-none-match", ""), new C7636x("if-range", ""), new C7636x("if-unmodified-since", ""), new C7636x("last-modified", ""), new C7636x("link", ""), new C7636x("location", ""), new C7636x("max-forwards", ""), new C7636x("proxy-authenticate", ""), new C7636x("proxy-authorization", ""), new C7636x("range", ""), new C7636x("referer", ""), new C7636x("refresh", ""), new C7636x("retry-after", ""), new C7636x("server", ""), new C7636x("set-cookie", ""), new C7636x("strict-transport-security", ""), new C7636x("transfer-encoding", ""), new C7636x("user-agent", ""), new C7636x("vary", ""), new C7636x("via", ""), new C7636x("www-authenticate", "")};
    public static final Map f39554b;

    static C7728j m36855a(C7728j c7728j) {
        int i = 0;
        int e = c7728j.mo6522e();
        while (i < e) {
            byte a = c7728j.mo6513a(i);
            if (a < (byte) 65 || a > (byte) 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c7728j.mo6515a());
            }
        }
        return c7728j;
    }

    static {
        int i = 0;
        Map linkedHashMap = new LinkedHashMap(f39553a.length);
        while (i < f39553a.length) {
            if (!linkedHashMap.containsKey(f39553a[i].f39545h)) {
                linkedHashMap.put(f39553a[i].f39545h, Integer.valueOf(i));
            }
            i++;
        }
        f39554b = Collections.unmodifiableMap(linkedHashMap);
    }
}
