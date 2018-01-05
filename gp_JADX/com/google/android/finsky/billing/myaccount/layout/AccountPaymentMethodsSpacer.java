package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class AccountPaymentMethodsSpacer extends TextView {
    public final Paint f10355a;

    public AccountPaymentMethodsSpacer(Context context) {
        this(context, null);
    }

    public AccountPaymentMethodsSpacer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.f10355a = new Paint();
        this.f10355a.setColor(resources.getColor(C7582R.color.account_separator));
        this.f10355a.setStrokeWidth((float) resources.getDimensionPixelSize(C7582R.dimen.account_separator_thickness));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        canvas.drawLine(0.0f, (float) height, (float) width, (float) height, this.f10355a);
        canvas.drawLine(0.0f, 0.0f, (float) width, 0.0f, this.f10355a);
    }
}
