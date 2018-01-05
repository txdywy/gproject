package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2722m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C3973p;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public abstract class C2641k extends ck implements ad, C1031w {
    public final C3974q f14441d = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());
    public boolean f14442e;
    public ce f14443f;

    protected abstract String mo3074a(Document document);

    protected abstract boolean mo3075a();

    protected abstract boolean mo3076a(boolean z, Document document);

    public final int mo2978e() {
        return 1;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((C2658m) this.b).f14703b == null || !((C2658m) this.b).f14703b.mo2861a() || ((C2658m) this.b).f14703b.m14698m() == 0) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (mo3076a(z, document2)) {
            C1473m.f7980a.mo2253l();
            if (!C2833a.m14982c(document2)) {
                if (this.b == null) {
                    this.b = new C2658m();
                    C1473m.f7980a.aO();
                    C2335k a = C2721l.m14734a(this.x, mo3074a(document2), document.m14653h(), false);
                    a.f14938f = 4;
                    a.m11918a((C1031w) this);
                    a.m14699n();
                    ((C2658m) this.b).f14703b = a;
                }
                ((C2658m) this.b).f14702a = document2;
            }
        }
    }

    public final void mo2980h() {
        if (this.b != null && ((C2658m) this.b).f14703b != null) {
            ((C2658m) this.b).f14703b.m11922b((C1031w) this);
        }
    }

    public final void m_() {
        if (mo2979f()) {
            m14176b();
            this.u.mo3033a(this, true);
        }
    }

    public final void mo2976b(View view, int i) {
        C2627n c2627n = (C2627n) view;
        if (!c2627n.f13925h || this.f14442e) {
            c2627n.setReviewFeedbackListener(this);
            List arrayList = new ArrayList(((C2658m) this.b).f14704c.size());
            for (int i2 = 0; i2 < ((C2658m) this.b).f14704c.size(); i2++) {
                C2661q c2661q = (C2661q) ((C2658m) this.b).f14704c.get(i2);
                if (!(c2661q.f14714c || c2661q.f14716e)) {
                    arrayList.add(c2661q);
                }
            }
            c2627n.m13739a(arrayList, ((C2658m) this.b).f14702a, mo3075a(), !C1473m.f7980a.mo2035O().m8839b(), this.z, this.I, this.J, mo3074a(((C2658m) this.b).f14702a));
            this.f14442e = false;
            getParentNode().mo1219a(this);
        }
    }

    public final void mo1364a(String str, String str2, C3973p c3973p) {
        C2722m c2722m = new C2722m(C1473m.f7980a.ap(), str, str2, c3973p.f20051e);
        if (c3973p == C3973p.SPAM || c3973p == C3973p.INAPPROPRIATE) {
            Snackbar.m499a(this.A.f746R, (int) C7582R.string.review_feedback_posted, 0).m501a((int) C7582R.string.review_feedback_undo, new C2657l(this, str, str2, c3973p)).m493a();
        } else {
            Snackbar.m499a(this.A.f746R, (int) C7582R.string.review_feedback_posted, 0).m493a();
        }
        if (this.f14441d.m18695c(str, str2, c3973p)) {
            m14186b(str, str2, c3973p);
            return;
        }
        int i;
        this.f14441d.m18691a(str, str2, c3973p);
        boolean z = c3973p == C3973p.SPAM || c3973p == C3973p.INAPPROPRIATE;
        m14174a(z);
        switch (c3973p.ordinal()) {
            case 0:
                i = 1212;
                break;
            case 1:
                i = 1213;
                break;
            case 2:
                i = 1214;
                break;
            case 3:
                i = 1217;
                break;
            default:
                FinskyLog.m21669e("Unknown review rating selected in reviews samples section: %s", c3973p);
                return;
        }
        this.J.m13379b(new C2475d(this).m13256a(i));
    }

    final void m14186b(String str, String str2, C3973p c3973p) {
        this.f14441d.m18693b(str, str2, c3973p);
        boolean z = c3973p == C3973p.SPAM || c3973p == C3973p.INAPPROPRIATE;
        m14174a(z);
    }

    public final void mo3073a(int i, int i2, Intent intent) {
        super.mo3073a(i, i2, intent);
        if (i == 45 && i2 == -1 && mo2979f()) {
            m14174a(false);
        }
    }

    private final void m14174a(boolean z) {
        m14176b();
        this.f14442e = true;
        this.u.mo3033a(this, z);
    }

    private final void m14176b() {
        if (((C2658m) this.b).f14704c == null) {
            C2658m c2658m = (C2658m) this.b;
            List arrayList = new ArrayList();
            C2711x c2711x = ((C2658m) this.b).f14703b;
            String str = ((C2658m) this.b).f14702a.f14885a.f12096c;
            int m = c2711x.m14698m();
            for (int i = 0; i < m; i++) {
                iu iuVar = (iu) c2711x.m14679a(i, true);
                arrayList.add(new C2661q(iuVar, m14175a(str, iuVar, C3973p.HELPFUL), m14175a(str, iuVar, C3973p.SPAM), m14175a(str, iuVar, C3973p.NOT_HELPFUL), m14175a(str, iuVar, C3973p.INAPPROPRIATE)));
            }
            c2658m.f14704c = arrayList;
            return;
        }
        String str2 = ((C2658m) this.b).f14702a.f14885a.f12096c;
        for (C2661q c2661q : ((C2658m) this.b).f14704c) {
            c2661q.f14713b = m14175a(str2, c2661q.f14712a, C3973p.HELPFUL);
            c2661q.f14714c = m14175a(str2, c2661q.f14712a, C3973p.SPAM);
            c2661q.f14716e = m14175a(str2, c2661q.f14712a, C3973p.INAPPROPRIATE);
            c2661q.f14715d = m14175a(str2, c2661q.f14712a, C3973p.NOT_HELPFUL);
        }
    }

    private final boolean m14175a(String str, iu iuVar, C3973p c3973p) {
        return this.f14441d.m18695c(str, iuVar.f12715c, c3973p);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14443f == null) {
            this.f14443f = C2482j.m13283a(1210);
        }
        return this.f14443f;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2658m) c2600d);
        if (this.b != null && ((C2658m) this.b).f14703b != null) {
            if (((C2658m) this.b).f14703b.mo2861a()) {
                m14176b();
                return;
            }
            ((C2658m) this.b).f14703b.m11918a((C1031w) this);
            ((C2658m) this.b).f14703b.m14699n();
        }
    }
}
