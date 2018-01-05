package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

public class AccountSeparatorRowView extends LinearLayout {
    public final Paint f10329n;
    public boolean f10330o;

    public AccountSeparatorRowView(Context context) {
        this(context, null);
    }

    public AccountSeparatorRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10330o = true;
        setWillNotDraw(false);
        Resources resources = getResources();
        this.f10329n = new Paint();
        this.f10329n.setColor(resources.getColor(C7582R.color.account_separator));
        this.f10329n.setStrokeWidth((float) resources.getDimensionPixelSize(C7582R.dimen.account_separator_thickness));
    }

    protected void onDraw(Canvas canvas) {
        if (this.f10330o) {
            int height = getHeight();
            if (getLayoutDirection() == 1) {
                canvas.drawLine(0.0f, (float) height, (float) mo2587a(true), (float) height, this.f10329n);
                return;
            }
            canvas.drawLine((float) mo2587a(false), (float) height, (float) getWidth(), (float) height, this.f10329n);
        }
    }

    public void setShouldDrawSeparator(boolean z) {
        this.f10330o = z;
    }

    protected int mo2587a(boolean z) {
        return z ? getWidth() : 0;
    }
}
