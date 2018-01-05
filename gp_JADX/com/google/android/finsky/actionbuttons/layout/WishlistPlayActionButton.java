package com.google.android.finsky.actionbuttons.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.actionbuttons.C1012i;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class WishlistPlayActionButton extends PlayActionButtonV2 implements C1016f {
    public C1287h f6237a;
    public C1463g f6238b;
    public C0988c f6239c;
    public C2974a f6240d;
    public Document f6241e;
    public boolean f6242f;
    public OnClickListener f6243g;

    public WishlistPlayActionButton(Context context) {
        super(context);
    }

    public WishlistPlayActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((C1012i) C3947d.m18649a(C1012i.class)).mo1699a(this);
    }

    public final void m6004a(Document document, C3748a c3748a, ad adVar) {
        C1254c a = this.f6237a.mo2015a();
        if (this.f6240d.m15403a(document, a)) {
            setVisibility(8);
            return;
        }
        this.f6241e = document;
        setVisibility(0);
        Account cY = this.f6239c.cY();
        this.f6243g = new C1017a(this, document, cY, adVar, c3748a, a);
        m6003a(this.f6240d.m15402a(document, cY), document.f14885a.f12099f);
        this.f6242f = true;
    }

    private final void m6003a(boolean z, int i) {
        if (z) {
            mo2588a(i, getContext().getString(C7582R.string.label_wishlist_remove_action), this.f6243g);
        } else {
            mo2588a(i, getContext().getString(C7582R.string.label_wishlist_add_action), this.f6243g);
        }
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        if (this.f6242f && str.equals(this.f6241e.f14885a.f12096c)) {
            m6003a(z, this.f6241e.f14885a.f12099f);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6240d.m15399a(this);
    }

    public void onDetachedFromWindow() {
        this.f6240d.m15404b(this);
        super.onDetachedFromWindow();
    }
}
