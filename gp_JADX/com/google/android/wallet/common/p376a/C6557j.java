package com.google.android.wallet.common.p376a;

import android.text.TextUtils;
import com.android.volley.a.z;
import com.android.volley.m;
import com.android.volley.q;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.wallet.common.p367c.C6573a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class C6557j extends z {
    public static final HashMap f32667t;
    public final String f32668u;

    public C6557j(int i, String str, x xVar, w wVar) {
        super(0, C6555h.f32661a.buildUpon().appendEncodedPath(C6555h.m29752a(i, str)).build().toString(), null, xVar, wVar);
        this.f32668u = C6555h.m29752a(i, str);
    }

    public final q m29758n() {
        return q.c;
    }

    public final Map m29757h() {
        return Collections.singletonMap("User-Agent", C6573a.f32700a);
    }

    protected final v m29756a(m mVar) {
        v a = super.a(mVar);
        if (!a.a()) {
            return a;
        }
        JSONObject jSONObject = (JSONObject) a.a;
        String a2 = C6553f.m29732a(jSONObject, "id");
        if (TextUtils.isEmpty(a2)) {
            a2 = this.f32668u;
            try {
                jSONObject.put("id", a2);
            } catch (Throwable e) {
                throw new RuntimeException(new StringBuilder(String.valueOf(a2).length() + 28).append("Error adding id=").append(a2).append(" to response").toString(), e);
            }
        }
        if (TextUtils.isEmpty(C6553f.m29732a(jSONObject, "key")) && !TextUtils.isEmpty(a2)) {
            a2 = a2.substring(a2.lastIndexOf("/") + 1);
            try {
                jSONObject.put("key", a2);
            } catch (Throwable e2) {
                throw new RuntimeException(new StringBuilder(String.valueOf(a2).length() + 29).append("Error adding key=").append(a2).append(" to response").toString(), e2);
            }
        }
        for (String a22 : f32667t.keySet()) {
            if (!jSONObject.has(a22)) {
                try {
                    jSONObject.put(a22, f32667t.get(a22));
                } catch (Throwable e22) {
                    throw new RuntimeException(new StringBuilder(String.valueOf(a22).length() + 54).append("Error adding country default data for key=").append(a22).append(" to response").toString(), e22);
                }
            }
        }
        return v.a(jSONObject, a.b);
    }

    static {
        HashMap hashMap = new HashMap();
        f32667t = hashMap;
        hashMap.put("upper", "C");
        f32667t.put("zip_name_type", "postal");
        f32667t.put("fmt", "%N%n%O%n%A%n%C");
        f32667t.put("require", "AC");
        f32667t.put("state_name_type", "province");
        f32667t.put("id", "data/ZZ");
        f32667t.put("dir", "ltr");
    }
}
