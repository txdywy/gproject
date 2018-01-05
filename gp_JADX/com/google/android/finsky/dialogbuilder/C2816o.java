package com.google.android.finsky.dialogbuilder;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

final class C2816o implements y {
    public final /* synthetic */ ImageView f15182a;

    C2816o(ImageView imageView) {
        this.f15182a = imageView;
    }

    public final void m14938a(x xVar) {
        Bitmap b = xVar.b();
        if (b != null) {
            this.f15182a.setImageBitmap(b);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        m14938a((x) obj);
    }
}
