package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import com.google.android.finsky.utils.ak;
import com.google.android.finsky.utils.al;
import com.google.android.wallet.ui.common.a;

public final class com.google.android.finsky.activities.gb extends android.support.v4.app.p
{

    gb() {
        android.support.v4.app.p();
    }

    public final Dialog a(Bundle p0) {
        v1 = this.h();
        v3 = new com.google.android.wallet.ui.common.a(v1);
        v3.a(2131953191);
        v4 = new CharSequence[com.google.android.finsky.utils.ak.a.length];
        v0 = 0;
        while (v0 < com.google.android.finsky.utils.ak.a.length) {
            v4[v0] = v1.getString(com.google.android.finsky.utils.ak.a[v0].b);
            v0 = v0 + 1;
        }
        v3.a(v4, this.q.getInt("sorting_type"), new com.google.android.finsky.activities.gc(this));
        return v3.a();
    }

}
