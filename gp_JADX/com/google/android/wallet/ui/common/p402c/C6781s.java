package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;

final class C6781s extends C6739a {
    C6781s(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        String charSequence = textView.getText().toString();
        return TextUtils.isEmpty(charSequence) || (charSequence.length() >= 9 && C6770h.m30802e(charSequence));
    }
}
