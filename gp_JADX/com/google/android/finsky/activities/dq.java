package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.widget.TextView;

final class dq implements OnClickListener {
    public final /* synthetic */ TextView f6673a;
    public final /* synthetic */ dp f6674b;

    dq(dp dpVar, TextView textView) {
        this.f6674b = dpVar;
        this.f6673a = textView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ds dsVar;
        Fragment fragment = this.f6674b;
        Fragment fragment2 = fragment.f761r;
        if (fragment2 instanceof ds) {
            dsVar = (ds) fragment2;
        } else {
            C0254u h = fragment.m603h();
            if (h instanceof ds) {
                dsVar = (ds) h;
            } else {
                dsVar = null;
            }
        }
        if (dsVar != null) {
            dsVar.mo1339a(this.f6673a.getText().toString());
        }
    }
}
