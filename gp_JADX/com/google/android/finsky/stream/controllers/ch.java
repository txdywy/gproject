package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class ch implements OnClickListener {
    public final /* synthetic */ ah f22013a;
    public final /* synthetic */ ad f22014b;
    public final /* synthetic */ Document f22015c;
    public final /* synthetic */ cg f22016d;

    ch(cg cgVar, ah ahVar, ad adVar, Document document) {
        this.f22016d = cgVar;
        this.f22013a = ahVar;
        this.f22014b = adVar;
        this.f22015c = document;
    }

    public final void onClick(View view) {
        int i;
        int i2 = this.f22013a.f11790c == 1 ? 1 : 0;
        C2495w c2495w = this.f22016d.i;
        C2475d c2475d = new C2475d(this.f22014b);
        if (i2 != 0) {
            i = 1231;
        } else {
            i = 1232;
        }
        c2495w.m13379b(c2475d.m13256a(i));
        this.f22016d.f.mo3638a(this.f22013a, this.f22016d.i);
        if (i2 != 0) {
            this.f22016d.f22010a.m22589b(this.f22015c.f14885a.f12096c);
            this.f22016d.f22012o = 0;
            this.f22016d.C.mo4088b(this.f22016d, 0, 1);
        }
    }
}
