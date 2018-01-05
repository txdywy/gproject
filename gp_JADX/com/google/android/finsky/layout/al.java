package com.google.android.finsky.layout;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.google.android.finsky.utils.FinskyLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class al implements TextWatcher {
    public final /* synthetic */ ak f18487a;

    al(ak akVar) {
        this.f18487a = akVar;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Pattern compile;
        Pattern pattern = null;
        try {
            compile = Pattern.compile(charSequence.toString(), 2);
        } catch (PatternSyntaxException e) {
            FinskyLog.m21662b("Search text regular expression syntax error!", new Object[0]);
            compile = pattern;
        }
        for (int i4 = 0; i4 < this.f18487a.f6786j.getChildCount(); i4++) {
            TextView textView = (TextView) this.f18487a.f6786j.getChildAt(i4);
            CharSequence charSequence2 = this.f18487a.f6790n[i4];
            if (TextUtils.isEmpty(charSequence)) {
                textView.setText(charSequence2);
                textView.setVisibility(0);
            } else {
                if (compile != null) {
                    Matcher matcher = compile.matcher(charSequence2);
                    if (matcher != null && matcher.find()) {
                        int start = matcher.start();
                        int end = matcher.end();
                        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                        StyleSpan styleSpan = new StyleSpan(3);
                        spannableStringBuilder.setSpan(foregroundColorSpan, start, end, 18);
                        spannableStringBuilder.setSpan(styleSpan, start, end, 18);
                        textView.setText(spannableStringBuilder);
                        textView.setVisibility(0);
                    }
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
