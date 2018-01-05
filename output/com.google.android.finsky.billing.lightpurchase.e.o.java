package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.lightpurchase.e.o extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public static final com.google.wireless.android.a.a.a.a.ce a;
    public static CheckoutPurchaseError b;

    static {
        com.google.android.finsky.billing.lightpurchase.e.o.a = com.google.android.finsky.d.j.a(0);
    }

    o() {
        com.google.android.finsky.billing.lightpurchase.d.h();
    }

    protected static Bundle a(CheckoutPurchaseError p0, boolean p1, boolean p2, int p3, int p4, PurchaseFlowConfig p5) {
        v0 = new Bundle();
        v0.putParcelable("ErrorBaseStep.checkoutPurchaseError", p0);
        v0.putBoolean("ErrorBaseStep.purchaseFailed", p1);
        v0.putBoolean("ErrorBaseStep.paymentDeclined", p2);
        v0.putInt("ErrorBaseStep.screenUiElementType", p3);
        v0.putInt("ErrorBaseStep.buttonUiElementType", p4);
        com.google.android.finsky.m.a.aH().b(v0, p5);
        com.google.android.finsky.billing.lightpurchase.e.o.b = p0;
        com.google.android.finsky.billing.lightpurchase.e.o.a.b(p3);
        return v0;
    }

    public void X() {
        this.a(this.q.getInt("ErrorBaseStep.buttonUiElementType"), 0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = (ViewGroup)p0.inflate(2130969070, p1, 0);
        if (TextUtils.isEmpty(com.google.android.finsky.billing.lightpurchase.e.o.b.b))
            v0 = this.c(2131952119);
        else
            v0 = com.google.android.finsky.billing.lightpurchase.e.o.b.b;
        if (TextUtils.isEmpty(com.google.android.finsky.billing.lightpurchase.e.o.b.c))
            v1 = this.c(2131952243);
        else
            v1 = com.google.android.finsky.billing.lightpurchase.e.o.b.c;
        v3 = (TextView)v2.findViewById(2131755114);
        v3.setText(v0);
        v4 = (TextView)v2.findViewById(2131755334);
        com.google.android.finsky.bg.ae.a(v4, v1);
        com.google.android.finsky.m.a.aH().a(this.q, v2, v3, v4, 0, 0, 0, this.aa().ao());
        return v2;
    }

    public final String a(Resources p0) {
        if (TextUtils.isEmpty(com.google.android.finsky.billing.lightpurchase.e.o.b.d))
            v0 = p0.getString(2131952688);
        else
            v0 = com.google.android.finsky.billing.lightpurchase.e.o.b.d;
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        com.google.android.finsky.billing.lightpurchase.e.o.b = (CheckoutPurchaseError)this.q.getParcelable("ErrorBaseStep.checkoutPurchaseError");
        com.google.android.finsky.billing.lightpurchase.e.o.a.b(this.q.getInt("ErrorBaseStep.screenUiElementType"));
    }

    public final void g_() {
        super.g_();
        com.google.android.finsky.bg.a.a(this.h(), ((TextView)this.R.findViewById(2131755334)).getText().toString(), this.R, 0);
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return com.google.android.finsky.billing.lightpurchase.e.o.a;
    }

}
