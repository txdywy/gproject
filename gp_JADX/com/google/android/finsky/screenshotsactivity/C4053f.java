package com.google.android.finsky.screenshotsactivity;

import android.os.Bundle;
import android.support.v4.p028a.C0211f;
import com.android.ex.photo.C0568r;
import com.android.ex.photo.C0572j;
import com.google.android.play.image.C1294w;
import java.util.List;

public final class C4053f extends C0572j {
    public final C1294w f20360P;
    public List f20361Q;

    public C4053f(C0568r c0568r, List list, C1294w c1294w) {
        super(c0568r);
        this.f20361Q = list;
        this.f20360P = c1294w;
    }

    public final C0211f mo969a(int i, Bundle bundle) {
        return new C4052e(this.f3812c.mo995m(), this.f20361Q);
    }

    public final C0211f mo1000a(int i, String str) {
        return new C4051d(this.f3812c.mo995m(), str, this.f20360P);
    }

    public final void mo3895m() {
    }

    public final void mo3894l() {
    }
}
