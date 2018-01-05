package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.df;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.entertainment.PEFinskyCardStory;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.controllers.view.FlatEntertainmentStoryClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class C4522w implements C1158a {
    public final Context f23131a;
    public final Document f23132b;
    public final C2720j f23133c;
    public final float f23134d = (((float) this.f23135e.getInteger(C7582R.integer.pe__card_height_ratio_v2)) / ((float) this.f23135e.getInteger(C7582R.integer.pe__card_width_ratio_v2)));
    public final Resources f23135e;
    public final C1294w f23136f;
    public final FlatEntertainmentStoryClusterView f23137g;
    public final C3748a f23138h;
    public final C2495w f23139i;

    public C4522w(Context context, C1294w c1294w, Document document, C2720j c2720j, C3748a c3748a, FlatEntertainmentStoryClusterView flatEntertainmentStoryClusterView, C2495w c2495w) {
        this.f23131a = context;
        this.f23136f = c1294w;
        this.f23132b = document;
        this.f23133c = c2720j;
        this.f23135e = context.getResources();
        this.f23138h = c3748a;
        this.f23137g = flatEntertainmentStoryClusterView;
        this.f23139i = c2495w;
    }

    public final String mo1480a() {
        return this.f23132b.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return C7582R.layout.card_story_v2;
    }

    public final boolean mo1484b() {
        return this.f23133c.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9223a(this.f23131a, (Document) this.f23133c.m14679a(i, false), this.f23136f, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f23133c.m14698m();
    }

    public final float mo1482b(int i) {
        return this.f23134d;
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((PEFinskyCardStory) view).getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((PEFinskyCardStory) view).getWidth();
    }

    public final /* synthetic */ float mo1485c(View view) {
        return this.f23134d;
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        PEFinskyCardStory pEFinskyCardStory = (PEFinskyCardStory) view;
        Document document = i < this.f23133c.m14698m() ? (Document) this.f23133c.m14679a(i, true) : null;
        if (document == null) {
            pEFinskyCardStory.setIsLoading(true);
            return;
        }
        df dfVar;
        pEFinskyCardStory.setIsLoading(false);
        if (document.f14885a.f12115v != null) {
            dfVar = document.f14885a.f12115v.f13107N;
        } else {
            dfVar = null;
        }
        if (dfVar == null) {
            FinskyLog.m21669e("Missing expected entertainment_story_card", new Object[0]);
            return;
        }
        pEFinskyCardStory.setTitle(dfVar.f12141b);
        pEFinskyCardStory.setSubtitle(dfVar.f12142c);
        pEFinskyCardStory.setSource(dfVar.f12143d);
        pEFinskyCardStory.setAttribution(document.m14635X());
        List c = document.m14644c(2);
        if (c.size() <= 0) {
            FinskyLog.m21669e("No images available on Entertainment Story doc!", new Object[0]);
            return;
        }
        float f;
        int i2;
        bd bdVar = (bd) c.get(0);
        String str = bdVar.f11860f;
        boolean z = bdVar.f11863i;
        if (bdVar.f11859e == null || bdVar.f11859e.f11879c <= 0) {
            f = 0.0f;
        } else {
            f = (float) (bdVar.f11859e.f11878b / bdVar.f11859e.f11879c);
        }
        String stringBuilder = z ? new StringBuilder(String.valueOf(str).length() + 3).append(str).append("=pf").toString() : str;
        if (z) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        ((PEImageView) pEFinskyCardStory.f15655c.m28117a(PEImageView.class, C6089g.image)).m27924a(stringBuilder, i2, f, new C6032d[0]);
        int a = C1607g.m9238a(bdVar.f11869o, -14273992);
        pEFinskyCardStory.setTitleBackgroundColor(a);
        pEFinskyCardStory.setImageBackgroundColor(a);
        ad c2473o = new C2473o(529, document.f14885a.f12087D, this.f23137g.getPlayStoreUiElementNode());
        this.f23137g.getPlayStoreUiElementNode().mo1219a(c2473o);
        pEFinskyCardStory.setOnClickListener(new C4530x(this, c2473o, document, a));
    }
}
