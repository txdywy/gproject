package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.google.android.finsky.bg.C1606f;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.C1419m;
import com.google.android.finsky.stream.base.C4254d;
import com.squareup.leakcanary.C7582R;

public class C2628h extends RelativeLayout implements ae {
    public C4254d f13947e;
    public C1606f f13948f;
    public PlayCardClusterViewHeader f13949g;
    public ad f13950h;
    public C2473o f13951i;
    public int f13952j;
    public boolean f13953k;

    public C2628h(Context context) {
        this(context, null);
    }

    public C2628h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        ((C1419m) C3947d.m18649a(C1419m.class)).mo1919a(this);
        super.onFinishInflate();
        if (this.f13948f.m9233a()) {
            this.f13952j = getResources().getDimensionPixelSize(C7582R.dimen.play_cluster_vpadding_v2);
        } else {
            this.f13952j = getResources().getDimensionPixelSize(C7582R.dimen.play_cluster_vpadding);
        }
        this.f13949g = (PlayCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
    }

    public void Z_() {
        this.f13950h = null;
        if (this.f13951i != null) {
            this.f13951i.m13200a(0, null, null);
        }
        if (this.f13953k) {
            this.f13953k = false;
            this.f13951i = null;
        }
    }

    public int getPlayStoreUiElementType() {
        return 400;
    }

    public final void m13752a(byte[] bArr, ad adVar) {
        if (this.f13951i == null) {
            this.f13951i = new C2473o(0);
        }
        if (!this.f13953k) {
            this.f13951i.m13200a(getPlayStoreUiElementType(), bArr, adVar);
        }
        if (bArr != null) {
            this.f13950h = this.f13951i;
        } else {
            this.f13950h = adVar;
        }
    }

    public ad getPlayStoreUiElementNode() {
        return this.f13951i;
    }

    public final void m13750a(Document document, int i) {
        m13748a(document.f14885a.f12099f, document.f14885a.f12100g, document.f14885a.f12101h, null, null, i, null, null);
    }

    public final void m13751a(Document document, C3748a c3748a, Context context, int i, C2495w c2495w) {
        C4286i c4286i;
        bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        CharSequence a = C1542f.m8970a(document);
        if (C3760e.m17904a(document)) {
            c4286i = new C4286i(this, c3748a, document, c2495w);
        } else {
            Object obj = null;
        }
        m13748a(document.f14885a.f12099f, document.f14885a.f12100g, document.f14885a.f12101h, this.f13947e.m19769a(context, document, document.m14638a(), null, false), c4286i, i, bdVar, a);
    }

    public final void m13748a(int i, String str, String str2, String str3, OnClickListener onClickListener, int i2, bd bdVar, CharSequence charSequence) {
        if (this.f13949g != null) {
            PlayCardClusterViewHeader playCardClusterViewHeader = this.f13949g;
            if (bdVar != null) {
                playCardClusterViewHeader.m19880a(i, str, str2, str3, onClickListener, bdVar, Integer.valueOf(C1608h.m9243a(playCardClusterViewHeader.getContext(), i)), charSequence);
            } else {
                playCardClusterViewHeader.m19880a(i, str, str2, str3, onClickListener, null, null, charSequence);
            }
            this.f13949g.setVisibility(0);
            this.f13949g.setExtraHorizontalPadding(i2);
            ai.m1823a(this, 0, this.f13952j, 0, this.f13952j);
        }
    }

    public ad getParentOfChildren() {
        return this.f13950h;
    }

    public void mo2995a(Bundle bundle) {
    }
}
