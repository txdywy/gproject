package com.google.android.finsky.billing.addresschallenge.a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class com.google.android.finsky.billing.addresschallenge.a.g
{

    public String a;
    public com.google.android.finsky.billing.addresschallenge.a.h b;
    public List c;
    public com.google.android.finsky.billing.addresschallenge.a.d d;
    public com.google.android.finsky.billing.addresschallenge.a.d e;
    public View f;

    g(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        this.c = new ArrayList();
        this.d = p0;
        this.e = 0;
        this.b = com.google.android.finsky.billing.addresschallenge.a.h.a;
    }

    final void a(List p0) {
        this.c = p0;
        if (p0.size() > 1) {
            this.b = com.google.android.finsky.billing.addresschallenge.a.h.b;
            switch (this.d.ordinal()) {
                case 0:
                    this.e = com.google.android.finsky.billing.addresschallenge.a.d.k;
                    break;
                case 1:
                    this.e = com.google.android.finsky.billing.addresschallenge.a.d.a;
                    break;
                case 6:
                    this.e = com.google.android.finsky.billing.addresschallenge.a.d.b;
                    break;
                default:
                    break;
            }
        }
    }

}
