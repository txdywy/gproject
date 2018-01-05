package com.google.android.finsky.playcard;

import android.text.TextUtils;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;

final class aq extends C3901z {
    aq() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardViewSmall flatCardViewSmall = (FlatCardViewSmall) dVar;
        super.mo3861a(flatCardViewSmall, document, c3748a, c2495w);
        int i = 0;
        if (flatCardViewSmall.getSnippet2() != null && (document.bo() || document.m14658m() || !TextUtils.isEmpty(document.aG()))) {
            i = 2;
        }
        if (document.f14885a.f12098e == 44) {
            i |= 4;
        }
        if (document.m14668w()) {
            i |= 16;
        }
        flatCardViewSmall.setTextContentFlags(i);
    }
}
