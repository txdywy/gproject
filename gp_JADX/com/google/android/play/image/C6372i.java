package com.google.android.play.image;

final class C6372i implements Runnable {
    public final /* synthetic */ d f32102a;

    C6372i(d dVar) {
        this.f32102a = dVar;
    }

    public final void run() {
        this.f32102a.l = true;
        for (bu a : this.f32102a.e.values()) {
            this.f32102a.a(a);
        }
        this.f32102a.e.clear();
        this.f32102a.k = null;
        this.f32102a.l = false;
    }
}
