package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.layout.C2623r;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class AvatarTitleModuleLayout extends FrameLayout implements C2621k, C2622l, C2623r {
    public PlayTextView f13916a;
    public FifeImageView f13917b;
    public boolean f13918c;
    public int f13919d;

    public AvatarTitleModuleLayout(Context context) {
        this(context, null);
    }

    public AvatarTitleModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13917b = (FifeImageView) findViewById(C7582R.id.title_thumbnail);
        this.f13916a = (PlayTextView) findViewById(C7582R.id.title_title);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
        this.f13919d = resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_overlap);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = (-dimensionPixelSize) + this.f13919d;
        setLayoutParams(marginLayoutParams);
    }

    public final void mo2982a(List list) {
        list.add(Integer.valueOf(C7582R.id.title_title));
        if (!this.f13918c) {
            list.add(Integer.valueOf(C7582R.id.title_thumbnail));
        }
    }

    public final void mo2983b(List list) {
        list.add(this.f13916a);
        if (!this.f13918c) {
            list.add(this.f13917b);
        }
    }

    protected void onMeasure(int i, int i2) {
        this.f13916a.measure(i, 0);
        LayoutParams layoutParams = this.f13917b.getLayoutParams();
        this.f13917b.measure(MeasureSpec.makeMeasureSpec(layoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(MeasureSpec.getSize(i), (this.f13916a.getMeasuredHeight() + this.f13917b.getMeasuredHeight()) - this.f13919d);
    }
}
