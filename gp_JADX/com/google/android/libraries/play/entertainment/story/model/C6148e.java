package com.google.android.libraries.play.entertainment.story.model;

import android.content.res.Resources;
import android.support.v4.p028a.p029a.C0206f;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6087f;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.SnippetView;
import com.google.wireless.android.finsky.dfe.g.a.aa;

final class C6148e extends ax {
    public static final ax f30646a = new C6148e();
    public static final int[] f30647b = new int[]{C6089g.publisher_name, C6089g.attribution};

    private C6148e() {
        super(C6091h.panel_article);
    }

    public final /* synthetic */ void mo5331a(Object obj) {
        ((C6121g) obj).m28118a();
    }

    public final /* synthetic */ void mo5330a(av avVar, Object obj, C2980a c2980a, C6164u c6164u) {
        int i;
        Object obj2 = (C6147d) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28115a(C6089g.read_more_button_node, c6164u.f30668c.mo3237e(c2980a));
        ax.m28360a(obj2, c6121g, e, f, f30647b, C6089g.snippet);
        SnippetView snippetView = (SnippetView) c6121g.m28117a(SnippetView.class, C6089g.snippet);
        Resources resources = snippetView.getResources();
        if (obj2.p == -16777216) {
            i = C6087f.play_highlight_overlay_light;
        } else {
            i = C6087f.play_highlight_overlay_dark;
        }
        snippetView.setForeground(C0206f.m1065a(resources, i, snippetView.getContext().getTheme()));
        snippetView.setMoreHintColor(obj2.p);
        snippetView.setEraseColor(obj2.r);
        c6121g.m28120a(ax.m28359a((av) obj2), C6089g.image_main);
        c6121g.m28124a(obj2.o, C6089g.image_main, "=pf", 3, new C6032d[0]);
        c6121g.m28125a(obj2.k, C6089g.panel_title);
        aa aaVar = obj2.f30645a;
        c6121g.m28125a(aaVar.b, C6089g.title);
        c6121g.m28124a(aaVar.g, C6089g.publisher_icon, "=pf", 3, new C6032d[0]);
        c6121g.m28125a(aaVar.f, C6089g.publisher_name);
        c6121g.m28127a(aaVar.c, C6089g.snippet);
        c6121g.m28127a(aaVar.j, C6089g.attribution);
        ((View) c6121g.m28117a(View.class, C6089g.amp_icon_view)).setVisibility(aaVar.k == 1 ? 0 : 8);
        ((View) c6121g.m28117a(View.class, C6089g.amp_label_view)).setVisibility(aaVar.k == 1 ? 0 : 8);
        if (aaVar.k == 1) {
            c6164u.f30666a.mo5303a(aaVar);
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.image_main, PEImageView.class).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.title, TextView.class).m28116a(view, C6089g.publisher_icon, PEImageView.class).m28116a(view, C6089g.publisher_name, TextView.class).m28116a(view, C6089g.snippet, SnippetView.class).m28116a(view, C6089g.attribution, TextView.class).m28116a(view, C6089g.amp_icon_view, View.class).m28116a(view, C6089g.amp_label_view, View.class);
        ((TextView) a.m28117a(TextView.class, C6089g.attribution)).setMovementMethod(LinkMovementMethod.getInstance());
        OnClickListener c6149f = new C6149f(a, c6164u);
        ((View) a.m28117a(View.class, C6089g.snippet)).setOnClickListener(c6149f);
        view.findViewById(C6089g.publisher_row).setOnClickListener(c6149f);
        return a;
    }
}
