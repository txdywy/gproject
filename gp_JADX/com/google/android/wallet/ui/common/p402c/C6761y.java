package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

public class C6761y extends C6739a {
    public final int f33522b;

    public C6761y(int i) {
        this.f33522b = i;
    }

    public boolean mo5661b() {
        return true;
    }

    protected final boolean mo5632a(TextView textView) {
        int valueLength;
        if (textView instanceof FormEditText) {
            valueLength = ((FormEditText) textView).getValueLength();
        } else {
            valueLength = TextUtils.getTrimmedLength(textView.getText());
        }
        if (mo5661b() || valueLength != 0) {
            return valueLength >= this.f33522b;
        } else {
            return true;
        }
    }
}
