package com.google.android.finsky.stream.controllers.taglinks.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.p143a.p144a.C4245a;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import com.squareup.leakcanary.C7582R;

public class TagLinksBannerItemRectangularView extends C4245a {
    public final Paint f22840k;
    public final RectF f22841l;
    public final Drawable f22842m;
    public final int f22843w;
    public final int f22844x;
    public boolean f22845y;

    public TagLinksBannerItemRectangularView(Context context) {
        this(context, null);
    }

    public TagLinksBannerItemRectangularView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagLinksBannerItemRectangularView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f22843w = resources.getColor(C7582R.color.play_white);
        this.f22844x = resources.getColor(C7582R.color.play_secondary_text);
        this.f22842m = resources.getDrawable(C7582R.drawable.ic_cancel_grey600_24dp);
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.taglinks_cancel_icon_size);
        this.f22842m.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        setWillNotDraw(false);
        this.f22840k = new Paint();
        this.f22841l = new RectF();
    }

    public void onClick(View view) {
        if (this.f22845y) {
            view.setVisibility(8);
        }
        super.onClick(view);
    }

    public final void m20975a(C4496a c4496a, int i, ad adVar, C4247c c4247c) {
        super.mo4225a(c4496a.f22846a, i, adVar, c4247c);
        this.f22845y = c4496a.f22847b;
        this.f22840k.setColor(this.d);
        this.f22840k.setAntiAlias(true);
        this.f22840k.setStyle(Style.FILL);
        this.b.setTextColor(this.f22843w);
        this.b.setCompoundDrawables(null, null, null, null);
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.taglinks_shadow_blur);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.taglinks_shadow_offset_y);
        this.f22840k.setShadowLayer((float) dimensionPixelSize, 0.0f, (float) dimensionPixelSize2, resources.getColor(C7582R.color.status_bar_overlay));
        setLayerType(1, this.f22840k);
        if (this.f22845y) {
            this.f22840k.setColor(this.f22843w);
            this.b.setTextColor(this.f22844x);
            this.b.setCompoundDrawables(null, null, this.f22842m, null);
        }
        resources = getContext().getResources();
        String str = c4496a.f22846a.f21479a;
        if (this.f22845y) {
            setContentDescription(resources.getString(C7582R.string.content_description_remove_filter, new Object[]{str}));
            return;
        }
        setContentDescription(resources.getString(C7582R.string.content_description_filter, new Object[]{str}));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f22841l.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C7582R.dimen.taglinks_rounded_corner_radius);
        canvas.drawRoundRect(this.f22841l, (float) dimensionPixelSize, (float) dimensionPixelSize, this.f22840k);
    }

    public final void Z_() {
        this.f22845y = false;
        super.Z_();
    }

    public int getPlayStoreUiElementType() {
        return this.f22845y ? 2923 : 2922;
    }
}
