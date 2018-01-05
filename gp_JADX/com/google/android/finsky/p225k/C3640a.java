package com.google.android.finsky.p225k;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.p111d.C2495w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C3640a {
    public final Map f18006a = new ConcurrentHashMap();
    public final List f18007b = new ArrayList();
    public final Handler f18008c;
    public ThreadPoolExecutor f18009d;
    public final boolean f18010e;

    public C3640a() {
        int intValue = ((Integer) C0955b.hA.m28964b()).intValue();
        this.f18009d = new ThreadPoolExecutor(intValue, intValue, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f18008c = new Handler(Looper.getMainLooper());
        this.f18010e = true;
    }

    public final boolean m17237a() {
        return this.f18006a != null && this.f18006a.size() > 0;
    }

    public final void m17236a(C3641b c3641b) {
        this.f18007b.add(c3641b);
    }

    public final void m17238b(C3641b c3641b) {
        this.f18007b.remove(c3641b);
    }

    public final void m17235a(C2824a c2824a, C2495w c2495w, List list) {
        for (Document cf : list) {
            String cf2 = cf.cf();
            C3644e c3644e = (C3644e) this.f18006a.get(cf2);
            if (c3644e != null) {
                if ((c3644e.f18018a < System.currentTimeMillis() - ((Long) C0955b.hB.m28964b()).longValue() ? 1 : null) == null) {
                }
            }
            this.f18009d.execute(new C3643d(this, c2824a, c2495w, cf2));
        }
    }

    public final long m17234a(String str) {
        C3644e c3644e = (C3644e) this.f18006a.get(str);
        if (c3644e == null) {
            return -1;
        }
        return c3644e.f18019b;
    }
}
