package com.google.android.finsky.contentfilterui;

import android.support.v4.app.Fragment;
import com.google.android.finsky.pagesystem.C2334a;

public class ContentFiltersActivity3 extends C2334a {
    protected final Fragment mo2860n() {
        return new C2346j();
    }

    public void onBackPressed() {
        Fragment a = H_().mo281a(16908290);
        if (a instanceof C2346j) {
            C2350n c2350n = ((C2346j) a).ah;
            if (c2350n != null && c2350n.f11542h) {
                setResult(-1);
            }
        }
        super.onBackPressed();
    }
}
