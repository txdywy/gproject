package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.wireless.android.a.a.a.a.ce;

public class LoggingActionButton extends PlayActionButtonV2 implements com.google.android.finsky.d.ad
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.android.finsky.d.ad b;

    LoggingActionButton(Context p0) {
        LoggingActionButton(p0, 0);
    }

    LoggingActionButton(Context p0, AttributeSet p1) {
        PlayActionButtonV2(p0, p1);
        this.a = com.google.android.finsky.d.j.a(0);
    }

    public final void a(int p0, String p1, View$OnClickListener p2) {
        throw new UnsupportedOperationException("Element type and parent node required!");
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new IllegalStateException("unwanted children");
    }

    public final void a(String p0, View$OnClickListener p1, int p2, com.google.android.finsky.d.ad p3) {
        this.a.b(p2);
        this.b = p3;
        super.a(10, p0, p1);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.b;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
