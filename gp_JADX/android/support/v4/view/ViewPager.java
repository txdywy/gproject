package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.eq;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] f1780a = new int[]{16842931};
    public static final bn ae = new bn();
    public static final Comparator f1781c = new az();
    public static final Interpolator f1782d = new ba();
    public int f1783A;
    public int f1784B;
    public int f1785C;
    public float f1786D;
    public float f1787E;
    public float f1788F;
    public float f1789G;
    public int f1790H = -1;
    public VelocityTracker f1791I;
    public int f1792J;
    public int f1793K;
    public int f1794L;
    public int f1795M;
    public boolean f1796N;
    public EdgeEffect f1797O;
    public EdgeEffect f1798P;
    public boolean f1799Q = true;
    public boolean f1800R;
    public int f1801S;
    public List f1802T;
    public bi f1803U;
    public bi f1804V;
    public List f1805W;
    public bj aa;
    public int ab;
    public int ac;
    public ArrayList ad;
    public final Runnable af = new bb(this);
    public int ag = 0;
    public int f1806b;
    public final ArrayList f1807e = new ArrayList();
    public final be f1808f = new be();
    public final Rect f1809g = new Rect();
    public af f1810h;
    public int f1811i;
    public int f1812j = -1;
    public Scroller f1813k;
    public boolean f1814l;
    public bk f1815m;
    public int f1816n;
    public Drawable f1817o;
    public int f1818p;
    public int f1819q;
    public float f1820r = -3.4028235E38f;
    public float f1821s = Float.MAX_VALUE;
    public int f1822t;
    public boolean f1823u;
    public boolean f1824v;
    public boolean f1825w;
    public int f1826x = 1;
    public boolean f1827y;
    public boolean f1828z;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new bl();
        public int f1777a;
        public Parcelable f1778b;
        public ClassLoader f1779c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1777a);
            parcel.writeParcelable(this.f1778b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1777a + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f1777a = parcel.readInt();
            this.f1778b = parcel.readParcelable(classLoader);
            this.f1779c = classLoader;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo5178e();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5178e();
    }

    private final void mo5178e() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1813k = new Scroller(context, f1782d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1785C = viewConfiguration.getScaledPagingTouchSlop();
        this.f1792J = (int) (400.0f * f);
        this.f1793K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1797O = new EdgeEffect(context);
        this.f1798P = new EdgeEffect(context);
        this.f1794L = (int) (25.0f * f);
        this.f1795M = (int) (2.0f * f);
        this.f1783A = (int) (16.0f * f);
        ai.m1829a((View) this, new bg(this));
        if (ai.f1848a.mo392d(this) == 0) {
            ai.m1838b((View) this, 1);
        }
        ai.m1828a((View) this, new bc(this));
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.af);
        if (!(this.f1813k == null || this.f1813k.isFinished())) {
            this.f1813k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    final void m1756a(int i) {
        int i2 = 0;
        if (this.ag != i) {
            int i3;
            this.ag = i;
            if (this.aa != null) {
                int i4 = i != 0 ? 1 : 0;
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    if (i4 != 0) {
                        i3 = this.ab;
                    } else {
                        i3 = 0;
                    }
                    getChildAt(i5).setLayerType(i3, null);
                }
            }
            if (this.f1803U != null) {
                this.f1803U.d_(i);
            }
            if (this.f1802T != null) {
                i3 = this.f1802T.size();
                while (i2 < i3) {
                    bi biVar = (bi) this.f1802T.get(i2);
                    if (biVar != null) {
                        biVar.d_(i);
                    }
                    i2++;
                }
            }
            if (this.f1804V != null) {
                this.f1804V.d_(i);
            }
        }
    }

    public void setAdapter(af afVar) {
        int i;
        int i2 = false;
        if (this.f1810h != null) {
            this.f1810h.m1818c(null);
            for (i = 0; i < this.f1807e.size(); i++) {
                be beVar = (be) this.f1807e.get(i);
                this.f1810h.mo1373a((ViewGroup) this, beVar.f1870b, beVar.f1869a);
            }
            this.f1810h.mo1377b();
            this.f1807e.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((bf) getChildAt(i).getLayoutParams()).f1874a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.f1811i = 0;
            scrollTo(0, 0);
        }
        this.f1810h = afVar;
        this.f1806b = 0;
        if (this.f1810h != null) {
            if (this.f1815m == null) {
                this.f1815m = new bk(this);
            }
            this.f1810h.m1818c(this.f1815m);
            this.f1825w = false;
            boolean z = this.f1799Q;
            this.f1799Q = true;
            this.f1806b = this.f1810h.mo961a();
            if (this.f1812j >= 0) {
                m1734a(this.f1812j, false, true);
                this.f1812j = -1;
            } else if (z) {
                requestLayout();
            } else {
                al_();
            }
        }
        if (this.f1805W != null && !this.f1805W.isEmpty()) {
            i = this.f1805W.size();
            while (i2 < i) {
                ((bh) this.f1805W.get(i2)).mo178a(this, afVar);
                i2++;
            }
        }
    }

    public af getAdapter() {
        return this.f1810h;
    }

    private final int m1748f() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        boolean z;
        this.f1825w = false;
        if (this.f1799Q) {
            z = false;
        } else {
            z = true;
        }
        m1734a(i, z, false);
    }

    public final void m1757a(int i, boolean z) {
        this.f1825w = false;
        m1734a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f1811i;
    }

    private final void m1734a(int i, boolean z, boolean z2) {
        m1735a(i, z, z2, 0);
    }

    private final void m1735a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f1810h == null || this.f1810h.mo961a() <= 0) {
            m1743b(false);
        } else if (z2 || this.f1811i != i || this.f1807e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f1810h.mo961a()) {
                i = this.f1810h.mo961a() - 1;
            }
            int i3 = this.f1826x;
            if (i > this.f1811i + i3 || i < this.f1811i - i3) {
                for (int i4 = 0; i4 < this.f1807e.size(); i4++) {
                    ((be) this.f1807e.get(i4)).f1871c = true;
                }
            }
            if (this.f1811i != i) {
                z3 = true;
            }
            if (this.f1799Q) {
                this.f1811i = i;
                if (z3) {
                    m1747e(i);
                }
                requestLayout();
                return;
            }
            m1742b(i);
            m1733a(i, z, i2, z3);
        } else {
            m1743b(false);
        }
    }

    private final void m1733a(int i, boolean z, int i2, boolean z2) {
        int f;
        be c = m1744c(i);
        if (c != null) {
            f = (int) (((float) m1748f()) * Math.max(this.f1820r, Math.min(c.f1873e, this.f1821s)));
        } else {
            f = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                m1743b(false);
            } else {
                int currX;
                int i3;
                Object obj = (this.f1813k == null || this.f1813k.isFinished()) ? null : 1;
                if (obj != null) {
                    currX = this.f1814l ? this.f1813k.getCurrX() : this.f1813k.getStartX();
                    this.f1813k.abortAnimation();
                    m1743b(false);
                    i3 = currX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                f -= i3;
                int i4 = 0 - scrollY;
                if (f == 0 && i4 == 0) {
                    m1738a(false);
                    al_();
                    m1756a(0);
                } else {
                    m1743b(true);
                    m1756a(2);
                    currX = m1748f();
                    int i5 = currX / 2;
                    float sin = (((float) i5) * ((float) Math.sin((double) ((Math.min(1.0f, (1.0f * ((float) Math.abs(f))) / ((float) currX)) - 0.5f) * 0.47123894f)))) + ((float) i5);
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        currX = Math.round(1000.0f * Math.abs(sin / ((float) abs))) * 4;
                    } else {
                        currX = (int) (((((float) Math.abs(f)) / ((((float) currX) * this.f1810h.mo1376b(this.f1811i)) + ((float) this.f1816n))) + 1.0f) * 100.0f);
                    }
                    i5 = Math.min(currX, 600);
                    this.f1814l = false;
                    this.f1813k.startScroll(i3, scrollY, f, i4, i5);
                    ai.f1848a.mo391c(this);
                }
            }
            if (z2) {
                m1747e(i);
                return;
            }
            return;
        }
        if (z2) {
            m1747e(i);
        }
        m1738a(false);
        scrollTo(f, 0);
        m1745d(f);
    }

    @Deprecated
    public void setOnPageChangeListener(bi biVar) {
        this.f1803U = biVar;
    }

    public final void m1758a(bi biVar) {
        if (this.f1802T == null) {
            this.f1802T = new ArrayList();
        }
        this.f1802T.add(biVar);
    }

    public final void m1759b(bi biVar) {
        if (this.f1802T != null) {
            this.f1802T.remove(biVar);
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((bf) ((View) this.ad.get(i2)).getLayoutParams()).f1879f;
    }

    public int getOffscreenPageLimit() {
        return this.f1826x;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f1826x) {
            this.f1826x = i;
            al_();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f1816n;
        this.f1816n = i;
        int width = getWidth();
        m1732a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f1816n;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1817o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0216d.m1112a(getContext(), i));
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1817o;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1817o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    private final be m1730a(int i, int i2) {
        be beVar = new be();
        beVar.f1870b = i;
        beVar.f1869a = this.f1810h.mo1372a((ViewGroup) this, i);
        beVar.f1872d = this.f1810h.mo1376b(i);
        if (i2 < 0 || i2 >= this.f1807e.size()) {
            this.f1807e.add(beVar);
        } else {
            this.f1807e.add(i2, beVar);
        }
        return beVar;
    }

    final void m1755a() {
        int a = this.f1810h.mo961a();
        this.f1806b = a;
        boolean z = this.f1807e.size() < (this.f1826x * 2) + 1 && this.f1807e.size() < a;
        boolean z2 = false;
        int i = this.f1811i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f1807e.size()) {
            int i3;
            boolean z4;
            int max;
            boolean z5;
            be beVar = (be) this.f1807e.get(i2);
            int b = this.f1810h.mo963b(beVar.f1869a);
            if (b != -1) {
                if (b == -2) {
                    this.f1807e.remove(i2);
                    i2--;
                    if (!z2) {
                        z2 = true;
                    }
                    this.f1810h.mo1373a((ViewGroup) this, beVar.f1870b, beVar.f1869a);
                    if (this.f1811i == beVar.f1870b) {
                        i3 = i2;
                        z4 = z2;
                        max = Math.max(0, Math.min(this.f1811i, a - 1));
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        max = i;
                        z5 = true;
                    }
                } else if (beVar.f1870b != b) {
                    if (beVar.f1870b == this.f1811i) {
                        i = b;
                    }
                    beVar.f1870b = b;
                    i3 = i2;
                    z4 = z2;
                    max = i;
                    z5 = true;
                }
                z3 = z5;
                i = max;
                z2 = z4;
                i2 = i3 + 1;
            }
            i3 = i2;
            z4 = z2;
            max = i;
            z5 = z3;
            z3 = z5;
            i = max;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f1810h.mo1377b();
        }
        Collections.sort(this.f1807e, f1781c);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                bf bfVar = (bf) getChildAt(i2).getLayoutParams();
                if (!bfVar.f1874a) {
                    bfVar.f1876c = 0.0f;
                }
            }
            m1734a(i, false, true);
            requestLayout();
        }
    }

    public final void al_() {
        m1742b(this.f1811i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1742b(int r18) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r17;
        r3 = r0.f1811i;
        r0 = r18;
        if (r3 == r0) goto L_0x0307;
    L_0x0009:
        r0 = r17;
        r2 = r0.f1811i;
        r0 = r17;
        r2 = r0.m1744c(r2);
        r0 = r18;
        r1 = r17;
        r1.f1811i = r0;
        r3 = r2;
    L_0x001a:
        r0 = r17;
        r2 = r0.f1810h;
        if (r2 != 0) goto L_0x0024;
    L_0x0020:
        r17.m1750g();
    L_0x0023:
        return;
    L_0x0024:
        r0 = r17;
        r2 = r0.f1825w;
        if (r2 == 0) goto L_0x002e;
    L_0x002a:
        r17.m1750g();
        goto L_0x0023;
    L_0x002e:
        r2 = r17.getWindowToken();
        if (r2 == 0) goto L_0x0023;
    L_0x0034:
        r0 = r17;
        r2 = r0.f1826x;
        r4 = 0;
        r0 = r17;
        r5 = r0.f1811i;
        r5 = r5 - r2;
        r10 = java.lang.Math.max(r4, r5);
        r0 = r17;
        r4 = r0.f1810h;
        r11 = r4.mo961a();
        r4 = r11 + -1;
        r0 = r17;
        r5 = r0.f1811i;
        r2 = r2 + r5;
        r12 = java.lang.Math.min(r4, r2);
        r0 = r17;
        r2 = r0.f1806b;
        if (r11 == r2) goto L_0x00be;
    L_0x005b:
        r2 = r17.getResources();	 Catch:{ NotFoundException -> 0x00b4 }
        r3 = r17.getId();	 Catch:{ NotFoundException -> 0x00b4 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00b4 }
    L_0x0067:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r17;
        r5 = r0.f1806b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r17.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r17;
        r4 = r0.f1810h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00b4:
        r2 = move-exception;
        r2 = r17.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0067;
    L_0x00be:
        r5 = 0;
        r2 = 0;
        r4 = r2;
    L_0x00c1:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.size();
        if (r4 >= r2) goto L_0x0304;
    L_0x00cb:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.be) r2;
        r6 = r2.f1870b;
        r0 = r17;
        r7 = r0.f1811i;
        if (r6 < r7) goto L_0x0151;
    L_0x00dd:
        r6 = r2.f1870b;
        r0 = r17;
        r7 = r0.f1811i;
        if (r6 != r7) goto L_0x0304;
    L_0x00e5:
        if (r2 != 0) goto L_0x0301;
    L_0x00e7:
        if (r11 <= 0) goto L_0x0301;
    L_0x00e9:
        r0 = r17;
        r2 = r0.f1811i;
        r0 = r17;
        r2 = r0.m1730a(r2, r4);
        r9 = r2;
    L_0x00f4:
        if (r9 == 0) goto L_0x026b;
    L_0x00f6:
        r8 = 0;
        r7 = r4 + -1;
        if (r7 < 0) goto L_0x0156;
    L_0x00fb:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.be) r2;
    L_0x0105:
        r13 = r17.m1748f();
        if (r13 > 0) goto L_0x0158;
    L_0x010b:
        r5 = 0;
    L_0x010c:
        r0 = r17;
        r6 = r0.f1811i;
        r6 = r6 + -1;
        r15 = r6;
        r6 = r8;
        r8 = r15;
        r16 = r7;
        r7 = r4;
        r4 = r16;
    L_0x011a:
        if (r8 < 0) goto L_0x019e;
    L_0x011c:
        r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r14 < 0) goto L_0x0168;
    L_0x0120:
        if (r8 >= r10) goto L_0x0168;
    L_0x0122:
        if (r2 == 0) goto L_0x019e;
    L_0x0124:
        r14 = r2.f1870b;
        if (r8 != r14) goto L_0x014e;
    L_0x0128:
        r14 = r2.f1871c;
        if (r14 != 0) goto L_0x014e;
    L_0x012c:
        r0 = r17;
        r14 = r0.f1807e;
        r14.remove(r4);
        r0 = r17;
        r14 = r0.f1810h;
        r2 = r2.f1869a;
        r0 = r17;
        r14.mo1373a(r0, r8, r2);
        r4 = r4 + -1;
        r7 = r7 + -1;
        if (r4 < 0) goto L_0x0166;
    L_0x0144:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.be) r2;
    L_0x014e:
        r8 = r8 + -1;
        goto L_0x011a;
    L_0x0151:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x00c1;
    L_0x0156:
        r2 = 0;
        goto L_0x0105;
    L_0x0158:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r9.f1872d;
        r5 = r5 - r6;
        r6 = r17.getPaddingLeft();
        r6 = (float) r6;
        r14 = (float) r13;
        r6 = r6 / r14;
        r5 = r5 + r6;
        goto L_0x010c;
    L_0x0166:
        r2 = 0;
        goto L_0x014e;
    L_0x0168:
        if (r2 == 0) goto L_0x0182;
    L_0x016a:
        r14 = r2.f1870b;
        if (r8 != r14) goto L_0x0182;
    L_0x016e:
        r2 = r2.f1872d;
        r6 = r6 + r2;
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x0180;
    L_0x0175:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.be) r2;
        goto L_0x014e;
    L_0x0180:
        r2 = 0;
        goto L_0x014e;
    L_0x0182:
        r2 = r4 + 1;
        r0 = r17;
        r2 = r0.m1730a(r8, r2);
        r2 = r2.f1872d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        if (r4 < 0) goto L_0x019c;
    L_0x0191:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.be) r2;
        goto L_0x014e;
    L_0x019c:
        r2 = 0;
        goto L_0x014e;
    L_0x019e:
        r5 = r9.f1872d;
        r8 = r7 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0266;
    L_0x01a8:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.size();
        if (r8 >= r2) goto L_0x020c;
    L_0x01b2:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.be) r2;
        r6 = r2;
    L_0x01bd:
        if (r13 > 0) goto L_0x020e;
    L_0x01bf:
        r2 = 0;
        r4 = r2;
    L_0x01c1:
        r0 = r17;
        r2 = r0.f1811i;
        r2 = r2 + 1;
        r15 = r2;
        r2 = r6;
        r6 = r8;
        r8 = r15;
    L_0x01cb:
        if (r8 >= r11) goto L_0x0266;
    L_0x01cd:
        r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x021c;
    L_0x01d1:
        if (r8 <= r12) goto L_0x021c;
    L_0x01d3:
        if (r2 == 0) goto L_0x0266;
    L_0x01d5:
        r10 = r2.f1870b;
        if (r8 != r10) goto L_0x02fc;
    L_0x01d9:
        r10 = r2.f1871c;
        if (r10 != 0) goto L_0x02fc;
    L_0x01dd:
        r0 = r17;
        r10 = r0.f1807e;
        r10.remove(r6);
        r0 = r17;
        r10 = r0.f1810h;
        r2 = r2.f1869a;
        r0 = r17;
        r10.mo1373a(r0, r8, r2);
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x021a;
    L_0x01f9:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.be) r2;
    L_0x0203:
        r15 = r5;
        r5 = r2;
        r2 = r15;
    L_0x0206:
        r8 = r8 + 1;
        r15 = r2;
        r2 = r5;
        r5 = r15;
        goto L_0x01cb;
    L_0x020c:
        r6 = 0;
        goto L_0x01bd;
    L_0x020e:
        r2 = r17.getPaddingRight();
        r2 = (float) r2;
        r4 = (float) r13;
        r2 = r2 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r4;
        r4 = r2;
        goto L_0x01c1;
    L_0x021a:
        r2 = 0;
        goto L_0x0203;
    L_0x021c:
        if (r2 == 0) goto L_0x0241;
    L_0x021e:
        r10 = r2.f1870b;
        if (r8 != r10) goto L_0x0241;
    L_0x0222:
        r2 = r2.f1872d;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x023f;
    L_0x0231:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.be) r2;
    L_0x023b:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0206;
    L_0x023f:
        r2 = 0;
        goto L_0x023b;
    L_0x0241:
        r0 = r17;
        r2 = r0.m1730a(r8, r6);
        r6 = r6 + 1;
        r2 = r2.f1872d;
        r5 = r5 + r2;
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0264;
    L_0x0256:
        r0 = r17;
        r2 = r0.f1807e;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.be) r2;
    L_0x0260:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0206;
    L_0x0264:
        r2 = 0;
        goto L_0x0260;
    L_0x0266:
        r0 = r17;
        r0.m1736a(r9, r7, r3);
    L_0x026b:
        r0 = r17;
        r3 = r0.f1810h;
        if (r9 == 0) goto L_0x02b2;
    L_0x0271:
        r2 = r9.f1869a;
    L_0x0273:
        r3.mo958a(r2);
        r0 = r17;
        r2 = r0.f1810h;
        r2.mo1377b();
        r4 = r17.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x0283:
        if (r3 >= r4) goto L_0x02b4;
    L_0x0285:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (android.support.v4.view.bf) r2;
        r2.f1879f = r3;
        r6 = r2.f1874a;
        if (r6 != 0) goto L_0x02ae;
    L_0x0297:
        r6 = r2.f1876c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x02ae;
    L_0x029e:
        r0 = r17;
        r5 = r0.m1754a(r5);
        if (r5 == 0) goto L_0x02ae;
    L_0x02a6:
        r6 = r5.f1872d;
        r2.f1876c = r6;
        r5 = r5.f1870b;
        r2.f1878e = r5;
    L_0x02ae:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x0283;
    L_0x02b2:
        r2 = 0;
        goto L_0x0273;
    L_0x02b4:
        r17.m1750g();
        r2 = r17.hasFocus();
        if (r2 == 0) goto L_0x0023;
    L_0x02bd:
        r2 = r17.findFocus();
        if (r2 == 0) goto L_0x02fa;
    L_0x02c3:
        r0 = r17;
        r2 = r0.m1741b(r2);
    L_0x02c9:
        if (r2 == 0) goto L_0x02d3;
    L_0x02cb:
        r2 = r2.f1870b;
        r0 = r17;
        r3 = r0.f1811i;
        if (r2 == r3) goto L_0x0023;
    L_0x02d3:
        r2 = 0;
    L_0x02d4:
        r3 = r17.getChildCount();
        if (r2 >= r3) goto L_0x0023;
    L_0x02da:
        r0 = r17;
        r3 = r0.getChildAt(r2);
        r0 = r17;
        r4 = r0.m1754a(r3);
        if (r4 == 0) goto L_0x02f7;
    L_0x02e8:
        r4 = r4.f1870b;
        r0 = r17;
        r5 = r0.f1811i;
        if (r4 != r5) goto L_0x02f7;
    L_0x02f0:
        r4 = 2;
        r3 = r3.requestFocus(r4);
        if (r3 != 0) goto L_0x0023;
    L_0x02f7:
        r2 = r2 + 1;
        goto L_0x02d4;
    L_0x02fa:
        r2 = 0;
        goto L_0x02c9;
    L_0x02fc:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x0206;
    L_0x0301:
        r9 = r2;
        goto L_0x00f4;
    L_0x0304:
        r2 = r5;
        goto L_0x00e5;
    L_0x0307:
        r3 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(int):void");
    }

    private final void m1750g() {
        if (this.ac != 0) {
            if (this.ad == null) {
                this.ad = new ArrayList();
            } else {
                this.ad.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ad.add(getChildAt(i));
            }
            Collections.sort(this.ad, ae);
        }
    }

    private final void m1736a(be beVar, int i, be beVar2) {
        float f;
        float f2;
        int i2;
        be beVar3;
        int i3;
        int a = this.f1810h.mo961a();
        int f3 = m1748f();
        if (f3 > 0) {
            f = ((float) this.f1816n) / ((float) f3);
        } else {
            f = 0.0f;
        }
        if (beVar2 != null) {
            f3 = beVar2.f1870b;
            int i4;
            int i5;
            float f4;
            int i6;
            float b;
            if (f3 < beVar.f1870b) {
                i4 = 0;
                f2 = (beVar2.f1873e + beVar2.f1872d) + f;
                i2 = f3 + 1;
                while (i2 <= beVar.f1870b && i4 < this.f1807e.size()) {
                    beVar3 = (be) this.f1807e.get(i4);
                    while (i2 > beVar3.f1870b && i4 < this.f1807e.size() - 1) {
                        i4++;
                        beVar3 = (be) this.f1807e.get(i4);
                    }
                    i5 = i2;
                    f4 = f2;
                    i6 = i5;
                    while (i6 < beVar3.f1870b) {
                        b = (this.f1810h.mo1376b(i6) + f) + f4;
                        i6++;
                        f4 = b;
                    }
                    beVar3.f1873e = f4;
                    f4 += beVar3.f1872d + f;
                    f3 = i6 + 1;
                    f2 = f4;
                    i2 = f3;
                }
            } else if (f3 > beVar.f1870b) {
                i4 = this.f1807e.size() - 1;
                f2 = beVar2.f1873e;
                i2 = f3 - 1;
                while (i2 >= beVar.f1870b && i4 >= 0) {
                    beVar3 = (be) this.f1807e.get(i4);
                    while (i2 < beVar3.f1870b && i4 > 0) {
                        i4--;
                        beVar3 = (be) this.f1807e.get(i4);
                    }
                    i5 = i2;
                    f4 = f2;
                    i6 = i5;
                    while (i6 > beVar3.f1870b) {
                        b = f4 - (this.f1810h.mo1376b(i6) + f);
                        i6--;
                        f4 = b;
                    }
                    f4 -= beVar3.f1872d + f;
                    beVar3.f1873e = f4;
                    f3 = i6 - 1;
                    f2 = f4;
                    i2 = f3;
                }
            }
        }
        int size = this.f1807e.size();
        f2 = beVar.f1873e;
        i2 = beVar.f1870b - 1;
        this.f1820r = beVar.f1870b == 0 ? beVar.f1873e : -3.4028235E38f;
        this.f1821s = beVar.f1870b == a + -1 ? (beVar.f1873e + beVar.f1872d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            beVar3 = (be) this.f1807e.get(i3);
            float f5 = f2;
            while (i2 > beVar3.f1870b) {
                f5 -= this.f1810h.mo1376b(i2) + f;
                i2--;
            }
            f2 = f5 - (beVar3.f1872d + f);
            beVar3.f1873e = f2;
            if (beVar3.f1870b == 0) {
                this.f1820r = f2;
            }
            i2--;
        }
        f2 = (beVar.f1873e + beVar.f1872d) + f;
        i2 = beVar.f1870b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            beVar3 = (be) this.f1807e.get(i3);
            f5 = f2;
            while (i2 < beVar3.f1870b) {
                f5 = (this.f1810h.mo1376b(i2) + f) + f5;
                i2++;
            }
            if (beVar3.f1870b == a - 1) {
                this.f1821s = (beVar3.f1872d + f5) - 1.0f;
            }
            beVar3.f1873e = f5;
            f2 = f5 + (beVar3.f1872d + f);
            i2++;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1777a = this.f1811i;
        if (this.f1810h != null) {
            savedState.f1778b = null;
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f542e);
            Parcelable parcelable2;
            ClassLoader classLoader;
            if (this.f1810h != null) {
                parcelable2 = savedState.f1778b;
                classLoader = savedState.f1779c;
                m1734a(savedState.f1777a, false, true);
                return;
            }
            this.f1812j = savedState.f1777a;
            parcelable2 = savedState.f1778b;
            classLoader = savedState.f1779c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (checkLayoutParams(layoutParams)) {
            layoutParams2 = layoutParams;
        } else {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        bf bfVar = (bf) layoutParams2;
        bfVar.f1874a = (view.getClass().getAnnotation(bd.class) != null ? 1 : 0) | bfVar.f1874a;
        if (!this.f1823u) {
            super.addView(view, i, layoutParams2);
        } else if (bfVar == null || !bfVar.f1874a) {
            bfVar.f1877d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.f1823u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final be m1754a(View view) {
        for (int i = 0; i < this.f1807e.size(); i++) {
            be beVar = (be) this.f1807e.get(i);
            if (this.f1810h.mo959a(view, beVar.f1869a)) {
                return beVar;
            }
        }
        return null;
    }

    private final be m1741b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return m1754a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    private final be m1744c(int i) {
        for (int i2 = 0; i2 < this.f1807e.size(); i2++) {
            be beVar = (be) this.f1807e.get(i2);
            if (beVar.f1870b == i) {
                return beVar;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1799Q = true;
    }

    public void onMeasure(int i, int i2) {
        bf bfVar;
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1784B = Math.min(measuredWidth / 10, this.f1783A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                bfVar = (bf) childAt.getLayoutParams();
                if (bfVar != null && bfVar.f1874a) {
                    int i6 = bfVar.f1875b & 7;
                    int i7 = bfVar.f1875b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                    } else if (obj2 != null) {
                        i5 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                    }
                    if (bfVar.width != -2) {
                        i7 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                        i3 = bfVar.width != -1 ? bfVar.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (bfVar.height != -2) {
                        i5 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                        if (bfVar.height != -1) {
                            measuredWidth = bfVar.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        MeasureSpec.makeMeasureSpec(paddingLeft, MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.f1822t = MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.f1823u = true;
        al_();
        this.f1823u = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                bfVar = (bf) childAt2.getLayoutParams();
                if (bfVar == null || !bfVar.f1874a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (bfVar.f1876c * ((float) paddingLeft)), MemoryMappedFileBuffer.DEFAULT_SIZE), this.f1822t);
                }
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m1732a(i, i3, this.f1816n, this.f1816n);
        }
    }

    private final void m1732a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f1807e.isEmpty()) {
            be c = m1744c(this.f1811i);
            int min = (int) ((c != null ? Math.min(c.f1873e, this.f1821s) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m1738a(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.f1813k.isFinished()) {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)))), getScrollY());
        } else {
            this.f1813k.setFinalX(getCurrentItem() * m1748f());
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            bf bfVar;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                bfVar = (bf) childAt.getLayoutParams();
                if (bfVar.f1874a) {
                    int i9 = bfVar.f1875b & 112;
                    switch (bfVar.f1875b & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                bfVar = (bf) childAt2.getLayoutParams();
                if (!bfVar.f1874a) {
                    be a = m1754a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f1873e * ((float) max))) + paddingLeft;
                        if (bfVar.f1877d) {
                            bfVar.f1877d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (bfVar.f1876c * ((float) max)), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, MemoryMappedFileBuffer.DEFAULT_SIZE));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f1818p = paddingTop;
        this.f1819q = i6 - paddingBottom;
        this.f1801S = i7;
        if (this.f1799Q) {
            m1733a(this.f1811i, false, 0, false);
        }
        this.f1799Q = false;
    }

    public void computeScroll() {
        this.f1814l = true;
        if (this.f1813k.isFinished() || !this.f1813k.computeScrollOffset()) {
            m1738a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1813k.getCurrX();
        int currY = this.f1813k.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1745d(currX)) {
                this.f1813k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ai.f1848a.mo391c(this);
    }

    private final boolean m1745d(int i) {
        if (this.f1807e.size() != 0) {
            be j = m1753j();
            int f = m1748f();
            int i2 = this.f1816n + f;
            float f2 = ((float) this.f1816n) / ((float) f);
            int i3 = j.f1870b;
            float f3 = ((((float) i) / ((float) f)) - j.f1873e) / (j.f1872d + f2);
            f = (int) (((float) i2) * f3);
            this.f1800R = false;
            m1731a(i3, f3, f);
            if (this.f1800R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1799Q) {
            return false;
        } else {
            this.f1800R = false;
            m1731a(0, 0.0f, 0);
            if (this.f1800R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private final void m1731a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.f1801S > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                bf bfVar = (bf) childAt.getLayoutParams();
                if (bfVar.f1874a) {
                    int max;
                    switch (bfVar.f1875b & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        if (this.f1803U != null) {
            this.f1803U.mo179a(i, f, i2);
        }
        if (this.f1802T != null) {
            paddingRight = this.f1802T.size();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                bi biVar = (bi) this.f1802T.get(paddingLeft);
                if (biVar != null) {
                    biVar.mo179a(i, f, i2);
                }
            }
        }
        if (this.f1804V != null) {
            this.f1804V.mo179a(i, f, i2);
        }
        if (this.aa != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((bf) childAt2.getLayoutParams()).f1874a) {
                    this.aa.mo1015a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) m1748f()));
                }
            }
        }
        this.f1800R = true;
    }

    private final void m1747e(int i) {
        if (this.f1803U != null) {
            this.f1803U.mo180b(i);
        }
        if (this.f1802T != null) {
            int size = this.f1802T.size();
            for (int i2 = 0; i2 < size; i2++) {
                bi biVar = (bi) this.f1802T.get(i2);
                if (biVar != null) {
                    biVar.mo180b(i);
                }
            }
        }
        if (this.f1804V != null) {
            this.f1804V.mo180b(i);
        }
    }

    private final void m1738a(boolean z) {
        int scrollX;
        boolean z2 = this.ag == 2;
        if (z2) {
            boolean z3;
            m1743b(false);
            if (this.f1813k.isFinished()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                this.f1813k.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1813k.getCurrX();
                int currY = this.f1813k.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1745d(currX);
                    }
                }
            }
        }
        this.f1825w = false;
        boolean z4 = z2;
        for (scrollX = 0; scrollX < this.f1807e.size(); scrollX++) {
            be beVar = (be) this.f1807e.get(scrollX);
            if (beVar.f1871c) {
                beVar.f1871c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z) {
            ai.m1830a((View) this, this.af);
        } else {
            this.af.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & HprofParser.ROOT_UNKNOWN;
        if (action == 3 || action == 1) {
            m1751h();
            return false;
        }
        if (action != 0) {
            if (this.f1827y) {
                return true;
            }
            if (this.f1828z) {
                return false;
            }
        }
        float x;
        switch (action) {
            case 0:
                x = motionEvent.getX();
                this.f1788F = x;
                this.f1786D = x;
                x = motionEvent.getY();
                this.f1789G = x;
                this.f1787E = x;
                this.f1790H = motionEvent.getPointerId(0);
                this.f1828z = false;
                this.f1814l = true;
                this.f1813k.computeScrollOffset();
                if (this.ag == 2 && Math.abs(this.f1813k.getFinalX() - this.f1813k.getCurrX()) > this.f1795M) {
                    this.f1813k.abortAnimation();
                    this.f1825w = false;
                    al_();
                    this.f1827y = true;
                    m1752i();
                    m1756a(1);
                    break;
                }
                m1738a(false);
                this.f1827y = false;
                break;
                break;
            case 2:
                action = this.f1790H;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.f1786D;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.f1789G);
                    if (f != 0.0f) {
                        x = this.f1786D;
                        boolean z = (x < ((float) this.f1784B) && f > 0.0f) || (x > ((float) (getWidth() - this.f1784B)) && f < 0.0f);
                        if (!z && m1740a(this, false, (int) f, (int) x2, (int) y)) {
                            this.f1786D = x2;
                            this.f1787E = y;
                            this.f1828z = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f1785C) && 0.5f * abs > abs2) {
                        this.f1827y = true;
                        m1752i();
                        m1756a(1);
                        this.f1786D = f > 0.0f ? this.f1788F + ((float) this.f1785C) : this.f1788F - ((float) this.f1785C);
                        this.f1787E = y;
                        m1743b(true);
                    } else if (abs2 > ((float) this.f1785C)) {
                        this.f1828z = true;
                    }
                    if (this.f1827y && m1739a(x2)) {
                        ai.f1848a.mo391c(this);
                        break;
                    }
                }
                break;
            case 6:
                m1737a(motionEvent);
                break;
        }
        if (this.f1791I == null) {
            this.f1791I = VelocityTracker.obtain();
        }
        this.f1791I.addMovement(motionEvent);
        return this.f1827y;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f1796N) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f1810h == null || this.f1810h.mo961a() == 0) {
            return false;
        }
        if (this.f1791I == null) {
            this.f1791I = VelocityTracker.obtain();
        }
        this.f1791I.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & HprofParser.ROOT_UNKNOWN) {
            case 0:
                this.f1813k.abortAnimation();
                this.f1825w = false;
                al_();
                x = motionEvent.getX();
                this.f1788F = x;
                this.f1786D = x;
                x = motionEvent.getY();
                this.f1789G = x;
                this.f1787E = x;
                this.f1790H = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f1827y) {
                    VelocityTracker velocityTracker = this.f1791I;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f1793K);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f1790H);
                    this.f1825w = true;
                    int f2 = m1748f();
                    int scrollX = getScrollX();
                    be j = m1753j();
                    float f3 = ((float) this.f1816n) / ((float) f2);
                    i = j.f1870b;
                    f = ((((float) scrollX) / ((float) f2)) - j.f1873e) / (j.f1872d + f3);
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1790H)) - this.f1788F)) <= this.f1794L || Math.abs(xVelocity) <= this.f1792J) {
                        scrollX = i + ((int) ((i >= this.f1811i ? 0.4f : 0.6f) + f));
                    } else {
                        if (xVelocity <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.f1807e.size() > 0) {
                        scrollX = Math.max(((be) this.f1807e.get(0)).f1870b, Math.min(scrollX, ((be) this.f1807e.get(this.f1807e.size() - 1)).f1870b));
                    }
                    m1735a(scrollX, true, true, xVelocity);
                    z = m1751h();
                    break;
                }
                break;
            case 2:
                if (!this.f1827y) {
                    i = motionEvent.findPointerIndex(this.f1790H);
                    if (i == -1) {
                        z = m1751h();
                        break;
                    }
                    float x2 = motionEvent.getX(i);
                    f = Math.abs(x2 - this.f1786D);
                    float y = motionEvent.getY(i);
                    x = Math.abs(y - this.f1787E);
                    if (f > ((float) this.f1785C) && f > x) {
                        this.f1827y = true;
                        m1752i();
                        if (x2 - this.f1788F > 0.0f) {
                            x = this.f1788F + ((float) this.f1785C);
                        } else {
                            x = this.f1788F - ((float) this.f1785C);
                        }
                        this.f1786D = x;
                        this.f1787E = y;
                        m1756a(1);
                        m1743b(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f1827y) {
                    z = m1739a(motionEvent.getX(motionEvent.findPointerIndex(this.f1790H))) | 0;
                    break;
                }
                break;
            case 3:
                if (this.f1827y) {
                    m1733a(this.f1811i, true, 0, false);
                    z = m1751h();
                    break;
                }
                break;
            case 5:
                i = motionEvent.getActionIndex();
                this.f1786D = motionEvent.getX(i);
                this.f1790H = motionEvent.getPointerId(i);
                break;
            case 6:
                m1737a(motionEvent);
                this.f1786D = motionEvent.getX(motionEvent.findPointerIndex(this.f1790H));
                break;
        }
        if (z) {
            ai.f1848a.mo391c(this);
        }
        return true;
    }

    private final boolean m1751h() {
        this.f1790H = -1;
        this.f1827y = false;
        this.f1828z = false;
        if (this.f1791I != null) {
            this.f1791I.recycle();
            this.f1791I = null;
        }
        this.f1797O.onRelease();
        this.f1798P.onRelease();
        if (this.f1797O.isFinished() || this.f1798P.isFinished()) {
            return true;
        }
        return false;
    }

    private final void m1752i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final boolean m1739a(float f) {
        float f2;
        boolean z = true;
        float f3 = this.f1786D - f;
        this.f1786D = f;
        float scrollX = ((float) getScrollX()) + f3;
        int f4 = m1748f();
        float f5 = ((float) f4) * this.f1820r;
        float f6 = ((float) f4) * this.f1821s;
        be beVar = (be) this.f1807e.get(0);
        be beVar2 = (be) this.f1807e.get(this.f1807e.size() - 1);
        if (beVar.f1870b != 0) {
            f5 = beVar.f1873e * ((float) f4);
            int i = 0;
        } else {
            boolean z2 = true;
        }
        if (beVar2.f1870b != this.f1810h.mo961a() - 1) {
            f2 = beVar2.f1873e * ((float) f4);
            int i2 = 0;
        } else {
            f2 = f6;
            boolean z3 = true;
        }
        if (scrollX < f5) {
            if (i != 0) {
                this.f1797O.onPull(Math.abs(f5 - scrollX) / ((float) f4));
            } else {
                z = false;
            }
        } else if (scrollX > f2) {
            if (i2 != 0) {
                this.f1798P.onPull(Math.abs(scrollX - f2) / ((float) f4));
            } else {
                z = false;
            }
            f5 = f2;
        } else {
            f5 = scrollX;
            z = false;
        }
        this.f1786D += f5 - ((float) ((int) f5));
        scrollTo((int) f5, getScrollY());
        m1745d((int) f5);
        return z;
    }

    private final be m1753j() {
        float f;
        int f2 = m1748f();
        float scrollX = f2 > 0 ? ((float) getScrollX()) / ((float) f2) : 0.0f;
        if (f2 > 0) {
            f = ((float) this.f1816n) / ((float) f2);
        } else {
            f = 0.0f;
        }
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        be beVar = null;
        while (i2 < this.f1807e.size()) {
            int i3;
            be beVar2;
            be beVar3 = (be) this.f1807e.get(i2);
            be beVar4;
            if (obj != null || beVar3.f1870b == i + 1) {
                beVar4 = beVar3;
                i3 = i2;
                beVar2 = beVar4;
            } else {
                beVar3 = this.f1808f;
                beVar3.f1873e = (f3 + f4) + f;
                beVar3.f1870b = i + 1;
                beVar3.f1872d = this.f1810h.mo1376b(beVar3.f1870b);
                beVar4 = beVar3;
                i3 = i2 - 1;
                beVar2 = beVar4;
            }
            f3 = beVar2.f1873e;
            f4 = (beVar2.f1872d + f3) + f;
            if (obj == null && scrollX < f3) {
                return beVar;
            }
            if (scrollX < f4 || i3 == this.f1807e.size() - 1) {
                return beVar2;
            }
            f4 = f3;
            i = beVar2.f1870b;
            obj = null;
            f3 = beVar2.f1872d;
            beVar = beVar2;
            i2 = i3 + 1;
        }
        return beVar;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f1810h != null && this.f1810h.mo961a() > 1)) {
            int width;
            if (!this.f1797O.isFinished()) {
                overScrollMode = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.f1820r * ((float) width));
                this.f1797O.setSize(i, width);
                i = this.f1797O.draw(canvas) | 0;
                canvas.restoreToCount(overScrollMode);
            }
            if (!this.f1798P.isFinished()) {
                overScrollMode = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f1821s + 1.0f)) * ((float) width));
                this.f1798P.setSize(height, width);
                i |= this.f1798P.draw(canvas);
                canvas.restoreToCount(overScrollMode);
            }
        } else {
            this.f1797O.finish();
            this.f1798P.finish();
        }
        if (i != 0) {
            ai.f1848a.mo391c(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1816n > 0 && this.f1817o != null && this.f1807e.size() > 0 && this.f1810h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f1816n) / ((float) width);
            be beVar = (be) this.f1807e.get(0);
            float f2 = beVar.f1873e;
            int size = this.f1807e.size();
            int i = beVar.f1870b;
            int i2 = ((be) this.f1807e.get(size - 1)).f1870b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > beVar.f1870b && i3 < size) {
                    i3++;
                    beVar = (be) this.f1807e.get(i3);
                }
                if (i4 == beVar.f1870b) {
                    f3 = (beVar.f1873e + beVar.f1872d) * ((float) width);
                    f2 = (beVar.f1873e + beVar.f1872d) + f;
                } else {
                    float b = this.f1810h.mo1376b(i4);
                    f3 = (f2 + b) * ((float) width);
                    f2 += b + f;
                }
                if (((float) this.f1816n) + f3 > ((float) scrollX)) {
                    this.f1817o.setBounds(Math.round(f3), this.f1818p, Math.round(((float) this.f1816n) + f3), this.f1819q);
                    this.f1817o.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    private final void m1737a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1790H) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f1786D = motionEvent.getX(actionIndex);
            this.f1790H = motionEvent.getPointerId(actionIndex);
            if (this.f1791I != null) {
                this.f1791I.clear();
            }
        }
    }

    private final void m1743b(boolean z) {
        if (this.f1824v != z) {
            this.f1824v = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f1810h == null) {
            return false;
        }
        int f = m1748f();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) f) * this.f1820r))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) f) * this.f1821s))) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean m1740a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m1740a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r0 = 0;
        r3 = 2;
        r1 = 1;
        r2 = super.dispatchKeyEvent(r5);
        if (r2 != 0) goto L_0x0019;
    L_0x0009:
        r2 = r5.getAction();
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r2 = r5.getKeyCode();
        switch(r2) {
            case 21: goto L_0x001b;
            case 22: goto L_0x002d;
            case 61: goto L_0x003f;
            default: goto L_0x0016;
        };
    L_0x0016:
        r2 = r0;
    L_0x0017:
        if (r2 == 0) goto L_0x001a;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        return r0;
    L_0x001b:
        r2 = r5.hasModifiers(r3);
        if (r2 == 0) goto L_0x0026;
    L_0x0021:
        r2 = r4.m1760c();
        goto L_0x0017;
    L_0x0026:
        r2 = 17;
        r2 = r4.m1749f(r2);
        goto L_0x0017;
    L_0x002d:
        r2 = r5.hasModifiers(r3);
        if (r2 == 0) goto L_0x0038;
    L_0x0033:
        r2 = r4.m1761d();
        goto L_0x0017;
    L_0x0038:
        r2 = 66;
        r2 = r4.m1749f(r2);
        goto L_0x0017;
    L_0x003f:
        r2 = r5.hasNoModifiers();
        if (r2 == 0) goto L_0x004a;
    L_0x0045:
        r2 = r4.m1749f(r3);
        goto L_0x0017;
    L_0x004a:
        r2 = r5.hasModifiers(r1);
        if (r2 == 0) goto L_0x0016;
    L_0x0050:
        r2 = r4.m1749f(r1);
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m1749f(int r10) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 66;
        r7 = 17;
        r4 = 1;
        r3 = 0;
        r2 = r9.findFocus();
        if (r2 != r9) goto L_0x003e;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r1 = android.view.FocusFinder.getInstance();
        r1 = r1.findNextFocus(r9, r0, r10);
        if (r1 == 0) goto L_0x00bc;
    L_0x0018:
        if (r1 == r0) goto L_0x00bc;
    L_0x001a:
        if (r10 != r7) goto L_0x00a0;
    L_0x001c:
        r2 = r9.f1809g;
        r2 = r9.m1729a(r2, r1);
        r2 = r2.left;
        r3 = r9.f1809g;
        r3 = r9.m1729a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x009b;
    L_0x002e:
        if (r2 < r3) goto L_0x009b;
    L_0x0030:
        r0 = r9.m1760c();
    L_0x0034:
        if (r0 == 0) goto L_0x003d;
    L_0x0036:
        r1 = android.view.SoundEffectConstants.getContantForFocusDirection(r10);
        r9.playSoundEffect(r1);
    L_0x003d:
        return r0;
    L_0x003e:
        if (r2 == 0) goto L_0x00d4;
    L_0x0040:
        r0 = r2.getParent();
    L_0x0044:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x00d7;
    L_0x0048:
        if (r0 != r9) goto L_0x007b;
    L_0x004a:
        r0 = r4;
    L_0x004b:
        if (r0 != 0) goto L_0x00d4;
    L_0x004d:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r2.getClass();
        r0 = r0.getSimpleName();
        r5.append(r0);
        r0 = r2.getParent();
    L_0x0061:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0080;
    L_0x0065:
        r2 = " => ";
        r2 = r5.append(r2);
        r6 = r0.getClass();
        r6 = r6.getSimpleName();
        r2.append(r6);
        r0 = r0.getParent();
        goto L_0x0061;
    L_0x007b:
        r0 = r0.getParent();
        goto L_0x0044;
    L_0x0080:
        r0 = "ViewPager";
        r2 = new java.lang.StringBuilder;
        r6 = "arrowScroll tried to find focus based on non-child current focused view ";
        r2.<init>(r6);
        r5 = r5.toString();
        r2 = r2.append(r5);
        r2 = r2.toString();
        android.util.Log.e(r0, r2);
        r0 = r1;
        goto L_0x000e;
    L_0x009b:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x00a0:
        if (r10 != r8) goto L_0x00d1;
    L_0x00a2:
        r2 = r9.f1809g;
        r2 = r9.m1729a(r2, r1);
        r2 = r2.left;
        r3 = r9.f1809g;
        r3 = r9.m1729a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x00b6;
    L_0x00b4:
        if (r2 <= r3) goto L_0x00cb;
    L_0x00b6:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x00bc:
        if (r10 == r7) goto L_0x00c0;
    L_0x00be:
        if (r10 != r4) goto L_0x00c6;
    L_0x00c0:
        r0 = r9.m1760c();
        goto L_0x0034;
    L_0x00c6:
        if (r10 == r8) goto L_0x00cb;
    L_0x00c8:
        r0 = 2;
        if (r10 != r0) goto L_0x00d1;
    L_0x00cb:
        r0 = r9.m1761d();
        goto L_0x0034;
    L_0x00d1:
        r0 = r3;
        goto L_0x0034;
    L_0x00d4:
        r0 = r2;
        goto L_0x000e;
    L_0x00d7:
        r0 = r3;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.f(int):boolean");
    }

    private final Rect m1729a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    public boolean m1760c() {
        if (this.f1811i <= 0) {
            return false;
        }
        m1757a(this.f1811i - 1, true);
        return true;
    }

    public boolean m1761d() {
        if (this.f1810h == null || this.f1811i >= this.f1810h.mo961a() - 1) {
            return false;
        }
        m1757a(this.f1811i + 1, true);
        return true;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    be a = m1754a(childAt);
                    if (a != null && a.f1870b == this.f1811i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                be a = m1754a(childAt);
                if (a != null && a.f1870b == this.f1811i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                be a = m1754a(childAt);
                if (a != null && a.f1870b == this.f1811i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == eq.FLAG_APPEARED_IN_PRE_LAYOUT) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                be a = m1754a(childAt);
                if (a != null && a.f1870b == this.f1811i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new bf();
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof bf) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bf(getContext(), attributeSet);
    }
}
