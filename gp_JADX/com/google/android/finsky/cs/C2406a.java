package com.google.android.finsky.cs;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

public abstract class C2406a {
    public Map f11705a = new HashMap();

    protected abstract void mo2900a();

    protected final void m12112a(String str, String str2, Object obj) {
        this.f11705a.put(C2406a.m12110a(str, str2), obj);
    }

    public static String m12110a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21669e("Found empty / null Phenotype experiment feature name", new Object[0]);
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.m21669e("Found empty / null Phenotype experiment flag name", new Object[0]);
        }
        return new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length()).append(str).append("__").append(str2).toString();
    }
}
