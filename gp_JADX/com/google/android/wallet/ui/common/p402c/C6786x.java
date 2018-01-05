package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.Locale;

public final class C6786x extends C6739a {
    public static final BigInteger f33618a = new BigInteger("97");

    public C6786x(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        String b = C6739a.m30543b(textView);
        if (!TextUtils.isEmpty(b)) {
            int i;
            int length = b.length();
            if (length < 5 || length > 34) {
                i = 0;
            } else {
                b = b.toUpperCase(Locale.US);
                String valueOf = String.valueOf(b.substring(4));
                b = String.valueOf(b.substring(0, 4));
                b = b.length() != 0 ? valueOf.concat(b) : new String(valueOf);
                StringBuilder stringBuilder = new StringBuilder(length);
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = b.charAt(i2);
                    if (charAt >= 'A' && charAt <= 'Z') {
                        stringBuilder.append(Integer.toString((charAt - 65) + 10));
                    } else if (charAt < '0' || charAt > '9') {
                        i = 0;
                        break;
                    } else {
                        stringBuilder.append(Integer.toString(charAt - 48));
                    }
                }
                i = new BigInteger(stringBuilder.toString()).mod(f33618a).intValue() == 1 ? 1 : 0;
            }
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
