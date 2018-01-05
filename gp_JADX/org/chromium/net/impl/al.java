package org.chromium.net.impl;

import android.util.Log;

final class al implements Runnable {
    public final /* synthetic */ af f40803a;

    al(af afVar) {
        this.f40803a = afVar;
    }

    public final void run() {
        if (this.f40803a.f40793t != null) {
            try {
                this.f40803a.f40793t.m38095c();
            } catch (Throwable e) {
                Log.e(af.f40774a, "Exception when closing OutputChannel", e);
            }
        }
        if (this.f40803a.f40792s != null) {
            this.f40803a.f40792s.disconnect();
            this.f40803a.f40792s = null;
        }
    }
}
