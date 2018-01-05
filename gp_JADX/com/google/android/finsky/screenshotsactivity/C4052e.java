package com.google.android.finsky.screenshotsactivity;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v4.p028a.C0217e;
import com.android.ex.photo.p051d.C0556a;
import com.google.android.finsky.cv.p177a.bd;
import java.util.List;

final class C4052e extends C0217e {
    public List f20359x;

    public C4052e(Context context, List list) {
        super(context);
        this.f20359x = list;
    }

    public final Cursor mo982f() {
        Cursor matrixCursor = new MatrixCursor(C0556a.f3757a);
        for (bd bdVar : this.f20359x) {
            matrixCursor.newRow().add(bdVar.f11860f).add("").add(bdVar.f11860f).add(bdVar.f11860f).add("image/WebP");
        }
        return matrixCursor;
    }

    public final /* synthetic */ Object mo274d() {
        return mo982f();
    }
}
