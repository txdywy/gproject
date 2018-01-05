package com.google.common.p420f.p421a;

import com.google.common.p415b.ar;
import com.google.common.p415b.ce;
import java.util.Set;
import java.util.logging.Logger;

class C6981r extends C6980j {
    public static final Logger f34383e = Logger.getLogger(C6981r.class.getName());
    public C6979s f34384f;

    C6981r() {
    }

    protected final void mo5933b() {
        super.mo5933b();
        C6979s c6979s = this.f34384f;
        if (c6979s != null) {
            this.f34384f = null;
            ar arVar = c6979s.f34377a;
            boolean a = m31839a();
            if (a) {
                C6979s.m31847d();
            }
            if (((arVar != null ? 1 : 0) & isCancelled()) != 0) {
                ce ceVar = (ce) arVar.iterator();
                while (ceVar.hasNext()) {
                    ((au) ceVar.next()).cancel(a);
                }
            }
        }
    }

    protected final String mo5934c() {
        C6979s c6979s = this.f34384f;
        if (c6979s == null) {
            return null;
        }
        ar arVar = c6979s.f34377a;
        if (arVar == null) {
            return null;
        }
        String valueOf = String.valueOf(arVar);
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("futures=[").append(valueOf).append("]").toString();
    }

    static boolean m31858a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
