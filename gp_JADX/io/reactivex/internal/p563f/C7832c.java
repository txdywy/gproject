package io.reactivex.internal.p563f;

import android.support.v7.widget.eq;
import io.reactivex.internal.p556c.C7792c;
import io.reactivex.internal.util.C7864b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class C7832c implements C7792c {
    public static final int f40364a = Integer.getInteger("jctools.spsc.max.lookahead.step", eq.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();
    public static final Object f40365j = new Object();
    public final AtomicLong f40366b = new AtomicLong();
    public int f40367c;
    public long f40368d;
    public final int f40369e;
    public AtomicReferenceArray f40370f;
    public final int f40371g;
    public AtomicReferenceArray f40372h;
    public final AtomicLong f40373i = new AtomicLong();

    public C7832c(int i) {
        int a = C7864b.m37738a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a + 1);
        this.f40370f = atomicReferenceArray;
        this.f40369e = i2;
        this.f40367c = Math.min(a / 4, f40364a);
        this.f40372h = atomicReferenceArray;
        this.f40371g = i2;
        this.f40368d = (long) (i2 - 1);
        m37667a(0);
    }

    public final boolean mo6537a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f40370f;
        long j = this.f40366b.get();
        int i = this.f40369e;
        int i2 = ((int) j) & i;
        if (j < this.f40368d) {
            return m37668a(atomicReferenceArray, obj, j, i2);
        }
        int i3 = this.f40367c;
        if (atomicReferenceArray.get(((int) (((long) i3) + j)) & i) == null) {
            this.f40368d = (((long) i3) + j) - 1;
            return m37668a(atomicReferenceArray, obj, j, i2);
        } else if (atomicReferenceArray.get(((int) (j + 1)) & i) == null) {
            return m37668a(atomicReferenceArray, obj, j, i2);
        } else {
            long j2 = (long) i;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f40370f = atomicReferenceArray2;
            this.f40368d = (j2 + j) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f40365j);
            m37667a(j + 1);
            return true;
        }
    }

    private final boolean m37668a(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        m37667a(1 + j);
        return true;
    }

    public final Object mo6538b() {
        AtomicReferenceArray atomicReferenceArray = this.f40372h;
        long j = this.f40373i.get();
        int i = ((int) j) & this.f40371g;
        Object obj = atomicReferenceArray.get(i);
        Object obj2 = obj == f40365j ? 1 : null;
        if (obj != null && obj2 == null) {
            atomicReferenceArray.lazySet(i, null);
            m37669b(j + 1);
            return obj;
        } else if (obj2 == null) {
            return null;
        } else {
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
            this.f40372h = atomicReferenceArray2;
            obj2 = atomicReferenceArray2.get(i);
            if (obj2 != null) {
                atomicReferenceArray2.lazySet(i, null);
                m37669b(j + 1);
            }
            return obj2;
        }
    }

    public final void mo6540d() {
        while (true) {
            if (mo6538b() == null && mo6539c()) {
                return;
            }
        }
    }

    public final boolean mo6539c() {
        return this.f40366b.get() == this.f40373i.get();
    }

    private final void m37667a(long j) {
        this.f40366b.lazySet(j);
    }

    private final void m37669b(long j) {
        this.f40373i.lazySet(j);
    }
}
