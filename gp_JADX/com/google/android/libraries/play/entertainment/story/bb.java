package com.google.android.libraries.play.entertainment.story;

import com.google.android.agera.C0899j;
import com.google.android.libraries.play.entertainment.story.model.av;
import com.google.wireless.android.finsky.dfe.g.a.ak;
import com.google.wireless.android.finsky.dfe.g.a.al;
import com.google.wireless.android.finsky.dfe.g.a.an;
import com.google.wireless.android.finsky.dfe.g.a.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

final class bb implements C0899j {
    bb() {
    }

    public final /* synthetic */ Object mo1154a(Object obj) {
        an anVar = (an) obj;
        AtomicInteger atomicInteger = new AtomicInteger(100);
        al alVar = anVar.b;
        if (alVar == null || alVar.b.length == 0) {
            return ba.f30466b;
        }
        Collection arrayList = new ArrayList();
        for (ak akVar : alVar.b) {
            for (r a : akVar.b) {
                if (!av.m28352a(anVar.c, a, atomicInteger, arrayList)) {
                    ba.f30465a.m28054a("Rejected secondary panel: %s", r7[r1]);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return ba.f30466b;
        }
        return arrayList;
    }
}
