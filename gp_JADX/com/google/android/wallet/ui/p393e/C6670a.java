package com.google.android.wallet.ui.p393e;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.h.h;
import android.support.v4.view.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.e.a.a;
import com.google.a.a.a.a.b.a.a.e.a.b;
import com.google.a.a.a.a.b.a.a.f.e;
import com.google.a.a.a.a.b.a.a.f.j;
import com.google.a.a.a.a.b.a.a.f.m;
import com.google.a.a.a.a.b.a.a.f.n;
import com.google.a.a.a.a.b.a.a.f.o;
import com.google.a.a.a.a.b.a.a.f.p;
import com.google.a.a.a.a.b.a.a.f.q;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.a.a.a.a.b.a.b.a.an;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.C6608t;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.address.C6710t;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.C6752d;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.LinkView;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.az;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.br;
import com.google.android.wallet.ui.common.bt;
import com.google.android.wallet.ui.common.ce;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.co;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.date.DatePickerView;
import com.google.android.wallet.ui.expander.C6521h;
import com.google.android.wallet.ui.expander.C6811c;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import com.google.android.wallet.ui.p400b.C6731a;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C6670a extends au implements C6511g {
    public int f32930a;
    public final ArrayList af = new ArrayList();
    public final ArrayList ag = new ArrayList();
    public final ArrayList ah = new ArrayList();
    public final ArrayList ai = new ArrayList();
    public final ArrayList aj = new ArrayList();
    public final ArrayList ak = new ArrayList();
    public final ArrayList al = new ArrayList();
    public final ArrayList am = new ArrayList();
    public final ArrayList an = new ArrayList();
    public final ArrayList ao = new ArrayList();
    public final ArrayList ap = new ArrayList();
    public final ArrayList aq = new ArrayList();
    public final ArrayList ar = new ArrayList();
    public FormHeaderView as;
    public final ArrayList at = new ArrayList();
    public final ArrayList au = new ArrayList();
    public int av;
    public final h aw = new h();
    public int f32931b;
    public final C6506n f32932c = new C6506n(1715);
    public final ArrayList f32933d = new ArrayList();
    public final ArrayList f32934e = new ArrayList();
    public final ArrayList f32935f = new ArrayList();
    public final ArrayList f32936g = new ArrayList();
    public LinearLayout f32937h;
    public final ArrayList f32938i = new ArrayList();

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        if (bundle != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object intArray = bundle.getIntArray("regionCodes_" + i);
                if (intArray != null) {
                    this.aq.add(intArray);
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View childAt;
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicInfoMessageLayout, C6617a.internalUicLegalMessageLayout, C6617a.internalUicFormNonEditableTextStartMargin, C6617a.internalUicNonFormFieldTextTopBottomMargin, C6617a.uicLegalMessageTopMargin});
        this.f32930a = obtainStyledAttributes.getResourceId(0, C6623g.view_info_message_text);
        int resourceId = obtainStyledAttributes.getResourceId(1, C6623g.view_legal_message_text);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f32931b = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        obtainStyledAttributes.recycle();
        this.f32937h = (LinearLayout) layoutInflater.inflate(C6623g.fragment_simple, viewGroup, false);
        this.f32937h.setId(au().m30742a());
        this.as = (FormHeaderView) this.f32937h.findViewById(C6622f.header);
        this.as.m30620a(((o) this.aD).a, layoutInflater, ap(), this, this.f32933d);
        int i = 0;
        c[] cVarArr = ((o) this.aD).a.f;
        int length = cVarArr.length;
        int i2 = 0;
        ak[] akVarArr = ((o) this.aD).c;
        int length2 = akVarArr.length;
        C6506n c6506n = new C6506n(1716);
        int length3 = ((o) this.aD).b.length;
        int i3 = 0;
        while (i3 < length3) {
            int length4;
            Object obj;
            p pVar = ((o) this.aD).b[i3];
            ViewGroup viewGroup2 = this.f32937h;
            Object obj2 = (i >= length || i3 < cVarArr[i].k || i3 > cVarArr[i].l) ? null : 1;
            if (obj2 != null) {
                if (i3 == cVarArr[i].k) {
                    c cVar = cVarArr[i];
                    if (cVar.c != 3) {
                        throw new IllegalArgumentException("Component group types other than field groups are not supported.");
                    }
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    for (int i4 = cVar.k; i4 <= cVar.l; i4++) {
                        p pVar2 = ((o) this.aD).b[i4];
                        if (pVar2.c() != null) {
                            length4 = pVar2.c().b.length;
                            obj5 = obj4;
                            obj = obj3;
                            for (int i5 = 0; i5 < length4; i5++) {
                                if (pVar2.c().b[i5].d() != null) {
                                    obj = 1;
                                }
                                if (pVar2.c().b[i5].f() != null) {
                                    obj5 = 1;
                                }
                            }
                            obj4 = obj5;
                            obj3 = obj;
                            obj5 = 1;
                        } else {
                            if (pVar2.d().d() != null) {
                                obj3 = 1;
                            }
                            if (pVar2.d().f() != null) {
                                obj4 = 1;
                            }
                        }
                    }
                    if (obj4 != null) {
                        throw new IllegalArgumentException("OTP fields are not supported in field groups.");
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else if (cVar.k < cVar.l) {
                        throw new IllegalArgumentException("Field groups containing address forms may not contain multiple fields.");
                    } else if (obj5 != null) {
                        throw new IllegalArgumentException("Field groups containing address forms may not contain subforms.");
                    } else {
                        m mVar = (m) C6608t.m29983a(((o) this.aD).b[cVar.k].d());
                        mVar.d().A = cVar.g;
                        m30212a(this.f32937h, mVar, ((o) this.aD).a.a, -1, cVar.k);
                        obj = 1;
                    }
                    if (obj != null) {
                        int i6 = i + 1;
                        i3++;
                        i = i6;
                    } else {
                        throw new IllegalStateException("Field groups are not supported for SimpleFragment.");
                    }
                }
                SummaryExpanderWrapper summaryExpanderWrapper = null;
                viewGroup2 = summaryExpanderWrapper.getContainerView();
            }
            Object obj6 = (i2 >= length2 || i3 < akVarArr[i2].b || i3 > akVarArr[i2].c) ? null : 1;
            if (obj2 == null || obj6 == null || (akVarArr[i2].b >= cVarArr[i].k && akVarArr[i2].c <= cVarArr[i].l)) {
                int i7;
                View a;
                if (pVar.c() != null) {
                    ViewGroup a2;
                    if (obj6 != null) {
                        a2 = m30209a(viewGroup2, akVarArr[i2], i3);
                    } else {
                        a2 = viewGroup2;
                    }
                    int size = this.f32935f.size();
                    this.f32935f.add(new ArrayList());
                    C6504m c6804b = new C6804b(this, c6506n, size);
                    this.f32933d.add(c6804b);
                    this.f32934e.add(c6804b);
                    ViewGroup viewGroup3 = (LinearLayout) layoutInflater.inflate(C6623g.view_subform, a2, false);
                    if (obj6 != null) {
                        ak akVar = akVarArr[i2];
                        boolean z = akVar.e.length > 0 || C6591c.m29906a(akVar.d, i3);
                        LayoutParams a3 = m30210a(viewGroup3, akVar, i3, z);
                        if (i3 == akVar.c) {
                            i6 = i2 + 1;
                            C6670a.m30213a(a2, akVar, layoutInflater);
                        } else {
                            i6 = i2;
                        }
                        viewGroup3.setLayoutParams(a3);
                        i2 = i6;
                    }
                    ((FormHeaderView) viewGroup3.findViewById(C6622f.subform_header)).m30620a(pVar.c().a, layoutInflater, ap(), c6804b, (List) this.f32935f.get(size));
                    length4 = pVar.c().b.length;
                    for (i7 = 0; i7 < length4; i7++) {
                        m30212a(viewGroup3, pVar.c().b[i7], pVar.c().a.a, size, i7);
                    }
                    if (pVar.c().c != null) {
                        a = ci.m30845a(this.be, resourceId, pVar.c().c, (C6504m) this, ap());
                        a.setId(au().m30742a());
                        viewGroup3.addView(a);
                        this.ar.add(a);
                        ((ArrayList) this.f32935f.get(size)).add((C6504m) a);
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) a.getLayoutParams();
                        r.a(marginLayoutParams, dimensionPixelSize);
                        marginLayoutParams.topMargin = dimensionPixelSize2;
                        marginLayoutParams.bottomMargin = dimensionPixelSize2;
                    }
                    a2.addView(viewGroup3);
                } else if (pVar.d() != null) {
                    ViewGroup a4;
                    if (obj6 != null) {
                        a4 = m30209a(viewGroup2, akVarArr[i2], i3);
                    } else {
                        a4 = viewGroup2;
                    }
                    m30212a(a4, pVar.d(), ((o) this.aD).a.a, -1, i3);
                    if (obj6 != null) {
                        ak akVar2 = akVarArr[i2];
                        a = a4.getChildAt(a4.getChildCount() - 1);
                        View c = cp.m30912c(a);
                        obj = (((c instanceof TextView) || (c instanceof InfoMessageView)) && !pVar.d().m) ? 1 : null;
                        if (obj == null) {
                            throw new IllegalArgumentException("Field cannot be used in a grouping");
                        }
                        boolean z2;
                        View view;
                        if (akVar2.e.length > 0 || C6591c.m29906a(akVar2.d, i3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LayoutParams a5 = m30210a(a, akVar2, i3, z2);
                        if (pVar.d().j() != null) {
                            a5.gravity = 16;
                        }
                        if (i3 == akVar2.c) {
                            i2++;
                            C6670a.m30213a(a4, akVar2, layoutInflater);
                        }
                        a.setLayoutParams(a5);
                        if (a instanceof ce) {
                            view = (ce) a;
                        } else {
                            if (a instanceof ViewGroup) {
                                viewGroup2 = (ViewGroup) a;
                                int childCount = viewGroup2.getChildCount();
                                for (i7 = 0; i7 < childCount; i7++) {
                                    childAt = viewGroup2.getChildAt(i7);
                                    if (childAt instanceof ce) {
                                        ce ceVar = (ce) childAt;
                                        break;
                                    }
                                }
                            }
                            view = null;
                        }
                        if (!(view == null || a == view)) {
                            view.getLayoutParams().width = -2;
                            view.setIconHiddenWhenUnfocused(true);
                        }
                        if (z2) {
                            c.getLayoutParams().width = -2;
                            c.setLayoutParams(c.getLayoutParams());
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Empty or unknown form field in SimpleForm.");
                }
                if (obj2 == null || i3 != cVarArr[i].l) {
                    i6 = i;
                    i3++;
                    i = i6;
                } else {
                    summaryExpanderWrapper = null;
                    summaryExpanderWrapper.m30974i();
                    i6 = i + 1;
                    i3++;
                    i = i6;
                }
            } else {
                throw new IllegalArgumentException("Field groupings cannot partially intersect component groups.");
            }
        }
        if (((o) this.aD).d != null) {
            childAt = ci.m30845a(this.be, resourceId, ((o) this.aD).d, (C6504m) this, ap());
            childAt.setId(au().m30742a());
            this.f32937h.addView(childAt);
            this.ar.add(childAt);
            this.f32933d.add((C6504m) childAt);
            marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            r.a(marginLayoutParams, dimensionPixelSize);
            marginLayoutParams.topMargin = dimensionPixelSize2;
        }
        if (bundle != null) {
            this.av = bundle.getInt("revealBelowTriggeredCount");
        }
        ac();
        return this.f32937h;
    }

    private final LinearLayout.LayoutParams m30210a(View view, ak akVar, int i, boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            layoutParams.width = -2;
        } else {
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
        }
        if (i != akVar.b) {
            r.a(layoutParams, this.bd.getResources().getDimensionPixelSize(C6620d.wallet_uic_horizontal_margin_between_fields_with_padding) + r.a(layoutParams));
        }
        return layoutParams;
    }

    private final ViewGroup m30209a(ViewGroup viewGroup, ak akVar, int i) {
        int i2 = 8388611;
        if (akVar.e.length > 0) {
            if (akVar.e[0] == akVar.b) {
                i2 = 8388613;
            } else if (akVar.e[0] > akVar.c) {
            }
        }
        if (i != akVar.b) {
            return (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        }
        View linearLayout = new LinearLayout(this.bd);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(i2);
        viewGroup.addView(linearLayout);
        return linearLayout;
    }

    private static void m30213a(ViewGroup viewGroup, ak akVar, LayoutInflater layoutInflater) {
        if (akVar.e.length > 0) {
            viewGroup.requestLayout();
            viewGroup.post(new C6806d(viewGroup, akVar, layoutInflater));
        }
    }

    private final void m30212a(ViewGroup viewGroup, m mVar, String str, int i, int i2) {
        int i3;
        int i4;
        long j;
        View view;
        View view2;
        int a = au().m30742a();
        View a2;
        if (mVar.c() != null) {
            long j2;
            co coVar = new co(mVar.c(), this.be, au(), viewGroup);
            coVar.f33651d = h();
            coVar.f33652e = this.B;
            coVar.f33653f = as();
            coVar.f33655h = this;
            coVar.f33657j = this;
            a2 = coVar.m30899a();
            a = this.ag.size();
            long j3 = mVar.c().d;
            cp.m30910b(mVar.c());
            this.ag.add(a2);
            C6516f.m29562a(a2, mVar.c().d, this.aI, this.aJ);
            an g = mVar.c().g();
            if (!(g == null || g.g == 0)) {
                DatePickerView datePickerView = (DatePickerView) this.aw.a(g.f);
                if (datePickerView == null) {
                    this.aw.a(mVar.c().d, (DatePickerView) a2);
                    j2 = j3;
                    i3 = a;
                    i4 = 1;
                    j = j2;
                    view = a2;
                } else {
                    DatePickerView datePickerView2 = (DatePickerView) a2;
                    datePickerView2.setPartnerDatePicker(datePickerView);
                    datePickerView.setPartnerDatePicker(datePickerView2);
                    this.aw.b(g.f);
                }
            }
            j2 = j3;
            i3 = a;
            i4 = 1;
            j = j2;
            view = a2;
        } else if (mVar.d() != null) {
            r7 = new FrameLayout(this.bd);
            r7.setId(a);
            r2 = (C6710t) j().a(a);
            if (r2 == null) {
                r2 = ci.m30847a(mVar.d(), this.bc, as());
                j().a().a(a, r2).c();
            }
            r2.aG = this.aG;
            r2.m29835a(this.aI, this.aJ);
            r3 = this.ah.size();
            j = mVar.d().c;
            this.ah.add(r2);
            m30214a(r2, i);
            view = r7;
            i4 = 4;
            i3 = r3;
            r3 = r2;
        } else if (mVar.g() != null) {
            r7 = new FrameLayout(this.bd);
            r7.setId(a);
            r2 = (C6731a) j().a(a);
            if (r2 == null) {
                i g2 = mVar.g();
                int i5 = this.bc;
                LogContext as = as();
                r2 = new C6731a();
                r2.f(au.m29850a(i5, g2, as));
                j().a().a(a, r2).c();
            }
            r2.aG = this.aG;
            r3 = this.ai.size();
            j = mVar.g().b;
            this.ai.add(r2);
            m30214a(r2, i);
            view = r7;
            i4 = 5;
            i3 = r3;
            r3 = r2;
        } else if (mVar.e() != null) {
            r2 = (InfoMessageView) this.be.inflate(this.f32930a, viewGroup, false);
            r2.setId(a);
            r2.setInfoMessage(mVar.e());
            r2.setUrlClickListener(ap());
            r3 = this.aj.size();
            j = mVar.e().b;
            this.aj.add(r2);
            m30214a(r2, i);
            C6516f.m29562a(r2, j, this.aI, this.aJ);
            i4 = 0;
            Object obj = r2;
            i3 = r3;
            r3 = r2;
        } else if (mVar.f() != null) {
            r7 = new FrameLayout(this.bd);
            r7.setId(a);
            r2 = (br) j().a(a);
            if (r2 == null) {
                r2 = mo5586a(mVar.f());
                j().a().a(a, r2).c();
            }
            r2.m29835a(this.aI, this.aJ);
            r3 = this.ak.size();
            j = mVar.f().a.d;
            this.ak.add(r2);
            m30214a(r2, i);
            view = r7;
            i4 = 2;
            i3 = r3;
            r3 = r2;
        } else if (mVar.i() != null) {
            int[] iArr;
            view2 = (RegionCodeView) this.be.inflate(C6623g.view_region_code, viewGroup, false);
            view2.setId(a);
            view2.setLogContext(as());
            i3 = this.al.size();
            if (this.aq.size() > i3) {
                iArr = (int[]) this.aq.get(i3);
            } else {
                iArr = C6553f.m29739a(C6553f.m29740a(mVar.i().b));
                this.aq.add(iArr);
            }
            view2.setFormHeader(mVar.i().a);
            view2.setRegionCodes(iArr);
            view2.m30671a(C6563p.m29792a(mVar.i().c));
            j = mVar.i().a.b;
            this.al.add(view2);
            C6516f.m29562a(view2, j, this.aI, this.aJ);
            i4 = 3;
            view = view2;
            a2 = view2;
        } else if (mVar.j() != null) {
            C6752d c6752d = (C6752d) this.be.inflate(C6623g.view_button_component, viewGroup, false);
            c6752d.setId(a);
            i3 = this.am.size();
            c6752d.setUiSpecification(mVar.j());
            c6752d.setLogContext(as());
            i4 = 31;
            j = mVar.j().b;
            this.am.add(c6752d);
            a2 = (View) c6752d;
            C6516f.m29562a(a2, j, this.aI, this.aJ);
            view = a2;
            C6752d c6752d2 = c6752d;
        } else if (mVar.k() != null) {
            a2 = LinkView.m30650a(mVar.k(), this.bd, viewGroup, viewGroup, this.be, au(), this);
            if (LinkView.m30652a(mVar.k())) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) a2.getLayoutParams();
                marginLayoutParams.topMargin = this.f32931b;
                marginLayoutParams.bottomMargin = this.f32931b;
                a2.setLayoutParams(marginLayoutParams);
            }
            int size = this.an.size();
            j = mVar.k().f35010a;
            this.an.add(a2);
            i4 = 29;
            view = a2;
            i3 = size;
        } else if (mVar.l() != null) {
            view2 = ImageWithCaptionView.m30634a(mVar.l(), this.bd, viewGroup, a, (int) i().getDimension(C6620d.wallet_uic_spacing_material_top_bottom), as());
            r3 = this.ao.size();
            j = mVar.l().b;
            this.ao.add(view2);
            i4 = 11;
            view = view2;
            i3 = r3;
            a2 = view2;
        } else if (mVar.h() != null) {
            view2 = bt.m30768a(h(), mVar.h(), this.bd, a);
            r3 = this.ap.size();
            j = mVar.h().a.b;
            this.ap.add(view2);
            C6516f.m29562a(view2, j, this.aI, this.aJ);
            i4 = 32;
            view = view2;
            i3 = r3;
            a2 = view2;
        } else {
            throw new IllegalArgumentException("Empty or unknown field in SimpleForm.");
        }
        if (mVar.m) {
            if (((o) this.aD).a.f.length > 0) {
                throw new IllegalArgumentException("Hiding fields below is not supported together with field groups.");
            }
            int size2 = this.at.size();
            this.at.add(Integer.valueOf(this.f32937h.getChildCount()));
            this.au.add(Integer.valueOf(i == -1 ? -1 : viewGroup.getChildCount()));
            if (size2 >= this.av) {
                bo c6805c = new C6805c(this, size2);
                view2 = cp.m30912c(view);
                if (view2 instanceof FormEditText) {
                    ((FormEditText) view2).mo5583a(c6805c);
                } else if (i4 == 2) {
                    ((br) this.ak.get(i3)).mo5583a(c6805c);
                } else {
                    throw new IllegalStateException("Invalid field type for hideFieldsBelow");
                }
            }
        }
        view.setTag(C6622f.field_type, Integer.valueOf(i4));
        viewGroup.addView(view);
        C6749z c6807e = new C6807e(j, r3);
        c6807e.f33746a = i4;
        c6807e.f33747b = i3;
        c6807e.f33748c = str;
        c6807e.f33749f = i2;
        this.f32936g.add(c6807e);
        if (getExpandable() != null) {
            C6811c c6811c = null;
            if (r3 instanceof C6521h) {
                c6811c = ((C6521h) r3).getExpandable();
            }
            if (c6811c == null) {
                c6811c = new C6811c();
                c6811c.m31010a(c6807e);
                c6811c.m31018c();
            }
            getExpandable().m31011a(c6811c);
        }
    }

    public br mo5586a(com.google.a.a.a.a.b.a.a.f.i iVar) {
        return br.m30190b(iVar, this.bc, as());
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putInt("revealBelowTriggeredCount", this.av);
        int size = this.aq.size();
        for (int i = 0; i < size; i++) {
            bundle.putIntArray("regionCodes_" + i, (int[]) this.aq.get(i));
        }
    }

    public final void m30224d() {
        this.f32933d.clear();
        this.f32934e.clear();
        this.f32935f.clear();
        this.f32936g.clear();
        this.ag.clear();
        this.af.clear();
        this.ah.clear();
        this.ai.clear();
        this.aj.clear();
        this.ak.clear();
        this.al.clear();
        this.aq.clear();
        this.ar.clear();
        this.am.clear();
        this.ao.clear();
        this.ap.clear();
        super.d();
    }

    private final void m30214a(C6504m c6504m, int i) {
        if (i < 0) {
            this.f32933d.add(c6504m);
            return;
        }
        c6504m.setParentUiNode((C6504m) this.f32934e.get(i));
        ((ArrayList) this.f32935f.get(i)).add(c6504m);
    }

    protected final void mo5533W() {
        int i = 0;
        if (this.f32936g.size() + this.ar.size() != 0 || this.as != null) {
            int i2;
            boolean z = this.aH;
            if (this.as != null) {
                this.as.setEnabled(z);
            }
            int size = this.f32938i.size();
            for (i2 = 0; i2 < size; i2++) {
                ((SummaryExpanderWrapper) this.f32938i.get(i2)).setEnabled(z);
            }
            size = this.ag.size();
            for (i2 = 0; i2 < size; i2++) {
                ((View) this.ag.get(i2)).setEnabled(z);
            }
            size = this.af.size();
            for (i2 = 0; i2 < size; i2++) {
                ((au) this.af.get(i2)).mo5519b(z);
            }
            size = this.ah.size();
            for (i2 = 0; i2 < size; i2++) {
                ((C6710t) this.ah.get(i2)).mo5519b(z);
            }
            size = this.ai.size();
            for (i2 = 0; i2 < size; i2++) {
                ((C6731a) this.ai.get(i2)).mo5519b(z);
            }
            size = this.aj.size();
            for (i2 = 0; i2 < size; i2++) {
                ((InfoMessageView) this.aj.get(i2)).setEnabled(z);
            }
            size = this.ak.size();
            for (i2 = 0; i2 < size; i2++) {
                ((br) this.ak.get(i2)).mo5519b(z);
            }
            size = this.al.size();
            for (i2 = 0; i2 < size; i2++) {
                ((RegionCodeView) this.al.get(i2)).setEnabled(z);
            }
            size = this.ar.size();
            for (i2 = 0; i2 < size; i2++) {
                ((View) this.ar.get(i2)).setEnabled(z);
            }
            size = this.am.size();
            for (i2 = 0; i2 < size; i2++) {
                ((C6752d) this.am.get(i2)).setEnabled(z);
            }
            size = this.ao.size();
            for (i2 = 0; i2 < size; i2++) {
                ((ImageWithCaptionView) this.ao.get(i2)).setEnabled(z);
            }
            size = this.an.size();
            for (i2 = 0; i2 < size; i2++) {
                ((LinkView) this.an.get(i2)).setEnabled(z);
            }
            i2 = this.ap.size();
            while (i < i2) {
                ((View) this.ap.get(i)).setEnabled(z);
                i++;
            }
        }
    }

    public final boolean mo5534X() {
        int i;
        int size = this.ah.size();
        for (i = 0; i < size; i++) {
            if (!((C6710t) this.ah.get(i)).mo5534X()) {
                return false;
            }
        }
        size = this.ai.size();
        for (i = 0; i < size; i++) {
            if (!((C6731a) this.ai.get(i)).mo5534X()) {
                return false;
            }
        }
        return this.av >= this.at.size();
    }

    public C6506n getUiElement() {
        return this.f32932c;
    }

    public List getChildren() {
        return this.f32933d;
    }

    public final ArrayList aa() {
        return this.f32936g;
    }

    protected final com.google.a.a.a.a.b.a.a.f.h mo5521Z() {
        ao();
        return ((o) this.aD).a;
    }

    public final boolean mo5535a(g gVar) {
        int i;
        int size = this.f32936g.size();
        for (i = 0; i < size; i++) {
            C6807e c6807e = (C6807e) this.f32936g.get(i);
            if (gVar.b.b.equals(c6807e.f33748c) && gVar.b.d == c6807e.f33749f) {
                if (c6807e.f33746a == 1) {
                    cp.m30903a((View) this.ag.get(c6807e.f33747b), gVar.c);
                } else if (c6807e.f33746a == 2) {
                    ((br) this.ak.get(c6807e.f33747b)).mo5578a(gVar.c, true);
                } else if (c6807e.f33746a == 32) {
                    ((bt) cp.m30912c((View) this.ap.get(c6807e.f33747b))).mo5578a(gVar.c, true);
                } else {
                    throw new IllegalArgumentException("Could not apply FormFieldMessage to fieldId: " + gVar.b.c);
                }
                return true;
            }
        }
        size = this.ah.size();
        for (i = 0; i < size; i++) {
            if (((C6710t) this.ah.get(i)).mo5535a(gVar)) {
                return true;
            }
        }
        size = this.ai.size();
        for (i = 0; i < size; i++) {
            if (((C6731a) this.ai.get(i)).mo5535a(gVar)) {
                return true;
            }
        }
        return false;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                this.f32937h.setVisibility(0);
                return;
            case 11:
                this.f32937h.setVisibility(8);
                return;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown ResultingActionReference action type: %d", new Object[]{Integer.valueOf(lVar.c)}));
        }
    }

    public final q m30218a(Bundle bundle) {
        q qVar = new q();
        qVar.a = ((o) this.aD).a.a;
        qVar.b = ((o) this.aD).a.c;
        qVar.c = new com.google.a.a.a.a.b.a.a.f.r[((o) this.aD).b.length];
        int length = ((o) this.aD).b.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            p pVar = ((o) this.aD).b[i];
            qVar.c[i] = new com.google.a.a.a.a.b.a.a.f.r();
            if (pVar.c() != null) {
                com.google.a.a.a.a.b.a.a.f.t tVar = new com.google.a.a.a.a.b.a.a.f.t();
                tVar.a = pVar.c().a.a;
                tVar.b = pVar.c().a.c;
                tVar.c = new n[pVar.c().b.length];
                int length2 = pVar.c().b.length;
                i3 = i2;
                i2 = 0;
                while (i2 < length2) {
                    int i4 = i3 + 1;
                    tVar.c[i2] = m30211a(pVar.c().b[i2], i3, bundle);
                    i2++;
                    i3 = i4;
                }
                if (pVar.c().c != null) {
                    tVar.d = pVar.c().c.g;
                }
                com.google.a.a.a.a.b.a.a.f.r rVar = qVar.c[i];
                rVar.a = -1;
                rVar.a = 0;
                rVar.c = tVar;
            } else if (pVar.d() != null) {
                com.google.a.a.a.a.b.a.a.f.r rVar2 = qVar.c[i];
                i3 = i2 + 1;
                n a = m30211a(pVar.d(), i2, bundle);
                if (a == null) {
                    if (rVar2.a == 1) {
                        rVar2.a = -1;
                    }
                    rVar2.d = null;
                } else {
                    rVar2.a = -1;
                    rVar2.a = 1;
                    rVar2.d = a;
                }
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        if (((o) this.aD).d != null) {
            qVar.d = ((o) this.aD).d.g;
        }
        return qVar;
    }

    private final n m30211a(m mVar, int i, Bundle bundle) {
        n nVar = new n();
        C6807e c6807e = (C6807e) this.f32936g.get(i);
        switch (c6807e.f33746a) {
            case 0:
            case 11:
            case 29:
            case 31:
                break;
            case 1:
                nVar.a(cp.m30901a((View) this.ag.get(c6807e.f33747b), mVar.c()));
                break;
            case 2:
                j a = ((br) this.ak.get(c6807e.f33747b)).m30194a(bundle);
                if (a != null) {
                    nVar.a = -1;
                    nVar.a = 2;
                    nVar.e = a;
                    break;
                }
                if (nVar.a == 2) {
                    nVar.a = -1;
                }
                nVar.e = null;
                break;
            case 3:
                e fieldValue = ((RegionCodeView) this.al.get(c6807e.f33747b)).getFieldValue();
                if (fieldValue != null) {
                    nVar.a = -1;
                    nVar.a = 5;
                    nVar.h = fieldValue;
                    break;
                }
                if (nVar.a == 5) {
                    nVar.a = -1;
                }
                nVar.h = null;
                break;
            case 4:
                com.google.a.a.a.a.b.a.a.f.c al = ((C6710t) this.ah.get(c6807e.f33747b)).al();
                if (al != null) {
                    nVar.a = -1;
                    nVar.a = 1;
                    nVar.d = al;
                    break;
                }
                if (nVar.a == 1) {
                    nVar.a = -1;
                }
                nVar.d = null;
                break;
            case 5:
                C6731a c6731a = (C6731a) this.ai.get(c6807e.f33747b);
                b bVar = new b();
                bVar.a = ((a) c6731a.aD).a;
                bVar.b = ((a) c6731a.aD).b;
                bVar.c = ((a) c6731a.aD).c;
                int length = c6731a.f33197a.length;
                bVar.d = new at[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bVar.d[i2] = cp.m30901a(c6731a.f33197a[i2], ((a) c6731a.aD).d[i2]);
                }
                nVar.a = -1;
                nVar.a = 3;
                nVar.f = bVar;
                break;
            case 12:
                nVar.a((at) ((az) this.af.get(c6807e.f33747b)).m30734a());
                break;
            case 32:
                com.google.a.a.a.a.b.a.a.f.l phoneFormValue = ((bt) cp.m30912c((View) this.ap.get(c6807e.f33747b))).getPhoneFormValue();
                if (phoneFormValue != null) {
                    nVar.a = -1;
                    nVar.a = 4;
                    nVar.g = phoneFormValue;
                    break;
                }
                if (nVar.a == 4) {
                    nVar.a = -1;
                }
                nVar.g = null;
                break;
            default:
                throw new IllegalStateException("Unknown field type " + c6807e.f33746a + " in SimpleForm.");
        }
        return nVar;
    }

    private final void ac() {
        if (this.av != this.at.size()) {
            int intValue = ((Integer) this.at.get(this.av)).intValue();
            int intValue2 = ((Integer) this.au.get(this.av)).intValue();
            int childCount = this.f32937h.getChildCount();
            for (int i = intValue + 1; i < childCount; i++) {
                this.f32937h.getChildAt(i).setVisibility(8);
            }
            if (intValue2 >= 0) {
                ViewGroup viewGroup = (ViewGroup) this.f32937h.getChildAt(intValue);
                childCount = viewGroup.getChildCount();
                for (intValue = intValue2 + 1; intValue < childCount; intValue++) {
                    viewGroup.getChildAt(intValue).setVisibility(8);
                }
            }
        }
    }
}
