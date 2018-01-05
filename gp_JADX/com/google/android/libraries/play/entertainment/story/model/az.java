package com.google.android.libraries.play.entertainment.story.model;

import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0325v;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.Locale;

public final class az {
    public final C0304u f30620a = new C0304u();
    public final C0325v f30621b = new C0325v();
    public boolean f30622c;

    az() {
    }

    public final az m28412a(Class cls, ax axVar) {
        boolean z;
        C6116b.m28103a(!this.f30622c);
        if (((ax) this.f30620a.put(cls, axVar)) == null) {
            z = true;
        } else {
            z = false;
        }
        C6116b.m28107b(z, String.format(Locale.US, "Same model class %1$s for %2$s and %3$s", new Object[]{cls, axVar, (ax) this.f30620a.put(cls, axVar)}));
        if (((ax) this.f30621b.m1709a(axVar.f30558h)) == null) {
            z = true;
        } else {
            z = false;
        }
        C6116b.m28107b(z, String.format(Locale.US, "Same layout ID 0x%1$x for %2$s and %3$s", new Object[]{Integer.valueOf(axVar.f30558h), axVar, (ax) this.f30621b.m1709a(axVar.f30558h)}));
        this.f30621b.m1710a(axVar.f30558h, axVar);
        return this;
    }

    public final ay m28413b(Class cls, ax axVar) {
        m28412a(cls, axVar);
        this.f30622c = true;
        return new ay(this);
    }
}
