package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.instantapps.C5263b;

public final class ak implements C5263b {
    public final C4954s mo4674a(C5058o c5058o) {
        return c5058o.mo4544a(new C5277d(c5058o));
    }

    public final C4954s mo4675a(C5058o c5058o, Intent intent) {
        am.m23733a((Object) c5058o);
        am.m23733a((Object) intent);
        return c5058o.mo4544a(new C5272a(c5058o, intent));
    }

    public final C4954s mo4676a(C5058o c5058o, String str) {
        am.m23742b(!TextUtils.isEmpty(str));
        return c5058o.mo4544a(new C5279f(c5058o, str));
    }

    public final C4954s mo4677a(C5058o c5058o, String str, boolean z) {
        am.m23733a((Object) c5058o);
        return c5058o.mo4553b(new al(c5058o, str, z));
    }

    public final C4954s mo4678b(C5058o c5058o, String str) {
        am.m23733a((Object) c5058o);
        return c5058o.mo4544a(new C5280g(c5058o, str));
    }

    public final C4954s mo4679c(C5058o c5058o, String str) {
        am.m23733a((Object) c5058o);
        return c5058o.mo4553b(new C5276c(c5058o, str));
    }
}
