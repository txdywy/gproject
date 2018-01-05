package com.google.android.wallet.ui.common.p402c;

import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

public abstract class C6739a {
    public CharSequence f33268i;
    public long f33269j;
    public boolean f33270k;

    public C6739a(CharSequence charSequence) {
        this.f33269j = 0;
        this.f33270k = true;
        this.f33268i = charSequence;
    }

    public abstract boolean mo5632a(TextView textView);

    public C6739a() {
        this(null);
    }

    protected static String m30543b(TextView textView) {
        return textView instanceof FormEditText ? ((FormEditText) textView).getValue() : textView.getText().toString();
    }

    public final boolean m30546c(TextView textView) {
        return !this.f33270k || mo5632a(textView);
    }

    public CharSequence mo5631a() {
        return this.f33268i;
    }
}
