package com.google.common.flogger.backend;

import com.google.common.flogger.p423b.C7011b;
import com.google.common.flogger.parser.C7069f;

public final class C7054z {
    public final C7069f f34566a;
    public final String f34567b;

    public C7054z(C7069f c7069f, String str) {
        this.f34566a = (C7069f) C7011b.m31954a(c7069f, "parser");
        this.f34567b = (String) C7011b.m31954a(str, "message");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7054z)) {
            return false;
        }
        C7054z c7054z = (C7054z) obj;
        if (this.f34566a.equals(c7054z.f34566a) && this.f34567b.equals(c7054z.f34567b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34566a.hashCode() ^ this.f34567b.hashCode();
    }
}
