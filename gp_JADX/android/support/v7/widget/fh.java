package android.support.v7.widget;

import android.support.v4.os.C0330d;
import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fh {
    public final ArrayList f3447a = new ArrayList();
    public ArrayList f3448b = null;
    public final ArrayList f3449c = new ArrayList();
    public final List f3450d = Collections.unmodifiableList(this.f3447a);
    public int f3451e = 2;
    public int f3452f = 2;
    public ff f3453g;
    public fp f3454h;
    public final /* synthetic */ RecyclerView f3455i;

    public fh(RecyclerView recyclerView) {
        this.f3455i = recyclerView;
    }

    public final void m3684a() {
        this.f3447a.clear();
        m3692c();
    }

    final void m3688b() {
        this.f3452f = (this.f3455i.f528v != null ? this.f3455i.f528v.f2953I : 0) + this.f3451e;
        for (int size = this.f3449c.size() - 1; size >= 0 && this.f3449c.size() > this.f3452f; size--) {
            m3689b(size);
        }
    }

    public final int m3682a(int i) {
        if (i >= 0 && i < this.f3455i.ao.m3705a()) {
            return !this.f3455i.ao.f3471h ? i : this.f3455i.f519m.m3914b(i);
        } else {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f3455i.ao.m3705a() + this.f3455i.m276a());
        }
    }

    public final fr m3683a(int i, long j) {
        if (i < 0 || i >= this.f3455i.ao.m3705a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.f3455i.ao.m3705a() + this.f3455i.m276a());
        }
        boolean z;
        int b;
        Object obj;
        View a;
        long s;
        long j2;
        Object obj2;
        LayoutParams layoutParams;
        fa faVar;
        Object obj3 = null;
        fr frVar = null;
        if (this.f3455i.ao.f3471h) {
            frVar = m3680c(i);
            obj3 = frVar != null ? 1 : null;
        }
        if (frVar == null) {
            frVar = m3681d(i);
            if (frVar != null) {
                if (frVar.m3276m()) {
                    z = this.f3455i.ao.f3471h;
                } else if (frVar.f3213c < 0 || frVar.f3213c >= this.f3455i.f527u.mo1039a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + frVar + this.f3455i.m276a());
                } else if (!this.f3455i.ao.f3471h && this.f3455i.f527u.mo1040a(frVar.f3213c) != frVar.f3216f) {
                    z = false;
                } else if (!this.f3455i.f527u.f3434b || frVar.f3215e == this.f3455i.f527u.mo1043b(frVar.f3213c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    obj3 = 1;
                } else {
                    frVar.m3264b(4);
                    if (frVar.m3268e()) {
                        this.f3455i.removeDetachedView(frVar.f3211a, false);
                        frVar.m3269f();
                    } else if (frVar.m3270g()) {
                        frVar.m3271h();
                    }
                    m3685a(frVar);
                    frVar = null;
                }
            }
        }
        if (frVar == null) {
            b = this.f3455i.f519m.m3914b(i);
            if (b < 0 || b >= this.f3455i.f527u.mo1039a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ").state:" + this.f3455i.ao.m3705a() + this.f3455i.m276a());
            }
            RecyclerView g;
            fg c;
            int a2 = this.f3455i.f527u.mo1040a(b);
            if (this.f3455i.f527u.f3434b) {
                frVar = m3678a(this.f3455i.f527u.mo1043b(b), a2);
                if (frVar != null) {
                    frVar.f3213c = b;
                    obj = 1;
                    if (frVar == null && this.f3454h != null) {
                        a = this.f3454h.m3709a();
                        if (a != null) {
                            frVar = this.f3455i.m275a(a);
                            if (frVar == null) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + this.f3455i.m276a());
                            } else if (frVar.m3265b()) {
                                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + this.f3455i.m276a());
                            }
                        }
                    }
                    if (frVar == null) {
                        frVar = m3694d().mo2357b(a2);
                        if (frVar != null) {
                            frVar.m3280q();
                            if (RecyclerView.f486c && (frVar.f3211a instanceof ViewGroup)) {
                                m3679a((ViewGroup) frVar.f3211a, false);
                            }
                        }
                    }
                    if (frVar == null) {
                        s = RecyclerView.m267s();
                        if (j != Long.MAX_VALUE) {
                            j2 = this.f3453g.m3676c(a2).f3445c;
                            obj3 = (j2 != 0 || j2 + s < j) ? 1 : null;
                            if (obj3 == null) {
                                return null;
                            }
                        }
                        frVar = this.f3455i.f527u.m3626b(this.f3455i, a2);
                        if (RecyclerView.f489f) {
                            g = RecyclerView.m265g(frVar.f3211a);
                            if (g != null) {
                                frVar.f3212b = new WeakReference(g);
                            }
                        }
                        s = RecyclerView.m267s() - s;
                        c = this.f3453g.m3676c(a2);
                        c.f3445c = ff.m3669a(c.f3445c, s);
                    }
                    obj2 = obj;
                }
            }
            obj = obj3;
            a = this.f3454h.m3709a();
            if (a != null) {
                frVar = this.f3455i.m275a(a);
                if (frVar == null) {
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + this.f3455i.m276a());
                } else if (frVar.m3265b()) {
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + this.f3455i.m276a());
                }
            }
            if (frVar == null) {
                frVar = m3694d().mo2357b(a2);
                if (frVar != null) {
                    frVar.m3280q();
                    m3679a((ViewGroup) frVar.f3211a, false);
                }
            }
            if (frVar == null) {
                s = RecyclerView.m267s();
                if (j != Long.MAX_VALUE) {
                    j2 = this.f3453g.m3676c(a2).f3445c;
                    if (j2 != 0) {
                    }
                    if (obj3 == null) {
                        return null;
                    }
                }
                frVar = this.f3455i.f527u.m3626b(this.f3455i, a2);
                if (RecyclerView.f489f) {
                    g = RecyclerView.m265g(frVar.f3211a);
                    if (g != null) {
                        frVar.f3212b = new WeakReference(g);
                    }
                }
                s = RecyclerView.m267s() - s;
                c = this.f3453g.m3676c(a2);
                c.f3445c = ff.m3669a(c.f3445c, s);
            }
            obj2 = obj;
        } else {
            obj2 = obj3;
        }
        if (!(obj2 == null || this.f3455i.ao.f3471h || !frVar.m3263a(8192))) {
            frVar.m3258a(0, 8192);
            if (this.f3455i.ao.f3473j) {
                this.f3455i.m281a(frVar, this.f3455i.f512T.recordPreLayoutInformation(this.f3455i.ao, frVar, eq.buildAdapterChangeFlagsForAnimations(frVar) | eq.FLAG_APPEARED_IN_PRE_LAYOUT, frVar.m3279p()));
            }
        }
        if (this.f3455i.ao.f3471h && frVar.m3275l()) {
            frVar.f3217g = i;
            obj = null;
        } else if (!frVar.m3275l() || frVar.m3274k() || frVar.m3273j()) {
            b = this.f3455i.f519m.m3914b(i);
            frVar.f3228s = this.f3455i;
            int i2 = frVar.f3216f;
            s = RecyclerView.m267s();
            if (j != Long.MAX_VALUE) {
                j2 = this.f3453g.m3676c(i2).f3446d;
                obj3 = (j2 == 0 || j2 + s < j) ? 1 : null;
                if (obj3 == null) {
                    obj3 = null;
                    obj = obj3;
                }
            }
            em emVar = this.f3455i.f527u;
            frVar.f3213c = b;
            if (emVar.f3434b) {
                frVar.f3215e = emVar.mo1043b(b);
            }
            frVar.m3258a(1, 519);
            C0330d.m1728a("RV OnBindView");
            frVar.m3279p();
            emVar.mo1042a(frVar, b);
            frVar.m3278o();
            layoutParams = frVar.f3211a.getLayoutParams();
            if (layoutParams instanceof fa) {
                ((fa) layoutParams).f3358e = true;
            }
            C0330d.m1727a();
            long s2 = RecyclerView.m267s() - s;
            fg c2 = this.f3453g.m3676c(frVar.f3216f);
            c2.f3446d = ff.m3669a(c2.f3446d, s2);
            if (this.f3455i.m312l()) {
                a = frVar.f3211a;
                if (ai.f1848a.mo392d(a) == 0) {
                    ai.m1838b(a, 1);
                }
                if (!ai.m1834a(a)) {
                    frVar.m3264b(16384);
                    ai.m1829a(a, this.f3455i.av.f3486e);
                }
            }
            if (this.f3455i.ao.f3471h) {
                frVar.f3217g = i;
            }
            obj3 = 1;
            obj = obj3;
        } else {
            obj = null;
        }
        layoutParams = frVar.f3211a.getLayoutParams();
        if (layoutParams == null) {
            faVar = (fa) this.f3455i.generateDefaultLayoutParams();
            frVar.f3211a.setLayoutParams(faVar);
        } else if (this.f3455i.checkLayoutParams(layoutParams)) {
            faVar = (fa) layoutParams;
        } else {
            faVar = (fa) this.f3455i.generateLayoutParams(layoutParams);
            frVar.f3211a.setLayoutParams(faVar);
        }
        faVar.f3356c = frVar;
        z = (obj2 == null || obj == null) ? false : true;
        faVar.f3359f = z;
        return frVar;
    }

    private final void m3679a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m3679a((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    public final void m3687a(View view) {
        fr c = RecyclerView.m261c(view);
        if (c.m3277n()) {
            this.f3455i.removeDetachedView(view, false);
        }
        if (c.m3268e()) {
            c.m3269f();
        } else if (c.m3270g()) {
            c.m3271h();
        }
        m3685a(c);
    }

    final void m3692c() {
        for (int size = this.f3449c.size() - 1; size >= 0; size--) {
            m3689b(size);
        }
        this.f3449c.clear();
        if (RecyclerView.f489f) {
            this.f3455i.an.m3428a();
        }
    }

    final void m3689b(int i) {
        m3686a((fr) this.f3449c.get(i), true);
        this.f3449c.remove(i);
    }

    final void m3685a(fr frVar) {
        int i = 0;
        if (frVar.m3268e() || frVar.f3211a.getParent() != null) {
            throw new IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + frVar.m3268e() + " isAttached:" + (frVar.f3211a.getParent() != null) + this.f3455i.m276a());
        } else if (frVar.m3277n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + frVar + this.f3455i.m276a());
        } else if (frVar.m3265b()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f3455i.m276a());
        } else {
            boolean z;
            boolean z2;
            int size;
            if ((frVar.f3220j & 16) == 0) {
                if (ai.f1848a.mo390b(frVar.f3211a)) {
                    z = true;
                    if (this.f3455i.f527u == null && r3 && this.f3455i.f527u.mo1134b(frVar)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || frVar.m3281r()) {
                        if (this.f3452f > 0 || frVar.m3263a(526)) {
                            z2 = false;
                        } else {
                            size = this.f3449c.size();
                            if (size >= this.f3452f && size > 0) {
                                m3689b(0);
                                size--;
                            }
                            if (RecyclerView.f489f && size > 0 && !this.f3455i.an.m3431a(frVar.f3213c)) {
                                int i2 = size - 1;
                                while (i2 >= 0) {
                                    if (!this.f3455i.an.m3431a(((fr) this.f3449c.get(i2)).f3213c)) {
                                        break;
                                    }
                                    i2--;
                                }
                                size = i2 + 1;
                            }
                            this.f3449c.add(size, frVar);
                            size = true;
                        }
                        if (!size == true) {
                            m3686a(frVar, true);
                            i = 1;
                        }
                    } else {
                        size = 0;
                    }
                    this.f3455i.f521o.m3864d(frVar);
                    if (size == 0 && r2 == 0 && r3) {
                        frVar.f3228s = null;
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (this.f3455i.f527u == null) {
            }
            z2 = false;
            if (z2) {
            }
            if (this.f3452f > 0) {
            }
            z2 = false;
            if (size == true) {
                m3686a(frVar, true);
                i = 1;
            }
            this.f3455i.f521o.m3864d(frVar);
            if (size == 0) {
            }
        }
    }

    final void m3686a(fr frVar, boolean z) {
        RecyclerView.m259b(frVar);
        if (frVar.m3263a(16384)) {
            frVar.m3258a(0, 16384);
            ai.m1829a(frVar.f3211a, null);
        }
        if (z) {
            if (this.f3455i.f529w != null) {
                this.f3455i.f529w.m3695a();
            }
            if (this.f3455i.f527u != null) {
                this.f3455i.f527u.mo1132a(frVar);
            }
            if (this.f3455i.ao != null) {
                this.f3455i.f521o.m3864d(frVar);
            }
        }
        frVar.f3228s = null;
        m3694d().mo2356a(frVar);
    }

    final void m3691b(View view) {
        fr c = RecyclerView.m261c(view);
        c.f3224o = null;
        c.f3225p = false;
        c.m3271h();
        m3685a(c);
    }

    final void m3693c(View view) {
        fr c = RecyclerView.m261c(view);
        if (!c.m3263a(12) && c.m3282s()) {
            RecyclerView recyclerView = this.f3455i;
            boolean z = recyclerView.f512T == null || recyclerView.f512T.canReuseUpdatedViewHolder(c, c.m3279p());
            if (!z) {
                if (this.f3448b == null) {
                    this.f3448b = new ArrayList();
                }
                c.m3260a(this, true);
                this.f3448b.add(c);
                return;
            }
        }
        if (!c.m3273j() || c.m3276m() || this.f3455i.f527u.f3434b) {
            c.m3260a(this, false);
            this.f3447a.add(c);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f3455i.m276a());
    }

    final void m3690b(fr frVar) {
        if (frVar.f3225p) {
            this.f3448b.remove(frVar);
        } else {
            this.f3447a.remove(frVar);
        }
        frVar.f3224o = null;
        frVar.f3225p = false;
        frVar.m3271h();
    }

    private final fr m3680c(int i) {
        int i2 = 0;
        if (this.f3448b != null) {
            int size = this.f3448b.size();
            if (size != 0) {
                fr frVar;
                int i3 = 0;
                while (i3 < size) {
                    frVar = (fr) this.f3448b.get(i3);
                    if (frVar.m3270g() || frVar.m3266c() != i) {
                        i3++;
                    } else {
                        frVar.m3264b(32);
                        return frVar;
                    }
                }
                if (this.f3455i.f527u.f3434b) {
                    int a = this.f3455i.f519m.m3909a(i, 0);
                    if (a > 0 && a < this.f3455i.f527u.mo1039a()) {
                        long b = this.f3455i.f527u.mo1043b(a);
                        while (i2 < size) {
                            frVar = (fr) this.f3448b.get(i2);
                            if (frVar.m3270g() || frVar.f3215e != b) {
                                i2++;
                            } else {
                                frVar.m3264b(32);
                                return frVar;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    private final fr m3681d(int i) {
        View view;
        int i2 = 0;
        int size = this.f3447a.size();
        int i3 = 0;
        while (i3 < size) {
            fr frVar = (fr) this.f3447a.get(i3);
            if (frVar.m3270g() || frVar.m3266c() != i || frVar.m3273j() || (!this.f3455i.ao.f3471h && frVar.m3276m())) {
                i3++;
            } else {
                frVar.m3264b(32);
                return frVar;
            }
        }
        br brVar = this.f3455i.f520n;
        int size2 = brVar.f3231c.size();
        for (i3 = 0; i3 < size2; i3++) {
            View view2 = (View) brVar.f3231c.get(i3);
            fr b = brVar.f3229a.mo852b(view2);
            if (b.m3266c() == i && !b.m3273j() && !b.m3276m()) {
                view = view2;
                break;
            }
        }
        view = null;
        if (view != null) {
            frVar = RecyclerView.m261c(view);
            br brVar2 = this.f3455i.f520n;
            i2 = brVar2.f3229a.mo848a(view);
            if (i2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            } else if (brVar2.f3230b.m3342c(i2)) {
                brVar2.f3230b.m3341b(i2);
                brVar2.m3333b(view);
                int c = this.f3455i.f520n.m3334c(view);
                if (c == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + frVar + this.f3455i.m276a());
                }
                this.f3455i.f520n.m3336d(c);
                m3693c(view);
                frVar.m3264b(8224);
                return frVar;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        i3 = this.f3449c.size();
        while (i2 < i3) {
            frVar = (fr) this.f3449c.get(i2);
            if (frVar.m3273j() || frVar.m3266c() != i) {
                i2++;
            } else {
                this.f3449c.remove(i2);
                return frVar;
            }
        }
        return null;
    }

    private final fr m3678a(long j, int i) {
        int size;
        for (size = this.f3447a.size() - 1; size >= 0; size--) {
            fr frVar = (fr) this.f3447a.get(size);
            if (frVar.f3215e == j && !frVar.m3270g()) {
                if (i == frVar.f3216f) {
                    frVar.m3264b(32);
                    if (!frVar.m3276m() || this.f3455i.ao.f3471h) {
                        return frVar;
                    }
                    frVar.m3258a(2, 14);
                    return frVar;
                }
                this.f3447a.remove(size);
                this.f3455i.removeDetachedView(frVar.f3211a, false);
                m3691b(frVar.f3211a);
            }
        }
        size = this.f3449c.size() - 1;
        while (size >= 0) {
            frVar = (fr) this.f3449c.get(size);
            if (frVar.f3215e != j) {
                size--;
            } else if (i == frVar.f3216f) {
                this.f3449c.remove(size);
                return frVar;
            } else {
                m3689b(size);
                return null;
            }
        }
        return null;
    }

    final ff m3694d() {
        if (this.f3453g == null) {
            this.f3453g = new ff();
        }
        return this.f3453g;
    }
}
