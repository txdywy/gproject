package com.google.android.finsky.layout;

final class bp implements Runnable {
    public final /* synthetic */ ScreenshotGallery f18535a;

    bp(ScreenshotGallery screenshotGallery) {
        this.f18535a = screenshotGallery;
    }

    public final void run() {
        this.f18535a.f18364h.f7225d.notifyInvalidated();
    }
}
