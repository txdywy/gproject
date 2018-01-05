package com.google.android.finsky;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.dfe.j.a.b;

final class C3157h implements C0660x {
    public final /* synthetic */ ab f16321a;
    public final /* synthetic */ DfeNotificationManagerImpl f16322b;

    C3157h(DfeNotificationManagerImpl dfeNotificationManagerImpl, ab abVar) {
        this.f16322b = dfeNotificationManagerImpl;
        this.f16321a = abVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        Object obj2 = 1;
        b bVar = (b) obj;
        if (bVar.d() != null) {
            if (((bVar.d().b & 4) != 0 ? 1 : null) != null) {
                this.f16322b.m5709a(bVar.d(), this.f16321a.f, this.f16321a.h);
                return;
            }
        }
        if (bVar.e() != null) {
            if (((bVar.e().a & 1) != 0 ? 1 : null) != null) {
                this.f16322b.m5711a(bVar.e(), this.f16321a.h);
                return;
            }
        }
        if (bVar.f() != null) {
            if ((bVar.f().a & 1) == 0) {
                obj2 = null;
            }
            if (obj2 != null) {
                this.f16322b.m5710a(bVar.f());
                return;
            }
        }
        DfeNotificationManagerImpl.m5701a(bVar);
    }
}
