package com.google.android.finsky.stream.base.playcluster;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;

final class C4286i implements OnClickListener {
    public final /* synthetic */ C3748a f21642a;
    public final /* synthetic */ Document f21643b;
    public final /* synthetic */ C2495w f21644c;
    public final /* synthetic */ C2628h f21645d;

    C4286i(C2628h c2628h, C3748a c3748a, Document document, C2495w c2495w) {
        this.f21645d = c2628h;
        this.f21642a = c3748a;
        this.f21643b = document;
        this.f21644c = c2495w;
    }

    public final void onClick(View view) {
        this.f21642a.mo3655a(this.f21643b, this.f21645d.getPlayStoreUiElementNode(), this.f21644c);
    }
}
