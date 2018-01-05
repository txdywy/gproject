package com.google.android.finsky.stream.controllers.quicklinks.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.p143a.p144a.C4245a;
import com.google.android.finsky.stream.base.p143a.p144a.C4246b;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import com.squareup.leakcanary.C7582R;

public class QuickLinksBannerItemPillView extends C4245a {
    public C1461c f22777k;
    public final Paint f22778l;
    public final RectF f22779m;

    public QuickLinksBannerItemPillView(Context context) {
        this(context, null);
    }

    public QuickLinksBannerItemPillView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickLinksBannerItemPillView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f22778l = new Paint();
        this.f22778l.setAntiAlias(true);
        this.f22778l.setStyle(Style.FILL);
        this.f22779m = new RectF();
    }

    protected void onFinishInflate() {
        ((C1441b) C3947d.m18649a(C1441b.class)).mo1945a(this);
        super.onFinishInflate();
        Resources resources = getResources();
        setPadding(getPaddingLeft(), resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_top_padding), getPaddingRight(), resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_bottom_padding));
        if (this.f22777k.dj().mo2294a(12632714)) {
            int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_title_xpadding);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_title_vpadding);
            this.b.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            this.b.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_title_size));
        }
    }

    public final void mo4225a(C4246b c4246b, int i, ad adVar, C4247c c4247c) {
        super.mo4225a(c4246b, i, adVar, c4247c);
        this.f22778l.setColor(this.d);
        if (!TextUtils.isEmpty(c4246b.f21479a)) {
            this.b.setText(c4246b.f21479a.toUpperCase());
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f22779m.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = this.f22779m.height();
        canvas.drawRoundRect(this.f22779m, height / 2.0f, height / 2.0f, this.f22778l);
    }

    public int getPlayStoreUiElementType() {
        return 101;
    }
}
