package com.google.android.libraries.play.entertainment.story.model;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6141k;
import com.google.android.libraries.play.entertainment.story.SnippetView;
import com.google.android.libraries.play.entertainment.story.bf;
import java.util.Collections;

final class aj extends ax {
    public static final ax f30575a = new aj();
    public static final int[] f30576b = new int[]{C6089g.panel_title, C6089g.movie_name};

    private aj() {
        super(C6091h.panel_movie_info);
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
        Object obj2 = (ai) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28115a(C6089g.read_more_button_node, c6164u.f30668c.mo3237e(c2980a));
        ax.m28360a(obj2, c6121g, e, f30576b, g, C6089g.movie_synopsis);
        c6121g.m28120a(ax.m28359a((av) obj2), C6089g.image_main);
        c6121g.m28124a(obj2.o, C6089g.image_main, "=pf", 3, new C6032d[0]);
        c6121g.m28125a(obj2.k, C6089g.panel_title);
        c6121g.m28125a(obj2.f30573a.b, C6089g.movie_name);
        c6121g.m28122a(obj2.f30573a.c, C6089g.movie_synopsis);
        View view = (View) c6121g.m28117a(View.class, C6089g.critic_rating_container);
        C6141k c6141k = (C6141k) c6121g.m28129b(C6141k.class, C6089g.dc_action_dock_helper);
        if (c6141k != null) {
            c6141k.m28342a(obj2.n);
            c6141k.m28343a(obj2.n, Collections.emptyList(), false, obj2.n, c2980a, c2980a);
        }
        if (obj2.f30574b != null) {
            OnClickListener onClickListener;
            boolean z;
            view.setVisibility(0);
            c6121g.m28125a(obj2.f30574b.c, C6089g.critic_score);
            SVGImageView sVGImageView = (SVGImageView) c6121g.m28117a(SVGImageView.class, C6089g.critic_icon);
            sVGImageView.setSVG(bf.m28312a(sVGImageView.getContext(), obj2.f30574b.g));
            if (TextUtils.isEmpty(obj2.f30574b.f)) {
                onClickListener = null;
            } else {
                onClickListener = new al(obj2.f30574b.f);
            }
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            view.setFocusable(z);
            return;
        }
        view.setVisibility(8);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.image_main, PEImageView.class).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.movie_name, TextView.class).m28116a(view, C6089g.movie_synopsis, SnippetView.class).m28116a(view, C6089g.critic_score, TextView.class).m28116a(view, C6089g.text_container, View.class).m28116a(view, C6089g.critic_icon, SVGImageView.class).m28116a(view, C6089g.critic_rating_container, View.class);
        ((View) a.m28117a(View.class, C6089g.movie_synopsis)).setOnClickListener(new ak(a, c6164u));
        C2998a.m15496l().m15520w();
        View findViewById = view.findViewById(C6089g.dc_call_to_action_row);
        findViewById.setVisibility(0);
        int i = C6089g.dc_action_dock_helper;
        C3006a c3006a = c6164u.f30667b;
        C2993b c2993b = c6164u.f30668c;
        C2998a.m15496l().m15520w();
        a.m28115a(i, new C6141k(c3006a, c2993b, findViewById));
        return a;
    }
}
