package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.common.util.C6600l;

public final class C6767d extends C6739a {
    public C6767d(CharSequence charSequence) {
        super(charSequence);
    }

    protected final boolean mo5632a(TextView textView) {
        CharSequence b = C6739a.m30543b(textView);
        if (TextUtils.isEmpty(b)) {
            return true;
        }
        String a = C6600l.m29944a(b);
        int length = a.length();
        if (length != 14) {
            return false;
        }
        int i;
        int[] iArr = new int[length];
        for (i = 0; i < length; i++) {
            iArr[i] = Character.getNumericValue(a.charAt(i));
        }
        i = (((((((((((((iArr[0] * 5) + (iArr[1] * 4)) + (iArr[2] * 3)) + (iArr[3] * 2)) + (iArr[4] * 9)) + (iArr[5] * 8)) + (iArr[6] * 7)) + (iArr[7] * 6)) + (iArr[8] * 5)) + (iArr[9] * 4)) + (iArr[10] * 3)) + (iArr[11] * 2)) + iArr[12]) % 11;
        if (i != 0 && (i != 1 || iArr[12] != 0)) {
            return false;
        }
        i = ((((((((((((((iArr[0] * 6) + (iArr[1] * 5)) + (iArr[2] * 4)) + (iArr[3] * 3)) + (iArr[4] * 2)) + (iArr[5] * 9)) + (iArr[6] * 8)) + (iArr[7] * 7)) + (iArr[8] * 6)) + (iArr[9] * 5)) + (iArr[10] * 4)) + (iArr[11] * 3)) + (iArr[12] * 2)) + iArr[13]) % 11;
        if (i == 0) {
            return true;
        }
        if (i == 1 && iArr[13] == 0) {
            return true;
        }
        return false;
    }
}
