package com.google.android.finsky.layout.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.search.FinskySearch;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class FinskySearchToolbar extends PlaySearchToolbar implements ad {
    public C0950c f18433P;
    public int f18434Q;
    public final ce f18435R;
    public final C2471a f18436S;
    public C2495w f18437T;
    public View f18438U;
    public int f18439V;
    public final C3667j f18440W;
    public C3784h aa;
    public C1461c ab;

    public FinskySearchToolbar(Context context) {
        this(context, null);
    }

    public FinskySearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18435R = C2482j.m13283a(5300);
        this.f18436S = C1473m.f7980a.aR();
        this.f18440W = new C3668j(this);
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1863a(this);
        this.f18437T = this.f18436S.m13184a(null);
        this.f18439V = 1;
        setPlaySearchListener(new C3669k(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentBackendId(int r9) {
        /*
        r8 = this;
        r7 = 6;
        r1 = 2131952891; // 0x7f1304fb float:1.9542238E38 double:1.053324682E-314;
        r6 = 4;
        r5 = 2;
        r4 = 1;
        r0 = r8.getSearchView();
        r0 = (com.google.android.finsky.search.FinskySearch) r0;
        r0.setCurrentBackendId(r9);
        r0 = r8.getActionView();
        r0 = (com.google.android.finsky.search.FinskySearch) r0;
        r0.setCurrentBackendId(r9);
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.dj();
        r2 = 12603098; // 0xc04eda float:1.7660702E-38 double:6.226758E-317;
        r0 = r0.mo2294a(r2);
        if (r0 == 0) goto L_0x0053;
    L_0x0028:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r2 = r0.dn();
        r0 = 0;
        if (r2 == 0) goto L_0x0033;
    L_0x0031:
        r0 = r2.f14883c;
    L_0x0033:
        r2 = r8.getContext();
        r2 = r2.getResources();
        switch(r9) {
            case 1: goto L_0x005c;
            case 2: goto L_0x007c;
            case 3: goto L_0x0054;
            case 4: goto L_0x006c;
            case 5: goto L_0x003e;
            case 6: goto L_0x0064;
            case 7: goto L_0x0074;
            case 8: goto L_0x003e;
            case 9: goto L_0x003e;
            case 10: goto L_0x003e;
            case 11: goto L_0x003e;
            case 12: goto L_0x003e;
            case 13: goto L_0x0084;
            default: goto L_0x003e;
        };
    L_0x003e:
        r0 = 2131952883; // 0x7f1304f3 float:1.9542221E38 double:1.053324678E-314;
        r0 = r2.getString(r0);
    L_0x0045:
        r1 = r8.getSearchView();
        r1.setHint(r0);
        r1 = r8.getActionView();
        r1.setHint(r0);
    L_0x0053:
        return;
    L_0x0054:
        r0 = 2131952884; // 0x7f1304f4 float:1.9542223E38 double:1.0533246785E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x005c:
        r0 = 2131952885; // 0x7f1304f5 float:1.9542225E38 double:1.053324679E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x0064:
        r0 = 2131952898; // 0x7f130502 float:1.9542252E38 double:1.0533246855E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x006c:
        r0 = 2131952887; // 0x7f1304f7 float:1.954223E38 double:1.05332468E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x0074:
        r0 = 2131952899; // 0x7f130503 float:1.9542254E38 double:1.053324686E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x007c:
        r0 = 2131952894; // 0x7f1304fe float:1.9542244E38 double:1.0533246835E-314;
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x0084:
        if (r0 != 0) goto L_0x0094;
    L_0x0086:
        r0 = "DfeToc not available yet";
        r3 = 0;
        r3 = new java.lang.Object[r3];
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r3);
        r0 = r1;
    L_0x008f:
        r0 = r2.getString(r0);
        goto L_0x0045;
    L_0x0094:
        r3 = com.google.android.finsky.bg.C1608h.m9250a();
        r3 = com.google.android.finsky.bg.C1608h.m9245a(r3, r0);
        if (r3 > r6) goto L_0x00a0;
    L_0x009e:
        if (r3 >= r5) goto L_0x00b0;
    L_0x00a0:
        r0 = "Invalid digital content corpora count available [%d]";
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r3 = java.lang.Integer.valueOf(r3);
        r4[r5] = r3;
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r4);
        r0 = r1;
        goto L_0x008f;
    L_0x00b0:
        switch(r3) {
            case 2: goto L_0x00bd;
            case 3: goto L_0x0150;
            case 4: goto L_0x018a;
            default: goto L_0x00b3;
        };
    L_0x00b3:
        r0 = "Error in choosing entertainment search box hint";
        r3 = 0;
        r3 = new java.lang.Object[r3];
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r3);
        r0 = r1;
        goto L_0x008f;
    L_0x00bd:
        r3 = java.lang.Integer.valueOf(r6);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00d5;
    L_0x00c7:
        r3 = java.lang.Integer.valueOf(r5);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00d5;
    L_0x00d1:
        r0 = 2131952890; // 0x7f1304fa float:1.9542236E38 double:1.0533246815E-314;
        goto L_0x008f;
    L_0x00d5:
        r3 = java.lang.Integer.valueOf(r6);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00ed;
    L_0x00df:
        r3 = java.lang.Integer.valueOf(r4);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00ed;
    L_0x00e9:
        r0 = 2131952888; // 0x7f1304f8 float:1.9542231E38 double:1.0533246805E-314;
        goto L_0x008f;
    L_0x00ed:
        r3 = java.lang.Integer.valueOf(r6);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0105;
    L_0x00f7:
        r3 = java.lang.Integer.valueOf(r7);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0105;
    L_0x0101:
        r0 = 2131952893; // 0x7f1304fd float:1.9542242E38 double:1.053324683E-314;
        goto L_0x008f;
    L_0x0105:
        r3 = java.lang.Integer.valueOf(r5);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x011e;
    L_0x010f:
        r3 = java.lang.Integer.valueOf(r4);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x011e;
    L_0x0119:
        r0 = 2131952895; // 0x7f1304ff float:1.9542246E38 double:1.053324684E-314;
        goto L_0x008f;
    L_0x011e:
        r3 = java.lang.Integer.valueOf(r5);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0137;
    L_0x0128:
        r3 = java.lang.Integer.valueOf(r7);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0137;
    L_0x0132:
        r0 = 2131952897; // 0x7f130501 float:1.954225E38 double:1.053324685E-314;
        goto L_0x008f;
    L_0x0137:
        r3 = java.lang.Integer.valueOf(r4);
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00b3;
    L_0x0141:
        r3 = java.lang.Integer.valueOf(r7);
        r0 = r0.contains(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x014b:
        r0 = 2131952886; // 0x7f1304f6 float:1.9542227E38 double:1.0533246795E-314;
        goto L_0x008f;
    L_0x0150:
        r3 = java.lang.Integer.valueOf(r7);
        r3 = r0.contains(r3);
        if (r3 != 0) goto L_0x015d;
    L_0x015a:
        r0 = r1;
        goto L_0x008f;
    L_0x015d:
        r3 = java.lang.Integer.valueOf(r4);
        r3 = r0.contains(r3);
        if (r3 != 0) goto L_0x016c;
    L_0x0167:
        r0 = 2131952892; // 0x7f1304fc float:1.954224E38 double:1.0533246825E-314;
        goto L_0x008f;
    L_0x016c:
        r3 = java.lang.Integer.valueOf(r5);
        r3 = r0.contains(r3);
        if (r3 != 0) goto L_0x017b;
    L_0x0176:
        r0 = 2131952889; // 0x7f1304f9 float:1.9542233E38 double:1.053324681E-314;
        goto L_0x008f;
    L_0x017b:
        r3 = java.lang.Integer.valueOf(r6);
        r0 = r0.contains(r3);
        if (r0 != 0) goto L_0x00b3;
    L_0x0185:
        r0 = 2131952896; // 0x7f130500 float:1.9542248E38 double:1.0533246845E-314;
        goto L_0x008f;
    L_0x018a:
        r0 = r1;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.actionbar.FinskySearchToolbar.setCurrentBackendId(int):void");
    }

    public void setCurrentSearchBehaviorId(int i) {
        ((FinskySearch) getSearchView()).setCurrentSearchBehaviorId(i);
        ((FinskySearch) getActionView()).setCurrentSearchBehaviorId(i);
    }

    public void setPageLevelLoggingContext(C2495w c2495w) {
        this.f18437T = c2495w;
        ((FinskySearch) getSearchView()).setPageLevelLoggingContext(c2495w);
        ((FinskySearch) getActionView()).setPageLevelLoggingContext(c2495w);
    }

    protected final boolean m17369h() {
        return true;
    }

    public void setNavigationManager(C3748a c3748a) {
        ((FinskySearch) getSearchView()).setNavigationManager(c3748a);
        ((FinskySearch) getActionView()).setNavigationManager(c3748a);
    }

    public void setActionBarController(C0950c c0950c) {
        this.f18433P = c0950c;
    }

    public final void m17368a(boolean z, int i) {
        int i2 = (!z || this.af) ? 0 : 1;
        super.a(z, i);
        setContentInsetStartWithNavigation(0);
        if (i2 != 0) {
            this.f18439V = i;
            m17366a(this.aa.mo3756a());
            this.f18437T.m13370a(new C2488p().m13345b(m17372k()));
            return;
        }
        m17366a(this.aa.mo3756a());
    }

    protected final void m17370i() {
        if (this.f18433P != null) {
            this.f18433P.mo1271f();
        }
    }

    protected final void m17371j() {
        if (this.f18433P != null) {
            this.f18433P.mo1272g();
        }
    }

    private final boolean m17365n() {
        return this.ab.dj().mo2294a(12641192);
    }

    final void m17366a(int i) {
        if (m17365n() && this.af && this.f18439V == 1 && i > 0) {
            if (this.f18438U == null) {
                this.f18438U = getSearchView().findViewById(C7582R.id.dot_notification);
            }
            this.f18438U.setVisibility(0);
            getSearchView().setBurgerMenuOpenDescription(C7582R.string.play_drawer_open_new_notifications);
        } else if (this.f18438U != null) {
            this.f18438U.setVisibility(8);
            getSearchView().setBurgerMenuOpenDescription(C7582R.string.play_drawer_open);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        super.setNavigationOnClickListener(new C3670l(this, onClickListener));
    }

    public void setSearchBoxFixedWidth(int i) {
        this.f18434Q = i;
        requestLayout();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m17365n()) {
            this.aa.mo3757a(this.f18440W);
            m17366a(this.aa.mo3756a());
        }
    }

    protected void onDetachedFromWindow() {
        this.aa.mo3758b(this.f18440W);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        if (this.f18434Q > 0) {
            int size = (MeasureSpec.getSize(i) - this.f18434Q) / 2;
            PlaySearch searchView = getSearchView();
            searchView.a(size, searchView.getSearchPlateMarginTop(), size, searchView.getSearchPlateMarginBottom(), false);
        }
        super.onMeasure(i, i2);
    }

    final ad m17372k() {
        ad c2473o = new C2473o(5301, this);
        Object obj = (this.f18438U == null || this.f18438U.getVisibility() != 0) ? null : 1;
        if (obj != null) {
            return new C2473o(299, c2473o);
        }
        return c2473o;
    }

    public ce getPlayStoreUiElement() {
        return this.f18435R;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
