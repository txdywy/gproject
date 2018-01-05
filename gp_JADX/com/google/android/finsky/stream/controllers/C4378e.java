package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.CategoryRow;

final class C4378e implements OnClickListener {
    public final /* synthetic */ Document f22220a;
    public final /* synthetic */ int f22221b;
    public final /* synthetic */ CategoryRow f22222c;
    public final /* synthetic */ C4375d f22223d;

    C4378e(C4375d c4375d, Document document, int i, CategoryRow categoryRow) {
        this.f22223d = c4375d;
        this.f22220a = document;
        this.f22221b = i;
        this.f22222c = categoryRow;
    }

    public final void onClick(View view) {
        this.f22223d.f.mo3643a(this.f22220a.m14657l().f12324d, this.f22220a.f14885a.f12100g, this.f22221b, this.f22223d.f22191a.dn(), this.f22222c, 0, this.f22223d.i);
    }
}
