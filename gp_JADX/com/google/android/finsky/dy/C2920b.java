package com.google.android.finsky.dy;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.HashMap;

public final class C2920b implements ao {
    public C1201d f15543a;
    public C1202e f15544b;

    public final C1201d mo3204a() {
        if (this.f15543a == null) {
            this.f15543a = new C1201d("apk_info", "TEXT", new HashMap());
        }
        return this.f15543a;
    }

    public final C1202e mo3205a(C1203f c1203f, C1198a c1198a) {
        if (this.f15544b == null) {
            this.f15544b = c1203f.mo1517a(c1198a, "apk_info", new C2921c(), new C2922d(), new C2923e(), 0, null);
        }
        return this.f15544b;
    }
}
