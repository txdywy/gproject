package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.regex.Pattern;

public final class ab extends C6739a {
    public final Pattern f33598a;

    public ab(CharSequence charSequence, Pattern pattern) {
        super(charSequence);
        if (pattern == null) {
            throw new IllegalArgumentException("pattern must not be null");
        }
        this.f33598a = pattern;
    }

    protected final boolean mo5632a(TextView textView) {
        if (textView instanceof FormEditText) {
            FormEditText formEditText = (FormEditText) textView;
            if (formEditText.getValueLength() == 0 || this.f33598a.matcher(formEditText.getValue()).matches()) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(textView.getText()) || this.f33598a.matcher(textView.getText()).matches()) {
            return true;
        } else {
            return false;
        }
    }
}
