package com.google.android.wallet.p372d;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;

public class C6531c extends Fragment {
    public C6524d ai;
    public boolean aj;
    public int ak = -1;
    public boolean al = false;
    public int f32598l = -1;

    public void mo5507b(Bundle bundle) {
        super.b(bundle);
        this.L = true;
        if (bundle == null) {
            m29649b(0, 0);
        } else {
            mo5506a(bundle);
        }
        this.aj = true;
    }

    public final void m29652w() {
        this.aj = false;
        super.w();
    }

    public void mo5508e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("SidecarFragment.state", this.f32598l);
        bundle.putInt("SidecarFragment.substate", this.ak);
        bundle.putBoolean("SidecarFragment.notifyListenerOfStateChange", this.al);
    }

    public void mo5506a(Bundle bundle) {
        this.f32598l = bundle.getInt("SidecarFragment.state");
        this.ak = bundle.getInt("SidecarFragment.substate");
        this.al = bundle.getBoolean("SidecarFragment.notifyListenerOfStateChange");
        if (this.f32598l == 1) {
            Log.d("SidecarFragment", "Restoring after serialization in RUNNING, resetting to INIT.");
            m29649b(0, 0);
        } else if (this.al) {
            mo5505W();
        }
    }

    public final void m29648a(C6524d c6524d) {
        this.ai = c6524d;
        if (this.ai != null && this.aj && this.al) {
            mo5505W();
        }
    }

    public final void m29649b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(String.format("State / substate should be >= 0, state=%d, substate=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must be called from the UI thread.");
        } else if (i != this.f32598l || i2 != this.ak) {
            this.f32598l = i;
            this.ak = i2;
            this.al = true;
            mo5505W();
        }
    }

    private final void mo5505W() {
        if (this.ai != null) {
            this.ai.mo5473a(this);
            this.al = false;
        }
    }
}
