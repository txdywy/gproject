package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0336e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;

public class dd extends LinearLayoutManager {
    public boolean f3362a = false;
    public int f3363b = -1;
    public int[] f3364c;
    public View[] f3365d;
    public final SparseIntArray f3366e = new SparseIntArray();
    public final SparseIntArray f3367f = new SparseIntArray();
    public dg f3368g = new de();
    public final Rect f3369h = new Rect();

    public dd() {
        if (60 != this.f3363b) {
            this.f3362a = true;
            this.f3363b = 60;
            this.f3368g.f3370a.clear();
        }
    }

    public final int mo793a(fh fhVar, fo foVar) {
        if (this.i == 0) {
            return this.f3363b;
        }
        if (foVar.m3705a() <= 0) {
            return 0;
        }
        return m3470a(fhVar, foVar, foVar.m3705a() - 1) + 1;
    }

    public final int mo806b(fh fhVar, fo foVar) {
        if (this.i == 1) {
            return this.f3363b;
        }
        if (foVar.m3705a() <= 0) {
            return 0;
        }
        return m3470a(fhVar, foVar, foVar.m3705a() - 1) + 1;
    }

    public final void mo803a(fh fhVar, fo foVar, View view, C0333b c0333b) {
        boolean z = false;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof df) {
            df dfVar = (df) layoutParams;
            int a = m3470a(fhVar, foVar, dfVar.f3356c.m3266c());
            int i;
            int i2;
            if (this.i == 0) {
                boolean z2;
                i = dfVar.f3372a;
                i2 = dfVar.f3373b;
                if (this.f3363b <= 1 || dfVar.f3373b != this.f3363b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c0333b.m1769a(C0336e.m1786a(i, i2, a, 1, z2));
                return;
            }
            i = dfVar.f3372a;
            i2 = dfVar.f3373b;
            if (this.f3363b > 1 && dfVar.f3373b == this.f3363b) {
                z = true;
            }
            c0333b.m1769a(C0336e.m1786a(a, 1, i, i2, z));
            return;
        }
        super.m3019a(view, c0333b);
    }

    public final void mo739c(fh fhVar, fo foVar) {
        if (foVar.f3471h) {
            int p = m3060p();
            for (int i = 0; i < p; i++) {
                df dfVar = (df) m3051f(i).getLayoutParams();
                int c = dfVar.f3356c.m3266c();
                this.f3366e.put(c, dfVar.f3373b);
                this.f3367f.put(c, dfVar.f3372a);
            }
        }
        super.mo739c(fhVar, foVar);
        this.f3366e.clear();
        this.f3367f.clear();
        if (!foVar.f3471h) {
            this.f3362a = false;
        }
    }

    public final void mo799a(RecyclerView recyclerView, int i, int i2) {
        this.f3368g.f3370a.clear();
    }

    public final void mo798a(RecyclerView recyclerView) {
        this.f3368g.f3370a.clear();
    }

    public final void mo807b(RecyclerView recyclerView, int i, int i2) {
        this.f3368g.f3370a.clear();
    }

    public final void mo808c(RecyclerView recyclerView, int i, int i2) {
        this.f3368g.f3370a.clear();
    }

    public final void mo800a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3368g.f3370a.clear();
    }

    public fa mo724a() {
        if (this.i == 0) {
            return new df(-2, -1);
        }
        return new df(-1, -2);
    }

    public fa mo794a(Context context, AttributeSet attributeSet) {
        return new df(context, attributeSet);
    }

    public fa mo795a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new df((MarginLayoutParams) layoutParams);
        }
        return new df(layoutParams);
    }

    public final boolean mo805a(fa faVar) {
        return faVar instanceof df;
    }

    private final void m3476s() {
        int paddingRight;
        if (this.f2962i == 1) {
            paddingRight = (this.f2957M - getPaddingRight()) - getPaddingLeft();
        } else {
            paddingRight = (this.f2958N - getPaddingBottom()) - getPaddingTop();
        }
        mo811a(paddingRight);
    }

    public final void mo797a(Rect rect, int i, int i2) {
        if (this.f3364c == null) {
            super.mo797a(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.i == 1) {
            paddingTop = ew.m2977a(i2, paddingTop + rect.height(), ai.f1848a.mo395g(this.f2960y));
            paddingRight = ew.m2977a(i, paddingRight + this.f3364c[this.f3364c.length - 1], ai.f1848a.mo394f(this.f2960y));
        } else {
            paddingRight = ew.m2977a(i, paddingRight + rect.width(), ai.f1848a.mo394f(this.f2960y));
            paddingTop = ew.m2977a(i2, paddingTop + this.f3364c[this.f3364c.length - 1], ai.f1848a.mo395g(this.f2960y));
        }
        m3048e(paddingRight, paddingTop);
    }

    final void mo811a(int i) {
        int i2 = 0;
        int[] iArr = this.f3364c;
        int i3 = this.f3363b;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        iArr[0] = 0;
        int i4 = i / i3;
        int i5 = i % i3;
        int i6 = 0;
        for (int i7 = 1; i7 <= i3; i7++) {
            int i8;
            i2 += i5;
            if (i2 <= 0 || i3 - i2 >= i5) {
                i8 = i4;
            } else {
                i8 = i4 + 1;
                i2 -= i3;
            }
            i6 += i8;
            iArr[i7] = i6;
        }
        this.f3364c = iArr;
    }

    final void mo801a(fh fhVar, fo foVar, dj djVar, int i) {
        Object obj = 1;
        super.mo801a(fhVar, foVar, djVar, i);
        m3476s();
        if (foVar.m3705a() > 0 && !foVar.f3471h) {
            if (i != 1) {
                obj = null;
            }
            int b = m3474b(fhVar, foVar, djVar.f3376a);
            if (obj != null) {
                while (b > 0 && djVar.f3376a > 0) {
                    djVar.f3376a--;
                    b = m3474b(fhVar, foVar, djVar.f3376a);
                }
            } else {
                int a = foVar.m3705a() - 1;
                int i2 = djVar.f3376a;
                int i3 = b;
                while (i2 < a) {
                    b = m3474b(fhVar, foVar, i2 + 1);
                    if (b <= i3) {
                        break;
                    }
                    i2++;
                    i3 = b;
                }
                djVar.f3376a = i2;
            }
        }
        m3477t();
    }

    private final void m3477t() {
        if (this.f3365d == null || this.f3365d.length != this.f3363b) {
            this.f3365d = new View[this.f3363b];
        }
    }

    public final int mo723a(int i, fh fhVar, fo foVar) {
        m3476s();
        m3477t();
        return super.mo723a(i, fhVar, foVar);
    }

    public final int mo734b(int i, fh fhVar, fo foVar) {
        m3476s();
        m3477t();
        return super.mo734b(i, fhVar, foVar);
    }

    final View mo796a(fh fhVar, fo foVar, int i, int i2, int i3) {
        int i4;
        View view = null;
        m3122h();
        int b = this.k.mo831b();
        int c = this.k.mo833c();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view2 = null;
        while (i != i2) {
            View view3;
            View f = m3051f(i);
            int a = ew.m2979a(f);
            if (a >= 0 && a < i3 && m3474b(fhVar, foVar, a) == 0) {
                if (((fa) f.getLayoutParams()).f3356c.m3276m()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = f;
                    }
                } else if (this.k.mo829a(f) < c && this.k.mo832b(f) >= b) {
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

    private final int m3470a(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3368g.m3503c(i, this.f3363b);
        }
        int a = fhVar.m3682a(i);
        if (a != -1) {
            return this.f3368g.m3503c(a, this.f3363b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private final int m3474b(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3368g.m3502b(i, this.f3363b);
        }
        int i2 = this.f3367f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = fhVar.m3682a(i);
        if (i2 != -1) {
            return this.f3368g.m3502b(i2, this.f3363b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private final int m3475c(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3368g.mo813a(i);
        }
        int i2 = this.f3366e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = fhVar.m3682a(i);
        if (i2 != -1) {
            return this.f3368g.mo813a(i2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    final void mo802a(fh fhVar, fo foVar, dl dlVar, dk dkVar) {
        boolean z;
        int i;
        View a;
        int h = this.k.mo842h();
        Object obj = h != 1073741824 ? 1 : null;
        int i2 = m3060p() > 0 ? this.f3364c[this.f3363b] : 0;
        if (obj != null) {
            m3476s();
        }
        if (dlVar.f3389e == 1) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.f3363b;
        if (z) {
            i = 0;
        } else {
            i3 = m3474b(fhVar, foVar, dlVar.f3388d) + m3475c(fhVar, foVar, dlVar.f3388d);
            i = 0;
        }
        while (i < this.f3363b && dlVar.m3512a(foVar) && i3 > 0) {
            int i4 = dlVar.f3388d;
            int c = m3475c(fhVar, foVar, i4);
            if (c <= this.f3363b) {
                i3 -= c;
                if (i3 < 0) {
                    break;
                }
                a = dlVar.m3510a(fhVar);
                if (a == null) {
                    break;
                }
                this.f3365d[i] = a;
                i++;
            } else {
                throw new IllegalArgumentException("Item at position " + i4 + " requires " + c + " spans but GridLayoutManager has only " + this.f3363b + " spans.");
            }
        }
        if (i == 0) {
            dkVar.f3382b = true;
            return;
        }
        int a2;
        int i5;
        int i6;
        int i7 = 0;
        mo812c();
        float f = 0.0f;
        m3471a(fhVar, foVar, i, z);
        int i8 = 0;
        while (i8 < i) {
            a = this.f3365d[i8];
            if (dlVar.f3394j == null) {
                if (z) {
                    super.m3017a(a, -1, false);
                } else {
                    super.m3017a(a, 0, false);
                }
            } else if (z) {
                super.m3017a(a, -1, true);
            } else {
                super.m3017a(a, 0, true);
            }
            df dfVar = (df) a.getLayoutParams();
            c = ew.m2978a(this.f3364c[dfVar.f3372a + dfVar.f3373b] - this.f3364c[dfVar.f3372a], h, 0, this.i == 0 ? dfVar.height : dfVar.width, false);
            a2 = ew.m2978a(this.k.mo837e(), this.k.mo841g(), 0, this.i == 1 ? dfVar.height : dfVar.width, true);
            if (this.i == 1) {
                m3472a(a, c, a2, dfVar.height == -1, false);
            } else {
                m3472a(a, a2, c, dfVar.width == -1, false);
            }
            i3 = this.k.mo838e(a);
            if (i3 <= i7) {
                i3 = i7;
            }
            float f2 = (((float) this.k.mo840f(a)) * 1.0f) / ((float) dfVar.f3373b);
            if (f2 <= f) {
                f2 = f;
            }
            i8++;
            f = f2;
            i7 = i3;
        }
        if (obj != null) {
            mo811a(Math.max(Math.round(((float) this.f3363b) * f), i2));
            i5 = 0;
            i6 = 0;
            while (i6 < i) {
                a = this.f3365d[i6];
                df dfVar2 = (df) a.getLayoutParams();
                c = ew.m2978a(this.f3364c[dfVar2.f3372a + dfVar2.f3373b] - this.f3364c[dfVar2.f3372a], (int) MemoryMappedFileBuffer.DEFAULT_SIZE, 0, this.i == 0 ? dfVar2.height : dfVar2.width, false);
                a2 = ew.m2978a(this.k.mo837e(), this.k.mo841g(), 0, this.i == 1 ? dfVar2.height : dfVar2.width, true);
                if (this.i == 1) {
                    m3472a(a, c, a2, false, true);
                } else {
                    m3472a(a, a2, c, false, true);
                }
                i3 = this.k.mo838e(a);
                if (i3 <= i5) {
                    i3 = i5;
                }
                i6++;
                i5 = i3;
            }
        } else {
            i5 = i7;
        }
        a2 = MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE);
        for (i6 = 0; i6 < i; i6++) {
            a = this.f3365d[i6];
            if (this.k.mo838e(a) != i5) {
                dfVar2 = (df) a.getLayoutParams();
                c = ew.m2978a(this.f3364c[dfVar2.f3372a + dfVar2.f3373b] - this.f3364c[dfVar2.f3372a], (int) MemoryMappedFileBuffer.DEFAULT_SIZE, 0, this.i == 0 ? dfVar2.height : dfVar2.width, false);
                if (this.i == 1) {
                    m3472a(a, c, a2, true, true);
                } else {
                    m3472a(a, a2, c, true, true);
                }
            }
        }
        dkVar.f3381a = i5;
        a2 = 0;
        c = 0;
        i4 = 0;
        i3 = 0;
        if (this.i == 1) {
            if (dlVar.f3390f == -1) {
                i3 = dlVar.f3386b;
                i4 = i3 - i5;
            } else {
                i4 = dlVar.f3386b;
                i3 = i4 + i5;
            }
        } else if (dlVar.f3390f == -1) {
            c = dlVar.f3386b;
            a2 = c - i5;
        } else {
            a2 = dlVar.f3386b;
            c = a2 + i5;
        }
        int i9 = a2;
        a2 = c;
        c = i4;
        i4 = i3;
        for (int i10 = 0; i10 < i; i10++) {
            View view = this.f3365d[i10];
            dfVar2 = (df) view.getLayoutParams();
            if (this.i != 1) {
                c = this.f3364c[dfVar2.f3372a] + getPaddingTop();
                i4 = this.k.mo840f(view) + c;
            } else if (m3121g()) {
                a2 = (getPaddingLeft() + this.f3364c[dfVar2.f3372a + dfVar2.f3373b]) + 0;
                i9 = a2 - this.k.mo840f(view);
            } else {
                i9 = (getPaddingLeft() + this.f3364c[dfVar2.f3372a]) + 0;
                a2 = this.k.mo840f(view) + i9;
            }
            ew.m2981a(view, dfVar2.leftMargin + i9, dfVar2.topMargin + c, a2 - dfVar2.rightMargin, i4 - dfVar2.bottomMargin);
            if (dfVar2.f3356c.m3276m() || dfVar2.f3356c.m3282s()) {
                dkVar.f3383c = true;
            }
            dkVar.f3384d |= view.isFocusable();
        }
        Arrays.fill(this.f3365d, null);
    }

    protected int mo812c() {
        return 0;
    }

    private final void m3472a(View view, int i, int i2, boolean z, boolean z2) {
        boolean a;
        m3034b(view, this.f3369h);
        fa faVar = (fa) view.getLayoutParams();
        if (z || this.i == 1) {
            i = m3473b(i, faVar.leftMargin + this.f3369h.left, faVar.rightMargin + this.f3369h.right);
        }
        if (z || this.i == 0) {
            i2 = m3473b(i2, faVar.topMargin + this.f3369h.top, faVar.bottomMargin + this.f3369h.bottom);
        }
        if (z2) {
            a = m3024a(view, i, i2, faVar);
        } else {
            a = m3035b(view, i, i2, faVar);
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    private static int m3473b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    private final void m3471a(fh fhVar, fo foVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (z) {
            i2 = 1;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
            i = -1;
        }
        if (this.i == 1 && m3121g()) {
            i4 = this.f3363b - 1;
            i5 = -1;
        } else {
            i4 = 0;
            i5 = 1;
        }
        int i6 = i4;
        for (i4 = i3; i4 != i; i4 += i2) {
            View view = this.f3365d[i4];
            df dfVar = (df) view.getLayoutParams();
            dfVar.f3373b = m3475c(fhVar, foVar, ew.m2979a(view));
            if (i5 != -1 || dfVar.f3373b <= 1) {
                dfVar.f3372a = i6;
            } else {
                dfVar.f3372a = i6 - (dfVar.f3373b - 1);
            }
            i6 += dfVar.f3373b * i5;
        }
    }

    public final View mo725a(View view, int i, fh fhVar, fo foVar) {
        View b = m3029b(view);
        if (b == null) {
            return null;
        }
        df dfVar = (df) b.getLayoutParams();
        int i2 = dfVar.f3372a;
        int i3 = dfVar.f3372a + dfVar.f3373b;
        if (super.mo725a(view, i, fhVar, foVar) == null) {
            return null;
        }
        int p;
        int i4;
        int i5;
        if ((m3115e(i) == 1) != this.n) {
            p = m3060p() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            p = 0;
            i4 = 1;
            i5 = m3060p();
        }
        Object obj = (this.i == 1 && m3121g()) ? 1 : null;
        View view2 = null;
        int i6 = -1;
        int i7 = 0;
        int i8 = p;
        while (i8 != i5) {
            View f = m3051f(i8);
            if (f == b) {
                break;
            }
            View view3;
            if (f.isFocusable()) {
                dfVar = (df) f.getLayoutParams();
                int i9 = dfVar.f3372a;
                int i10 = dfVar.f3372a + dfVar.f3373b;
                if (i9 == i2 && i10 == i3) {
                    return f;
                }
                Object obj2 = null;
                if (view2 == null) {
                    obj2 = 1;
                } else {
                    int min = Math.min(i10, i3) - Math.max(i9, i2);
                    if (min > i7) {
                        obj2 = 1;
                    } else if (min == i7) {
                        if (obj == (i9 > i6 ? 1 : null)) {
                            obj2 = 1;
                        }
                    }
                }
                if (obj2 != null) {
                    i7 = dfVar.f3372a;
                    p = Math.min(i10, i3) - Math.max(i9, i2);
                    view3 = f;
                    i8 += i4;
                    view2 = view3;
                    i6 = i7;
                    i7 = p;
                }
            }
            p = i7;
            i7 = i6;
            view3 = view2;
            i8 += i4;
            view2 = view3;
            i6 = i7;
            i7 = p;
        }
        return view2;
    }

    public final boolean ct_() {
        return this.t == null && !this.f3362a;
    }
}
