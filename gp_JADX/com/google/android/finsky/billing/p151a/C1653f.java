package com.google.android.finsky.billing.p151a;

import com.android.volley.C0684b;
import com.android.volley.aa;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

final class C1653f {
    public long f8595a;
    public final String f8596b;
    public final String f8597c;
    public final long f8598d;
    public final long f8599e;
    public final long f8600f;
    public final long f8601g;
    public final Map f8602h;

    private C1653f(String str, String str2, long j, long j2, long j3, long j4, Map map) {
        this.f8596b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f8597c = str2;
        this.f8598d = j;
        this.f8599e = j2;
        this.f8600f = j3;
        this.f8601g = j4;
        this.f8602h = map;
    }

    C1653f(String str, C0684b c0684b) {
        this(str, c0684b.f4132b, c0684b.f4133c, c0684b.f4134d, c0684b.f4135e, c0684b.f4136f, c0684b.f4137g);
        this.f8595a = (long) c0684b.f4131a.length;
    }

    static C1653f m9398a(C1654g c1654g) {
        if (C1652e.m9376a((InputStream) c1654g) == 538247942) {
            return new C1653f(C1652e.m9378a(c1654g), C1652e.m9378a(c1654g), C1652e.m9385b((InputStream) c1654g), C1652e.m9385b((InputStream) c1654g), C1652e.m9385b((InputStream) c1654g), C1652e.m9385b((InputStream) c1654g), C1652e.m9386b(c1654g));
        }
        throw new IOException();
    }

    final boolean m9399a(OutputStream outputStream) {
        try {
            C1652e.m9379a(outputStream, 538247942);
            C1652e.m9381a(outputStream, this.f8596b);
            C1652e.m9381a(outputStream, this.f8597c == null ? "" : this.f8597c);
            C1652e.m9380a(outputStream, this.f8598d);
            C1652e.m9380a(outputStream, this.f8599e);
            C1652e.m9380a(outputStream, this.f8600f);
            C1652e.m9380a(outputStream, this.f8601g);
            C1652e.m9383a(this.f8602h, outputStream);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            aa.m4482b("%s", e.toString());
            return false;
        }
    }
}
