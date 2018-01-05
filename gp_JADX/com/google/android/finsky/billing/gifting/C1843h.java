package com.google.android.finsky.billing.gifting;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C1843h implements OnClickListener {
    public final /* synthetic */ cv f9471a;
    public final /* synthetic */ C2495w f9472b;
    public final /* synthetic */ C2473o f9473c;
    public final /* synthetic */ PlayCreditGiftingRow f9474d;

    C1843h(PlayCreditGiftingRow playCreditGiftingRow, cv cvVar, C2495w c2495w, C2473o c2473o) {
        this.f9474d = playCreditGiftingRow;
        this.f9471a = cvVar;
        this.f9472b = c2495w;
        this.f9473c = c2473o;
    }

    public final void onClick(View view) {
        this.f9474d.f9435b.mo2463a(new Document(this.f9471a), this.f9471a.f12107n[0].f11907B);
        this.f9472b.m13379b(new C2475d(this.f9473c));
    }
}
