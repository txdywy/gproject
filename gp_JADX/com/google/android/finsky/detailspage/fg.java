package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.layout.ReviewReplyLayout;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.play.utils.j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class fg extends ck implements ad, fn {
    public boolean f14570d;
    public ce f14571e;
    public C3964c f14572f = C1473m.f7980a.ac();
    public C3974q f14573g = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.testing_program_my_review_module;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((fk) this.b).f14578b == null) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && this.b == null) {
            this.b = new fk();
            ((fk) this.b).f14577a = document2;
            ((fk) this.b).f14579c = c2719i2.m14723c();
            fk fkVar = (fk) this.b;
            C1473m.f7980a.mo2253l();
            fkVar.f14580d = !C2833a.m14982c(document2);
            m14336b();
        }
    }

    public final void mo2976b(View view, int i) {
        TestingProgramMyReviewModuleLayout testingProgramMyReviewModuleLayout = (TestingProgramMyReviewModuleLayout) view;
        Document document = ((fk) this.b).f14577a;
        iu iuVar = ((fk) this.b).f14578b;
        boolean z = ((fk) this.b).f14580d;
        Resources resources = testingProgramMyReviewModuleLayout.getResources();
        testingProgramMyReviewModuleLayout.f14080a = this;
        if (z) {
            testingProgramMyReviewModuleLayout.f14081b.setText(resources.getString(C7582R.string.testing_program_your_beta_feedback));
        } else {
            testingProgramMyReviewModuleLayout.f14081b.setText(resources.getString(C7582R.string.testing_program_your_public_review));
        }
        testingProgramMyReviewModuleLayout.f14082c.setText(iuVar.f12716d.f12100g);
        testingProgramMyReviewModuleLayout.f14082c.setVisibility(0);
        if (iuVar.bs_()) {
            testingProgramMyReviewModuleLayout.f14083d.setText(C1473m.f7980a.bb().m21826a(iuVar.f12724l));
            testingProgramMyReviewModuleLayout.f14083d.setVisibility(0);
        } else {
            testingProgramMyReviewModuleLayout.f14083d.setVisibility(8);
        }
        if (TextUtils.isEmpty(iuVar.f12719g)) {
            testingProgramMyReviewModuleLayout.f14084e.setVisibility(8);
        } else {
            testingProgramMyReviewModuleLayout.f14084e.setVisibility(0);
            testingProgramMyReviewModuleLayout.f14084e.setText(Html.fromHtml(iuVar.f12719g));
        }
        if (TextUtils.isEmpty(iuVar.f12720h)) {
            testingProgramMyReviewModuleLayout.f14085f.setVisibility(8);
        } else {
            testingProgramMyReviewModuleLayout.f14085f.setVisibility(0);
            testingProgramMyReviewModuleLayout.f14085f.setText(Html.fromHtml(iuVar.f12720h));
        }
        cv cvVar = iuVar.f12716d;
        if (cvVar != null) {
            testingProgramMyReviewModuleLayout.f14086g.m17564a(cvVar, C1473m.f7980a.be());
            testingProgramMyReviewModuleLayout.f14086g.setVisibility(0);
        } else {
            testingProgramMyReviewModuleLayout.f14086g.setVisibility(8);
        }
        if (iuVar.m12828d()) {
            if (testingProgramMyReviewModuleLayout.f14088i == null) {
                testingProgramMyReviewModuleLayout.f14088i = (ReviewReplyLayout) testingProgramMyReviewModuleLayout.f14087h.inflate();
            }
            testingProgramMyReviewModuleLayout.f14088i.m17341a(document, iuVar);
        } else if (testingProgramMyReviewModuleLayout.f14088i != null) {
            testingProgramMyReviewModuleLayout.f14088i.setVisibility(8);
        }
        testingProgramMyReviewModuleLayout.f14089j.setOnClickListener(new fl(testingProgramMyReviewModuleLayout));
        testingProgramMyReviewModuleLayout.f14089j.setVisibility(0);
        if (testingProgramMyReviewModuleLayout.f14090k.isEmpty()) {
            testingProgramMyReviewModuleLayout.f14089j.getHitRect(testingProgramMyReviewModuleLayout.f14090k);
            testingProgramMyReviewModuleLayout.f14090k.inset(-testingProgramMyReviewModuleLayout.f14091l, -testingProgramMyReviewModuleLayout.f14091l);
            testingProgramMyReviewModuleLayout.setTouchDelegate(new j(testingProgramMyReviewModuleLayout.f14090k, testingProgramMyReviewModuleLayout.f14089j));
        }
        getParentNode().mo1219a(this);
    }

    public final void mo2980h() {
        this.f14570d = true;
    }

    private final void m14336b() {
        iu a = this.f14573g.m18689a(((fk) this.b).f14577a.f14885a.f12096c, null, ((fk) this.b).f14580d);
        if (a != null) {
            ((fk) this.b).f14578b = a;
        } else if (!TextUtils.isEmpty(((fk) this.b).f14579c)) {
            this.x.mo1632c(((fk) this.b).f14579c, new fh(this, ((fk) this.b).f14580d), new fi());
        }
    }

    public final void mo3092a() {
        this.J.m13379b(new C2475d(this).m13256a(6041));
        this.f14572f.m18683a(C1473m.f7980a.cZ(), ((fk) this.b).f14577a.f14885a.f12096c, ((fk) this.b).f14579c, this.t, new fj(this), ((fk) this.b).f14580d);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14571e == null) {
            this.f14571e = C2482j.m13283a(6040);
        }
        return this.f14571e;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((fk) c2600d);
        if (this.b != null && ((fk) this.b).f14578b == null) {
            m14336b();
        }
    }
}
