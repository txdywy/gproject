package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.model.C6165v;
import com.google.android.libraries.play.entertainment.story.model.ai;
import com.google.android.libraries.play.entertainment.story.model.am;
import com.google.android.libraries.play.entertainment.story.model.bj;
import com.google.wireless.android.finsky.dfe.g.a.ab;
import com.google.wireless.android.finsky.dfe.g.a.ae;
import com.google.wireless.android.finsky.dfe.g.a.ah;
import java.util.Collections;

public final class C6171o extends bd {
    public TextView af;
    public View ag;
    public C6141k ah;
    public SVGImageView ai;
    public TextView aj;
    public View ak;
    public PEImageView f30677b;
    public FrameLayout f30678c;
    public PEImageView f30679d;
    public TextView f30680e;
    public TextView f30681f;
    public View f30682g;
    public TextView f30683h;
    public TextView f30684i;

    public static C6171o m28491a(Context context, am amVar, C2980a c2980a) {
        return C6171o.m28494a(context, amVar.f30580a.b, amVar.f30580a.c, amVar.f30580a.d, amVar.f30580a.f, amVar.f30580a.e, amVar.m, c2980a);
    }

    public static C6171o m28490a(Context context, ai aiVar, C2980a c2980a) {
        return C6171o.m28494a(context, aiVar.f30573a.b, aiVar.f30573a.c, aiVar.f30573a.d, aiVar.f30573a.f, aiVar.f30573a.e, aiVar.m, c2980a);
    }

    private static C6171o m28494a(Context context, String str, ab abVar, ae aeVar, ah[] ahVarArr, com.google.wireless.android.finsky.dfe.g.a.ai aiVar, byte[] bArr, C2980a c2980a) {
        Object obj = 1;
        Fragment c6171o = new C6171o();
        Bundle a = bd.m28185a(aiVar, bArr, c2980a);
        a.putString("heroTitleText", str);
        a.putString("titleText", context.getString(ae.about_the_movie));
        a.putString("subtitleText", abVar.b);
        a.putString("attributionHtmlText", abVar.c);
        a.putString("badgeType", "movie");
        for (ah ahVar : ahVarArr) {
            if (ahVar.e == 1) {
                a.putString("tomatoesRatingScore", ahVar.c);
                a.putInt("tomatoesIconType", ahVar.g);
                if ((ahVar.b & 8) == 0) {
                    obj = null;
                }
                if (obj != null) {
                    a.putString("tomatoesSourceUrl", ahVar.f);
                }
                C6171o.m28495a(aeVar, a, "main");
                c6171o.m600f(a);
                return c6171o;
            }
        }
        C6171o.m28495a(aeVar, a, "main");
        c6171o.m600f(a);
        return c6171o;
    }

    public static C6171o m28492a(Context context, bj bjVar, C2980a c2980a) {
        Fragment c6171o = new C6171o();
        Bundle a = bd.m28185a(bjVar.f30635b.e, bjVar.m, c2980a);
        a.putString("heroTitleText", bjVar.f30635b.b);
        a.putString("titleText", context.getString(ae.about_the_tv_show));
        a.putString("subtitleHtmlText", bjVar.f30635b.c.b);
        a.putString("attributionHtmlText", bjVar.f30635b.c.c);
        a.putString("badgeType", "movie");
        C6171o.m28495a(bjVar.f30635b.d, a, "main");
        C6171o.m28495a(bjVar.f30635b.d, a, "hero");
        c6171o.m600f(a);
        return c6171o;
    }

    public static C6171o m28493a(Context context, C6165v c6165v, C2980a c2980a) {
        Fragment c6171o = new C6171o();
        Bundle a = bd.m28185a(c6165v.f30670a.f, c6165v.m, c2980a);
        a.putString("heroTitleText", c6165v.f30670a.b);
        a.putString("heroSubtitleText", c6165v.f30670a.e);
        a.putString("titleText", context.getString(ae.about_the_book));
        a.putString("subtitleHtmlText", c6165v.f30670a.c.b);
        a.putString("attributionHtmlText", c6165v.f30670a.c.c);
        a.putString("badgeType", "book");
        C6171o.m28495a(c6165v.f30670a.d, a, "main");
        C6171o.m28495a(c6165v.f30670a.i, a, "hero");
        c6171o.m600f(a);
        return c6171o;
    }

    protected final boolean mo5347X() {
        return true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ad.fragment_dc_details, viewGroup, false);
        this.f30677b = (PEImageView) inflate.findViewById(ac.pe_hero_view);
        this.f30678c = (FrameLayout) inflate.findViewById(ac.image_frame);
        this.f30679d = (PEImageView) inflate.findViewById(ac.pe_image_view);
        this.f30680e = (TextView) inflate.findViewById(ac.pe_hero_title_text);
        this.f30681f = (TextView) inflate.findViewById(ac.pe_hero_subtitle_text);
        this.f30682g = inflate.findViewById(ac.free_sample);
        this.f30683h = (TextView) inflate.findViewById(ac.pe_title);
        this.f30684i = (TextView) inflate.findViewById(ac.pe_subtitle);
        this.af = (TextView) inflate.findViewById(ac.attribution);
        this.ag = inflate.findViewById(ac.dc_action_dock);
        this.aj = (TextView) inflate.findViewById(ac.critic_score);
        this.ai = (SVGImageView) inflate.findViewById(ac.critic_icon);
        this.ak = inflate.findViewById(ac.critic_rating_container);
        ((TextView) C6116b.m28100a(this.af)).setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139d(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = -2;
        r8 = -1;
        r4 = 8;
        r6 = 1;
        r7 = 0;
        super.mo139d(r12);
        r9 = r11.f760q;
        if (r9 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r11.f30680e;
        r1 = "heroTitleText";
        com.google.android.libraries.play.entertainment.story.bd.m28186a(r0, r1, r9);
        r0 = r11.f30681f;
        r1 = "heroSubtitleText";
        com.google.android.libraries.play.entertainment.story.bd.m28186a(r0, r1, r9);
        r0 = r11.m28190Y();
        r1 = r11.f30682g;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r1);
        r1 = r0.b;
        r1 = r1.f11835d;
        if (r1 != r6) goto L_0x0162;
    L_0x002b:
        r1 = r0.b;
        r1 = r1.f11834c;
        r2 = 5;
        if (r1 != r2) goto L_0x0162;
    L_0x0032:
        r1 = com.google.android.libraries.play.entertainment.C2998a.m15496l();
        r1 = r1.m15517t();
        r1 = r1.mo3273d(r0);
        if (r1 == 0) goto L_0x0162;
    L_0x0040:
        r1 = r11.f30682g;
        r1.setVisibility(r7);
        r1 = com.google.android.libraries.play.entertainment.C2998a.m15496l();
        r1 = r1.m15515r();
        r2 = r11.m28191Z();
        r1 = r1.mo3237e(r2);
        r2 = r11.f30682g;
        r3 = new com.google.android.libraries.play.entertainment.story.q;
        r3.<init>(r1, r0);
        r2.setOnClickListener(r3);
    L_0x005f:
        r0 = r11.ak;
        r0 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = (android.view.View) r0;
        r1 = "tomatoesRatingScore";
        r1 = r9.containsKey(r1);
        if (r1 == 0) goto L_0x0169;
    L_0x006f:
        r1 = r11.aj;
        r2 = "tomatoesRatingScore";
        com.google.android.libraries.play.entertainment.story.bd.m28186a(r1, r2, r9);
        r1 = r11.ai;
        r1 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r1);
        r1 = (com.caverock.androidsvg.SVGImageView) r1;
        r2 = r11.ai;
        r2 = r2.getContext();
        r3 = "tomatoesIconType";
        r3 = r9.getInt(r3, r6);
        r2 = com.google.android.libraries.play.entertainment.story.bf.m28312a(r2, r3);
        r1.setSVG(r2);
        r1 = "tomatoesSourceUrl";
        r1 = r9.containsKey(r1);
        if (r1 == 0) goto L_0x00aa;
    L_0x0099:
        r1 = "tomatoesSourceUrl";
        r1 = r9.getString(r1);
        r2 = new com.google.android.libraries.play.entertainment.story.p;
        r2.<init>(r1);
        r0.setOnClickListener(r2);
        r0.setFocusable(r6);
    L_0x00aa:
        r0 = "subtitleText";
        r0 = r9.containsKey(r0);
        if (r0 == 0) goto L_0x016e;
    L_0x00b2:
        r0 = "subtitleText";
        r0 = r9.getString(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x016e;
    L_0x00be:
        r0 = r6;
    L_0x00bf:
        r1 = "subtitleHtmlText";
        r1 = r9.containsKey(r1);
        if (r1 == 0) goto L_0x0171;
    L_0x00c7:
        r1 = "subtitleHtmlText";
        r1 = r9.getString(r1);
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0171;
    L_0x00d3:
        r1 = r6;
    L_0x00d4:
        if (r0 != 0) goto L_0x0174;
    L_0x00d6:
        if (r1 != 0) goto L_0x0174;
    L_0x00d8:
        r0 = r11.f30683h;
        r0 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = (android.widget.TextView) r0;
        r0.setVisibility(r4);
        r0 = r11.f30684i;
        r0 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = (android.widget.TextView) r0;
        r0.setVisibility(r4);
        r0 = r11.af;
        r0 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = (android.widget.TextView) r0;
        r0.setVisibility(r4);
    L_0x00f9:
        r0 = r11.f30677b;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = r11.f30679d;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = r11.f30678c;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = "main";
        r2 = com.google.android.libraries.play.entertainment.story.C6171o.m28497b(r9, r0);
        if (r2 != 0) goto L_0x0195;
    L_0x0110:
        r0 = r11.f30679d;
        r0.setVisibility(r4);
    L_0x0115:
        r0 = r11.f30678c;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = "badgeType";
        r0 = r9.getString(r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0131;
    L_0x0126:
        r1 = r0.hashCode();
        switch(r1) {
            case 3029737: goto L_0x0247;
            case 104087344: goto L_0x0252;
            default: goto L_0x012d;
        };
    L_0x012d:
        r6 = r8;
    L_0x012e:
        switch(r6) {
            case 0: goto L_0x025c;
            case 1: goto L_0x025f;
            default: goto L_0x0131;
        };
    L_0x0131:
        r0 = r8;
    L_0x0132:
        r1 = r11.f30678c;
        com.google.android.libraries.play.entertainment.story.C6143m.m28347a(r1, r0, r7);
        r11.aa();
        r1 = new com.google.android.libraries.play.entertainment.story.k;
        r0 = com.google.android.libraries.play.entertainment.C2998a.m15496l();
        r2 = r0.m15517t();
        r0 = com.google.android.libraries.play.entertainment.C2998a.m15496l();
        r3 = r0.m15515r();
        r0 = r11.ag;
        r0 = com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r0);
        r0 = (android.view.View) r0;
        r4 = com.google.android.libraries.play.entertainment.C2998a.m15496l();
        r4.m15520w();
        r1.<init>(r2, r3, r0);
        r11.ah = r1;
        goto L_0x000d;
    L_0x0162:
        r0 = r11.f30682g;
        r0.setVisibility(r4);
        goto L_0x005f;
    L_0x0169:
        r0.setVisibility(r4);
        goto L_0x00aa;
    L_0x016e:
        r0 = r7;
        goto L_0x00bf;
    L_0x0171:
        r1 = r7;
        goto L_0x00d4;
    L_0x0174:
        r1 = r11.f30683h;
        r2 = "titleText";
        com.google.android.libraries.play.entertainment.story.bd.m28186a(r1, r2, r9);
        if (r0 == 0) goto L_0x018d;
    L_0x017d:
        r0 = r11.f30684i;
        r1 = "subtitleText";
        com.google.android.libraries.play.entertainment.story.bd.m28186a(r0, r1, r9);
    L_0x0184:
        r0 = r11.af;
        r1 = "attributionHtmlText";
        com.google.android.libraries.play.entertainment.story.bd.m28188b(r0, r1, r9);
        goto L_0x00f9;
    L_0x018d:
        r0 = r11.f30684i;
        r1 = "subtitleHtmlText";
        com.google.android.libraries.play.entertainment.story.bd.m28188b(r0, r1, r9);
        goto L_0x0184;
    L_0x0195:
        r0 = r11.f30678c;
        r0 = r0.getLayoutParams();
        r0 = (android.widget.RelativeLayout.LayoutParams) r0;
        r1 = r11.m603h();	 Catch:{ RuntimeException -> 0x021a }
        r1 = r1.getWindow();	 Catch:{ RuntimeException -> 0x021a }
        r1 = r1.getDecorView();	 Catch:{ RuntimeException -> 0x021a }
        r1 = r1.getWidth();	 Catch:{ RuntimeException -> 0x021a }
    L_0x01ad:
        r3 = "main";
        r4 = com.google.android.libraries.play.entertainment.story.C6171o.m28498c(r9, r3);
        if (r1 != 0) goto L_0x021d;
    L_0x01b5:
        r1 = r11.f30679d;
        r1 = r1.getContext();
        r1 = r1.getResources();
        r3 = com.google.android.libraries.play.entertainment.story.ab.pe__dc_details_main_image_fallback_max_width;
        r1 = r1.getDimensionPixelOffset(r3);
        r3 = r1;
    L_0x01c6:
        if (r3 == 0) goto L_0x01e7;
    L_0x01c8:
        r1 = r11.f30679d;
        r1 = r1.getLayoutParams();
        r1 = (android.widget.FrameLayout.LayoutParams) r1;
        r1.width = r8;
        r1.height = r10;
        r5 = r11.f30679d;
        r5.setLayoutParams(r1);
        r0.width = r3;
        r0.height = r10;
        r1 = 10;
        r0.addRule(r1, r7);
        r1 = r11.f30678c;
        r1.setLayoutParams(r0);
    L_0x01e7:
        r0 = "main";
        r1 = com.google.android.libraries.play.entertainment.story.C6171o.m28496a(r9, r0);
        r0 = r11.f30679d;
        r3 = "pf";
        r5 = new com.google.android.libraries.play.entertainment.bitmap.C6032d[r7];
        com.google.android.libraries.play.entertainment.story.bd.m28187a(r0, r1, r2, r3, r4, r5);
        r0 = "hero";
        r10 = com.google.android.libraries.play.entertainment.story.C6171o.m28497b(r9, r0);
        if (r10 == 0) goto L_0x0235;
    L_0x01fe:
        r0 = r11.f30677b;
        r1 = "hero";
        r1 = com.google.android.libraries.play.entertainment.story.C6171o.m28496a(r9, r1);
        r3 = "pf";
        r2 = "hero";
        r4 = com.google.android.libraries.play.entertainment.story.C6171o.m28498c(r9, r2);
        r5 = new com.google.android.libraries.play.entertainment.bitmap.C6032d[r6];
        r2 = com.google.android.libraries.play.entertainment.story.C6174r.f30688a;
        r5[r7] = r2;
        r2 = r10;
        com.google.android.libraries.play.entertainment.story.bd.m28187a(r0, r1, r2, r3, r4, r5);
        goto L_0x0115;
    L_0x021a:
        r1 = move-exception;
        r1 = r7;
        goto L_0x01ad;
    L_0x021d:
        r3 = r1 * 9;
        r3 = r3 / 16;
        r5 = r0.topMargin;
        r3 = r3 - r5;
        r5 = r0.bottomMargin;
        r3 = r3 - r5;
        r3 = (float) r3;
        r3 = r3 * r4;
        r3 = (int) r3;
        r1 = r1 / 2;
        r5 = android.support.v4.view.C0361r.m2049a(r0);
        r1 = r1 - r5;
        if (r3 <= r1) goto L_0x0262;
    L_0x0233:
        r3 = r1;
        goto L_0x01c6;
    L_0x0235:
        if (r1 == 0) goto L_0x0115;
    L_0x0237:
        r0 = r11.f30677b;
        r3 = "pf-fSoften=1,50,0";
        r5 = new com.google.android.libraries.play.entertainment.bitmap.C6032d[r6];
        r1 = com.google.android.libraries.play.entertainment.story.C6174r.f30688a;
        r5[r7] = r1;
        r1 = r6;
        com.google.android.libraries.play.entertainment.story.bd.m28187a(r0, r1, r2, r3, r4, r5);
        goto L_0x0115;
    L_0x0247:
        r1 = "book";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x012d;
    L_0x024f:
        r6 = r7;
        goto L_0x012e;
    L_0x0252:
        r1 = "movie";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x012d;
    L_0x025a:
        goto L_0x012e;
    L_0x025c:
        r0 = 2;
        goto L_0x0132;
    L_0x025f:
        r0 = r7;
        goto L_0x0132;
    L_0x0262:
        r3 = r7;
        goto L_0x01c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.play.entertainment.story.o.d(android.os.Bundle):void");
    }

    public final void mo979u() {
        super.mo979u();
        C2980a Z = m28191Z();
        ((C6141k) C6116b.m28100a(this.ah)).m28343a(m28190Y(), Collections.emptyList(), true, m28190Y(), Z, Z);
        ((View) C6116b.m28100a(this.ag)).setVisibility(0);
    }

    public final void mo980v() {
        ((C6141k) C6116b.m28100a(this.ah)).m28345c();
        ((View) C6116b.m28100a(this.ag)).setVisibility(8);
        super.mo980v();
    }

    public final void mo138d() {
        ((PEImageView) C6116b.m28100a(this.f30677b)).m27921a();
        ((PEImageView) C6116b.m28100a(this.f30679d)).m27921a();
        super.mo138d();
    }

    private static void m28495a(ae aeVar, Bundle bundle, String str) {
        if (aeVar != null) {
            String valueOf = String.valueOf("imageUrl");
            String valueOf2 = String.valueOf(str);
            bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aeVar.c);
            valueOf = String.valueOf("imageFife");
            valueOf2 = String.valueOf(str);
            bundle.putBoolean(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aeVar.f);
            valueOf = String.valueOf("imageWidth");
            valueOf2 = String.valueOf(str);
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aeVar.d);
            valueOf = String.valueOf("imageHeight");
            valueOf2 = String.valueOf(str);
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aeVar.e);
        }
    }

    private static boolean m28496a(Bundle bundle, String str) {
        String valueOf = String.valueOf("imageFife");
        String valueOf2 = String.valueOf(str);
        return bundle.getBoolean(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    private static String m28497b(Bundle bundle, String str) {
        String valueOf = String.valueOf("imageUrl");
        String valueOf2 = String.valueOf(str);
        return bundle.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    private static float m28498c(Bundle bundle, String str) {
        String valueOf = String.valueOf("imageWidth");
        String valueOf2 = String.valueOf(str);
        int i = bundle.getInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("imageHeight");
        valueOf2 = String.valueOf(str);
        return ((float) i) / ((float) bundle.getInt(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3)));
    }
}
