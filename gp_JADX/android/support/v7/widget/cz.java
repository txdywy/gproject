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

public final class cz extends LinearLayoutManager {
    public boolean f3346a = false;
    public int f3347b = -1;
    public int[] f3348c;
    public View[] f3349d;
    public final SparseIntArray f3350e = new SparseIntArray();
    public final SparseIntArray f3351f = new SparseIntArray();
    public dc f3352g = new da();
    public final Rect f3353h = new Rect();

    public cz() {
        if (2 != this.f3347b) {
            this.f3346a = true;
            this.f3347b = 2;
            this.f3352g.f3354a.clear();
            m3056l();
        }
    }

    public final int mo793a(fh fhVar, fo foVar) {
        if (this.i == 0) {
            return this.f3347b;
        }
        if (foVar.m3705a() <= 0) {
            return 0;
        }
        return m3432a(fhVar, foVar, foVar.m3705a() - 1) + 1;
    }

    public final int mo806b(fh fhVar, fo foVar) {
        if (this.i == 1) {
            return this.f3347b;
        }
        if (foVar.m3705a() <= 0) {
            return 0;
        }
        return m3432a(fhVar, foVar, foVar.m3705a() - 1) + 1;
    }

    public final void mo803a(fh fhVar, fo foVar, View view, C0333b c0333b) {
        boolean z = false;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof db) {
            db dbVar = (db) layoutParams;
            int a = m3432a(fhVar, foVar, dbVar.f3356c.m3266c());
            int i;
            int i2;
            if (this.i == 0) {
                boolean z2;
                i = dbVar.f3360a;
                i2 = dbVar.f3361b;
                if (this.f3347b <= 1 || dbVar.f3361b != this.f3347b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c0333b.m1769a(C0336e.m1786a(i, i2, a, 1, z2));
                return;
            }
            i = dbVar.f3360a;
            i2 = dbVar.f3361b;
            if (this.f3347b > 1 && dbVar.f3361b == this.f3347b) {
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
                db dbVar = (db) m3051f(i).getLayoutParams();
                int c = dbVar.f3356c.m3266c();
                this.f3350e.put(c, dbVar.f3361b);
                this.f3351f.put(c, dbVar.f3360a);
            }
        }
        super.mo739c(fhVar, foVar);
        this.f3350e.clear();
        this.f3351f.clear();
    }

    public final void mo731a(fo foVar) {
        super.mo731a(foVar);
        this.f3346a = false;
    }

    public final void mo799a(RecyclerView recyclerView, int i, int i2) {
        this.f3352g.f3354a.clear();
    }

    public final void mo798a(RecyclerView recyclerView) {
        this.f3352g.f3354a.clear();
    }

    public final void mo807b(RecyclerView recyclerView, int i, int i2) {
        this.f3352g.f3354a.clear();
    }

    public final void mo808c(RecyclerView recyclerView, int i, int i2) {
        this.f3352g.f3354a.clear();
    }

    public final void mo800a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3352g.f3354a.clear();
    }

    public final fa mo724a() {
        if (this.i == 0) {
            return new db(-2, -1);
        }
        return new db(-1, -2);
    }

    public final fa mo794a(Context context, AttributeSet attributeSet) {
        return new db(context, attributeSet);
    }

    public final fa mo795a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new db((MarginLayoutParams) layoutParams);
        }
        return new db(layoutParams);
    }

    public final boolean mo805a(fa faVar) {
        return faVar instanceof db;
    }

    private final void m3439c() {
        int paddingRight;
        if (this.f2962i == 1) {
            paddingRight = (this.f2957M - getPaddingRight()) - getPaddingLeft();
        } else {
            paddingRight = (this.f2958N - getPaddingBottom()) - getPaddingTop();
        }
        m3433a(paddingRight);
    }

    public final void mo797a(Rect rect, int i, int i2) {
        if (this.f3348c == null) {
            super.mo797a(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.i == 1) {
            paddingTop = ew.m2977a(i2, paddingTop + rect.height(), ai.f1848a.mo395g(this.f2960y));
            paddingRight = ew.m2977a(i, paddingRight + this.f3348c[this.f3348c.length - 1], ai.f1848a.mo394f(this.f2960y));
        } else {
            paddingRight = ew.m2977a(i, paddingRight + rect.width(), ai.f1848a.mo394f(this.f2960y));
            paddingTop = ew.m2977a(i2, paddingTop + this.f3348c[this.f3348c.length - 1], ai.f1848a.mo395g(this.f2960y));
        }
        m3048e(paddingRight, paddingTop);
    }

    private final void m3433a(int i) {
        int i2 = 0;
        int[] iArr = this.f3348c;
        int i3 = this.f3347b;
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
        this.f3348c = iArr;
    }

    private final int m3440f(int i, int i2) {
        if (this.i == 1 && m3121g()) {
            return this.f3348c[this.f3347b - i] - this.f3348c[(this.f3347b - i) - i2];
        }
        return this.f3348c[i + i2] - this.f3348c[i];
    }

    final void mo801a(fh fhVar, fo foVar, dj djVar, int i) {
        Object obj = 1;
        super.mo801a(fhVar, foVar, djVar, i);
        m3439c();
        if (foVar.m3705a() > 0 && !foVar.f3471h) {
            if (i != 1) {
                obj = null;
            }
            int b = m3436b(fhVar, foVar, djVar.f3376a);
            if (obj != null) {
                while (b > 0 && djVar.f3376a > 0) {
                    djVar.f3376a--;
                    b = m3436b(fhVar, foVar, djVar.f3376a);
                }
            } else {
                int a = foVar.m3705a() - 1;
                int i2 = djVar.f3376a;
                int i3 = b;
                while (i2 < a) {
                    b = m3436b(fhVar, foVar, i2 + 1);
                    if (b <= i3) {
                        break;
                    }
                    i2++;
                    i3 = b;
                }
                djVar.f3376a = i2;
            }
        }
        m3441s();
    }

    private final void m3441s() {
        if (this.f3349d == null || this.f3349d.length != this.f3347b) {
            this.f3349d = new View[this.f3347b];
        }
    }

    public final int mo723a(int i, fh fhVar, fo foVar) {
        m3439c();
        m3441s();
        return super.mo723a(i, fhVar, foVar);
    }

    public final int mo734b(int i, fh fhVar, fo foVar) {
        m3439c();
        m3441s();
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
            if (a >= 0 && a < i3 && m3436b(fhVar, foVar, a) == 0) {
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

    private final int m3432a(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3352g.m3467c(i, this.f3347b);
        }
        int a = fhVar.m3682a(i);
        if (a != -1) {
            return this.f3352g.m3467c(a, this.f3347b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private final int m3436b(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3352g.m3466b(i, this.f3347b);
        }
        int i2 = this.f3351f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = fhVar.m3682a(i);
        if (i2 != -1) {
            return this.f3352g.m3466b(i2, this.f3347b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private final int m3438c(fh fhVar, fo foVar, int i) {
        if (!foVar.f3471h) {
            return this.f3352g.mo809a(i);
        }
        int i2 = this.f3350e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = fhVar.m3682a(i);
        if (i2 != -1) {
            return this.f3352g.mo809a(i2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    final void mo804a(fo foVar, dl dlVar, ez ezVar) {
        int i = this.f3347b;
        for (int i2 = 0; i2 < this.f3347b && dlVar.m3512a(foVar) && i > 0; i2++) {
            int i3 = dlVar.f3388d;
            ezVar.mo792a(i3, Math.max(0, dlVar.f3391g));
            i -= this.f3352g.mo809a(i3);
            dlVar.f3388d += dlVar.f3389e;
        }
    }

    final void mo802a(fh fhVar, fo foVar, dl dlVar, dk dkVar) {
        boolean z;
        int h = this.k.mo842h();
        Object obj = h != MemoryMappedFileBuffer.DEFAULT_SIZE ? 1 : null;
        int i = m3060p() > 0 ? this.f3348c[this.f3347b] : 0;
        if (obj != null) {
            m3439c();
        }
        if (dlVar.f3389e == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        int i3 = this.f3347b;
        if (!z) {
            i3 = m3436b(fhVar, foVar, dlVar.f3388d) + m3438c(fhVar, foVar, dlVar.f3388d);
        }
        while (i2 < this.f3347b && dlVar.m3512a(foVar) && i3 > 0) {
            int i4 = dlVar.f3388d;
            int c = m3438c(fhVar, foVar, i4);
            if (c <= this.f3347b) {
                i3 -= c;
                if (i3 < 0) {
                    break;
                }
                View a = dlVar.m3510a(fhVar);
                if (a == null) {
                    break;
                }
                this.f3349d[i2] = a;
                i2++;
            } else {
                throw new IllegalArgumentException("Item at position " + i4 + " requires " + c + " spans but GridLayoutManager has only " + this.f3347b + " spans.");
            }
        }
        if (i2 == 0) {
            dkVar.f3382b = true;
            return;
        }
        int i5;
        int i6;
        db dbVar;
        i4 = 0;
        float f = 0.0f;
        m3434a(fhVar, foVar, i2, z);
        int i7 = 0;
        while (i7 < i2) {
            View view = this.f3349d[i7];
            if (dlVar.f3394j == null) {
                if (z) {
                    super.m3017a(view, -1, false);
                } else {
                    super.m3017a(view, 0, false);
                }
            } else if (z) {
                super.m3017a(view, -1, true);
            } else {
                super.m3017a(view, 0, true);
            }
            m3034b(view, this.f3353h);
            m3437b(view, h, false);
            i3 = this.k.mo838e(view);
            if (i3 > i4) {
                i4 = i3;
            }
            float f2 = (((float) this.k.mo840f(view)) * 1.0f) / ((float) ((db) view.getLayoutParams()).f3361b);
            if (f2 <= f) {
                f2 = f;
            }
            i7++;
            f = f2;
        }
        if (obj != null) {
            m3433a(Math.max(Math.round(((float) this.f3347b) * f), i));
            i5 = 0;
            i6 = 0;
            while (i6 < i2) {
                View view2 = this.f3349d[i6];
                m3437b(view2, (int) MemoryMappedFileBuffer.DEFAULT_SIZE, true);
                i3 = this.k.mo838e(view2);
                if (i3 <= i5) {
                    i3 = i5;
                }
                i6++;
                i5 = i3;
            }
        } else {
            i5 = i4;
        }
        for (i4 = 0; i4 < i2; i4++) {
            View view3 = this.f3349d[i4];
            if (this.k.mo838e(view3) != i5) {
                dbVar = (db) view3.getLayoutParams();
                Rect rect = dbVar.d;
                i7 = ((rect.top + rect.bottom) + dbVar.topMargin) + dbVar.bottomMargin;
                i6 = ((rect.right + rect.left) + dbVar.leftMargin) + dbVar.rightMargin;
                i = m3440f(dbVar.f3360a, dbVar.f3361b);
                if (this.i == 1) {
                    i6 = ew.m2978a(i, (int) MemoryMappedFileBuffer.DEFAULT_SIZE, i6, dbVar.width, false);
                    i3 = MeasureSpec.makeMeasureSpec(i5 - i7, MemoryMappedFileBuffer.DEFAULT_SIZE);
                } else {
                    i6 = MeasureSpec.makeMeasureSpec(i5 - i6, MemoryMappedFileBuffer.DEFAULT_SIZE);
                    i3 = ew.m2978a(i, (int) MemoryMappedFileBuffer.DEFAULT_SIZE, i7, dbVar.height, false);
                }
                m3435a(view3, i6, i3, true);
            }
        }
        dkVar.f3381a = i5;
        i3 = 0;
        if (this.i == 1) {
            if (dlVar.f3390f == -1) {
                i3 = dlVar.f3386b;
                i5 = i3 - i5;
                i6 = 0;
                i4 = 0;
            } else {
                i6 = dlVar.f3386b;
                i3 = i6 + i5;
                i5 = i6;
                i6 = 0;
                i4 = 0;
            }
        } else if (dlVar.f3390f == -1) {
            i4 = dlVar.f3386b;
            i6 = i4;
            i4 -= i5;
            i5 = 0;
        } else {
            i4 = dlVar.f3386b;
            i6 = i5 + i4;
            i5 = 0;
        }
        c = i4;
        i4 = i6;
        i6 = i5;
        i5 = i3;
        for (i7 = 0; i7 < i2; i7++) {
            View view4 = this.f3349d[i7];
            dbVar = (db) view4.getLayoutParams();
            if (this.i != 1) {
                i6 = this.f3348c[dbVar.f3360a] + getPaddingTop();
                i5 = this.k.mo840f(view4) + i6;
            } else if (m3121g()) {
                i4 = getPaddingLeft() + this.f3348c[this.f3347b - dbVar.f3360a];
                c = i4 - this.k.mo840f(view4);
            } else {
                c = this.f3348c[dbVar.f3360a] + getPaddingLeft();
                i4 = this.k.mo840f(view4) + c;
            }
            ew.m2982b(view4, c, i6, i4, i5);
            if (dbVar.f3356c.m3276m() || dbVar.f3356c.m3282s()) {
                dkVar.f3383c = true;
            }
            dkVar.f3384d |= view4.hasFocusable();
        }
        Arrays.fill(this.f3349d, null);
    }

    private final void m3437b(View view, int i, boolean z) {
        int a;
        db dbVar = (db) view.getLayoutParams();
        Rect rect = dbVar.d;
        int i2 = ((rect.top + rect.bottom) + dbVar.topMargin) + dbVar.bottomMargin;
        int i3 = dbVar.rightMargin + ((rect.right + rect.left) + dbVar.leftMargin);
        int f = m3440f(dbVar.f3360a, dbVar.f3361b);
        if (this.i == 1) {
            f = ew.m2978a(f, i, i3, dbVar.width, false);
            a = ew.m2978a(this.k.mo837e(), this.f2956L, i2, dbVar.height, true);
        } else {
            int a2 = ew.m2978a(f, i, i2, dbVar.height, false);
            f = ew.m2978a(this.k.mo837e(), this.f2955K, i3, dbVar.width, true);
            a = a2;
        }
        m3435a(view, f, a, z);
    }

    private final void m3435a(View view, int i, int i2, boolean z) {
        boolean a;
        fa faVar = (fa) view.getLayoutParams();
        if (z) {
            a = m3024a(view, i, i2, faVar);
        } else {
            a = m3035b(view, i, i2, faVar);
        }
        if (a) {
            view.measure(i, i2);
        }
    }

    private final void m3434a(fh fhVar, fo foVar, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 1;
            i3 = 0;
        } else {
            i2 = i - 1;
            i = -1;
            i3 = i2;
            i2 = -1;
        }
        int i4 = 0;
        for (int i5 = i3; i5 != i; i5 += i2) {
            View view = this.f3349d[i5];
            db dbVar = (db) view.getLayoutParams();
            dbVar.f3361b = m3438c(fhVar, foVar, ew.m2979a(view));
            dbVar.f3360a = i4;
            i4 += dbVar.f3361b;
        }
    }

    public final View mo725a(View view, int i, fh fhVar, fo foVar) {
        View b = m3029b(view);
        if (b == null) {
            return null;
        }
        db dbVar = (db) b.getLayoutParams();
        int i2 = dbVar.f3360a;
        int i3 = dbVar.f3360a + dbVar.f3361b;
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
        View view3 = null;
        int i8 = -1;
        int i9 = 0;
        int a = m3432a(fhVar, foVar, p);
        int i10 = p;
        while (i10 != i5) {
            p = m3432a(fhVar, foVar, i10);
            View f = m3051f(i10);
            if (f == b) {
                break;
            }
            View view4;
            int min;
            View view5;
            int i11;
            if (!f.hasFocusable() || p == a) {
                dbVar = (db) f.getLayoutParams();
                int i12 = dbVar.f3360a;
                int i13 = dbVar.f3360a + dbVar.f3361b;
                if (f.hasFocusable() && i12 == i2 && i13 == i3) {
                    return f;
                }
                Object obj2 = null;
                if (!(f.hasFocusable() && view2 == null) && (f.hasFocusable() || view3 != null)) {
                    int min2 = Math.min(i13, i3) - Math.max(i12, i2);
                    if (f.hasFocusable()) {
                        if (min2 > i7) {
                            obj2 = 1;
                        } else if (min2 == i7) {
                            if (obj == (i12 > i6 ? 1 : null)) {
                                obj2 = 1;
                            }
                        }
                    } else if (view2 == null) {
                        Object obj3 = (this.f2946B.m3850a(f) && this.f2947C.m3850a(f)) ? 1 : null;
                        if ((obj3 == null ? 1 : null) != null) {
                            if (min2 > i9) {
                                obj2 = 1;
                            } else if (min2 == i9) {
                                if (obj == (i12 > i8 ? 1 : null)) {
                                    obj2 = 1;
                                }
                            }
                        }
                    }
                } else {
                    obj2 = 1;
                }
                if (obj2 != null) {
                    if (f.hasFocusable()) {
                        i7 = dbVar.f3360a;
                        int i14 = i9;
                        i9 = i8;
                        view4 = view3;
                        min = Math.min(i13, i3) - Math.max(i12, i2);
                        p = i14;
                        int i15 = i7;
                        view5 = f;
                        i11 = i15;
                    } else {
                        i9 = dbVar.f3360a;
                        p = Math.min(i13, i3) - Math.max(i12, i2);
                        view4 = f;
                        min = i7;
                        i11 = i6;
                        view5 = view2;
                    }
                }
                p = i9;
                i11 = i6;
                i9 = i8;
                view4 = view3;
                min = i7;
                view5 = view2;
            } else {
                if (view2 != null) {
                    break;
                }
                p = i9;
                i11 = i6;
                i9 = i8;
                view4 = view3;
                min = i7;
                view5 = view2;
            }
            i10 += i4;
            view2 = view5;
            i7 = min;
            i6 = i11;
            view3 = view4;
            i8 = i9;
            i9 = p;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final boolean ct_() {
        return this.t == null && !this.f3346a;
    }
}
