package com.google.android.finsky.application;

import android.text.TextUtils;
import com.google.android.finsky.api.p125a.C1251b;
import com.google.android.finsky.api.p125a.C1252c;
import com.google.android.finsky.wear.C4788i;
import java.util.Map;

final class ha implements C1252c {
    public final /* synthetic */ C4788i f8140a;

    ha(C4788i c4788i) {
        this.f8140a = c4788i;
    }

    public final void mo2270a(C1251b c1251b, Map map) {
        CharSequence charSequence = this.f8140a.f24983n;
        if (!TextUtils.isEmpty(charSequence)) {
            map.put("X-DFE-Device-Checkin-Consistency-Token", charSequence);
        }
        charSequence = c1251b.m7294f();
        if (!TextUtils.isEmpty(charSequence)) {
            map.put("X-DFE-Proxy-Device-Checkin-Consistency-Token", charSequence);
        }
    }
}
