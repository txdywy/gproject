package com.google.android.finsky.dy;

import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import java.util.HashMap;
import java.util.Map;

public final class C2928j implements ao {
    public C1201d f15553a;
    public C1202e f15554b;

    public final C1201d mo3204a() {
        if (this.f15553a == null) {
            Map hashMap = new HashMap();
            hashMap.put("sha256", "TEXT");
            this.f15553a = new C1201d("installation_attempts", "TEXT", hashMap);
        }
        return this.f15553a;
    }

    public final C1202e mo3205a(C1203f c1203f, C1198a c1198a) {
        if (this.f15554b == null) {
            this.f15554b = c1203f.mo1517a(c1198a, "installation_attempts", new C2929k(), new C2930l(), new C2931m(), 0, new C2932n());
        }
        return this.f15554b;
    }
}
