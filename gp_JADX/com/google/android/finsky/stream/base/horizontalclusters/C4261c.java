package com.google.android.finsky.stream.base.horizontalclusters;

import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4262b;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class C4261c implements C4260a {
    public final Document f21525a;
    public final C4808a f21526b;
    public final ab f21527c;
    public final ao f21528d;
    public final C2495w f21529e;
    public final C3748a f21530f;
    public final Resources f21531g;
    public final C1611k f21532h;
    public final int f21533i;
    public boolean f21534j = false;
    public int f21535k;
    public boolean f21536l;
    public String f21537m;
    public float f21538n;
    public float f21539o;
    public C4263d f21540p;

    public C4261c(Document document, C4808a c4808a, ab abVar, ao aoVar, C2495w c2495w, C3748a c3748a, int i, Resources resources, C1611k c1611k, int i2, boolean z, float f, float f2, String str) {
        this.f21525a = document;
        this.f21526b = c4808a;
        this.f21527c = abVar;
        this.f21528d = aoVar;
        this.f21529e = c2495w;
        this.f21530f = c3748a;
        this.f21533i = i;
        this.f21531g = resources;
        this.f21532h = c1611k;
        this.f21535k = i2;
        this.f21536l = z;
        this.f21537m = str;
        this.f21538n = f;
        this.f21539o = f2;
        this.f21540p = new C4263d();
    }

    public final int mo4069a(int i) {
        if (this.f21533i == C7582R.layout.flat_card_mini_multi_aspect_ratio_lite || this.f21533i == C7582R.layout.flat_card_mini_multi_aspect_ratio) {
            int e = this.f21532h.m9280e(this.f21531g);
            int dimensionPixelSize = this.f21531g.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height) + e;
            e += this.f21531g.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height_tall);
            if (this.f21539o == 1.0f) {
                return dimensionPixelSize;
            }
            return e;
        } else if (this.f21533i == C7582R.layout.flat_card_mini_lite || this.f21533i == C7582R.layout.flat_card_mini) {
            return (int) (((float) this.f21532h.m9280e(this.f21531g)) + (((float) (i - (this.f21532h.m9279d(this.f21531g) * 2))) * this.f21538n));
        } else {
            throw new IllegalStateException("Card layout not supported when finding child height");
        }
    }

    public final int mo4068a() {
        return this.f21533i;
    }

    public final /* synthetic */ int mo4070a(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getWidth();
    }

    public final /* synthetic */ int mo4073b(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getHeight();
    }

    public final /* synthetic */ C4262b mo4074b() {
        return this.f21540p;
    }

    public final /* synthetic */ void mo4075c(View view) {
        ao.m18509b((d) view);
    }

    public final /* synthetic */ void mo4071a(View view, ad adVar) {
        d dVar = (d) view;
        dVar.setThumbnailAspectRatio(this.f21538n);
        boolean be = this.f21525a.be();
        ab abVar = this.f21527c;
        boolean z = be && abVar != null && this.f21526b.m22588a(this.f21525a.f14885a.f12096c);
        ao aoVar = this.f21528d;
        Document document = this.f21525a;
        int i = this.f21535k;
        String str = this.f21537m;
        C3748a c3748a = this.f21530f;
        if (!be) {
            abVar = null;
        }
        aoVar.m18515a(dVar, document, i, str, c3748a, z, abVar, adVar, false, -1, true, this.f21525a.aZ(), this.f21529e, false, this.f21534j, this.f21536l);
    }

    public final /* synthetic */ void mo4072a(C4262b c4262b) {
        C4263d c4263d = (C4263d) c4262b;
        if (c4263d != null) {
            this.f21540p = c4263d;
        }
    }
}
