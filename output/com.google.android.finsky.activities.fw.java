package com.google.android.finsky.activities;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v7.app.q;
import android.support.v7.app.z;
import com.google.android.wallet.ui.common.a;

public final class com.google.android.finsky.activities.fw extends android.support.v4.app.p
{

    public final boolean[] af;

    fw() {
        android.support.v4.app.p();
        this.af = new boolean[2];
    }

    public final Dialog a(Bundle p0) {
        v0 = this.h();
        v2 = new com.google.android.wallet.ui.common.a(v0);
        v2.a(2131953070);
        v3 = new String[this.af.length];
        v3[0] = v0.getString(2131953069);
        v3[1] = v0.getString(2131953068);
        this.af[0] = this.q.getBoolean("filterByVersion");
        this.af[1] = this.q.getBoolean("filterByDevice");
        v1 = new com.google.android.finsky.activities.fx(this);
        if (v2.b != 0)
            v2.b.setMultiChoiceItems(v3, this.af, v1);
        else {
            v2.a.a.s = v3;
            v2.a.a.G = v1;
            v2.a.a.C = this.af;
            v2.a.a.D = 1;
        }
        v2.a(17039370, new com.google.android.finsky.activities.fy(this));
        return v2.a();
    }

}
