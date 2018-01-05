package com.google.android.libraries.play.entertainment.story;

import android.app.Activity;
import android.support.v4.app.ab;
import android.text.TextUtils;
import com.google.android.libraries.play.entertainment.media.C3000i;
import com.google.android.libraries.play.entertainment.media.C6082f;
import com.google.android.libraries.play.entertainment.media.C6084g;
import com.google.android.libraries.play.entertainment.media.C6125h;

final class ay implements C6125h {
    public final Activity f30456a;
    public final C6082f f30457b;
    public String f30458c;
    public final /* synthetic */ ar f30459d;

    ay(ar arVar, C3000i c3000i, Activity activity, ab abVar, int i) {
        this.f30459d = arVar;
        this.f30456a = activity;
        this.f30457b = c3000i.mo3253a(abVar, i, this);
    }

    public final void m28292b() {
        if (this.f30458c != null) {
            this.f30458c = null;
            this.f30457b.mo5283a();
            this.f30459d.f30412i.f30306A.setTimeProvider(null);
        }
    }

    public final boolean m28293c() {
        return this.f30458c != null;
    }

    public final void mo5316a(String str) {
        if (TextUtils.equals(this.f30458c, str) && this.f30459d.f30412i.f30309D != 6) {
            this.f30459d.m28266f();
            this.f30459d.f30412i.f30306A.setTimeProvider(null);
            this.f30459d.f30412i.m28160a(false);
        }
    }

    public final void mo5315a(C6084g c6084g) {
        if (m28293c()) {
            m28288d();
            c6084g.mo5288a(this.f30456a).show();
        }
    }

    public final void mo5314a() {
        if (m28293c()) {
            m28288d();
        }
    }

    private final void m28288d() {
        m28292b();
        this.f30459d.m28266f();
        this.f30459d.f30412i.f30306A.setTimeProvider(null);
        this.f30459d.f30412i.m28160a(false);
    }
}
