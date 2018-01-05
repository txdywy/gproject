package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class C0656n implements Comparable {
    public final ab f4026a;
    public final int f4027b;
    public final String f4028c;
    public final int f4029d;
    public final Object f4030e;
    public C0657w f4031f;
    public Integer f4032g;
    public C0700r f4033h;
    public boolean f4034i;
    public boolean f4035j;
    public boolean f4036k;
    public boolean f4037l;
    public C0689z f4038m;
    public C0684b f4039n;
    public Object f4040o;
    public C0687p f4041p;

    public C0656n(int i, String str, C0657w c0657w) {
        int hashCode;
        this.f4026a = ab.f4125a ? new ab() : null;
        this.f4030e = new Object();
        this.f4034i = true;
        this.f4035j = false;
        this.f4036k = false;
        this.f4037l = false;
        this.f4039n = null;
        this.f4027b = i;
        this.f4028c = str;
        this.f4031f = c0657w;
        this.f4038m = new C0690f();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    hashCode = host.hashCode();
                    this.f4029d = hashCode;
                }
            }
        }
        hashCode = 0;
        this.f4029d = hashCode;
    }

    public abstract C0704v mo1055a(C0697m c0697m);

    public abstract void mo1056a(Object obj);

    public final void m4366a(String str) {
        if (ab.f4125a) {
            this.f4026a.m4486a(str, Thread.currentThread().getId());
        }
    }

    final void m4368b(String str) {
        if (this.f4033h != null) {
            C0700r c0700r = this.f4033h;
            synchronized (c0700r.f4181b) {
                c0700r.f4181b.remove(this);
            }
            synchronized (c0700r.f4189j) {
                for (C0703u a : c0700r.f4189j) {
                    a.m4515a();
                }
            }
        }
        if (ab.f4125a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C0698o(this, str, id));
                return;
            }
            this.f4026a.m4486a(str, id);
            this.f4026a.m4485a(toString());
        }
    }

    public C0656n mo1540a(C0700r c0700r) {
        this.f4033h = c0700r;
        return this;
    }

    public final int m4369c() {
        if (this.f4032g != null) {
            return this.f4032g.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public String mo1545d() {
        return this.f4028c;
    }

    public String mo1546e() {
        return mo1545d();
    }

    public void mo1057f() {
        synchronized (this.f4030e) {
            this.f4035j = true;
            this.f4031f = null;
        }
    }

    public boolean mo1073g() {
        boolean z;
        synchronized (this.f4030e) {
            z = this.f4035j;
        }
        return z;
    }

    public Map mo1547h() {
        return Collections.emptyMap();
    }

    @Deprecated
    public String mo1058i() {
        return mo1060l();
    }

    @Deprecated
    public byte[] mo1059j() {
        Map k = mo1548k();
        if (k == null || k.size() <= 0) {
            return null;
        }
        return C0656n.m4361a(k, "UTF-8");
    }

    public Map mo1548k() {
        return null;
    }

    public String mo1060l() {
        String str = "application/x-www-form-urlencoded; charset=";
        String valueOf = String.valueOf("UTF-8");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public byte[] mo1061m() {
        Map k = mo1548k();
        if (k == null || k.size() <= 0) {
            return null;
        }
        return C0656n.m4361a(k, "UTF-8");
    }

    private static byte[] m4361a(Map map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Encoding not supported: ";
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    public C0699q mo1074n() {
        return C0699q.NORMAL;
    }

    public final int m4382o() {
        return this.f4038m.mo1077a();
    }

    public void mo1538p() {
        synchronized (this.f4030e) {
            this.f4036k = true;
        }
    }

    public boolean mo1539q() {
        boolean z;
        synchronized (this.f4030e) {
            z = this.f4036k;
        }
        return z;
    }

    public VolleyError mo1543b(VolleyError volleyError) {
        return volleyError;
    }

    public void mo1544c(VolleyError volleyError) {
        synchronized (this.f4030e) {
            C0657w c0657w = this.f4031f;
        }
        if (c0657w != null) {
            c0657w.mo1062a(volleyError);
        }
    }

    final void m4364a(C0687p c0687p) {
        synchronized (this.f4030e) {
            this.f4041p = c0687p;
        }
    }

    final void m4385r() {
        synchronized (this.f4030e) {
            C0687p c0687p = this.f4041p;
        }
        if (c0687p != null) {
            c0687p.mo1075a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f4029d));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = this.f4035j ? "[X] " : "[ ] ";
        String d = mo1545d();
        String valueOf2 = String.valueOf(mo1074n());
        String valueOf3 = String.valueOf(this.f4032g);
        return new StringBuilder(((((String.valueOf(str).length() + 3) + String.valueOf(d).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(str).append(d).append(" ").append(valueOf).append(" ").append(valueOf2).append(" ").append(valueOf3).toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        C0656n c0656n = (C0656n) obj;
        C0699q n = mo1074n();
        C0699q n2 = c0656n.mo1074n();
        if (n == n2) {
            return this.f4032g.intValue() - c0656n.f4032g.intValue();
        }
        return n2.ordinal() - n.ordinal();
    }
}
