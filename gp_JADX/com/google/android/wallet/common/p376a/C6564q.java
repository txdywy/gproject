package com.google.android.wallet.common.p376a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import java.util.List;
import java.util.Locale;

public final class C6564q {
    public static int m29795a(String str, CharSequence charSequence) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String str2 = " ";
        String valueOf = String.valueOf(str.toLowerCase(Locale.getDefault()));
        valueOf = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        str2 = String.valueOf(charSequence);
        return valueOf.indexOf(new StringBuilder(String.valueOf(str2).length() + 1).append(" ").append(str2).toString().toLowerCase(Locale.getDefault()));
    }

    public static SpannableString m29796a(List list, CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            if (((Integer) pair.second).intValue() != 0) {
                spannableString.setSpan(new StyleSpan(1), ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue() + ((Integer) pair.first).intValue(), 0);
            }
        }
        return spannableString;
    }
}
