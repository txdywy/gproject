package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

public final class ac extends C6739a {
    public ac(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        int valueLength;
        if (textView instanceof FormEditText) {
            valueLength = ((FormEditText) textView).getValueLength();
        } else {
            valueLength = TextUtils.getTrimmedLength(textView.getText());
        }
        return valueLength > 0;
    }
}
