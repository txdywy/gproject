package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

public final class C3729v implements OnClickListener {
    public final /* synthetic */ C2495w f18854a;
    public final /* synthetic */ ad f18855b;
    public final /* synthetic */ C3748a f18856c;
    public final /* synthetic */ Document f18857d;
    public final /* synthetic */ DetailsTitleCreatorBlock f18858e;

    public C3729v(DetailsTitleCreatorBlock detailsTitleCreatorBlock, C2495w c2495w, ad adVar, C3748a c3748a, Document document) {
        this.f18858e = detailsTitleCreatorBlock;
        this.f18854a = c2495w;
        this.f18855b = adVar;
        this.f18856c = c3748a;
        this.f18857d = document;
    }

    public final void onClick(View view) {
        this.f18854a.m13379b(new C2475d(this.f18855b).m13256a(126));
        if (C3760e.m17903a() && this.f18858e.f18130a.getVisibility() == 0) {
            this.f18856c.mo3653a(this.f18857d, this.f18858e.f18130a, this.f18854a);
        } else {
            this.f18856c.mo3657a(this.f18857d, this.f18854a);
        }
    }
}
