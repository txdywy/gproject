package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.actionbar.C3658a;
import com.google.android.finsky.layout.actionbar.C3671m;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.squareup.leakcanary.C7582R;

public class ReviewsActivity extends C1036b implements C1037e {
    public C2495w f6422C;
    public C3658a f6423G;
    public Document f6424H;
    public String f6425I;
    public boolean f6426J;
    public C3748a f6427K;
    public final C2471a f6428t = C1473m.f7980a.aR();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.dialog_when_large);
        Toolbar toolbar = (Toolbar) findViewById(C7582R.id.action_bar);
        if (toolbar != null) {
            if (toolbar instanceof FinskySearchToolbar) {
                ((FinskySearchToolbar) toolbar).a(new C3671m(this));
            }
            m2347a(toolbar);
        }
        Intent intent = getIntent();
        this.f6424H = (Document) intent.getParcelableExtra("finsky.ReviewsActivity.document");
        this.f6425I = intent.getStringExtra("finsky.ReviewsActivity.reviewsUrl");
        this.f6426J = intent.getBooleanExtra("finsky.ReviewsActivity.isRottenTomatoesReviews", false);
        this.f6427K = C1473m.f7980a.mo2252k().mo3728c(this);
        this.f6423G = new C3658a(this.f6427K, this);
        this.f6423G.m17385a(this.f6424H.f14885a.f12100g);
        this.f6423G.m17381a(this.f6424H.f14885a.f12099f, false);
        this.f6423G.m17387a(false, -1);
        this.f6422C = this.f6428t.m13180a(bundle, intent);
        ab H_ = H_();
        if (H_.mo281a((int) C7582R.id.content_frame) == null) {
            Parcelable parcelable = this.f6424H;
            String str = this.f6425I;
            boolean z = this.f6426J;
            C2495w c2495w = this.f6422C;
            Fragment gaVar = new ga();
            gaVar.m6251a(C1473m.f7980a.dn());
            gaVar.m6254a("finsky.ReviewsFragment.document", parcelable);
            if (str == null) {
                str = parcelable.f14885a.f12118y;
            }
            gaVar.m6258b("finsky.ReviewsFragment.reviewsUrl", str);
            gaVar.m6262d("finsky.ReviewsFragment.isRottenTomatoesReviews", z);
            gaVar.mo2580a(c2495w);
            aw a = H_.mo284a();
            a.mo331b(C7582R.id.content_frame, gaVar);
            a.mo334c();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                if (this.f6427K.mo3695b(this.f6316C, true)) {
                    return true;
                }
                super.onBackPressed();
                return true;
            default:
                return false;
        }
    }

    public final C3748a y_() {
        return this.f6427K;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1241c(String str) {
        this.f6423G.m17385a(str);
    }

    public final void mo1237a(int i, boolean z) {
        this.f6423G.m17381a(i, z);
    }

    public final void mo1236a(int i, int i2, boolean z) {
        this.f6423G.m17381a(i, z);
        this.f6423G.m17379a(i2);
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
        this.f6423G.m17381a(i, z);
        this.f6423G.m17379a(i2);
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
        this.f6423G.m17387a(false, -1);
    }

    public final void mo1240c(int i) {
        this.f6423G.m17387a(true, i);
    }

    public final void a_(C2495w c2495w) {
        this.f6423G.m17383a(c2495w);
    }

    public final void mo1244m() {
        finish();
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }
}
