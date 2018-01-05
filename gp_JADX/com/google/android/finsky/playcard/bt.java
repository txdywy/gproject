package com.google.android.finsky.playcard;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.play.layout.i;

final class bt implements i {
    public final /* synthetic */ Context f19694a;
    public final /* synthetic */ Document f19695b;
    public final /* synthetic */ View f19696c;
    public final /* synthetic */ C3748a f19697d;
    public final /* synthetic */ OnClickListener f19698e;
    public final /* synthetic */ C3907h f19699f;
    public final /* synthetic */ int f19700g;
    public final /* synthetic */ ao f19701h;

    bt(ao aoVar, Context context, Document document, View view, C3748a c3748a, OnClickListener onClickListener, C3907h c3907h, int i) {
        this.f19701h = aoVar;
        this.f19694a = context;
        this.f19695b = document;
        this.f19696c = view;
        this.f19697d = c3748a;
        this.f19698e = onClickListener;
        this.f19699f = c3907h;
        this.f19700g = i;
    }

    public final void m18545a(int i) {
        this.f19701h.f19597l.m8973a(this.f19694a, this.f19695b, "23", this.f19696c.getWidth(), this.f19696c.getHeight(), this.f19697d.mo3705g());
        this.f19698e.onClick(this.f19696c);
        if (this.f19699f != null) {
            this.f19699f.l_(this.f19700g);
        }
    }
}
