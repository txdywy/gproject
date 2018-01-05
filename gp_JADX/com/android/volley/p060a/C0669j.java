package com.android.volley.p060a;

import com.android.volley.C0684b;
import com.android.volley.C0695j;
import com.android.volley.aa;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

final class C0669j {
    public long f4080a;
    public final String f4081b;
    public final String f4082c;
    public final long f4083d;
    public final long f4084e;
    public final long f4085f;
    public final long f4086g;
    public final List f4087h;

    private C0669j(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f4081b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f4082c = str2;
        this.f4083d = j;
        this.f4084e = j2;
        this.f4085f = j3;
        this.f4086g = j4;
        this.f4087h = list;
    }

    C0669j(String str, C0684b c0684b) {
        List list;
        String str2 = c0684b.f4132b;
        long j = c0684b.f4133c;
        long j2 = c0684b.f4134d;
        long j3 = c0684b.f4135e;
        long j4 = c0684b.f4136f;
        if (c0684b.f4138h != null) {
            list = c0684b.f4138h;
        } else {
            list = C0673n.m4465b(c0684b.f4137g);
        }
        this(str, str2, j, j2, j3, j4, list);
        this.f4080a = (long) c0684b.f4131a.length;
    }

    static C0669j m4453a(C0670k c0670k) {
        if (C0668i.m4433a((InputStream) c0670k) == 538247942) {
            return new C0669j(C0668i.m4435a(c0670k), C0668i.m4435a(c0670k), C0668i.m4441b((InputStream) c0670k), C0668i.m4441b((InputStream) c0670k), C0668i.m4441b((InputStream) c0670k), C0668i.m4441b((InputStream) c0670k), C0668i.m4442b(c0670k));
        }
        throw new IOException();
    }

    final boolean m4454a(OutputStream outputStream) {
        try {
            C0668i.m4436a(outputStream, 538247942);
            C0668i.m4438a(outputStream, this.f4081b);
            C0668i.m4438a(outputStream, this.f4082c == null ? "" : this.f4082c);
            C0668i.m4437a(outputStream, this.f4083d);
            C0668i.m4437a(outputStream, this.f4084e);
            C0668i.m4437a(outputStream, this.f4085f);
            C0668i.m4437a(outputStream, this.f4086g);
            List<C0695j> list = this.f4087h;
            if (list != null) {
                C0668i.m4436a(outputStream, list.size());
                for (C0695j c0695j : list) {
                    C0668i.m4438a(outputStream, c0695j.f4159a);
                    C0668i.m4438a(outputStream, c0695j.f4160b);
                }
            } else {
                C0668i.m4436a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            aa.m4482b("%s", e.toString());
            return false;
        }
    }
}
