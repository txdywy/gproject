package com.android.ex.photo.p052e;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

class C0561c implements C0560f {
    public final ContentResolver f3762a;
    public final Uri f3763b;

    public C0561c(ContentResolver contentResolver, Uri uri) {
        this.f3762a = contentResolver;
        this.f3763b = uri;
    }

    public InputStream mo992a() {
        return this.f3762a.openInputStream(this.f3763b);
    }
}
