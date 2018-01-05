package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import com.google.android.finsky.frameworkviews.ButtonBar;

public final class com.google.android.finsky.activities.df implements RadioGroup$OnCheckedChangeListener
{

    public final ButtonBar a;

    df(ButtonBar p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(RadioGroup p0, int p1) {
        this.a.setPositiveButtonEnabled(1);
    }

}
