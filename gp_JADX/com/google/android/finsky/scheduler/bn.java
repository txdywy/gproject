package com.google.android.finsky.scheduler;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.Collections;

public final class bn {
    public final C1198a f20288a;
    public final C1202e f20289b;
    public final C1202e f20290c;

    public bn(C1203f c1203f) {
        C1201d c1201d = new C1201d("wake_up_end", "INTEGER", Collections.emptyMap());
        C1201d c1201d2 = new C1201d("wake_up_start", "INTEGER", Collections.emptyMap());
        this.f20288a = c1203f.mo1516a("scheduler_logging_store.db", new C1201d[]{c1201d, c1201d2});
        this.f20289b = c1203f.mo1517a(this.f20288a, "wake_up_end", new bo(), new bp(), new bq(), 0, null);
        this.f20290c = c1203f.mo1517a(this.f20288a, "wake_up_start", new br(), new bs(), new bt(), 0, null);
    }
}
