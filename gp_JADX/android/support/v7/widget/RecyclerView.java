package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.os.C0330d;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0130z;
import android.support.v4.view.aa;
import android.support.v4.view.ai;
import android.support.v4.view.au;
import android.support.v4.widget.ab;
import android.support.v7.p043d.C0440a;
import android.support.v7.p043d.C0441b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements C0130z {
    public static final int[] f484a = new int[]{16843830};
    public static final Interpolator aE = new ei();
    public static final int[] f485b = new int[]{16842987};
    public static final boolean f486c;
    public static final boolean f487d;
    public static final boolean f488e;
    public static final boolean f489f;
    public static final boolean f490g;
    public static final boolean f491h;
    public static final Class[] f492i = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public boolean f493A;
    public boolean f494B;
    public boolean f495C;
    public boolean f496D;
    public int f497E;
    public boolean f498F;
    public boolean f499G;
    public boolean f500H;
    public int f501I;
    public boolean f502J;
    public final AccessibilityManager f503K;
    public List f504L;
    public boolean f505M;
    public int f506N;
    public int f507O;
    public EdgeEffect f508P;
    public EdgeEffect f509Q;
    public EdgeEffect f510R;
    public EdgeEffect f511S;
    public eq f512T;
    public int f513U;
    public int f514V;
    public VelocityTracker f515W;
    public final int[] aA;
    public final int[] aB;
    public final List aC;
    public Runnable aD;
    public final ib aF;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public fc af;
    public final int ag;
    public final int ah;
    public float ai;
    public float aj;
    public boolean ak;
    public final fq al;
    public cv am;
    public cx an;
    public final fo ao;
    public fe ap;
    public List aq;
    public boolean ar;
    public boolean as;
    public es at;
    public boolean au;
    public fs av;
    public ep aw;
    public final int[] ax;
    public aa ay;
    public final int[] az;
    public final fj f516j;
    public final fh f517k;
    public SavedState f518l;
    public C0514y f519m;
    public br f520n;
    public final hz f521o;
    public boolean f522p;
    public final Runnable f523q;
    public final Rect f524r;
    public final Rect f525s;
    public final RectF f526t;
    public em f527u;
    public ew f528v;
    public fi f529w;
    public final ArrayList f530x;
    public final ArrayList f531y;
    public fd f532z;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new fk();
        public Parcelable f2977a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = ew.class.getClassLoader();
            }
            this.f2977a = parcel.readParcelable(classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2977a, 0);
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.f516j = new fj(this);
        this.f517k = new fh(this);
        this.f521o = new hz();
        this.f523q = new eg(this);
        this.f524r = new Rect();
        this.f525s = new Rect();
        this.f526t = new RectF();
        this.f530x = new ArrayList();
        this.f531y = new ArrayList();
        this.f497E = 0;
        this.f505M = false;
        this.f506N = 0;
        this.f507O = 0;
        this.f512T = new bx();
        this.f513U = 0;
        this.f514V = -1;
        this.ai = Float.MIN_VALUE;
        this.aj = Float.MIN_VALUE;
        this.ak = true;
        this.al = new fq(this);
        this.an = f489f ? new cx() : null;
        this.ao = new fo();
        this.ar = false;
        this.as = false;
        this.at = new eu(this);
        this.au = false;
        this.ax = new int[2];
        this.az = new int[2];
        this.aA = new int[2];
        this.aB = new int[2];
        this.aC = new ArrayList();
        this.aD = new eh(this);
        this.aF = new ej(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f485b, i, 0);
            this.f522p = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f522p = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ae = viewConfiguration.getScaledTouchSlop();
        this.ai = au.m1956a(viewConfiguration, context);
        this.aj = au.m1957b(viewConfiguration, context);
        this.ag = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ah = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f512T.setListener(this.at);
        this.f519m = new C0514y(new el(this));
        this.f520n = new br(new ek(this));
        if (ai.f1848a.mo392d(this) == 0) {
            ai.m1838b((View) this, 1);
        }
        this.f503K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fs(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0441b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0441b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0441b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f495C = obtainStyledAttributes2.getBoolean(C0441b.RecyclerView_fastScrollEnabled, false);
            if (this.f495C) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(C0441b.RecyclerView_fastScrollVerticalThumbDrawable);
                Drawable drawable = obtainStyledAttributes2.getDrawable(C0441b.RecyclerView_fastScrollVerticalTrackDrawable);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(C0441b.RecyclerView_fastScrollHorizontalThumbDrawable);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(C0441b.RecyclerView_fastScrollHorizontalTrackDrawable);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m276a());
                }
                Resources resources = getContext().getResources();
                cl clVar = new cl(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0440a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0440a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0440a.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    String str;
                    if (trim.charAt(0) == '.') {
                        str = context.getPackageName() + trim;
                    } else if (trim.contains(".")) {
                        str = trim;
                    } else {
                        str = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        ClassLoader classLoader;
                        Object[] objArr;
                        Constructor constructor;
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(str).asSubclass(ew.class);
                        try {
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                            constructor = asSubclass.getConstructor(f492i);
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((ew) constructor.newInstance(objArr));
                    } catch (Throwable e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                    } catch (Throwable e3) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e3);
                    } catch (Throwable e32) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e32);
                    } catch (Throwable e322) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e322);
                    } catch (Throwable e3222) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e3222);
                    } catch (Throwable e32222) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e32222);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f484a, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
            z = true;
        } else {
            setDescendantFocusability(262144);
            z = true;
        }
        setNestedScrollingEnabled(z);
    }

    final String m276a() {
        return " " + super.toString() + ", adapter:" + this.f527u + ", layout:" + this.f528v + ", context:" + getContext();
    }

    public fs getCompatAccessibilityDelegate() {
        return this.av;
    }

    public void setAccessibilityDelegateCompat(fs fsVar) {
        this.av = fsVar;
        ai.m1829a((View) this, this.av);
    }

    public void setHasFixedSize(boolean z) {
        this.f494B = z;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f522p) {
            mo2965v();
        }
        this.f522p = z;
        super.setClipToPadding(z);
        if (this.f496D) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.f522p;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.ae = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.ae = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(em emVar) {
        setLayoutFrozen(false);
        if (this.f527u != null) {
            this.f527u.mo5197b(this.f516j);
            this.f527u.mo2579b(this);
        }
        bY_();
        this.f519m.m3911a();
        em emVar2 = this.f527u;
        this.f527u = emVar;
        if (emVar != null) {
            emVar.mo5196a(this.f516j);
            emVar.mo2578a(this);
        }
        if (this.f528v != null) {
            this.f528v.mo4460a(emVar2, this.f527u);
        }
        fh fhVar = this.f517k;
        em emVar3 = this.f527u;
        fhVar.m3684a();
        ff d = fhVar.m3694d();
        if (emVar2 != null) {
            d.m3677c();
        }
        if (d.f3442b == 0) {
            d.mo2354a();
        }
        if (emVar3 != null) {
            d.m3675b();
        }
        this.ao.f3470g = true;
        m316p();
        requestLayout();
    }

    final void bY_() {
        if (this.f512T != null) {
            this.f512T.endAnimations();
        }
        if (this.f528v != null) {
            this.f528v.m3040c(this.f517k);
            this.f528v.m3033b(this.f517k);
        }
        this.f517k.m3684a();
    }

    public em getAdapter() {
        return this.f527u;
    }

    public void setRecyclerListener(fi fiVar) {
        this.f529w = fiVar;
    }

    public int getBaseline() {
        if (this.f528v != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void setLayoutManager(ew ewVar) {
        if (ewVar != this.f528v) {
            m303f();
            if (this.f528v != null) {
                if (this.f512T != null) {
                    this.f512T.endAnimations();
                }
                this.f528v.m3040c(this.f517k);
                this.f528v.m3033b(this.f517k);
                this.f517k.m3684a();
                if (this.f493A) {
                    this.f528v.mo730a(this, this.f517k);
                }
                this.f528v.m3031b(null);
                this.f528v = null;
            } else {
                this.f517k.m3684a();
            }
            br brVar = this.f520n;
            bs bsVar = brVar.f3230b;
            while (true) {
                bsVar.f3232a = 0;
                if (bsVar.f3233b == null) {
                    break;
                }
                bsVar = bsVar.f3233b;
            }
            for (int size = brVar.f3231c.size() - 1; size >= 0; size--) {
                brVar.f3229a.mo857d((View) brVar.f3231c.get(size));
                brVar.f3231c.remove(size);
            }
            brVar.f3229a.mo854b();
            this.f528v = ewVar;
            if (ewVar != null) {
                if (ewVar.f2960y != null) {
                    throw new IllegalArgumentException("LayoutManager " + ewVar + " is already attached to a RecyclerView:" + ewVar.f2960y.m276a());
                }
                this.f528v.m3031b(this);
                if (this.f493A) {
                    this.f528v.mo4462n();
                }
            }
            this.f517k.m3688b();
            requestLayout();
        }
    }

    public void setOnFlingListener(fc fcVar) {
        this.af = fcVar;
    }

    public fc getOnFlingListener() {
        return this.af;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f518l != null) {
            savedState.f2977a = this.f518l.f2977a;
        } else if (this.f528v != null) {
            savedState.f2977a = this.f528v.mo742d();
        } else {
            savedState.f2977a = null;
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f518l = (SavedState) parcelable;
            super.onRestoreInstanceState(this.f518l.f542e);
            if (this.f528v != null && this.f518l.f2977a != null) {
                this.f528v.mo728a(this.f518l.f2977a);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    final void m280a(fr frVar) {
        View view = frVar.f3211a;
        boolean z = view.getParent() == this;
        this.f517k.m3690b(m275a(view));
        if (frVar.m3277n()) {
            this.f520n.m3329a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            br brVar = this.f520n;
            int a = brVar.f3229a.mo848a(view);
            if (a < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            brVar.f3230b.m3339a(a);
            brVar.m3328a(view);
        } else {
            this.f520n.m3330a(view, -1, true);
        }
    }

    public ew getLayoutManager() {
        return this.f528v;
    }

    public ff getRecycledViewPool() {
        return this.f517k.m3694d();
    }

    public void setRecycledViewPool(ff ffVar) {
        fh fhVar = this.f517k;
        if (fhVar.f3453g != null) {
            fhVar.f3453g.m3677c();
        }
        fhVar.f3453g = ffVar;
        if (ffVar != null) {
            ff ffVar2 = fhVar.f3453g;
            fhVar.f3455i.getAdapter();
            ffVar2.m3675b();
        }
    }

    public void setViewCacheExtension(fp fpVar) {
        this.f517k.f3454h = fpVar;
    }

    public void setItemViewCacheSize(int i) {
        fh fhVar = this.f517k;
        fhVar.f3451e = i;
        fhVar.m3688b();
    }

    public int getScrollState() {
        return this.f513U;
    }

    final void m_(int i) {
        if (i != this.f513U) {
            this.f513U = i;
            if (i != 2) {
                mo2964u();
            }
            mo2954g(i);
            if (this.ap != null) {
                this.ap.mo2913a(this, i);
            }
            if (this.aq != null) {
                for (int size = this.aq.size() - 1; size >= 0; size--) {
                    ((fe) this.aq.get(size)).mo2913a(this, i);
                }
            }
        }
    }

    public final void m278a(ev evVar) {
        if (this.f528v != null) {
            this.f528v.mo733a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f530x.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f530x.add(evVar);
        m315o();
        requestLayout();
    }

    public int getItemDecorationCount() {
        return this.f530x.size();
    }

    public void setChildDrawingOrderCallback(ep epVar) {
        if (epVar != this.aw) {
            this.aw = epVar;
            setChildrenDrawingOrderEnabled(this.aw != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(fe feVar) {
        this.ap = feVar;
    }

    public void mo2951a(fe feVar) {
        if (this.aq == null) {
            this.aq = new ArrayList();
        }
        this.aq.add(feVar);
    }

    public void mo2952b(fe feVar) {
        if (this.aq != null) {
            this.aq.remove(feVar);
        }
    }

    public void mo5180c() {
        if (this.aq != null) {
            this.aq.clear();
        }
    }

    public void mo2963c(int i) {
        if (!this.f499G) {
            m303f();
            if (this.f528v == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            this.f528v.mo743d(i);
            awakenScrollBars();
        }
    }

    final void m296d(int i) {
        if (this.f528v != null) {
            this.f528v.mo743d(i);
            awakenScrollBars();
        }
    }

    public void mo5181e(int i) {
        if (!this.f499G) {
            if (this.f528v == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.f528v.mo729a(this, i);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        if (this.f528v == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f499G) {
            boolean e = this.f528v.mo745e();
            boolean f = this.f528v.mo747f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                m257a(i, i2, null);
            }
        }
    }

    final void m295d() {
        boolean z = false;
        if (!this.f496D || this.f505M) {
            C0330d.m1728a("RV FullInvalidate");
            m243B();
            C0330d.m1727a();
        } else if (!this.f519m.m3917d()) {
        } else {
            if (this.f519m.m3913a(4) && !this.f519m.m3913a(11)) {
                C0330d.m1728a("RV PartialInvalidate");
                m298e();
                m311k();
                this.f519m.m3915b();
                if (!this.f498F) {
                    int a = this.f520n.m3326a();
                    for (int i = 0; i < a; i++) {
                        fr c = m261c(this.f520n.m3332b(i));
                        if (c != null && !c.m3265b() && c.m3282s()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        m243B();
                    } else {
                        this.f519m.m3916c();
                    }
                }
                m283a(true);
                m289b(true);
                C0330d.m1727a();
            } else if (this.f519m.m3917d()) {
                C0330d.m1728a("RV FullInvalidate");
                m243B();
                C0330d.m1727a();
            }
        }
    }

    private final boolean m257a(int i, int i2, MotionEvent motionEvent) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        m295d();
        if (this.f527u != null) {
            m298e();
            m311k();
            C0330d.m1728a("RV Scroll");
            m314n();
            if (i != 0) {
                i5 = this.f528v.mo723a(i, this.f517k, this.ao);
                i3 = i - i5;
            }
            if (i2 != 0) {
                i6 = this.f528v.mo734b(i2, this.f517k, this.ao);
                i4 = i2 - i6;
            }
            C0330d.m1727a();
            m318r();
            m289b(true);
            m283a(false);
        }
        int i7 = i4;
        i4 = i5;
        i5 = i6;
        if (!this.f530x.isEmpty()) {
            invalidate();
        }
        if (m284a(i4, i5, i3, i7, this.az, 0)) {
            this.ac -= this.az[0];
            this.ad -= this.az[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.az[0], (float) this.az[1]);
            }
            int[] iArr = this.aB;
            iArr[0] = iArr[0] + this.az[0];
            iArr = this.aB;
            iArr[1] = iArr[1] + this.az[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (((motionEvent.getSource() & 8194) == 8194 ? 1 : null) == null) {
                    float x = motionEvent.getX();
                    float f = (float) i3;
                    float y = motionEvent.getY();
                    float f2 = (float) i7;
                    Object obj = null;
                    if (f < 0.0f) {
                        m305g();
                        ab.m2153a(this.f508P, (-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
                        obj = 1;
                    } else if (f > 0.0f) {
                        m307h();
                        ab.m2153a(this.f510R, f / ((float) getWidth()), y / ((float) getHeight()));
                        obj = 1;
                    }
                    if (f2 < 0.0f) {
                        m309i();
                        ab.m2153a(this.f509Q, (-f2) / ((float) getHeight()), x / ((float) getWidth()));
                        obj = 1;
                    } else if (f2 > 0.0f) {
                        m310j();
                        ab.m2153a(this.f511S, f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                        obj = 1;
                    }
                    if (!(obj == null && f == 0.0f && f2 == 0.0f)) {
                        ai.f1848a.mo391c(this);
                    }
                }
            }
            m294c(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            m304f(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        if (this.f528v != null && this.f528v.mo745e()) {
            return this.f528v.mo735b(this.ao);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        if (this.f528v != null && this.f528v.mo745e()) {
            return this.f528v.mo741d(this.ao);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.f528v != null && this.f528v.mo745e()) {
            return this.f528v.mo746f(this.ao);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.f528v != null && this.f528v.mo747f()) {
            return this.f528v.mo737c(this.ao);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.f528v != null && this.f528v.mo747f()) {
            return this.f528v.mo744e(this.ao);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.f528v != null && this.f528v.mo747f()) {
            return this.f528v.mo748g(this.ao);
        }
        return 0;
    }

    final void m298e() {
        this.f497E++;
        if (this.f497E == 1 && !this.f499G) {
            this.f498F = false;
        }
    }

    final void m283a(boolean z) {
        if (this.f497E <= 0) {
            this.f497E = 1;
        }
        if (!z) {
            this.f498F = false;
        }
        if (this.f497E == 1) {
            if (!(!z || !this.f498F || this.f499G || this.f528v == null || this.f527u == null)) {
                m243B();
            }
            if (!this.f499G) {
                this.f498F = false;
            }
        }
        this.f497E--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f499G) {
            m282a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f499G = true;
                this.f500H = true;
                m303f();
                return;
            }
            this.f499G = false;
            if (!(!this.f498F || this.f528v == null || this.f527u == null)) {
                requestLayout();
            }
            this.f498F = false;
        }
    }

    public final void b_(int i, int i2) {
        int i3 = 0;
        if (this.f528v == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f499G) {
            if (!this.f528v.mo745e()) {
                i = 0;
            }
            if (this.f528v.mo747f()) {
                i3 = i2;
            }
            if (i != 0 || i3 != 0) {
                fq fqVar = this.al;
                fqVar.m3713a(i, i3, fqVar.m3710a(i, i3), aE);
            }
        }
    }

    public boolean mo2962b(int i, int i2) {
        if (this.f528v == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f499G) {
            return false;
        } else {
            boolean e = this.f528v.mo745e();
            boolean f = this.f528v.mo747f();
            if (!e || Math.abs(i) < this.ag) {
                i = 0;
            }
            if (!f || Math.abs(i2) < this.ag) {
                i2 = 0;
            }
            if ((i == 0 && i2 == 0) || dispatchNestedPreFling((float) i, (float) i2)) {
                return false;
            }
            boolean z;
            if (e || f) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling((float) i, (float) i2, z);
            if (this.af != null && this.af.m3668a()) {
                return true;
            }
            if (!z) {
                return false;
            }
            int i3;
            if (e) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (f) {
                i3 |= 2;
            }
            mo3605g(i3, 1);
            int max = Math.max(-this.ah, Math.min(i, this.ah));
            int max2 = Math.max(-this.ah, Math.min(i2, this.ah));
            fq fqVar = this.al;
            fqVar.f3484g.m_(2);
            fqVar.f3479b = 0;
            fqVar.f3478a = 0;
            fqVar.f3480c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            fqVar.m3711a();
            return true;
        }
    }

    public final void m303f() {
        m_(0);
        mo2964u();
    }

    private final void mo2964u() {
        this.al.m3714b();
        if (this.f528v != null) {
            ew ewVar = this.f528v;
            if (ewVar.f2948D != null) {
                ewVar.f2948D.m3517d();
            }
        }
    }

    public int getMinFlingVelocity() {
        return this.ag;
    }

    public int getMaxFlingVelocity() {
        return this.ah;
    }

    final void m294c(int i, int i2) {
        int i3 = 0;
        if (!(this.f508P == null || this.f508P.isFinished() || i <= 0)) {
            this.f508P.onRelease();
            i3 = this.f508P.isFinished();
        }
        if (!(this.f510R == null || this.f510R.isFinished() || i >= 0)) {
            this.f510R.onRelease();
            i3 |= this.f510R.isFinished();
        }
        if (!(this.f509Q == null || this.f509Q.isFinished() || i2 <= 0)) {
            this.f509Q.onRelease();
            i3 |= this.f509Q.isFinished();
        }
        if (!(this.f511S == null || this.f511S.isFinished() || i2 >= 0)) {
            this.f511S.onRelease();
            i3 |= this.f511S.isFinished();
        }
        if (i3 != 0) {
            ai.f1848a.mo391c(this);
        }
    }

    final void m305g() {
        if (this.f508P == null) {
            this.f508P = new EdgeEffect(getContext());
            if (this.f522p) {
                this.f508P.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f508P.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    final void m307h() {
        if (this.f510R == null) {
            this.f510R = new EdgeEffect(getContext());
            if (this.f522p) {
                this.f510R.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f510R.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    final void m309i() {
        if (this.f509Q == null) {
            this.f509Q = new EdgeEffect(getContext());
            if (this.f522p) {
                this.f509Q.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f509Q.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    final void m310j() {
        if (this.f511S == null) {
            this.f511S = new EdgeEffect(getContext());
            if (this.f522p) {
                this.f511S.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f511S.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private final void mo2965v() {
        this.f511S = null;
        this.f509Q = null;
        this.f510R = null;
        this.f508P = null;
    }

    public View focusSearch(View view, int i) {
        boolean z = true;
        boolean z2 = true;
        View a = this.f528v.m2997a(view, i);
        if (a != null) {
            return a;
        }
        int i2;
        int i3;
        View findNextFocus;
        boolean z3 = (this.f527u == null || this.f528v == null || mo2960y() || this.f499G) ? false : true;
        FocusFinder instance = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            boolean z4;
            if (this.f528v.mo747f()) {
                i2 = i == 2 ? 130 : 33;
                if (instance.findNextFocus(this, view, i2) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (f490g) {
                    i = i2;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f528v.mo745e()) {
                if (ai.f1848a.mo400k(this.f528v.f2960y) == 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i2 = (i2 ^ i3) != 0 ? 66 : 17;
                if (instance.findNextFocus(this, view, i2) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (f490g) {
                    i = i2;
                }
            }
            if (z4) {
                m295d();
                if (m287b(view) == null) {
                    return null;
                }
                m298e();
                this.f528v.mo725a(view, i, this.f517k, this.ao);
                m283a(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i);
        } else {
            findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                m295d();
                if (m287b(view) == null) {
                    return null;
                }
                m298e();
                findNextFocus = this.f528v.mo725a(view, i, this.f517k, this.ao);
                m283a(false);
            }
        }
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (findNextFocus == null || findNextFocus == this) {
                z2 = false;
            } else if (view != null) {
                this.f524r.set(0, 0, view.getWidth(), view.getHeight());
                this.f525s.set(0, 0, findNextFocus.getWidth(), findNextFocus.getHeight());
                offsetDescendantRectToMyCoords(view, this.f524r);
                offsetDescendantRectToMyCoords(findNextFocus, this.f525s);
                i2 = ai.f1848a.mo400k(this.f528v.f2960y) == 1 ? -1 : 1;
                if ((this.f524r.left < this.f525s.left || this.f524r.right <= this.f525s.left) && this.f524r.right < this.f525s.right) {
                    i3 = 1;
                } else if ((this.f524r.right > this.f525s.right || this.f524r.left >= this.f525s.right) && this.f524r.left > this.f525s.left) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                if ((this.f524r.top < this.f525s.top || this.f524r.bottom <= this.f525s.top) && this.f524r.bottom < this.f525s.bottom) {
                    z = true;
                } else if ((this.f524r.bottom <= this.f525s.bottom && this.f524r.top < this.f525s.bottom) || this.f524r.top <= this.f525s.top) {
                    z = false;
                }
                switch (i) {
                    case 1:
                        if (z < false && (z || i2 * i3 > 0)) {
                            z2 = false;
                            break;
                        }
                    case 2:
                        if (z > false && (z || i2 * i3 < 0)) {
                            z2 = false;
                            break;
                        }
                    case 17:
                        if (i3 >= 0) {
                            z2 = false;
                            break;
                        }
                        break;
                    case 33:
                        if (z < false) {
                            z2 = false;
                            break;
                        }
                        break;
                    case 66:
                        if (i3 <= 0) {
                            z2 = false;
                            break;
                        }
                        break;
                    case 130:
                        if (z > false) {
                            z2 = false;
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid direction: " + i + m276a());
                }
            }
            if (z2) {
                return findNextFocus;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m255a(findNextFocus, null);
            return view;
        }
    }

    public void requestChildFocus(View view, View view2) {
        Object obj = null;
        ew ewVar = this.f528v;
        Object obj2 = (ewVar.f2948D == null || !ewVar.f2948D.f3400k) ? null : 1;
        if (obj2 != null || mo2960y()) {
            obj = 1;
        }
        if (obj == null && view2 != null) {
            m255a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private final void m255a(View view, View view2) {
        boolean z = true;
        View view3 = view2 != null ? view2 : view;
        this.f524r.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof fa) {
            fa faVar = (fa) layoutParams;
            if (!faVar.f3358e) {
                Rect rect = faVar.f3357d;
                Rect rect2 = this.f524r;
                rect2.left -= rect.left;
                rect2 = this.f524r;
                rect2.right += rect.right;
                rect2 = this.f524r;
                rect2.top -= rect.top;
                rect2 = this.f524r;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f524r);
            offsetRectIntoDescendantCoords(view, this.f524r);
        }
        ew ewVar = this.f528v;
        Rect rect3 = this.f524r;
        boolean z2 = !this.f496D;
        if (view2 != null) {
            z = false;
        }
        ewVar.m3022a(this, view, rect3, z2, z);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f528v.m3022a(this, view, rect, z, false);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo2960y()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        super.onAttachedToWindow();
        r4.f506N = r1;
        r4.f493A = r0;
        r2 = r4.f496D;
        if (r2 == 0) goto L_0x006c;
    L_0x000d:
        r2 = r4.isLayoutRequested();
        if (r2 != 0) goto L_0x006c;
    L_0x0013:
        r4.f496D = r0;
        r0 = r4.f528v;
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r4.f528v;
        r0.mo4462n();
    L_0x001e:
        r4.au = r1;
        r0 = f489f;
        if (r0 == 0) goto L_0x006b;
    L_0x0024:
        r0 = android.support.v7.widget.cv.f3331a;
        r0 = r0.get();
        r0 = (android.support.v7.widget.cv) r0;
        r4.am = r0;
        r0 = r4.am;
        if (r0 != 0) goto L_0x0064;
    L_0x0032:
        r0 = new android.support.v7.widget.cv;
        r0.<init>();
        r4.am = r0;
        r0 = android.support.v4.view.ai.f1848a;
        r0 = r0.mo405p(r4);
        r1 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r2 = r4.isInEditMode();
        if (r2 != 0) goto L_0x006e;
    L_0x0047:
        if (r0 == 0) goto L_0x006e;
    L_0x0049:
        r0 = r0.getRefreshRate();
        r2 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x006e;
    L_0x0053:
        r1 = r4.am;
        r2 = 1315859240; // 0x4e6e6b28 float:1.0E9 double:6.50120845E-315;
        r0 = r2 / r0;
        r2 = (long) r0;
        r1.f3335d = r2;
        r0 = android.support.v7.widget.cv.f3331a;
        r1 = r4.am;
        r0.set(r1);
    L_0x0064:
        r0 = r4.am;
        r0 = r0.f3333b;
        r0.add(r4);
    L_0x006b:
        return;
    L_0x006c:
        r0 = r1;
        goto L_0x0013;
    L_0x006e:
        r0 = r1;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f512T != null) {
            this.f512T.endAnimations();
        }
        m303f();
        this.f493A = false;
        if (this.f528v != null) {
            this.f528v.mo730a(this, this.f517k);
        }
        this.aC.clear();
        removeCallbacks(this.aD);
        do {
        } while (ia.f3619d.mo381a() != null);
        if (f489f) {
            this.am.f3333b.remove(this);
            this.am = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f493A;
    }

    final void m282a(String str) {
        if (mo2960y()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m276a());
            }
            throw new IllegalStateException(str);
        } else if (this.f507O > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m276a()));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f499G) {
            return false;
        }
        boolean z;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f532z = null;
        }
        int size = this.f531y.size();
        for (int i = 0; i < size; i++) {
            fd fdVar = (fd) this.f531y.get(i);
            if (fdVar.mo788a(motionEvent) && action != 3) {
                this.f532z = fdVar;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            mo2959x();
            return true;
        } else if (this.f528v == null) {
            return false;
        } else {
            z = this.f528v.mo745e();
            boolean f = this.f528v.mo747f();
            if (this.f515W == null) {
                this.f515W = VelocityTracker.obtain();
            }
            this.f515W.addMovement(motionEvent);
            action = motionEvent.getActionMasked();
            size = motionEvent.getActionIndex();
            int i2;
            switch (action) {
                case 0:
                    if (this.f500H) {
                        this.f500H = false;
                    }
                    this.f514V = motionEvent.getPointerId(0);
                    action = (int) (motionEvent.getX() + 0.5f);
                    this.ac = action;
                    this.aa = action;
                    action = (int) (motionEvent.getY() + 0.5f);
                    this.ad = action;
                    this.ab = action;
                    if (this.f513U == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m_(1);
                    }
                    int[] iArr = this.aB;
                    this.aB[1] = 0;
                    iArr[0] = 0;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (f) {
                        i2 |= 2;
                    }
                    mo3605g(i2, 0);
                    break;
                case 1:
                    this.f515W.clear();
                    n_(0);
                    break;
                case 2:
                    action = motionEvent.findPointerIndex(this.f514V);
                    if (action >= 0) {
                        size = (int) (motionEvent.getX(action) + 0.5f);
                        action = (int) (motionEvent.getY(action) + 0.5f);
                        if (this.f513U != 1) {
                            int i3 = size - this.aa;
                            int i4 = action - this.ab;
                            if (!z || Math.abs(i3) <= this.ae) {
                                z = false;
                            } else {
                                this.ac = size;
                                z = true;
                            }
                            if (f && Math.abs(i4) > this.ae) {
                                this.ad = action;
                                z = true;
                            }
                            if (z) {
                                m_(1);
                                break;
                            }
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f514V + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    mo2959x();
                    break;
                case 5:
                    this.f514V = motionEvent.getPointerId(size);
                    i2 = (int) (motionEvent.getX(size) + 0.5f);
                    this.ac = i2;
                    this.aa = i2;
                    i2 = (int) (motionEvent.getY(size) + 0.5f);
                    this.ad = i2;
                    this.ab = i2;
                    break;
                case 6:
                    m253a(motionEvent);
                    break;
            }
            if (this.f513U == 1) {
                return true;
            }
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f531y.size();
        for (int i = 0; i < size; i++) {
            ((fd) this.f531y.get(i)).mo787a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f499G || this.f500H) {
            return false;
        }
        boolean z2;
        boolean e;
        boolean f;
        MotionEvent obtain;
        int actionIndex;
        float f2;
        int x;
        int y;
        int i;
        int i2;
        int action = motionEvent.getAction();
        if (this.f532z != null) {
            if (action == 0) {
                this.f532z = null;
            } else {
                this.f532z.mo790b(motionEvent);
                if (action == 3 || action == 1) {
                    this.f532z = null;
                }
                z2 = true;
                if (z2) {
                    mo2959x();
                    return true;
                } else if (this.f528v != null) {
                    return false;
                } else {
                    e = this.f528v.mo745e();
                    f = this.f528v.mo747f();
                    if (this.f515W == null) {
                        this.f515W = VelocityTracker.obtain();
                    }
                    obtain = MotionEvent.obtain(motionEvent);
                    action = motionEvent.getActionMasked();
                    actionIndex = motionEvent.getActionIndex();
                    if (action == 0) {
                        int[] iArr = this.aB;
                        this.aB[1] = 0;
                        iArr[0] = 0;
                    }
                    obtain.offsetLocation((float) this.aB[0], (float) this.aB[1]);
                    switch (action) {
                        case 0:
                            this.f514V = motionEvent.getPointerId(0);
                            action = (int) (motionEvent.getX() + 0.5f);
                            this.ac = action;
                            this.aa = action;
                            action = (int) (motionEvent.getY() + 0.5f);
                            this.ad = action;
                            this.ab = action;
                            if (e) {
                                action = 0;
                            } else {
                                action = 1;
                            }
                            if (f) {
                                action |= 2;
                            }
                            mo3605g(action, 0);
                            break;
                        case 1:
                            this.f515W.addMovement(obtain);
                            this.f515W.computeCurrentVelocity(1000, (float) this.ah);
                            float f3 = e ? -this.f515W.getXVelocity(this.f514V) : 0.0f;
                            if (f) {
                                f2 = 0.0f;
                            } else {
                                f2 = -this.f515W.getYVelocity(this.f514V);
                            }
                            if ((f3 == 0.0f && r0 == 0.0f) || !mo2962b((int) f3, (int) r0)) {
                                m_(0);
                            }
                            mo2966w();
                            z = true;
                            break;
                        case 2:
                            action = motionEvent.findPointerIndex(this.f514V);
                            if (action < 0) {
                                x = (int) (motionEvent.getX(action) + 0.5f);
                                y = (int) (motionEvent.getY(action) + 0.5f);
                                i = this.ac - x;
                                actionIndex = this.ad - y;
                                if (m285a(i, actionIndex, this.aA, this.az, 0)) {
                                    i -= this.aA[0];
                                    actionIndex -= this.aA[1];
                                    obtain.offsetLocation((float) this.az[0], (float) this.az[1]);
                                    int[] iArr2 = this.aB;
                                    iArr2[0] = iArr2[0] + this.az[0];
                                    iArr2 = this.aB;
                                    iArr2[1] = iArr2[1] + this.az[1];
                                }
                                if (this.f513U != 1) {
                                    if (e || Math.abs(i) <= this.ae) {
                                        z2 = false;
                                    } else {
                                        if (i > 0) {
                                            action = i - this.ae;
                                        } else {
                                            action = this.ae + i;
                                        }
                                        i = action;
                                        z2 = true;
                                    }
                                    if (f && Math.abs(actionIndex) > this.ae) {
                                        if (actionIndex <= 0) {
                                            action = actionIndex - this.ae;
                                        } else {
                                            action = this.ae + actionIndex;
                                        }
                                        actionIndex = action;
                                        z2 = true;
                                    }
                                    if (z2) {
                                        m_(1);
                                    }
                                }
                                if (this.f513U == 1) {
                                    this.ac = x - this.az[0];
                                    this.ad = y - this.az[1];
                                    if (e) {
                                        i2 = 0;
                                    } else {
                                        i2 = i;
                                    }
                                    if (m257a(i2, f ? actionIndex : 0, obtain)) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    if (!(this.am == null || (i == 0 && actionIndex == 0))) {
                                        this.am.m3426a(this, i, actionIndex);
                                        break;
                                    }
                                }
                            }
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f514V + " not found. Did any MotionEvents get skipped?");
                            return false;
                            break;
                        case 3:
                            mo2959x();
                            break;
                        case 5:
                            this.f514V = motionEvent.getPointerId(actionIndex);
                            action = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.ac = action;
                            this.aa = action;
                            action = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.ad = action;
                            this.ab = action;
                            break;
                        case 6:
                            m253a(motionEvent);
                            break;
                    }
                    if (!z) {
                        this.f515W.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                }
            }
        }
        if (action != 0) {
            i2 = this.f531y.size();
            for (actionIndex = 0; actionIndex < i2; actionIndex++) {
                fd fdVar = (fd) this.f531y.get(actionIndex);
                if (fdVar.mo788a(motionEvent)) {
                    this.f532z = fdVar;
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            mo2959x();
            return true;
        } else if (this.f528v != null) {
            return false;
        } else {
            e = this.f528v.mo745e();
            f = this.f528v.mo747f();
            if (this.f515W == null) {
                this.f515W = VelocityTracker.obtain();
            }
            obtain = MotionEvent.obtain(motionEvent);
            action = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            if (action == 0) {
                int[] iArr3 = this.aB;
                this.aB[1] = 0;
                iArr3[0] = 0;
            }
            obtain.offsetLocation((float) this.aB[0], (float) this.aB[1]);
            switch (action) {
                case 0:
                    this.f514V = motionEvent.getPointerId(0);
                    action = (int) (motionEvent.getX() + 0.5f);
                    this.ac = action;
                    this.aa = action;
                    action = (int) (motionEvent.getY() + 0.5f);
                    this.ad = action;
                    this.ab = action;
                    if (e) {
                        action = 0;
                    } else {
                        action = 1;
                    }
                    if (f) {
                        action |= 2;
                    }
                    mo3605g(action, 0);
                    break;
                case 1:
                    this.f515W.addMovement(obtain);
                    this.f515W.computeCurrentVelocity(1000, (float) this.ah);
                    if (e) {
                    }
                    if (f) {
                        f2 = 0.0f;
                    } else {
                        f2 = -this.f515W.getYVelocity(this.f514V);
                    }
                    m_(0);
                    mo2966w();
                    z = true;
                    break;
                case 2:
                    action = motionEvent.findPointerIndex(this.f514V);
                    if (action < 0) {
                        x = (int) (motionEvent.getX(action) + 0.5f);
                        y = (int) (motionEvent.getY(action) + 0.5f);
                        i = this.ac - x;
                        actionIndex = this.ad - y;
                        if (m285a(i, actionIndex, this.aA, this.az, 0)) {
                            i -= this.aA[0];
                            actionIndex -= this.aA[1];
                            obtain.offsetLocation((float) this.az[0], (float) this.az[1]);
                            int[] iArr22 = this.aB;
                            iArr22[0] = iArr22[0] + this.az[0];
                            iArr22 = this.aB;
                            iArr22[1] = iArr22[1] + this.az[1];
                        }
                        if (this.f513U != 1) {
                            if (e) {
                                break;
                            }
                            z2 = false;
                            if (actionIndex <= 0) {
                                action = this.ae + actionIndex;
                            } else {
                                action = actionIndex - this.ae;
                            }
                            actionIndex = action;
                            z2 = true;
                            if (z2) {
                                m_(1);
                            }
                            break;
                        }
                        if (this.f513U == 1) {
                            this.ac = x - this.az[0];
                            this.ad = y - this.az[1];
                            if (e) {
                                i2 = 0;
                            } else {
                                i2 = i;
                            }
                            if (f) {
                            }
                            if (m257a(i2, f ? actionIndex : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            this.am.m3426a(this, i, actionIndex);
                            break;
                        }
                    }
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f514V + " not found. Did any MotionEvents get skipped?");
                    return false;
                    break;
                case 3:
                    mo2959x();
                    break;
                case 5:
                    this.f514V = motionEvent.getPointerId(actionIndex);
                    action = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.ac = action;
                    this.aa = action;
                    action = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.ad = action;
                    this.ab = action;
                    break;
                case 6:
                    m253a(motionEvent);
                    break;
            }
            if (z) {
                this.f515W.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    private final void mo2966w() {
        int i = 0;
        if (this.f515W != null) {
            this.f515W.clear();
        }
        n_(0);
        if (this.f508P != null) {
            this.f508P.onRelease();
            i = this.f508P.isFinished();
        }
        if (this.f509Q != null) {
            this.f509Q.onRelease();
            i |= this.f509Q.isFinished();
        }
        if (this.f510R != null) {
            this.f510R.onRelease();
            i |= this.f510R.isFinished();
        }
        if (this.f511S != null) {
            this.f511S.onRelease();
            i |= this.f511S.isFinished();
        }
        if (i != 0) {
            ai.f1848a.mo391c(this);
        }
    }

    private final void mo2959x() {
        mo2966w();
        m_(0);
    }

    private final void m253a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f514V) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f514V = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.ac = x;
            this.aa = x;
            actionIndex = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ad = actionIndex;
            this.ab = actionIndex;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!(this.f528v == null || this.f499G || motionEvent.getAction() != 8)) {
            float f;
            float f2;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f528v.mo747f()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.f528v.mo745e()) {
                    f2 = f;
                    f = motionEvent.getAxisValue(10);
                } else {
                    f2 = f;
                    f = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.f528v.mo747f()) {
                    f2 = -f;
                    f = 0.0f;
                } else if (this.f528v.mo745e()) {
                    f2 = 0.0f;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (!(f2 == 0.0f && f == 0.0f)) {
                m257a((int) (f * this.ai), (int) (this.aj * f2), motionEvent);
            }
        }
        return false;
    }

    public void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.f528v == null) {
            m297d(i, i2);
        } else if (this.f528v.f2950F) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE && mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                z = true;
            }
            this.f528v.m3045d(i, i2);
            if (!z && this.f527u != null) {
                if (this.ao.f3468e == 1) {
                    m246E();
                }
                this.f528v.m3030b(i, i2);
                m247F();
                this.f528v.m3037c(i, i2);
                if (this.f528v.mo749i()) {
                    this.f528v.m3030b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
                    m247F();
                    this.f528v.m3037c(i, i2);
                }
            }
        } else if (this.f494B) {
            this.f528v.m3045d(i, i2);
        } else {
            if (this.f502J) {
                m298e();
                m311k();
                m242A();
                m289b(true);
                if (this.ao.f3474k) {
                    this.ao.f3471h = true;
                } else {
                    this.f519m.m3918e();
                    this.ao.f3471h = false;
                }
                this.f502J = false;
                m283a(false);
            } else if (this.ao.f3474k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.f527u != null) {
                this.ao.f3469f = this.f527u.mo1039a();
            } else {
                this.ao.f3469f = 0;
            }
            m298e();
            this.f528v.m3045d(i, i2);
            m283a(false);
            this.ao.f3471h = false;
        }
    }

    final void m297d(int i, int i2) {
        setMeasuredDimension(ew.m2977a(i, getPaddingLeft() + getPaddingRight(), ai.f1848a.mo394f(this)), ew.m2977a(i2, getPaddingTop() + getPaddingBottom(), ai.f1848a.mo395g(this)));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo2965v();
        }
    }

    public void setItemAnimator(eq eqVar) {
        if (this.f512T != null) {
            this.f512T.endAnimations();
            this.f512T.setListener(null);
        }
        this.f512T = eqVar;
        if (this.f512T != null) {
            this.f512T.setListener(this.at);
        }
    }

    final void m311k() {
        this.f506N++;
    }

    final void m289b(boolean z) {
        this.f506N--;
        if (this.f506N <= 0) {
            this.f506N = 0;
            if (z) {
                int i = this.f501I;
                this.f501I = 0;
                if (i != 0 && m312l()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(eq.FLAG_MOVED);
                    if (VERSION.SDK_INT >= 19) {
                        obtain.setContentChangeTypes(i);
                    }
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.aC.size() - 1; size >= 0; size--) {
                    fr frVar = (fr) this.aC.get(size);
                    if (frVar.f3211a.getParent() == this && !frVar.m3265b()) {
                        int i2 = frVar.f3227r;
                        if (i2 != -1) {
                            ai.m1838b(frVar.f3211a, i2);
                            frVar.f3227r = -1;
                        }
                    }
                }
                this.aC.clear();
            }
        }
    }

    final boolean m312l() {
        return this.f503K != null && this.f503K.isEnabled();
    }

    private final boolean mo2960y() {
        return this.f506N > 0;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo2960y()) {
            int i2;
            if (accessibilityEvent == null) {
                i2 = 0;
            } else if (VERSION.SDK_INT >= 19) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i = i2;
            }
            this.f501I |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public eq getItemAnimator() {
        return this.f512T;
    }

    final void m313m() {
        if (!this.au && this.f493A) {
            ai.m1830a((View) this, this.aD);
            this.au = true;
        }
    }

    private final boolean mo3607z() {
        return this.f512T != null && this.f528v.ct_();
    }

    private final void m242A() {
        boolean z;
        boolean z2 = true;
        if (this.f505M) {
            this.f519m.m3911a();
            this.f528v.mo798a(this);
        }
        if (mo3607z()) {
            this.f519m.m3915b();
        } else {
            this.f519m.m3918e();
        }
        boolean z3;
        if (this.ar || this.as) {
            z3 = true;
        } else {
            z3 = false;
        }
        fo foVar = this.ao;
        if (!this.f496D || this.f512T == null || (!(this.f505M || r0 || this.f528v.f2949E) || (this.f505M && !this.f527u.f3434b))) {
            z = false;
        } else {
            z = true;
        }
        foVar.f3473j = z;
        fo foVar2 = this.ao;
        if (!(this.ao.f3473j && r0 && !this.f505M && mo3607z())) {
            z2 = false;
        }
        foVar2.f3474k = z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m243B() {
        /*
        r10 = this;
        r0 = r10.f527u;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = "RecyclerView";
        r1 = "No adapter attached; skipping layout";
        android.util.Log.e(r0, r1);
    L_0x000b:
        return;
    L_0x000c:
        r0 = r10.f528v;
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = "RecyclerView";
        r1 = "No layout manager attached; skipping layout";
        android.util.Log.e(r0, r1);
        goto L_0x000b;
    L_0x0018:
        r0 = r10.ao;
        r0 = r0.f3468e;
        r1 = 1;
        if (r0 != r1) goto L_0x00ee;
    L_0x001f:
        r10.m246E();
        r0 = r10.f528v;
        r0.m3038c(r10);
        r10.m247F();
    L_0x002a:
        r0 = r10.ao;
        r1 = 4;
        r0.m3706a(r1);
        r10.m298e();
        r10.m311k();
        r0 = r10.ao;
        r1 = 1;
        r0.f3468e = r1;
        r0 = r10.ao;
        r0 = r0.f3473j;
        if (r0 == 0) goto L_0x01b9;
    L_0x0041:
        r0 = r10.f520n;
        r0 = r0.m3326a();
        r0 = r0 + -1;
        r2 = r0;
    L_0x004a:
        if (r2 < 0) goto L_0x01b2;
    L_0x004c:
        r0 = r10.f520n;
        r0 = r0.m3332b(r2);
        r3 = m261c(r0);
        r0 = r3.m3265b();
        if (r0 != 0) goto L_0x017b;
    L_0x005c:
        r4 = r10.m263d(r3);
        r0 = r10.f512T;
        r1 = r10.ao;
        r1 = r0.recordPostLayoutInformation(r1, r3);
        r0 = r10.f521o;
        r0 = r0.f3618b;
        r0 = r0.m1684a(r4);
        r0 = (android.support.v7.widget.fr) r0;
        if (r0 == 0) goto L_0x01ac;
    L_0x0074:
        r6 = r0.m3265b();
        if (r6 != 0) goto L_0x01ac;
    L_0x007a:
        r6 = r10.f521o;
        r6 = r6.m3860a(r0);
        r7 = r10.f521o;
        r7 = r7.m3860a(r3);
        if (r6 == 0) goto L_0x008a;
    L_0x0088:
        if (r0 == r3) goto L_0x01ac;
    L_0x008a:
        r8 = r10.f521o;
        r9 = 4;
        r8 = r8.m3855a(r0, r9);
        r9 = r10.f521o;
        r9.m3862b(r3, r1);
        r1 = r10.f521o;
        r9 = 8;
        r1 = r1.m3855a(r3, r9);
        if (r8 != 0) goto L_0x0180;
    L_0x00a0:
        r1 = r10.f520n;
        r6 = r1.m3326a();
        r1 = 0;
    L_0x00a7:
        if (r1 >= r6) goto L_0x0155;
    L_0x00a9:
        r7 = r10.f520n;
        r7 = r7.m3332b(r1);
        r7 = m261c(r7);
        if (r7 == r3) goto L_0x0151;
    L_0x00b5:
        r8 = r10.m263d(r7);
        r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x0151;
    L_0x00bd:
        r0 = r10.f527u;
        if (r0 == 0) goto L_0x012a;
    L_0x00c1:
        r0 = r10.f527u;
        r0 = r0.f3434b;
        if (r0 == 0) goto L_0x012a;
    L_0x00c7:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r7);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = r10.m276a();
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ee:
        r0 = r10.f519m;
        r1 = r0.f3661c;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0121;
    L_0x00f8:
        r0 = r0.f3660b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0121;
    L_0x0100:
        r0 = 1;
    L_0x0101:
        if (r0 != 0) goto L_0x0117;
    L_0x0103:
        r0 = r10.f528v;
        r0 = r0.f2957M;
        r1 = r10.getWidth();
        if (r0 != r1) goto L_0x0117;
    L_0x010d:
        r0 = r10.f528v;
        r0 = r0.f2958N;
        r1 = r10.getHeight();
        if (r0 == r1) goto L_0x0123;
    L_0x0117:
        r0 = r10.f528v;
        r0.m3038c(r10);
        r10.m247F();
        goto L_0x002a;
    L_0x0121:
        r0 = 0;
        goto L_0x0101;
    L_0x0123:
        r0 = r10.f528v;
        r0.m3038c(r10);
        goto L_0x002a;
    L_0x012a:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:";
        r1.<init>(r2);
        r1 = r1.append(r7);
        r2 = " \n View Holder 2:";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = r10.m276a();
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0151:
        r1 = r1 + 1;
        goto L_0x00a7;
    L_0x0155:
        r1 = "RecyclerView";
        r4 = new java.lang.StringBuilder;
        r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
        r4.<init>(r5);
        r0 = r4.append(r0);
        r4 = " cannot be found but it is necessary for ";
        r0 = r0.append(r4);
        r0 = r0.append(r3);
        r3 = r10.m276a();
        r0 = r0.append(r3);
        r0 = r0.toString();
        android.util.Log.e(r1, r0);
    L_0x017b:
        r0 = r2 + -1;
        r2 = r0;
        goto L_0x004a;
    L_0x0180:
        r4 = 0;
        r0.m3262a(r4);
        if (r6 == 0) goto L_0x0189;
    L_0x0186:
        r10.m280a(r0);
    L_0x0189:
        if (r0 == r3) goto L_0x01a0;
    L_0x018b:
        if (r7 == 0) goto L_0x0190;
    L_0x018d:
        r10.m280a(r3);
    L_0x0190:
        r0.f3218h = r3;
        r10.m280a(r0);
        r4 = r10.f517k;
        r4.m3690b(r0);
        r4 = 0;
        r3.m3262a(r4);
        r3.f3219i = r0;
    L_0x01a0:
        r4 = r10.f512T;
        r0 = r4.animateChange(r0, r3, r8, r1);
        if (r0 == 0) goto L_0x017b;
    L_0x01a8:
        r10.m313m();
        goto L_0x017b;
    L_0x01ac:
        r0 = r10.f521o;
        r0.m3862b(r3, r1);
        goto L_0x017b;
    L_0x01b2:
        r0 = r10.f521o;
        r1 = r10.aF;
        r0.m3859a(r1);
    L_0x01b9:
        r0 = r10.f528v;
        r1 = r10.f517k;
        r0.m3033b(r1);
        r0 = r10.ao;
        r1 = r10.ao;
        r1 = r1.f3469f;
        r0.f3466c = r1;
        r0 = 0;
        r10.f505M = r0;
        r0 = r10.ao;
        r1 = 0;
        r0.f3473j = r1;
        r0 = r10.ao;
        r1 = 0;
        r0.f3474k = r1;
        r0 = r10.f528v;
        r1 = 0;
        r0.f2949E = r1;
        r0 = r10.f517k;
        r0 = r0.f3448b;
        if (r0 == 0) goto L_0x01e7;
    L_0x01e0:
        r0 = r10.f517k;
        r0 = r0.f3448b;
        r0.clear();
    L_0x01e7:
        r0 = r10.f528v;
        r0 = r0.f2954J;
        if (r0 == 0) goto L_0x01fc;
    L_0x01ed:
        r0 = r10.f528v;
        r1 = 0;
        r0.f2953I = r1;
        r0 = r10.f528v;
        r1 = 0;
        r0.f2954J = r1;
        r0 = r10.f517k;
        r0.m3688b();
    L_0x01fc:
        r0 = r10.f528v;
        r1 = r10.ao;
        r0.mo731a(r1);
        r0 = 1;
        r10.m289b(r0);
        r0 = 0;
        r10.m283a(r0);
        r0 = r10.f521o;
        r0.m3856a();
        r0 = r10.ax;
        r1 = 0;
        r0 = r0[r1];
        r1 = r10.ax;
        r2 = 1;
        r1 = r1[r2];
        r2 = r10.ax;
        r10.m256a(r2);
        r2 = r10.ax;
        r3 = 0;
        r2 = r2[r3];
        if (r2 != r0) goto L_0x022d;
    L_0x0226:
        r0 = r10.ax;
        r2 = 1;
        r0 = r0[r2];
        if (r0 == r1) goto L_0x025e;
    L_0x022d:
        r0 = 1;
    L_0x022e:
        if (r0 == 0) goto L_0x0235;
    L_0x0230:
        r0 = 0;
        r1 = 0;
        r10.m304f(r0, r1);
    L_0x0235:
        r0 = r10.ak;
        if (r0 == 0) goto L_0x0259;
    L_0x0239:
        r0 = r10.f527u;
        if (r0 == 0) goto L_0x0259;
    L_0x023d:
        r0 = r10.hasFocus();
        if (r0 == 0) goto L_0x0259;
    L_0x0243:
        r0 = r10.getDescendantFocusability();
        r1 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r0 == r1) goto L_0x0259;
    L_0x024b:
        r0 = r10.getDescendantFocusability();
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r0 != r1) goto L_0x0260;
    L_0x0253:
        r0 = r10.isFocused();
        if (r0 == 0) goto L_0x0260;
    L_0x0259:
        r10.m244C();
        goto L_0x000b;
    L_0x025e:
        r0 = 0;
        goto L_0x022e;
    L_0x0260:
        r0 = r10.isFocused();
        if (r0 != 0) goto L_0x028e;
    L_0x0266:
        r0 = r10.getFocusedChild();
        r1 = f491h;
        if (r1 == 0) goto L_0x0286;
    L_0x026e:
        r1 = r0.getParent();
        if (r1 == 0) goto L_0x027a;
    L_0x0274:
        r1 = r0.hasFocus();
        if (r1 != 0) goto L_0x0286;
    L_0x027a:
        r0 = r10.f520n;
        r0 = r0.m3326a();
        if (r0 != 0) goto L_0x028e;
    L_0x0282:
        r10.requestFocus();
        goto L_0x0259;
    L_0x0286:
        r1 = r10.f520n;
        r0 = r1.m3337d(r0);
        if (r0 == 0) goto L_0x0259;
    L_0x028e:
        r0 = 0;
        r1 = r10.ao;
        r2 = r1.f3476m;
        r4 = -1;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x02a7;
    L_0x0299:
        r1 = r10.f527u;
        r1 = r1.f3434b;
        if (r1 == 0) goto L_0x02a7;
    L_0x029f:
        r0 = r10.ao;
        r0 = r0.f3476m;
        r0 = r10.m249a(r0);
    L_0x02a7:
        r1 = 0;
        if (r0 == 0) goto L_0x02bc;
    L_0x02aa:
        r2 = r10.f520n;
        r3 = r0.f3211a;
        r2 = r2.m3337d(r3);
        if (r2 != 0) goto L_0x02bc;
    L_0x02b4:
        r2 = r0.f3211a;
        r2 = r2.hasFocusable();
        if (r2 != 0) goto L_0x02ea;
    L_0x02bc:
        r0 = r10.f520n;
        r0 = r0.m3326a();
        if (r0 <= 0) goto L_0x02c8;
    L_0x02c4:
        r1 = r10.m245D();
    L_0x02c8:
        if (r1 == 0) goto L_0x0259;
    L_0x02ca:
        r0 = r10.ao;
        r0 = r0.f3477n;
        r2 = (long) r0;
        r4 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x02ed;
    L_0x02d5:
        r0 = r10.ao;
        r0 = r0.f3477n;
        r0 = r1.findViewById(r0);
        if (r0 == 0) goto L_0x02ed;
    L_0x02df:
        r2 = r0.isFocusable();
        if (r2 == 0) goto L_0x02ed;
    L_0x02e5:
        r0.requestFocus();
        goto L_0x0259;
    L_0x02ea:
        r1 = r0.f3211a;
        goto L_0x02c8;
    L_0x02ed:
        r0 = r1;
        goto L_0x02e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.B():void");
    }

    private final void m244C() {
        this.ao.f3476m = -1;
        this.ao.f3475l = -1;
        this.ao.f3477n = -1;
    }

    private final View m245D() {
        int i = this.ao.f3475l != -1 ? this.ao.f3475l : 0;
        int a = this.ao.m3705a();
        int i2 = i;
        while (i2 < a) {
            fr f = m302f(i2);
            if (f == null) {
                break;
            } else if (f.f3211a.hasFocusable()) {
                return f.f3211a;
            } else {
                i2++;
            }
        }
        for (i = Math.min(a, i) - 1; i >= 0; i--) {
            fr f2 = m302f(i);
            if (f2 == null) {
                return null;
            }
            if (f2.f3211a.hasFocusable()) {
                return f2.f3211a;
            }
        }
        return null;
    }

    final void m314n() {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.al.f3480c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    private final void m246E() {
        View focusedChild;
        fr frVar;
        fo foVar;
        int i;
        int id;
        boolean z;
        this.ao.m3706a(1);
        m314n();
        m298e();
        this.f521o.m3856a();
        m311k();
        m242A();
        if (this.ak && hasFocus() && this.f527u != null) {
            focusedChild = getFocusedChild();
        } else {
            focusedChild = null;
        }
        if (focusedChild == null) {
            frVar = null;
        } else {
            focusedChild = m287b(focusedChild);
            frVar = focusedChild == null ? null : m275a(focusedChild);
        }
        if (frVar == null) {
            m244C();
        } else {
            long j;
            fo foVar2 = this.ao;
            if (this.f527u.f3434b) {
                j = frVar.f3215e;
            } else {
                j = -1;
            }
            foVar2.f3476m = j;
            foVar = this.ao;
            if (this.f505M) {
                i = -1;
            } else if (frVar.m3276m()) {
                i = frVar.f3214d;
            } else {
                i = frVar.m3267d();
            }
            foVar.f3475l = i;
            foVar2 = this.ao;
            focusedChild = frVar.f3211a;
            View view = focusedChild;
            id = focusedChild.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                View focusedChild2 = ((ViewGroup) view).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    i = focusedChild2.getId();
                } else {
                    i = id;
                }
                id = i;
                view = focusedChild2;
            }
            foVar2.f3477n = id;
        }
        foVar = this.ao;
        if (this.ao.f3473j && this.as) {
            z = true;
        } else {
            z = false;
        }
        foVar.f3472i = z;
        this.as = false;
        this.ar = false;
        this.ao.f3471h = this.ao.f3474k;
        this.ao.f3469f = this.f527u.mo1039a();
        m256a(this.ax);
        if (this.ao.f3473j) {
            id = this.f520n.m3326a();
            for (i = 0; i < id; i++) {
                frVar = m261c(this.f520n.m3332b(i));
                if (!frVar.m3265b() && (!frVar.m3273j() || this.f527u.f3434b)) {
                    this.f521o.m3858a(frVar, this.f512T.recordPreLayoutInformation(this.ao, frVar, eq.buildAdapterChangeFlagsForAnimations(frVar), frVar.m3279p()));
                    if (!(!this.ao.f3472i || !frVar.m3282s() || frVar.m3276m() || frVar.m3265b() || frVar.m3273j())) {
                        this.f521o.m3857a(m263d(frVar), frVar);
                    }
                }
            }
        }
        if (this.ao.f3474k) {
            id = this.f520n.m3331b();
            for (i = 0; i < id; i++) {
                frVar = m261c(this.f520n.m3335c(i));
                if (!frVar.m3265b() && frVar.f3214d == -1) {
                    frVar.f3214d = frVar.f3213c;
                }
            }
            z = this.ao.f3470g;
            this.ao.f3470g = false;
            this.f528v.mo739c(this.f517k, this.ao);
            this.ao.f3470g = z;
            for (id = 0; id < this.f520n.m3326a(); id++) {
                fr c = m261c(this.f520n.m3332b(id));
                if (!c.m3265b()) {
                    ia iaVar = (ia) this.f521o.f3617a.get(c);
                    z = (iaVar == null || (iaVar.f3620a & 4) == 0) ? false : true;
                    if (!z) {
                        i = eq.buildAdapterChangeFlagsForAnimations(c);
                        boolean a = c.m3263a(8192);
                        if (!a) {
                            i |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                        }
                        et recordPreLayoutInformation = this.f512T.recordPreLayoutInformation(this.ao, c, i, c.m3279p());
                        if (a) {
                            m281a(c, recordPreLayoutInformation);
                        } else {
                            hz hzVar = this.f521o;
                            iaVar = (ia) hzVar.f3617a.get(c);
                            if (iaVar == null) {
                                iaVar = ia.m3865a();
                                hzVar.f3617a.put(c, iaVar);
                            }
                            iaVar.f3620a |= 2;
                            iaVar.f3621b = recordPreLayoutInformation;
                        }
                    }
                }
            }
            m248G();
        } else {
            m248G();
        }
        m289b(true);
        m283a(false);
        this.ao.f3468e = 2;
    }

    private final void m247F() {
        m298e();
        m311k();
        this.ao.m3706a(6);
        this.f519m.m3918e();
        this.ao.f3469f = this.f527u.mo1039a();
        this.ao.f3467d = 0;
        this.ao.f3471h = false;
        this.f528v.mo739c(this.f517k, this.ao);
        this.ao.f3470g = false;
        this.f518l = null;
        fo foVar = this.ao;
        boolean z = this.ao.f3473j && this.f512T != null;
        foVar.f3473j = z;
        this.ao.f3468e = 4;
        m289b(true);
        m283a(false);
    }

    final void m281a(fr frVar, et etVar) {
        frVar.m3258a(0, 8192);
        if (this.ao.f3472i && frVar.m3282s() && !frVar.m3276m() && !frVar.m3265b()) {
            this.f521o.m3857a(m263d(frVar), frVar);
        }
        this.f521o.m3858a(frVar, etVar);
    }

    private final void m256a(int[] iArr) {
        int a = this.f520n.m3326a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < a) {
            int c;
            fr c2 = m261c(this.f520n.m3332b(i3));
            if (!c2.m3265b()) {
                c = c2.m3266c();
                if (c < i) {
                    i = c;
                }
                if (c > i2) {
                    i2 = i;
                    i3++;
                    i = i2;
                    i2 = c;
                }
            }
            c = i2;
            i2 = i;
            i3++;
            i = i2;
            i2 = c;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    protected void removeDetachedView(View view, boolean z) {
        fr c = m261c(view);
        if (c != null) {
            if (c.m3277n()) {
                c.m3272i();
            } else if (!c.m3265b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c + m276a());
            }
        }
        view.clearAnimation();
        m308h(view);
        super.removeDetachedView(view, z);
    }

    private final long m263d(fr frVar) {
        if (this.f527u.f3434b) {
            return frVar.f3215e;
        }
        return (long) frVar.f3213c;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0330d.m1728a("RV OnLayout");
        m243B();
        C0330d.m1727a();
        this.f496D = true;
    }

    public void requestLayout() {
        if (this.f497E != 0 || this.f499G) {
            this.f498F = true;
        } else {
            super.requestLayout();
        }
    }

    final void m315o() {
        int i = 0;
        int b = this.f520n.m3331b();
        for (int i2 = 0; i2 < b; i2++) {
            ((fa) this.f520n.m3335c(i2).getLayoutParams()).f3358e = true;
        }
        fh fhVar = this.f517k;
        b = fhVar.f3449c.size();
        while (i < b) {
            fa faVar = (fa) ((fr) fhVar.f3449c.get(i)).f3211a.getLayoutParams();
            if (faVar != null) {
                faVar.f3358e = true;
            }
            i++;
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        super.draw(canvas);
        int size = this.f530x.size();
        for (i = 0; i < size; i++) {
            ((ev) this.f530x.get(i)).mo789b(canvas, this, this.ao);
        }
        if (this.f508P == null || this.f508P.isFinished()) {
            i2 = 0;
        } else {
            i = canvas.save();
            i2 = this.f522p ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (i2 + (-getHeight())), 0.0f);
            if (this.f508P == null || !this.f508P.draw(canvas)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            canvas.restoreToCount(i);
        }
        if (!(this.f509Q == null || this.f509Q.isFinished())) {
            size = canvas.save();
            if (this.f522p) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.f509Q == null || !this.f509Q.draw(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.f510R == null || this.f510R.isFinished())) {
            size = canvas.save();
            int width = getWidth();
            if (this.f522p) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i), (float) (-width));
            if (this.f510R == null || !this.f510R.draw(canvas)) {
                i = 0;
            } else {
                i = 1;
            }
            i2 |= i;
            canvas.restoreToCount(size);
        }
        if (!(this.f511S == null || this.f511S.isFinished())) {
            i = canvas.save();
            canvas.rotate(180.0f);
            if (this.f522p) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.f511S != null && this.f511S.draw(canvas)) {
                i4 = 1;
            }
            i2 |= i4;
            canvas.restoreToCount(i);
        }
        if (i2 != 0 || this.f512T == null || this.f530x.size() <= 0 || !this.f512T.isRunning()) {
            i3 = i2;
        }
        if (i3 != 0) {
            ai.f1848a.mo391c(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f530x.size();
        for (int i = 0; i < size; i++) {
            ((ev) this.f530x.get(i)).mo784a(canvas, this, this.ao);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof fa) && this.f528v.mo805a((fa) layoutParams);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        if (this.f528v != null) {
            return this.f528v.mo724a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m276a());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f528v != null) {
            return this.f528v.mo794a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m276a());
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.f528v != null) {
            return this.f528v.mo795a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m276a());
    }

    private final void m248G() {
        int i = 0;
        int b = this.f520n.m3331b();
        for (int i2 = 0; i2 < b; i2++) {
            fr c = m261c(this.f520n.m3335c(i2));
            if (!c.m3265b()) {
                c.m3257a();
            }
        }
        fh fhVar = this.f517k;
        int size = fhVar.f3449c.size();
        for (b = 0; b < size; b++) {
            ((fr) fhVar.f3449c.get(b)).m3257a();
        }
        size = fhVar.f3447a.size();
        for (b = 0; b < size; b++) {
            ((fr) fhVar.f3447a.get(b)).m3257a();
        }
        if (fhVar.f3448b != null) {
            b = fhVar.f3448b.size();
            while (i < b) {
                ((fr) fhVar.f3448b.get(i)).m3257a();
                i++;
            }
        }
    }

    final void m277a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f520n.m3331b();
        for (int i4 = 0; i4 < b; i4++) {
            fr c = m261c(this.f520n.m3335c(i4));
            if (!(c == null || c.m3265b())) {
                if (c.f3213c >= i3) {
                    c.m3259a(-i2, z);
                    this.ao.f3470g = true;
                } else if (c.f3213c >= i) {
                    int i5 = i - 1;
                    int i6 = -i2;
                    c.m3264b(8);
                    c.m3259a(i6, z);
                    c.f3213c = i5;
                    this.ao.f3470g = true;
                }
            }
        }
        fh fhVar = this.f517k;
        int i7 = i + i2;
        for (i3 = fhVar.f3449c.size() - 1; i3 >= 0; i3--) {
            fr frVar = (fr) fhVar.f3449c.get(i3);
            if (frVar != null) {
                if (frVar.f3213c >= i7) {
                    frVar.m3259a(-i2, z);
                } else if (frVar.f3213c >= i) {
                    frVar.m3264b(8);
                    fhVar.m3689b(i3);
                }
            }
        }
        requestLayout();
    }

    final void m316p() {
        int i;
        this.f505M = true;
        int b = this.f520n.m3331b();
        for (i = 0; i < b; i++) {
            fr c = m261c(this.f520n.m3335c(i));
            if (!(c == null || c.m3265b())) {
                c.m3264b(6);
            }
        }
        m315o();
        fh fhVar = this.f517k;
        if (fhVar.f3455i.f527u == null || !fhVar.f3455i.f527u.f3434b) {
            fhVar.m3692c();
            return;
        }
        int size = fhVar.f3449c.size();
        for (i = 0; i < size; i++) {
            fr frVar = (fr) fhVar.f3449c.get(i);
            if (frVar != null) {
                frVar.m3264b(6);
                frVar.m3261a(null);
            }
        }
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.ak;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.ak = z;
    }

    public final fr m275a(View view) {
        Object parent = view.getParent();
        if (parent == null || parent == this) {
            return m261c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View m287b(View view) {
        RecyclerView parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = parent;
            view2 = view3;
            ViewParent parent2 = view3.getParent();
        }
        return parent == this ? view2 : null;
    }

    static fr m261c(View view) {
        if (view == null) {
            return null;
        }
        return ((fa) view.getLayoutParams()).f3356c;
    }

    public static int m262d(View view) {
        fr c = m261c(view);
        return c != null ? c.m3267d() : -1;
    }

    public static int m264e(View view) {
        fr c = m261c(view);
        return c != null ? c.m3266c() : -1;
    }

    public final fr m302f(int i) {
        if (this.f505M) {
            return null;
        }
        int b = this.f520n.m3331b();
        int i2 = 0;
        fr frVar = null;
        while (i2 < b) {
            fr c = m261c(this.f520n.m3335c(i2));
            if (c == null || c.m3276m() || m291c(c) != i) {
                c = frVar;
            } else if (!this.f520n.m3337d(c.f3211a)) {
                return c;
            }
            i2++;
            frVar = c;
        }
        return frVar;
    }

    public final fr m274a(int i, boolean z) {
        int b = this.f520n.m3331b();
        fr frVar = null;
        for (int i2 = 0; i2 < b; i2++) {
            fr c = m261c(this.f520n.m3335c(i2));
            if (!(c == null || c.m3276m())) {
                if (z) {
                    if (c.f3213c != i) {
                        continue;
                    }
                } else if (c.m3266c() != i) {
                    continue;
                }
                if (!this.f520n.m3337d(c.f3211a)) {
                    return c;
                }
                frVar = c;
            }
        }
        return frVar;
    }

    private final fr m249a(long j) {
        if (this.f527u == null || !this.f527u.f3434b) {
            return null;
        }
        int b = this.f520n.m3331b();
        int i = 0;
        fr frVar = null;
        while (i < b) {
            fr c = m261c(this.f520n.m3335c(i));
            if (c == null || c.m3276m() || c.f3215e != j) {
                c = frVar;
            } else if (!this.f520n.m3337d(c.f3211a)) {
                return c;
            }
            i++;
            frVar = c;
        }
        return frVar;
    }

    public static void m254a(View view, Rect rect) {
        m260b(view, rect);
    }

    public static void m260b(View view, Rect rect) {
        fa faVar = (fa) view.getLayoutParams();
        Rect rect2 = faVar.f3357d;
        rect.set((view.getLeft() - rect2.left) - faVar.leftMargin, (view.getTop() - rect2.top) - faVar.topMargin, (view.getRight() + rect2.right) + faVar.rightMargin, faVar.bottomMargin + (rect2.bottom + view.getBottom()));
    }

    final Rect m301f(View view) {
        fa faVar = (fa) view.getLayoutParams();
        if (!faVar.f3358e) {
            return faVar.f3357d;
        }
        if (this.ao.f3471h && (faVar.f3356c.m3282s() || faVar.f3356c.m3273j())) {
            return faVar.f3357d;
        }
        Rect rect = faVar.f3357d;
        rect.set(0, 0, 0, 0);
        int size = this.f530x.size();
        for (int i = 0; i < size; i++) {
            this.f524r.set(0, 0, 0, 0);
            ((ev) this.f530x.get(i)).mo785a(this.f524r, view, this, this.ao);
            rect.left += this.f524r.left;
            rect.top += this.f524r.top;
            rect.right += this.f524r.right;
            rect.bottom += this.f524r.bottom;
        }
        faVar.f3358e = false;
        return rect;
    }

    public void mo2953e(int i, int i2) {
    }

    final void m304f(int i, int i2) {
        this.f507O++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo2953e(i, i2);
        if (this.ap != null) {
            this.ap.mo791a(this, i, i2);
        }
        if (this.aq != null) {
            for (scrollY = this.aq.size() - 1; scrollY >= 0; scrollY--) {
                ((fe) this.aq.get(scrollY)).mo791a(this, i, i2);
            }
        }
        this.f507O--;
    }

    public void mo2954g(int i) {
    }

    public final boolean m317q() {
        return !this.f496D || this.f505M || this.f519m.m3917d();
    }

    final void m318r() {
        int a = this.f520n.m3326a();
        for (int i = 0; i < a; i++) {
            View b = this.f520n.m3332b(i);
            fr a2 = m275a(b);
            if (!(a2 == null || a2.f3219i == null)) {
                View view = a2.f3219i.f3211a;
                int left = b.getLeft();
                int top = b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    static RecyclerView m265g(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View g = m265g(viewGroup.getChildAt(i));
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    static void m259b(fr frVar) {
        if (frVar.f3212b != null) {
            View view = (View) frVar.f3212b.get();
            while (view != null) {
                if (view != frVar.f3211a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            frVar.f3212b = null;
        }
    }

    static long m267s() {
        if (f489f) {
            return System.nanoTime();
        }
        return 0;
    }

    final void m308h(View view) {
        m261c(view);
        if (this.f504L != null) {
            for (int size = this.f504L.size() - 1; size >= 0; size--) {
                ((fb) this.f504L.get(size)).m3667b();
            }
        }
    }

    final boolean m286a(fr frVar, int i) {
        if (mo2960y()) {
            frVar.f3227r = i;
            this.aC.add(frVar);
            return false;
        }
        ai.m1838b(frVar.f3211a, i);
        return true;
    }

    final int m291c(fr frVar) {
        if (frVar.m3263a(524) || !frVar.m3275l()) {
            return -1;
        }
        C0514y c0514y = this.f519m;
        int i = frVar.f3213c;
        int size = c0514y.f3660b.size();
        for (int i2 = 0; i2 < size; i2++) {
            aa aaVar = (aa) c0514y.f3660b.get(i2);
            switch (aaVar.f3074a) {
                case 1:
                    if (aaVar.f3075b > i) {
                        break;
                    }
                    i += aaVar.f3077d;
                    break;
                case 2:
                    if (aaVar.f3075b <= i) {
                        if (aaVar.f3075b + aaVar.f3077d <= i) {
                            i -= aaVar.f3077d;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case 8:
                    if (aaVar.f3075b != i) {
                        if (aaVar.f3075b < i) {
                            i--;
                        }
                        if (aaVar.f3077d > i) {
                            break;
                        }
                        i++;
                        break;
                    }
                    i = aaVar.f3077d;
                    break;
                default:
                    break;
            }
        }
        return i;
    }

    public void setNestedScrollingEnabled(boolean z) {
        m319t().m1794a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return m319t().f1842d;
    }

    public boolean startNestedScroll(int i) {
        return m319t().m1798a(i, 0);
    }

    private final boolean mo3605g(int i, int i2) {
        return m319t().m1798a(i, i2);
    }

    public void stopNestedScroll() {
        m319t().m1803b(0);
    }

    public final void n_(int i) {
        m319t().m1803b(i);
    }

    public boolean hasNestedScrollingParent() {
        return m319t().m1797a(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m319t().m1799a(i, i2, i3, i4, iArr);
    }

    public final boolean m284a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m319t().m1800a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m319t().m1801a(i, i2, iArr, iArr2);
    }

    public final boolean m285a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m319t().m1802a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m319t().m1796a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return m319t().m1795a(f, f2);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aw == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.aw.m3647a();
    }

    final aa m319t() {
        if (this.ay == null) {
            this.ay = new aa(this);
        }
        return this.ay;
    }

    static {
        boolean z = VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20;
        f486c = z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f487d = z;
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        f488e = z;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f489f = z;
        if (VERSION.SDK_INT <= 15) {
            z = true;
        } else {
            z = false;
        }
        f490g = z;
        if (VERSION.SDK_INT <= 15) {
            z = true;
        } else {
            z = false;
        }
        f491h = z;
    }
}
