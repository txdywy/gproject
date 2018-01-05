package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p040a.C0400g;
import android.support.v7.view.C0453a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0474d;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ad;
import android.support.v7.view.menu.ah;
import android.support.v7.view.menu.ai;
import android.support.v7.view.menu.ap;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

final class C0502k extends C0474d {
    public C0504m f3624A;
    public final C0509r f3625B = new C0509r(this);
    public C0506o f3626i;
    public Drawable f3627j;
    public boolean f3628k;
    public boolean f3629l;
    public boolean f3630m;
    public int f3631n;
    public int f3632o;
    public int f3633p;
    public boolean f3634q;
    public boolean f3635r;
    public boolean f3636s;
    public boolean f3637t;
    public int f3638u;
    public final SparseBooleanArray f3639v = new SparseBooleanArray();
    public View f3640w;
    public C0508q f3641x;
    public C0503l f3642y;
    public C0505n f3643z;

    public C0502k(Context context) {
        super(context, C0400g.abc_action_menu_layout, C0400g.abc_action_menu_item_layout);
    }

    public final void mo659a(Context context, C0471p c0471p) {
        boolean z = true;
        super.mo659a(context, c0471p);
        Resources resources = context.getResources();
        C0453a a = C0453a.m2684a(context);
        if (!this.f3630m) {
            if (VERSION.SDK_INT < 19 && ViewConfiguration.get(a.f2554a).hasPermanentMenuKey()) {
                z = false;
            }
            this.f3629l = z;
        }
        if (!this.f3636s) {
            this.f3631n = a.f2554a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.f3634q) {
            this.f3633p = a.m2685a();
        }
        int i = this.f3631n;
        if (this.f3629l) {
            if (this.f3626i == null) {
                this.f3626i = new C0506o(this, this.a);
                if (this.f3628k) {
                    this.f3626i.setImageDrawable(this.f3627j);
                    this.f3627j = null;
                    this.f3628k = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f3626i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f3626i.getMeasuredWidth();
        } else {
            this.f3626i = null;
        }
        this.f3632o = i;
        this.f3638u = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f3640w = null;
    }

    public final void m3883b() {
        this.f3629l = true;
        this.f3630m = true;
    }

    public final ah mo922a(ViewGroup viewGroup) {
        ah ahVar = this.h;
        ah a = super.mo922a(viewGroup);
        if (ahVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public final View mo923a(C0485t c0485t, View view, ViewGroup viewGroup) {
        View actionView = c0485t.getActionView();
        if (actionView == null || c0485t.m2926i()) {
            actionView = super.mo923a(c0485t, view, viewGroup);
        }
        actionView.setVisibility(c0485t.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m2966a(layoutParams));
        }
        return actionView;
    }

    public final void mo924a(C0485t c0485t, ai aiVar) {
        aiVar.mo58a(c0485t);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aiVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
        if (this.f3624A == null) {
            this.f3624A = new C0504m(this);
        }
        actionMenuItemView.setPopupCallback(this.f3624A);
    }

    public final boolean mo925a(C0485t c0485t) {
        return c0485t.m2923f();
    }

    public final void mo668a(boolean z) {
        int i = 0;
        super.mo668a(z);
        ((View) this.h).requestLayout();
        if (this.c != null) {
            C0471p c0471p = this.c;
            c0471p.m2839i();
            ArrayList arrayList = c0471p.f2723j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2);
            }
        }
        ArrayList j = this.c != null ? this.c.m2840j() : null;
        if (this.f3629l && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                boolean z2;
                if (((C0485t) j.get(0)).isActionViewExpanded()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i = z2;
            } else if (size2 > 0) {
                i = 1;
            }
        }
        if (i != 0) {
            if (this.f3626i == null) {
                this.f3626i = new C0506o(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3626i.getParent();
            if (viewGroup != this.h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3626i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                View view = this.f3626i;
                LayoutParams a = ActionMenuView.m2965a();
                a.f3652a = true;
                actionMenuView.addView(view, a);
            }
        } else if (this.f3626i != null && this.f3626i.getParent() == this.h) {
            ((ViewGroup) this.h).removeView(this.f3626i);
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3629l);
    }

    public final boolean mo926a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f3626i) {
            return false;
        }
        return super.mo926a(viewGroup, i);
    }

    public final boolean mo670a(ap apVar) {
        if (!apVar.hasVisibleItems()) {
            return false;
        }
        View childAt;
        ap apVar2 = apVar;
        while (apVar2.f2740A != this.c) {
            apVar2 = (ap) apVar2.f2740A;
        }
        C0485t item = apVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ai) && ((ai) childAt).getItemData() == item) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt == null) {
            return false;
        }
        boolean z;
        apVar.getItem().getItemId();
        int size = apVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item2 = apVar.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.f3642y = new C0503l(this, this.b, apVar, childAt);
        this.f3642y.m2789a(z);
        if (this.f3642y.m2790b()) {
            super.mo670a(apVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final boolean m3884c() {
        if (!this.f3629l || m3888g() || this.c == null || this.h == null || this.f3643z != null || this.c.m2840j().isEmpty()) {
            return false;
        }
        this.f3643z = new C0505n(this, new C0508q(this, this.b, this.c, this.f3626i));
        ((View) this.h).post(this.f3643z);
        super.mo670a(null);
        return true;
    }

    public final boolean m3885d() {
        if (this.f3643z == null || this.h == null) {
            ad adVar = this.f3641x;
            if (adVar == null) {
                return false;
            }
            adVar.m2791c();
            return true;
        }
        ((View) this.h).removeCallbacks(this.f3643z);
        this.f3643z = null;
        return true;
    }

    public final boolean m3886e() {
        return m3885d() | m3887f();
    }

    public final boolean m3887f() {
        if (this.f3642y == null) {
            return false;
        }
        this.f3642y.m2791c();
        return true;
    }

    public final boolean m3888g() {
        return this.f3641x != null && this.f3641x.m2793e();
    }

    public final boolean mo669a() {
        int size;
        ArrayList arrayList;
        int i;
        if (this.c != null) {
            ArrayList h = this.c.m2838h();
            size = h.size();
            arrayList = h;
        } else {
            size = 0;
            arrayList = null;
        }
        int i2 = this.f3633p;
        int i3 = this.f3632o;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < size) {
            C0485t c0485t = (C0485t) arrayList.get(i6);
            if (c0485t.m2925h()) {
                i4++;
            } else if (c0485t.m2924g()) {
                i5++;
            } else {
                obj = 1;
            }
            if (this.f3637t && c0485t.isActionViewExpanded()) {
                i = 0;
            } else {
                i = i2;
            }
            i6++;
            i2 = i;
        }
        if (this.f3629l && (r4 != null || i4 + i5 > i2)) {
            i2--;
        }
        i6 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = this.f3639v;
        sparseBooleanArray.clear();
        i = 0;
        if (this.f3635r) {
            i = i3 / this.f3638u;
            i5 = ((i3 % this.f3638u) / i) + this.f3638u;
        } else {
            i5 = 0;
        }
        int i7 = 0;
        i2 = 0;
        int i8 = i;
        while (i7 < size) {
            c0485t = (C0485t) arrayList.get(i7);
            int i9;
            if (c0485t.m2925h()) {
                View a = mo923a(c0485t, this.f3640w, viewGroup);
                if (this.f3640w == null) {
                    this.f3640w = a;
                }
                if (this.f3635r) {
                    i8 -= ActionMenuView.m2964a(a, i5, i8, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i4 = a.getMeasuredWidth();
                i9 = i3 - i4;
                if (i2 != 0) {
                    i4 = i2;
                }
                i2 = c0485t.getGroupId();
                if (i2 != 0) {
                    sparseBooleanArray.put(i2, true);
                }
                c0485t.m2919c(true);
                i = i9;
                i2 = i6;
            } else if (c0485t.m2924g()) {
                boolean z;
                int groupId = c0485t.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i6 > 0 || z2) && i3 > 0 && (!this.f3635r || i8 > 0);
                if (z3) {
                    View a2 = mo923a(c0485t, this.f3640w, viewGroup);
                    if (this.f3640w == null) {
                        this.f3640w = a2;
                    }
                    boolean z4;
                    if (this.f3635r) {
                        int a3 = ActionMenuView.m2964a(a2, i5, i8, makeMeasureSpec, 0);
                        i9 = i8 - a3;
                        if (a3 == 0) {
                            i8 = 0;
                        } else {
                            z4 = z3;
                        }
                        i4 = i9;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i4 = i8;
                        z4 = z5;
                    }
                    i9 = a2.getMeasuredWidth();
                    i3 -= i9;
                    if (i2 == 0) {
                        i2 = i9;
                    }
                    if (this.f3635r) {
                        z = i8 & (i3 >= 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    } else {
                        z = i8 & (i3 + i2 > 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    }
                } else {
                    z = z3;
                    i9 = i2;
                    i2 = i8;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i8 = i6;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i6;
                    for (i6 = 0; i6 < i7; i6++) {
                        C0485t c0485t2 = (C0485t) arrayList.get(i6);
                        if (c0485t2.getGroupId() == groupId) {
                            if (c0485t2.m2923f()) {
                                i4++;
                            }
                            c0485t2.m2919c(false);
                        }
                    }
                    i8 = i4;
                } else {
                    i8 = i6;
                }
                if (z) {
                    i8--;
                }
                c0485t.m2919c(z);
                i4 = i9;
                i = i3;
                int i10 = i2;
                i2 = i8;
                i8 = i10;
            } else {
                c0485t.m2919c(false);
                i4 = i2;
                i = i3;
                i2 = i6;
            }
            i7++;
            i3 = i;
            i6 = i2;
            i2 = i4;
        }
        return true;
    }

    public final void mo665a(C0471p c0471p, boolean z) {
        m3886e();
        super.mo665a(c0471p, z);
    }

    public final void m3877a(ActionMenuView actionMenuView) {
        this.h = actionMenuView;
        actionMenuView.f2913a = this.c;
    }
}
