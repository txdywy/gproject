package com.google.android.instantapps.common.loading.ui;

import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;

final class C5826l implements OnDismissListener {
    public final /* synthetic */ C5822h f29294a;

    C5826l(C5822h c5822h) {
        this.f29294a = c5822h;
    }

    public final void onDismiss(PopupMenu popupMenu) {
        if (this.f29294a.az == popupMenu) {
            this.f29294a.aM.mo5136a(2);
            this.f29294a.az = null;
        }
    }
}
