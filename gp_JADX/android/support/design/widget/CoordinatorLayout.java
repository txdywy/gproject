package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.C0127i;
import android.support.design.C0134j;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0323s;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0357n;
import android.support.v4.view.ac;
import android.support.v4.view.ad;
import android.support.v4.view.ae;
import android.support.v4.view.ai;
import android.support.v4.view.ca;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements ac {
    public static final String f609a;
    public static final Class[] f610b = new Class[]{Context.class, AttributeSet.class};
    public static final ThreadLocal f611c = new ThreadLocal();
    public static final Comparator f612d;
    public static final C0321q f613e = new C0323s(12);
    public final List f614f;
    public final au f615g;
    public final List f616h;
    public final List f617i;
    public final int[] f618j;
    public boolean f619k;
    public boolean f620l;
    public int[] f621m;
    public View f622n;
    public View f623o;
    public ar f624p;
    public boolean f625q;
    public ca f626r;
    public boolean f627s;
    public Drawable f628t;
    public OnHierarchyChangeListener f629u;
    public ae f630v;
    public final ad f631w;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new as();
        public SparseArray f608a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f608a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f608a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 0;
            super.writeToParcel(parcel, i);
            int size = this.f608a != null ? this.f608a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            while (i2 < size) {
                iArr[i2] = this.f608a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f608a.valueAt(i2);
                i2++;
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    private static Rect m442a() {
        Rect rect = (Rect) f613e.mo381a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private static void m445a(Rect rect) {
        rect.setEmpty();
        f613e.mo382a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        super(context, attributeSet, i);
        this.f614f = new ArrayList();
        this.f615g = new au();
        this.f616h = new ArrayList();
        this.f617i = new ArrayList();
        this.f618j = new int[2];
        this.f631w = new ad();
        cn.m768a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.CoordinatorLayout, i, C0127i.Widget_Design_CoordinatorLayout);
        int resourceId = obtainStyledAttributes.getResourceId(C0134j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f621m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f621m.length;
            while (i2 < length) {
                this.f621m[i2] = (int) (((float) this.f621m[i2]) * f);
                i2++;
            }
        }
        this.f628t = obtainStyledAttributes.getDrawable(C0134j.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m454c();
        super.setOnHierarchyChangeListener(new ap(this));
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f629u = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m448a(false);
        if (this.f625q) {
            if (this.f624p == null) {
                this.f624p = new ar(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f624p);
        }
        if (this.f626r == null && ai.f1848a.mo397i(this)) {
            ai.f1848a.mo396h(this);
        }
        this.f620l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m448a(false);
        if (this.f625q && this.f624p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f624p);
        }
        if (this.f623o != null) {
            onStopNestedScroll(this.f623o);
        }
        this.f620l = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = null;
        if (this.f628t != drawable) {
            if (this.f628t != null) {
                this.f628t.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f628t = drawable2;
            if (this.f628t != null) {
                boolean z;
                if (this.f628t.isStateful()) {
                    this.f628t.setState(getDrawableState());
                }
                C0259a.m1523b(this.f628t, ai.f1848a.mo400k(this));
                Drawable drawable3 = this.f628t;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.f628t.setCallback(this);
            }
            ai.f1848a.mo391c(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f628t;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.f628t;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f628t;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f628t != null && this.f628t.isVisible() != z) {
            this.f628t.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0216d.m1112a(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    private final void m448a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            an anVar = ((aq) childAt.getLayoutParams()).f794a;
            if (anVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    anVar.mo70a(this, childAt, obtain);
                } else {
                    anVar.mo71b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((aq) getChildAt(i2).getLayoutParams()).f806m = false;
        }
        this.f619k = false;
    }

    private final boolean m449a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        Object obj = null;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f616h;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            int childDrawingOrder;
            if (isChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i2);
            } else {
                childDrawingOrder = i2;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        if (f612d != null) {
            Collections.sort(list, f612d);
        }
        int size = list.size();
        int i3 = 0;
        MotionEvent motionEvent2 = null;
        while (i3 < size) {
            Object obj2;
            MotionEvent motionEvent3;
            View view = (View) list.get(i3);
            aq aqVar = (aq) view.getLayoutParams();
            an anVar = aqVar.f794a;
            if ((!z2 && obj == null) || actionMasked == 0) {
                if (!(z2 || anVar == null)) {
                    switch (i) {
                        case 0:
                            z2 = anVar.mo70a(this, view, motionEvent);
                            break;
                        case 1:
                            z2 = anVar.mo71b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.f622n = view;
                    }
                }
                z = z2;
                if (aqVar.f794a == null) {
                    aqVar.f806m = false;
                }
                boolean z3 = aqVar.f806m;
                if (aqVar.f806m) {
                    isChildrenDrawingOrderEnabled = true;
                } else {
                    isChildrenDrawingOrderEnabled = aqVar.f806m | 0;
                    aqVar.f806m = isChildrenDrawingOrderEnabled;
                }
                Object obj3 = (!isChildrenDrawingOrderEnabled || z3) ? null : 1;
                if (isChildrenDrawingOrderEnabled && obj3 == null) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent4 = motionEvent2;
                obj2 = obj3;
                motionEvent3 = motionEvent4;
            } else if (anVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    motionEvent3 = motionEvent2;
                }
                switch (i) {
                    case 0:
                        anVar.mo70a(this, view, motionEvent3);
                        obj2 = obj;
                        z = z2;
                        continue;
                    case 1:
                        anVar.mo71b(this, view, motionEvent3);
                        break;
                }
                obj2 = obj;
                z = z2;
            } else {
                motionEvent3 = motionEvent2;
                z = z2;
                obj2 = obj;
            }
            i3++;
            obj = obj2;
            z2 = z;
            motionEvent2 = motionEvent3;
        }
        z = z2;
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m448a(true);
        }
        boolean a = m449a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m448a(true);
        }
        return a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f622n == null) {
            boolean a = m449a(motionEvent, 1);
            if (a) {
                z = a;
            } else {
                z = a;
                z2 = false;
                if (this.f622n == null) {
                    z2 |= super.onTouchEvent(motionEvent);
                    motionEvent2 = null;
                } else if (z) {
                    motionEvent2 = null;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEvent2);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    m448a(false);
                }
                return z2;
            }
        }
        z = false;
        an anVar = ((aq) this.f622n.getLayoutParams()).f794a;
        z2 = anVar != null ? anVar.mo71b(this, this.f622n, motionEvent) : false;
        if (this.f622n == null) {
            z2 |= super.onTouchEvent(motionEvent);
            motionEvent2 = null;
        } else if (z) {
            motionEvent2 = null;
        } else {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m448a(false);
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f619k) {
            m448a(false);
            this.f619k = true;
        }
    }

    private final int m450b(int i) {
        String valueOf;
        if (this.f621m == null) {
            valueOf = String.valueOf(this);
            Log.e("CoordinatorLayout", new StringBuilder(String.valueOf(valueOf).length() + 61).append("No keylines defined for ").append(valueOf).append(" - attempted index lookup ").append(i).toString());
            return 0;
        } else if (i >= 0 && i < this.f621m.length) {
            return this.f621m[i];
        } else {
            valueOf = String.valueOf(this);
            Log.e("CoordinatorLayout", new StringBuilder(String.valueOf(valueOf).length() + 43).append("Keyline index ").append(i).append(" out of range for ").append(valueOf).toString());
            return 0;
        }
    }

    static an m443a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String valueOf;
        if (str.startsWith(".")) {
            String valueOf2 = String.valueOf(context.getPackageName());
            valueOf = String.valueOf(str);
            str = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f609a)) {
            valueOf = f609a;
            str = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append('.').append(str).toString();
        }
        try {
            Map map;
            Map map2 = (Map) f611c.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                f611c.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f610b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (an) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Could not inflate Behavior subclass ";
            valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    private static aq m453c(View view) {
        aq aqVar = (aq) view.getLayoutParams();
        if (!aqVar.f795b) {
            ao aoVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                aoVar = (ao) cls.getAnnotation(ao.class);
                if (aoVar != null) {
                    break;
                }
            }
            ao aoVar2 = aoVar;
            if (aoVar2 != null) {
                try {
                    aqVar.m642a((an) aoVar2.m640a().newInstance());
                } catch (Throwable e) {
                    String name = aoVar2.m640a().getName();
                    Log.e("CoordinatorLayout", new StringBuilder(String.valueOf(name).length() + 88).append("Default behavior class ").append(name).append(" could not be instantiated. Did you forget a default constructor?").toString(), e);
                }
            }
            aqVar.f795b = true;
        }
        return aqVar;
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void m462a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r26, int r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r0.f614f;
        r1.clear();
        r0 = r25;
        r3 = r0.f615g;
        r1 = 0;
        r2 = r3.f814b;
        r4 = r2.size();
        r2 = r1;
    L_0x0013:
        if (r2 >= r4) goto L_0x002b;
    L_0x0015:
        r1 = r3.f814b;
        r1 = r1.m1630c(r2);
        r1 = (java.util.ArrayList) r1;
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r1.clear();
        r5 = r3.f813a;
        r5.mo382a(r1);
    L_0x0027:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0013;
    L_0x002b:
        r1 = r3.f814b;
        r1.clear();
        r1 = 0;
        r4 = r25.getChildCount();
        r3 = r1;
    L_0x0036:
        if (r3 >= r4) goto L_0x01df;
    L_0x0038:
        r0 = r25;
        r5 = r0.getChildAt(r3);
        r6 = m453c(r5);
        r1 = r6.f799f;
        r2 = -1;
        if (r1 != r2) goto L_0x00c7;
    L_0x0047:
        r1 = 0;
        r6.f805l = r1;
        r6.f804k = r1;
    L_0x004c:
        r0 = r25;
        r1 = r0.f615g;
        r1.m646a(r5);
        r1 = 0;
        r2 = r1;
    L_0x0055:
        if (r2 >= r4) goto L_0x01da;
    L_0x0057:
        if (r2 == r3) goto L_0x01d5;
    L_0x0059:
        r0 = r25;
        r6 = r0.getChildAt(r2);
        r7 = m453c(r6);
        r1 = r7.f805l;
        if (r5 == r1) goto L_0x0095;
    L_0x0067:
        r1 = android.support.v4.view.ai.f1848a;
        r0 = r25;
        r8 = r1.mo400k(r0);
        r1 = r5.getLayoutParams();
        r1 = (android.support.design.widget.aq) r1;
        r1 = r1.f800g;
        r1 = android.support.v4.view.C0357n.m2043a(r1, r8);
        if (r1 == 0) goto L_0x01ae;
    L_0x007d:
        r9 = r7.f801h;
        r8 = android.support.v4.view.C0357n.m2043a(r9, r8);
        r8 = r8 & r1;
        if (r8 != r1) goto L_0x01ae;
    L_0x0086:
        r1 = 1;
    L_0x0087:
        if (r1 != 0) goto L_0x0095;
    L_0x0089:
        r1 = r7.f794a;
        if (r1 == 0) goto L_0x01b1;
    L_0x008d:
        r1 = r7.f794a;
        r1 = r1.mo92a(r6, r5);
        if (r1 == 0) goto L_0x01b1;
    L_0x0095:
        r1 = 1;
    L_0x0096:
        if (r1 == 0) goto L_0x01d5;
    L_0x0098:
        r0 = r25;
        r1 = r0.f615g;
        r1 = r1.f814b;
        r1 = r1.containsKey(r6);
        if (r1 != 0) goto L_0x00ab;
    L_0x00a4:
        r0 = r25;
        r1 = r0.f615g;
        r1.m646a(r6);
    L_0x00ab:
        r0 = r25;
        r7 = r0.f615g;
        r1 = r7.f814b;
        r1 = r1.containsKey(r5);
        if (r1 == 0) goto L_0x00bf;
    L_0x00b7:
        r1 = r7.f814b;
        r1 = r1.containsKey(r6);
        if (r1 != 0) goto L_0x01b4;
    L_0x00bf:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "All nodes must be present in the graph before being added as an edge";
        r1.<init>(r2);
        throw r1;
    L_0x00c7:
        r1 = r6.f804k;
        if (r1 == 0) goto L_0x00d8;
    L_0x00cb:
        r1 = r6.f804k;
        r1 = r1.getId();
        r2 = r6.f799f;
        if (r1 == r2) goto L_0x00f9;
    L_0x00d5:
        r1 = 0;
    L_0x00d6:
        if (r1 != 0) goto L_0x004c;
    L_0x00d8:
        r1 = r6.f799f;
        r0 = r25;
        r1 = r0.findViewById(r1);
        r6.f804k = r1;
        r1 = r6.f804k;
        if (r1 == 0) goto L_0x015d;
    L_0x00e6:
        r1 = r6.f804k;
        r0 = r25;
        if (r1 != r0) goto L_0x0128;
    L_0x00ec:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x0120;
    L_0x00f2:
        r1 = 0;
        r6.f805l = r1;
        r6.f804k = r1;
        goto L_0x004c;
    L_0x00f9:
        r1 = r6.f804k;
        r2 = r6.f804k;
        r2 = r2.getParent();
    L_0x0101:
        r0 = r25;
        if (r2 == r0) goto L_0x011c;
    L_0x0105:
        if (r2 == 0) goto L_0x0109;
    L_0x0107:
        if (r2 != r5) goto L_0x0110;
    L_0x0109:
        r1 = 0;
        r6.f805l = r1;
        r6.f804k = r1;
        r1 = 0;
        goto L_0x00d6;
    L_0x0110:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x0117;
    L_0x0114:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x0117:
        r2 = r2.getParent();
        goto L_0x0101;
    L_0x011c:
        r6.f805l = r1;
        r1 = 1;
        goto L_0x00d6;
    L_0x0120:
        r1 = new java.lang.IllegalStateException;
        r2 = "View can not be anchored to the the parent CoordinatorLayout";
        r1.<init>(r2);
        throw r1;
    L_0x0128:
        r1 = r6.f804k;
        r2 = r6.f804k;
        r2 = r2.getParent();
    L_0x0130:
        r0 = r25;
        if (r2 == r0) goto L_0x0159;
    L_0x0134:
        if (r2 == 0) goto L_0x0159;
    L_0x0136:
        if (r2 != r5) goto L_0x014d;
    L_0x0138:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x0145;
    L_0x013e:
        r1 = 0;
        r6.f805l = r1;
        r6.f804k = r1;
        goto L_0x004c;
    L_0x0145:
        r1 = new java.lang.IllegalStateException;
        r2 = "Anchor must not be a descendant of the anchored view";
        r1.<init>(r2);
        throw r1;
    L_0x014d:
        r7 = r2 instanceof android.view.View;
        if (r7 == 0) goto L_0x0154;
    L_0x0151:
        r1 = r2;
        r1 = (android.view.View) r1;
    L_0x0154:
        r2 = r2.getParent();
        goto L_0x0130;
    L_0x0159:
        r6.f805l = r1;
        goto L_0x004c;
    L_0x015d:
        r1 = r25.isInEditMode();
        if (r1 == 0) goto L_0x016a;
    L_0x0163:
        r1 = 0;
        r6.f805l = r1;
        r6.f804k = r1;
        goto L_0x004c;
    L_0x016a:
        r1 = new java.lang.IllegalStateException;
        r2 = r25.getResources();
        r3 = r6.f799f;
        r2 = r2.getResourceName(r3);
        r3 = java.lang.String.valueOf(r5);
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 73;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Could not find CoordinatorLayout descendant view with id ";
        r4 = r5.append(r4);
        r2 = r4.append(r2);
        r4 = " to anchor view ";
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x01ae:
        r1 = 0;
        goto L_0x0087;
    L_0x01b1:
        r1 = 0;
        goto L_0x0096;
    L_0x01b4:
        r1 = r7.f814b;
        r1 = r1.get(r5);
        r1 = (java.util.ArrayList) r1;
        if (r1 != 0) goto L_0x01d2;
    L_0x01be:
        r1 = r7.f813a;
        r1 = r1.mo381a();
        r1 = (java.util.ArrayList) r1;
        if (r1 != 0) goto L_0x01cd;
    L_0x01c8:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x01cd:
        r7 = r7.f814b;
        r7.put(r5, r1);
    L_0x01d2:
        r1.add(r6);
    L_0x01d5:
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0055;
    L_0x01da:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x0036;
    L_0x01df:
        r0 = r25;
        r1 = r0.f614f;
        r0 = r25;
        r2 = r0.f615g;
        r2 = r2.m645a();
        r1.addAll(r2);
        r0 = r25;
        r1 = r0.f614f;
        java.util.Collections.reverse(r1);
        r25.m451b();
        r15 = r25.getPaddingLeft();
        r2 = r25.getPaddingTop();
        r16 = r25.getPaddingRight();
        r3 = r25.getPaddingBottom();
        r1 = android.support.v4.view.ai.f1848a;
        r0 = r25;
        r17 = r1.mo400k(r0);
        r1 = 1;
        r0 = r17;
        if (r0 != r1) goto L_0x031d;
    L_0x0215:
        r1 = 1;
        r9 = r1;
    L_0x0217:
        r18 = android.view.View.MeasureSpec.getMode(r26);
        r19 = android.view.View.MeasureSpec.getSize(r26);
        r20 = android.view.View.MeasureSpec.getMode(r27);
        r21 = android.view.View.MeasureSpec.getSize(r27);
        r22 = r15 + r16;
        r23 = r2 + r3;
        r13 = r25.getSuggestedMinimumWidth();
        r12 = r25.getSuggestedMinimumHeight();
        r11 = 0;
        r0 = r25;
        r1 = r0.f626r;
        if (r1 == 0) goto L_0x0321;
    L_0x023a:
        r1 = android.support.v4.view.ai.f1848a;
        r0 = r25;
        r1 = r1.mo397i(r0);
        if (r1 == 0) goto L_0x0321;
    L_0x0244:
        r1 = 1;
        r10 = r1;
    L_0x0246:
        r0 = r25;
        r1 = r0.f614f;
        r24 = r1.size();
        r1 = 0;
        r14 = r1;
    L_0x0250:
        r0 = r24;
        if (r14 >= r0) goto L_0x0337;
    L_0x0254:
        r0 = r25;
        r1 = r0.f614f;
        r3 = r1.get(r14);
        r3 = (android.view.View) r3;
        r1 = r3.getVisibility();
        r2 = 8;
        if (r1 == r2) goto L_0x0353;
    L_0x0266:
        r1 = r3.getLayoutParams();
        r8 = r1;
        r8 = (android.support.design.widget.aq) r8;
        r5 = 0;
        r1 = r8.f798e;
        if (r1 < 0) goto L_0x029d;
    L_0x0272:
        if (r18 == 0) goto L_0x029d;
    L_0x0274:
        r1 = r8.f798e;
        r0 = r25;
        r1 = r0.m450b(r1);
        r2 = r8.f796c;
        r2 = m455d(r2);
        r0 = r17;
        r2 = android.support.v4.view.C0357n.m2043a(r2, r0);
        r2 = r2 & 7;
        r4 = 3;
        if (r2 != r4) goto L_0x028f;
    L_0x028d:
        if (r9 == 0) goto L_0x0294;
    L_0x028f:
        r4 = 5;
        if (r2 != r4) goto L_0x0325;
    L_0x0292:
        if (r9 == 0) goto L_0x0325;
    L_0x0294:
        r2 = 0;
        r4 = r19 - r16;
        r1 = r4 - r1;
        r5 = java.lang.Math.max(r2, r1);
    L_0x029d:
        if (r10 == 0) goto L_0x034e;
    L_0x029f:
        r1 = android.support.v4.view.ai.f1848a;
        r1 = r1.mo397i(r3);
        if (r1 != 0) goto L_0x034e;
    L_0x02a7:
        r0 = r25;
        r1 = r0.f626r;
        r1 = r1.m2021a();
        r0 = r25;
        r2 = r0.f626r;
        r2 = r2.m2024c();
        r1 = r1 + r2;
        r0 = r25;
        r2 = r0.f626r;
        r2 = r2.m2023b();
        r0 = r25;
        r4 = r0.f626r;
        r4 = r4.m2025d();
        r2 = r2 + r4;
        r1 = r19 - r1;
        r0 = r18;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
        r1 = r21 - r2;
        r0 = r20;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
    L_0x02d9:
        r1 = r8.f794a;
        if (r1 == 0) goto L_0x02e6;
    L_0x02dd:
        r7 = 0;
        r2 = r25;
        r1 = r1.mo80a(r2, r3, r4, r5, r6, r7);
        if (r1 != 0) goto L_0x02ec;
    L_0x02e6:
        r7 = 0;
        r2 = r25;
        r2.m462a(r3, r4, r5, r6, r7);
    L_0x02ec:
        r1 = r3.getMeasuredWidth();
        r1 = r1 + r22;
        r2 = r8.leftMargin;
        r1 = r1 + r2;
        r2 = r8.rightMargin;
        r1 = r1 + r2;
        r4 = java.lang.Math.max(r13, r1);
        r1 = r3.getMeasuredHeight();
        r1 = r1 + r23;
        r2 = r8.topMargin;
        r1 = r1 + r2;
        r2 = r8.bottomMargin;
        r1 = r1 + r2;
        r2 = java.lang.Math.max(r12, r1);
        r1 = r3.getMeasuredState();
        r1 = android.view.View.combineMeasuredStates(r11, r1);
        r3 = r4;
    L_0x0315:
        r4 = r14 + 1;
        r14 = r4;
        r11 = r1;
        r12 = r2;
        r13 = r3;
        goto L_0x0250;
    L_0x031d:
        r1 = 0;
        r9 = r1;
        goto L_0x0217;
    L_0x0321:
        r1 = 0;
        r10 = r1;
        goto L_0x0246;
    L_0x0325:
        r4 = 5;
        if (r2 != r4) goto L_0x032a;
    L_0x0328:
        if (r9 == 0) goto L_0x032f;
    L_0x032a:
        r4 = 3;
        if (r2 != r4) goto L_0x029d;
    L_0x032d:
        if (r9 == 0) goto L_0x029d;
    L_0x032f:
        r2 = 0;
        r1 = r1 - r15;
        r5 = java.lang.Math.max(r2, r1);
        goto L_0x029d;
    L_0x0337:
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1 = r1 & r11;
        r0 = r26;
        r1 = android.view.View.resolveSizeAndState(r13, r0, r1);
        r2 = r11 << 16;
        r0 = r27;
        r2 = android.view.View.resolveSizeAndState(r12, r0, r2);
        r0 = r25;
        r0.setMeasuredDimension(r1, r2);
        return;
    L_0x034e:
        r6 = r27;
        r4 = r26;
        goto L_0x02d9;
    L_0x0353:
        r1 = r11;
        r2 = r12;
        r3 = r13;
        goto L_0x0315;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void m460a(View view, int i) {
        Object obj;
        aq aqVar = (aq) view.getLayoutParams();
        if (aqVar.f804k != null || aqVar.f799f == -1) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (aqVar.f804k != null) {
            View view2 = aqVar.f804k;
            view.getLayoutParams();
            Rect a = m442a();
            Rect a2 = m442a();
            try {
                co.m769a((ViewGroup) this, view2, a);
                aq aqVar2 = (aq) view.getLayoutParams();
                r4 = view.getMeasuredWidth();
                r5 = view.getMeasuredHeight();
                m444a(i, a, a2, aqVar2, r4, r5);
                m446a(aqVar2, a2, r4, r5);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                m445a(a);
                m445a(a2);
            }
        } else if (aqVar.f798e >= 0) {
            int i2;
            int i3 = aqVar.f798e;
            aqVar = (aq) view.getLayoutParams();
            r4 = C0357n.m2043a(m455d(aqVar.f796c), i);
            r5 = r4 & 7;
            r4 &= 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            i3 = m450b(i3) - measuredWidth;
            switch (r5) {
                case 1:
                    i2 = i3 + (measuredWidth / 2);
                    break;
                case 5:
                    i2 = i3 + measuredWidth;
                    break;
                default:
                    i2 = i3;
                    break;
            }
            switch (r4) {
                case 16:
                    i3 = (measuredHeight / 2) + 0;
                    break;
                case 80:
                    i3 = measuredHeight + 0;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            int max = Math.max(getPaddingLeft() + aqVar.leftMargin, Math.min(i2, ((width - getPaddingRight()) - measuredWidth) - aqVar.rightMargin));
            int max2 = Math.max(getPaddingTop() + aqVar.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - aqVar.bottomMargin));
            view.layout(max, max2, max + measuredWidth, max2 + measuredHeight);
        } else {
            aqVar = (aq) view.getLayoutParams();
            Rect a3 = m442a();
            a3.set(getPaddingLeft() + aqVar.leftMargin, getPaddingTop() + aqVar.topMargin, (getWidth() - getPaddingRight()) - aqVar.rightMargin, (getHeight() - getPaddingBottom()) - aqVar.bottomMargin);
            if (!(this.f626r == null || !ai.f1848a.mo397i(this) || ai.f1848a.mo397i(view))) {
                a3.left += this.f626r.m2021a();
                a3.top += this.f626r.m2023b();
                a3.right -= this.f626r.m2024c();
                a3.bottom -= this.f626r.m2025d();
            }
            Rect a4 = m442a();
            C0357n.m2044a(m452c(aqVar.f796c), view.getMeasuredWidth(), view.getMeasuredHeight(), a3, a4, i);
            view.layout(a4.left, a4.top, a4.right, a4.bottom);
            m445a(a3);
            m445a(a4);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int k = ai.f1848a.mo400k(this);
        int size = this.f614f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f614f.get(i5);
            if (view.getVisibility() != 8) {
                an anVar = ((aq) view.getLayoutParams()).f794a;
                if (anVar == null || !anVar.mo69a(this, view, k)) {
                    m460a(view, k);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f627s && this.f628t != null) {
            int b;
            if (this.f626r != null) {
                b = this.f626r.m2023b();
            } else {
                b = 0;
            }
            if (b > 0) {
                this.f628t.setBounds(0, 0, getWidth(), b);
                this.f628t.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m454c();
    }

    private final void m447a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            co.m769a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void m444a(int i, Rect rect, Rect rect2, aq aqVar, int i2, int i3) {
        int i4 = aqVar.f796c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = C0357n.m2043a(i4, i);
        int a = C0357n.m2043a(m452c(aqVar.f797d), i);
        int i5 = i4 & 7;
        int i6 = i4 & 112;
        int i7 = a & 112;
        switch (a & 7) {
            case 1:
                a = (rect.width() / 2) + rect.left;
                break;
            case 5:
                a = rect.right;
                break;
            default:
                a = rect.left;
                break;
        }
        switch (i7) {
            case 16:
                i4 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i4 = rect.bottom;
                break;
            default:
                i4 = rect.top;
                break;
        }
        switch (i5) {
            case 1:
                a -= i2 / 2;
                break;
            case 5:
                break;
            default:
                a -= i2;
                break;
        }
        switch (i6) {
            case 16:
                i4 -= i3 / 2;
                break;
            case 80:
                break;
            default:
                i4 -= i3;
                break;
        }
        rect2.set(a, i4, a + i2, i4 + i3);
    }

    private final void m446a(aq aqVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + aqVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - aqVar.rightMargin));
        height = Math.max(getPaddingTop() + aqVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - aqVar.bottomMargin));
        rect.set(width, height, width + i, height + i2);
    }

    private static int m452c(int i) {
        int i2;
        if ((i & 7) == 0) {
            i2 = 8388611 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 112) == 0) {
            return i2 | 48;
        }
        return i2;
    }

    private static int m455d(int i) {
        return i == 0 ? 8388661 : i;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    final void m458a(int i) {
        int k = ai.f1848a.mo400k(this);
        int size = this.f614f.size();
        Rect a = m442a();
        Rect a2 = m442a();
        Rect a3 = m442a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f614f.get(i2);
            aq aqVar = (aq) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                int measuredWidth;
                int measuredHeight;
                an anVar;
                int a4;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (aqVar.f805l == ((View) this.f614f.get(i3))) {
                        aq aqVar2 = (aq) view.getLayoutParams();
                        if (aqVar2.f804k != null) {
                            Rect a5 = m442a();
                            Rect a6 = m442a();
                            Rect a7 = m442a();
                            co.m769a((ViewGroup) this, aqVar2.f804k, a5);
                            m447a(view, false, a6);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            m444a(k, a5, a7, aqVar2, measuredWidth, measuredHeight);
                            Object obj = (a7.left == a6.left && a7.top == a6.top) ? null : 1;
                            m446a(aqVar2, a7, measuredWidth, measuredHeight);
                            measuredWidth = a7.left - a6.left;
                            measuredHeight = a7.top - a6.top;
                            if (measuredWidth != 0) {
                                ai.m1847e(view, measuredWidth);
                            }
                            if (measuredHeight != 0) {
                                ai.m1844d(view, measuredHeight);
                            }
                            if (obj != null) {
                                anVar = aqVar2.f794a;
                                if (anVar != null) {
                                    anVar.mo91a(this, view, aqVar2.f804k);
                                }
                            }
                            m445a(a5);
                            m445a(a6);
                            m445a(a7);
                        }
                    }
                }
                m447a(view, true, a2);
                if (!(aqVar.f800g == 0 || a2.isEmpty())) {
                    a4 = C0357n.m2043a(aqVar.f800g, k);
                    switch (a4 & 112) {
                        case 48:
                            a.top = Math.max(a.top, a2.bottom);
                            break;
                        case 80:
                            a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                            break;
                    }
                    switch (a4 & 7) {
                        case 3:
                            a.left = Math.max(a.left, a2.right);
                            break;
                        case 5:
                            a.right = Math.max(a.right, getWidth() - a2.left);
                            break;
                    }
                }
                if (aqVar.f801h != 0 && view.getVisibility() == 0 && ai.f1848a.mo409s(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    aq aqVar3 = (aq) view.getLayoutParams();
                    an anVar2 = aqVar3.f794a;
                    Rect a8 = m442a();
                    Rect a9 = m442a();
                    a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (anVar2 == null || !anVar2.mo119a(view, a8)) {
                        a8.set(a9);
                    } else if (!a9.contains(a8)) {
                        String toShortString = a8.toShortString();
                        String toShortString2 = a9.toShortString();
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(toShortString).length() + 57) + String.valueOf(toShortString2).length()).append("Rect should be within the child's bounds. Rect:").append(toShortString).append(" | Bounds:").append(toShortString2).toString());
                    }
                    m445a(a9);
                    if (!a8.isEmpty()) {
                        Object obj2;
                        measuredWidth = C0357n.m2043a(aqVar3.f801h, k);
                        Object obj3 = null;
                        if ((measuredWidth & 48) == 48) {
                            measuredHeight = (a8.top - aqVar3.topMargin) - aqVar3.f803j;
                            if (measuredHeight < a.top) {
                                m457e(view, a.top - measuredHeight);
                                obj3 = 1;
                            }
                        }
                        if ((measuredWidth & 80) == 80) {
                            measuredHeight = ((getHeight() - a8.bottom) - aqVar3.bottomMargin) + aqVar3.f803j;
                            if (measuredHeight < a.bottom) {
                                m457e(view, measuredHeight - a.bottom);
                                obj3 = 1;
                            }
                        }
                        if (obj3 == null) {
                            m457e(view, 0);
                        }
                        obj3 = null;
                        if ((measuredWidth & 3) == 3) {
                            measuredHeight = (a8.left - aqVar3.leftMargin) - aqVar3.f802i;
                            if (measuredHeight < a.left) {
                                m456d(view, a.left - measuredHeight);
                                obj3 = 1;
                            }
                        }
                        if ((measuredWidth & 5) == 5) {
                            a4 = aqVar3.f802i + ((getWidth() - a8.right) - aqVar3.rightMargin);
                            if (a4 < a.right) {
                                m456d(view, a4 - a.right);
                                obj2 = 1;
                                if (obj2 == null) {
                                    m456d(view, 0);
                                }
                            }
                        }
                        obj2 = obj3;
                        if (obj2 == null) {
                            m456d(view, 0);
                        }
                    }
                    m445a(a8);
                }
                if (i != 2) {
                    a3.set(((aq) view.getLayoutParams()).f810q);
                    if (!a3.equals(a2)) {
                        ((aq) view.getLayoutParams()).f810q.set(a2);
                    }
                }
                for (int i4 = i2 + 1; i4 < size; i4++) {
                    View view2 = (View) this.f614f.get(i4);
                    aq aqVar4 = (aq) view2.getLayoutParams();
                    anVar = aqVar4.f794a;
                    if (anVar != null && anVar.mo92a(view2, view)) {
                        if (i == 0 && aqVar4.f809p) {
                            aqVar4.f809p = false;
                        } else {
                            boolean z;
                            switch (i) {
                                case 2:
                                    z = true;
                                    break;
                                default:
                                    z = anVar.mo91a(this, view2, view);
                                    break;
                            }
                            if (i == 1) {
                                aqVar4.f809p = z;
                            }
                        }
                    }
                }
            }
        }
        m445a(a);
        m445a(a2);
        m445a(a3);
    }

    private static void m456d(View view, int i) {
        aq aqVar = (aq) view.getLayoutParams();
        if (aqVar.f802i != i) {
            ai.m1847e(view, i - aqVar.f802i);
            aqVar.f802i = i;
        }
    }

    private static void m457e(View view, int i) {
        aq aqVar = (aq) view.getLayoutParams();
        if (aqVar.f803j != i) {
            ai.m1844d(view, i - aqVar.f803j);
            aqVar.f803j = i;
        }
    }

    public final void m459a(View view) {
        List b = this.f615g.m647b(view);
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                an anVar = ((aq) view2.getLayoutParams()).f794a;
                if (anVar != null) {
                    anVar.mo91a(this, view2, view);
                }
            }
        }
    }

    public final List m465b(View view) {
        au auVar = this.f615g;
        Collection collection = null;
        int size = auVar.f814b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) auVar.f814b.m1630c(i);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    Collection collection2 = collection;
                }
                arrayList.add(auVar.f814b.m1629b(i));
                collection = arrayList;
            }
        }
        this.f617i.clear();
        if (collection != null) {
            this.f617i.addAll(collection);
        }
        return this.f617i;
    }

    private final void m451b() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            au auVar = this.f615g;
            int size = auVar.f814b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList = (ArrayList) auVar.f814b.m1630c(i2);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                z = true;
                break;
            }
        }
        z = false;
        if (z == this.f625q) {
            return;
        }
        if (z) {
            if (this.f620l) {
                if (this.f624p == null) {
                    this.f624p = new ar(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.f624p);
            }
            this.f625q = true;
            return;
        }
        if (this.f620l && this.f624p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f624p);
        }
        this.f625q = false;
    }

    public final boolean m464a(View view, int i, int i2) {
        Rect a = m442a();
        co.m769a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            m445a(a);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof aq) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo109b(view, i, 0);
    }

    public final boolean mo109b(View view, int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (i3 < childCount) {
            boolean z2;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                aq aqVar = (aq) childAt.getLayoutParams();
                an anVar = aqVar.f794a;
                if (anVar != null) {
                    boolean a = anVar.mo81a(this, childAt, view, i, i2);
                    z2 = z | a;
                    aqVar.m641a(i2, a);
                    i3++;
                    z = z2;
                } else {
                    aqVar.m641a(i2, false);
                }
            }
            z2 = z;
            i3++;
            z = z2;
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo108b(view2, i);
    }

    public final void mo108b(View view, int i) {
        this.f631w.f1844a = i;
        this.f623o = view;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
    }

    public void onStopNestedScroll(View view) {
        mo110c(view, 0);
    }

    public final void mo110c(View view, int i) {
        this.f631w.f1844a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            aq aqVar = (aq) childAt.getLayoutParams();
            if (aqVar.m643a(i)) {
                an anVar = aqVar.f794a;
                if (anVar != null) {
                    anVar.mo77a(this, childAt, view, i);
                }
                aqVar.m641a(i, false);
                aqVar.f809p = false;
            }
        }
        this.f623o = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo106a(view, i2, i4, 0);
    }

    public final void mo106a(View view, int i, int i2, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        while (i4 < childCount) {
            int i6;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                aq aqVar = (aq) childAt.getLayoutParams();
                if (aqVar.m643a(i3)) {
                    an anVar = aqVar.f794a;
                    if (anVar != null) {
                        anVar.mo78a(this, childAt, view, i, i2, i3);
                        i6 = 1;
                        i4++;
                        i5 = i6;
                    }
                }
            }
            i6 = i5;
            i4++;
            i5 = i6;
        }
        if (i5 != 0) {
            m458a(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo107a(view, i, i2, iArr, 0);
    }

    public final void mo107a(View view, int i, int i2, int[] iArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            int max;
            int max2;
            Object obj2;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                aq aqVar = (aq) childAt.getLayoutParams();
                if (aqVar.m643a(i3)) {
                    an anVar = aqVar.f794a;
                    if (anVar != null) {
                        int[] iArr2 = this.f618j;
                        this.f618j[1] = 0;
                        iArr2[0] = 0;
                        anVar.mo79a(this, childAt, view, i, i2, this.f618j, i3);
                        max = i > 0 ? Math.max(i4, this.f618j[0]) : Math.min(i4, this.f618j[0]);
                        max2 = i2 > 0 ? Math.max(i5, this.f618j[1]) : Math.min(i5, this.f618j[1]);
                        obj2 = 1;
                        i6++;
                        i5 = max2;
                        i4 = max;
                        obj = obj2;
                    }
                }
            }
            obj2 = obj;
            max = i4;
            max2 = i5;
            i6++;
            i5 = max2;
            i4 = max;
            obj = obj2;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            m458a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aq aqVar = (aq) childAt.getLayoutParams();
                if (aqVar.m643a(0)) {
                    an anVar = aqVar.f794a;
                    if (anVar != null) {
                        a = anVar.mo3576a(this, childAt, view, f, f2, z) | z2;
                        i++;
                        z2 = a;
                    }
                }
            }
            a = z2;
            i++;
            z2 = a;
        }
        if (z2) {
            m458a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aq aqVar = (aq) childAt.getLayoutParams();
                if (aqVar.m643a(0)) {
                    an anVar = aqVar.f794a;
                    if (anVar != null) {
                        a = anVar.mo96a(this, childAt, view, f, f2) | z;
                        i++;
                        z = a;
                    }
                }
            }
            a = z;
            i++;
            z = a;
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.f631w.f1844a;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f542e);
            SparseArray sparseArray = savedState.f608a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                an anVar = m453c(childAt).f794a;
                if (!(id == -1 || anVar == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        anVar.mo76a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            an anVar = ((aq) childAt.getLayoutParams()).f794a;
            if (!(id == -1 || anVar == null)) {
                Parcelable b = anVar.mo84b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        savedState.f608a = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        an anVar = ((aq) view.getLayoutParams()).f794a;
        if (anVar == null || !anVar.mo90a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private final void m454c() {
        if (VERSION.SDK_INT >= 21) {
            if (ai.f1848a.mo397i(this)) {
                if (this.f630v == null) {
                    this.f630v = new am(this);
                }
                ai.m1828a((View) this, this.f630v);
                setSystemUiVisibility(1280);
                return;
            }
            ai.m1828a((View) this, null);
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new aq();
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof aq) {
            return new aq((aq) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new aq((MarginLayoutParams) layoutParams);
        }
        return new aq(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aq(getContext(), attributeSet);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f609a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f612d = new at();
        } else {
            f612d = null;
        }
    }
}
