package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.b;
import com.squareup.leakcanary.C7582R;

public class ContentFilterLineView extends b {
    public C1612l f11485a;
    public af f11486b;
    public TextView f11487c;
    public FifeImageView f11488d;
    public TextView f11489e;

    public ContentFilterLineView(Context context) {
        this(context, null);
    }

    public ContentFilterLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFilterLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1785a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f11487c = (TextView) findViewById(C7582R.id.vertical_name);
        this.f11488d = (FifeImageView) findViewById(C7582R.id.vertical_icon);
        this.f11489e = (TextView) findViewById(C7582R.id.selected_filter_label);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f11487c.setEnabled(z);
        this.f11489e.setEnabled(z);
    }
}
