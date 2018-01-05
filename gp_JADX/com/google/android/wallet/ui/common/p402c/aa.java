package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

public final class aa extends C6739a {
    public double f33596a = Double.NEGATIVE_INFINITY;
    public double f33597b = Double.POSITIVE_INFINITY;

    public aa(double d, double d2, String str) {
        super(str);
        if (d > d2) {
            throw new IllegalArgumentException(String.format("Minimum %f is greater than maximum %f.", new Object[]{Double.valueOf(d), Double.valueOf(d2)}));
        }
        this.f33596a = d;
        this.f33597b = d2;
    }

    protected final boolean mo5632a(TextView textView) {
        Object value;
        if (textView instanceof FormEditText) {
            value = ((FormEditText) textView).getValue();
        } else {
            value = textView.getText().toString();
        }
        if (TextUtils.isEmpty(value)) {
            return true;
        }
        try {
            double parseDouble = Double.parseDouble(value);
            return parseDouble >= this.f33596a && parseDouble <= this.f33597b;
        } catch (Throwable e) {
            String str = "NumValueValidator";
            String str2 = "Could not parse numeric value for string: ";
            String valueOf = String.valueOf(value);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return false;
        }
    }
}
