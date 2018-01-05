package com.google.android.finsky.playcard;

import android.support.v7.widget.eq;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class bg implements OnClickListener {
    public final /* synthetic */ C3748a f19640a;
    public final /* synthetic */ cv f19641b;
    public final /* synthetic */ ad f19642c;
    public final /* synthetic */ C2495w f19643d;

    bg(C3748a c3748a, cv cvVar, ad adVar, C2495w c2495w) {
        this.f19640a = c3748a;
        this.f19641b = cvVar;
        this.f19642c = adVar;
        this.f19643d = c2495w;
    }

    public final void onClick(View view) {
        if (this.f19640a != null) {
            if (((this.f19641b.f12095b & eq.FLAG_MOVED) != 0 ? 1 : null) != null) {
                Document document = new Document(this.f19641b);
                this.f19640a.mo3655a(document, new C2473o(279, document.f14885a.f12087D, this.f19642c), this.f19643d);
            }
        }
    }
}
