package org.chromium.customtabsclient.shared;

import android.content.ComponentName;
import android.support.b.b;
import android.support.b.k;
import java.lang.ref.WeakReference;

public final class C7915a extends k {
    public WeakReference f40564a;

    public C7915a(C6645b c6645b) {
        this.f40564a = new WeakReference(c6645b);
    }

    public final void m37835a(b bVar) {
        C6645b c6645b = (C6645b) this.f40564a.get();
        if (c6645b != null) {
            c6645b.mo5547a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C6645b c6645b = (C6645b) this.f40564a.get();
        if (c6645b != null) {
            c6645b.mo5546a();
        }
    }
}
