package com.google.android.play.image;

import com.android.volley.VolleyError;
import com.android.volley.w;
import com.google.android.play.utils.PlayCommonLog;

final class ak implements w {
    public final /* synthetic */ ai f31994a;

    ak(ai aiVar) {
        this.f31994a = aiVar;
    }

    public final void m29215a(VolleyError volleyError) {
        ag agVar = this.f31994a.f31992g;
        String str = this.f31994a.f31988c;
        ar arVar = (ar) agVar.g.remove(str);
        if (arVar != null) {
            agVar.h.put(str, arVar);
            if (agVar.j == null) {
                agVar.j = new am(agVar);
                agVar.i.postDelayed(agVar.j, 100);
            }
            String d = arVar.f32015a != null ? arVar.f32015a.d() : "<null request>";
            PlayCommonLog.m29465f("Bitmap error %s", d);
        }
    }
}
