package com.google.android.youtube.player;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import com.google.android.youtube.player.internal.C6845q;

final class C6864q implements OnGlobalFocusChangeListener {
    public final /* synthetic */ C6861n f33902a;

    C6864q(C6861n c6861n) {
        this.f33902a = c6861n;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (this.f33902a.f33892e != null && this.f33902a.f33889b.contains(view2) && !this.f33902a.f33889b.contains(view)) {
            try {
                this.f33902a.f33892e.f33842b.mo5721g();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
    }
}
