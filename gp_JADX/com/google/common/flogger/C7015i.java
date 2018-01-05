package com.google.common.flogger;

import com.google.common.flogger.backend.C7013i;
import com.google.common.flogger.backend.C7023n;
import com.google.common.flogger.backend.C7042l;
import com.google.common.flogger.backend.C7047s;
import com.google.common.flogger.backend.C7054z;
import com.google.common.flogger.backend.LoggingException;
import com.google.common.flogger.p423b.C7010a;
import com.google.common.flogger.p423b.C7011b;
import com.google.common.flogger.parser.C7069f;
import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import java.io.PrintStream;
import java.util.logging.Level;

public abstract class C7015i implements C7013i, C7014s {
    public static final String f34491c = new String();
    public final Level f34492d;
    public final long f34493e;
    public C7062j f34494f;
    public C7065m f34495g;
    public C7054z f34496h;
    public Object[] f34497i;

    protected C7015i(Level level, boolean z) {
        this(level, z, C7023n.m32038e());
    }

    protected abstract C7069f mo5980a();

    protected abstract C7009a mo6007b();

    protected abstract C7014s mo6008c();

    private C7015i(Level level, boolean z, long j) {
        this.f34494f = null;
        this.f34495g = null;
        this.f34496h = null;
        this.f34497i = null;
        this.f34492d = (Level) C7011b.m31954a(level, "level");
        this.f34493e = j;
        if (z) {
            m31984c("/forced", Boolean.TRUE);
        }
    }

    public final Level mo5972d() {
        return this.f34492d;
    }

    public final long mo5973e() {
        return this.f34493e;
    }

    public final C7065m mo5974f() {
        if (this.f34495g != null) {
            return this.f34495g;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    public final C7054z mo5975g() {
        return this.f34496h;
    }

    public final Object[] mo5976h() {
        if (this.f34496h != null) {
            return this.f34497i;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    public final Object mo5977i() {
        if (this.f34496h == null) {
            return this.f34497i[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    public final boolean mo5978j() {
        return this.f34494f != null && this.f34494f.mo5997b("/forced") == Boolean.TRUE;
    }

    public final C7042l mo5979k() {
        return this.f34494f != null ? this.f34494f : C7042l.f34548c;
    }

    private final void m31983b(String str, Object obj) {
        if (this.f34494f == null) {
            this.f34494f = new C7062j();
        }
        C7062j c7062j = this.f34494f;
        int a = c7062j.m32143a(str);
        if (a == -1) {
            c7062j.m32145a(str, obj);
        } else {
            c7062j.f34570a[(a * 2) + 1] = C7011b.m31954a(obj, "metadata value");
        }
    }

    private final void m31984c(String str, Object obj) {
        if (this.f34494f == null) {
            this.f34494f = new C7062j();
        }
        this.f34494f.m32145a(str, obj);
    }

    private final void m31981a(String str) {
        if (this.f34494f != null) {
            C7062j c7062j = this.f34494f;
            int a = c7062j.m32143a(str);
            if (a >= 0) {
                int i = a * 2;
                a = i + 2;
                while (a < c7062j.f34571b * 2) {
                    Object obj = c7062j.f34570a[a];
                    if (!obj.equals(str)) {
                        c7062j.f34570a[i] = obj;
                        c7062j.f34570a[i + 1] = c7062j.f34570a[a + 1];
                        i += 2;
                    }
                    a += 2;
                }
                c7062j.f34571b -= (a - i) >> 1;
                while (i < a) {
                    int i2 = i + 1;
                    c7062j.f34570a[i] = null;
                    i = i2;
                }
            }
        }
    }

    private final boolean m31985l() {
        Object c7063k;
        int i;
        C7047s c;
        if (this.f34495g == null) {
            this.f34495g = (C7065m) C7011b.m31954a(mo6007b().f34486a.mo5981a(C7015i.class, 1), "logger backend must not return a null LogSite");
        }
        if (this.f34495g != C7065m.f34577a) {
            C7065m c7065m = this.f34495g;
            String str = (String) mo5979k().mo5997b("/for unique key");
            if (str != null) {
                c7063k = new C7063k(this.f34495g, str);
            } else {
                C7065m c7065m2 = c7065m;
            }
        } else {
            c7063k = null;
        }
        if (!(this.f34494f == null || c7063k == null)) {
            Integer num = (Integer) this.f34494f.mo5997b("/ratelimit count");
            C7075q c7075q = (C7075q) this.f34494f.mo5997b("/ratelimit period");
            C7076r c7076r = C7068p.f34583a;
            C7068p c7068p = (C7068p) c7076r.f34588a.get(c7063k);
            if (c7068p == null) {
                C7068p c7068p2 = new C7068p();
                c7068p = (C7068p) c7076r.f34588a.putIfAbsent(c7063k, c7068p2);
                if (c7068p == null) {
                    c7068p = c7068p2;
                }
            }
            if (num != null) {
                if ((c7068p.f34584b.getAndIncrement() % ((long) num.intValue()) == 0 ? 1 : 0) == 0) {
                    i = 0;
                    if (i == 0) {
                        return false;
                    }
                    c = C7023n.m32037c();
                    if (!c.f34558b.isEmpty()) {
                        m31984c("/tags", c);
                    }
                    return true;
                }
            }
            if (c7075q != null) {
                c7068p.f34585c.get();
                throw new NoSuchMethodError();
            }
        }
        C7077u c7077u = (C7077u) mo5979k().mo5997b("/stack size");
        if (c7077u != null) {
            m31981a("/stack size");
            m31983b("/cause", new LogSiteStackTrace((Throwable) mo5979k().mo5997b("/cause"), c7077u, C7010a.m31953a(C7015i.class, new Throwable(), c7077u.f34594e)));
        }
        i = 1;
        if (i == 0) {
            return false;
        }
        c = C7023n.m32037c();
        if (c.f34558b.isEmpty()) {
            m31984c("/tags", c);
        }
        return true;
    }

    private final void m31982a(String str, Object... objArr) {
        this.f34497i = objArr;
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof C7061h) {
                objArr[i] = ((C7061h) objArr[i]).m32141a();
            }
        }
        if (str != f34491c) {
            this.f34496h = new C7054z(mo5980a(), str);
        }
        C7009a b = mo6007b();
        try {
            b.f34486a.mo5984a((C7013i) this);
        } catch (RuntimeException e) {
            try {
                b.f34486a.mo5983a(e, (C7013i) this);
            } catch (LoggingException e2) {
                throw e2;
            } catch (Throwable e3) {
                Throwable th = e3;
                PrintStream printStream = System.err;
                String str2 = "logging error: ";
                String valueOf = String.valueOf(th.getMessage());
                printStream.println(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                C6918a.m31585a(th, System.err);
            }
        }
    }

    public final C7014s mo5957a(String str, String str2, int i, String str3) {
        this.f34495g = C7065m.m32148a(str, str2, i, str3);
        return mo6008c();
    }

    public final C7014s mo5958a(Throwable th) {
        m31983b("/cause", th);
        return mo6008c();
    }

    public final void mo5959a(Object obj) {
        if (m31985l()) {
            m31982a(f34491c, obj);
        }
    }

    public final void mo5965a(String str, Object obj) {
        if (m31985l()) {
            m31982a(str, obj);
        }
    }

    public final void mo5967a(String str, Object obj, Object obj2) {
        if (m31985l()) {
            m31982a(str, obj, obj2);
        }
    }

    public final void mo5968a(String str, Object obj, Object obj2, Object obj3) {
        if (m31985l()) {
            m31982a(str, obj, obj2, obj3);
        }
    }

    public final void mo5969a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (m31985l()) {
            m31982a(str, obj, obj2, obj3, obj4);
        }
    }

    public final void mo5970a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m31985l()) {
            m31982a(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    public final void mo5971a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (m31985l()) {
            m31982a(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    public final void mo5960a(String str, int i) {
        if (m31985l()) {
            m31982a(str, Integer.valueOf(i));
        }
    }

    public final void mo5963a(String str, long j) {
        if (m31985l()) {
            m31982a(str, Long.valueOf(j));
        }
    }

    public final void mo5966a(String str, Object obj, long j) {
        if (m31985l()) {
            m31982a(str, obj, Long.valueOf(j));
        }
    }

    public final void mo5962a(String str, int i, Object obj) {
        if (m31985l()) {
            m31982a(str, Integer.valueOf(i), obj);
        }
    }

    public final void mo5961a(String str, int i, int i2) {
        if (m31985l()) {
            m31982a(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void mo5964a(String str, long j, long j2) {
        if (m31985l()) {
            m31982a(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
