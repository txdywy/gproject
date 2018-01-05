package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;

final class C6785w extends C6739a {
    C6785w(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        String charSequence = textView.getText().toString();
        return TextUtils.isEmpty(charSequence) || (charSequence.length() >= 11 && C6770h.m30806i(charSequence));
    }
}
