package com.google.android.finsky.dy;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.HashMap;

final class C2943y implements ao {
    public C1201d f15562a;
    public C1202e f15563b;

    C2943y() {
    }

    public final C1201d mo3204a() {
        if (this.f15562a == null) {
            this.f15562a = new C1201d("package_verdict_cache", "TEXT", new HashMap());
        }
        return this.f15562a;
    }

    public final C1202e mo3205a(C1203f c1203f, C1198a c1198a) {
        if (this.f15563b == null) {
            this.f15563b = c1203f.mo1517a(c1198a, "package_verdict_cache", new C2944z(), new aa(), new ab(), 0, null);
        }
        return this.f15563b;
    }
}
