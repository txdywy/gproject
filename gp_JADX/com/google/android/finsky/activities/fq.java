package com.google.android.finsky.activities;

import android.support.v7.widget.em;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.finsky.phenotypedebug.C3880a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class fq implements TextWatcher {
    public final /* synthetic */ fl f6820a;

    fq(fl flVar) {
        this.f6820a = flVar;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Pattern compile;
        em emVar = this.f6820a.f6812i;
        Pattern pattern = null;
        try {
            compile = Pattern.compile(charSequence.toString(), 2);
        } catch (PatternSyntaxException e) {
            FinskyLog.m21662b("Search text regular expression syntax error!", new Object[0]);
            compile = pattern;
        }
        emVar.f19312h = compile;
        if (TextUtils.isEmpty(charSequence)) {
            emVar.f19311g.clear();
            emVar.f19311g.addAll(emVar.f19310f);
        } else if (compile == null) {
            emVar.f19311g.clear();
        } else {
            emVar.f19311g.clear();
            emVar.f19311g.addAll(emVar.f19310f);
            for (C3880a c3880a : emVar.f19310f) {
                Matcher matcher = compile.matcher(c3880a.f19304a);
                if (matcher == null || !matcher.find()) {
                    emVar.f19311g.remove(c3880a);
                }
            }
        }
        emVar.f3433a.m3638b();
    }

    public final void afterTextChanged(Editable editable) {
    }
}
