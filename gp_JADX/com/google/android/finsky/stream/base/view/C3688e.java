package com.google.android.finsky.stream.base.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.leakcanary.C7582R;

public class C3688e extends RelativeLayout implements ae, C3687d {
    public FlatCardClusterViewHeader f18605d;
    public ad f18606e;
    public C2473o f18607f;
    public boolean f18608g;
    public OnClickListener f18609h;
    public C4295c f18610i;

    public C3688e(Context context) {
        this(context, null);
    }

    public C3688e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18610i = new C4295c();
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f18605d = (FlatCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
    }

    public void Z_() {
        this.f18606e = null;
        if (this.f18607f != null) {
            this.f18607f.m13200a(0, null, null);
        }
        if (this.f18608g) {
            this.f18608g = false;
            this.f18607f = null;
        }
        this.f18609h = null;
    }

    public void setCustomClusterUiElementNode(C2473o c2473o) {
        this.f18607f = c2473o;
        this.f18608g = true;
    }

    public int getPlayStoreUiElementType() {
        return 400;
    }

    public final void m17483a(byte[] bArr, ad adVar) {
        if (this.f18607f == null) {
            this.f18607f = new C2473o(0);
        }
        if (!this.f18608g) {
            this.f18607f.m13200a(getPlayStoreUiElementType(), bArr, adVar);
        }
        if (bArr != null) {
            this.f18606e = this.f18607f;
        } else {
            this.f18606e = adVar;
        }
    }

    public ad getPlayStoreUiElementNode() {
        return this.f18607f;
    }

    public final void m17480a(int i, String str, String str2, String str3, OnClickListener onClickListener, bd bdVar, CharSequence charSequence, int i2) {
        this.f18609h = onClickListener;
        if (this.f18605d != null) {
            this.f18610i.f21657a = i;
            this.f18610i.f21658b = str;
            this.f18610i.f21659c = str2;
            this.f18610i.f21660d = str3;
            this.f18610i.f21661e = bdVar;
            this.f18610i.f21662f = charSequence;
            this.f18605d.setTextShade(i2);
            this.f18605d.mo3611a(this.f18610i, this);
            this.f18605d.setVisibility(0);
        }
    }

    public ad getParentOfChildren() {
        return this.f18606e;
    }

    public void mo3581a(Bundle bundle) {
    }

    public final void mo3579a(View view) {
        if (this.f18609h != null) {
            this.f18609h.onClick(view);
        }
    }

    public final void mo3580c(View view) {
        if (this.f18609h != null) {
            this.f18609h.onClick(view);
        }
    }
}
