package com.google.android.libraries.play.entertainment.story.model;

import android.view.View;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.SnippetView;

final class C6166w extends bc {
    public static final ax f30671a = new C6166w();

    private C6166w() {
        super(C6091h.panel_book);
    }

    public final C6121g mo5335b(View view, C6164u c6164u) {
        C6121g a = super.mo5335b(view, c6164u).m28116a(view, C6089g.book_description, SnippetView.class);
        ((View) a.m28117a(View.class, C6089g.book_description)).setOnClickListener(new C6167x(a, c6164u));
        return a;
    }

    private final void m28479a(C6165v c6165v, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        String str;
        int i;
        int i2 = 0;
        super.mo5333a((bb) c6165v, c6121g, c2980a, c6164u);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28115a(C6089g.read_more_button_node, c6164u.f30668c.mo3237e(c2980a));
        ax.m28360a(c6165v, c6121g, e, f, g, C6089g.book_description);
        if (c6165v.f30670a.c != null) {
            str = c6165v.f30670a.c.b;
        } else {
            str = "";
        }
        c6121g.m28127a(str, C6089g.book_description);
        if (c6165v.mo5334a() && c6164u.f30667b.mo3273d(c6165v.f30670a.f)) {
            i = 1;
        } else {
            i = 0;
        }
        View view = (View) c6121g.m28129b(View.class, C6089g.playback_button);
        if (view != null) {
            if (i == 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
