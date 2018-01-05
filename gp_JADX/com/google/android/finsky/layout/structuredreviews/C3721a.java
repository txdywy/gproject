package com.google.android.finsky.layout.structuredreviews;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class C3721a extends FrameLayout {
    public C1156b f18815a;
    public TextView f18816b;

    public C3721a(Context context) {
        this(context, null);
    }

    public C3721a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18816b = (TextView) findViewById(C7582R.id.question_text);
    }

    protected final void m17594a(CharSequence charSequence) {
        if (this.f18816b == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f18816b.setVisibility(8);
            return;
        }
        this.f18816b.setText(charSequence);
        this.f18816b.setVisibility(0);
    }

    protected final void m17593a() {
        if (this.f18815a != null) {
            this.f18815a.mo1475t();
        }
    }

    public void setOnReviewActionListener(C1156b c1156b) {
        this.f18815a = c1156b;
    }

    public void mo3618b() {
    }
}
