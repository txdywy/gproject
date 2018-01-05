package com.google.android.finsky.activities;

import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import com.google.android.finsky.al.e;
import com.google.android.finsky.utils.be;
import com.google.android.play.utils.k;

public final class com.google.android.finsky.activities.ax implements com.google.android.finsky.al.j
{

    public final com.google.android.finsky.activities.t a;

    ax(com.google.android.finsky.activities.t p0) {
        this.a = p0;
    }

    public final boolean a(Object p0) {
        v0 = 0;
        if (((com.google.android.finsky.al.e)p0).a != 0 && !com.google.android.finsky.utils.be.a(((com.google.android.finsky.al.e)p0).a, com.google.android.play.utils.k.a()))
            Snackbar.a(this.a.getListView(), "Malformed URL or non-SSL URL on release-key device. Re-flash your device to debug-keys for local DFE access", 0).a();
        else {
            this.a.a((com.google.android.finsky.al.e)p0);
            v0 = 1;
        }
        return v0;
    }

}
