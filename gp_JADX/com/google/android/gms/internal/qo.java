package com.google.android.gms.internal;

public final class qo {
    public final ri f27368a;

    qo(ri riVar) {
        this.f27368a = riVar;
    }

    public final String toString() {
        ri riVar = this.f27368a;
        uu uuVar = rm.f27417d;
        uv uvVar = (uv) uuVar.mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(uuVar);
        rn rnVar = (rn) uvVar;
        int i = riVar.f27409b;
        rnVar.m25315b();
        ((rm) rnVar.b).f27420b = i;
        for (rk rkVar : riVar.f27410c) {
            uu uuVar2 = ro.f27422e;
            uv uvVar2 = (uv) uuVar2.mo4849a(vb.f27556f, null, null);
            uvVar2.m25314a(uuVar2);
            rp rpVar = (rp) uvVar2;
            String str = rkVar.m25465a().f27391a;
            rpVar.m25315b();
            ro.m25479a((ro) rpVar.b, str);
            rs b = rkVar.m25468b();
            rpVar.m25315b();
            ro.m25477a((ro) rpVar.b, b);
            ru d = rkVar.m25470d();
            rpVar.m25315b();
            ro.m25478a((ro) rpVar.b, d);
            int i2 = rkVar.f27415c;
            rpVar.m25315b();
            ((ro) rpVar.b).f27426c = i2;
            ro roVar = (ro) rpVar.m25317d();
            rnVar.m25315b();
            rm.m25472a((rm) rnVar.b, roVar);
        }
        return ((rm) rnVar.m25317d()).toString();
    }
}
