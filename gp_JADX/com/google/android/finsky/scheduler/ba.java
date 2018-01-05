package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4027e;
import com.google.android.finsky.utils.C4678i;
import java.lang.reflect.InvocationTargetException;

public final class ba {
    public final ak f20259a;
    public final C4817d f20260b;
    public final int f20261c;

    ba(C4817d c4817d, ak akVar, int i) {
        this.f20259a = akVar;
        this.f20260b = c4817d;
        this.f20261c = i;
    }

    public final C4809e m18888a(int i, String str, Class cls, C4023a c4023a, C4025c c4025c) {
        C4809e a = m18886a(this.f20261c, c4023a, cls);
        if (a != null) {
            return a;
        }
        return this.f20259a.m18810a(new C4027e().m18864a(i).m18869a(str).m18871b(this.f20261c).m18872b(cls.getName()).m18866a(c4023a).m18867a(c4025c).m18865a(C4678i.m21812a()).m18863a());
    }

    public final C4809e m18887a(int i) {
        return this.f20259a.m18817b(this.f20261c, i);
    }

    public final boolean m18889b(int i) {
        return this.f20259a.m18814a(this.f20261c, i);
    }

    private final C4809e m18886a(int i, C4023a c4023a, Class cls) {
        Throwable e;
        if (c4023a.f20246a.f20159g == 1) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return this.f20260b.mo4402a(new IllegalArgumentException("Priority high reserved for DailyHygiene/SelfUpdate"));
            }
        }
        try {
            Class.forName(cls.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            return this.f20260b.mo4402a(new IllegalArgumentException("JobComponent class requires a nullary constructor", e));
        } catch (InstantiationException e3) {
            e = e3;
            return this.f20260b.mo4402a(new IllegalArgumentException("JobComponent class requires a nullary constructor", e));
        } catch (IllegalAccessException e4) {
            e = e4;
            return this.f20260b.mo4402a(new IllegalArgumentException("JobComponent class requires a nullary constructor", e));
        } catch (NoSuchMethodException e5) {
            e = e5;
            return this.f20260b.mo4402a(new IllegalArgumentException("JobComponent class requires a nullary constructor", e));
        } catch (InvocationTargetException e6) {
            e = e6;
            return this.f20260b.mo4402a(new IllegalArgumentException("JobComponent class requires a nullary constructor", e));
        }
    }
}
