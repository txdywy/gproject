package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.support.design.C0121d;
import android.support.design.C0127i;
import android.support.design.C0134j;
import android.support.design.p018a.C0095a;
import android.support.design.p022d.C0120a;
import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import android.support.v4.p037h.C0323s;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.support.v4.view.ai;
import android.support.v4.view.bd;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Iterator;

@bd
public class TabLayout extends HorizontalScrollView {
    public static final C0321q f675a = new C0323s(16);
    public final ArrayList f676A;
    public ce f677B;
    public ValueAnimator f678C;
    public ViewPager f679D;
    public af f680E;
    public DataSetObserver f681F;
    public ck f682G;
    public cd f683H;
    public boolean f684I;
    public final C0321q f685J;
    public final ArrayList f686b;
    public cj f687c;
    public final cg f688d;
    public int f689e;
    public int f690f;
    public int f691g;
    public int f692h;
    public int f693i;
    public ColorStateList f694j;
    public ColorStateList f695k;
    public ColorStateList f696l;
    public ColorStateList f697m;
    public Mode f698n;
    public float f699o;
    public float f700p;
    public final int f701q;
    public int f702r;
    public final int f703s;
    public final int f704t;
    public final int f705u;
    public int f706v;
    public int f707w;
    public int f708x;
    public boolean f709y;
    public ce f710z;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f686b = new ArrayList();
        this.f702r = Integer.MAX_VALUE;
        this.f676A = new ArrayList();
        this.f685J = new C0322r(12);
        cn.m768a(context);
        setHorizontalScrollBarEnabled(false);
        this.f688d = new cg(this, context);
        super.addView(this.f688d, 0, new LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.TabLayout, i, C0127i.Widget_Design_TabLayout);
        this.f688d.m752b(obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabIndicatorHeight, 0));
        this.f688d.m750a(obtainStyledAttributes.getColor(C0134j.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabPadding, 0);
        this.f692h = dimensionPixelSize;
        this.f691g = dimensionPixelSize;
        this.f690f = dimensionPixelSize;
        this.f689e = dimensionPixelSize;
        this.f689e = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabPaddingStart, this.f689e);
        this.f690f = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabPaddingTop, this.f690f);
        this.f691g = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabPaddingEnd, this.f691g);
        this.f692h = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabPaddingBottom, this.f692h);
        this.f693i = obtainStyledAttributes.getResourceId(C0134j.TabLayout_tabTextAppearance, C0127i.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f693i, C0403j.TextAppearance);
        try {
            this.f699o = (float) obtainStyledAttributes2.getDimensionPixelSize(C0403j.TextAppearance_android_textSize, 0);
            this.f694j = C0120a.m232a(context, obtainStyledAttributes2, C0403j.TextAppearance_android_textColor);
            if (obtainStyledAttributes.hasValue(C0134j.TabLayout_tabTextColor)) {
                this.f694j = C0120a.m232a(context, obtainStyledAttributes, C0134j.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C0134j.TabLayout_tabSelectedTextColor)) {
                this.f694j = m513b(this.f694j.getDefaultColor(), obtainStyledAttributes.getColor(C0134j.TabLayout_tabSelectedTextColor, 0));
            }
            this.f695k = C0120a.m232a(context, obtainStyledAttributes, C0134j.TabLayout_tabIconTint);
            this.f698n = cr.m773a(obtainStyledAttributes.getInt(C0134j.TabLayout_tabIconTintMode, -1));
            this.f696l = C0120a.m232a(context, obtainStyledAttributes, C0134j.TabLayout_tabRippleColor);
            this.f697m = C0120a.m232a(context, obtainStyledAttributes, C0134j.TabLayout_tabRippleAlpha);
            this.f703s = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabMinWidth, -1);
            this.f704t = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabMaxWidth, -1);
            this.f701q = obtainStyledAttributes.getResourceId(C0134j.TabLayout_tabBackground, 0);
            this.f706v = obtainStyledAttributes.getDimensionPixelSize(C0134j.TabLayout_tabContentStart, 0);
            this.f708x = obtainStyledAttributes.getInt(C0134j.TabLayout_tabMode, 1);
            this.f707w = obtainStyledAttributes.getInt(C0134j.TabLayout_tabGravity, 0);
            this.f709y = obtainStyledAttributes.getBoolean(C0134j.TabLayout_tabInlineLabel, false);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f700p = (float) resources.getDimensionPixelSize(C0121d.design_tab_text_size_2line);
            this.f705u = resources.getDimensionPixelSize(C0121d.design_tab_scrollable_min_width);
            m519d();
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f688d.m750a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f688d.m752b(i);
    }

    private final void m518c(int i) {
        m525a(i, 0.0f, true, true);
    }

    final void m525a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f688d.getChildCount()) {
            if (z2) {
                cg cgVar = this.f688d;
                if (cgVar.f927h != null && cgVar.f927h.isRunning()) {
                    cgVar.f927h.cancel();
                }
                cgVar.f922c = i;
                cgVar.f923d = f;
                cgVar.m749a();
            }
            if (this.f678C != null && this.f678C.isRunning()) {
                this.f678C.cancel();
            }
            scrollTo(m507a(i, f), 0);
            if (z) {
                m522e(round);
            }
        }
    }

    private final void m516b(cj cjVar, boolean z) {
        int size = this.f686b.size();
        if (cjVar.f941f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m509a(cjVar, size);
        View view = cjVar.f942g;
        cg cgVar = this.f688d;
        int i = cjVar.f939d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m512a(layoutParams);
        cgVar.addView(view, i, layoutParams);
        if (z) {
            cjVar.m755a();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(ce ceVar) {
        if (this.f710z != null) {
            m515b(this.f710z);
        }
        this.f710z = ceVar;
        if (ceVar != null) {
            m508a(ceVar);
        }
    }

    private final void m508a(ce ceVar) {
        if (!this.f676A.contains(ceVar)) {
            this.f676A.add(ceVar);
        }
    }

    private final void m515b(ce ceVar) {
        this.f676A.remove(ceVar);
    }

    private final cj m514b() {
        cj cjVar;
        cj cjVar2 = (cj) f675a.mo381a();
        if (cjVar2 == null) {
            cjVar = new cj();
        } else {
            cjVar = cjVar2;
        }
        cjVar.f941f = this;
        cl clVar = this.f685J != null ? (cl) this.f685J.mo381a() : null;
        if (clVar == null) {
            clVar = new cl(this, getContext());
        }
        clVar.m763a(cjVar);
        clVar.setFocusable(true);
        clVar.setMinimumWidth(m521e());
        cjVar.f942g = clVar;
        return cjVar;
    }

    public int getTabCount() {
        return this.f686b.size();
    }

    public final cj m523a(int i) {
        return (i < 0 || i >= getTabCount()) ? null : (cj) this.f686b.get(i);
    }

    public int getSelectedTabPosition() {
        if (this.f687c != null) {
            return this.f687c.f939d;
        }
        return -1;
    }

    public void setTabMode(int i) {
        if (i != this.f708x) {
            this.f708x = i;
            m519d();
        }
    }

    public int getTabMode() {
        return this.f708x;
    }

    public void setTabGravity(int i) {
        if (this.f707w != i) {
            this.f707w = i;
            m519d();
        }
    }

    public int getTabGravity() {
        return this.f707w;
    }

    public void setInlineLabel(boolean z) {
        if (this.f709y != z) {
            this.f709y = z;
            for (int i = 0; i < this.f688d.getChildCount(); i++) {
                View childAt = this.f688d.getChildAt(i);
                if (childAt instanceof cl) {
                    cl clVar = (cl) childAt;
                    clVar.setOrientation(clVar.f953h.f709y ? 0 : 1);
                    if (clVar.f950e == null && clVar.f951f == null) {
                        clVar.m764a(clVar.f947b, clVar.f948c);
                    } else {
                        clVar.m764a(clVar.f950e, clVar.f951f);
                    }
                }
            }
            m519d();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f694j != colorStateList) {
            this.f694j = colorStateList;
            m517c();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.f694j;
    }

    public final void m526a(int i, int i2) {
        setTabTextColors(m513b(i, i2));
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f695k != colorStateList) {
            this.f695k = colorStateList;
            m517c();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0436b.m2649a(getContext(), i));
    }

    public ColorStateList getTabIconTint() {
        return this.f695k;
    }

    public ColorStateList getTabRippleColor() {
        return this.f696l;
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f696l != colorStateList) {
            this.f696l = colorStateList;
            for (int i = 0; i < this.f688d.getChildCount(); i++) {
                View childAt = this.f688d.getChildAt(i);
                if (childAt instanceof cl) {
                    ((cl) childAt).m762a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0436b.m2649a(getContext(), i));
    }

    public ColorStateList getTabRippleAlpha() {
        return this.f697m;
    }

    public void setTabRippleAlpha(ColorStateList colorStateList) {
        if (this.f697m != colorStateList) {
            this.f697m = colorStateList;
            for (int i = 0; i < this.f688d.getChildCount(); i++) {
                View childAt = this.f688d.getChildAt(i);
                if (childAt instanceof cl) {
                    ((cl) childAt).m762a(getContext());
                }
            }
        }
    }

    public void setTabRippleAlphaResource(int i) {
        setTabRippleAlpha(C0436b.m2649a(getContext(), i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m510a(viewPager, false);
    }

    private final void m510a(ViewPager viewPager, boolean z) {
        if (this.f679D != null) {
            if (this.f682G != null) {
                this.f679D.m1759b(this.f682G);
            }
            if (this.f683H != null) {
                ViewPager viewPager2 = this.f679D;
                cd cdVar = this.f683H;
                if (viewPager2.f1805W != null) {
                    viewPager2.f1805W.remove(cdVar);
                }
            }
        }
        if (this.f677B != null) {
            m515b(this.f677B);
            this.f677B = null;
        }
        if (viewPager != null) {
            this.f679D = viewPager;
            if (this.f682G == null) {
                this.f682G = new ck(this);
            }
            ck ckVar = this.f682G;
            ckVar.f945c = 0;
            ckVar.f944b = 0;
            viewPager.m1758a(this.f682G);
            this.f677B = new cm(viewPager);
            m508a(this.f677B);
            af adapter = viewPager.getAdapter();
            if (adapter != null) {
                m528a(adapter, true);
            }
            if (this.f683H == null) {
                this.f683H = new cd(this);
            }
            this.f683H.f917a = true;
            cd cdVar2 = this.f683H;
            if (viewPager.f1805W == null) {
                viewPager.f1805W = new ArrayList();
            }
            viewPager.f1805W.add(cdVar2);
            m518c(viewPager.getCurrentItem());
        } else {
            this.f679D = null;
            m528a(null, false);
        }
        this.f684I = z;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(af afVar) {
        m528a(afVar, false);
    }

    public boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.f688d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f679D == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m510a((ViewPager) parent, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f684I) {
            setupWithViewPager(null);
            this.f684I = false;
        }
    }

    final void m528a(af afVar, boolean z) {
        if (!(this.f680E == null || this.f681F == null)) {
            this.f680E.m1816b(this.f681F);
        }
        this.f680E = afVar;
        if (z && afVar != null) {
            if (this.f681F == null) {
                this.f681F = new cf(this);
            }
            afVar.m1808a(this.f681F);
        }
        m524a();
    }

    final void m524a() {
        int childCount;
        for (childCount = this.f688d.getChildCount() - 1; childCount >= 0; childCount--) {
            cl clVar = (cl) this.f688d.getChildAt(childCount);
            this.f688d.removeViewAt(childCount);
            if (clVar != null) {
                clVar.m763a(null);
                clVar.setSelected(false);
                this.f685J.mo382a(clVar);
            }
            requestLayout();
        }
        Iterator it = this.f686b.iterator();
        while (it.hasNext()) {
            cj cjVar = (cj) it.next();
            it.remove();
            cjVar.f941f = null;
            cjVar.f942g = null;
            cjVar.f936a = null;
            cjVar.f937b = null;
            cjVar.f938c = null;
            cjVar.f939d = -1;
            cjVar.f940e = null;
            f675a.mo382a(cjVar);
        }
        this.f687c = null;
        if (this.f680E != null) {
            int i;
            childCount = this.f680E.mo961a();
            for (i = 0; i < childCount; i++) {
                m516b(m514b().m754a(this.f680E.mo1371a(i)), false);
            }
            if (this.f679D != null && childCount > 0) {
                i = this.f679D.getCurrentItem();
                if (i != getSelectedTabPosition() && i < getTabCount()) {
                    m527a(m523a(i), true);
                }
            }
        }
    }

    private final void m517c() {
        int size = this.f686b.size();
        for (int i = 0; i < size; i++) {
            ((cj) this.f686b.get(i)).m756b();
        }
    }

    private final void m509a(cj cjVar, int i) {
        cjVar.f939d = i;
        this.f686b.add(i, cjVar);
        int size = this.f686b.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((cj) this.f686b.get(i2)).f939d = i2;
        }
    }

    public void addView(View view) {
        m511a(view);
    }

    public void addView(View view, int i) {
        m511a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m511a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m511a(view);
    }

    private final void m511a(View view) {
        if (view instanceof cb) {
            cb cbVar = (cb) view;
            cj b = m514b();
            if (cbVar.f913a != null) {
                b.m754a(cbVar.f913a);
            }
            if (cbVar.f914b != null) {
                b.f936a = cbVar.f914b;
                b.m756b();
            }
            if (cbVar.f915c != 0) {
                b.f940e = LayoutInflater.from(b.f942g.getContext()).inflate(cbVar.f915c, b.f942g, false);
                b.m756b();
            }
            if (!TextUtils.isEmpty(cbVar.getContentDescription())) {
                b.f938c = cbVar.getContentDescription();
                b.m756b();
            }
            m516b(b, this.f686b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void m512a(LinearLayout.LayoutParams layoutParams) {
        if (this.f708x == 1 && this.f707w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    final int m530b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = 1;
        int size = this.f686b.size();
        for (int i5 = 0; i5 < size; i5++) {
            cj cjVar = (cj) this.f686b.get(i5);
            if (cjVar != null && cjVar.f936a != null && !TextUtils.isEmpty(cjVar.f937b)) {
                i3 = 1;
                break;
            }
        }
        i3 = 0;
        i3 = (i3 == 0 || this.f709y) ? 48 : 72;
        i3 = (m530b(i3) + getPaddingTop()) + getPaddingBottom();
        switch (MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), MemoryMappedFileBuffer.DEFAULT_SIZE);
                break;
            case 0:
                i2 = MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE);
                break;
        }
        i3 = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            if (this.f704t > 0) {
                i3 = this.f704t;
            } else {
                i3 -= m530b(56);
            }
            this.f702r = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            switch (this.f708x) {
                case 0:
                    if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                        i3 = 0;
                        break;
                    } else {
                        i3 = 1;
                        break;
                    }
                case 1:
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        i4 = 0;
                    }
                    i3 = i4;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    private final void m520d(int i) {
        if (i != -1) {
            if (getWindowToken() != null && ai.f1848a.mo409s(this)) {
                int i2;
                cg cgVar = this.f688d;
                int childCount = cgVar.getChildCount();
                for (i2 = 0; i2 < childCount; i2++) {
                    if (cgVar.getChildAt(i2).getWidth() <= 0) {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 0;
                if (i2 == 0) {
                    if (getScrollX() != m507a(i, 0.0f)) {
                        if (this.f678C == null) {
                            this.f678C = new ValueAnimator();
                            this.f678C.setInterpolator(C0095a.f421a);
                            this.f678C.setDuration(300);
                            this.f678C.addUpdateListener(new cc(this));
                        }
                        this.f678C.setIntValues(new int[]{i2, r3});
                        this.f678C.start();
                    }
                    this.f688d.m753b(i, 300);
                    return;
                }
            }
            m518c(i);
        }
    }

    private final void m522e(int i) {
        int childCount = this.f688d.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                boolean z;
                View childAt = this.f688d.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setActivated(z);
            }
        }
    }

    final void m527a(cj cjVar, boolean z) {
        cj cjVar2 = this.f687c;
        int size;
        if (cjVar2 != cjVar) {
            int i;
            if (cjVar != null) {
                i = cjVar.f939d;
            } else {
                i = -1;
            }
            if (z) {
                if ((cjVar2 == null || cjVar2.f939d == -1) && i != -1) {
                    m518c(i);
                } else {
                    m520d(i);
                }
                if (i != -1) {
                    m522e(i);
                }
            }
            if (cjVar2 != null) {
                for (size = this.f676A.size() - 1; size >= 0; size--) {
                    ((ce) this.f676A.get(size)).mo182a();
                }
            }
            this.f687c = cjVar;
            if (cjVar != null) {
                for (size = this.f676A.size() - 1; size >= 0; size--) {
                    ((ce) this.f676A.get(size)).mo183a(cjVar);
                }
            }
        } else if (cjVar2 != null) {
            for (size = this.f676A.size() - 1; size >= 0; size--) {
                ((ce) this.f676A.get(size)).mo184b();
            }
            m520d(cjVar.f939d);
        }
    }

    private final int m507a(int i, float f) {
        int i2 = 0;
        if (this.f708x != 0) {
            return 0;
        }
        int width;
        View childAt = this.f688d.getChildAt(i);
        View childAt2 = i + 1 < this.f688d.getChildCount() ? this.f688d.getChildAt(i + 1) : null;
        if (childAt != null) {
            width = childAt.getWidth();
        } else {
            width = 0;
        }
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        i2 = (int) ((((float) (i2 + width)) * 0.5f) * f);
        if (ai.f1848a.mo400k(this) == 0) {
            return i2 + left;
        }
        return left - i2;
    }

    private final void m519d() {
        int max;
        if (this.f708x == 0) {
            max = Math.max(0, this.f706v - this.f689e);
        } else {
            max = 0;
        }
        ai.m1823a(this.f688d, max, 0, 0, 0);
        switch (this.f708x) {
            case 0:
                this.f688d.setGravity(8388611);
                break;
            case 1:
                this.f688d.setGravity(1);
                break;
        }
        m529a(true);
    }

    final void m529a(boolean z) {
        for (int i = 0; i < this.f688d.getChildCount(); i++) {
            View childAt = this.f688d.getChildAt(i);
            childAt.setMinimumWidth(m521e());
            m512a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private static ColorStateList m513b(int i, int i2) {
        r0 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r0[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r0, iArr);
    }

    private final int m521e() {
        if (this.f703s != -1) {
            return this.f703s;
        }
        return this.f708x == 0 ? this.f705u : 0;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }
}
