package com.google.android.finsky.detailspage;

import android.content.ActivityNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.layout.az;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class fo extends ck implements OnFocusChangeListener, C0999d, ad, gc, gd {
    public boolean f14583d;
    public boolean f14584e;
    public boolean f14585f;
    public boolean f14586g;
    public boolean f14587h;
    public C3964c f14588i = C1473m.f7980a.ac();
    public C3974q f14589j = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());
    public ce f14590k = C2482j.m13283a(6020);

    public final boolean mo2979f() {
        return this.b != null && ((fw) this.b).f14597a && ((fw) this.b).f14602f;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z) {
            C1473m.f7980a.mo2253l();
            if (C2833a.m14982c(document2) && this.b == null) {
                this.b = new fw();
                ((fw) this.b).f14599c = document2;
                ((fw) this.b).f14598b = c2719i.m14725e();
                fw fwVar = (fw) this.b;
                boolean z2 = !this.D.mo2812a(document2.m14625N().f13171k).isEmpty() && ((fw) this.b).f14598b;
                fwVar.f14597a = z2;
                ((fw) this.b).f14604h = c2719i2.m14723c();
                this.D.mo2814a((C0999d) this);
                if (((fw) this.b).f14597a) {
                    m14356m();
                }
            }
        }
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.testing_program_review_module;
    }

    public final void mo2976b(View view, int i) {
        TestingProgramReviewModuleLayout testingProgramReviewModuleLayout = (TestingProgramReviewModuleLayout) view;
        if (!testingProgramReviewModuleLayout.f14093b || this.f14583d) {
            gc gcVar;
            Document document = ((fw) this.b).f14599c;
            cv cvVar = ((fw) this.b).f14603g;
            C2495w c2495w = this.J;
            testingProgramReviewModuleLayout.f14094c = this;
            testingProgramReviewModuleLayout.f14092a = this;
            testingProgramReviewModuleLayout.f14096e = document;
            testingProgramReviewModuleLayout.f14097f = cvVar;
            testingProgramReviewModuleLayout.f14108q.setCommentFocusChangeListener(this);
            testingProgramReviewModuleLayout.f14095d = c2495w;
            if (TextUtils.isEmpty(m14357n())) {
                gcVar = null;
            } else {
                Object obj = this;
            }
            iu iuVar;
            Resources resources;
            if (((fw) this.b).f14605i) {
                String str;
                CharSequence string;
                iuVar = ((fw) this.b).f14601e;
                boolean z = ((fw) this.b).f14600d == null;
                Resources resources2 = testingProgramReviewModuleLayout.getResources();
                testingProgramReviewModuleLayout.f14104m.setVisibility(8);
                testingProgramReviewModuleLayout.f14105n.setVisibility(8);
                testingProgramReviewModuleLayout.f14102k.setVisibility(0);
                testingProgramReviewModuleLayout.f14102k.setText(resources2.getString(C7582R.string.testing_program_review_description));
                testingProgramReviewModuleLayout.f14103l.setVisibility(8);
                testingProgramReviewModuleLayout.f14107p.setVisibility(8);
                testingProgramReviewModuleLayout.f14100i.setToFadeInAfterLoad(false);
                if (iuVar != null) {
                    testingProgramReviewModuleLayout.m13796a(true);
                } else {
                    iuVar = new iu();
                    testingProgramReviewModuleLayout.f14106o.setVisibility(8);
                }
                if (iuVar.f12720h == null) {
                    str = "";
                } else {
                    str = iuVar.f12720h;
                }
                testingProgramReviewModuleLayout.f14108q.setCommentViewFocusable(true);
                RateReviewEditor rateReviewEditor = testingProgramReviewModuleLayout.f14108q;
                int i2 = testingProgramReviewModuleLayout.f14096e.f14885a.f12099f;
                cv cvVar2 = testingProgramReviewModuleLayout.f14096e.f14885a;
                CharSequence charSequence = iuVar.f12720h;
                rateReviewEditor.f = i2;
                rateReviewEditor.f18296n = z;
                if (rateReviewEditor.f18294l == null) {
                    rateReviewEditor.f18292j.measure(0, 0);
                    int measuredHeight = rateReviewEditor.f18292j.getMeasuredHeight();
                    ((LayoutParams) rateReviewEditor.f18292j.getLayoutParams()).setMargins(0, -measuredHeight, 0, 0);
                    rateReviewEditor.f18294l = new InsetDrawable(rateReviewEditor.f18293k, 0, 0, 0, measuredHeight);
                }
                rateReviewEditor.mo3567b(0);
                rateReviewEditor.m17333a(0);
                rateReviewEditor.f18292j.setVisibility(8);
                rateReviewEditor.f18292j.setPositiveButtonTextColor(rateReviewEditor.getResources().getColor(C1608h.m9241a(i2)));
                rateReviewEditor.f18292j.setNegativeButtonTextColor(rateReviewEditor.getResources().getColor(C7582R.color.play_secondary_text));
                rateReviewEditor.e.setText(charSequence);
                ai.m1824a(rateReviewEditor.e, C1608h.m9257d(rateReviewEditor.getContext(), rateReviewEditor.f));
                resources = rateReviewEditor.getContext().getResources();
                switch (rateReviewEditor.f) {
                    case 1:
                        string = resources.getString(C7582R.string.rate_review_books_tip);
                        break;
                    default:
                        string = null;
                        break;
                }
                if (string != null) {
                    rateReviewEditor.f18291i.setText(string);
                } else {
                    rateReviewEditor.f18291i.setVisibility(8);
                }
                rateReviewEditor.e.addTextChangedListener(rateReviewEditor.h);
                rateReviewEditor.e.setOnFocusChangeListener(new az(rateReviewEditor));
                rateReviewEditor.f18289a.setVisibility(8);
                rateReviewEditor.f18290c.setVisibility(8);
                rateReviewEditor.e.setHint(C7582R.string.testing_program_review_dialog_content_hint);
                testingProgramReviewModuleLayout.f14108q.setClickListener(new fx(testingProgramReviewModuleLayout, str));
                testingProgramReviewModuleLayout.f14108q.setVisibility(0);
                testingProgramReviewModuleLayout.f14108q.setReviewChangeListener(new fy(testingProgramReviewModuleLayout));
                testingProgramReviewModuleLayout.m13793a();
                testingProgramReviewModuleLayout.m13795a(gcVar);
                testingProgramReviewModuleLayout.f14093b = true;
                if (!(((fw) this.b).f14606j == null || this.f14586g)) {
                    testingProgramReviewModuleLayout.restoreHierarchyState(((fw) this.b).f14606j);
                }
                ((fw) this.b).f14606j = null;
            } else if (((fw) this.b).f14601e != null) {
                iuVar = ((fw) this.b).f14601e;
                resources = testingProgramReviewModuleLayout.getResources();
                int i3 = iuVar.f12717e;
                testingProgramReviewModuleLayout.f14108q.setVisibility(8);
                testingProgramReviewModuleLayout.f14104m.setRating((float) i3);
                testingProgramReviewModuleLayout.f14103l.setVisibility(8);
                testingProgramReviewModuleLayout.f14104m.setVisibility(0);
                testingProgramReviewModuleLayout.f14107p.setVisibility(8);
                testingProgramReviewModuleLayout.f14111t.setVisibility(8);
                testingProgramReviewModuleLayout.m13796a(false);
                CharSequence charSequence2 = iuVar.f12719g;
                CharSequence charSequence3 = iuVar.f12720h;
                Iterable arrayList = new ArrayList(2);
                if (!TextUtils.isEmpty(charSequence2)) {
                    arrayList.add(charSequence2);
                }
                if (!TextUtils.isEmpty(charSequence3)) {
                    arrayList.add(charSequence3);
                }
                Object join = TextUtils.join("\n", arrayList);
                if (TextUtils.isEmpty(join)) {
                    testingProgramReviewModuleLayout.f14105n.setVisibility(8);
                } else {
                    testingProgramReviewModuleLayout.f14105n.setText(C4685p.m21831a(join));
                    testingProgramReviewModuleLayout.f14105n.setVisibility(0);
                }
                testingProgramReviewModuleLayout.setContentDescription(resources.getQuantityString(C7582R.plurals.content_description_rated, i3, new Object[]{Integer.valueOf(i3)}));
                testingProgramReviewModuleLayout.f14102k.setText(ae.m9214a(resources.getString(C7582R.string.my_testing_program_review, new Object[]{C1473m.f7980a.bb().m21826a(iuVar.f12724l)})));
                testingProgramReviewModuleLayout.f14102k.setVisibility(0);
                testingProgramReviewModuleLayout.m13793a();
                if (iuVar.m12828d()) {
                    if (testingProgramReviewModuleLayout.f14109r == null) {
                        testingProgramReviewModuleLayout.f14109r = (MyReviewReplyLayout) testingProgramReviewModuleLayout.f14110s.inflate();
                    }
                    testingProgramReviewModuleLayout.f14109r.m17326a(testingProgramReviewModuleLayout.f14096e, iuVar);
                } else if (testingProgramReviewModuleLayout.f14109r != null) {
                    testingProgramReviewModuleLayout.f14109r.setVisibility(8);
                }
                testingProgramReviewModuleLayout.m13795a(gcVar);
                testingProgramReviewModuleLayout.f14104m.setVisibility(8);
                testingProgramReviewModuleLayout.f14093b = true;
            } else {
                FinskyLog.m21669e("Unexpected TestingProgramReviewModule onBindView case.", new Object[0]);
            }
            this.f14583d = false;
        }
        if (this.f14584e) {
            this.f14584e = false;
            new Handler().post(new fp(this));
        }
        getParentNode().mo1219a(this);
    }

    public final void mo3037c(View view, int i) {
        super.mo3037c(view, i);
        if (this.b == null) {
            return;
        }
        if (((fw) this.b).f14605i) {
            ((fw) this.b).f14606j = new SparseArray();
            view.saveHierarchyState(((fw) this.b).f14606j);
            return;
        }
        ((fw) this.b).f14606j = null;
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14585f = true;
    }

    public final void mo3093a() {
    }

    public final void mo3095b() {
        if (((fw) this.b).f14601e != null) {
            m14355b(6022);
            ((fw) this.b).f14605i = true;
            m14375j();
        }
    }

    public final void mo3096d() {
        m14355b(6024);
        String cZ = C1473m.f7980a.cZ();
        ((fw) this.b).f14605i = true;
        this.f14588i.m18683a(cZ, ((fw) this.b).f14599c.f14885a.f12096c, ((fw) this.b).f14604h, this.t, new fv(this), true);
    }

    public final void mo3094a(String str) {
        if (this.f14587h) {
            m14364a(true);
            return;
        }
        m14355b(6023);
        if (!str.isEmpty()) {
            ((fw) this.b).f14605i = false;
            if (((fw) this.b).f14600d == null || !TextUtils.equals(str, ((fw) this.b).f14600d.f12720h)) {
                Document document = new Document(((fw) this.b).f14603g);
                this.f14588i.m18682a(C1473m.f7980a.cZ(), ((fw) this.b).f14599c.f14885a.f12096c, ((fw) this.b).f14604h, 5, "", str, document, this.t, new fu(this), 6020, true);
            }
        }
        m14375j();
    }

    public final void mo3097i() {
        if (this.f14587h) {
            m14364a(true);
            return;
        }
        ((fw) this.b).f14601e = ((fw) this.b).f14600d;
        ((fw) this.b).f14605i = ((fw) this.b).f14601e == null;
        m14375j();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (this.b != null && ((fw) this.b).f14599c != null) {
            boolean z = ((fw) this.b).f14597a;
            fw fwVar = (fw) this.b;
            boolean z2 = C3964c.m18678a(this.D, ((fw) this.b).f14599c) && ((fw) this.b).f14598b;
            fwVar.f14597a = z2;
            if (z == ((fw) this.b).f14597a) {
                return;
            }
            if (((fw) this.b).f14597a) {
                m14356m();
            } else {
                this.u.mo3032a(this);
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        this.f14586g = z;
    }

    private final void m14356m() {
        iu a = this.f14589j.m18689a(((fw) this.b).f14599c.f14885a.f12096c, null, true);
        if (a != null) {
            m14360a(a);
        } else if (TextUtils.isEmpty(((fw) this.b).f14604h)) {
            m14360a(null);
        } else {
            this.x.mo1632c(((fw) this.b).f14604h, new fq(this), new fr());
        }
    }

    final void m14360a(iu iuVar) {
        ((fw) this.b).f14600d = iuVar;
        ((fw) this.b).f14601e = ((fw) this.b).f14600d;
        ((fw) this.b).f14605i = ((fw) this.b).f14601e == null;
        C1473m.f7980a.aq().mo5377a(new fs(this), new ft(), true);
    }

    final void m14375j() {
        m14376k();
        if (!this.f14585f) {
            this.f14583d = true;
            this.u.mo3033a(this, true);
        }
    }

    final void m14376k() {
        ((fw) this.b).f14600d = ((fw) this.b).f14601e;
        ((fw) this.b).f14601e = this.f14589j.m18689a(((fw) this.b).f14599c.f14885a.f12096c, ((fw) this.b).f14600d, true);
    }

    final void m14364a(boolean z) {
        if (z) {
            Toast.makeText(this.t, C7582R.string.review_error, 0).show();
        }
        ((fw) this.b).f14601e = ((fw) this.b).f14600d;
        ((fw) this.b).f14605i = false;
        this.f14587h = false;
        m14375j();
    }

    private final String m14357n() {
        Document document;
        if (((fw) this.b).f14599c.bW()) {
            document = ((fw) this.b).f14599c;
            if (document.bW()) {
                return document.m14625N().f13155D.f12124c;
            }
            return null;
        } else if (((fw) this.b).f14599c.bT()) {
            document = ((fw) this.b).f14599c;
            if (document.bS()) {
                return document.m14625N().f13154C.f12953e;
            }
            return null;
        } else {
            FinskyLog.m21669e("Unexpected case.", new Object[0]);
            return null;
        }
    }

    public final void mo3098l() {
        m14355b(6021);
        try {
            this.t.startActivity(C1473m.f7980a.bn().mo2689a(Uri.parse(m14357n())));
        } catch (ActivityNotFoundException e) {
            this.A.bm.mo1238a("", this.t.getString(C7582R.string.no_web_app), this.J);
        }
    }

    private final void m14355b(int i) {
        this.J.m13379b(new C2475d(this).m13256a(i));
    }

    public ce getPlayStoreUiElement() {
        return this.f14590k;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((fw) c2600d);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
            if (!((fw) this.b).f14597a) {
                return;
            }
            if (((fw) this.b).f14602f) {
                iu a = this.f14589j.m18689a(((fw) this.b).f14599c.f14885a.f12096c, ((fw) this.b).f14601e, true);
                iu iuVar = ((fw) this.b).f14601e;
                boolean z = iuVar == a ? true : (iuVar == null || a == null || iuVar.f12724l != a.f12724l) ? false : true;
                if (!z) {
                    this.f14584e = true;
                    ((fw) this.b).f14605i = false;
                    return;
                }
                return;
            }
            m14356m();
        }
    }
}
