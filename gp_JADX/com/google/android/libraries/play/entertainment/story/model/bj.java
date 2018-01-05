package com.google.android.libraries.play.entertainment.story.model;

import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.wireless.android.finsky.dfe.g.a.y;

public class bj extends bb {
    public static final C6090b f30634a = C6090b.m28050a();
    public final y f30635b;

    static bj m28431a(aw awVar, y yVar) {
        if (!av.m28351a(yVar.d)) {
            return null;
        }
        av.m28349a(yVar.b, yVar.e);
        awVar.f30612j = yVar.e;
        awVar.f30613k = 11;
        awVar.f30607e = yVar.d;
        switch (yVar.f) {
            case 0:
            case 1:
                break;
            case 2:
                return new bk(awVar, yVar);
            default:
                f30634a.m28057b("Unknown TvShowPanel.Type %s. Falling back to LAYOUT_TYPE_ABOUT.", Integer.valueOf(yVar.f));
                break;
        }
        return new bj(awVar, yVar);
    }

    bj(aw awVar, y yVar) {
        super(awVar, yVar.b, 2, 0);
        this.f30635b = yVar;
    }
}
