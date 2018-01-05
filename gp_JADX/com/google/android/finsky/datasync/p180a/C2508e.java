package com.google.android.finsky.datasync.p180a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.ai;
import java.util.List;

public final class C2508e extends C2503a {
    public final C2910a f13496g;

    C2508e(List list, long j, C2910a c2910a, C2531s c2531s, C1461c c1461c, ai aiVar) {
        super(list, null, j, c2531s, c1461c, aiVar);
        this.f13496g = c2910a;
    }

    protected final void mo2923a(String str) {
    }

    public final boolean mo2924a() {
        return true;
    }

    public final boolean mo2925b() {
        for (String c : this.b) {
            if (this.f13496g.m15192c(c)) {
                return false;
            }
        }
        return true;
    }

    public final void mo2926c() {
        for (String str : this.b) {
            if (!m13411d()) {
                new Handler(Looper.getMainLooper()).post(new C2509f(this, str));
            } else {
                return;
            }
        }
    }
}
