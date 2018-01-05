package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class WarmWelcomeCardLegacyButton extends AccessibleLinearLayout implements ae {
    public FifeImageView f18420a;
    public TextView f18421b;

    public WarmWelcomeCardLegacyButton(Context context) {
        this(context, null);
    }

    public WarmWelcomeCardLegacyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f18420a = (FifeImageView) findViewById(C7582R.id.icon);
        this.f18421b = (TextView) findViewById(C7582R.id.text);
    }

    public final void m17353a(String str, int i, int i2) {
        this.f18421b.setText(str);
        if (i != 0) {
            this.f18421b.setTextColor(C0216d.m1116c(getContext(), i));
        }
        if (i2 != 0) {
            setBackgroundColor(C0216d.m1116c(getContext(), i2));
        }
        this.f18420a.setVisibility(8);
        setContentDescription(str);
    }

    public final void Z_() {
        this.f18420a.a();
    }
}
