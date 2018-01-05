package com.google.common.flogger.backend.p424a;

import com.google.common.flogger.C7065m;
import com.google.common.flogger.backend.C7013i;
import com.google.common.flogger.backend.C7042l;
import com.google.common.flogger.backend.C7046q;
import com.google.common.flogger.backend.C7054z;
import java.util.logging.Level;

final class C7019b implements C7013i {
    public final String f34500a;
    public final C7013i f34501b;

    private static String m32021a(RuntimeException runtimeException, C7013i c7013i) {
        int i = 0;
        StringBuilder append = new StringBuilder("LOGGING ERROR: ").append(runtimeException.getMessage()).append("\n  original message: ");
        if (c7013i.mo5975g() == null) {
            append.append(c7013i.mo5977i());
        } else {
            append.append(c7013i.mo5975g().f34567b);
            append.append("\n  original arguments:");
            for (Object a : c7013i.mo5976h()) {
                append.append("\n    ").append(C7046q.m32101a(a));
            }
        }
        C7042l k = c7013i.mo5979k();
        if (k.mo5994a() > 0) {
            append.append("\n  metadata:");
            while (i < k.mo5994a()) {
                append.append("\n    ").append(C7046q.m32100a(k, i));
                i++;
            }
        }
        append.append("\n  level: ").append(c7013i.mo5972d());
        append.append("\n  timestamp (micros): ").append(c7013i.mo5973e());
        append.append("\n  class: ").append(c7013i.mo5974f().mo6009a());
        append.append("\n  method: ").append(c7013i.mo5974f().mo6010b());
        append.append("\n  line number: ").append(c7013i.mo5974f().mo6011c());
        return append.toString();
    }

    C7019b(RuntimeException runtimeException, C7013i c7013i) {
        this.f34500a = C7019b.m32021a(runtimeException, c7013i);
        this.f34501b = c7013i;
    }

    public final Level mo5972d() {
        return this.f34501b.mo5972d().intValue() > Level.WARNING.intValue() ? this.f34501b.mo5972d() : Level.WARNING;
    }

    public final long mo5973e() {
        return this.f34501b.mo5973e();
    }

    public final C7065m mo5974f() {
        return this.f34501b.mo5974f();
    }

    public final C7042l mo5979k() {
        return C7042l.f34548c;
    }

    public final boolean mo5978j() {
        return false;
    }

    public final C7054z mo5975g() {
        return null;
    }

    public final Object[] mo5976h() {
        throw new IllegalStateException();
    }

    public final Object mo5977i() {
        return this.f34500a;
    }
}
