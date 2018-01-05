package com.android.ex.photo.p050c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.p028a.C0217e;
import com.android.ex.photo.p051d.C0556a;

public final class C0554d extends C0217e {
    public final String[] f3754i;
    public final Uri f3755x;

    public C0554d(Context context, Uri uri, String[] strArr) {
        super(context);
        this.f3755x = uri;
        if (strArr == null) {
            strArr = C0556a.f3757a;
        }
        this.f3754i = strArr;
    }

    public final Cursor mo982f() {
        this.f1221h = this.f3755x.buildUpon().appendQueryParameter("contentType", "image/").build();
        this.f1222i = this.f3754i;
        return super.mo982f();
    }

    public final /* synthetic */ Object mo274d() {
        return mo982f();
    }
}
