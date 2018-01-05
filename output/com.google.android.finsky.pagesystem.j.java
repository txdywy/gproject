package com.google.android.finsky.pagesystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.dfemodel.DfeToc;

public class com.google.android.finsky.pagesystem.j extends com.google.android.finsky.pagesystem.b
{

    public String bF;

    j() {
        com.google.android.finsky.pagesystem.b();
    }

    public final void a(DfeToc p0, String p1) {
        super.a(p0);
        this.b("finsky.UrlBasedPageFragment.url", p1);
    }

    public void b(Bundle p0) {
        super.b(p0);
        this.bF = this.q.getString("finsky.UrlBasedPageFragment.url");
    }

}
