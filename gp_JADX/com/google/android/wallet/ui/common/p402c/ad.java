package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import java.math.BigInteger;

public final class ad extends C6739a {
    public static final BigInteger f33599a = new BigInteger("97");

    public ad(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        String b = C6739a.m30543b(textView);
        return TextUtils.isEmpty(b) || ad.m30785a(b);
    }

    private static boolean m30785a(String str) {
        if (str.length() != 24) {
            return false;
        }
        try {
            if (97 - new BigInteger(String.valueOf(str.substring(0, 22)).concat("00")).mod(f33599a).intValue() == Integer.parseInt(str.substring(22))) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
