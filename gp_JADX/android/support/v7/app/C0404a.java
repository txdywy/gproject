package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.view.KeyEvent;

public abstract class C0404a {
    public abstract void mo559a();

    public abstract void mo562a(int i, int i2);

    public abstract void mo563a(Drawable drawable);

    public abstract void mo564a(C0413c c0413c);

    public abstract void mo565a(CharSequence charSequence);

    public abstract void mo566a(boolean z);

    public abstract int mo569b();

    public abstract void mo571b(Drawable drawable);

    public abstract void mo572b(CharSequence charSequence);

    public abstract int mo574c();

    public abstract void mo578d();

    public abstract void mo580e();

    public void mo581f() {
    }

    public Context mo582g() {
        return null;
    }

    public void mo575c(Drawable drawable) {
    }

    public void mo561a(int i) {
    }

    public void mo570b(int i) {
    }

    public void mo593h() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void mo560a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void mo573b(boolean z) {
    }

    public void mo577c(boolean z) {
    }

    public void mo594i() {
    }

    public void mo579d(boolean z) {
    }

    public C0412b mo590a(C0409c c0409c) {
        return null;
    }

    public boolean mo583j() {
        return false;
    }

    public boolean mo584k() {
        return false;
    }

    public boolean mo585l() {
        return false;
    }

    public boolean mo568a(KeyEvent keyEvent) {
        return false;
    }

    public boolean mo567a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean mo586m() {
        return false;
    }

    public void mo576c(CharSequence charSequence) {
    }

    void mo587n() {
    }
}
