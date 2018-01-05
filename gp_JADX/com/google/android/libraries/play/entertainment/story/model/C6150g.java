package com.google.android.libraries.play.entertainment.story.model;

import android.content.Context;
import android.support.v4.p037h.C0304u;
import android.view.View;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6121g;
import com.google.android.libraries.play.entertainment.story.C6127s;

abstract class C6150g {
    public static final C0304u f30650a = new C0304u();
    public static final C6150g f30651b = new C6151h();
    public static final C6150g f30652c = new C6152i();
    public static final C6150g f30653d = new C6153j();
    public static final C6150g f30654e = new C6155k();
    public static final C6150g f30655f = new C6156l();
    public static final C6150g f30656g = new C6157m();
    public static final C6150g f30657h = new C6158n();
    public static final C6150g f30658i = new C6159o();
    public static final C6150g f30659j = new C6160p();

    static C6150g m28444a(bb bbVar) {
        C6116b.m28102a();
        if (f30650a.isEmpty()) {
            f30650a.put(C6165v.class, f30651b);
            f30650a.put(C6168y.class, f30652c);
            f30650a.put(am.class, f30653d);
            f30650a.put(bg.class, f30654e);
            f30650a.put(bn.class, f30655f);
            f30650a.put(ao.class, f30656g);
            f30650a.put(C6144a.class, f30657h);
            f30650a.put(bk.class, f30658i);
            f30650a.put(bj.class, f30658i);
            f30650a.put(bi.class, f30659j);
        }
        return (C6150g) C6116b.m28101a((C6150g) f30650a.get(bbVar.getClass()), "No logic defined for panel type %s", bbVar.getClass().getSimpleName());
    }

    abstract int mo5338c(bb bbVar);

    private C6150g() {
    }

    String mo5340a(Context context, bb bbVar) {
        return "";
    }

    int mo5341b(bb bbVar) {
        return bbVar.m28353b() ? 2 : 1;
    }

    C6161s mo5339a(SVGImageView sVGImageView, C6127s c6127s) {
        return null;
    }

    static void m28445a(C6121g c6121g) {
        C6161s c6161s = (C6161s) c6121g.m28129b(C6161s.class, C6089g.playback_updatable);
        if (c6161s != null) {
            c6161s.m28473b();
        }
    }

    protected void mo5337a(bb bbVar, C6164u c6164u, C6121g c6121g, C2980a c2980a, View view, View view2) {
        String str = "Undefined consumption method for panel type ";
        String valueOf = String.valueOf(bbVar.getClass().getSimpleName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
