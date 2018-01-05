package com.google.android.finsky.stream.base;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dg;
import android.support.v7.widget.ew;
import android.support.v7.widget.fr;
import android.support.v7.widget.gs;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.nestedrecyclerviews.NestedParentRecyclerView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C4279n extends C1137h implements C4278u {
    public static final Object f21579c = new Object();
    public final List f21580d;
    public final Set f21581e;
    public C1461c f21582f;
    public RecyclerView f21583g;
    public List f21584h;
    public boolean f21585i;
    public boolean f21586j;
    public boolean f21587k;

    public C4279n() {
        this(false);
    }

    public C4279n(boolean z) {
        this.f21580d = new ArrayList();
        this.f21581e = new HashSet();
        this.f21584h = new ArrayList();
        ((C1419m) C3947d.m18649a(C1419m.class)).mo1915a(this);
        this.f21585i = z;
        this.f21586j = false;
        this.f21587k = true;
    }

    public final void m19855a(List list) {
        m19846a(this.f21580d.size(), list);
    }

    public final void m19846a(int i, List list) {
        int i2;
        int i3 = 0;
        for (i2 = 0; i2 < list.size(); i2++) {
            ((C1169s) list.get(i2)).mo4053a((C4278u) this);
        }
        int a = mo1039a();
        i2 = 0;
        while (i3 < i) {
            i3++;
            i2 = ((C1169s) this.f21580d.get(i3)).mo1508a() + i2;
        }
        this.f21580d.addAll(i, list);
        int a2 = mo1039a() - a;
        if (a2 > 0) {
            m3632c(i2, a2);
        }
    }

    public final C4277k m19845a(ac acVar) {
        C4277k c4277k;
        List list = (List) acVar.m21690b("StreamRecyclerViewAdapter.StreamSectionStateList");
        C4291q c4291q = (C4291q) acVar.m21690b("StreamRecyclerViewAdapter.ScrollState");
        if (list != null) {
            if (list.size() > this.f21580d.size()) {
                FinskyLog.m21667d("More streamSectionStates than available controllers:mControllersList (size:%d), streamSectionStates (size:%d)", Integer.valueOf(this.f21580d.size()), Integer.valueOf(list.size()));
                return new C4277k(0, 0);
            }
            for (int i = 0; i < list.size(); i++) {
                ((C1169s) this.f21580d.get(i)).mo4052a((C4255t) list.get(i));
            }
        }
        C4277k c4277k2 = new C4277k(0, 0);
        if (list == null || c4291q == null) {
            c4277k = c4277k2;
        } else {
            C1169s c1169s = (C1169s) this.f21580d.get(c4291q.f21651a);
            C4277k b = c1169s.mo4055b((C4255t) list.get(c4291q.f21651a), new C4277k(c4291q.f21652b, c4291q.f21653c), c4291q.f21654d);
            c4277k = new C4277k(m19838a(c1169s, b.f21577a), b.f21578b);
            if (!this.f21585i) {
                ((LinearLayoutManager) this.f21583g.getLayoutManager()).m3094a(c4277k.f21577a, b.f21578b);
            }
        }
        if (!(this.f21583g instanceof NestedParentRecyclerView) || !acVar.m21689a("StreamRecyclerViewAdapter.NestedScrollState")) {
            return c4277k;
        }
        NestedParentRecyclerView nestedParentRecyclerView = (NestedParentRecyclerView) this.f21583g;
        int i2 = acVar.getInt("StreamRecyclerViewAdapter.NestedScrollState");
        if (nestedParentRecyclerView.aH == null) {
            return c4277k;
        }
        nestedParentRecyclerView.aH.mo3740b(i2);
        return c4277k;
    }

    public final void m19856b() {
        if (!(this.f21583g.getLayoutManager() instanceof gs)) {
            this.f21583g.getContext();
            this.f21583g.setLayoutManager(new gs());
            m19839c();
        }
    }

    public final int mo1039a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f21580d.size(); i2++) {
            i += ((C1169s) this.f21580d.get(i2)).mo1508a();
        }
        return i;
    }

    public final boolean mo4090m() {
        return this.f21586j;
    }

    public final boolean mo4091n() {
        return this.f21587k;
    }

    public final int mo1040a(int i) {
        int e = m19840e(i);
        return ((C1169s) this.f21580d.get(e)).mo1509a(m19841f(i));
    }

    public final void m19851a(C4292r c4292r, int i) {
        int e = m19840e(i);
        int f = m19841f(i);
        C1169s c1169s = (C1169s) this.f21580d.get(e);
        c4292r.f21655t = c1169s;
        c1169s.mo1510a(c4292r.a, f);
        this.f21581e.add(c4292r);
        for (int i2 = 0; i2 < this.f21584h.size(); i2++) {
            ((C4232p) this.f21584h.get(i2)).mo4031a(c1169s);
        }
    }

    public final void m19850a(C4292r c4292r) {
        int i = -1;
        C1169s c1169s = c4292r.f21655t;
        if (c1169s != null) {
            this.f21581e.remove(c4292r);
            c4292r.f21655t = null;
            int d = c4292r.m3267d();
            if (d != -1) {
                i = m19841f(d);
            }
            c1169s.mo1511b(c4292r.a, i);
        }
    }

    public final void m19859b(ac acVar) {
        m19854a(acVar, -1, 0, 0);
    }

    public final void m19854a(ac acVar, int i, int i2, int i3) {
        int height;
        int top;
        int a;
        if (!this.f21582f.dj().mo2294a(12642582) || this.f21585i) {
            C4292r[] c4292rArr = (C4292r[]) this.f21581e.toArray(new C4292r[this.f21581e.size()]);
            for (C4292r a2 : c4292rArr) {
                m19850a(a2);
            }
        }
        if (!this.f21585i) {
            i = ((LinearLayoutManager) this.f21583g.getLayoutManager()).m3124j();
            if (this.f21583g.getChildCount() > 0) {
                View childAt = this.f21583g.getChildAt(0);
                top = childAt.getTop();
                height = childAt.getHeight();
            } else {
                height = 0;
                top = 0;
            }
            if (this.f21583g instanceof NestedParentRecyclerView) {
                NestedParentRecyclerView nestedParentRecyclerView = (NestedParentRecyclerView) this.f21583g;
                String str = "StreamRecyclerViewAdapter.NestedScrollState";
                if (nestedParentRecyclerView.aH != null) {
                    a = nestedParentRecyclerView.aH.mo3736a();
                } else {
                    a = -1;
                }
                acVar.putInt(str, a);
            }
            i3 = height;
            i2 = top;
        }
        if (i != -1) {
            height = m19840e(i);
            a = m19841f(i);
            acVar.m21688a("StreamRecyclerViewAdapter.ScrollState", new C4291q(height, a, i2, i3));
            top = height;
            height = a;
        } else {
            height = 0;
            top = 0;
        }
        List arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < this.f21580d.size()) {
            C1169s c1169s = (C1169s) this.f21580d.get(i4);
            if (i != -1 && i4 == r3) {
                c1169s.mo4051a(new C4277k(height, i2), i3);
            }
            arrayList.add(c1169s.mo4062s());
            c1169s.mo4061q();
            i4++;
        }
        acVar.m21688a("StreamRecyclerViewAdapter.StreamSectionStateList", arrayList);
        if (this.f21582f.dj().mo2294a(12642582) && !this.f21585i) {
            ew layoutManager = this.f21583g.getLayoutManager();
            this.f21583g.setItemViewCacheSize(0);
            this.f21583g.setLayoutManager(null);
            this.f21583g.setLayoutManager(layoutManager);
            this.f21583g.setItemViewCacheSize(2);
        }
    }

    public final void mo2578a(RecyclerView recyclerView) {
        super.mo2578a(recyclerView);
        this.f21583g = recyclerView;
        m19839c();
    }

    public final void mo2579b(RecyclerView recyclerView) {
        super.mo2579b(recyclerView);
        this.f21583g = null;
    }

    private final int m19840e(int i) {
        for (int i2 = 0; i2 < this.f21580d.size(); i2++) {
            C1169s c1169s = (C1169s) this.f21580d.get(i2);
            int a = c1169s.mo1508a();
            if (i < c1169s.mo1508a()) {
                return i2;
            }
            i -= a;
        }
        FinskyLog.m21669e("Should never reach here", new Object[0]);
        return -1;
    }

    private final int m19841f(int i) {
        for (int i2 = 0; i2 < this.f21580d.size(); i2++) {
            C1169s c1169s = (C1169s) this.f21580d.get(i2);
            int a = c1169s.mo1508a();
            if (i < c1169s.mo1508a()) {
                return i;
            }
            i -= a;
        }
        return -1;
    }

    private final int m19838a(C1169s c1169s, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21580d.size(); i3++) {
            C1169s c1169s2 = (C1169s) this.f21580d.get(i3);
            if (c1169s2 == c1169s) {
                return i2 + i;
            }
            i2 += c1169s2.mo1508a();
        }
        return -1;
    }

    private final void m19839c() {
        ew layoutManager = this.f21583g.getLayoutManager();
        if (layoutManager instanceof gs) {
            dg c4280o = new C4280o(this);
            c4280o.f3371b = true;
            ((gs) layoutManager).f3368g = c4280o;
        }
    }

    public final void mo4087a(C1169s c1169s, int i, int i2, boolean z) {
        super.m3620a(m19838a(c1169s, i), i2, z ? null : f21579c);
    }

    public final void mo4086a(C1169s c1169s, int i, int i2) {
        super.m3632c(m19838a(c1169s, i), i2);
    }

    public final void mo4088b(C1169s c1169s, int i, int i2) {
        super.m3634d(m19838a(c1169s, i), i2);
    }

    public final void mo4089c(C1169s c1169s, int i, int i2) {
        super.m3627b(m19838a(c1169s, i), m19838a(c1169s, i2));
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C4292r(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
