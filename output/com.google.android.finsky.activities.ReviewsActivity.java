package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.finsky.a.c;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.actionbar.a;
import com.google.android.finsky.layout.actionbar.m;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.v.b;
import com.google.android.play.search.PlaySearchToolbar;

public final class ReviewsActivity extends com.google.android.finsky.activities.b implements com.google.android.finsky.pagesystem.e
{

    public com.google.android.finsky.d.w C;
    public com.google.android.finsky.layout.actionbar.a G;
    public Document H;
    public String I;
    public boolean J;
    public com.google.android.finsky.navigationmanager.a K;
    public final com.google.android.finsky.d.a t;

    ReviewsActivity() {
        com.google.android.finsky.activities.b();
        this.t = com.google.android.finsky.m.a.aR();
    }

    public final com.google.android.finsky.v.b A() {
        return 0;
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
        this.G.a(p0, p3);
        this.G.a(p1);
    }

    public final void a(int p0, int p1, boolean p2) {
        this.G.a(p0, p2);
        this.G.a(p1);
    }

    public final void a(int p0, boolean p1) {
        this.G.a(p0, p1);
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
    }

    public final void a_(com.google.android.finsky.d.w p0) {
        this.G.a(p0);
    }

    public final void c(int p0) {
        this.G.a(1, p0);
    }

    public final void c(String p0) {
        this.G.a(p0);
    }

    public final void d(String p0) {
    }

    public final com.google.android.finsky.a.c l() {
        return 0;
    }

    public final void m() {
        this.finish();
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968781);
        v0 = (Toolbar)this.findViewById(2131755286);
        if (v0 != 0) {
            if (v0 instanceof FinskySearchToolbar)
                ((FinskySearchToolbar)v0).a(new com.google.android.finsky.layout.actionbar.m(this));
            this.a(v0);
        }
        v1 = this.getIntent();
        this.H = (Document)v1.getParcelableExtra("finsky.ReviewsActivity.document");
        this.I = v1.getStringExtra("finsky.ReviewsActivity.reviewsUrl");
        this.J = v1.getBooleanExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", 0);
        this.K = com.google.android.finsky.m.a.k().c(this);
        this.G = new com.google.android.finsky.layout.actionbar.a(this.K, this);
        this.G.a(this.H.a.g);
        this.G.a(this.H.a.f, 0);
        this.G.a(0, -1);
        this.C = this.t.a(p0, v1);
        v1 = this.H_();
        if (v1.a(2131755313) == 0) {
            v0 = this.I;
            v5 = new com.google.android.finsky.activities.ga();
            v5.a(com.google.android.finsky.m.a.dn());
            v5.a("finsky.ReviewsFragment.document", this.H);
            if (v0 == 0)
                v0 = this.H.a.y;
            v5.b("finsky.ReviewsFragment.reviewsUrl", v0);
            v5.d("finsky.ReviewsFragment.isRottenTomatoesReviews", this.J);
            v5.a(this.C);
            v0 = v1.a();
            v0.b(2131755313, v5);
            v0.c();
        }
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        v0 = 1;
        switch (p0.getItemId()) {
            case 16908332:
                if (!this.K.b(this.C, 1))
                    super.onBackPressed();
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final com.google.android.finsky.navigationmanager.a y_() {
        return this.K;
    }

    public final void z() {
        this.G.a(0, -1);
    }

}
