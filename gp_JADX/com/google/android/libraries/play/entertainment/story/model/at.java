package com.google.android.libraries.play.entertainment.story.model;

import android.support.v7.widget.fr;
import com.google.android.agera.p100a.C0891h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.List;

final class at extends C0891h {
    public final ay f30598a;

    at(ay ayVar) {
        this.f30598a = ayVar;
    }

    public final /* synthetic */ void mo5310a(Object obj, int i, fr frVar) {
        av avVar = (av) ((List) obj).get(i);
        au auVar = (au) frVar;
        C2980a a = auVar.f30602w.f30668c.mo3222a(avVar.f30533l, avVar.f30534m, auVar.f30601v);
        if (avVar.f30535n != null) {
            a = auVar.f30602w.f30668c.mo3229b(avVar.f30535n.f, a);
        }
        auVar.f30602w.f30668c.mo3226a(a);
        auVar.f30599t.mo5330a(avVar, auVar.f30600u, a, auVar.f30602w);
    }

    public final /* synthetic */ int mo5311b(Object obj, int i) {
        List list = (List) obj;
        ay ayVar = this.f30598a;
        Object obj2 = ((av) list.get(i)).getClass();
        C6116b.m28100a(obj2);
        return ((ax) C6116b.m28101a(ayVar.m28411a(obj2), "No compatible binder for model type %s or supertypes", obj2)).f30558h;
    }

    public final /* synthetic */ long mo5308a(Object obj, int i) {
        return (long) ((av) ((List) obj).get(i)).f30531j;
    }

    public final /* synthetic */ int mo5307a(Object obj) {
        return ((List) obj).size();
    }
}
