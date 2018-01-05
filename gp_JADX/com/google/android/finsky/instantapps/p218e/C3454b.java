package com.google.android.finsky.instantapps.p218e;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0305a;
import android.util.LruCache;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

final class C3454b implements C3453i {
    public final Executor f17626a;
    public final List f17627b;
    public final C3460k f17628c;
    public Handler f17629d;
    public final Map f17630e = Collections.synchronizedMap(new C0305a());
    public final LruCache f17631f = new LruCache(20);

    C3454b(Executor executor, List list, C3460k c3460k) {
        this.f17626a = executor;
        this.f17627b = list;
        this.f17628c = c3460k;
        this.f17629d = new Handler(Looper.getMainLooper());
    }

    public final void mo3530a(List list, C3426j c3426j) {
        for (String str : list) {
            if (this.f17630e.containsKey(C3454b.m17012a(str))) {
                m17014a(str, c3426j);
            } else {
                this.f17626a.execute(new C3455c(this, str, c3426j));
            }
            if (this.f17631f.get(C3454b.m17013b(str)) != null) {
                m17016b(str, c3426j);
            } else {
                this.f17626a.execute(new C3456d(this, str, c3426j));
            }
        }
    }

    final void m17014a(String str, C3426j c3426j) {
        this.f17629d.post(new C3457e(this, c3426j, str));
    }

    final void m17016b(String str, C3426j c3426j) {
        this.f17629d.post(new C3458f(this, c3426j, str));
    }

    static String m17012a(String str) {
        return String.valueOf(str).concat("-title");
    }

    static String m17013b(String str) {
        return String.valueOf(str).concat("-icon");
    }
}
