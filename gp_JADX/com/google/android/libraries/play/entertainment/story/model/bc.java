package com.google.android.libraries.play.entertainment.story.model;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.agera.C0893t;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6143m;

class bc extends ax {
    bc(int i) {
        super(i);
    }

    public C6121g mo5335b(View view, C6164u c6164u) {
        C6121g b = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.image_frame, FrameLayout.class).m28116a(view, C6089g.image_media, PEImageView.class).m28128b(view, C6089g.image_blurred, PEImageView.class).m28128b(view, C6089g.panel_title, TextView.class).m28128b(view, C6089g.title, TextView.class).m28128b(view, C6089g.subtitle, TextView.class).m28128b(view, C6089g.playback_button, SVGImageView.class);
        mo5344a(b, new bd(c6164u, b));
        return b;
    }

    protected void mo5344a(C6121g c6121g, OnClickListener onClickListener) {
        View view = (View) c6121g.m28117a(View.class, C6089g.image_frame);
        view.setOnClickListener(onClickListener);
        if (C6115a.m28097a(21)) {
            view.setOutlineProvider(be.f30630a);
            view.setClipToOutline(true);
        }
        SVGImageView sVGImageView = (SVGImageView) c6121g.m28129b(SVGImageView.class, C6089g.playback_button);
        if (sVGImageView != null) {
            sVGImageView.setOnClickListener(onClickListener);
        }
    }

    public void mo5333a(bb bbVar, C6121g c6121g, C2980a c2980a, C6164u c6164u) {
        boolean z;
        Context context = ((PEImageView) c6121g.m28117a(PEImageView.class, C6089g.image_media)).getContext();
        c6121g.m28115a(C6089g.panel_model, (Object) bbVar);
        c6121g.m28115a(C6089g.panel_node, (Object) c2980a);
        c6121g.m28120a(ax.m28359a((av) bbVar), C6089g.image_media);
        C6150g a = C6150g.m28444a(bbVar);
        c6121g.m28124a(bbVar.o, C6089g.image_media, a.mo5340a(context, bbVar), a.mo5341b(bbVar), new C6032d[0]);
        SVGImageView sVGImageView = (SVGImageView) c6121g.m28129b(SVGImageView.class, C6089g.playback_button);
        if (sVGImageView != null) {
            Object obj = (C6161s) c6121g.m28129b(C6161s.class, C6089g.playback_updatable);
            if (bbVar.mo5334a()) {
                if (!(obj == null || obj.mo5343a(bbVar))) {
                    obj.m28473b();
                    obj = null;
                }
                if (obj == null) {
                    obj = a.mo5339a(sVGImageView, c6164u.f30666a);
                }
                if (obj != null) {
                    c6121g.m28115a(C6089g.playback_updatable, obj);
                    C0893t a2 = obj.mo5342a();
                    if (!(bbVar.equals(obj.f30664e) && obj.f30665f == a2)) {
                        obj.m28473b();
                        obj.f30664e = bbVar;
                        obj.f30665f = a2;
                        a2.mo1144a(obj);
                    }
                    obj.ad_();
                } else {
                    sVGImageView.setVisibility(0);
                }
            } else {
                if (obj != null) {
                    obj.m28473b();
                }
                sVGImageView.setVisibility(8);
            }
        }
        if (bbVar.o == null || bbVar.o.f) {
            c6121g.m28124a(bbVar.o, C6089g.image_blurred, "=pf-fSoften=1,50,0", 3, new C6032d[0]);
        } else {
            c6121g.m28124a(null, C6089g.image_blurred, "", 0, new C6032d[0]);
        }
        FrameLayout frameLayout = (FrameLayout) c6121g.m28117a(FrameLayout.class, C6089g.image_frame);
        int i = bbVar.f30546z;
        if (bbVar.m28353b()) {
            z = false;
        } else {
            z = true;
        }
        C6143m.m28347a(frameLayout, i, z);
        c6121g.m28125a(bbVar.k, C6089g.panel_title);
        int c = a.mo5338c(bbVar);
        if (c == 0) {
            c6121g.m28125a(bbVar.f30544f, C6089g.title);
            frameLayout.setContentDescription(bbVar.f30544f);
            return;
        }
        c6121g.m28126a(bbVar.f30544f, C6089g.title, c, bbVar.f30544f);
        frameLayout.setContentDescription(frameLayout.getContext().getString(c, new Object[]{bbVar.f30544f}));
    }

    public final /* synthetic */ void mo5331a(Object obj) {
        C6121g c6121g = (C6121g) obj;
        C6150g.m28445a(c6121g);
        c6121g.m28119a(C6089g.panel_model);
        c6121g.m28119a(C6089g.panel_node);
        c6121g.m28118a();
    }

    public /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        return mo5335b(view, c6164u);
    }
}
