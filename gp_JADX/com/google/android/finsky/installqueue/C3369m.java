package com.google.android.finsky.installqueue;

import com.google.android.finsky.installer.p208b.p209a.C3311a;
import com.google.android.finsky.installer.p208b.p209a.C3313c;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installer.p208b.p209a.C3315e;
import com.google.android.finsky.utils.C4672c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.j;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C3369m {
    public static final List f17271a = C4672c.m21803a(new Integer[]{Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(4)});
    public static final List f17272b = C4672c.m21803a(new Integer[]{Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(9)});
    public final C3315e f17273c;
    public final InstallRequest f17274d;

    public C3369m(String str, C3314d c3314d, int i, int i2, C3371p c3371p) {
        this.f17273c = new C3315e();
        C3315e c3315e = this.f17273c;
        if (c3314d == null) {
            c3314d = C3368l.m16818a(str);
        }
        c3315e.f17152c = c3314d;
        this.f17274d = new InstallRequest(this.f17273c.f17152c);
        this.f17273c.m16668a(i);
        this.f17273c.f17154e = new C3313c();
        this.f17273c.f17154e.m16656a(i2);
        this.f17273c.f17156g = new C3311a();
        if (c3371p != null) {
            this.f17273c.f17156g.m16646a(c3371p.f17279d);
            this.f17273c.f17156g.m16647a(c3371p.f17277b);
            this.f17273c.f17156g.m16651b(c3371p.f17278c);
            this.f17273c.f17156g.f17116e = (String[]) new ArrayList(c3371p.f17280e).toArray(new String[0]);
        }
    }

    public C3369m(C3315e c3315e) {
        this.f17273c = c3315e;
        this.f17274d = new InstallRequest(this.f17273c.f17152c);
        if (this.f17273c.f17156g == null) {
            this.f17273c.f17156g = new C3311a();
        }
    }

    public final String m16819a() {
        return this.f17273c.f17152c.f17133c;
    }

    public final int m16820b() {
        return this.f17273c.f17154e.f17130b;
    }

    public final long m16821c() {
        return this.f17273c.f17156g.f17113b;
    }

    public final long m16822d() {
        return this.f17273c.f17156g.f17114c;
    }

    public final String[] m16823e() {
        return this.f17273c.f17156g.f17116e;
    }

    public final boolean m16824f() {
        return f17271a.contains(Integer.valueOf(this.f17273c.f17153d));
    }

    public final boolean m16825g() {
        return f17272b.contains(Integer.valueOf(this.f17273c.f17153d));
    }

    public final String toString() {
        return j.a(this.f17273c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17273c.f17152c.f17133c, Integer.valueOf(this.f17273c.f17153d), Integer.valueOf(this.f17273c.f17154e.f17130b)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3369m)) {
            return false;
        }
        return C0757i.m4908a(this.f17273c, ((C3369m) obj).f17273c);
    }

    static {
        C4672c.m21803a(new Integer[]{Integer.valueOf(HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA), Integer.valueOf(196)});
    }
}
