package com.google.android.finsky.api.b;

import android.util.Base64;
import android.util.Log;
import com.squareup.okhttp.ab;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ai;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.v;
import e.f;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class com.google.android.finsky.api.b.a implements com.squareup.okhttp.aa
{

    a() {
    }

    private static void a(String p0, String p1) {
        v0 = 0;
        while (v0 < p1.length()) {
            Log.println(2, p0, p1.substring(v0, Math.min(p1.length(), v0 + 2000)));
            v0 = v0 + 2000;
        }
    }

    private static boolean a(com.squareup.okhttp.v p0, com.squareup.okhttp.ac p1) {
        v0 = p0.c("Content-Encoding");
        if (v0 == 0) {
            if (p1 == 0)
                v0 = 1;
            else if ("text".equals(p1.d))
                v0 = 0;
            else if ("application".equals(p1.d)) {
                if (!"xml".equals(p1.e) && !"json".equals(p1.e))
                    v0 = 1;
                else
                    v0 = 0;
            }
            else
                v0 = 1;
            return v0;
        }
        v3 = v0.iterator();
        while (true) {
            if (!v3.hasNext()) {
                if (p1 == 0)
                    v0 = 1;
                else if ("text".equals(p1.d))
                    v0 = 0;
                else if ("application".equals(p1.d)) {
                    if (!"xml".equals(p1.e) && !"json".equals(p1.e))
                        v0 = 1;
                    else
                        v0 = 0;
                }
                else
                    v0 = 1;
                return v0;
            }
            if (((String)v3.next()).equalsIgnoreCase("gzip")) {
                v0 = 1;
                return v0;
            }
        }
    }

    public final com.squareup.okhttp.ak a(com.squareup.okhttp.ab p0) {
        v3 = p0.a();
        v5 = new StringBuilder();
        v5.append("curl ");
        v5.append("-X ");
        v5.append(v3.b);
        v5.append(" ");
        v6 = v3.c.a().iterator();
        while (v6.hasNext()) {
            v0 = (String)v6.next();
            v5.append("--header \"");
            v5.append(v0);
            v5.append(": ");
            v7 = v3.b(v0);
            v8 = v7.size();
            v1 = 0;
            while (v1 < v8) {
                v5.append((String)v7.get(v1));
                if (v1 < v8 - 1)
                    v5.append(", ");
                v1 = v1 + 1;
            }
            v5.append("\" ");
        }
        v5.append("\"");
        v5.append(v3.a());
        v5.append("\"");
        if (v3.d != 0) {
            v1 = new ByteArrayOutputStream();
            v6 = new e.f();
            v3.d.a(v6);
            v6.b(v1);
            v6.a(v1);
            if (com.google.android.finsky.api.b.a.a(v3.c, v3.d.a())) {
                v0 = Base64.encodeToString(v1.toByteArray(), 2);
                v5.insert(0, (String.valueOf(v0).length() + 35) + "echo '" + v0 + "' | base64 -d > /tmp/$$.bin; ");
                v5.append(" --data-binary @/tmp/$$.bin");
            }
            else
                v5.append(" --data-ascii \"").append(v1.toString()).append("\"");
        }
        com.google.android.finsky.api.b.a.a("FinskyHttp", v5.toString());
        return p0.a(v3);
    }

}
