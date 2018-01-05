package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3026a;

final class C2015d implements OnClickListener {
    public final /* synthetic */ C2495w f10419a;
    public final /* synthetic */ C2002e f10420b;
    public final /* synthetic */ Document f10421c;
    public final /* synthetic */ C3026a f10422d;
    public final /* synthetic */ OrderHistoryRowView f10423e;

    C2015d(OrderHistoryRowView orderHistoryRowView, C2495w c2495w, C2002e c2002e, Document document, C3026a c3026a) {
        this.f10423e = orderHistoryRowView;
        this.f10419a = c2495w;
        this.f10420b = c2002e;
        this.f10421c = document;
        this.f10422d = c3026a;
    }

    public final void onClick(View view) {
        this.f10419a.m13379b(new C2475d(this.f10423e.f10386y));
        this.f10420b.mo2586a(this.f10421c.f14885a.f12097d, this.f10422d.f15830r);
    }
}
