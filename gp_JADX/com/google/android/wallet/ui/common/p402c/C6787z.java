package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;

public final class C6787z extends C6739a {
    public C6787z(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        String b = C6739a.m30543b(textView);
        if (!TextUtils.isEmpty(b)) {
            Object obj;
            int i = 5;
            int length = b.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = b.charAt(i2);
                if (!Character.isDigit(charAt)) {
                    obj = null;
                    break;
                }
                int numericValue = Character.getNumericValue(charAt);
                if (i == 0) {
                    i = 10;
                }
                i2++;
                i = (((i * 2) % 11) + numericValue) % 10;
            }
            if (i == 1) {
                i = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}
