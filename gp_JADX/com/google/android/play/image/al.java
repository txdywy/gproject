package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.x;
import java.util.List;

final class al implements x {
    public final /* synthetic */ List f31995a;

    al(List list) {
        this.f31995a = list;
    }

    public final /* synthetic */ void b_(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        for (int i = 0; i < this.f31995a.size(); i++) {
            ((an) this.f31995a.get(i)).mo5400a(bitmap);
        }
    }
}
