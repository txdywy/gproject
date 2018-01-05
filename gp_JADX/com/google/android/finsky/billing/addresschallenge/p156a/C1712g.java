package com.google.android.finsky.billing.addresschallenge.p156a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class C1712g {
    public String f8954a;
    public C1713h f8955b;
    public List f8956c = new ArrayList();
    public C1709d f8957d;
    public C1709d f8958e;
    public View f8959f;

    C1712g(C1709d c1709d) {
        this.f8957d = c1709d;
        this.f8958e = null;
        this.f8955b = C1713h.EDIT;
    }

    final void m9589a(List list) {
        this.f8956c = list;
        if (list.size() > 1) {
            this.f8955b = C1713h.SPINNER;
            switch (this.f8957d.ordinal()) {
                case 0:
                    this.f8958e = C1709d.COUNTRY;
                    return;
                case 1:
                    this.f8958e = C1709d.ADMIN_AREA;
                    return;
                case 6:
                    this.f8958e = C1709d.LOCALITY;
                    return;
                default:
                    return;
            }
        }
    }
}
