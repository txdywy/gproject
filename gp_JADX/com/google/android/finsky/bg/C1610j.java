package com.google.android.finsky.bg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.android.volley.C0684b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.u;
import com.google.android.play.image.x;
import com.google.android.play.utils.e;
import com.google.android.play.utils.p354b.C6322j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C1610j extends AsyncTask {
    public final /* synthetic */ x f8524a;
    public final /* synthetic */ u f8525b;
    public final /* synthetic */ C1609i f8526c;

    C1610j(C1609i c1609i, x xVar, u uVar) {
        this.f8526c = c1609i;
        this.f8524a = xVar;
        this.f8525b = uVar;
    }

    private final Bitmap m9267a() {
        C0684b a = this.f8526c.f8523b.mo1064a(this.f8524a.c());
        if (a == null || a.m4487a()) {
            return null;
        }
        byte[] bArr = a.f4131a;
        if (bArr == null) {
            return null;
        }
        synchronized (C1609i.f8522a) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        if (((Boolean) C6322j.f31612z.m28964b()).booleanValue()) {
            return e.a(decodeByteArray, this.f8524a.c(), bArr.length / MemoryMappedFileBuffer.DEFAULT_PADDING);
        }
        return decodeByteArray;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            FinskyLog.m21662b("[Image-MISS] Request for %s was NOT found in disk based cache", this.f8524a.c());
            return;
        }
        FinskyLog.m21662b("[Image-HIT] Request for %s WAS found in disk based cache", this.f8524a.c());
        if (this.f8524a.b() == null || this.f8524a.b().getWidth() < bitmap.getWidth()) {
            this.f8524a.a(bitmap);
            this.f8525b.a(this.f8524a.c(), bitmap.getWidth(), bitmap.getHeight(), bitmap);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m9267a();
    }
}
