package com.google.android.play.image;

import com.android.volley.x;
import com.google.android.play.utils.PlayCommonLog;
import java.util.List;

final class aj implements x {
    public final /* synthetic */ ai f31993a;

    aj(ai aiVar) {
        this.f31993a = aiVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 1;
        int i2 = 0;
        ao aoVar = (ao) obj;
        ag agVar = this.f31993a.f31992g;
        String str = this.f31993a.f31988c;
        String str2 = this.f31993a.f31989d;
        int i3 = this.f31993a.f31986a;
        int i4 = this.f31993a.f31987b;
        if (this.f31993a.f31991f || aoVar.f32007a.length > agVar.e) {
            PlayCommonLog.m29460a("%s is not cached", str);
        } else {
            ae aeVar = agVar.f;
            if (!(aoVar == null || aoVar.f32007a == null || aoVar.f32007a.length == 0)) {
                ao aoVar2 = (ao) aeVar.f31984a.a(str2);
                if (aoVar2 != null) {
                    int i5;
                    if (aoVar.f32010d >= aoVar2.f32010d) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    if (aoVar.f32008b < aoVar2.f32008b) {
                        i = 0;
                    }
                    if (!(i5 == 0 || r6 == 0)) {
                        aeVar.f31984a.a(str2, aoVar);
                    }
                } else {
                    aeVar.f31984a.a(str2, aoVar);
                }
            }
        }
        ar arVar = (ar) agVar.g.remove(str);
        if (arVar != null) {
            List list = arVar.f32017c;
            x alVar = new al(list);
            while (i2 < list.size()) {
                ((an) list.get(i2)).f32003g = alVar;
                i2++;
            }
            agVar.n.m29235a(str2, aoVar, i3, i4, alVar);
        }
    }
}
