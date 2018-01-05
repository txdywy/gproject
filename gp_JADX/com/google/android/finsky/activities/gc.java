package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.ak;

final class gc implements OnClickListener {
    public final /* synthetic */ gb f6839a;

    gc(gb gbVar) {
        this.f6839a = gbVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        gd gdVar;
        this.f6839a.m626a(false);
        int a = ak.m21701a(i);
        Fragment fragment = this.f6839a;
        Fragment fragment2 = fragment.f761r;
        if (fragment2 instanceof gd) {
            gdVar = (gd) fragment2;
        } else {
            C0254u h = fragment.m603h();
            if (h instanceof gd) {
                gdVar = (gd) h;
            } else {
                gdVar = null;
            }
        }
        gdVar.mo1366b(a);
    }
}
