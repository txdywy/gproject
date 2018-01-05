package org.keyczar;

import org.json.JSONObject;
import org.keyczar.p569a.C7981c;

public final class C8006l {
    public boolean f41034a = false;
    public C7981c f41035b = C7981c.ACTIVE;
    public int f41036c = 0;

    public C8006l(int i, C7981c c7981c, boolean z) {
        this.f41036c = i;
        this.f41035b = c7981c;
        this.f41034a = z;
    }

    public final String toString() {
        return m38231a().toString();
    }

    final JSONObject m38231a() {
        try {
            return new JSONObject().put("versionNumber", this.f41036c).put("status", this.f41035b != null ? this.f41035b.name() : null).put("exportable", this.f41034a);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8006l)) {
            return false;
        }
        if (this.f41036c == ((C8006l) obj).f41036c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41036c;
    }
}
