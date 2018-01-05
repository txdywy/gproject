package com.google.android.finsky.navigationmanager;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.finsky.dfemodel.Document;

@Deprecated
public final class C3760e {
    public static boolean m17903a() {
        return VERSION.SDK_INT >= 22;
    }

    public static boolean m17904a(Document document) {
        if (document.m14656k() || document.aQ() || !TextUtils.isEmpty(document.f14885a.f12116w) || (document.m14660o() && !TextUtils.isEmpty(document.f14885a.f12111r.f12016b))) {
            return true;
        }
        return false;
    }
}
