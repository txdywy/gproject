package com.google.android.libraries.play.entertainment.story.model;

import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.wireless.android.finsky.dfe.g.a.x;

public class bi extends bb {
    public static C6090b f30633a = C6090b.m28050a();

    static bi m28430a(aw awVar, x xVar) {
        if (!av.m28351a(xVar.d)) {
            f30633a.m28057b("No image: SKIP panel [%s : %s]", xVar.b, xVar.c);
            return null;
        } else if (awVar.f30616n == null) {
            f30633a.m28057b("Only cluster supported: SKIP panel [%s : %s]", xVar.b, xVar.c);
            return null;
        } else if (awVar.f30614l != 1) {
            f30633a.m28057b("Only DETAILS_PAGE interaction supported: SKIP panel [%s : %s]", xVar.b, xVar.c);
            return null;
        } else {
            av.m28349a(xVar.c, xVar.e);
            awVar.f30612j = xVar.e;
            awVar.f30613k = 14;
            awVar.f30607e = xVar.d;
            return new bi(awVar, xVar);
        }
    }

    private bi(aw awVar, x xVar) {
        super(awVar, xVar.c, 2, 0);
    }
}
