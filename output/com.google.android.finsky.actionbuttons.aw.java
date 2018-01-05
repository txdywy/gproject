package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.aw extends com.google.android.finsky.actionbuttons.o
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;
    public final com.google.android.finsky.ee.a h;
    public final com.google.android.finsky.accounts.c i;
    public final int j;

    aw(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.w p4, com.google.android.finsky.d.ad p5, com.google.android.finsky.ee.a p6, com.google.android.finsky.accounts.c p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p4, p5);
        this.f = p2;
        this.g = p3;
        this.h = p6;
        this.i = p7;
        if (this.h.a(this.g, this.i.cY()))
            v0 = 205;
        else
            v0 = 204;
        this.j = v0;
    }

    public final int a() {
        return this.j;
    }

    public final PlayActionButtonV2 a(ViewGroup p0) {
        return (PlayActionButtonV2)LayoutInflater.from(this.a).inflate(2130969601, p0, 0);
    }

    public final void a(PlayActionButtonV2 p0) {
        this.b();
        ((WishlistPlayActionButton)p0).a(this.g, this.f, this.d);
        ((WishlistPlayActionButton)p0).setActionStyle(this.b);
    }

}
