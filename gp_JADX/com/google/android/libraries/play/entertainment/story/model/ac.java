package com.google.android.libraries.play.entertainment.story.model;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.android.libraries.play.entertainment.story.C6136f;

final class ac extends ax {
    public static final ax f30560a = new ac();
    public static final int[] f30561b = new int[]{C6089g.person_name};

    private ac() {
        super(C6091h.cluster_person);
    }

    public final /* synthetic */ void mo5331a(Object obj) {
        ((C6121g) obj).m28118a();
    }

    public final /* synthetic */ void mo5330a(av avVar, Object obj, C2980a c2980a, C6164u c6164u) {
        Object obj2 = (af) avVar;
        C6121g c6121g = (C6121g) obj;
        c6121g.m28115a(C6089g.panel_model, obj2);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        ax.m28360a(obj2, c6121g, g, f30561b, g, -1);
        ((ShapeDrawable) c6121g.m28117a(ShapeDrawable.class, C6089g.background_container)).getPaint().setColor(ax.m28359a((av) obj2));
        String str = "=pf";
        if (obj2.f30567c != null) {
            str = "";
        }
        c6121g.m28123a(obj2.o, C6089g.image_person, str, 6, obj2.f30567c, C6136f.f30488b);
        c6121g.m28125a(obj2.f30565a, C6089g.person_name);
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28116a(view, C6089g.image_person, PEImageView.class).m28116a(view, C6089g.person_name, TextView.class);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        a.m28115a(C6089g.background_container, (Object) shapeDrawable);
        View view2 = (View) a.m28117a(View.class, C6089g.image_person);
        C6122h.m28132a(view2, shapeDrawable);
        if (C6115a.m28097a(21)) {
            view2.setOutlineProvider(ae.f30564a);
            view2.setClipToOutline(true);
        }
        view.setOnClickListener(new ad(a, c6164u));
        return a;
    }
}
