package com.google.android.play.image;

import android.graphics.Bitmap;
import android.support.v4.h.i;
import java.util.ArrayList;

final class C6367c extends i {
    public C6367c(int i) {
        super(i);
    }

    protected final /* synthetic */ int m29279b(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj2;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Bitmap bitmap = ((C6381v) arrayList.get(i2)).f32131a;
            i += bitmap.getHeight() * bitmap.getRowBytes();
        }
        return i;
    }
}
