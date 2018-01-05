package com.google.android.finsky.layout;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.squareup.leakcanary.C7582R;

final class br implements y {
    public final /* synthetic */ int f18537a;
    public final /* synthetic */ int f18538b;
    public final /* synthetic */ ScreenshotGallery f18539c;

    br(ScreenshotGallery screenshotGallery, int i, int i2) {
        this.f18539c = screenshotGallery;
        this.f18537a = i;
        this.f18538b = i2;
    }

    public final void m17429a(x xVar) {
        if (this.f18539c.f18364h != null) {
            this.f18539c.f18369m.set(this.f18537a, null);
            if (xVar.b() == null) {
                ScreenshotGallery screenshotGallery = this.f18539c;
                int i = screenshotGallery.f18366j + 1;
                screenshotGallery.f18366j = i;
                if (i == this.f18538b) {
                    this.f18539c.f18362f.m16127a(1, this.f18539c.getContext().getString(C7582R.string.screenshots_not_loaded));
                    return;
                }
                return;
            }
            if (!(this.f18539c.f18362f.f16393l == 2)) {
                this.f18539c.f18362f.mo3397a();
            }
            Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), new BitmapDrawable(this.f18539c.f18357a, r3)});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(250);
            this.f18539c.f18364h.m7104a(this.f18537a, transitionDrawable);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        m17429a((x) obj);
    }
}
