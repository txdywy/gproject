package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.libraries.play.entertainment.C6114l;
import com.google.android.libraries.play.entertainment.p351m.C6122h;

public class BackgroundPanelView extends RelativeLayout {
    public int f30301a;
    public View f30302b;

    public BackgroundPanelView(Context context) {
        this(context, null);
    }

    public BackgroundPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BackgroundPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30301a = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6114l.BackgroundPanelView, i, 0);
        this.f30301a = obtainStyledAttributes.getResourceId(C6114l.BackgroundPanelView_gradientOverlayId, -1);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f30301a != -1) {
            this.f30302b = findViewById(this.f30301a);
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.f30302b != null) {
            C6122h.m28132a(this.f30302b, new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, i}));
        }
    }
}
