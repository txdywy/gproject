package com.google.common.flogger.p422a;

import com.google.common.flogger.backend.C7033a;
import com.google.common.flogger.backend.C7034b;
import com.google.common.flogger.backend.C7035c;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public final class C7004a extends C7003d {
    public static final C7034b f34446a = C7034b.m32072a();
    public static final MessageFormat f34447b = new MessageFormat("{0}", Locale.ROOT);
    public static final C7004a[] f34448c = new C7004a[10];

    public static C7004a m31940a(int i) {
        if (i < 10) {
            return f34448c[i];
        }
        return new C7004a(i);
    }

    private C7004a(int i) {
        super(C7034b.f34536b, i);
    }

    protected final void mo5956a(C7007e c7007e, Object obj) {
        if (C7035c.f34543d.mo5993a(obj)) {
            c7007e.mo6001a(obj, C7033a.DECIMAL, f34446a);
        } else if (C7035c.f34544e.mo5993a(obj)) {
            c7007e.mo6001a(obj, C7033a.FLOAT, f34446a);
        } else if (obj instanceof Date) {
            c7007e.mo6002a(((MessageFormat) f34447b.clone()).format(new Object[]{obj}, new StringBuffer(), null).toString());
        } else {
            c7007e.mo6001a(obj, C7033a.STRING, this.f34445e);
        }
    }

    static {
        for (int i = 0; i < 10; i++) {
            f34448c[i] = new C7004a(i);
        }
    }
}
