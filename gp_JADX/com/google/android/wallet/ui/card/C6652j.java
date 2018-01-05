package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.c.b.a.n;
import com.google.a.a.a.a.b.a.a.c.b.a.p;
import com.google.a.a.a.a.b.a.a.c.b.a.r;
import com.google.a.a.a.a.b.a.a.c.b.a.u;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.a.f.i;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6499g;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.address.C6651s;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.address.C6713c;
import com.google.android.wallet.ui.common.C6668c;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.C6756y;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.bb;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.br;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.co;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class C6652j extends au implements C6651s, bo {
    public RelativeLayout f32845a;
    public final ArrayList af = new ArrayList();
    public bb ag;
    public boolean ah;
    public final ArrayList ai = new ArrayList();
    public int[] aj;
    public C6668c ak;
    public final ArrayList al = new ArrayList();
    public boolean am;
    public final ArrayList an = new ArrayList();
    public u ao;
    public C6648q ap;
    public C6499g aq;
    public TextWatcher ar;
    public TextWatcher as;
    public final ArrayList f32846b = new ArrayList();
    public final ArrayList f32847c = new ArrayList();
    public final ArrayList f32848d = new ArrayList();
    public final ArrayList f32849e = new ArrayList();
    public final ArrayList f32850f = new ArrayList();
    public final ArrayList f32851g = new ArrayList();
    public final ArrayList f32852h = new ArrayList();
    public int[] f32853i;

    @TargetApi(11)
    public final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int dimensionPixelSize;
        int i3;
        int length = ((p) this.aD).c.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        boolean[] zArr3 = new boolean[length];
        for (i = 0; i < length; i++) {
            r rVar = ((p) this.aD).c[i];
            zArr[i] = rVar.d.length > 1;
            for (n nVar : rVar.d) {
                if (nVar.d() != null) {
                    zArr2[i] = true;
                } else if (nVar.e() != null) {
                    zArr3[i] = true;
                }
            }
        }
        Object obj = ((p) this.aD).a.f.length == 1 ? 1 : null;
        Object obj2 = obj;
        for (u uVar : ((p) this.aD).j) {
            i2 = 0;
            while (i2 < uVar.k.length) {
                obj2 = 1;
                c cVar = uVar.k[i2];
                if (cVar.c != 3) {
                    throw new IllegalArgumentException("Component group types other than field groups are not supported.");
                }
                int i4;
                if (obj == null || i2 != 0) {
                    if (cVar.k == 0) {
                        throw new IllegalArgumentException("This field group may not contain the card number field.");
                    }
                    i4 = cVar.k;
                    while (i4 <= cVar.l) {
                        i3 = uVar.j[i4 - 1];
                        if (zArr3[i3]) {
                            throw new IllegalArgumentException("OTP fields are not supported in field groups.");
                        } else if (!zArr2[i3] || (!zArr[i3] && cVar.k >= cVar.l)) {
                            i4++;
                        } else {
                            throw new IllegalArgumentException("Field groups containing address forms may not contain multiple fields.");
                        }
                    }
                    continue;
                } else if (cVar.k != 0) {
                    throw new IllegalArgumentException("The first field group must contain the card number field.");
                } else {
                    i4 = 1;
                    while (i4 <= cVar.l) {
                        i3 = uVar.j[i4 - 1];
                        if (zArr3[i3]) {
                            throw new IllegalArgumentException("OTP fields are not supported in field groups.");
                        } else if (zArr2[i3]) {
                            throw new IllegalArgumentException("Field groups containing address forms may not contain multiple fields.");
                        } else {
                            i4++;
                        }
                    }
                    continue;
                }
                i2++;
            }
        }
        if (obj2 != null) {
            throw new IllegalArgumentException("Component groups are not supported.");
        }
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicLegalMessageLayout, C6617a.internalUicFormNonEditableTextStartMargin, C6617a.internalUicCardFragmentCollapsibleStateEnabled, C6617a.internalUicCardFragmentMaterialFieldLayoutEnabled});
        int resourceId = obtainStyledAttributes.getResourceId(0, C6623g.view_legal_message_text);
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.ah = obtainStyledAttributes.getBoolean(2, false);
        this.am = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        int dimension = (int) this.bd.getResources().getDimension(C6620d.wallet_uic_legal_message_top_margin);
        this.f32845a = (RelativeLayout) layoutInflater.inflate(C6623g.fragment_card_sub_form, viewGroup, false);
        C6506n c6506n = new C6506n(1716);
        i3 = ((p) this.aD).c.length;
        if (bundle != null) {
            this.f32853i = bundle.getIntArray("revealBelowTriggeredCount");
            this.ag = bb.m30738b(bundle.getBundle("resettableIdGeneratorState"));
        } else {
            this.f32853i = new int[i3];
            this.ag = new bb(new ArrayList(2), true);
        }
        if (this.ah) {
            this.aj = new int[i3];
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6;
            r rVar2 = ((p) this.aD).c[i5];
            ViewGroup viewGroup2 = (LinearLayout) layoutInflater.inflate(C6623g.view_subform, this.f32845a, false);
            viewGroup2.setId(au().m30742a());
            C6504m c6744k = new C6744k(this, c6506n);
            this.f32847c.add(viewGroup2);
            this.af.add(c6744k);
            this.an.add(new ArrayList());
            ((FormHeaderView) viewGroup2.findViewById(C6622f.subform_header)).m30620a(rVar2.b, layoutInflater, ap(), c6744k, c6744k.getChildren());
            int length2 = rVar2.d.length;
            ArrayList arrayList = new ArrayList(rVar2.d.length);
            for (i6 = 0; i6 < length2; i6++) {
                View a;
                View view;
                C6750p c6750p;
                n nVar2 = ((p) this.aD).c[i5].d[i6];
                i = au().m30742a();
                if (nVar2.c() != null) {
                    co coVar = new co(nVar2.c(), this.be, au(), viewGroup2);
                    coVar.f33651d = h();
                    coVar.f33653f = as();
                    coVar.f33655h = this;
                    coVar.f33657j = this;
                    a = coVar.m30899a();
                    if (this.am) {
                        View view2;
                        Context context = this.bd;
                        i4 = au().m30742a();
                        if (MaterialFieldLayout.m30657a(a)) {
                            view2 = (MaterialFieldLayout) LayoutInflater.from(context).inflate(C6623g.view_material_field_layout, viewGroup2, false);
                            if (a.getLayoutParams() != null) {
                                LayoutParams layoutParams = view2.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new LayoutParams(a.getLayoutParams().width, -2);
                                } else {
                                    layoutParams.width = a.getLayoutParams().width;
                                }
                                view2.setLayoutParams(layoutParams);
                            }
                            view2.setId(i4);
                            view2.addView(a);
                        } else {
                            view2 = a;
                        }
                        view = view2;
                    } else {
                        view = a;
                    }
                    long j = nVar2.c().d;
                    cp.m30910b(nVar2.c());
                    C6750p c6750p2 = new C6750p(j, view);
                    c6750p2.f33286a = 1;
                    c6750p2.f33287b = this.f32848d.size();
                    c6750p2.f33288c = nVar2.c().p;
                    this.f32848d.add(view);
                    C6516f.m29562a(view, nVar2.c().d, this.aI, this.aJ);
                    a = view;
                    c6750p = c6750p2;
                } else if (nVar2.d() != null) {
                    a = new FrameLayout(this.bd);
                    a.setId(i);
                    r2 = (C6711b) j().a(i);
                    if (r2 == null) {
                        r2 = ci.m30847a(nVar2.d(), this.bc, as());
                        j().a().a(i, r2).c();
                    }
                    r5 = r2;
                    r5.m30382a((C6651s) this);
                    c6750p = new C6750p(nVar2.d().c, r5);
                    c6750p.f33286a = 4;
                    c6750p.f33287b = this.f32849e.size();
                    this.f32849e.add(r5);
                    r5.setParentUiNode((C6504m) this.af.get(i5));
                    ((C6504m) this.af.get(i5)).getChildren().add(r5);
                } else if (nVar2.e() != null) {
                    a = new FrameLayout(this.bd);
                    a.setId(i);
                    r2 = (br) j().a(i);
                    if (r2 == null) {
                        r2 = mo5566a(nVar2.e());
                        j().a().a(i, r2).c();
                    }
                    r5 = r2;
                    r5.m29835a(this.aI, this.aJ);
                    c6750p = new C6750p(nVar2.e().a.d, r5);
                    c6750p.f33286a = 2;
                    c6750p.f33287b = this.f32850f.size();
                    this.f32850f.add(r5);
                    r5.setParentUiNode((C6504m) this.af.get(i5));
                    ((C6504m) this.af.get(i5)).getChildren().add(r5);
                } else {
                    throw new IllegalArgumentException("Empty or unknown field in CardSubform.");
                }
                ((ArrayList) this.an.get(i5)).add(c6750p);
                a.setTag(C6622f.field_type, Integer.valueOf(c6750p.f33286a));
                arrayList.add(a);
            }
            int[] a2 = ci.m30873a(this.bd, (List) arrayList, rVar2.e, viewGroup2);
            if (rVar2.g != null) {
                view = ci.m30845a(this.be, resourceId, rVar2.g, c6744k, ap());
                view.setId(au().m30742a());
                viewGroup2.addView(view);
                this.f32851g.add(view);
                c6744k.getChildren().add((C6504m) view);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                android.support.v4.view.r.a(marginLayoutParams, dimensionPixelSize);
                marginLayoutParams.topMargin = dimension;
                marginLayoutParams.bottomMargin = dimension;
            }
            if (this.ah) {
                if (rVar2.f >= 0) {
                    this.aj[i5] = a2[rVar2.f];
                    if (this.aj[i5] == -1) {
                        throw new IllegalStateException("Invalid collapsibleFieldsEndIndex");
                    }
                    this.ai.add(m30080b(i5, rVar2.f));
                } else {
                    this.aj[i5] = -1;
                    this.ai.add(null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            i2 = this.f32853i[i5];
            for (length = 0; length < length2; length++) {
                if (rVar2.d[length].f) {
                    if (i2 > 0) {
                        i2--;
                    } else {
                        i6 = a2[length];
                        if (i6 == -1) {
                            throw new IllegalStateException("Invalid hideFieldsBelow field");
                        }
                        m30080b(i5, length).mo5583a(new C6745l(this, i5, i6));
                        if (arrayList2.isEmpty()) {
                            int childCount = viewGroup2.getChildCount();
                            for (i = i6 + 1; i < childCount; i++) {
                                viewGroup2.getChildAt(i).setVisibility(8);
                            }
                        }
                        arrayList2.add(Integer.valueOf(i6));
                    }
                }
            }
            this.f32852h.add(arrayList2);
            viewGroup2.setVisibility(8);
            this.f32845a.addView(viewGroup2);
        }
        this.ar = new C6746m(this);
        this.as = new C6747n(this);
        return this.f32845a;
    }

    private final C6668c m30080b(int i, int i2) {
        C6750p c6750p = (C6750p) ((ArrayList) this.an.get(i)).get(i2);
        if (c6750p.f33286a == 1) {
            View c = cp.m30912c((View) this.f32848d.get(c6750p.f33287b));
            if (c instanceof C6668c) {
                return (C6668c) c;
            }
        } else if (c6750p.f33286a == 2) {
            return (C6668c) this.f32850f.get(c6750p.f33287b);
        }
        throw new IllegalStateException(String.format(Locale.US, "Field (subform %s, field %s, type %s) is not an AutoAdvancer", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(c6750p.f33286a)}));
    }

    public br mo5566a(i iVar) {
        return br.m30190b(iVar, this.bc, as());
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putIntArray("revealBelowTriggeredCount", this.f32853i);
        Bundle bundle2 = new Bundle();
        this.ag.m30743a(bundle2);
        bundle.putBundle("resettableIdGeneratorState", bundle2);
    }

    public final void m30096i(Bundle bundle) {
        int i = 0;
        super.i(bundle);
        ArrayList f = m30081f(3);
        int size = f.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) f.get(i2);
            if (view instanceof TextView) {
                ((TextView) view).addTextChangedListener(this.ar);
            }
        }
        ArrayList f2 = m30081f(1);
        int size2 = f2.size();
        while (i < size2) {
            view = (View) f2.get(i);
            if (view instanceof TextView) {
                ((TextView) view).addTextChangedListener(this.as);
            }
            i++;
        }
    }

    public final ArrayList aa() {
        ArrayList arrayList = new ArrayList();
        if (this.ao == null) {
            return arrayList;
        }
        for (int i : this.ao.j) {
            arrayList.addAll((Collection) this.an.get(i));
        }
        return arrayList;
    }

    public final boolean mo5535a(g gVar) {
        if (this.ao == null) {
            return false;
        }
        for (int i : this.ao.j) {
            int i2;
            ArrayList arrayList = (ArrayList) this.an.get(i2);
            if (gVar.b.b.equals(((p) this.aD).c[i2].b.a)) {
                C6750p c6750p = (C6750p) arrayList.get(gVar.b.d);
                if (c6750p.f33286a == 1) {
                    cp.m30903a((View) this.f32848d.get(c6750p.f33287b), gVar.c);
                    if (this.aq != null) {
                        if (c6750p.f33288c == 3) {
                            this.aq.mo5554b();
                        }
                        if (c6750p.f33288c == 1) {
                            this.aq.cO_();
                        }
                    }
                } else if (c6750p.f33286a == 2) {
                    ((br) this.f32850f.get(c6750p.f33287b)).mo5578a(gVar.c, true);
                } else {
                    throw new IllegalArgumentException("Could not apply FormFieldMessage to fieldId: " + gVar.b.c);
                }
                return true;
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                C6750p c6750p2 = (C6750p) arrayList.get(i2);
                if (c6750p2.f33286a == 4 && ((C6711b) this.f32849e.get(c6750p2.f33287b)).mo5535a(gVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final void mo5533W() {
        int i;
        int i2 = 0;
        boolean z = this.aH;
        int size = this.f32848d.size();
        for (i = 0; i < size; i++) {
            ((View) this.f32848d.get(i)).setEnabled(z);
        }
        size = this.f32849e.size();
        for (i = 0; i < size; i++) {
            ((C6711b) this.f32849e.get(i)).mo5519b(z);
        }
        size = this.f32850f.size();
        for (i = 0; i < size; i++) {
            ((br) this.f32850f.get(i)).mo5519b(z);
        }
        size = this.f32851g.size();
        for (i = 0; i < size; i++) {
            ((View) this.f32851g.get(i)).setEnabled(z);
        }
        i = this.f32846b.size();
        while (i2 < i) {
            ((SummaryExpanderWrapper) this.f32846b.get(i2)).setEnabled(z);
            i2++;
        }
    }

    public final boolean mo5534X() {
        if (this.ao == null) {
            return false;
        }
        for (int i : this.ao.j) {
            ArrayList arrayList = (ArrayList) this.an.get(i);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6750p c6750p = (C6750p) arrayList.get(i2);
                if (c6750p.f33286a == 4) {
                    this.f32849e.get(c6750p.f33287b);
                    C6713c.m30415o();
                }
            }
            if (!((ArrayList) this.f32852h.get(i)).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public C6506n getUiElement() {
        return null;
    }

    public List getChildren() {
        List arrayList = new ArrayList();
        if (this.ao == null) {
            return arrayList;
        }
        for (int i : this.ao.j) {
            arrayList.add((C6504m) this.af.get(i));
        }
        return arrayList;
    }

    public final long mo5520Y() {
        return 0;
    }

    public final void m30094d() {
        this.af.clear();
        this.an.clear();
        this.f32847c.clear();
        this.f32848d.clear();
        this.f32849e.clear();
        this.f32850f.clear();
        this.f32851g.clear();
        super.d();
    }

    final void m30088a(SummaryExpanderWrapper summaryExpanderWrapper, int i) {
        r rVar = ((p) this.aD).c[i];
        ViewGroup viewGroup = (ViewGroup) this.f32847c.get(i);
        this.f32845a.removeView(viewGroup);
        summaryExpanderWrapper.getContainerView().addView(viewGroup);
        viewGroup.setVisibility(0);
        summaryExpanderWrapper.m30966a(new C6749z(0, viewGroup.getChildAt(0)));
        ArrayList arrayList = (ArrayList) this.an.get(i);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            summaryExpanderWrapper.m30966a((C6749z) arrayList.get(i2));
        }
        if (rVar.g != null) {
            summaryExpanderWrapper.m30966a(new C6749z(rVar.g.b, viewGroup.getChildAt(viewGroup.getChildCount() - 1)));
        }
    }

    @TargetApi(14)
    public final void m30090a(boolean z, int i, int i2, int i3) {
        int i4 = 0;
        int[] iArr = this.ao.j;
        int length = iArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6;
            int i7 = iArr[i5];
            ViewGroup viewGroup = (ViewGroup) this.f32847c.get(i7);
            if (i7 == this.ao.j[0]) {
                i6 = i4;
                for (i4 = 0; i4 <= this.aj[i7]; i4++) {
                    View childAt = viewGroup.getChildAt(0);
                    LayoutParams layoutParams = new RelativeLayout.LayoutParams((MarginLayoutParams) childAt.getLayoutParams());
                    layoutParams.addRule(10);
                    boolean hasFocus = childAt.hasFocus();
                    if (hasFocus) {
                        ci.m30854a((Fragment) this);
                    }
                    viewGroup.removeView(childAt);
                    this.f32845a.addView(childAt, layoutParams);
                    if (hasFocus) {
                        childAt.requestFocus();
                    }
                    if (childAt.getVisibility() == 0) {
                        if (z) {
                            ci.m30876b(childAt, i + i6, -(i2 + i3));
                        } else {
                            childAt.setVisibility(4);
                        }
                        i6 += ci.m30840a(childAt);
                    }
                    this.al.add(childAt);
                }
            } else {
                i6 = i4;
            }
            if (z) {
                viewGroup.setTranslationY((float) (i + i6));
                viewGroup.animate().translationY((float) (-i3)).setListener(new C6748o(viewGroup)).start();
            }
            i5++;
            i4 = i6;
        }
    }

    @TargetApi(14)
    public final void m30089a(boolean z, int i, int i2) {
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.f32847c.get(this.ao.j[0]);
        int size = this.al.size() - 1;
        int i4 = 0;
        while (size >= 0) {
            View view = (View) this.al.get(size);
            LayoutParams layoutParams = new LinearLayout.LayoutParams((MarginLayoutParams) view.getLayoutParams());
            this.f32845a.removeView(view);
            viewGroup.addView(view, 0, layoutParams);
            if (view.getVisibility() != 8) {
                if (z) {
                    int a = ci.m30840a(view) + i4;
                    ci.m30855a(view, -(i - a));
                    i3 = a;
                    size--;
                    i4 = i3;
                } else {
                    view.setVisibility(0);
                }
            }
            i3 = i4;
            size--;
            i4 = i3;
        }
        if (z) {
            for (int i5 : this.ao.j) {
                viewGroup = (ViewGroup) this.f32847c.get(i5);
                viewGroup.setTranslationY((float) (-(i2 + i4)));
                viewGroup.animate().translationY(0.0f).start();
            }
        }
        this.al.clear();
    }

    public final View m30092b(int i) {
        if (this.ao == null) {
            return null;
        }
        View view = null;
        for (int i2 : this.ao.j) {
            ArrayList arrayList = (ArrayList) this.an.get(i2);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2;
                C6750p c6750p = (C6750p) arrayList.get(i3);
                if (c6750p.f33286a == 1 && c6750p.f33288c == i) {
                    view2 = (View) this.f32848d.get(c6750p.f33287b);
                } else {
                    view2 = view;
                }
                i3++;
                view = view2;
            }
        }
        return view instanceof C6756y ? cp.m30912c(view) : view;
    }

    private final ArrayList m30081f(int i) {
        ArrayList arrayList = new ArrayList();
        int size = this.an.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) this.an.get(i2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C6750p c6750p = (C6750p) arrayList2.get(i3);
                if (c6750p.f33286a == 1 && c6750p.f33288c == i) {
                    arrayList.add((View) this.f32848d.get(c6750p.f33287b));
                }
            }
        }
        return arrayList;
    }

    public final void mo5563a(View view) {
        if (this.ap != null) {
            this.ap.ac();
        }
    }

    public final void ab() {
        if (this.aq != null) {
            this.aq.mo5556c();
        }
    }

    public final void ac() {
        if (this.aq != null) {
            this.aq.cO_();
        }
    }

    protected final h mo5521Z() {
        ao();
        return ((p) this.aD).a;
    }
}
