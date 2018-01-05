package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;

final class fy implements OnClickListener {
    public final /* synthetic */ fw f6832a;

    fy(fw fwVar) {
        this.f6832a = fwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fz fzVar;
        Fragment fragment = this.f6832a;
        Fragment fragment2 = fragment.f761r;
        if (fragment2 instanceof fz) {
            fzVar = (fz) fragment2;
        } else {
            C0254u h = fragment.m603h();
            if (h instanceof fz) {
                fzVar = (fz) h;
            } else {
                fzVar = null;
            }
        }
        if (fzVar != null) {
            fzVar.mo1365a(this.f6832a.af[0], this.f6832a.af[1]);
        }
        this.f6832a.m626a(false);
    }
}
