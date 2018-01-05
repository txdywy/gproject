package com.google.android.instantapps.common.p217e;

import android.content.Context;
import android.support.v4.p037h.C0308c;
import com.google.android.instantapps.common.C5804k;
import java.util.List;
import java.util.Set;

public final class C5748j {
    public static final C5804k f29150a = new C5804k("NetworkCriteria");
    public final Context f29151b;
    public final Set f29152c;

    public C5748j(Context context, bf bfVar) {
        this.f29151b = context;
        this.f29152c = C5748j.m27131a(bfVar);
    }

    private static Set m27131a(bf bfVar) {
        Set c0308c = new C0308c();
        for (String trim : (List) bfVar.mo5158a()) {
            String trim2 = trim.trim();
            if (!trim2.isEmpty()) {
                try {
                    c0308c.add(Integer.valueOf(Integer.parseInt(trim2)));
                } catch (Throwable e) {
                    f29150a.m27208a(e, trim2, new Object[0]);
                }
            }
        }
        return c0308c;
    }
}
