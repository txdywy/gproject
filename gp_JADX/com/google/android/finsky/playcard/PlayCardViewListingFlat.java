package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.android.vending.C0629a;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewListingFlat extends PlayCardViewListingSmall implements C2625e, C3896m {
    public View f19487a;
    public int f19488b;
    public int f19489c;
    public int f19490d;
    public boolean f19491e;

    public PlayCardViewListingFlat(Context context) {
        this(context, null);
    }

    public PlayCardViewListingFlat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardThumbnail);
        this.f19488b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        Resources resources = getResources();
        this.f19489c = resources.getDimensionPixelSize(C7582R.dimen.play_card_flat_list_vpadding);
        this.f19490d = resources.getDimensionPixelSize(C7582R.dimen.mini_top_charts_separator_margin);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19487a = findViewById(C7582R.id.li_separator);
    }

    public int getCardType() {
        return 26;
    }

    public int getPaddingBottom() {
        return this.f19489c;
    }

    protected void onMeasure(int i, int i2) {
        ai.m1823a(getThumbnail(), this.f19488b, this.f19488b, this.f19488b, this.f19488b);
        ((MarginLayoutParams) this.V.getLayoutParams()).topMargin = this.f19488b;
        super.onMeasure(i, i2);
        if (this.f19487a.getVisibility() != 8) {
            this.f19487a.measure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(((MarginLayoutParams) this.f19487a.getLayoutParams()).height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f19487a.getVisibility() != 8) {
            boolean z2 = ai.f1848a.mo400k(this) == 0;
            int width = getWidth();
            int height = getHeight();
            if (this.f19491e) {
                i5 = this.f19490d;
            }
            int measuredWidth = this.f19487a.getMeasuredWidth();
            int measuredHeight = this.f19487a.getMeasuredHeight();
            int a = k.a(width, measuredWidth, z2, i5);
            i5 = height - measuredHeight;
            this.f19487a.layout(a, i5, measuredWidth - a, i5 + measuredHeight);
        }
    }

    public final void j_(int i) {
        this.f19487a.setVisibility(i);
    }
}
