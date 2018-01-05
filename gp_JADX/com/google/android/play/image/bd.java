package com.google.android.play.image;

import android.graphics.Bitmap;
import android.os.AsyncTask;

final class bd extends AsyncTask {
    public final /* synthetic */ int f32048a;
    public final /* synthetic */ int f32049b;
    public final /* synthetic */ ad f32050c;
    public final /* synthetic */ FifeImageView f32051d;

    bd(FifeImageView fifeImageView, int i, int i2, ad adVar) {
        this.f32051d = fifeImageView;
        this.f32048a = i;
        this.f32049b = i2;
        this.f32050c = adVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.f32051d.f31932E = null;
        this.f32050c.mo5405a(bitmap);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f32051d.f31931D.a(((Bitmap[]) objArr)[0], this.f32048a, this.f32049b);
    }
}
