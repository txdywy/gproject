package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;

public class LoggingActionButton extends PlayActionButtonV2 implements ad {
    public final ce f10362a;
    public ad f10363b;

    public LoggingActionButton(Context context) {
        this(context, null);
    }

    public LoggingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10362a = C2482j.m13283a(0);
    }

    public final void mo2588a(int i, String str, OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Element type and parent node required!");
    }

    public final void m10692a(String str, OnClickListener onClickListener, int i, ad adVar) {
        this.f10362a.b(i);
        this.f10363b = adVar;
        super.mo2588a(10, str, onClickListener);
    }

    public ce getPlayStoreUiElement() {
        return this.f10362a;
    }

    public ad getParentNode() {
        return this.f10363b;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
