package com.google.android.finsky.setup;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import java.util.HashMap;
import java.util.Map;

public final class C4176i {
    public C2296c f21094a;
    public C1294w f21095b;
    public int f21096c;
    public Map f21097d = new HashMap();

    public C4176i(C2296c c2296c, C1294w c1294w) {
        this.f21094a = c2296c;
        this.f21096c = this.f21094a.mo2838a();
        this.f21095b = c1294w;
    }

    public final void m19498a(String str, String str2) {
        if (this.f21096c >= 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.f21097d.containsKey(str)) {
                FinskyLog.m21665c("Request for already-downloading bitmap for %s", str);
                return;
            }
            x b = this.f21095b.mo1677b(str2, this.f21096c, this.f21096c, new C4177j(this, str));
            this.f21097d.put(str, b);
            Bitmap b2 = b.b();
            if (b2 != null) {
                FinskyLog.m21659a("Received cached bitmap for %s", str);
                m19497a(str, b2);
                return;
            }
            FinskyLog.m21659a("Waiting for bitmap for %s", str);
        }
    }

    final void m19497a(String str, Bitmap bitmap) {
        this.f21094a.mo2844a(str, bitmap);
        m19496a(str);
    }

    public final void m19496a(String str) {
        this.f21097d.remove(str);
    }
}
