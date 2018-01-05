package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.utils.C6452k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlayCardSnippet extends C6385m {
    public int f32156a;
    public TextView f32157b;
    public ImageView f32158c;
    public final int f32159d;
    public final int f32160e;
    public int f32161f;
    public final int f32162g;
    public final int f32163h;
    public int f32164i;
    public int f32165j;

    public PlayCardSnippet(Context context) {
        this(context, null);
    }

    public PlayCardSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f32159d = resources.getDimensionPixelSize(e.play_card_snippet_avatar_size);
        this.f32160e = resources.getDimensionPixelSize(e.play_card_snippet_avatar_large_size);
        this.f32162g = resources.getDimensionPixelSize(e.play_snippet_regular_size);
        this.f32163h = resources.getDimensionPixelSize(e.play_snippet_large_size);
        this.f32156a = 0;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32157b = (TextView) findViewById(g.li_snippet_text);
        this.f32158c = (ImageView) findViewById(g.li_snippet_avatar);
        m29301a();
    }

    private final void m29301a() {
        this.f32161f = this.f32156a == 0 ? this.f32159d : this.f32160e;
        this.f32157b.setTextSize(0, this.f32156a == 0 ? (float) this.f32162g : (float) this.f32163h);
    }

    public void setSizeMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Unsupported size mode: " + i);
        } else if (this.f32156a != i) {
            this.f32156a = i;
            m29301a();
            requestLayout();
            invalidate();
        }
    }

    public ImageView getImageView() {
        return this.f32158c;
    }

    public final void m29303a(CharSequence charSequence, int i, int i2) {
        this.f32157b.setText(charSequence);
        this.f32164i = i;
        this.f32165j = i2;
    }

    public int m29302a(boolean z) {
        return this.f32161f;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        boolean z = this.f32158c.getVisibility() == 8;
        if (z) {
            i3 = paddingLeft - this.f32164i;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f32158c.getLayoutParams();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f32161f, MemoryMappedFileBuffer.DEFAULT_SIZE);
            this.f32158c.measure(makeMeasureSpec, makeMeasureSpec);
            i3 = paddingLeft - ((marginLayoutParams.rightMargin + this.f32161f) + this.f32165j);
        }
        this.f32157b.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        setMeasuredDimension(size, (Math.max(m29302a(z), this.f32157b.getMeasuredHeight()) + getPaddingTop()) + getPaddingBottom());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        if (ai.a.k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = getWidth();
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        int measuredHeight = this.f32157b.getMeasuredHeight();
        int measuredWidth = this.f32157b.getMeasuredWidth();
        if (this.f32158c.getVisibility() == 8) {
            int i5 = ((height - measuredHeight) / 2) + paddingTop;
            int a = C6452k.m29502a(width, measuredWidth, z2, this.f32164i);
            this.f32157b.layout(a, i5, a + measuredWidth, i5 + measuredHeight);
            return;
        }
        int measuredHeight2 = this.f32158c.getMeasuredHeight();
        int measuredWidth2 = this.f32158c.getMeasuredWidth();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f32158c.getLayoutParams();
        int a2 = C6452k.m29502a(width, measuredWidth2, z2, this.f32165j);
        i5 = r.b(marginLayoutParams) + (this.f32165j + measuredWidth2);
        if (measuredHeight2 > measuredHeight) {
            int i6 = ((height - measuredHeight2) / 2) + paddingTop;
            this.f32158c.layout(a2, i6, measuredWidth2 + a2, measuredHeight2 + i6);
            paddingTop += (height - measuredHeight) / 2;
            i5 = C6452k.m29502a(width, measuredWidth, z2, i5);
            this.f32157b.layout(i5, paddingTop, i5 + measuredWidth, paddingTop + measuredHeight);
            return;
        }
        paddingTop += (height - measuredHeight) / 2;
        this.f32158c.layout(a2, paddingTop, measuredWidth2 + a2, measuredHeight2 + paddingTop);
        i5 = C6452k.m29502a(width, measuredWidth, z2, i5);
        this.f32157b.layout(i5, paddingTop, i5 + measuredWidth, paddingTop + measuredHeight);
    }
}
