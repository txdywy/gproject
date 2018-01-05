package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.google.android.finsky.frameworkviews.ButtonBar;

final class df implements OnCheckedChangeListener {
    public final /* synthetic */ ButtonBar f6664a;

    df(ButtonBar buttonBar) {
        this.f6664a = buttonBar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f6664a.setPositiveButtonEnabled(true);
    }
}
