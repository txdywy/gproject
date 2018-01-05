package com.google.android.finsky.da;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.safetynet.C5322c;
import org.json.JSONObject;

final /* synthetic */ class C2499b implements C1643x {
    public final C2498a f13447a;
    public final String f13448b;

    C2499b(C2498a c2498a, String str) {
        this.f13447a = c2498a;
        this.f13448b = str;
    }

    public final void mo2367a(C4980w c4980w) {
        C2498a c2498a = this.f13447a;
        CharSequence charSequence = this.f13448b;
        C5322c c5322c = (C5322c) c4980w;
        c2498a.f13442c.mo4559g();
        if (c5322c.mo4505b().m23271a()) {
            String a = c5322c.mo4817a();
            if (a == null) {
                c2498a.m13390a(2005, 0);
                c2498a.f13446j.countDown();
                return;
            }
            try {
                a = C2498a.m13387a(a);
                if (a == null) {
                    c2498a.m13390a(2007, 0);
                    c2498a.f13446j.countDown();
                    return;
                }
                JSONObject jSONObject = new JSONObject(a);
                if (!jSONObject.has("ctsProfileMatch") || !jSONObject.getBoolean("ctsProfileMatch")) {
                    c2498a.m13394b(2002);
                    return;
                } else if (!jSONObject.has("nonce")) {
                    c2498a.m13394b(2006);
                    return;
                } else if (TextUtils.equals(charSequence, jSONObject.getString("nonce"))) {
                    c2498a.m13394b(0);
                    return;
                } else {
                    c2498a.m13394b(2003);
                    return;
                }
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Failed to parse SafetyNet payload", new Object[0]);
                c2498a.m13390a(2008, 0);
                return;
            }
        }
        c2498a.m13390a(2004, 0);
        c2498a.f13446j.countDown();
    }
}
