package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.b;

public abstract class C4502s extends b {
    public C4502s(Context context) {
        super(context);
    }

    public abstract void mo4236a(String str, Document document, C3748a c3748a, ad adVar, C2495w c2495w);

    public abstract Document getDoc();

    public abstract View getImageView();

    public C4502s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4502s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
