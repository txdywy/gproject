package com.google.android.finsky.pagesystem;

import android.os.Bundle;
import com.google.android.finsky.dfemodel.DfeToc;

public abstract class C1052j extends C1045b {
    public String bF;

    public final void m6319a(DfeToc dfeToc, String str) {
        super.m6251a(dfeToc);
        m6258b("finsky.UrlBasedPageFragment.url", str);
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.bF = this.f760q.getString("finsky.UrlBasedPageFragment.url");
    }
}
