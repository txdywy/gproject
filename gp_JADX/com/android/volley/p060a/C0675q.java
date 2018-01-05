package com.android.volley.p060a;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0700r;
import java.util.HashMap;

public final class C0675q {
    public final C0700r f4095a;
    public int f4096b = 100;
    public final C0680v f4097c;
    public final HashMap f4098d = new HashMap();
    public final HashMap f4099e = new HashMap();
    public final Handler f4100f = new Handler(Looper.getMainLooper());
    public Runnable f4101g;

    public C0675q(C0700r c0700r, C0680v c0680v) {
        this.f4095a = c0700r;
        this.f4097c = c0680v;
    }

    final void m4466a(String str, C0679u c0679u) {
        this.f4099e.put(str, c0679u);
        if (this.f4101g == null) {
            this.f4101g = new C0678t(this);
            this.f4100f.postDelayed(this.f4101g, (long) this.f4096b);
        }
    }
}
