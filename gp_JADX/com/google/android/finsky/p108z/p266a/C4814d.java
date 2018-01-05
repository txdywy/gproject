package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

final class C4814d extends C4810i {
    public final Iterable f25092a;
    public final AtomicInteger f25093b;

    C4814d(Iterable iterable, Executor executor) {
        super(new C4815e(), executor);
        C0978f c4816f = new C4816f(this);
        this.f25092a = iterable;
        int i = 0;
        Iterator it = this.f25092a.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
        }
        if (i <= 0) {
            set(Collections.emptyList());
        }
        this.f25093b = new AtomicInteger(i);
        for (C4809e a : this.f25092a) {
            a.mo4398a(c4816f);
        }
    }

    public final void run() {
        m22599a();
    }

    final void m22599a() {
        if (!isDone() && this.f25093b.decrementAndGet() == 0) {
            List arrayList = new ArrayList();
            for (C4809e c4809e : this.f25092a) {
                try {
                    if (c4809e.isCancelled()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(c4809e.get());
                    }
                } catch (InterruptedException e) {
                    arrayList.add(null);
                } catch (ExecutionException e2) {
                    arrayList.add(null);
                }
            }
            set(arrayList);
        }
    }
}
