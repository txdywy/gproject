package com.google.android.libraries.play.entertainment.story.model;

import android.graphics.drawable.Drawable;
import android.support.v4.widget.bg;
import android.view.View;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.C6095j;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6141k;
import com.google.android.play.layout.StarRatingBar;

final class C6145b extends ax {
    public static final ax f30623a = new C6145b();
    public static final int[] f30624b = new int[]{C6089g.panel_title, C6089g.app_name};
    public static final int[] f30625c = new int[]{C6089g.app_developer_name, C6089g.app_rating_count_left, C6089g.app_rating_count, C6089g.app_rating_count_right};
    public Drawable f30626d;

    private C6145b() {
        super(C6091h.panel_android_app);
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
        Object obj2 = (C6144a) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        ax.m28360a(obj2, c6121g, e, f30624b, f30625c, -1);
        TextView textView = (TextView) c6121g.m28117a(TextView.class, C6089g.app_rating_count);
        if (this.f30626d == null) {
            this.f30626d = C0722q.m4782a(textView.getResources(), C6095j.ic_user_rating_dark, new as().m4593b(obj2.q));
        }
        bg.m2222a(textView, null, null, this.f30626d, null);
        c6121g.m28120a(ax.m28359a((av) obj2), C6089g.image_main);
        c6121g.m28124a(obj2.o, C6089g.image_main, "", 3, new C6032d[0]);
        c6121g.m28124a(obj2.o, C6089g.app_icon, "", 3, new C6032d[0]);
        c6121g.m28125a(obj2.k, C6089g.panel_title);
        c6121g.m28125a(obj2.f30548b.b, C6089g.app_name);
        c6121g.m28125a(obj2.f30548b.c, C6089g.app_developer_name);
        c6121g.m28122a(obj2.f30548b.d, C6089g.app_snippet);
        StarRatingBar starRatingBar = (StarRatingBar) c6121g.m28117a(StarRatingBar.class, C6089g.app_star_rating);
        starRatingBar.setRating((float) obj2.f30548b.h.i);
        c6121g.m28125a(starRatingBar.getContext().getString(C6098k.pe__app_rating, new Object[]{Double.valueOf(obj2.f30548b.h.i)}), C6089g.app_numerical_rating);
        c6121g.m28125a(starRatingBar.getContext().getString(C6098k.pe__app_rating_count, new Object[]{Long.valueOf(obj2.f30548b.h.k)}), C6089g.app_rating_count);
        C6141k c6141k = (C6141k) c6121g.m28129b(C6141k.class, C6089g.dc_action_dock_helper);
        if (c6141k != null) {
            c6141k.m28342a(obj2.n);
            c6141k.m28343a(obj2.n, obj2.t, false, null, c2980a, c2980a);
            ((View) c6121g.m28117a(View.class, C6089g.text_container)).setOnClickListener(new C6146c(c6141k, c2980a));
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.text_container, View.class).m28116a(view, C6089g.image_main, PEImageView.class).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.app_icon, PEImageView.class).m28116a(view, C6089g.app_name, TextView.class).m28116a(view, C6089g.app_snippet, TextView.class).m28116a(view, C6089g.app_developer_name, TextView.class).m28116a(view, C6089g.app_numerical_rating, TextView.class).m28116a(view, C6089g.app_star_rating, StarRatingBar.class).m28116a(view, C6089g.app_rating_count_left, TextView.class).m28116a(view, C6089g.app_rating_count, TextView.class).m28116a(view, C6089g.app_rating_count_right, TextView.class);
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
