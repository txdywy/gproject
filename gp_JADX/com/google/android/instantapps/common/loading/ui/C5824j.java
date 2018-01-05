package com.google.android.instantapps.common.loading.ui;

final /* synthetic */ class C5824j implements Runnable {
    public final C5822h f29292a;

    C5824j(C5822h c5822h) {
        this.f29292a = c5822h;
    }

    public final void run() {
        C5822h c5822h = this.f29292a;
        if (c5822h.f29286f.isShown()) {
            c5822h.f29288h.animate().translationY((float) (c5822h.f29288h.getHeight() * -1)).setDuration(250);
        }
    }
}
