package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bw;
import android.support.v7.widget.hi;
import android.support.v7.widget.hk;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window.Callback;
import java.util.ArrayList;

final class bj extends C0404a {
    public bw f2364a;
    public boolean f2365b;
    public Callback f2366c;
    public boolean f2367d;
    public boolean f2368e;
    public ArrayList f2369f = new ArrayList();
    public final Runnable f2370g = new bk(this);
    public final hi f2371h = new bl(this);

    bj(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f2364a = new hk(toolbar, false);
        this.f2366c = new bo(this, callback);
        this.f2364a.mo890a(this.f2366c);
        toolbar.setOnMenuItemClickListener(this.f2371h);
        this.f2364a.mo891a(charSequence);
    }

    public final void mo563a(Drawable drawable) {
        this.f2364a.mo895b(drawable);
    }

    public final void mo581f() {
    }

    public final void mo560a(float f) {
        ai.m1851g(this.f2364a.mo884a(), f);
    }

    public final Context mo582g() {
        return this.f2364a.mo893b();
    }

    public final void mo575c(Drawable drawable) {
        this.f2364a.mo898c(drawable);
    }

    public final void mo561a(int i) {
        this.f2364a.mo902d(i);
    }

    public final void mo573b(boolean z) {
    }

    public final void mo570b(int i) {
        this.f2364a.mo905e(i);
    }

    public final void mo577c(boolean z) {
    }

    public final void mo565a(CharSequence charSequence) {
        this.f2364a.mo896b(charSequence);
    }

    public final void mo576c(CharSequence charSequence) {
        this.f2364a.mo891a(charSequence);
    }

    public final void mo572b(CharSequence charSequence) {
        this.f2364a.mo899c(charSequence);
    }

    public final void mo562a(int i, int i2) {
        this.f2364a.mo897c((this.f2364a.mo916o() & (i2 ^ -1)) | (i & i2));
    }

    public final void mo559a() {
        mo562a(2, 2);
    }

    public final void mo566a(boolean z) {
        mo562a(z ? 4 : 0, 4);
    }

    public final void mo571b(Drawable drawable) {
        this.f2364a.mo903d(drawable);
    }

    public final int mo569b() {
        return this.f2364a.mo916o();
    }

    public final int mo574c() {
        return this.f2364a.mo919r();
    }

    public final void mo578d() {
        this.f2364a.mo907f(0);
    }

    public final void mo580e() {
        this.f2364a.mo907f(8);
    }

    public final boolean mo583j() {
        return this.f2364a.mo912k();
    }

    public final boolean mo584k() {
        return this.f2364a.mo913l();
    }

    public final boolean mo585l() {
        this.f2364a.mo884a().removeCallbacks(this.f2370g);
        ai.m1830a(this.f2364a.mo884a(), this.f2370g);
        return true;
    }

    public final boolean mo586m() {
        if (!this.f2364a.mo900c()) {
            return false;
        }
        this.f2364a.mo901d();
        return true;
    }

    public final boolean mo568a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo583j();
        }
        return true;
    }

    public final boolean mo567a(int i, KeyEvent keyEvent) {
        Menu o = m2525o();
        if (o == null) {
            return false;
        }
        boolean z;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
            z = true;
        } else {
            z = false;
        }
        o.setQwertyMode(z);
        return o.performShortcut(i, keyEvent, 0);
    }

    final void mo587n() {
        this.f2364a.mo884a().removeCallbacks(this.f2370g);
    }

    public final void mo564a(C0413c c0413c) {
        this.f2369f.add(c0413c);
    }

    public final void mo579d(boolean z) {
        if (z != this.f2368e) {
            this.f2368e = z;
            int size = this.f2369f.size();
            for (int i = 0; i < size; i++) {
                ((C0413c) this.f2369f.get(i)).mo991a(z);
            }
        }
    }

    final Menu m2525o() {
        if (!this.f2367d) {
            this.f2364a.mo887a(new bm(this), new bn(this));
            this.f2367d = true;
        }
        return this.f2364a.mo920s();
    }
}
