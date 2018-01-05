package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

public class OnboardTutorialPage extends BindingFrameLayout implements C6402c {
    public OnboardTutorialPage(Context context) {
        this(context, null);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnboardHostControl(C6405b c6405b) {
    }

    public C6406d getPageInfo() {
        Data data = getData();
        return (C6406d) (data == null ? null : data.c(C6402c.f32270a));
    }
}
