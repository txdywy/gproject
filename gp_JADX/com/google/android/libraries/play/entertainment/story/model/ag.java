package com.google.android.libraries.play.entertainment.story.model;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6141k;
import com.google.android.libraries.play.entertainment.story.SnippetView;
import com.google.wireless.android.finsky.dfe.g.a.ae;

final class ag extends ax {
    public static final ax f30568a = new ag();
    public static final int[] f30569b = new int[]{C6089g.panel_title, C6089g.detail_name};
    public static final int[] f30570c = new int[]{C6089g.attribution};

    private ag() {
        super(C6091h.panel_detail);
    }

    public final /* synthetic */ void mo5331a(Object obj) {
        C6121g c6121g = (C6121g) obj;
        c6121g.m28118a();
        C6141k c6141k = (C6141k) c6121g.m28129b(C6141k.class, C6089g.dc_action_dock_helper);
        if (c6141k != null) {
            c6141k.m28345c();
        }
    }

    public final /* synthetic */ void mo5330a(av avVar, Object obj, C2980a c2980a, C6164u c6164u) {
        Object obj2 = (af) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28115a(C6089g.read_more_button_node, c6164u.f30668c.mo3237e(c2980a));
        ax.m28360a(obj2, c6121g, e, f30569b, f30570c, C6089g.detail_description);
        if (obj2.n != null) {
            ((View) c6121g.m28117a(View.class, C6089g.background_panel)).setTag(C6089g.docid_doctype, Integer.valueOf(obj2.n.b.f11834c));
        }
        C6141k c6141k = (C6141k) c6121g.m28129b(C6141k.class, C6089g.dc_action_dock_helper);
        if (c6141k != null) {
            View view = (View) c6121g.m28117a(View.class, C6089g.dc_call_to_action_row);
            if (obj2.t.size() <= 0 || obj2.n.b.f11835d != 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
                c6141k.m28342a(obj2.n);
                c6141k.m28343a(obj2.n, obj2.t, false, obj2.n, c2980a, c2980a);
            }
        }
        c6121g.m28120a(ax.m28359a((av) obj2), C6089g.image_main);
        c6121g.m28124a(obj2.o, C6089g.image_main, "=pf", 3, new C6032d[0]);
        c6121g.m28125a(obj2.k, C6089g.panel_title);
        c6121g.m28125a(obj2.f30565a, C6089g.detail_name);
        c6121g.m28122a(obj2.f30566b, C6089g.detail_description);
        c6121g.m28127a(((ae) C6116b.m28100a(obj2.o)).g, C6089g.attribution);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.image_main, PEImageView.class).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.detail_name, TextView.class).m28116a(view, C6089g.detail_description, SnippetView.class).m28116a(view, C6089g.attribution, TextView.class);
        ((TextView) a.m28117a(TextView.class, C6089g.attribution)).setMovementMethod(LinkMovementMethod.getInstance());
        ((View) a.m28117a(View.class, C6089g.detail_description)).setOnClickListener(new ah(a, c6164u));
        C2998a.m15496l().m15520w();
        Object inflate = ((ViewStub) view.findViewById(C6089g.stub_row)).inflate();
        a.m28115a(C6089g.dc_call_to_action_row, inflate);
        int i = C6089g.dc_action_dock_helper;
        C3006a c3006a = c6164u.f30667b;
        C2993b c2993b = c6164u.f30668c;
        C2998a.m15496l().m15520w();
        a.m28115a(i, new C6141k(c3006a, c2993b, inflate));
        return a;
    }
}
