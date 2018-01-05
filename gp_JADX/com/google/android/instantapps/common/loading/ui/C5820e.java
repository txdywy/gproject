package com.google.android.instantapps.common.loading.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.instantapps.common.atom.AtomReference;
import com.google.android.instantapps.p309a.C5699f;

public abstract class C5820e extends Fragment {
    public C3374f f29281a;
    public boolean f29282b;
    public boolean f29283c;

    public abstract void mo5162X();

    public abstract void mo5163Y();

    public abstract void mo5164Z();

    public abstract void mo5165a(float f);

    public abstract void mo5166a(int i);

    public abstract void mo5167a(Bitmap bitmap);

    public abstract void mo5168a(AtomReference atomReference);

    public abstract void mo5169a(String str);

    public abstract void aa();

    public abstract void mo5171b(String str);

    public abstract void mo5172c(String str);

    public void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        C5699f.m26963b(m603h() instanceof C3374f);
        this.f29281a = (C3374f) m603h();
    }

    protected final boolean mo968W() {
        return this.f760q.getBoolean("ARG_INITIALLY_HIDDEN", false);
    }
}
