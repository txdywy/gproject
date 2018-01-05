package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class AccountSeparatorRowView extends LinearLayout
{

    public final Paint n;
    public boolean o;

    AccountSeparatorRowView(Context p0) {
        AccountSeparatorRowView(p0, 0);
    }

    AccountSeparatorRowView(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.o = 1;
        this.setWillNotDraw(0);
        v0 = this.getResources();
        this.n = new Paint();
        this.n.setColor(v0.getColor(2131558415));
        this.n.setStrokeWidth((float)v0.getDimensionPixelSize(2131624026));
    }

    protected int a(boolean p0) {
        if (p0 != 0)
            v0 = this.getWidth();
        else
            v0 = 0;
        return v0;
    }

    protected void onDraw(Canvas p0) {
        if (this.o != 0) {
            v0 = this.getHeight();
            if (this.getLayoutDirection() == 1)
                p0.drawLine(0, (float)v0, (float)this.a(1), (float)v0, this.n);
            else
                p0.drawLine((float)this.a(0), (float)v0, (float)this.getWidth(), (float)v0, this.n);
        }
    }

    public void setShouldDrawSeparator(boolean p0) {
        this.o = p0;
    }

}
