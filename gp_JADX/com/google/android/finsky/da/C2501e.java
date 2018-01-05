package com.google.android.finsky.da;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.utils.C4677h;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.safetynet.C5322c;
import org.json.JSONException;
import org.json.JSONObject;

final class C2501e implements C1643x {
    public final /* synthetic */ String f13454a;
    public final /* synthetic */ C2500d f13455b;

    C2501e(C2500d c2500d, String str) {
        this.f13455b = c2500d;
        this.f13454a = str;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5322c c5322c = (C5322c) c4980w;
        this.f13455b.f13453e.mo4559g();
        if (c5322c.mo4505b().m23271a()) {
            String a = c5322c.mo4817a();
            if (a == null) {
                this.f13455b.m13400b(2005);
                return;
            }
            try {
                String[] split = a.split("\\.");
                if (split.length == 3) {
                    a = new String(Base64.decode(split[1], 0), C4677h.f24059a);
                } else {
                    a = null;
                }
                if (a == null) {
                    this.f13455b.m13400b(2007);
                    return;
                }
                JSONObject jSONObject = new JSONObject(a);
                if (!jSONObject.has("ctsProfileMatch") || !jSONObject.getBoolean("ctsProfileMatch")) {
                    this.f13455b.m13400b(2002);
                    this.f13455b.m13399a(false);
                    return;
                } else if (!jSONObject.has("nonce")) {
                    this.f13455b.m13400b(2006);
                    this.f13455b.m13399a(false);
                    return;
                } else if (TextUtils.equals(this.f13454a, jSONObject.getString("nonce"))) {
                    this.f13455b.m13399a(true);
                    return;
                } else {
                    this.f13455b.m13400b(2003);
                    this.f13455b.m13399a(false);
                    return;
                }
            } catch (JSONException e) {
                this.f13455b.m13400b(2008);
                this.f13455b.m13399a(false);
                return;
            }
        }
        this.f13455b.m13400b(2004);
    }
}
