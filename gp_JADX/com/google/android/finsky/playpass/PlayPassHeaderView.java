package com.google.android.finsky.playpass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class PlayPassHeaderView extends FrameLayout {
    public C1612l f19866a;
    public TextView f19867b;
    public TextView f19868c;
    public FifeImageView f19869d;
    public FifeImageView f19870e;
    public int f19871f;
    public int f19872g;

    public PlayPassHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((C1409f) C3947d.m18649a(C1409f.class)).mo1891a(this);
        this.f19869d = (FifeImageView) findViewById(C7582R.id.background);
        this.f19870e = (FifeImageView) findViewById(C7582R.id.overlay_icon);
        this.f19867b = (TextView) findViewById(C7582R.id.overlay_title);
        this.f19868c = (TextView) findViewById(C7582R.id.overlay_subtitle);
        this.f19871f = C1611k.m9270l(getResources());
        this.f19872g = getResources().getDimensionPixelSize(C7582R.dimen.family_benefit_v2_header_height);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f19869d.getDrawable();
        if (drawable != null) {
            int intrinsicHeight = (this.f19871f * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
            int i3 = intrinsicHeight < this.f19872g ? this.f19872g : intrinsicHeight > this.f19872g * 2 ? this.f19872g * 2 : intrinsicHeight;
            if (i3 != intrinsicHeight) {
                this.f19869d.setAdjustViewBounds(false);
                this.f19869d.setScaleType(ScaleType.FIT_XY);
                this.f19869d.getLayoutParams().height = i3;
                super.onMeasure(i, i2);
            }
        }
    }
}
