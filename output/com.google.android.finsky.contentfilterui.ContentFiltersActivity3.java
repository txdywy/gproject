package com.google.android.finsky.contentfilterui;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.u;
import com.google.android.finsky.pagesystem.a;

public class ContentFiltersActivity3 extends com.google.android.finsky.pagesystem.a
{

    ContentFiltersActivity3() {
        com.google.android.finsky.pagesystem.a();
    }

    protected final Fragment n() {
        return new com.google.android.finsky.contentfilterui.j();
    }

    public void onBackPressed() {
        v0 = this.H_().a(16908290);
        if (v0 instanceof com.google.android.finsky.contentfilterui.j && ((com.google.android.finsky.contentfilterui.j)v0).ah != 0 && ((com.google.android.finsky.contentfilterui.j)v0).ah.h != 0)
            this.setResult(-1);
        super.onBackPressed();
    }

}
