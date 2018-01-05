package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

final class ah implements OnClickListener {
    public final /* synthetic */ FlatCardClusterView f21695a;
    public final /* synthetic */ Document f21696b;
    public final /* synthetic */ ag f21697c;

    ah(ag agVar, FlatCardClusterView flatCardClusterView, Document document) {
        this.f21697c = agVar;
        this.f21695a = flatCardClusterView;
        this.f21696b = document;
    }

    public final void onClick(View view) {
        this.f21697c.i.m13379b(new C2475d(this.f21695a.getPlayStoreUiElementNode()));
        this.f21697c.f.mo3639a(this.f21696b.bg().aG.f12555c.f12558c, this.f21697c.f21694t.dn(), this.f21697c.e.getPackageManager(), this.f21697c.i);
    }
}
