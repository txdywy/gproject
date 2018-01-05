package com.google.android.finsky.bz;

import android.annotation.TargetApi;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.updatechecker.C4640d;

@TargetApi(21)
public class C2236c extends ah {
    public C2471a f11141a;
    public C4640d f11142c;
    public C2206c f11143d;
    public C1627b f11144e;

    public final boolean mo1168a(C4026d c4026d) {
        ((C1362b) C3947d.m18649a(C1362b.class)).mo1778a(this);
        this.f11143d.mo2815a(new C2237d(this, this.f11141a.m13184a("maintenance_window")));
        return true;
    }

    protected final boolean k_(int i) {
        return false;
    }
}
