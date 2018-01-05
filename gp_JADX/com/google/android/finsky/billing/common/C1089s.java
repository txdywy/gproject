package com.google.android.finsky.billing.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public class C1089s extends Fragment {
    public int af;
    public int ag = 1;
    public C1087t f6946h;
    public boolean f6947i;
    public int f6948l = 0;

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        if (bundle != null) {
            mo2462a(bundle);
        }
        if (this.f6946h != null) {
            mo968W();
        }
        this.f6947i = true;
    }

    public final void mo1346w() {
        this.f6947i = false;
        super.mo1346w();
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("SidecarFragment.state", this.f6948l);
        bundle.putInt("SidecarFragment.substate", this.af);
        bundle.putInt("SidecarFragment.stateInstance", this.ag);
    }

    public void mo2462a(Bundle bundle) {
        this.f6948l = bundle.getInt("SidecarFragment.state");
        this.af = bundle.getInt("SidecarFragment.substate");
        this.ag = bundle.getInt("SidecarFragment.stateInstance");
        if (this.f6948l == 1) {
            FinskyLog.m21659a("Restoring after serialization in RUNNING, resetting to INIT.", new Object[0]);
            m6758b(0, 0);
        }
    }

    public final void m6757a(C1087t c1087t) {
        this.f6946h = c1087t;
        if (this.f6946h != null && this.f6947i) {
            mo968W();
        }
    }

    public final void m6758b(int i, int i2) {
        bb.m21791a();
        this.f6948l = i;
        this.af = i2;
        this.ag++;
        mo968W();
    }

    private final void mo968W() {
        if (this.f6946h != null) {
            this.f6946h.mo1423a(this);
        }
    }
}
