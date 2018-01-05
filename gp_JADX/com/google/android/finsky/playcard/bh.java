package com.google.android.finsky.playcard;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;

final class bh implements OnClickListener {
    public final /* synthetic */ Document f19644a;
    public final /* synthetic */ C3748a f19645b;
    public final /* synthetic */ C3915n f19646c;
    public final /* synthetic */ View[] f19647d;
    public final /* synthetic */ C2495w f19648e;
    public final /* synthetic */ ao f19649f;

    bh(ao aoVar, Document document, C3748a c3748a, C3915n c3915n, View[] viewArr, C2495w c2495w) {
        this.f19649f = aoVar;
        this.f19644a = document;
        this.f19645b = c3748a;
        this.f19646c = c3915n;
        this.f19647d = viewArr;
        this.f19648e = c2495w;
    }

    public final void onClick(View view) {
        this.f19649f.f19597l.m8973a(view.getContext(), this.f19644a, "22", view.getWidth(), view.getHeight(), this.f19645b.mo3705g());
        this.f19645b.mo3656a(this.f19644a, this.f19646c, this.f19647d, this.f19648e);
    }
}
