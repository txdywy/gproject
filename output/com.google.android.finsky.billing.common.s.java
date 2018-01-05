package com.google.android.finsky.billing.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public final class com.google.android.finsky.billing.common.s extends Fragment
{

    public int af;
    public int ag;
    public com.google.android.finsky.billing.common.t h;
    public boolean i;
    public int l;

    s() {
        Fragment();
        this.l = 0;
        this.ag = 1;
    }

    private final void W() {
        if (this.h != 0)
            this.h.a(this);
    }

    public void a(Bundle p0) {
        this.l = p0.getInt("SidecarFragment.state");
        this.af = p0.getInt("SidecarFragment.substate");
        this.ag = p0.getInt("SidecarFragment.stateInstance");
        if (this.l == 1) {
            FinskyLog.a("Restoring after serialization in RUNNING, resetting to INIT.", new Object[0]);
            this.b(0, 0);
        }
    }

    public final void a(com.google.android.finsky.billing.common.t p0) {
        this.h = p0;
        if (this.h != 0 && this.i != 0)
            this.W();
    }

    public final void b(int p0, int p1) {
        com.google.android.finsky.utils.bb.a();
        this.l = p0;
        this.af = p1;
        this.ag = this.ag + 1;
        this.W();
    }

    public void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        if (p0 != 0)
            this.a(p0);
        if (this.h != 0)
            this.W();
        this.i = 1;
    }

    public void e(Bundle p0) {
        super.e(p0);
        p0.putInt("SidecarFragment.state", this.l);
        p0.putInt("SidecarFragment.substate", this.af);
        p0.putInt("SidecarFragment.stateInstance", this.ag);
    }

    public final void w() {
        this.i = 0;
        super.w();
    }

}
