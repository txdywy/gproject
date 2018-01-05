package com.google.android.libraries.play.entertainment.story.model;

import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.aj;

public class bg extends bb {
    public final aj f30631a;

    static bg m28423a(aw awVar, aj ajVar, ai aiVar, int i) {
        if (awVar.f30614l != 0 || ajVar == null || aiVar == null || !av.m28351a(ajVar.c)) {
            return null;
        }
        int i2;
        awVar.f30612j = aiVar;
        awVar.f30613k = i;
        awVar.f30607e = ajVar.c;
        awVar.f30607e.a(1920);
        awVar.f30607e.b(1080);
        if (aiVar.b.f11835d == 3) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        return new bg(awVar, aiVar.i, i2, ajVar);
    }

    private bg(aw awVar, String str, int i, aj ajVar) {
        super(awVar, str, 2, i);
        this.f30631a = ajVar;
    }

    public final boolean mo5334a() {
        return true;
    }
}
