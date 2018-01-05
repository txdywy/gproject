package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.p015a.p016a.C0064c;
import android.support.constraint.p015a.p016a.C0065d;
import android.support.constraint.p015a.p016a.C0066e;
import android.support.constraint.p015a.p016a.C0067f;
import android.support.constraint.p015a.p016a.C0068l;
import android.support.constraint.p015a.p016a.C0069g;
import android.support.constraint.p015a.p016a.C0070h;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.c.a.a.a.a.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintLayout extends ViewGroup {
    public SparseArray f153a = new SparseArray();
    public final ArrayList f154b = new ArrayList(100);
    public C0069g f155c = new C0069g();
    public int f156d = 0;
    public int f157e = 0;
    public int f158f = Integer.MAX_VALUE;
    public int f159g = Integer.MAX_VALUE;
    public boolean f160h = true;
    public int f161i = 2;
    public C0084b f162j = null;

    public ConstraintLayout(Context context) {
        super(context);
        m77a(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m77a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77a(attributeSet);
    }

    public void setId(int i) {
        this.f153a.remove(getId());
        super.setId(i);
        this.f153a.put(getId(), this);
    }

    private final void m77a(AttributeSet attributeSet) {
        this.f155c.f203O = this;
        this.f153a.put(getId(), this);
        this.f162j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0086d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0086d.ConstraintLayout_Layout_android_minWidth) {
                    this.f156d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f156d);
                } else if (index == C0086d.ConstraintLayout_Layout_android_minHeight) {
                    this.f157e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f157e);
                } else if (index == C0086d.ConstraintLayout_Layout_android_maxWidth) {
                    this.f158f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f158f);
                } else if (index == C0086d.ConstraintLayout_Layout_android_maxHeight) {
                    this.f159g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f159g);
                } else if (index == C0086d.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f161i = obtainStyledAttributes.getInt(index, this.f161i);
                } else if (index == C0086d.ConstraintLayout_Layout_constraintSet) {
                    index = obtainStyledAttributes.getResourceId(index, 0);
                    this.f162j = new C0084b();
                    C0084b c0084b = this.f162j;
                    Context context = getContext();
                    XmlPullParser xml = context.getResources().getXml(index);
                    try {
                        for (index = xml.getEventType(); index != 1; index = xml.next()) {
                            switch (index) {
                                case 0:
                                    xml.getName();
                                    break;
                                case 2:
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    C0085c c0085c = new C0085c();
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, C0086d.ConstraintSet);
                                    C0084b.m181a(c0085c, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        c0085c.f389a = true;
                                    }
                                    c0084b.f362b.put(Integer.valueOf(c0085c.f392d), c0085c);
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (Throwable e) {
                        a.a.a(e);
                    } catch (Throwable e2) {
                        a.a.a(e2);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f155c.av = this.f161i;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0066e a = m75a(view);
        if ((view instanceof Guideline) && !(a instanceof C0070h)) {
            C0083a c0083a = (C0083a) view.getLayoutParams();
            c0083a.f333Y = new C0070h();
            c0083a.f325Q = true;
            ((C0070h) c0083a.f333Y).m128e(c0083a.f321M);
        }
        this.f153a.put(view.getId(), view);
        this.f160h = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f153a.remove(view.getId());
        this.f155c.m114a(m75a(view));
        this.f160h = true;
    }

    public void setMinWidth(int i) {
        if (i != this.f156d) {
            this.f156d = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f157e) {
            this.f157e = i;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f156d;
    }

    public int getMinHeight() {
        return this.f157e;
    }

    public void setMaxWidth(int i) {
        if (i != this.f158f) {
            this.f158f = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.f159g) {
            this.f159g = i;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f158f;
    }

    public int getMaxHeight() {
        return this.f159g;
    }

    private final C0066e m74a(int i) {
        if (i == 0) {
            return this.f155c;
        }
        View view = (View) this.f153a.get(i);
        if (view == this) {
            return this.f155c;
        }
        return view == null ? null : ((C0083a) view.getLayoutParams()).f333Y;
    }

    private final C0066e m75a(View view) {
        if (view == this) {
            return this.f155c;
        }
        return view == null ? null : ((C0083a) view.getLayoutParams()).f333Y;
    }

    private final void m76a(int i, int i2) {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0083a c0083a = (C0083a) childAt.getLayoutParams();
                C0066e c0066e = c0083a.f333Y;
                if (!c0083a.f325Q) {
                    int i4 = c0083a.width;
                    int i5 = c0083a.height;
                    Object obj = (c0083a.f322N || c0083a.f323O || ((!c0083a.f322N && c0083a.f313E == 1) || c0083a.width == -1 || (!c0083a.f323O && (c0083a.f314F == 1 || c0083a.height == -1)))) ? 1 : null;
                    Object obj2 = null;
                    Object obj3 = null;
                    if (obj != null) {
                        Object obj4;
                        int childMeasureSpec;
                        int childMeasureSpec2;
                        if (i4 == 0 || i4 == -1) {
                            obj4 = 1;
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -2);
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i4);
                            obj4 = null;
                        }
                        if (i5 == 0 || i5 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                            obj3 = 1;
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i5);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        i5 = childAt.getMeasuredWidth();
                        Object obj5 = obj4;
                        i4 = childAt.getMeasuredHeight();
                        obj2 = obj5;
                    } else {
                        int i6 = i5;
                        i5 = i4;
                        i4 = i6;
                    }
                    c0066e.m87a(i5);
                    c0066e.m93b(i4);
                    if (obj2 != null) {
                        c0066e.f197H = i5;
                    }
                    if (obj3 != null) {
                        c0066e.f198I = i4;
                    }
                    if (c0083a.f324P) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            c0066e.f194E = baseline;
                        }
                    }
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        C0067f c0067f;
        C0067f c0067f2;
        int childCount;
        int i3;
        C0066e a;
        int i4;
        int i5;
        View view;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f155c.f237w = paddingLeft;
        this.f155c.f238x = paddingTop;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        C0067f c0067f3 = C0067f.FIXED;
        C0067f c0067f4 = C0067f.FIXED;
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                c0067f = C0067f.WRAP_CONTENT;
                break;
            case 0:
                c0067f = C0067f.WRAP_CONTENT;
                size = 0;
                break;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                size = Math.min(this.f158f, size) - paddingLeft2;
                c0067f = c0067f3;
                break;
            default:
                size = 0;
                c0067f = c0067f3;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                c0067f2 = C0067f.WRAP_CONTENT;
                break;
            case 0:
                c0067f2 = C0067f.WRAP_CONTENT;
                size2 = 0;
                break;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                size2 = Math.min(this.f159g, size2) - paddingTop2;
                c0067f2 = c0067f4;
                break;
            default:
                size2 = 0;
                c0067f2 = c0067f4;
                break;
        }
        this.f155c.m98c(0);
        this.f155c.m101d(0);
        this.f155c.m90a(c0067f);
        this.f155c.m87a(size);
        this.f155c.m95b(c0067f2);
        this.f155c.m93b(size2);
        this.f155c.m98c((this.f156d - getPaddingLeft()) - getPaddingRight());
        this.f155c.m101d((this.f157e - getPaddingTop()) - getPaddingBottom());
        if (this.f160h) {
            C0084b c0084b;
            int childCount2;
            HashSet hashSet;
            View childAt;
            C0085c c0085c;
            C0083a c0083a;
            Iterator it;
            Integer num;
            C0085c c0085c2;
            View guideline;
            LayoutParams c0083a2;
            int childCount3;
            View childAt2;
            C0083a c0083a3;
            C0066e c0066e;
            C0070h c0070h;
            float f;
            float f2;
            String str;
            this.f160h = false;
            childCount = getChildCount();
            Object obj = null;
            i3 = 0;
            while (i3 < childCount) {
                if (getChildAt(i3).isLayoutRequested()) {
                    obj = 1;
                    if (obj != null) {
                        this.f154b.clear();
                        if (this.f162j != null) {
                            c0084b = this.f162j;
                            childCount2 = getChildCount();
                            hashSet = new HashSet(c0084b.f362b.keySet());
                            for (childCount = 0; childCount < childCount2; childCount++) {
                                childAt = getChildAt(childCount);
                                size2 = childAt.getId();
                                if (c0084b.f362b.containsKey(Integer.valueOf(size2))) {
                                    hashSet.remove(Integer.valueOf(size2));
                                    c0085c = (C0085c) c0084b.f362b.get(Integer.valueOf(size2));
                                    c0083a = (C0083a) childAt.getLayoutParams();
                                    c0085c.m182a(c0083a);
                                    childAt.setLayoutParams(c0083a);
                                    childAt.setVisibility(c0085c.f369G);
                                    if (VERSION.SDK_INT >= 17) {
                                        childAt.setAlpha(c0085c.f380R);
                                        childAt.setRotationX(c0085c.f383U);
                                        childAt.setRotationY(c0085c.f384V);
                                        childAt.setScaleX(c0085c.f385W);
                                        childAt.setScaleY(c0085c.f386X);
                                        childAt.setPivotX(c0085c.f387Y);
                                        childAt.setPivotY(c0085c.f388Z);
                                        childAt.setTranslationX(c0085c.aa);
                                        childAt.setTranslationY(c0085c.ab);
                                        if (VERSION.SDK_INT >= 21) {
                                            childAt.setTranslationZ(c0085c.ac);
                                            if (c0085c.f381S) {
                                                childAt.setElevation(c0085c.f382T);
                                            }
                                        }
                                    }
                                }
                            }
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                                num = (Integer) it.next();
                                c0085c2 = (C0085c) c0084b.f362b.get(num);
                                if (c0085c2.f389a) {
                                    guideline = new Guideline(getContext());
                                    guideline.setId(num.intValue());
                                    c0083a2 = new C0083a();
                                    c0085c2.m182a(c0083a2);
                                    addView(guideline, c0083a2);
                                }
                            }
                        }
                        childCount3 = getChildCount();
                        this.f155c.aA.clear();
                        for (paddingLeft2 = 0; paddingLeft2 < childCount3; paddingLeft2++) {
                            childAt2 = getChildAt(paddingLeft2);
                            a = m75a(childAt2);
                            if (a != null) {
                                c0083a3 = (C0083a) childAt2.getLayoutParams();
                                a.mo38a();
                                a.f204P = childAt2.getVisibility();
                                a.f203O = childAt2;
                                c0066e = this.f155c;
                                c0066e.aA.add(a);
                                if (a.f232r != null) {
                                    ((C0068l) a.f232r).m114a(a);
                                }
                                a.f232r = c0066e;
                                if (!(c0083a3.f323O && c0083a3.f322N)) {
                                    this.f154b.add(a);
                                }
                                if (c0083a3.f325Q) {
                                    c0070h = (C0070h) a;
                                    if (c0083a3.f334a != -1) {
                                        i3 = c0083a3.f334a;
                                        if (i3 >= 0) {
                                            c0070h.ak = -1.0f;
                                            c0070h.al = i3;
                                            c0070h.am = -1;
                                        }
                                    }
                                    if (c0083a3.f335b != -1) {
                                        i3 = c0083a3.f335b;
                                        if (i3 >= 0) {
                                            c0070h.ak = -1.0f;
                                            c0070h.al = -1;
                                            c0070h.am = i3;
                                        }
                                    }
                                    if (c0083a3.f336c != -1.0f) {
                                        f = c0083a3.f336c;
                                        if (f > -1.0f) {
                                            c0070h.ak = f;
                                            c0070h.al = -1;
                                            c0070h.am = -1;
                                        }
                                    }
                                } else if (c0083a3.f326R == -1 || c0083a3.f327S != -1 || c0083a3.f328T != -1 || c0083a3.f329U != -1 || c0083a3.f341h != -1 || c0083a3.f342i != -1 || c0083a3.f343j != -1 || c0083a3.f344k != -1 || c0083a3.f345l != -1 || c0083a3.f319K != -1 || c0083a3.f320L != -1 || c0083a3.width == -1 || c0083a3.height == -1) {
                                    mode2 = c0083a3.f326R;
                                    mode = c0083a3.f327S;
                                    childCount2 = c0083a3.f328T;
                                    size = c0083a3.f329U;
                                    i4 = c0083a3.f330V;
                                    childCount = c0083a3.f331W;
                                    f = c0083a3.f332X;
                                    if (VERSION.SDK_INT < 17) {
                                        mode2 = c0083a3.f337d;
                                        mode = c0083a3.f338e;
                                        childCount2 = c0083a3.f339f;
                                        size = c0083a3.f340g;
                                        i4 = c0083a3.f350q;
                                        childCount = c0083a3.f352s;
                                        f = c0083a3.f356w;
                                        if (mode2 == -1 && mode == -1) {
                                            if (c0083a3.f347n != -1) {
                                                mode2 = c0083a3.f347n;
                                            } else if (c0083a3.f346m != -1) {
                                                mode = c0083a3.f346m;
                                            }
                                        }
                                        if (childCount2 == -1 && size == -1) {
                                            if (c0083a3.f348o != -1) {
                                                f2 = f;
                                                i5 = c0083a3.f348o;
                                                i3 = mode;
                                                mode = childCount;
                                                childCount = mode2;
                                                mode2 = size;
                                            } else if (c0083a3.f349p != -1) {
                                                f2 = f;
                                                i5 = childCount2;
                                                i3 = mode;
                                                mode = childCount;
                                                childCount = mode2;
                                                mode2 = c0083a3.f349p;
                                            }
                                            if (childCount == -1) {
                                                c0066e = m74a(childCount);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.LEFT, c0066e, C0065d.LEFT, c0083a3.leftMargin, i4);
                                                }
                                            } else if (i3 != -1) {
                                                c0066e = m74a(i3);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.LEFT, c0066e, C0065d.RIGHT, c0083a3.leftMargin, i4);
                                                }
                                            }
                                            if (i5 == -1) {
                                                c0066e = m74a(i5);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.RIGHT, c0066e, C0065d.LEFT, c0083a3.rightMargin, mode);
                                                }
                                            } else if (mode2 != -1) {
                                                c0066e = m74a(mode2);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.RIGHT, c0066e, C0065d.RIGHT, c0083a3.rightMargin, mode);
                                                }
                                            }
                                            if (c0083a3.f341h == -1) {
                                                c0066e = m74a(c0083a3.f341h);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.TOP, c0066e, C0065d.TOP, c0083a3.topMargin, c0083a3.f351r);
                                                }
                                            } else if (c0083a3.f342i != -1) {
                                                c0066e = m74a(c0083a3.f342i);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.TOP, c0066e, C0065d.BOTTOM, c0083a3.topMargin, c0083a3.f351r);
                                                }
                                            }
                                            if (c0083a3.f343j == -1) {
                                                c0066e = m74a(c0083a3.f343j);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.BOTTOM, c0066e, C0065d.TOP, c0083a3.bottomMargin, c0083a3.f353t);
                                                }
                                            } else if (c0083a3.f344k != -1) {
                                                c0066e = m74a(c0083a3.f344k);
                                                if (c0066e != null) {
                                                    a.m89a(C0065d.BOTTOM, c0066e, C0065d.BOTTOM, c0083a3.bottomMargin, c0083a3.f353t);
                                                }
                                            }
                                            if (c0083a3.f345l != -1) {
                                                view = (View) this.f153a.get(c0083a3.f345l);
                                                c0066e = m74a(c0083a3.f345l);
                                                if (!(c0066e == null || view == null || !(view.getLayoutParams() instanceof C0083a))) {
                                                    c0083a = (C0083a) view.getLayoutParams();
                                                    c0083a3.f324P = true;
                                                    c0083a.f324P = true;
                                                    a.mo43a(C0065d.BASELINE).m80a(c0066e.mo43a(C0065d.BASELINE), 0, -1, C0064c.STRONG, 0, true);
                                                    a.mo43a(C0065d.TOP).m82c();
                                                    a.mo43a(C0065d.BOTTOM).m82c();
                                                }
                                            }
                                            if (f2 >= 0.0f && f2 != 0.5f) {
                                                a.f199K = f2;
                                            }
                                            if (c0083a3.f357x >= 0.0f && c0083a3.f357x != 0.5f) {
                                                a.f200L = c0083a3.f357x;
                                            }
                                            if (isInEditMode() && !(c0083a3.f319K == -1 && c0083a3.f320L == -1)) {
                                                i3 = c0083a3.f319K;
                                                childCount = c0083a3.f320L;
                                                a.f237w = i3;
                                                a.f238x = childCount;
                                            }
                                            if (c0083a3.f322N) {
                                                a.m90a(C0067f.FIXED);
                                                a.m87a(c0083a3.width);
                                            } else if (c0083a3.width != -1) {
                                                a.m90a(C0067f.MATCH_PARENT);
                                                a.mo43a(C0065d.LEFT).f166d = c0083a3.leftMargin;
                                                a.mo43a(C0065d.RIGHT).f166d = c0083a3.rightMargin;
                                            } else {
                                                a.m90a(C0067f.MATCH_CONSTRAINT);
                                                a.m87a(0);
                                            }
                                            if (c0083a3.f323O) {
                                                a.m95b(C0067f.FIXED);
                                                a.m93b(c0083a3.height);
                                            } else if (c0083a3.height != -1) {
                                                a.m95b(C0067f.MATCH_PARENT);
                                                a.mo43a(C0065d.TOP).f166d = c0083a3.topMargin;
                                                a.mo43a(C0065d.BOTTOM).f166d = c0083a3.bottomMargin;
                                            } else {
                                                a.m95b(C0067f.MATCH_CONSTRAINT);
                                                a.m93b(0);
                                            }
                                            if (c0083a3.f358y != null) {
                                                str = c0083a3.f358y;
                                                if (str != null || str.length() == 0) {
                                                    a.f235u = 0.0f;
                                                } else {
                                                    i3 = -1;
                                                    float f3 = 0.0f;
                                                    i4 = str.length();
                                                    childCount = str.indexOf(44);
                                                    if (childCount <= 0 || childCount >= i4 - 1) {
                                                        childCount = -1;
                                                        i3 = 0;
                                                    } else {
                                                        String substring = str.substring(0, childCount);
                                                        if (substring.equalsIgnoreCase("W")) {
                                                            i3 = 0;
                                                        } else if (substring.equalsIgnoreCase("H")) {
                                                            i3 = 1;
                                                        }
                                                        int i6 = childCount + 1;
                                                        childCount = i3;
                                                        i3 = i6;
                                                    }
                                                    mode = str.indexOf(58);
                                                    String substring2;
                                                    if (mode < 0 || mode >= i4 - 1) {
                                                        substring2 = str.substring(i3);
                                                        if (substring2.length() > 0) {
                                                            try {
                                                                f3 = Float.parseFloat(substring2);
                                                            } catch (NumberFormatException e) {
                                                            }
                                                        }
                                                    } else {
                                                        substring2 = str.substring(i3, mode);
                                                        str = str.substring(mode + 1);
                                                        if (substring2.length() > 0 && str.length() > 0) {
                                                            try {
                                                                f = Float.parseFloat(substring2);
                                                                float parseFloat = Float.parseFloat(str);
                                                                if (f <= 0.0f || parseFloat <= 0.0f) {
                                                                    f = f3;
                                                                } else if (childCount == 1) {
                                                                    f3 = Math.abs(parseFloat / f);
                                                                } else {
                                                                    f = Math.abs(f / parseFloat);
                                                                }
                                                                f3 = f;
                                                            } catch (NumberFormatException e2) {
                                                            }
                                                        }
                                                    }
                                                    if (f3 > 0.0f) {
                                                        a.f235u = f3;
                                                        a.f236v = childCount;
                                                    }
                                                }
                                            }
                                            a.ag = c0083a3.f309A;
                                            a.ah = c0083a3.f310B;
                                            a.ac = c0083a3.f311C;
                                            a.ad = c0083a3.f312D;
                                            i3 = c0083a3.f313E;
                                            childCount = c0083a3.f315G;
                                            size = c0083a3.f317I;
                                            a.f217c = i3;
                                            a.f219e = childCount;
                                            a.f220f = size;
                                            i3 = c0083a3.f314F;
                                            childCount = c0083a3.f316H;
                                            size = c0083a3.f318J;
                                            a.f218d = i3;
                                            a.f221g = childCount;
                                            a.f222h = size;
                                        }
                                    }
                                    f2 = f;
                                    i5 = childCount2;
                                    i3 = mode;
                                    mode = childCount;
                                    childCount = mode2;
                                    mode2 = size;
                                    if (childCount == -1) {
                                        c0066e = m74a(childCount);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.LEFT, c0066e, C0065d.LEFT, c0083a3.leftMargin, i4);
                                        }
                                    } else if (i3 != -1) {
                                        c0066e = m74a(i3);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.LEFT, c0066e, C0065d.RIGHT, c0083a3.leftMargin, i4);
                                        }
                                    }
                                    if (i5 == -1) {
                                        c0066e = m74a(i5);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.RIGHT, c0066e, C0065d.LEFT, c0083a3.rightMargin, mode);
                                        }
                                    } else if (mode2 != -1) {
                                        c0066e = m74a(mode2);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.RIGHT, c0066e, C0065d.RIGHT, c0083a3.rightMargin, mode);
                                        }
                                    }
                                    if (c0083a3.f341h == -1) {
                                        c0066e = m74a(c0083a3.f341h);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.TOP, c0066e, C0065d.TOP, c0083a3.topMargin, c0083a3.f351r);
                                        }
                                    } else if (c0083a3.f342i != -1) {
                                        c0066e = m74a(c0083a3.f342i);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.TOP, c0066e, C0065d.BOTTOM, c0083a3.topMargin, c0083a3.f351r);
                                        }
                                    }
                                    if (c0083a3.f343j == -1) {
                                        c0066e = m74a(c0083a3.f343j);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.BOTTOM, c0066e, C0065d.TOP, c0083a3.bottomMargin, c0083a3.f353t);
                                        }
                                    } else if (c0083a3.f344k != -1) {
                                        c0066e = m74a(c0083a3.f344k);
                                        if (c0066e != null) {
                                            a.m89a(C0065d.BOTTOM, c0066e, C0065d.BOTTOM, c0083a3.bottomMargin, c0083a3.f353t);
                                        }
                                    }
                                    if (c0083a3.f345l != -1) {
                                        view = (View) this.f153a.get(c0083a3.f345l);
                                        c0066e = m74a(c0083a3.f345l);
                                        c0083a = (C0083a) view.getLayoutParams();
                                        c0083a3.f324P = true;
                                        c0083a.f324P = true;
                                        a.mo43a(C0065d.BASELINE).m80a(c0066e.mo43a(C0065d.BASELINE), 0, -1, C0064c.STRONG, 0, true);
                                        a.mo43a(C0065d.TOP).m82c();
                                        a.mo43a(C0065d.BOTTOM).m82c();
                                    }
                                    a.f199K = f2;
                                    a.f200L = c0083a3.f357x;
                                    i3 = c0083a3.f319K;
                                    childCount = c0083a3.f320L;
                                    a.f237w = i3;
                                    a.f238x = childCount;
                                    if (c0083a3.f322N) {
                                        a.m90a(C0067f.FIXED);
                                        a.m87a(c0083a3.width);
                                    } else if (c0083a3.width != -1) {
                                        a.m90a(C0067f.MATCH_CONSTRAINT);
                                        a.m87a(0);
                                    } else {
                                        a.m90a(C0067f.MATCH_PARENT);
                                        a.mo43a(C0065d.LEFT).f166d = c0083a3.leftMargin;
                                        a.mo43a(C0065d.RIGHT).f166d = c0083a3.rightMargin;
                                    }
                                    if (c0083a3.f323O) {
                                        a.m95b(C0067f.FIXED);
                                        a.m93b(c0083a3.height);
                                    } else if (c0083a3.height != -1) {
                                        a.m95b(C0067f.MATCH_CONSTRAINT);
                                        a.m93b(0);
                                    } else {
                                        a.m95b(C0067f.MATCH_PARENT);
                                        a.mo43a(C0065d.TOP).f166d = c0083a3.topMargin;
                                        a.mo43a(C0065d.BOTTOM).f166d = c0083a3.bottomMargin;
                                    }
                                    if (c0083a3.f358y != null) {
                                        str = c0083a3.f358y;
                                        if (str != null) {
                                        }
                                        a.f235u = 0.0f;
                                    }
                                    a.ag = c0083a3.f309A;
                                    a.ah = c0083a3.f310B;
                                    a.ac = c0083a3.f311C;
                                    a.ad = c0083a3.f312D;
                                    i3 = c0083a3.f313E;
                                    childCount = c0083a3.f315G;
                                    size = c0083a3.f317I;
                                    a.f217c = i3;
                                    a.f219e = childCount;
                                    a.f220f = size;
                                    i3 = c0083a3.f314F;
                                    childCount = c0083a3.f316H;
                                    size = c0083a3.f318J;
                                    a.f218d = i3;
                                    a.f221g = childCount;
                                    a.f222h = size;
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            if (obj != null) {
                this.f154b.clear();
                if (this.f162j != null) {
                    c0084b = this.f162j;
                    childCount2 = getChildCount();
                    hashSet = new HashSet(c0084b.f362b.keySet());
                    for (childCount = 0; childCount < childCount2; childCount++) {
                        childAt = getChildAt(childCount);
                        size2 = childAt.getId();
                        if (c0084b.f362b.containsKey(Integer.valueOf(size2))) {
                            hashSet.remove(Integer.valueOf(size2));
                            c0085c = (C0085c) c0084b.f362b.get(Integer.valueOf(size2));
                            c0083a = (C0083a) childAt.getLayoutParams();
                            c0085c.m182a(c0083a);
                            childAt.setLayoutParams(c0083a);
                            childAt.setVisibility(c0085c.f369G);
                            if (VERSION.SDK_INT >= 17) {
                                childAt.setAlpha(c0085c.f380R);
                                childAt.setRotationX(c0085c.f383U);
                                childAt.setRotationY(c0085c.f384V);
                                childAt.setScaleX(c0085c.f385W);
                                childAt.setScaleY(c0085c.f386X);
                                childAt.setPivotX(c0085c.f387Y);
                                childAt.setPivotY(c0085c.f388Z);
                                childAt.setTranslationX(c0085c.aa);
                                childAt.setTranslationY(c0085c.ab);
                                if (VERSION.SDK_INT >= 21) {
                                    childAt.setTranslationZ(c0085c.ac);
                                    if (c0085c.f381S) {
                                        childAt.setElevation(c0085c.f382T);
                                    }
                                }
                            }
                        }
                    }
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        num = (Integer) it.next();
                        c0085c2 = (C0085c) c0084b.f362b.get(num);
                        if (c0085c2.f389a) {
                            guideline = new Guideline(getContext());
                            guideline.setId(num.intValue());
                            c0083a2 = new C0083a();
                            c0085c2.m182a(c0083a2);
                            addView(guideline, c0083a2);
                        }
                    }
                }
                childCount3 = getChildCount();
                this.f155c.aA.clear();
                for (paddingLeft2 = 0; paddingLeft2 < childCount3; paddingLeft2++) {
                    childAt2 = getChildAt(paddingLeft2);
                    a = m75a(childAt2);
                    if (a != null) {
                        c0083a3 = (C0083a) childAt2.getLayoutParams();
                        a.mo38a();
                        a.f204P = childAt2.getVisibility();
                        a.f203O = childAt2;
                        c0066e = this.f155c;
                        c0066e.aA.add(a);
                        if (a.f232r != null) {
                            ((C0068l) a.f232r).m114a(a);
                        }
                        a.f232r = c0066e;
                        this.f154b.add(a);
                        if (c0083a3.f325Q) {
                            c0070h = (C0070h) a;
                            if (c0083a3.f334a != -1) {
                                i3 = c0083a3.f334a;
                                if (i3 >= 0) {
                                    c0070h.ak = -1.0f;
                                    c0070h.al = i3;
                                    c0070h.am = -1;
                                }
                            }
                            if (c0083a3.f335b != -1) {
                                i3 = c0083a3.f335b;
                                if (i3 >= 0) {
                                    c0070h.ak = -1.0f;
                                    c0070h.al = -1;
                                    c0070h.am = i3;
                                }
                            }
                            if (c0083a3.f336c != -1.0f) {
                                f = c0083a3.f336c;
                                if (f > -1.0f) {
                                    c0070h.ak = f;
                                    c0070h.al = -1;
                                    c0070h.am = -1;
                                }
                            }
                        } else {
                            if (c0083a3.f326R == -1) {
                            }
                            mode2 = c0083a3.f326R;
                            mode = c0083a3.f327S;
                            childCount2 = c0083a3.f328T;
                            size = c0083a3.f329U;
                            i4 = c0083a3.f330V;
                            childCount = c0083a3.f331W;
                            f = c0083a3.f332X;
                            if (VERSION.SDK_INT < 17) {
                                mode2 = c0083a3.f337d;
                                mode = c0083a3.f338e;
                                childCount2 = c0083a3.f339f;
                                size = c0083a3.f340g;
                                i4 = c0083a3.f350q;
                                childCount = c0083a3.f352s;
                                f = c0083a3.f356w;
                                if (c0083a3.f347n != -1) {
                                    mode2 = c0083a3.f347n;
                                } else if (c0083a3.f346m != -1) {
                                    mode = c0083a3.f346m;
                                }
                                if (c0083a3.f348o != -1) {
                                    f2 = f;
                                    i5 = c0083a3.f348o;
                                    i3 = mode;
                                    mode = childCount;
                                    childCount = mode2;
                                    mode2 = size;
                                } else if (c0083a3.f349p != -1) {
                                    f2 = f;
                                    i5 = childCount2;
                                    i3 = mode;
                                    mode = childCount;
                                    childCount = mode2;
                                    mode2 = c0083a3.f349p;
                                }
                                if (childCount == -1) {
                                    c0066e = m74a(childCount);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.LEFT, c0066e, C0065d.LEFT, c0083a3.leftMargin, i4);
                                    }
                                } else if (i3 != -1) {
                                    c0066e = m74a(i3);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.LEFT, c0066e, C0065d.RIGHT, c0083a3.leftMargin, i4);
                                    }
                                }
                                if (i5 == -1) {
                                    c0066e = m74a(i5);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.RIGHT, c0066e, C0065d.LEFT, c0083a3.rightMargin, mode);
                                    }
                                } else if (mode2 != -1) {
                                    c0066e = m74a(mode2);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.RIGHT, c0066e, C0065d.RIGHT, c0083a3.rightMargin, mode);
                                    }
                                }
                                if (c0083a3.f341h == -1) {
                                    c0066e = m74a(c0083a3.f341h);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.TOP, c0066e, C0065d.TOP, c0083a3.topMargin, c0083a3.f351r);
                                    }
                                } else if (c0083a3.f342i != -1) {
                                    c0066e = m74a(c0083a3.f342i);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.TOP, c0066e, C0065d.BOTTOM, c0083a3.topMargin, c0083a3.f351r);
                                    }
                                }
                                if (c0083a3.f343j == -1) {
                                    c0066e = m74a(c0083a3.f343j);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.BOTTOM, c0066e, C0065d.TOP, c0083a3.bottomMargin, c0083a3.f353t);
                                    }
                                } else if (c0083a3.f344k != -1) {
                                    c0066e = m74a(c0083a3.f344k);
                                    if (c0066e != null) {
                                        a.m89a(C0065d.BOTTOM, c0066e, C0065d.BOTTOM, c0083a3.bottomMargin, c0083a3.f353t);
                                    }
                                }
                                if (c0083a3.f345l != -1) {
                                    view = (View) this.f153a.get(c0083a3.f345l);
                                    c0066e = m74a(c0083a3.f345l);
                                    c0083a = (C0083a) view.getLayoutParams();
                                    c0083a3.f324P = true;
                                    c0083a.f324P = true;
                                    a.mo43a(C0065d.BASELINE).m80a(c0066e.mo43a(C0065d.BASELINE), 0, -1, C0064c.STRONG, 0, true);
                                    a.mo43a(C0065d.TOP).m82c();
                                    a.mo43a(C0065d.BOTTOM).m82c();
                                }
                                a.f199K = f2;
                                a.f200L = c0083a3.f357x;
                                i3 = c0083a3.f319K;
                                childCount = c0083a3.f320L;
                                a.f237w = i3;
                                a.f238x = childCount;
                                if (c0083a3.f322N) {
                                    a.m90a(C0067f.FIXED);
                                    a.m87a(c0083a3.width);
                                } else if (c0083a3.width != -1) {
                                    a.m90a(C0067f.MATCH_PARENT);
                                    a.mo43a(C0065d.LEFT).f166d = c0083a3.leftMargin;
                                    a.mo43a(C0065d.RIGHT).f166d = c0083a3.rightMargin;
                                } else {
                                    a.m90a(C0067f.MATCH_CONSTRAINT);
                                    a.m87a(0);
                                }
                                if (c0083a3.f323O) {
                                    a.m95b(C0067f.FIXED);
                                    a.m93b(c0083a3.height);
                                } else if (c0083a3.height != -1) {
                                    a.m95b(C0067f.MATCH_PARENT);
                                    a.mo43a(C0065d.TOP).f166d = c0083a3.topMargin;
                                    a.mo43a(C0065d.BOTTOM).f166d = c0083a3.bottomMargin;
                                } else {
                                    a.m95b(C0067f.MATCH_CONSTRAINT);
                                    a.m93b(0);
                                }
                                if (c0083a3.f358y != null) {
                                    str = c0083a3.f358y;
                                    if (str != null) {
                                    }
                                    a.f235u = 0.0f;
                                }
                                a.ag = c0083a3.f309A;
                                a.ah = c0083a3.f310B;
                                a.ac = c0083a3.f311C;
                                a.ad = c0083a3.f312D;
                                i3 = c0083a3.f313E;
                                childCount = c0083a3.f315G;
                                size = c0083a3.f317I;
                                a.f217c = i3;
                                a.f219e = childCount;
                                a.f220f = size;
                                i3 = c0083a3.f314F;
                                childCount = c0083a3.f316H;
                                size = c0083a3.f318J;
                                a.f218d = i3;
                                a.f221g = childCount;
                                a.f222h = size;
                            }
                            f2 = f;
                            i5 = childCount2;
                            i3 = mode;
                            mode = childCount;
                            childCount = mode2;
                            mode2 = size;
                            if (childCount == -1) {
                                c0066e = m74a(childCount);
                                if (c0066e != null) {
                                    a.m89a(C0065d.LEFT, c0066e, C0065d.LEFT, c0083a3.leftMargin, i4);
                                }
                            } else if (i3 != -1) {
                                c0066e = m74a(i3);
                                if (c0066e != null) {
                                    a.m89a(C0065d.LEFT, c0066e, C0065d.RIGHT, c0083a3.leftMargin, i4);
                                }
                            }
                            if (i5 == -1) {
                                c0066e = m74a(i5);
                                if (c0066e != null) {
                                    a.m89a(C0065d.RIGHT, c0066e, C0065d.LEFT, c0083a3.rightMargin, mode);
                                }
                            } else if (mode2 != -1) {
                                c0066e = m74a(mode2);
                                if (c0066e != null) {
                                    a.m89a(C0065d.RIGHT, c0066e, C0065d.RIGHT, c0083a3.rightMargin, mode);
                                }
                            }
                            if (c0083a3.f341h == -1) {
                                c0066e = m74a(c0083a3.f341h);
                                if (c0066e != null) {
                                    a.m89a(C0065d.TOP, c0066e, C0065d.TOP, c0083a3.topMargin, c0083a3.f351r);
                                }
                            } else if (c0083a3.f342i != -1) {
                                c0066e = m74a(c0083a3.f342i);
                                if (c0066e != null) {
                                    a.m89a(C0065d.TOP, c0066e, C0065d.BOTTOM, c0083a3.topMargin, c0083a3.f351r);
                                }
                            }
                            if (c0083a3.f343j == -1) {
                                c0066e = m74a(c0083a3.f343j);
                                if (c0066e != null) {
                                    a.m89a(C0065d.BOTTOM, c0066e, C0065d.TOP, c0083a3.bottomMargin, c0083a3.f353t);
                                }
                            } else if (c0083a3.f344k != -1) {
                                c0066e = m74a(c0083a3.f344k);
                                if (c0066e != null) {
                                    a.m89a(C0065d.BOTTOM, c0066e, C0065d.BOTTOM, c0083a3.bottomMargin, c0083a3.f353t);
                                }
                            }
                            if (c0083a3.f345l != -1) {
                                view = (View) this.f153a.get(c0083a3.f345l);
                                c0066e = m74a(c0083a3.f345l);
                                c0083a = (C0083a) view.getLayoutParams();
                                c0083a3.f324P = true;
                                c0083a.f324P = true;
                                a.mo43a(C0065d.BASELINE).m80a(c0066e.mo43a(C0065d.BASELINE), 0, -1, C0064c.STRONG, 0, true);
                                a.mo43a(C0065d.TOP).m82c();
                                a.mo43a(C0065d.BOTTOM).m82c();
                            }
                            a.f199K = f2;
                            a.f200L = c0083a3.f357x;
                            i3 = c0083a3.f319K;
                            childCount = c0083a3.f320L;
                            a.f237w = i3;
                            a.f238x = childCount;
                            if (c0083a3.f322N) {
                                a.m90a(C0067f.FIXED);
                                a.m87a(c0083a3.width);
                            } else if (c0083a3.width != -1) {
                                a.m90a(C0067f.MATCH_CONSTRAINT);
                                a.m87a(0);
                            } else {
                                a.m90a(C0067f.MATCH_PARENT);
                                a.mo43a(C0065d.LEFT).f166d = c0083a3.leftMargin;
                                a.mo43a(C0065d.RIGHT).f166d = c0083a3.rightMargin;
                            }
                            if (c0083a3.f323O) {
                                a.m95b(C0067f.FIXED);
                                a.m93b(c0083a3.height);
                            } else if (c0083a3.height != -1) {
                                a.m95b(C0067f.MATCH_CONSTRAINT);
                                a.m93b(0);
                            } else {
                                a.m95b(C0067f.MATCH_PARENT);
                                a.mo43a(C0065d.TOP).f166d = c0083a3.topMargin;
                                a.mo43a(C0065d.BOTTOM).f166d = c0083a3.bottomMargin;
                            }
                            if (c0083a3.f358y != null) {
                                str = c0083a3.f358y;
                                if (str != null) {
                                }
                                a.f235u = 0.0f;
                            }
                            a.ag = c0083a3.f309A;
                            a.ah = c0083a3.f310B;
                            a.ac = c0083a3.f311C;
                            a.ad = c0083a3.f312D;
                            i3 = c0083a3.f313E;
                            childCount = c0083a3.f315G;
                            size = c0083a3.f317I;
                            a.f217c = i3;
                            a.f219e = childCount;
                            a.f220f = size;
                            i3 = c0083a3.f314F;
                            childCount = c0083a3.f316H;
                            size = c0083a3.f318J;
                            a.f218d = i3;
                            a.f221g = childCount;
                            a.f222h = size;
                        }
                    }
                }
            }
        }
        m76a(i, i2);
        if (getChildCount() > 0) {
            this.f155c.mo42o();
        }
        paddingTop2 = 0;
        int size3 = this.f154b.size();
        i5 = paddingTop + getPaddingBottom();
        paddingLeft += getPaddingRight();
        if (size3 > 0) {
            Object obj2;
            Object obj3 = null;
            Object obj4 = this.f155c.f201M == C0067f.WRAP_CONTENT ? 1 : null;
            if (this.f155c.f202N == C0067f.WRAP_CONTENT) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            paddingLeft2 = 0;
            while (paddingLeft2 < size3) {
                a = (C0066e) this.f154b.get(paddingLeft2);
                if (!(a instanceof C0070h)) {
                    view = (View) a.f203O;
                    if (!(view == null || view.getVisibility() == 8)) {
                        Object obj5;
                        C0083a c0083a4 = (C0083a) view.getLayoutParams();
                        if (c0083a4.width == -2) {
                            i4 = getChildMeasureSpec(i, paddingLeft, c0083a4.width);
                        } else {
                            i4 = MeasureSpec.makeMeasureSpec(a.m97c(), MemoryMappedFileBuffer.DEFAULT_SIZE);
                        }
                        if (c0083a4.height == -2) {
                            mode = getChildMeasureSpec(i2, i5, c0083a4.height);
                        } else {
                            mode = MeasureSpec.makeMeasureSpec(a.m103f(), MemoryMappedFileBuffer.DEFAULT_SIZE);
                        }
                        view.measure(i4, mode);
                        i4 = view.getMeasuredWidth();
                        mode = view.getMeasuredHeight();
                        if (i4 != a.m97c()) {
                            a.m87a(i4);
                            if (obj4 != null && a.m106i() > this.f155c.m97c()) {
                                this.f155c.m87a(Math.max(this.f156d, a.m106i() + a.mo43a(C0065d.RIGHT).m81b()));
                            }
                            obj5 = 1;
                        } else {
                            obj5 = obj3;
                        }
                        if (mode != a.m103f()) {
                            a.m93b(mode);
                            if (obj2 != null && a.m107j() > this.f155c.m103f()) {
                                this.f155c.m93b(Math.max(this.f157e, a.m107j() + a.mo43a(C0065d.BOTTOM).m81b()));
                            }
                            obj5 = 1;
                        }
                        if (c0083a4.f324P) {
                            childCount = view.getBaseline();
                            if (!(childCount == -1 || childCount == a.f194E)) {
                                a.f194E = childCount;
                                obj5 = 1;
                            }
                        }
                        if (VERSION.SDK_INT >= 11) {
                            size2 = combineMeasuredStates(paddingTop2, view.getMeasuredState());
                            obj3 = obj5;
                        } else {
                            obj3 = obj5;
                            size2 = paddingTop2;
                        }
                        paddingLeft2++;
                        paddingTop2 = size2;
                    }
                }
                size2 = paddingTop2;
                paddingLeft2++;
                paddingTop2 = size2;
            }
            if (obj3 != null) {
                this.f155c.mo42o();
            }
        }
        size2 = this.f155c.m97c() + paddingLeft;
        i3 = this.f155c.m103f() + i5;
        if (VERSION.SDK_INT >= 11) {
            size2 = resolveSizeAndState(size2, i, paddingTop2);
            size2 = Math.min(this.f158f, size2) & 16777215;
            i3 = Math.min(this.f159g, resolveSizeAndState(i3, i2, paddingTop2 << 16)) & 16777215;
            if (this.f155c.ay) {
                size2 |= 16777216;
            }
            if (this.f155c.az) {
                i3 |= 16777216;
            }
            setMeasuredDimension(size2, i3);
            return;
        }
        setMeasuredDimension(size2, i3);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0083a c0083a = (C0083a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || c0083a.f325Q || isInEditMode) {
                C0066e c0066e = c0083a.f333Y;
                int g = c0066e.m104g();
                int h = c0066e.m105h();
                childAt.layout(g, h, c0066e.m97c() + g, c0066e.m103f() + h);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.f155c.av = i;
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0083a(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0083a;
    }

    public void setConstraintSet(C0084b c0084b) {
        this.f162j = c0084b;
    }

    public void requestLayout() {
        super.requestLayout();
        this.f160h = true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0083a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0083a(getContext(), attributeSet);
    }
}
