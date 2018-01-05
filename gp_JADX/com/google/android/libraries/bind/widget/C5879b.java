package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5896e;
import com.google.android.libraries.bind.data.Data;

public class C5879b extends FrameLayout implements C5878d {
    public final C5896e f29400b;

    public C5879b(Context context) {
        this(context, null);
    }

    public C5879b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5879b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29400b = new C5896e(context, attributeSet, this);
    }

    public final void a_(Data data) {
        this.f29400b.m27353a(data);
    }

    protected C5896e getBoundHelper() {
        return this.f29400b;
    }
}
