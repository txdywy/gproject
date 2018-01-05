package com.google.android.finsky.dy;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.HashMap;

public final class C2938t implements ao {
    public C1201d f15559a;
    public C1202e f15560b;

    public final C1201d mo3204a() {
        if (this.f15559a == null) {
            this.f15559a = new C1201d("package_uninstallations", "TEXT", new HashMap());
        }
        return this.f15559a;
    }

    public final C1202e mo3205a(C1203f c1203f, C1198a c1198a) {
        if (this.f15560b == null) {
            this.f15560b = c1203f.mo1517a(c1198a, "package_uninstallations", new C2939u(), new C2940v(), new C2941w(), 0, null);
        }
        return this.f15560b;
    }
}
