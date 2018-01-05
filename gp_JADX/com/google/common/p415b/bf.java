package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class bf implements Iterator {
    public Iterator f34301a;
    public Iterator f34302b = be.f34298c;
    public Iterator f34303c;
    public Deque f34304d;

    bf(Iterator it) {
        this.f34303c = (Iterator) C6937m.m31623a((Object) it);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.f34302b;
        r0 = com.google.common.p414a.C6937m.m31623a(r0);
        r0 = (java.util.Iterator) r0;
        r0 = r0.hasNext();
        if (r0 != 0) goto L_0x0087;
    L_0x000e:
        r0 = r3.f34303c;
        if (r0 == 0) goto L_0x001a;
    L_0x0012:
        r0 = r3.f34303c;
        r0 = r0.hasNext();
        if (r0 != 0) goto L_0x003a;
    L_0x001a:
        r0 = r3.f34304d;
        if (r0 == 0) goto L_0x0031;
    L_0x001e:
        r0 = r3.f34304d;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r0 = r3.f34304d;
        r0 = r0.removeFirst();
        r0 = (java.util.Iterator) r0;
        r3.f34303c = r0;
        goto L_0x000e;
    L_0x0031:
        r0 = 0;
    L_0x0032:
        r3.f34303c = r0;
        r0 = r3.f34303c;
        if (r0 != 0) goto L_0x003d;
    L_0x0038:
        r0 = 0;
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = r3.f34303c;
        goto L_0x0032;
    L_0x003d:
        r0 = r3.f34303c;
        r0 = r0.next();
        r0 = (java.util.Iterator) r0;
        r3.f34302b = r0;
        r0 = r3.f34302b;
        r0 = r0 instanceof com.google.common.p415b.bf;
        if (r0 == 0) goto L_0x0000;
    L_0x004d:
        r0 = r3.f34302b;
        r0 = (com.google.common.p415b.bf) r0;
        r1 = r0.f34302b;
        r3.f34302b = r1;
        r1 = r3.f34304d;
        if (r1 != 0) goto L_0x0060;
    L_0x0059:
        r1 = new java.util.ArrayDeque;
        r1.<init>();
        r3.f34304d = r1;
    L_0x0060:
        r1 = r3.f34304d;
        r2 = r3.f34303c;
        r1.addFirst(r2);
        r1 = r0.f34304d;
        if (r1 == 0) goto L_0x0081;
    L_0x006b:
        r1 = r0.f34304d;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0081;
    L_0x0073:
        r2 = r3.f34304d;
        r1 = r0.f34304d;
        r1 = r1.removeLast();
        r1 = (java.util.Iterator) r1;
        r2.addFirst(r1);
        goto L_0x006b;
    L_0x0081:
        r0 = r0.f34303c;
        r3.f34303c = r0;
        goto L_0x0000;
    L_0x0087:
        r0 = 1;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.bf.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.f34301a = this.f34302b;
            return this.f34302b.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        C6937m.m31631a(this.f34301a != null, (Object) "no calls to next() since the last call to remove()");
        this.f34301a.remove();
        this.f34301a = null;
    }
}
