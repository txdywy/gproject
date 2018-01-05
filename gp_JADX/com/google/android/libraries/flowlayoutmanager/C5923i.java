package com.google.android.libraries.flowlayoutmanager;

abstract class C5923i {
    public int f29515f;
    public int f29516g;
    public int f29517h;

    C5923i() {
    }

    protected abstract int mo5205a(boolean z, int i);

    public abstract int mo5208b();

    protected abstract boolean mo5209b(int i);

    public final int m27475c(int i) {
        int i2;
        boolean z = true;
        int i3 = this.f29515f == 0 ? 1 : 0;
        if (mo5208b() == i) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        i3 |= i2;
        if (this.f29517h == -1 || i3 != this.f29516g) {
            if (this.f29517h != -1) {
                z = false;
            }
            this.f29517h = Math.max(0, mo5205a(z, i));
            this.f29516g = i3;
        }
        return this.f29517h;
    }

    public final int m27476d(int i) {
        if (i <= this.f29515f) {
            this.f29517h = -1;
            return 2;
        } else if (!mo5209b(i)) {
            return 0;
        } else {
            this.f29517h = -1;
            return 1;
        }
    }

    public void mo5212e(int i) {
        this.f29515f += i;
    }

    protected void mo5211d() {
        this.f29517h = -1;
        this.f29515f = -1;
        this.f29516g = 0;
    }
}
