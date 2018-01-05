package com.google.android.finsky.cs;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

protected final class com.google.android.finsky.cs.a
{

    public Map a;

    a() {
        this.a = new HashMap();
    }

    public static String a(String p0, String p1) {
        if (TextUtils.isEmpty(p0))
            FinskyLog.e("Found empty / null Phenotype experiment feature name", new Object[0]);
        if (TextUtils.isEmpty(p1))
            FinskyLog.e("Found empty / null Phenotype experiment flag name", new Object[0]);
        return (String.valueOf(p0).length() + 2 + String.valueOf(p1).length()) + p0 + "__" + p1;
    }

    protected abstract void a();

    protected final void a(String p0, String p1, Object p2) {
        this.a.put(com.google.android.finsky.cs.a.a(p0, p1), p2);
    }

}
