package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Checkable;

final class bz implements OnClickListener {
    public final /* synthetic */ by f18557a;

    bz(by byVar) {
        this.f18557a = byVar;
    }

    public final void onClick(View view) {
        Checkable checkable = (Checkable) view;
        this.f18557a.f18554f[((Integer) view.getTag()).intValue()] = checkable.isChecked();
        this.f18557a.m17436a(true);
    }
}
