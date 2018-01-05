package com.google.android.wallet.common.p376a;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.r;
import com.android.volley.w;
import com.android.volley.x;
import org.json.JSONObject;

public final class C6555h implements x {
    public static final Uri f32661a = Uri.parse("https://payments.google.com/payments/data/address");
    public final r f32662b;
    public final int f32663c;
    public final String f32664d;
    public final x f32665e;
    public final w f32666f;

    public C6555h(r rVar, int i, String str, x xVar, w wVar) {
        this.f32662b = rVar;
        this.f32663c = i;
        this.f32664d = str;
        this.f32665e = xVar;
        this.f32666f = wVar;
    }

    public final void m29753a(String str) {
        this.f32662b.a(new C6557j(this.f32663c, str, this, this.f32666f));
    }

    static String m29752a(int i, String str) {
        StringBuilder append = new StringBuilder("data/").append(C6563p.m29793a(i));
        if (!TextUtils.isEmpty(str)) {
            append.append("--").append(str);
        }
        return append.toString();
    }

    public final /* synthetic */ void b_(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Object e = C6553f.m29751e(jSONObject, this.f32664d);
        if (TextUtils.isEmpty(e)) {
            this.f32665e.b_(jSONObject);
        } else {
            m29753a(e);
        }
    }
}
