package com.google.android.libraries.play.entertainment.media;

final class C6124e implements Runnable {
    public final /* synthetic */ TimeBar f30300a;

    C6124e(TimeBar timeBar) {
        this.f30300a = timeBar;
    }

    public final void run() {
        this.f30300a.m28135a();
        this.f30300a.postDelayed(this, 1000);
    }
}
