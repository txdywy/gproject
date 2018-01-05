package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

protected class AccountPaymentMethodsSpacer extends TextView
{

    public final Paint a;

    AccountPaymentMethodsSpacer(Context p0) {
        AccountPaymentMethodsSpacer(p0, 0);
    }

    AccountPaymentMethodsSpacer(Context p0, AttributeSet p1) {
        TextView(p0, p1);
        this.setWillNotDraw(0);
        v0 = this.getResources();
        this.a = new Paint();
        this.a.setColor(v0.getColor(2131558415));
        this.a.setStrokeWidth((float)v0.getDimensionPixelSize(2131624026));
    }

    protected void onDraw(Canvas p0) {
        super.onDraw(p0);
        v0 = this.getHeight();
        v6 = this.getWidth();
        p0.drawLine(0, (float)v0, (float)v6, (float)v0, this.a);
        p0.drawLine(0, 0, (float)v6, 0, this.a);
    }

}
