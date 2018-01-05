package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6171o;

final class C6151h extends C6150g {
    C6151h() {
        super();
    }

    protected final /* synthetic */ void mo5337a(bb bbVar, C6164u c6164u, C6121g c6121g, C2980a c2980a, View view, View view2) {
        C6165v c6165v = (C6165v) bbVar;
        if (c6165v.mo5334a() && c6164u.f30667b.mo3273d(c6165v.f30670a.f)) {
            c6164u.f30668c.mo3231b(c2980a);
            c6164u.f30667b.mo3269c(view, c6165v.f30670a.f);
            return;
        }
        c6164u.f30666a.mo5300a(C6171o.m28493a(view.getContext(), c6165v, c2980a), c2980a);
    }

    final /* synthetic */ int mo5338c(bb bbVar) {
        return C6098k.pe__content_description_book;
    }
}
