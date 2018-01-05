package android.support.v7.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0336e;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public abstract class ew {
    public final hy f2945A = new ey(this);
    public hw f2946B = new hw(this.f2961z);
    public hw f2947C = new hw(this.f2945A);
    public fl f2948D;
    public boolean f2949E = false;
    public boolean f2950F = false;
    public boolean f2951G = true;
    public boolean f2952H = true;
    public int f2953I;
    public boolean f2954J;
    public int f2955K;
    public int f2956L;
    public int f2957M;
    public int f2958N;
    public br f2959x;
    public RecyclerView f2960y;
    public final hy f2961z = new ex(this);

    public abstract fa mo724a();

    final void m3031b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2960y = null;
            this.f2959x = null;
            this.f2957M = 0;
            this.f2958N = 0;
        } else {
            this.f2960y = recyclerView;
            this.f2959x = recyclerView.f520n;
            this.f2957M = recyclerView.getWidth();
            this.f2958N = recyclerView.getHeight();
        }
        this.f2955K = MemoryMappedFileBuffer.DEFAULT_SIZE;
        this.f2956L = MemoryMappedFileBuffer.DEFAULT_SIZE;
    }

    final void m3030b(int i, int i2) {
        this.f2957M = MeasureSpec.getSize(i);
        this.f2955K = MeasureSpec.getMode(i);
        if (this.f2955K == 0 && !RecyclerView.f487d) {
            this.f2957M = 0;
        }
        this.f2958N = MeasureSpec.getSize(i2);
        this.f2956L = MeasureSpec.getMode(i2);
        if (this.f2956L == 0 && !RecyclerView.f487d) {
            this.f2958N = 0;
        }
    }

    final void m3037c(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int p = m3060p();
        if (p == 0) {
            this.f2960y.m297d(i, i2);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < p; i7++) {
            View f = m3051f(i7);
            Rect rect = this.f2960y.f524r;
            RecyclerView.m260b(f, rect);
            if (rect.left < i6) {
                i6 = rect.left;
            }
            if (rect.right > i5) {
                i5 = rect.right;
            }
            if (rect.top < i3) {
                i3 = rect.top;
            }
            if (rect.bottom > i4) {
                i4 = rect.bottom;
            }
        }
        this.f2960y.f524r.set(i6, i3, i5, i4);
        mo797a(this.f2960y.f524r, i, i2);
    }

    public void mo797a(Rect rect, int i, int i2) {
        int height = (rect.height() + getPaddingTop()) + getPaddingBottom();
        m3048e(m2977a(i, (rect.width() + getPaddingLeft()) + getPaddingRight(), ai.f1848a.mo394f(this.f2960y)), m2977a(i2, height, ai.f1848a.mo395g(this.f2960y)));
    }

    public final void m3056l() {
        if (this.f2960y != null) {
            this.f2960y.requestLayout();
        }
    }

    public static int m2977a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(i2, i3));
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    public void mo733a(String str) {
        if (this.f2960y != null) {
            this.f2960y.m282a(str);
        }
    }

    public boolean ct_() {
        return false;
    }

    public final void m3057m() {
        if (this.f2952H) {
            this.f2952H = false;
            this.f2953I = 0;
            if (this.f2960y != null) {
                this.f2960y.f517k.m3688b();
            }
        }
    }

    public void mo726a(int i, int i2, fo foVar, ez ezVar) {
    }

    public void mo727a(int i, ez ezVar) {
    }

    public void mo4462n() {
    }

    public void mo730a(RecyclerView recyclerView, fh fhVar) {
    }

    public void mo739c(fh fhVar, fo foVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void mo731a(fo foVar) {
    }

    public boolean mo805a(fa faVar) {
        return faVar != null;
    }

    public fa mo795a(LayoutParams layoutParams) {
        if (layoutParams instanceof fa) {
            return new fa((fa) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new fa((MarginLayoutParams) layoutParams);
        }
        return new fa(layoutParams);
    }

    public fa mo794a(Context context, AttributeSet attributeSet) {
        return new fa(context, attributeSet);
    }

    public int mo723a(int i, fh fhVar, fo foVar) {
        return 0;
    }

    public int mo734b(int i, fh fhVar, fo foVar) {
        return 0;
    }

    public boolean mo745e() {
        return false;
    }

    public boolean mo747f() {
        return false;
    }

    public void mo743d(int i) {
    }

    public void mo729a(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final void m3014a(fl flVar) {
        if (!(this.f2948D == null || flVar == this.f2948D || !this.f2948D.f3400k)) {
            this.f2948D.m3517d();
        }
        this.f2948D = flVar;
        fl flVar2 = this.f2948D;
        flVar2.f3397h = this.f2960y;
        flVar2.f3398i = this;
        if (flVar2.f3396g == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        flVar2.f3397h.ao.f3464a = flVar2.f3396g;
        flVar2.f3400k = true;
        flVar2.f3399j = true;
        flVar2.f3401l = flVar2.f3397h.f528v.mo736b(flVar2.f3396g);
        flVar2.mo815a();
        flVar2.f3397h.al.m3711a();
    }

    public final int m3059o() {
        return ai.f1848a.mo400k(this.f2960y);
    }

    public final void m3017a(View view, int i, boolean z) {
        fr c = RecyclerView.m261c(view);
        if (z || c.m3276m()) {
            this.f2960y.f521o.m3861b(c);
        } else {
            this.f2960y.f521o.m3863c(c);
        }
        fa faVar = (fa) view.getLayoutParams();
        if (c.m3270g() || c.m3268e()) {
            if (c.m3268e()) {
                c.m3269f();
            } else {
                c.m3271h();
            }
            this.f2959x.m3329a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f2960y) {
            int c2 = this.f2959x.m3334c(view);
            if (i == -1) {
                i = this.f2959x.m3326a();
            }
            if (c2 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2960y.indexOfChild(view) + this.f2960y.m276a());
            } else if (c2 != i) {
                ew ewVar = this.f2960y.f528v;
                View f = ewVar.m3051f(c2);
                if (f == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c2 + ewVar.f2960y.toString());
                }
                ewVar.mo738c(c2);
                fa faVar2 = (fa) f.getLayoutParams();
                fr c3 = RecyclerView.m261c(f);
                if (c3.m3276m()) {
                    ewVar.f2960y.f521o.m3861b(c3);
                } else {
                    ewVar.f2960y.f521o.m3863c(c3);
                }
                ewVar.f2959x.m3329a(f, i, faVar2, c3.m3276m());
            }
        } else {
            this.f2959x.m3330a(view, i, false);
            faVar.f3358e = true;
            if (this.f2948D != null && this.f2948D.f3400k) {
                fl flVar = this.f2948D;
                if (RecyclerView.m264e(view) == flVar.f3396g) {
                    flVar.f3401l = view;
                }
            }
        }
        if (faVar.f3359f) {
            c.f3211a.invalidate();
            faVar.f3359f = false;
        }
    }

    private final void mo811a(int i) {
        if (m3051f(i) != null) {
            br brVar = this.f2959x;
            int a = brVar.m3327a(i);
            View b = brVar.f3229a.mo853b(a);
            if (b != null) {
                if (brVar.f3230b.m3343d(a)) {
                    brVar.m3333b(b);
                }
                brVar.f3229a.mo849a(a);
            }
        }
    }

    public static int m2979a(View view) {
        return ((fa) view.getLayoutParams()).f3356c.m3266c();
    }

    public final View m3029b(View view) {
        if (this.f2960y == null) {
            return null;
        }
        View b = this.f2960y.m287b(view);
        if (b == null || this.f2959x.m3337d(b)) {
            return null;
        }
        return b;
    }

    public View mo736b(int i) {
        int p = m3060p();
        for (int i2 = 0; i2 < p; i2++) {
            View f = m3051f(i2);
            fr c = RecyclerView.m261c(f);
            if (c != null && c.m3266c() == i && !c.m3265b() && (this.f2960y.ao.f3471h || !c.m3276m())) {
                return f;
            }
        }
        return null;
    }

    private final void mo738c(int i) {
        m3051f(i);
        this.f2959x.m3336d(i);
    }

    public final void m3001a(int i, fh fhVar) {
        View f = m3051f(i);
        mo811a(i);
        fhVar.m3687a(f);
    }

    public final int m3060p() {
        return this.f2959x != null ? this.f2959x.m3326a() : 0;
    }

    public final View m3051f(int i) {
        return this.f2959x != null ? this.f2959x.m3332b(i) : null;
    }

    public int getPaddingLeft() {
        return this.f2960y != null ? this.f2960y.getPaddingLeft() : 0;
    }

    public int getPaddingTop() {
        return this.f2960y != null ? this.f2960y.getPaddingTop() : 0;
    }

    public int getPaddingRight() {
        return this.f2960y != null ? this.f2960y.getPaddingRight() : 0;
    }

    public int getPaddingBottom() {
        return this.f2960y != null ? this.f2960y.getPaddingBottom() : 0;
    }

    public int getPaddingStart() {
        if (this.f2960y == null) {
            return 0;
        }
        return ai.f1848a.mo401l(this.f2960y);
    }

    public int getPaddingEnd() {
        if (this.f2960y == null) {
            return 0;
        }
        return ai.f1848a.mo402m(this.f2960y);
    }

    public final View m3061q() {
        if (this.f2960y == null) {
            return null;
        }
        View focusedChild = this.f2960y.getFocusedChild();
        if (focusedChild == null || this.f2959x.m3337d(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final int m3062r() {
        em adapter = this.f2960y != null ? this.f2960y.getAdapter() : null;
        return adapter != null ? adapter.mo1039a() : 0;
    }

    public final void m3054g(int i) {
        if (this.f2960y != null) {
            RecyclerView recyclerView = this.f2960y;
            int a = recyclerView.f520n.m3326a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.f520n.m3332b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void m3010a(fh fhVar) {
        for (int p = m3060p() - 1; p >= 0; p--) {
            m3011a(fhVar, p, m3051f(p));
        }
    }

    public final void m3011a(fh fhVar, int i, View view) {
        fr c = RecyclerView.m261c(view);
        if (!c.m3265b()) {
            if (!c.m3273j() || c.m3276m() || this.f2960y.f527u.f3434b) {
                mo738c(i);
                fhVar.m3693c(view);
                this.f2960y.f521o.m3863c(c);
                return;
            }
            mo811a(i);
            fhVar.m3685a(c);
        }
    }

    final void m3033b(fh fhVar) {
        int size = fhVar.f3447a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((fr) fhVar.f3447a.get(i)).f3211a;
            fr c = RecyclerView.m261c(view);
            if (!c.m3265b()) {
                c.m3262a(false);
                if (c.m3277n()) {
                    this.f2960y.removeDetachedView(view, false);
                }
                if (this.f2960y.f512T != null) {
                    this.f2960y.f512T.endAnimation(c);
                }
                c.m3262a(true);
                fhVar.m3691b(view);
            }
        }
        fhVar.f3447a.clear();
        if (fhVar.f3448b != null) {
            fhVar.f3448b.clear();
        }
        if (size > 0) {
            this.f2960y.invalidate();
        }
    }

    final boolean m3024a(View view, int i, int i2, fa faVar) {
        return (this.f2951G && mo4446b(view.getMeasuredWidth(), i, faVar.width) && mo4446b(view.getMeasuredHeight(), i2, faVar.height)) ? false : true;
    }

    final boolean m3035b(View view, int i, int i2, fa faVar) {
        return (!view.isLayoutRequested() && this.f2951G && mo4446b(view.getWidth(), i, faVar.width) && mo4446b(view.getHeight(), i2, faVar.height)) ? false : true;
    }

    private static boolean mo4446b(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size >= i) {
                    return true;
                }
                return false;
            case 0:
                return true;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                if (size == i) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public void mo2969a(View view, int i, int i2) {
        fa faVar = (fa) view.getLayoutParams();
        Rect f = this.f2960y.m301f(view);
        int i3 = (f.left + f.right) + i;
        int i4 = (f.bottom + f.top) + i2;
        i3 = m2978a(this.f2957M, this.f2955K, i3 + (((getPaddingLeft() + getPaddingRight()) + faVar.leftMargin) + faVar.rightMargin), faVar.width, mo745e());
        i4 = m2978a(this.f2958N, this.f2956L, i4 + (((getPaddingTop() + getPaddingBottom()) + faVar.topMargin) + faVar.bottomMargin), faVar.height, mo747f());
        if (m3035b(view, i3, i4, faVar)) {
            view.measure(i3, i4);
        }
    }

    public static int m2978a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                max = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                        i5 = i2;
                        break;
                    default:
                        max = 0;
                        break;
                }
            } else {
                if (i4 == -2) {
                    max = 0;
                }
                max = 0;
            }
        } else if (i4 >= 0) {
            i5 = MemoryMappedFileBuffer.DEFAULT_SIZE;
            max = i4;
        } else if (i4 == -1) {
            i5 = i2;
        } else {
            if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                    i5 = Integer.MIN_VALUE;
                }
            }
            max = 0;
        }
        return MeasureSpec.makeMeasureSpec(max, i5);
    }

    public static int m2984c(View view) {
        Rect rect = ((fa) view.getLayoutParams()).f3357d;
        return rect.right + (view.getMeasuredWidth() + rect.left);
    }

    public static int m2986d(View view) {
        Rect rect = ((fa) view.getLayoutParams()).f3357d;
        return rect.bottom + (view.getMeasuredHeight() + rect.top);
    }

    public static void m2981a(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((fa) view.getLayoutParams()).f3357d;
        view.layout(rect.left + i, rect.top + i2, i3 - rect.right, i4 - rect.bottom);
    }

    public static void m2982b(View view, int i, int i2, int i3, int i4) {
        fa faVar = (fa) view.getLayoutParams();
        Rect rect = faVar.f3357d;
        view.layout((rect.left + i) + faVar.leftMargin, (rect.top + i2) + faVar.topMargin, (i3 - rect.right) - faVar.rightMargin, (i4 - rect.bottom) - faVar.bottomMargin);
    }

    public final void m3018a(View view, Rect rect) {
        Rect rect2 = ((fa) view.getLayoutParams()).f3357d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.f2960y != null) {
            Matrix matrix = view.getMatrix();
            if (!(matrix == null || matrix.isIdentity())) {
                RectF rectF = this.f2960y.f526t;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static int m2987e(View view) {
        return view.getLeft() - ((fa) view.getLayoutParams()).f3357d.left;
    }

    public static int m2988f(View view) {
        return view.getTop() - m2991i(view);
    }

    public static int m2989g(View view) {
        return ((fa) view.getLayoutParams()).f3357d.right + view.getRight();
    }

    public static int m2990h(View view) {
        return ((fa) view.getLayoutParams()).f3357d.bottom + view.getBottom();
    }

    public final void m3034b(View view, Rect rect) {
        if (this.f2960y == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f2960y.m301f(view));
        }
    }

    public static int m2991i(View view) {
        return ((fa) view.getLayoutParams()).f3357d.top;
    }

    public View mo725a(View view, int i, fh fhVar, fo foVar) {
        return null;
    }

    public View m2997a(View view, int i) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m3022a(android.support.v7.widget.RecyclerView r15, android.view.View r16, android.graphics.Rect r17, boolean r18, boolean r19) {
        /*
        r14 = this;
        r1 = 2;
        r4 = new int[r1];
        r5 = r14.getPaddingLeft();
        r6 = r14.getPaddingTop();
        r1 = r14.f2957M;
        r2 = r14.getPaddingRight();
        r7 = r1 - r2;
        r1 = r14.f2958N;
        r2 = r14.getPaddingBottom();
        r8 = r1 - r2;
        r1 = r16.getLeft();
        r0 = r17;
        r2 = r0.left;
        r1 = r1 + r2;
        r2 = r16.getScrollX();
        r9 = r1 - r2;
        r1 = r16.getTop();
        r0 = r17;
        r2 = r0.top;
        r1 = r1 + r2;
        r2 = r16.getScrollY();
        r10 = r1 - r2;
        r1 = r17.width();
        r11 = r9 + r1;
        r1 = r17.height();
        r12 = r10 + r1;
        r1 = 0;
        r2 = r9 - r5;
        r2 = java.lang.Math.min(r1, r2);
        r1 = 0;
        r3 = r10 - r6;
        r3 = java.lang.Math.min(r1, r3);
        r1 = 0;
        r13 = r11 - r7;
        r1 = java.lang.Math.max(r1, r13);
        r13 = 0;
        r8 = r12 - r8;
        r8 = java.lang.Math.max(r13, r8);
        r12 = r14.m3059o();
        r13 = 1;
        if (r12 != r13) goto L_0x0097;
    L_0x0068:
        if (r1 == 0) goto L_0x0090;
    L_0x006a:
        r2 = r1;
    L_0x006b:
        if (r3 == 0) goto L_0x00a3;
    L_0x006d:
        r1 = r3;
    L_0x006e:
        r3 = 0;
        r4[r3] = r2;
        r2 = 1;
        r4[r2] = r1;
        r1 = 0;
        r2 = r4[r1];
        r1 = 1;
        r3 = r4[r1];
        if (r19 == 0) goto L_0x0085;
    L_0x007c:
        r1 = r15.getFocusedChild();
        if (r1 != 0) goto L_0x00aa;
    L_0x0082:
        r1 = 0;
    L_0x0083:
        if (r1 == 0) goto L_0x00e3;
    L_0x0085:
        if (r2 != 0) goto L_0x0089;
    L_0x0087:
        if (r3 == 0) goto L_0x00e3;
    L_0x0089:
        if (r18 == 0) goto L_0x00df;
    L_0x008b:
        r15.scrollBy(r2, r3);
    L_0x008e:
        r1 = 1;
    L_0x008f:
        return r1;
    L_0x0090:
        r1 = r11 - r7;
        r1 = java.lang.Math.max(r2, r1);
        goto L_0x006a;
    L_0x0097:
        if (r2 == 0) goto L_0x009c;
    L_0x0099:
        r1 = r2;
    L_0x009a:
        r2 = r1;
        goto L_0x006b;
    L_0x009c:
        r2 = r9 - r5;
        r1 = java.lang.Math.min(r2, r1);
        goto L_0x009a;
    L_0x00a3:
        r1 = r10 - r6;
        r1 = java.lang.Math.min(r1, r8);
        goto L_0x006e;
    L_0x00aa:
        r4 = r14.getPaddingLeft();
        r5 = r14.getPaddingTop();
        r6 = r14.f2957M;
        r7 = r14.getPaddingRight();
        r6 = r6 - r7;
        r7 = r14.f2958N;
        r8 = r14.getPaddingBottom();
        r7 = r7 - r8;
        r8 = r14.f2960y;
        r8 = r8.f524r;
        android.support.v7.widget.RecyclerView.m260b(r1, r8);
        r1 = r8.left;
        r1 = r1 - r2;
        if (r1 >= r6) goto L_0x00db;
    L_0x00cc:
        r1 = r8.right;
        r1 = r1 - r2;
        if (r1 <= r4) goto L_0x00db;
    L_0x00d1:
        r1 = r8.top;
        r1 = r1 - r3;
        if (r1 >= r7) goto L_0x00db;
    L_0x00d6:
        r1 = r8.bottom;
        r1 = r1 - r3;
        if (r1 > r5) goto L_0x00dd;
    L_0x00db:
        r1 = 0;
        goto L_0x0083;
    L_0x00dd:
        r1 = 1;
        goto L_0x0083;
    L_0x00df:
        r15.b_(r2, r3);
        goto L_0x008e;
    L_0x00e3:
        r1 = 0;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ew.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void mo4460a(em emVar, em emVar2) {
    }

    public void mo798a(RecyclerView recyclerView) {
    }

    public void mo799a(RecyclerView recyclerView, int i, int i2) {
    }

    public void mo807b(RecyclerView recyclerView, int i, int i2) {
    }

    public void mo4461d(RecyclerView recyclerView, int i, int i2) {
    }

    public void mo808c(RecyclerView recyclerView, int i, int i2) {
        mo4461d(recyclerView, i, i2);
    }

    public void mo800a(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public int mo741d(fo foVar) {
        return 0;
    }

    public int mo735b(fo foVar) {
        return 0;
    }

    public int mo746f(fo foVar) {
        return 0;
    }

    public int mo744e(fo foVar) {
        return 0;
    }

    public int mo737c(fo foVar) {
        return 0;
    }

    public int mo748g(fo foVar) {
        return 0;
    }

    public final void m3045d(int i, int i2) {
        this.f2960y.m297d(i, i2);
    }

    public final void m3048e(int i, int i2) {
        this.f2960y.setMeasuredDimension(i, i2);
    }

    public Parcelable mo742d() {
        return null;
    }

    public void mo728a(Parcelable parcelable) {
    }

    public final void m3040c(fh fhVar) {
        for (int p = m3060p() - 1; p >= 0; p--) {
            if (!RecyclerView.m261c(m3051f(p)).m3265b()) {
                m3001a(p, fhVar);
            }
        }
    }

    public void mo732a(AccessibilityEvent accessibilityEvent) {
        mo5203a(this.f2960y.f517k, this.f2960y.ao, accessibilityEvent);
    }

    public void mo5203a(fh fhVar, fo foVar, AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        if (this.f2960y != null && accessibilityEvent != null) {
            if (!(this.f2960y.canScrollVertically(1) || this.f2960y.canScrollVertically(-1) || this.f2960y.canScrollHorizontally(-1) || this.f2960y.canScrollHorizontally(1))) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.f2960y.f527u != null) {
                accessibilityEvent.setItemCount(this.f2960y.f527u.mo1039a());
            }
        }
    }

    final void m3019a(View view, C0333b c0333b) {
        fr c = RecyclerView.m261c(view);
        if (c != null && !c.m3276m() && !this.f2959x.m3337d(c.f3211a)) {
            mo803a(this.f2960y.f517k, this.f2960y.ao, view, c0333b);
        }
    }

    public void mo803a(fh fhVar, fo foVar, View view, C0333b c0333b) {
        int a;
        int a2 = mo747f() ? m2979a(view) : 0;
        if (mo745e()) {
            a = m2979a(view);
        } else {
            a = 0;
        }
        c0333b.m1769a(C0336e.m1786a(a2, 1, a, 1, false));
    }

    public int mo793a(fh fhVar, fo foVar) {
        if (this.f2960y == null || this.f2960y.f527u == null || !mo747f()) {
            return 1;
        }
        return this.f2960y.f527u.mo1039a();
    }

    public int mo806b(fh fhVar, fo foVar) {
        if (this.f2960y == null || this.f2960y.f527u == null || !mo745e()) {
            return 1;
        }
        return this.f2960y.f527u.mo1039a();
    }

    final void m3038c(RecyclerView recyclerView) {
        m3030b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    boolean mo749i() {
        return false;
    }
}
