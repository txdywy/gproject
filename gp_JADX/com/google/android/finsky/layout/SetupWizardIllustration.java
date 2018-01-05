package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.setup.cs;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class SetupWizardIllustration extends RelativeLayout {
    public final float f18373a;
    public final float f18374b;
    public final int f18375c;
    public final boolean f18376d;
    public FifeImageView f18377e;
    public TextView f18378f;

    public SetupWizardIllustration(Context context) {
        this(context, null);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.SetupWizardIllustration, 0, 0);
        obtainStyledAttributes.getBoolean(0, false);
        this.f18373a = obtainStyledAttributes.getFloat(1, 0.0f);
        obtainStyledAttributes.recycle();
        this.f18374b = (float) getResources().getDimensionPixelSize(C7582R.dimen.setup_wizard_baseline_grid_size);
        this.f18375c = getResources().getDimensionPixelOffset(C7582R.dimen.setup_wizard_status_bar_offset);
        this.f18376d = getResources().getBoolean(C7582R.bool.setup_wizard_use_tablet_graphic);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18377e = (FifeImageView) findViewById(C7582R.id.setup_wizard_header_graphic);
        this.f18378f = (TextView) findViewById(C7582R.id.title);
    }

    protected void onMeasure(int i, int i2) {
        Object obj = (this.f18377e == null || this.f18377e.getVisibility() == 8) ? null : 1;
        if (!(cs.m19406b() || this.f18378f == null)) {
            if (obj != null) {
                ((LayoutParams) this.f18377e.getLayoutParams()).bottomMargin = -this.f18375c;
            }
            this.f18378f.setPadding(this.f18378f.getPaddingLeft(), this.f18375c, this.f18378f.getPaddingRight(), this.f18378f.getPaddingBottom());
        }
        if (!(obj == null || this.f18373a == 0.0f)) {
            int size = (int) (((float) MeasureSpec.getSize(i)) / this.f18373a);
            this.f18377e.getLayoutParams().height = (int) (((float) size) - (((float) size) % this.f18374b));
        }
        super.onMeasure(i, i2);
    }
}
