package com.google.android.finsky.layout;

import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import com.google.android.finsky.adapters.C1174q;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.play.image.x;

final class bq extends AsyncTask {
    public final /* synthetic */ ScreenshotGallery f18536a;

    bq(ScreenshotGallery screenshotGallery) {
        this.f18536a = screenshotGallery;
    }

    private final Void m17428a() {
        int i = 0;
        while (!isCancelled() && this.f18536a.f18364h != null) {
            publishProgress(new Integer[]{Integer.valueOf(i)});
            i++;
            if (i >= this.f18536a.f18368l.size()) {
                break;
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

    protected final /* synthetic */ void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        ScreenshotGallery screenshotGallery = this.f18536a;
        int intValue = numArr[0].intValue();
        if (screenshotGallery.f18364h != null) {
            int size = screenshotGallery.f18368l.size();
            screenshotGallery.f18366j = 0;
            bd bdVar = (bd) screenshotGallery.f18368l.get(intValue);
            if (bdVar == null) {
                screenshotGallery.f18369m.add(null);
                return;
            }
            int i;
            C1174q c1174q = screenshotGallery.f18364h;
            c1174q.f7224c[intValue] = bdVar.f11859e;
            if (bdVar.f11863i) {
                screenshotGallery.getHeight();
            }
            x a = screenshotGallery.f18359c.mo1671a(bdVar.f11860f, 0, screenshotGallery.getHeight(), new br(screenshotGallery, intValue, size));
            screenshotGallery.f18369m.add(a);
            if (a.b() != null) {
                i = 1;
                screenshotGallery.f18364h.m7104a(intValue, new BitmapDrawable(screenshotGallery.f18357a, a.b()));
                screenshotGallery.f18369m.set(intValue, null);
            } else {
                i = 0;
            }
            if (i != 0) {
                screenshotGallery.f18362f.mo3397a();
                screenshotGallery.f18371o.post(screenshotGallery.f18372p);
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17428a();
    }
}
