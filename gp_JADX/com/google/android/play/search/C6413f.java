package com.google.android.play.search;

final class C6413f implements Runnable {
    public final /* synthetic */ PlaySearch f32354a;

    C6413f(PlaySearch playSearch) {
        this.f32354a = playSearch;
    }

    public final void run() {
        if (this.f32354a.f32280s != null && !this.f32354a.hasFocus()) {
            this.f32354a.f32280s.m29446b();
        }
    }
}
