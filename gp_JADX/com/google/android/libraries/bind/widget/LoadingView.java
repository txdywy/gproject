package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.bind.C5873b;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5896e;
import com.google.android.libraries.bind.data.Data;

public class LoadingView extends FrameLayout implements C5878d {
    public final C5896e f29468a;

    public LoadingView(Context context) {
        this(context, null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, C5873b.bind__loading, this);
        setLayoutParams(new LayoutParams(-1, -1));
        this.f29468a = new C5896e(context, attributeSet, this);
    }

    public final void a_(Data data) {
        this.f29468a.m27353a(data);
    }
}
