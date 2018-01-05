package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class CombinedHeaderTitleLayout extends FrameLayout {
    public PlayTextView f18099a;
    public PlayTextView f18100b;
    public FifeImageView f18101c;
    public ViewGroup f18102d;
    public int f18103e;

    public CombinedHeaderTitleLayout(Context context) {
        this(context, null);
    }

    public CombinedHeaderTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18101c = (FifeImageView) findViewById(C7582R.id.header_thumbnail);
        this.f18099a = (PlayTextView) findViewById(C7582R.id.header_title);
        this.f18100b = (PlayTextView) findViewById(C7582R.id.header_sub_title);
        this.f18102d = (ViewGroup) findViewById(C7582R.id.header_title_group);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
        this.f18103e = resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_overlap);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = (-dimensionPixelSize) + this.f18103e;
        setLayoutParams(marginLayoutParams);
    }

    protected void onMeasure(int i, int i2) {
        this.f18102d.measure(i, 0);
        LayoutParams layoutParams = this.f18101c.getLayoutParams();
        this.f18101c.measure(MeasureSpec.makeMeasureSpec(layoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(MeasureSpec.getSize(i), (this.f18102d.getMeasuredHeight() + this.f18101c.getMeasuredHeight()) - this.f18103e);
    }
}
