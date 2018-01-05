package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.ad;

final class C4530x implements OnClickListener {
    public final /* synthetic */ ad f23195a;
    public final /* synthetic */ Document f23196b;
    public final /* synthetic */ int f23197c;
    public final /* synthetic */ C4522w f23198d;

    C4530x(C4522w c4522w, ad adVar, Document document, int i) {
        this.f23198d = c4522w;
        this.f23195a = adVar;
        this.f23196b = document;
        this.f23197c = i;
    }

    public final void onClick(View view) {
        this.f23198d.f23139i.m13379b(new C2475d(this.f23195a));
        this.f23198d.f23138h.mo3644a(this.f23196b.m14657l().f12324d, this.f23196b.f14885a.f12097d, this.f23196b.f14885a.f12101h, this.f23197c, this.f23198d.f23139i);
    }
}
