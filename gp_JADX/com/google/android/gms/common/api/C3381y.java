package com.google.android.gms.common.api;

import android.util.Log;

public abstract class C3381y implements C1643x {
    public abstract void mo3501a();

    public final void mo2367a(C4980w c4980w) {
        if (c4980w.mo4505b().m23271a()) {
            mo3502b(c4980w);
            return;
        }
        mo3501a();
        if (c4980w instanceof C4973u) {
            try {
                ((C4973u) c4980w).mo4500a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(c4980w);
                Log.w("ResultCallbacks", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    public abstract void mo3502b(C4980w c4980w);
}
