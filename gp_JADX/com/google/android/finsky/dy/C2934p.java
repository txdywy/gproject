package com.google.android.finsky.dy;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.HashMap;

public final class C2934p implements ao {
    public C1201d f15557a;
    public C1202e f15558b;

    public final C1201d mo3204a() {
        if (this.f15557a == null) {
            this.f15557a = new C1201d("package_installation_state", "TEXT", new HashMap());
        }
        return this.f15557a;
    }

    public final C1202e mo3205a(C1203f c1203f, C1198a c1198a) {
        if (this.f15558b == null) {
            this.f15558b = c1203f.mo1517a(c1198a, "package_installation_state", new C2935q(), new C2936r(), new C2937s(), 0, null);
        }
        return this.f15558b;
    }
}
