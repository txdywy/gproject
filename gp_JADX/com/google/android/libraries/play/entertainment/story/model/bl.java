package com.google.android.libraries.play.entertainment.story.model;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6141k;
import com.google.android.libraries.play.entertainment.story.ParallaxContainer;
import com.google.android.libraries.play.entertainment.story.SnippetView;
import java.util.Collections;

final class bl extends ax {
    public static final ax f30636a = new bl();
    public static final int[] f30637b = new int[]{C6089g.panel_title, C6089g.tv_show_name};

    private bl() {
        super(C6091h.panel_tv_show);
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
        Object obj2 = (bj) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28115a(C6089g.read_more_button_node, c6164u.f30668c.mo3237e(c2980a));
        ParallaxContainer parallaxContainer = (ParallaxContainer) c6121g.m28117a(ParallaxContainer.class, C6089g.parallax_container);
        float f = ((float) obj2.o.e) / ((float) obj2.o.d);
        parallaxContainer.setParallaxAntiscrollRatio(Math.min(Math.max((0.8f * f) - 0.55f, 0.1f), 0.9f));
        int applyDimension = (int) TypedValue.applyDimension(1, Math.min(Math.max((f * 227.0f) + 72.0f, 200.0f), 500.0f), parallaxContainer.getResources().getDisplayMetrics());
        LayoutParams layoutParams = parallaxContainer.getLayoutParams();
        layoutParams.height = applyDimension;
        parallaxContainer.setLayoutParams(layoutParams);
        ax.m28360a(obj2, c6121g, e, f30637b, g, C6089g.tv_show_description);
        c6121g.m28120a(ax.m28359a((av) obj2), C6089g.image_main);
        c6121g.m28124a(obj2.o, C6089g.image_main, "=pf", 3, new C6032d[0]);
        c6121g.m28125a(obj2.k, C6089g.panel_title);
        c6121g.m28125a(obj2.f30635b.b, C6089g.tv_show_name);
        c6121g.m28122a(obj2.f30635b.c, C6089g.tv_show_description);
        C6141k c6141k = (C6141k) c6121g.m28129b(C6141k.class, C6089g.dc_action_dock_helper);
        if (c6141k != null) {
            c6141k.m28342a(obj2.n);
            c6141k.m28343a(obj2.n, Collections.emptyList(), false, obj2.n, c2980a, c2980a);
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.parallax_container, ParallaxContainer.class).m28116a(view, C6089g.image_main, PEImageView.class).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.tv_show_name, TextView.class).m28116a(view, C6089g.tv_show_description, SnippetView.class).m28116a(view, C6089g.text_container, View.class);
        ((View) a.m28117a(View.class, C6089g.tv_show_description)).setOnClickListener(new bm(a, c6164u));
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

    static {
        C6090b.m28050a();
    }
}
