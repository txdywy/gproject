package com.google.android.finsky.bg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.android.volley.a;
import com.android.volley.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.u;
import com.google.android.play.image.x;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;
import com.google.android.play.utils.e;

protected final class com.google.android.finsky.bg.j extends AsyncTask
{

    public final com.google.android.play.image.x a;
    public final com.google.android.play.image.u b;
    public final com.google.android.finsky.bg.i c;

    j(com.google.android.finsky.bg.i p0, com.google.android.play.image.x p1, com.google.android.play.image.u p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    private final Bitmap a() {
        v0 = 0;
        v1 = this.c.b.a(this.a.c());
        if (v1 != 0 && !v1.a()) {
            v2 = v1.a;
            if (v2 != 0) {
                enter com.google.android.finsky.bg.i.a;
                try {
                    v1 = BitmapFactory.decodeByteArray(v2, 0, v2.length);
                    exit com.google.android.finsky.bg.i.a;
                }
                catch (Throwable ex) {
                    try {
                        exit com.google.android.finsky.bg.i.a;
                    }
                    catch (Throwable ex) {
                        exit com.google.android.finsky.bg.i.a;
                        throw ex;
                    }
                    throw ex;
                }
                if (((Boolean)com.google.android.play.utils.b.j.z.b()).booleanValue())
                    v0 = com.google.android.play.utils.e.a(v1, this.a.c(), v2.length / 1024);
                else
                    v0 = v1;
            }
        }
        return v0;
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a();
    }

    protected final void onPostExecute(Object p0) {
        if ((Bitmap)p0 == 0) {
            v1 = new Object[1];
            v1[0] = this.a.c();
            FinskyLog.b("[Image-MISS] Request for %s was NOT found in disk based cache", v1);
        }
        else {
            v1 = new Object[1];
            v1[0] = this.a.c();
            FinskyLog.b("[Image-HIT] Request for %s WAS found in disk based cache", v1);
            if (this.a.b() == 0 || this.a.b().getWidth() < ((Bitmap)p0).getWidth()) {
                this.a.a((Bitmap)p0);
                this.b.a(this.a.c(), ((Bitmap)p0).getWidth(), ((Bitmap)p0).getHeight(), (Bitmap)p0);
            }
        }
    }

}
