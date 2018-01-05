package com.google.android.libraries.play.entertainment.story.model;

import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0325v;

final class ay {
    public final C0304u f30618a;
    public final C0325v f30619b;

    ay(az azVar) {
        this.f30618a = azVar.f30620a;
        this.f30619b = azVar.f30621b;
    }

    final ax m28411a(Class cls) {
        while (cls != null && av.class.isAssignableFrom(cls)) {
            ax axVar = (ax) this.f30618a.get(cls);
            if (axVar != null) {
                return axVar;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }
}
