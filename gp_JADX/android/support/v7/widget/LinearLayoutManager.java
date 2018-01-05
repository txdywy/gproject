package android.support.v7.widget;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

public class LinearLayoutManager extends ew implements fn {
    public int f2962i;
    public dl f2963j;
    public ed f2964k;
    public boolean f2965l;
    public boolean f2966m;
    public boolean f2967n;
    public boolean f2968o;
    public boolean f2969p;
    public int f2970q;
    public int f2971r;
    public boolean f2972s;
    public SavedState f2973t;
    public final dj f2974u;
    public final dk f2975v;
    public int f2976w;

    public class SavedState implements Parcelable {
        public static final Creator CREATOR = new dm();
        public int f2942a;
        public int f2943b;
        public boolean f2944c;

        SavedState(Parcel parcel) {
            boolean z = true;
            this.f2942a = parcel.readInt();
            this.f2943b = parcel.readInt();
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2944c = z;
        }

        public SavedState(SavedState savedState) {
            this.f2942a = savedState.f2942a;
            this.f2943b = savedState.f2943b;
            this.f2944c = savedState.f2944c;
        }

        final boolean m2976a() {
            return this.f2942a >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2942a);
            parcel.writeInt(this.f2943b);
            parcel.writeInt(this.f2944c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f2966m = false;
        this.f2967n = false;
        this.f2968o = false;
        this.f2969p = true;
        this.f2970q = -1;
        this.f2971r = Integer.MIN_VALUE;
        this.f2973t = null;
        this.f2974u = new dj(this);
        this.f2975v = new dk();
        this.f2976w = 2;
        if (i == 0 || i == 1) {
            mo733a(null);
            if (i != this.f2962i) {
                this.f2962i = i;
                this.f2964k = null;
                m3056l();
            }
            mo733a(null);
            if (z != this.f2966m) {
                this.f2966m = z;
                m3056l();
            }
            this.f2950F = true;
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public fa mo724a() {
        return new fa(-2, -2);
    }

    public final void mo730a(RecyclerView recyclerView, fh fhVar) {
        super.mo730a(recyclerView, fhVar);
        if (this.f2972s) {
            m3040c(fhVar);
            fhVar.m3684a();
        }
    }

    public final void mo732a(AccessibilityEvent accessibilityEvent) {
        super.mo732a(accessibilityEvent);
        if (m3060p() > 0) {
            accessibilityEvent.setFromIndex(m3124j());
            accessibilityEvent.setToIndex(m3125k());
        }
    }

    public final Parcelable mo742d() {
        if (this.f2973t != null) {
            return new SavedState(this.f2973t);
        }
        Parcelable savedState = new SavedState();
        if (m3060p() > 0) {
            m3122h();
            boolean z = this.f2965l ^ this.f2967n;
            savedState.f2944c = z;
            View u;
            if (z) {
                u = m3086u();
                savedState.f2943b = this.f2964k.mo833c() - this.f2964k.mo832b(u);
                savedState.f2942a = ew.m2979a(u);
                return savedState;
            }
            u = m3085t();
            savedState.f2942a = ew.m2979a(u);
            savedState.f2943b = this.f2964k.mo829a(u) - this.f2964k.mo831b();
            return savedState;
        }
        savedState.f2942a = -1;
        return savedState;
    }

    public final void mo728a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2973t = (SavedState) parcelable;
            m3056l();
        }
    }

    public boolean mo745e() {
        return this.f2962i == 0;
    }

    public final boolean mo747f() {
        return this.f2962i == 1;
    }

    private final void mo812c() {
        boolean z = true;
        if (this.f2962i == 1 || !m3121g()) {
            z = this.f2966m;
        } else if (this.f2966m) {
            z = false;
        }
        this.f2967n = z;
    }

    public final View mo736b(int i) {
        int p = m3060p();
        if (p == 0) {
            return null;
        }
        int a = i - ew.m2979a(m3051f(0));
        if (a >= 0 && a < p) {
            View f = m3051f(a);
            if (ew.m2979a(f) == i) {
                return f;
            }
        }
        return super.mo736b(i);
    }

    private final int m3079h(fo foVar) {
        if (foVar.f3464a != -1) {
            return this.f2964k.mo837e();
        }
        return 0;
    }

    public final void mo729a(RecyclerView recyclerView, int i) {
        fl dnVar = new dn(recyclerView.getContext());
        dnVar.f3396g = i;
        m3014a(dnVar);
    }

    public final PointF mo738c(int i) {
        int i2 = 1;
        boolean z = false;
        if (m3060p() == 0) {
            return null;
        }
        if (i < ew.m2979a(m3051f(0))) {
            z = true;
        }
        if (z != this.f2967n) {
            i2 = -1;
        }
        if (this.f2962i == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public void mo739c(fh fhVar, fo foVar) {
        if (!(this.f2973t == null && this.f2970q == -1) && foVar.m3705a() == 0) {
            m3040c(fhVar);
            return;
        }
        int b;
        int i;
        int c;
        int i2;
        if (this.f2973t != null && this.f2973t.m2976a()) {
            this.f2970q = this.f2973t.f2942a;
        }
        m3122h();
        this.f2963j.f3385a = false;
        mo812c();
        View q = m3061q();
        if (!this.f2974u.f3379d || this.f2970q != -1 || this.f2973t != null) {
            Object obj;
            this.f2974u.m3506a();
            this.f2974u.f3378c = this.f2967n ^ this.f2968o;
            dj djVar = this.f2974u;
            if (foVar.f3471h || this.f2970q == -1) {
                obj = null;
            } else if (this.f2970q < 0 || this.f2970q >= foVar.m3705a()) {
                this.f2970q = -1;
                this.f2971r = Integer.MIN_VALUE;
                obj = null;
            } else {
                djVar.f3376a = this.f2970q;
                if (this.f2973t == null || !this.f2973t.m2976a()) {
                    if (this.f2971r == Integer.MIN_VALUE) {
                        q = mo736b(this.f2970q);
                        if (q == null) {
                            if (m3060p() > 0) {
                                djVar.f3378c = (this.f2970q < ew.m2979a(m3051f(0))) == this.f2967n;
                            }
                            djVar.m3508b();
                        } else if (this.f2964k.mo838e(q) > this.f2964k.mo837e()) {
                            djVar.m3508b();
                        } else if (this.f2964k.mo829a(q) - this.f2964k.mo831b() < 0) {
                            djVar.f3377b = this.f2964k.mo831b();
                            djVar.f3378c = false;
                        } else if (this.f2964k.mo833c() - this.f2964k.mo832b(q) < 0) {
                            djVar.f3377b = this.f2964k.mo833c();
                            djVar.f3378c = true;
                        } else {
                            if (djVar.f3378c) {
                                b = this.f2964k.mo832b(q) + this.f2964k.m3537a();
                            } else {
                                b = this.f2964k.mo829a(q);
                            }
                            djVar.f3377b = b;
                        }
                        obj = 1;
                    } else {
                        djVar.f3378c = this.f2967n;
                        if (this.f2967n) {
                            djVar.f3377b = this.f2964k.mo833c() - this.f2971r;
                        } else {
                            djVar.f3377b = this.f2964k.mo831b() + this.f2971r;
                        }
                    }
                    obj = 1;
                } else {
                    djVar.f3378c = this.f2973t.f2944c;
                    if (djVar.f3378c) {
                        djVar.f3377b = this.f2964k.mo833c() - this.f2973t.f2943b;
                    } else {
                        djVar.f3377b = this.f2964k.mo831b() + this.f2973t.f2943b;
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                if (m3060p() != 0) {
                    View q2 = m3061q();
                    if (q2 != null) {
                        fa faVar = (fa) q2.getLayoutParams();
                        obj = (faVar.f3356c.m3276m() || faVar.f3356c.m3266c() < 0 || faVar.f3356c.m3266c() >= foVar.m3705a()) ? null : 1;
                        if (obj != null) {
                            djVar.m3507a(q2);
                            obj = 1;
                            if (obj == null) {
                                djVar.m3508b();
                                djVar.f3376a = this.f2968o ? foVar.m3705a() - 1 : 0;
                            }
                        }
                    }
                    if (this.f2965l == this.f2968o) {
                        fo foVar2;
                        if (djVar.f3378c) {
                            if (!this.f2967n) {
                                q = m3076d(fhVar, foVar);
                            }
                            foVar2 = foVar;
                            q = mo796a(fhVar, foVar2, 0, m3060p(), foVar2.m3705a());
                        } else {
                            if (this.f2967n) {
                                q = m3076d(fhVar, foVar);
                            }
                            foVar2 = foVar;
                            q = mo796a(fhVar, foVar2, 0, m3060p(), foVar2.m3705a());
                        }
                        if (q != null) {
                            djVar.m3509b(q);
                            if (!foVar.f3471h && ct_()) {
                                obj = (this.f2964k.mo829a(q) >= this.f2964k.mo833c() || this.f2964k.mo832b(q) < this.f2964k.mo831b()) ? 1 : null;
                                if (obj != null) {
                                    if (djVar.f3378c) {
                                        b = this.f2964k.mo833c();
                                    } else {
                                        b = this.f2964k.mo831b();
                                    }
                                    djVar.f3377b = b;
                                }
                            }
                            obj = 1;
                            if (obj == null) {
                                djVar.m3508b();
                                if (this.f2968o) {
                                }
                                djVar.f3376a = this.f2968o ? foVar.m3705a() - 1 : 0;
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    djVar.m3508b();
                    if (this.f2968o) {
                    }
                    djVar.f3376a = this.f2968o ? foVar.m3705a() - 1 : 0;
                }
            }
            this.f2974u.f3379d = true;
        } else if (q != null && (this.f2964k.mo829a(q) >= this.f2964k.mo833c() || this.f2964k.mo832b(q) <= this.f2964k.mo831b())) {
            this.f2974u.m3507a(q);
        }
        b = m3079h(foVar);
        if (this.f2963j.f3393i >= 0) {
            i = 0;
        } else {
            i = b;
            b = 0;
        }
        i += this.f2964k.mo831b();
        b += this.f2964k.mo839f();
        if (!(!foVar.f3471h || this.f2970q == -1 || this.f2971r == Integer.MIN_VALUE)) {
            View b2 = mo736b(this.f2970q);
            if (b2 != null) {
                if (this.f2967n) {
                    c = (this.f2964k.mo833c() - this.f2964k.mo832b(b2)) - this.f2971r;
                } else {
                    c = this.f2971r - (this.f2964k.mo829a(b2) - this.f2964k.mo831b());
                }
                if (c > 0) {
                    i += c;
                } else {
                    b -= c;
                }
            }
        }
        c = this.f2974u.f3378c ? this.f2967n ? 1 : -1 : this.f2967n ? -1 : 1;
        mo801a(fhVar, foVar, this.f2974u, c);
        m3010a(fhVar);
        this.f2963j.f3395k = m3084s();
        if (this.f2974u.f3378c) {
            m3073b(this.f2974u);
            this.f2963j.f3392h = i;
            m3065a(fhVar, this.f2963j, foVar, false);
            i = this.f2963j.f3386b;
            i2 = this.f2963j.f3388d;
            if (this.f2963j.f3387c > 0) {
                b += this.f2963j.f3387c;
            }
            m3068a(this.f2974u);
            this.f2963j.f3392h = b;
            dl dlVar = this.f2963j;
            dlVar.f3388d += this.f2963j.f3389e;
            m3065a(fhVar, this.f2963j, foVar, false);
            c = this.f2963j.f3386b;
            if (this.f2963j.f3387c > 0) {
                b = this.f2963j.f3387c;
                m3078g(i2, i);
                this.f2963j.f3392h = b;
                m3065a(fhVar, this.f2963j, foVar, false);
                b = this.f2963j.f3386b;
            } else {
                b = i;
            }
            i = b;
            b = c;
        } else {
            m3068a(this.f2974u);
            this.f2963j.f3392h = b;
            m3065a(fhVar, this.f2963j, foVar, false);
            b = this.f2963j.f3386b;
            c = this.f2963j.f3388d;
            if (this.f2963j.f3387c > 0) {
                i += this.f2963j.f3387c;
            }
            m3073b(this.f2974u);
            this.f2963j.f3392h = i;
            dl dlVar2 = this.f2963j;
            dlVar2.f3388d += this.f2963j.f3389e;
            m3065a(fhVar, this.f2963j, foVar, false);
            i = this.f2963j.f3386b;
            if (this.f2963j.f3387c > 0) {
                i2 = this.f2963j.f3387c;
                m3077f(c, b);
                this.f2963j.f3392h = i2;
                m3065a(fhVar, this.f2963j, foVar, false);
                b = this.f2963j.f3386b;
            }
        }
        if (m3060p() <= 0) {
            c = i;
            i = b;
        } else if ((this.f2967n ^ this.f2968o) != 0) {
            c = m3064a(b, fhVar, foVar, true);
            i += c;
            b += c;
            c = m3071b(i, fhVar, foVar, false);
            b += c;
            c = i + c;
            i = b;
        } else {
            c = m3071b(i, fhVar, foVar, true);
            i += c;
            b += c;
            c = m3064a(b, fhVar, foVar, false);
            b += c;
            c = i + c;
            i = b;
        }
        if (foVar.f3474k && m3060p() != 0 && !foVar.f3471h && ct_()) {
            int i3 = 0;
            int i4 = 0;
            List list = fhVar.f3450d;
            int size = list.size();
            int a = ew.m2979a(m3051f(0));
            int i5 = 0;
            while (i5 < size) {
                fr frVar = (fr) list.get(i5);
                if (frVar.m3276m()) {
                    b = i4;
                    i2 = i3;
                } else {
                    if (((frVar.m3266c() < a) != this.f2967n ? -1 : 1) == -1) {
                        i2 = this.f2964k.mo838e(frVar.f3211a) + i3;
                        b = i4;
                    } else {
                        b = this.f2964k.mo838e(frVar.f3211a) + i4;
                        i2 = i3;
                    }
                }
                i5++;
                i3 = i2;
                i4 = b;
            }
            this.f2963j.f3394j = list;
            if (i3 > 0) {
                m3078g(ew.m2979a(m3085t()), c);
                this.f2963j.f3392h = i3;
                this.f2963j.f3387c = 0;
                this.f2963j.m3511a(null);
                m3065a(fhVar, this.f2963j, foVar, false);
            }
            if (i4 > 0) {
                m3077f(ew.m2979a(m3086u()), i);
                this.f2963j.f3392h = i4;
                this.f2963j.f3387c = 0;
                this.f2963j.m3511a(null);
                m3065a(fhVar, this.f2963j, foVar, false);
            }
            this.f2963j.f3394j = null;
        }
        if (foVar.f3471h) {
            this.f2974u.m3506a();
        } else {
            ed edVar = this.f2964k;
            edVar.f3426b = edVar.mo837e();
        }
        this.f2965l = this.f2968o;
    }

    public void mo731a(fo foVar) {
        super.mo731a(foVar);
        this.f2973t = null;
        this.f2970q = -1;
        this.f2971r = Integer.MIN_VALUE;
        this.f2974u.m3506a();
    }

    void mo801a(fh fhVar, fo foVar, dj djVar, int i) {
    }

    private final int m3064a(int i, fh fhVar, fo foVar, boolean z) {
        int c = this.f2964k.mo833c() - i;
        if (c <= 0) {
            return 0;
        }
        c = -m3074c(-c, fhVar, foVar);
        int i2 = i + c;
        if (!z) {
            return c;
        }
        i2 = this.f2964k.mo833c() - i2;
        if (i2 <= 0) {
            return c;
        }
        this.f2964k.mo830a(i2);
        return c + i2;
    }

    private final int m3071b(int i, fh fhVar, fo foVar, boolean z) {
        int b = i - this.f2964k.mo831b();
        if (b <= 0) {
            return 0;
        }
        b = -m3074c(b, fhVar, foVar);
        int i2 = i + b;
        if (!z) {
            return b;
        }
        i2 -= this.f2964k.mo831b();
        if (i2 <= 0) {
            return b;
        }
        this.f2964k.mo830a(-i2);
        return b - i2;
    }

    private final void m3068a(dj djVar) {
        m3077f(djVar.f3376a, djVar.f3377b);
    }

    private final void m3077f(int i, int i2) {
        this.f2963j.f3387c = this.f2964k.mo833c() - i2;
        this.f2963j.f3389e = this.f2967n ? -1 : 1;
        this.f2963j.f3388d = i;
        this.f2963j.f3390f = 1;
        this.f2963j.f3386b = i2;
        this.f2963j.f3391g = Integer.MIN_VALUE;
    }

    private final void m3073b(dj djVar) {
        m3078g(djVar.f3376a, djVar.f3377b);
    }

    private final void m3078g(int i, int i2) {
        int i3;
        this.f2963j.f3387c = i2 - this.f2964k.mo831b();
        this.f2963j.f3388d = i;
        dl dlVar = this.f2963j;
        if (this.f2967n) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        dlVar.f3389e = i3;
        this.f2963j.f3390f = -1;
        this.f2963j.f3386b = i2;
        this.f2963j.f3391g = Integer.MIN_VALUE;
    }

    protected final boolean m3121g() {
        if (ai.f1848a.mo400k(this.f2960y) == 1) {
            return true;
        }
        return false;
    }

    final void m3122h() {
        if (this.f2963j == null) {
            this.f2963j = new dl();
        }
        if (this.f2964k == null) {
            ed eeVar;
            switch (this.f2962i) {
                case 0:
                    eeVar = new ee(this);
                    break;
                case 1:
                    eeVar = new ef(this);
                    break;
                default:
                    throw new IllegalArgumentException("invalid orientation");
            }
            this.f2964k = eeVar;
        }
    }

    public final void mo743d(int i) {
        this.f2970q = i;
        this.f2971r = Integer.MIN_VALUE;
        if (this.f2973t != null) {
            this.f2973t.f2942a = -1;
        }
        m3056l();
    }

    public final void m3094a(int i, int i2) {
        this.f2970q = i;
        this.f2971r = i2;
        if (this.f2973t != null) {
            this.f2973t.f2942a = -1;
        }
        m3056l();
    }

    public int mo723a(int i, fh fhVar, fo foVar) {
        if (this.f2962i == 1) {
            return 0;
        }
        return m3074c(i, fhVar, foVar);
    }

    public int mo734b(int i, fh fhVar, fo foVar) {
        if (this.f2962i == 0) {
            return 0;
        }
        return m3074c(i, fhVar, foVar);
    }

    public final int mo735b(fo foVar) {
        return m3081i(foVar);
    }

    public final int mo737c(fo foVar) {
        return m3081i(foVar);
    }

    public final int mo741d(fo foVar) {
        return m3082j(foVar);
    }

    public final int mo744e(fo foVar) {
        return m3082j(foVar);
    }

    public final int mo746f(fo foVar) {
        return m3083k(foVar);
    }

    public final int mo748g(fo foVar) {
        return m3083k(foVar);
    }

    private final int m3081i(fo foVar) {
        boolean z = true;
        if (m3060p() == 0) {
            return 0;
        }
        m3122h();
        ed edVar = this.f2964k;
        View a = m3066a(!this.f2969p);
        if (this.f2969p) {
            z = false;
        }
        View b = m3072b(z);
        boolean z2 = this.f2969p;
        boolean z3 = this.f2967n;
        if (m3060p() == 0 || foVar.m3705a() == 0 || a == null || b == null) {
            return 0;
        }
        int max;
        int min = Math.min(ew.m2979a(a), ew.m2979a(b));
        int max2 = Math.max(ew.m2979a(a), ew.m2979a(b));
        if (z3) {
            max = Math.max(0, (foVar.m3705a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z2) {
            return max;
        }
        return Math.round(((float) (edVar.mo831b() - edVar.mo829a(a))) + ((((float) Math.abs(edVar.mo832b(b) - edVar.mo829a(a))) / ((float) (Math.abs(ew.m2979a(a) - ew.m2979a(b)) + 1))) * ((float) max)));
    }

    private final int m3082j(fo foVar) {
        boolean z = true;
        if (m3060p() == 0) {
            return 0;
        }
        m3122h();
        ed edVar = this.f2964k;
        View a = m3066a(!this.f2969p);
        if (this.f2969p) {
            z = false;
        }
        View b = m3072b(z);
        boolean z2 = this.f2969p;
        if (m3060p() == 0 || foVar.m3705a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(ew.m2979a(a) - ew.m2979a(b)) + 1;
        }
        return Math.min(edVar.mo837e(), edVar.mo832b(b) - edVar.mo829a(a));
    }

    private final int m3083k(fo foVar) {
        boolean z = true;
        if (m3060p() == 0) {
            return 0;
        }
        m3122h();
        ed edVar = this.f2964k;
        View a = m3066a(!this.f2969p);
        if (this.f2969p) {
            z = false;
        }
        View b = m3072b(z);
        boolean z2 = this.f2969p;
        if (m3060p() == 0 || foVar.m3705a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return foVar.m3705a();
        }
        return (int) ((((float) (edVar.mo832b(b) - edVar.mo829a(a))) / ((float) (Math.abs(ew.m2979a(a) - ew.m2979a(b)) + 1))) * ((float) foVar.m3705a()));
    }

    private final void m3067a(int i, int i2, boolean z, fo foVar) {
        int i3 = -1;
        int i4 = 1;
        this.f2963j.f3395k = m3084s();
        this.f2963j.f3392h = m3079h(foVar);
        this.f2963j.f3390f = i;
        View u;
        dl dlVar;
        if (i == 1) {
            dl dlVar2 = this.f2963j;
            dlVar2.f3392h += this.f2964k.mo839f();
            u = m3086u();
            dlVar = this.f2963j;
            if (!this.f2967n) {
                i3 = 1;
            }
            dlVar.f3389e = i3;
            this.f2963j.f3388d = ew.m2979a(u) + this.f2963j.f3389e;
            this.f2963j.f3386b = this.f2964k.mo832b(u);
            i3 = this.f2964k.mo832b(u) - this.f2964k.mo833c();
        } else {
            u = m3085t();
            dlVar = this.f2963j;
            dlVar.f3392h += this.f2964k.mo831b();
            dlVar = this.f2963j;
            if (!this.f2967n) {
                i4 = -1;
            }
            dlVar.f3389e = i4;
            this.f2963j.f3388d = ew.m2979a(u) + this.f2963j.f3389e;
            this.f2963j.f3386b = this.f2964k.mo829a(u);
            i3 = (-this.f2964k.mo829a(u)) + this.f2964k.mo831b();
        }
        this.f2963j.f3387c = i2;
        if (z) {
            dl dlVar3 = this.f2963j;
            dlVar3.f3387c -= i3;
        }
        this.f2963j.f3391g = i3;
    }

    private final boolean m3084s() {
        return this.f2964k.mo841g() == 0 && this.f2964k.mo835d() == 0;
    }

    void mo804a(fo foVar, dl dlVar, ez ezVar) {
        int i = dlVar.f3388d;
        if (i >= 0 && i < foVar.m3705a()) {
            ezVar.mo792a(i, Math.max(0, dlVar.f3391g));
        }
    }

    public final void mo727a(int i, ez ezVar) {
        int i2;
        boolean z;
        if (this.f2973t == null || !this.f2973t.m2976a()) {
            mo812c();
            boolean z2 = this.f2967n;
            if (this.f2970q == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.f2970q;
                z = z2;
            }
        } else {
            z = this.f2973t.f2944c;
            i2 = this.f2973t.f2942a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f2976w && i2 >= 0 && i2 < i; i4++) {
            ezVar.mo792a(i2, 0);
            i2 += i3;
        }
    }

    public final void mo726a(int i, int i2, fo foVar, ez ezVar) {
        if (this.f2962i != 0) {
            i = i2;
        }
        if (m3060p() != 0 && i != 0) {
            m3122h();
            m3067a(i > 0 ? 1 : -1, Math.abs(i), true, foVar);
            mo804a(foVar, this.f2963j, ezVar);
        }
    }

    private final int m3074c(int i, fh fhVar, fo foVar) {
        if (m3060p() == 0 || i == 0) {
            return 0;
        }
        this.f2963j.f3385a = true;
        m3122h();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3067a(i2, abs, true, foVar);
        int a = this.f2963j.f3391g + m3065a(fhVar, this.f2963j, foVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2964k.mo830a(-i);
        this.f2963j.f3393i = i;
        return i;
    }

    public final void mo733a(String str) {
        if (this.f2973t == null) {
            super.mo733a(str);
        }
    }

    private final void m3069a(fh fhVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m3001a(i3, fhVar);
                }
                return;
            }
            while (i > i2) {
                m3001a(i, fhVar);
                i--;
            }
        }
    }

    private final void m3070a(fh fhVar, dl dlVar) {
        if (dlVar.f3385a && !dlVar.f3395k) {
            int i;
            int p;
            int d;
            View f;
            View f2;
            if (dlVar.f3390f == -1) {
                i = dlVar.f3391g;
                p = m3060p();
                if (i >= 0) {
                    d = this.f2964k.mo835d() - i;
                    if (this.f2967n) {
                        for (i = 0; i < p; i++) {
                            f = m3051f(i);
                            if (this.f2964k.mo829a(f) < d || this.f2964k.mo836d(f) < d) {
                                m3069a(fhVar, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    for (i = p - 1; i >= 0; i--) {
                        f2 = m3051f(i);
                        if (this.f2964k.mo829a(f2) < d || this.f2964k.mo836d(f2) < d) {
                            m3069a(fhVar, p - 1, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            p = dlVar.f3391g;
            if (p >= 0) {
                d = m3060p();
                if (this.f2967n) {
                    for (i = d - 1; i >= 0; i--) {
                        f2 = m3051f(i);
                        if (this.f2964k.mo832b(f2) > p || this.f2964k.mo834c(f2) > p) {
                            m3069a(fhVar, d - 1, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < d; i++) {
                    f = m3051f(i);
                    if (this.f2964k.mo832b(f) > p || this.f2964k.mo834c(f) > p) {
                        m3069a(fhVar, 0, i);
                        return;
                    }
                }
            }
        }
    }

    private final int m3065a(fh fhVar, dl dlVar, fo foVar, boolean z) {
        int i = dlVar.f3387c;
        if (dlVar.f3391g != Integer.MIN_VALUE) {
            if (dlVar.f3387c < 0) {
                dlVar.f3391g += dlVar.f3387c;
            }
            m3070a(fhVar, dlVar);
        }
        int i2 = dlVar.f3387c + dlVar.f3392h;
        dk dkVar = this.f2975v;
        while (true) {
            if ((!dlVar.f3395k && i2 <= 0) || !dlVar.m3512a(foVar)) {
                break;
            }
            dkVar.f3381a = 0;
            dkVar.f3382b = false;
            dkVar.f3383c = false;
            dkVar.f3384d = false;
            mo802a(fhVar, foVar, dlVar, dkVar);
            if (!dkVar.f3382b) {
                dlVar.f3386b += dkVar.f3381a * dlVar.f3390f;
                if (!(dkVar.f3383c && this.f2963j.f3394j == null && foVar.f3471h)) {
                    dlVar.f3387c -= dkVar.f3381a;
                    i2 -= dkVar.f3381a;
                }
                if (dlVar.f3391g != Integer.MIN_VALUE) {
                    dlVar.f3391g += dkVar.f3381a;
                    if (dlVar.f3387c < 0) {
                        dlVar.f3391g += dlVar.f3387c;
                    }
                    m3070a(fhVar, dlVar);
                }
                if (z && dkVar.f3384d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - dlVar.f3387c;
    }

    void mo802a(fh fhVar, fo foVar, dl dlVar, dk dkVar) {
        View a = dlVar.m3510a(fhVar);
        if (a == null) {
            dkVar.f3382b = true;
            return;
        }
        int paddingRight;
        int f;
        int i;
        int i2;
        fa faVar = (fa) a.getLayoutParams();
        if (dlVar.f3394j == null) {
            if (this.f2967n == (dlVar.f3390f == -1)) {
                super.m3017a(a, -1, false);
            } else {
                super.m3017a(a, 0, false);
            }
        } else {
            boolean z;
            boolean z2 = this.f2967n;
            if (dlVar.f3390f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z2 == z) {
                super.m3017a(a, -1, true);
            } else {
                super.m3017a(a, 0, true);
            }
        }
        mo2969a(a, 0, 0);
        dkVar.f3381a = this.f2964k.mo838e(a);
        if (this.f2962i == 1) {
            if (m3121g()) {
                paddingRight = this.f2957M - getPaddingRight();
                f = paddingRight - this.f2964k.mo840f(a);
            } else {
                f = getPaddingLeft();
                paddingRight = this.f2964k.mo840f(a) + f;
            }
            if (dlVar.f3390f == -1) {
                i = dlVar.f3386b - dkVar.f3381a;
                i2 = f;
                f = paddingRight;
                paddingRight = dlVar.f3386b;
            } else {
                i = dlVar.f3386b;
                i2 = f;
                f = paddingRight;
                paddingRight = dlVar.f3386b + dkVar.f3381a;
            }
        } else {
            i = getPaddingTop();
            paddingRight = this.f2964k.mo840f(a) + i;
            if (dlVar.f3390f == -1) {
                f = dlVar.f3386b;
                i2 = dlVar.f3386b - dkVar.f3381a;
            } else {
                i2 = dlVar.f3386b;
                f = dlVar.f3386b + dkVar.f3381a;
            }
        }
        ew.m2982b(a, i2, i, f, paddingRight);
        if (faVar.f3356c.m3276m() || faVar.f3356c.m3282s()) {
            dkVar.f3383c = true;
        }
        dkVar.f3384d = a.hasFocusable();
    }

    final boolean mo749i() {
        if (!(this.f2956L == MemoryMappedFileBuffer.DEFAULT_SIZE || this.f2955K == MemoryMappedFileBuffer.DEFAULT_SIZE)) {
            boolean z;
            int p = m3060p();
            for (int i = 0; i < p; i++) {
                LayoutParams layoutParams = m3051f(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    final int m3115e(int i) {
        switch (i) {
            case 1:
                if (this.f2962i == 1 || !m3121g()) {
                    return -1;
                }
                return 1;
            case 2:
                if (this.f2962i == 1) {
                    return 1;
                }
                if (m3121g()) {
                    return -1;
                }
                return 1;
            case 17:
                if (this.f2962i != 0) {
                    return Integer.MIN_VALUE;
                }
                return -1;
            case 33:
                if (this.f2962i != 1) {
                    return Integer.MIN_VALUE;
                }
                return -1;
            case 66:
                return this.f2962i == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.f2962i == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private final View m3085t() {
        return m3051f(this.f2967n ? m3060p() - 1 : 0);
    }

    private final View m3086u() {
        return m3051f(this.f2967n ? 0 : m3060p() - 1);
    }

    private final View m3066a(boolean z) {
        if (this.f2967n) {
            return m3091a(m3060p() - 1, -1, z, true);
        }
        return m3091a(0, m3060p(), z, true);
    }

    private final View m3072b(boolean z) {
        if (this.f2967n) {
            return m3091a(0, m3060p(), z, true);
        }
        return m3091a(m3060p() - 1, -1, z, true);
    }

    private final View m3076d(fh fhVar, fo foVar) {
        return mo796a(fhVar, foVar, m3060p() - 1, -1, foVar.m3705a());
    }

    View mo796a(fh fhVar, fo foVar, int i, int i2, int i3) {
        View view = null;
        m3122h();
        int b = this.f2964k.mo831b();
        int c = this.f2964k.mo833c();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View view3;
            View f = m3051f(i);
            int a = ew.m2979a(f);
            if (a >= 0 && a < i3) {
                if (((fa) f.getLayoutParams()).f3356c.m3276m()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = f;
                    }
                } else if (this.f2964k.mo829a(f) < c && this.f2964k.mo832b(f) >= b) {
                    return f;
                } else {
                    if (view == null) {
                        view3 = f;
                        f = view2;
                        i += i4;
                        view = view3;
                        view2 = f;
                    }
                }
            }
            view3 = view;
            f = view2;
            i += i4;
            view = view3;
            view2 = f;
        }
        return view != null ? view : view2;
    }

    private final View m3087v() {
        return m3080h(0, m3060p());
    }

    private final View m3088w() {
        return m3080h(m3060p() - 1, -1);
    }

    public final int m3124j() {
        View a = m3091a(0, m3060p(), false, true);
        return a == null ? -1 : ew.m2979a(a);
    }

    public final int m3125k() {
        View a = m3091a(m3060p() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return ew.m2979a(a);
    }

    public final View m3091a(int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4 = 320;
        m3122h();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f2962i == 0) {
            return this.B.m3849a(i, i2, i3, i4);
        }
        return this.C.m3849a(i, i2, i3, i4);
    }

    private final View m3080h(int i, int i2) {
        m3122h();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return m3051f(i);
        }
        int i3;
        int i4;
        if (this.f2964k.mo829a(m3051f(i)) < this.f2964k.mo831b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f2962i == 0) {
            return this.B.m3849a(i, i2, i3, i4);
        }
        return this.C.m3849a(i, i2, i3, i4);
    }

    public View mo725a(View view, int i, fh fhVar, fo foVar) {
        mo812c();
        if (m3060p() == 0) {
            return null;
        }
        int e = m3115e(i);
        if (e == Integer.MIN_VALUE) {
            return null;
        }
        View w;
        View view2;
        m3122h();
        m3122h();
        m3067a(e, (int) (0.33333334f * ((float) this.f2964k.mo837e())), false, foVar);
        this.f2963j.f3391g = Integer.MIN_VALUE;
        this.f2963j.f3385a = false;
        m3065a(fhVar, this.f2963j, foVar, true);
        if (e == -1) {
            if (this.f2967n) {
                w = m3088w();
            } else {
                w = m3087v();
            }
            view2 = w;
        } else {
            if (this.f2967n) {
                w = m3087v();
            } else {
                w = m3088w();
            }
            view2 = w;
        }
        if (e == -1) {
            w = m3085t();
        } else {
            w = m3086u();
        }
        if (!w.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return w;
    }

    public boolean ct_() {
        return this.f2973t == null && this.f2965l == this.f2968o;
    }
}
