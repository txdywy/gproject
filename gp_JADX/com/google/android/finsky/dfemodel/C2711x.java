package com.google.android.finsky.dfemodel;

import android.text.TextUtils;
import com.android.volley.C0656n;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class C2711x extends C2335k implements C0660x {
    public boolean f14892A;
    public C0656n f14893l;
    public int f14894m;
    public Object f14895n;
    public final List f14896o;
    public int f14897p;
    public final List f14898q;
    public final boolean f14899r;
    public boolean f14900s;
    public boolean f14901t;
    public ArrayList f14902u;
    public Set f14903v;
    public C2732y f14904w;
    public Set f14905x;
    public int f14906y;
    public int f14907z;

    protected C2711x(String str, boolean z) {
        this(null, str, z);
    }

    protected abstract C0656n mo3123b(String str);

    protected abstract String mo3120b(Object obj);

    protected abstract Object[] mo3124c(Object obj);

    protected abstract void mo3125f();

    protected C2711x(List list, String str, boolean z) {
        boolean z2;
        this.f14897p = 4;
        this.f14907z = 0;
        this.f14896o = list == null ? new ArrayList() : new ArrayList(list);
        this.f14898q = new ArrayList();
        this.f14898q.add(new aa(this.f14896o.size(), str));
        if (list == null || !TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14901t = z2;
        this.f14899r = z;
        this.f14905x = new HashSet();
        this.f14902u = mo3121d();
        this.f14903v = new HashSet();
    }

    public void mo3118a(String str) {
        this.f14898q.clear();
        this.f14898q.add(new aa(0, str));
        ac_();
    }

    public final List m14697k() {
        List arrayList = new ArrayList(this.f14898q.size());
        for (aa aaVar : this.f14898q) {
            arrayList.add(aaVar.f14911b);
        }
        return arrayList;
    }

    public final int m14698m() {
        return mo3119b() ? this.f14896o.size() : this.f14902u.size();
    }

    private final boolean mo3119b() {
        return this.f14906y == 0 && this.f14907z == 0;
    }

    public final boolean m14686a(int i) {
        return i >= 0 && i < m14698m();
    }

    public final boolean mo2861a() {
        return this.f14895n != null || this.f14896o.size() > 0;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f14893l = null;
        super.mo1062a(volleyError);
    }

    public final void m14699n() {
        mo3129i();
        if (this.f14901t && m14698m() == 0) {
            m14673a((aa) this.f14898q.get(0));
        }
    }

    public final void m14689b(int i) {
        if (i == 1 && this.f14904w == null) {
            FinskyLog.m21669e("Cannot refresh the filter without setting filter", new Object[0]);
        } else if (i != 0 || this.f14906y != 0) {
            this.f14906y = i;
            m14684a(true);
        }
    }

    private final void m14672a(int i, int i2, int i3) {
        for (C2733z c2733z : this.f14903v) {
            switch (i) {
                case 0:
                    c2733z.mo4165b(i2, i3);
                    break;
                case 1:
                    c2733z.mo4162a(i2, i3);
                    break;
                case 2:
                    c2733z.mo4170e();
                    break;
                default:
                    break;
            }
        }
    }

    public final int m14692c(int i) {
        return (mo3119b() || i >= this.f14902u.size()) ? i : ((Integer) this.f14902u.get(i)).intValue();
    }

    public final void m14682a(C2733z c2733z) {
        this.f14903v.add(c2733z);
    }

    public final void m14690b(C2733z c2733z) {
        this.f14903v.remove(c2733z);
    }

    public final int m14700o() {
        return this.f14903v == null ? 0 : this.f14903v.size();
    }

    public final void m14681a(C2732y c2732y) {
        if (c2732y == null) {
            FinskyLog.m21669e("Filter cannot be null", new Object[0]);
        } else {
            this.f14904w = c2732y;
        }
    }

    public final void m14701p() {
        m14689b(1);
        if (this.f14902u.size() < 12) {
            mo3122e();
        }
    }

    private final ArrayList mo3121d() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.f14896o.size()) {
            if (!m14677d(this.f14896o.get(i))) {
                Object obj;
                if (this.f14907z == 1 && this.f14905x.contains(Integer.valueOf(i))) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            i++;
        }
        return arrayList;
    }

    private final boolean m14677d(Object obj) {
        if (obj != null && this.f14906y == 1 && this.f14904w.mo4145b(obj)) {
            return true;
        }
        return false;
    }

    public final void m14684a(boolean z) {
        if (!this.f14896o.isEmpty()) {
            int i;
            ArrayList d = mo3121d();
            int size = this.f14902u.size();
            int size2 = d.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i4 < size && i3 < size2) {
                if (((Integer) this.f14902u.get(i4)).equals(d.get(i3))) {
                    i4++;
                    i3++;
                } else if (((Integer) this.f14902u.get(i4)).intValue() < ((Integer) d.get(i3)).intValue()) {
                    i2 = 1;
                    while (i4 + i2 < size && ((Integer) this.f14902u.get(i4 + i2)).intValue() < ((Integer) d.get(i3)).intValue()) {
                        i2++;
                    }
                    if (z) {
                        m14672a(1, i3, i2);
                    }
                    i = i4 + i2;
                    i2 = 1;
                    i4 = i;
                } else {
                    i2 = 1;
                    while (i3 + i2 < size2 && ((Integer) d.get(i3 + i2)).intValue() < ((Integer) this.f14902u.get(i4)).intValue()) {
                        i2++;
                    }
                    if (z) {
                        m14672a(0, i3, i2);
                    }
                    i = i3 + i2;
                    i2 = 1;
                    i3 = i;
                }
            }
            if (!z || i4 >= size) {
                i = i2;
            } else {
                m14672a(1, i3, (((Integer) this.f14902u.get(size - 1)).intValue() - ((Integer) this.f14902u.get(i4)).intValue()) + 1);
                i = 1;
            }
            if (z && i3 < size2) {
                m14672a(0, i3, (((Integer) d.get(size2 - 1)).intValue() - ((Integer) d.get(i3)).intValue()) + 1);
                i = 1;
            }
            this.f14902u = d;
            if (z && r0 != 0) {
                m14672a(2, 0, 0);
            }
        }
    }

    public final Object m14679a(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Can't return an item with a negative index: " + i);
        } else if (!m14686a(i)) {
            return null;
        } else {
            int c = m14692c(i);
            Object obj = this.f14896o.get(c);
            if (z && i >= this.f14902u.size() - this.f14897p) {
                mo3122e();
            }
            if (obj == null) {
                aa aaVar = null;
                for (aa aaVar2 : this.f14898q) {
                    if (aaVar2.f14910a > c) {
                        break;
                    }
                    aaVar = aaVar2;
                }
                m14673a(aaVar);
            }
            return obj;
        }
    }

    private final void mo3122e() {
        if (!this.f14899r || !this.f14901t) {
            return;
        }
        if (this.f14892A) {
            for (int i = 0; i < this.f14898q.size(); i++) {
                if (((aa) this.f14898q.get(i)).f14910a > this.f14896o.size()) {
                    int max = Math.max(1, i);
                    while (this.f14898q.size() > max) {
                        this.f14898q.remove(this.f14898q.size() - 1);
                    }
                    m14673a((aa) this.f14898q.get(this.f14898q.size() - 1));
                }
            }
            return;
        }
        m14673a((aa) this.f14898q.get(this.f14898q.size() - 1));
    }

    public final Object m14694d(int i) {
        return m14679a(i, true);
    }

    public final void m14695e(int i) {
        int c = m14692c(i);
        if (this.f14907z == 0) {
            this.f14896o.remove(c);
            this.f14892A = true;
            if (!(this.f14893l == null || this.f14893l.mo1073g())) {
                this.f14893l.mo1057f();
            }
        } else {
            this.f14905x.add(Integer.valueOf(c));
        }
        m14684a(false);
        mo3125f();
    }

    public final void m14702q() {
        if (mo3128h()) {
            this.f14893l = null;
            mo3129i();
            if (this.f14894m != -1) {
                for (aa aaVar : this.f14898q) {
                    if (this.f14894m == aaVar.f14910a) {
                        break;
                    }
                }
            }
            aa aaVar2 = null;
            if (aaVar2 == null) {
                aaVar2 = (aa) this.f14898q.get(this.f14898q.size() - 1);
            }
            m14673a(aaVar2);
        }
    }

    public void ac_() {
        m14691b(false);
    }

    public final void m14691b(boolean z) {
        if (z) {
            mo3125f();
        }
        if (this.f14893l != null) {
            this.f14893l.mo1057f();
            this.f14893l = null;
        }
        this.f14901t = true;
        this.f14896o.clear();
        this.f14902u.clear();
        m11927l();
    }

    public final boolean m14703r() {
        return (this.f14893l == null || this.f14893l.mo1073g()) ? false : true;
    }

    public final void b_(Object obj) {
        boolean z = false;
        mo3129i();
        this.f14895n = obj;
        int size = this.f14896o.size();
        Object[] c = mo3124c(obj);
        int length = c.length;
        if (this.f14897p <= 0) {
            this.f14897p = 4;
        } else {
            this.f14897p = Math.max(1, length / 4);
        }
        for (length = 0; length < c.length; length++) {
            Object obj2 = c[length];
            if (this.f14894m + length < this.f14896o.size()) {
                this.f14896o.set(this.f14894m + length, obj2);
            } else {
                this.f14896o.add(obj2);
                if (!m14677d(obj2)) {
                    this.f14902u.add(Integer.valueOf(this.f14894m + length));
                }
            }
        }
        Object b = mo3120b(obj);
        if (!TextUtils.isEmpty(b) && (this.f14894m == size || this.f14892A)) {
            this.f14898q.add(new aa(this.f14896o.size(), b));
        }
        if (this.f14892A) {
            this.f14892A = false;
        }
        if (this.f14896o.size() != ((aa) this.f14898q.get(this.f14898q.size() - 1)).f14910a || c.length <= 0) {
            boolean z2 = false;
        } else {
            length = 1;
        }
        if (length != 0 && this.f14899r) {
            z = true;
        }
        this.f14901t = z;
        this.f14893l = null;
        m11927l();
        if (this.f14901t && this.f14906y == 1 && this.f14896o.size() > 0 && this.f14902u.size() < 12) {
            mo3122e();
        }
    }

    private final void m14673a(aa aaVar) {
        if (!mo3128h()) {
            if (!(this.f14893l == null || this.f14893l.mo1073g())) {
                if (!this.f14893l.mo1545d().endsWith(aaVar.f14911b)) {
                    this.f14893l.mo1057f();
                } else {
                    return;
                }
            }
            this.f14894m = aaVar.f14910a;
            this.f14893l = mo3123b(aaVar.f14911b);
        }
    }

    public static void m14674a(C2711x c2711x) {
        if (c2711x != null && ((c2711x.f11508i.size() + 0) + c2711x.f11509j.size()) + c2711x.m14700o() > 0) {
            FinskyLog.m21669e("Not all listeners are un-registered from %s", c2711x);
        }
    }
}
