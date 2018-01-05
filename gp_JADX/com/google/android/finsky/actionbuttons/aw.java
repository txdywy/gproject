package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class aw extends C0996o {
    public final C3748a f6104f;
    public final Document f6105g;
    public final C2974a f6106h;
    public final C0988c f6107i;
    public final int f6108j;

    public aw(Context context, int i, C3748a c3748a, Document document, C2495w c2495w, ad adVar, C2974a c2974a, C0988c c0988c) {
        int i2;
        super(context, i, c2495w, adVar);
        this.f6104f = c3748a;
        this.f6105g = document;
        this.f6106h = c2974a;
        this.f6107i = c0988c;
        if (this.f6106h.m15402a(this.f6105g, this.f6107i.cY())) {
            i2 = 205;
        } else {
            i2 = 204;
        }
        this.f6108j = i2;
    }

    public final PlayActionButtonV2 mo1199a(ViewGroup viewGroup) {
        return (PlayActionButtonV2) LayoutInflater.from(this.a).inflate(C7582R.layout.wishlist_button, viewGroup, false);
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        m5893b();
        WishlistPlayActionButton wishlistPlayActionButton = (WishlistPlayActionButton) playActionButtonV2;
        wishlistPlayActionButton.m6004a(this.f6105g, this.f6104f, this.d);
        wishlistPlayActionButton.setActionStyle(this.b);
    }

    public final int mo1200a() {
        return this.f6108j;
    }
}
