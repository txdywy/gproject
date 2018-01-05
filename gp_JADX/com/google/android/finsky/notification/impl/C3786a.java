package com.google.android.finsky.notification.impl;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3784h;
import java.util.HashSet;
import java.util.Set;

public final class C3786a implements C3784h, C3667j {
    public final Handler f19006b = new Handler(Looper.getMainLooper());
    public final Set f19007c = new HashSet();
    public final C3784h f19008d;
    public final C3784h f19009e;

    public C3786a(C3784h c3784h, C3784h c3784h2) {
        this.f19008d = c3784h;
        this.f19009e = c3784h2;
    }

    public final void mo3577a(int i) {
        this.f19006b.post(new C3787b(this));
    }

    public final void mo3757a(C3667j c3667j) {
        this.f19007c.add(c3667j);
    }

    public final void mo3758b(C3667j c3667j) {
        this.f19007c.remove(c3667j);
    }

    public final int mo3756a() {
        return this.f19008d.mo3756a() + this.f19009e.mo3756a();
    }
}
