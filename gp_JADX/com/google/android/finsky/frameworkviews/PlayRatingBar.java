package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1608h;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class PlayRatingBar extends ViewGroup implements OnClickListener, OnFocusChangeListener, ad {
    public PlayRatingStar[] f16213a;
    public ac f16214b;
    public int f16215c;
    public int f16216d;

    public PlayRatingBar(Context context) {
        this(context, null);
    }

    public PlayRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        Resources resources = getResources();
        this.f16213a = new PlayRatingStar[5];
        this.f16213a[0] = (PlayRatingStar) findViewById(C7582R.id.star1);
        this.f16213a[0].setContentDescription(resources.getString(C7582R.string.one_star));
        this.f16213a[1] = (PlayRatingStar) findViewById(C7582R.id.star2);
        this.f16213a[1].setContentDescription(resources.getString(C7582R.string.two_star));
        this.f16213a[2] = (PlayRatingStar) findViewById(C7582R.id.star3);
        this.f16213a[2].setContentDescription(resources.getString(C7582R.string.three_star));
        this.f16213a[3] = (PlayRatingStar) findViewById(C7582R.id.star4);
        this.f16213a[3].setContentDescription(resources.getString(C7582R.string.four_star));
        this.f16213a[4] = (PlayRatingStar) findViewById(C7582R.id.star5);
        this.f16213a[4].setContentDescription(resources.getString(C7582R.string.five_star));
    }

    public final void setVerticalPadding(int i) {
        int dimensionPixelSize;
        if (i > 0) {
            dimensionPixelSize = getResources().getDimensionPixelSize(i);
        } else {
            dimensionPixelSize = 0;
        }
        this.f16216d = dimensionPixelSize;
        requestLayout();
        invalidate();
    }

    public final void m16030a(int i, int i2, ac acVar) {
        int b = C1608h.m9251b(i2);
        this.f16214b = acVar;
        for (int i3 = 0; i3 < 5; i3++) {
            boolean z;
            PlayRatingStar playRatingStar = this.f16213a[i3];
            playRatingStar.f16225i = i3;
            playRatingStar.f16217a = C7582R.raw.btn_rating_star_normal;
            playRatingStar.f16218b = C7582R.raw.btn_rating_star;
            playRatingStar.f16219c = C7582R.drawable.btn_rating_star_focused;
            playRatingStar.f16220d = C7582R.color.play_fg_secondary;
            playRatingStar.f16221e = b;
            playRatingStar.m16032a();
            playRatingStar.setOnFocusChangeListener(this);
            playRatingStar.setOnPressStateChangeListener(this);
            playRatingStar.setOnClickListener(this);
            if (i3 < i) {
                z = true;
            } else {
                z = false;
            }
            playRatingStar.setFilled(z);
        }
        this.f16215c = i;
    }

    private final void m16029a() {
        for (int i = 0; i < this.f16213a.length; i++) {
            boolean z;
            this.f16213a[i].setFocused(false);
            PlayRatingStar playRatingStar = this.f16213a[i];
            if (i < this.f16215c) {
                z = true;
            } else {
                z = false;
            }
            playRatingStar.setFilled(z);
        }
    }

    public final int getRating() {
        return this.f16215c;
    }

    public final void setRating(int i) {
        this.f16215c = i;
        m16029a();
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        this.f16213a[0].measure(0, 0);
        int measuredHeight = (this.f16216d * 2) + this.f16213a[0].getMeasuredHeight();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE);
        int length = this.f16213a.length;
        int i4 = size;
        while (i3 < length) {
            int i5 = i4 / (length - i3);
            this.f16213a[i3].measure(MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE), makeMeasureSpec);
            i4 -= i5;
            i3++;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int i5 = 0;
        for (View view : this.f16213a) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int a = k.a(width, measuredWidth, z2, i5);
            view.layout(a, 0, a + measuredWidth, measuredHeight);
            i5 += measuredWidth;
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (PlayRatingStar enabled : this.f16213a) {
            enabled.setEnabled(z);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        View focusedChild = getFocusedChild();
        if (focusedChild == null || !focusedChild.isFocused()) {
            m16029a();
            return;
        }
        int index = ((PlayRatingStar) view).getIndex();
        if (z) {
            for (int i = 0; i < this.f16213a.length; i++) {
                boolean z2;
                if (i <= index) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f16213a[i].setFocused(z2);
                this.f16213a[i].setFilled(z2);
            }
            return;
        }
        this.f16213a[index].setFocused(false);
        this.f16213a[index].setFilled(false);
    }

    public final void mo3330a(View view, boolean z) {
        int index = ((PlayRatingStar) view).getIndex();
        int i;
        boolean z2;
        if (z) {
            for (i = 0; i < this.f16213a.length; i++) {
                PlayRatingStar playRatingStar = this.f16213a[i];
                if (i <= index) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                playRatingStar.setFilled(z2);
            }
            return;
        }
        for (i = 0; i < this.f16213a.length; i++) {
            PlayRatingStar playRatingStar2 = this.f16213a[i];
            if (i < this.f16215c) {
                z2 = true;
            } else {
                z2 = false;
            }
            playRatingStar2.setFilled(z2);
        }
    }

    public final void onClick(View view) {
        int index = ((PlayRatingStar) view).getIndex();
        for (int i = 0; i < this.f16213a.length; i++) {
            boolean z;
            PlayRatingStar playRatingStar = this.f16213a[i];
            if (i <= index) {
                z = true;
            } else {
                z = false;
            }
            playRatingStar.setFilled(z);
        }
        this.f16215c = index + 1;
        this.f16214b.mo1472a(this, index + 1);
    }
}
