package com.google.android.libraries.play.entertainment.story.model;

import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.wireless.android.finsky.dfe.g.a.b;

public class C6144a extends bb {
    public static final C6090b f30547a = C6090b.m28050a();
    public final b f30548b;

    static C6144a m28356a(aw awVar, b bVar) {
        int i;
        int i2 = 1;
        if (av.m28351a(bVar.e)) {
            i = 0;
        } else {
            f30547a.m28054a("Invalid image", new Object[0]);
            i = 1;
        }
        if (bVar.f == null) {
            f30547a.m28054a("Missing resource data", new Object[0]);
            i = 1;
        }
        if (i != 0) {
            return null;
        }
        av.m28349a(bVar.b, bVar.f);
        awVar.f30612j = bVar.f;
        awVar.f30613k = 12;
        awVar.f30607e = bVar.e;
        if (awVar.f30607e.e <= 0 || awVar.f30607e.d <= 0) {
            awVar.f30607e.a(512);
            awVar.f30607e.b(512);
        }
        if (awVar.f30616n != null && awVar.f30616n.f30551c == 3) {
            i = -1;
        } else if (bVar.g == 1) {
            i = 4;
            i2 = 2;
        } else {
            i = 3;
            i2 = 2;
        }
        return new C6144a(awVar, bVar, i2, i);
    }

    private C6144a(aw awVar, b bVar, int i, int i2) {
        super(awVar, bVar.b, i, i2);
        this.f30548b = bVar;
    }
}
