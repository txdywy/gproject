package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.play.d;
import com.google.android.play.g;
import com.google.android.play.h;

public class OnboardNavFooter extends FrameLayout {
    public OnboardNavFooter(Context context) {
        this(context, null);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(h.play_onboard_nav_footer, this);
        setBackgroundColor(context.getResources().getColor(d.play_onboard_app_color_dark));
        findViewById(g.start_button);
        findViewById(g.end_button);
        findViewById(g.page_indicator);
    }
}
