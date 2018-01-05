package com.google.android.finsky.activities;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.finsky.phenotypedebug.a;
import com.google.android.finsky.phenotypedebug.d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class com.google.android.finsky.activities.fq implements TextWatcher
{

    public final com.google.android.finsky.activities.fl a;

    fq(com.google.android.finsky.activities.fl p0) {
        this.a = p0;
    }

    public final void afterTextChanged(Editable p0) {
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        try {
            v1 = Pattern.compile(p0.toString(), 2);
        }
        catch (PatternSyntaxException ex) {
            FinskyLog.b("Search text regular expression syntax error!", new Object[0]);
            v1 = 0;
        }
        this.a.i.h = v1;
        if (TextUtils.isEmpty(p0)) {
            this.a.i.g.clear();
            this.a.i.g.addAll(this.a.i.f);
        }
        else if (v1 == 0)
            this.a.i.g.clear();
        else {
            this.a.i.g.clear();
            this.a.i.g.addAll(this.a.i.f);
            v3 = this.a.i.f.iterator();
            while (v3.hasNext()) {
                v0 = (com.google.android.finsky.phenotypedebug.a)v3.next();
                v4 = v1.matcher(v0.a);
                if (v4 == 0 || !v4.find())
                    this.a.i.g.remove(v0);
            }
        }
        this.a.i.a.b();
    }

}
