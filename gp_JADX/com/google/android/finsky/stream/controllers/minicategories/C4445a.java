package com.google.android.finsky.stream.controllers.minicategories;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4262b;
import com.google.android.finsky.stream.controllers.minicategories.view.C4444a;
import com.google.android.finsky.stream.controllers.minicategories.view.C4450b;
import com.google.android.finsky.stream.controllers.minicategories.view.MiniCategoriesCard;
import com.google.android.play.image.a;
import com.squareup.leakcanary.C7582R;

public final class C4445a implements C4260a, C4444a {
    public final Document f22567a;
    public final Resources f22568b;
    public final int f22569c;
    public final int f22570d;
    public final C3748a f22571e;
    public final ab f22572f;
    public int[] f22573g;
    public final C2495w f22574h;
    public C4446b f22575i = new C4446b();
    public C4450b f22576j;

    public C4445a(Document document, int i, Resources resources, C3748a c3748a, ab abVar, int i2, int[] iArr, C2495w c2495w) {
        this.f22567a = document;
        this.f22569c = i;
        this.f22568b = resources;
        this.f22571e = c3748a;
        this.f22572f = abVar;
        this.f22570d = i2;
        this.f22573g = iArr;
        this.f22574h = c2495w;
    }

    public final int mo4069a(int i) {
        return (int) this.f22568b.getDimension(C7582R.dimen.mini_categories_card_height);
    }

    public final int mo4068a() {
        return this.f22569c;
    }

    public final void mo4211a(ad adVar) {
        this.f22571e.mo3643a(this.f22567a.m14657l().f12324d, this.f22576j.f22599a, this.f22576j.f22600b, this.f22572f.dn(), adVar, 0, this.f22574h);
    }

    public final /* synthetic */ int mo4070a(View view) {
        return (int) this.f22568b.getDimension(C7582R.dimen.mini_categories_icon_size);
    }

    public final /* synthetic */ int mo4073b(View view) {
        return (int) this.f22568b.getDimension(C7582R.dimen.mini_categories_icon_size);
    }

    public final /* synthetic */ C4262b mo4074b() {
        return this.f22575i;
    }

    public final /* synthetic */ void mo4075c(View view) {
        MiniCategoriesCard miniCategoriesCard = (MiniCategoriesCard) view;
        miniCategoriesCard.setOnClickListener(null);
        miniCategoriesCard.f22588d = null;
        miniCategoriesCard.f22589e = null;
    }

    public final /* synthetic */ void mo4071a(View view, ad adVar) {
        MiniCategoriesCard miniCategoriesCard = (MiniCategoriesCard) view;
        C4450b c4450b = this.f22576j;
        if (c4450b == null) {
            c4450b = new C4450b();
        }
        c4450b.f22599a = this.f22567a.f14885a.f12100g;
        c4450b.f22600b = this.f22570d;
        c4450b.f22601c = this.f22567a.f14885a.f12087D;
        c4450b.f22602d = af.m9220a(this.f22567a, 0, this.f22568b.getDimensionPixelSize(C7582R.dimen.mini_categories_icon_size), this.f22573g);
        this.f22576j = c4450b;
        c4450b = this.f22576j;
        miniCategoriesCard.f22588d = this;
        miniCategoriesCard.f22585a.setText(c4450b.f22599a);
        if (!(c4450b.f22602d == null || TextUtils.isEmpty(c4450b.f22602d.f11860f))) {
            String str = c4450b.f22602d.f11860f;
            miniCategoriesCard.f22586b.setBitmapTransformation(a.b(miniCategoriesCard.getResources(), C1607g.m9236a(c4450b.f22602d, C1608h.m9243a(miniCategoriesCard.getContext(), c4450b.f22600b))));
            miniCategoriesCard.f22590f.m9288a(miniCategoriesCard.f22586b, str, true);
        }
        miniCategoriesCard.f22589e = adVar;
        C2482j.m13285a(miniCategoriesCard.f22587c, c4450b.f22601c);
        miniCategoriesCard.setOnClickListener(miniCategoriesCard);
        adVar.mo1219a(miniCategoriesCard);
    }

    public final /* synthetic */ void mo4072a(C4262b c4262b) {
        C4446b c4446b = (C4446b) c4262b;
        if (c4446b != null) {
            this.f22575i = c4446b;
        }
    }
}
