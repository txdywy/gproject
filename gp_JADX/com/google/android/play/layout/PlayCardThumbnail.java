package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.play.C6383k;
import com.google.android.play.g;

public class PlayCardThumbnail extends FrameLayout {
    public ImageView f32166a;
    public final int f32167b;
    public final int f32168c;
    public final int f32169d;
    public final int f32170e;
    public final int f32171f;
    public int f32172g;

    public PlayCardThumbnail(Context context) {
        this(context, null);
    }

    public PlayCardThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlayCardThumbnail);
        this.f32167b = obtainStyledAttributes.getResourceId(C6383k.PlayCardThumbnail_thumbnail_id, g.li_thumbnail);
        this.f32172g = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlayCardThumbnail_app_thumbnail_padding, 0);
        obtainStyledAttributes.recycle();
        this.f32168c = ai.a.l(this);
        this.f32169d = getPaddingTop();
        this.f32170e = ai.a.m(this);
        this.f32171f = getPaddingBottom();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32166a = (ImageView) findViewById(this.f32167b);
    }

    public void setAppThumbnailPaddingWithoutUpdate(int i) {
        this.f32172g = i;
    }

    public int getBaseline() {
        return getPaddingTop() + this.f32166a.getMeasuredHeight();
    }

    public ImageView getImageView() {
        return this.f32166a;
    }

    public final int getAppThumbnailPadding() {
        return this.f32172g;
    }

    public final void m29304a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj = null;
        if (i == 3) {
            i2 = this.f32172g;
            i3 = this.f32172g;
            i4 = this.f32172g;
            i5 = z ? 0 : this.f32172g;
        } else {
            i2 = this.f32168c;
            i3 = this.f32169d;
            i4 = this.f32170e;
            i5 = this.f32171f;
        }
        if (!(i2 == getPaddingLeft() && i3 == getPaddingTop() && i4 == getPaddingRight() && i5 == getPaddingBottom())) {
            obj = 1;
        }
        if (obj != null) {
            ai.a(this, i2, i3, i4, i5);
            requestLayout();
        }
    }
}
