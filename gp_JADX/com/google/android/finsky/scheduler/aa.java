package com.google.android.finsky.scheduler;

import android.support.v4.p037h.C0305a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.scheduler.p238b.C4026d;
import java.util.Map;

public final class aa {
    public final C1202e f20194a;
    public final C1198a f20195b;
    public final C4817d f20196c;

    public aa(C1203f c1203f, C4817d c4817d) {
        this.f20196c = c4817d;
        Map c0305a = new C0305a(3);
        c0305a.put("job_id", "INTEGER");
        c0305a.put("consumer_id", "INTEGER");
        c0305a.put("is_running", "INTEGER");
        C1201d c1201d = new C1201d("jobs", "INTEGER", c0305a);
        this.f20195b = c1203f.mo1516a("scheduler", new C1201d[]{c1201d});
        this.f20194a = c1203f.mo1517a(this.f20195b, "jobs", new ab(), new ac(), new ad(), ((Integer) C0955b.iQ.m28964b()).intValue(), new ae());
    }

    static long m18791a(int i, int i2) {
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    static long m18792a(C4026d c4026d) {
        return m18791a(c4026d.f20249a.f20176d, c4026d.f20249a.f20174b);
    }
}
