package com.google.common.flogger;

import com.google.common.flogger.backend.C7017j;
import com.google.common.flogger.backend.C7023n;
import java.util.logging.Level;

public final class C7055c extends C7009a {
    public static final C7060f f34568b = new C7060f();

    @Deprecated
    public static C7055c m32122a(String str) {
        String str2 = "injected class name is empty";
        if ((!str.isEmpty() ? 1 : null) != null) {
            return new C7055c(C7023n.m32034a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException(str2);
    }

    private C7055c(C7017j c7017j) {
        super(c7017j);
    }

    public final /* synthetic */ C7014s mo6006a(Level level) {
        boolean a = this.f34486a.mo5985a(level);
        boolean a2 = C7023n.m32036a(this.f34486a.mo5982a(), level, a);
        if (a || a2) {
            return new C7057e(this, level, a2);
        }
        return f34568b;
    }
}
