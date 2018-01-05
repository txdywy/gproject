package com.google.android.finsky.billing.myaccount;

import com.google.wireless.android.finsky.dfe.c.a.bh;

final class ab {
    public final bh f10175a;
    public final int f10176b;

    ab() {
        this.f10175a = null;
        this.f10176b = 0;
    }

    public ab(bh bhVar) {
        this.f10175a = bhVar;
        if ((bhVar.a == 0 ? 1 : 0) != 0) {
            this.f10176b = 1;
        } else if (bhVar.a == 1) {
            this.f10176b = 2;
        } else {
            throw new RuntimeException("Unexpected row content");
        }
    }
}
