package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.at.k;
import com.google.android.finsky.d.a;
import com.google.wireless.android.finsky.dfe.nano.bi;

public final class com.google.android.finsky.contentfilterui.h implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.contentfilterui.e b;

    h(com.google.android.finsky.contentfilterui.e p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        if (this.b.ag.k == 0)
            this.b.f = this.a;
        if (this.b.ag.i.isEmpty()) {
            if ((this.b.ag.j.isEmpty()) || this.b.c.c.getBoolean(Integer.toString(this.b.e)))
                v0 = 0;
            else {
                v0 = new com.google.android.finsky.at.k();
                if (!TextUtils.isEmpty(this.b.ag.i))
                    v0.c(this.b.ag.i);
                if (!TextUtils.isEmpty(this.b.ag.j))
                    v0.a(this.b.ag.j);
                v0.a(322, 0, -1, -1, this.b.y_.a(0));
                v0.d(2131952688).a(1);
                v0.a(this.b, 1, new Bundle());
                v0.a().a(this.b.h().H_(), "ContentFiltersChoiceFragment.confirmationDialog");
                this.b.c.c.putBoolean(Integer.toString(this.b.e), 1);
                v0 = 1;
            }
        }
        if (v0 == 0)
            this.b.ai();
    }

}
