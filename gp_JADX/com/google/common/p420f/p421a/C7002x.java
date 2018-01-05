package com.google.common.p420f.p421a;

import java.util.Set;

final class C7002x extends C7000v {
    C7002x() {
    }

    final void mo5955a(C6978u c6978u, Set set) {
        synchronized (c6978u) {
            if (c6978u.seenExceptions == null) {
                c6978u.seenExceptions = set;
            }
        }
    }

    final int mo5954a(C6978u c6978u) {
        int i;
        synchronized (c6978u) {
            c6978u.remaining--;
            i = c6978u.remaining;
        }
        return i;
    }
}
