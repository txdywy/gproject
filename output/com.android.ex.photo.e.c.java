package com.android.ex.photo.e;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public class com.android.ex.photo.e.c implements com.android.ex.photo.e.f
{

    public final ContentResolver a;
    public final Uri b;

    c(ContentResolver p0, Uri p1) {
        this.a = p0;
        this.b = p1;
    }

    public InputStream a() {
        return this.a.openInputStream(this.b);
    }

}
