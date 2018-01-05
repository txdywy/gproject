package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlaylistHeader extends RelativeLayout {
    public View f18275a;
    public View f18276b;
    public View f18277c;
    public final int f18278d;

    public PlaylistHeader(Context context) {
        this(context, null);
    }

    public PlaylistHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18278d = context.getResources().getDimensionPixelSize(C7582R.dimen.play_cluster_header_height);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18275a = findViewById(C7582R.id.header);
        this.f18276b = findViewById(C7582R.id.subheader);
        this.f18277c = findViewById(C7582R.id.song_list_control);
    }

    private final boolean m17329a() {
        return this.f18276b.getVisibility() == 8 && this.f18277c.getVisibility() == 8;
    }

    protected void onMeasure(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = MeasureSpec.getSize(i);
        int measuredHeight;
        int i3;
        if (m17329a()) {
            this.f18275a.measure(i, 0);
            measuredHeight = this.f18275a.getMeasuredHeight();
            i3 = (measuredHeight + paddingTop) + paddingBottom;
            if (i3 <= this.f18278d) {
                i3 = ((paddingTop + measuredHeight) + ((((this.f18278d - measuredHeight) - paddingTop) - paddingBottom) / 2)) + paddingBottom;
            }
            setMeasuredDimension(size, i3);
            return;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18277c.getLayoutParams();
        this.f18277c.measure(0, 0);
        measuredHeight = MeasureSpec.makeMeasureSpec((size - this.f18277c.getMeasuredWidth()) - C0361r.m2051b(marginLayoutParams), MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.f18275a.measure(measuredHeight, 0);
        i3 = this.f18275a.getMeasuredHeight() + paddingTop;
        if (this.f18276b.getVisibility() != 8) {
            this.f18276b.measure(measuredHeight, 0);
            i3 += this.f18276b.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(i3 + paddingBottom, this.f18278d));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (m17329a()) {
            int height = getHeight() - getPaddingBottom();
            this.f18275a.layout(0, height - this.f18275a.getMeasuredHeight(), this.f18275a.getMeasuredWidth(), height);
            return;
        }
        int width = getWidth();
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int paddingTop = getPaddingTop();
        int paddingTop2 = getPaddingTop();
        height = this.f18275a.getMeasuredHeight();
        if (this.f18276b.getVisibility() != 8) {
            height += this.f18276b.getMeasuredHeight();
        }
        paddingTop += (((getHeight() - paddingTop) - height) - paddingTop2) / 2;
        height = this.f18275a.getMeasuredWidth();
        paddingTop2 = k.a(width, height, z2, 0);
        this.f18275a.layout(paddingTop2, paddingTop, height + paddingTop2, this.f18275a.getMeasuredHeight() + paddingTop);
        height = k.b(width, this.f18277c.getMeasuredWidth(), z2, C0361r.m2051b((MarginLayoutParams) this.f18277c.getLayoutParams()));
        paddingTop = (paddingTop + this.f18275a.getBaseline()) - this.f18277c.getBaseline();
        this.f18277c.layout(height, paddingTop, this.f18277c.getMeasuredWidth() + height, this.f18277c.getMeasuredHeight() + paddingTop);
        if (this.f18276b.getVisibility() != 8) {
            height = this.f18275a.getBottom();
            paddingTop = this.f18276b.getMeasuredWidth();
            int a = k.a(width, paddingTop, z2, 0);
            this.f18276b.layout(a, height, a + paddingTop, this.f18276b.getMeasuredHeight() + height);
        }
    }
}
