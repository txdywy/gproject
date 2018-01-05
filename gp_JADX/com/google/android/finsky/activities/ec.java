package com.google.android.finsky.activities;

import android.support.v4.app.C0254u;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;

final class ec implements OnClickListener {
    public final /* synthetic */ OnClickListener f6697a;
    public final /* synthetic */ Document f6698b;
    public final /* synthetic */ dx f6699c;

    ec(dx dxVar, OnClickListener onClickListener, Document document) {
        this.f6699c = dxVar;
        this.f6697a = onClickListener;
        this.f6698b = document;
    }

    public final void onClick(View view) {
        C0254u h = this.f6699c.m603h();
        if (!this.f6699c.ar) {
            this.f6699c.ar = true;
            Runnable edVar = new ed(this, view);
            if (h instanceof InlineAppDetailsDialog) {
                ((InlineAppDetailsDialog) h).m6126a(false, edVar);
            } else {
                edVar.run();
            }
        }
    }
}
