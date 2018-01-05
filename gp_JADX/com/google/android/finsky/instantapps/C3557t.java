package com.google.android.finsky.instantapps;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final class C3557t implements C1643x {
    public final /* synthetic */ String f17828a;

    C3557t(String str) {
        this.f17828a = str;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (((Status) c4980w).m23271a()) {
            String str = "Cleared metadata for package ";
            String valueOf = String.valueOf(this.f17828a);
            FinskyLog.m21659a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            return;
        }
        str = "Unable to clear metadata for package ";
        valueOf = String.valueOf(this.f17828a);
        FinskyLog.m21667d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
    }
}
