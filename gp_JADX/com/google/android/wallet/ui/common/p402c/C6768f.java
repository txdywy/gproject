package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.common.util.C6600l;

public final class C6768f extends C6739a {
    public C6768f(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        CharSequence b = C6739a.m30543b(textView);
        if (TextUtils.isEmpty(b)) {
            return true;
        }
        String a = C6600l.m29944a(b);
        int length = a.length();
        if (length != 11) {
            return false;
        }
        int i;
        int[] iArr = new int[length];
        for (i = 0; i < length; i++) {
            iArr[i] = Character.getNumericValue(a.charAt(i));
        }
        i = 11 - ((((((((((iArr[0] * 10) + (iArr[1] * 9)) + (iArr[2] * 8)) + (iArr[3] * 7)) + (iArr[4] * 6)) + (iArr[5] * 5)) + (iArr[6] * 4)) + (iArr[7] * 3)) + (iArr[8] * 2)) % 11);
        if (i >= 10) {
            i = 0;
        }
        int i2 = 11 - (((((((((((iArr[0] * 11) + (iArr[1] * 10)) + (iArr[2] * 9)) + (iArr[3] * 8)) + (iArr[4] * 7)) + (iArr[5] * 6)) + (iArr[6] * 5)) + (iArr[7] * 4)) + (iArr[8] * 3)) + (i * 2)) % 11);
        if (i2 >= 10) {
            i2 = 0;
        }
        if (i == iArr[9] && r2 == iArr[10]) {
            return true;
        }
        return false;
    }
}
