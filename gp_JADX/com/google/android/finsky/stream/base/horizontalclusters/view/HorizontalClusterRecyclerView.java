package com.google.android.finsky.stream.base.horizontalclusters.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C2575b;
import com.google.android.finsky.stream.base.view.C4293a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class HorizontalClusterRecyclerView extends C2575b implements C4267f, C4268m {
    public int aG;
    public boolean aH;
    public float aI;
    public int aJ;
    public int ba;
    public boolean bb;
    public float bc;
    public C4269h bd;
    public C4264l be;
    public C4274i bf;
    public boolean bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public C4275j bl;
    public C1611k bm;
    public C1461c bn;

    public HorizontalClusterRecyclerView(Context context) {
        this(context, null);
    }

    public HorizontalClusterRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ew linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.f2976w = 0;
        setLayoutManager(linearLayoutManager);
    }

    protected void onFinishInflate() {
        ((C1417n) C3947d.m18649a(C1417n.class)).mo1914a(this);
        super.onFinishInflate();
        mo3607z();
        this.bh = getResources().getDimensionPixelSize(C7582R.dimen.flat_card_desired_width_in_grid);
    }

    public final void m19813a(C4274i c4274i, Bundle bundle, C4269h c4269h, C4264l c4264l, C4257k c4257k, C4275j c4275j, ad adVar) {
        int i = 0;
        boolean z = (this.aU || getAdapter() == null) ? false : true;
        this.aU = false;
        mo3606i(this.bj);
        this.bk = this.aJ;
        this.bd = c4269h;
        this.be = c4264l;
        this.bg = false;
        this.bf = c4274i;
        this.bl = c4275j;
        boolean z2;
        if (getAdapter() == null) {
            setAdapter(new C4271d(c4257k, this, adVar, m19803A()));
            z2 = z;
        } else {
            int size;
            if (z) {
                C4273g c4273g = ((C4271d) getAdapter()).f21560g;
                if (c4273g != null && c4273g.f21569g.size() < c4274i.f21571a.size()) {
                    int i2 = 0;
                    while (i2 < c4273g.f21569g.size()) {
                        if (c4273g.f21569g.get(i2) == c4274i.f21571a.get(i2)) {
                            i2++;
                        }
                    }
                    z = c4274i.f21572b == c4273g.f21570h;
                    z2 = z;
                }
                z = false;
                z2 = z;
            } else {
                z2 = z;
            }
            C4271d c4271d = (C4271d) getAdapter();
            C4273g c4273g2 = c4271d.f21560g;
            if (z2) {
                size = c4273g2.f21563a + c4273g2.f21569g.size();
            } else {
                size = -1;
            }
            if (z2) {
                i = c4274i.f21571a.size() - c4273g2.f21569g.size();
            }
            c4271d.m19832a(c4257k, adVar, m19803A());
            if (z2) {
                c4271d.m3632c(size, i);
            } else {
                c4271d.f3433a.m3638b();
            }
        }
        if (!(bundle == null || r3)) {
            mo2963c(bundle.getInt("HorizontalClusterRecyclerView.recyclerViewScrollPosition", -1));
        }
        m19807c(true);
    }

    public final void mo3607z() {
        this.bj = this.bm.m9278c(getResources());
        this.aI = this.bm.m9273a();
        this.aJ = this.bm.m9284i(getResources());
        this.ba = 0;
        this.bb = false;
        this.aG = 0;
        this.bc = 1.0f;
        this.aH = true;
    }

    private final C4273g m19803A() {
        C4273g c4273g = new C4273g();
        c4273g.f21567e = this.aG;
        c4273g.f21563a = getLeadingSpacerCount();
        c4273g.f21566d = this.bj;
        c4273g.f21565c = m19805C();
        c4273g.f21564b = m19806D();
        c4273g.f21568f = m19804B();
        c4273g.f21569g = new ArrayList(this.bf.f21571a);
        c4273g.f21570h = this.bf.f21572b;
        return c4273g;
    }

    public final boolean mo3606i(int i) {
        if (this.bj == i) {
            return false;
        }
        this.bj = i;
        requestLayout();
        return true;
    }

    public void setBaseWidthMultiplier(float f) {
        this.bc = f;
    }

    public void setSupportHorizontallyCenteredContent(boolean z) {
        this.bb = z;
    }

    public void setColumnCount(int i) {
        this.aJ = i;
    }

    public void setChildWidthPolicy(int i) {
        this.aG = i;
    }

    public void setChildPeekingAmount(float f) {
        this.aI = f;
    }

    public void setSupportsSnapping(boolean z) {
        this.aH = z;
    }

    public void setLeadingItemGap(int i) {
        this.ba = i;
    }

    public final void Z_() {
        super.Z_();
        this.be.mo4076a();
        em adapter = getAdapter();
        if (adapter instanceof C4271d) {
            C4271d c4271d = (C4271d) adapter;
            C4272e[] c4272eArr = (C4272e[]) c4271d.f21557d.toArray(new C4272e[c4271d.f21557d.size()]);
            for (C4272e a : c4272eArr) {
                c4271d.m19831a(a);
            }
            c4271d.f21556c = null;
        }
        this.bd = null;
        this.be = null;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.bf == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (this.aG != 3) {
            size2 = m19810m(size);
        } else {
            size2 = 0;
        }
        this.bi = size2;
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            size2 = MeasureSpec.getSize(i2);
        } else {
            size2 = this.bd.mo4085a(this.bi);
        }
        int l = m19809l(size) + this.bj;
        setLeadingGapForSnapping(l);
        setMeasuredDimension(size, size2);
        if (this.bi != 0 && this.aG == 0 && ((size - l) - this.bj) / this.bi >= this.bf.f21571a.size()) {
            z = true;
        }
        this.bg = z;
    }

    protected final void mo2965v() {
        super.mo2965v();
        this.bl.mo4190c();
        m19807c(false);
    }

    protected final void mo2966w() {
        super.mo2966w();
        mo2963c(getScrollPositionInternal());
    }

    protected int getTrailingSpacerCount() {
        return m19804B() - getLeadingSpacerCount();
    }

    private final int m19804B() {
        return (this.bf.f21572b ? 1 : 0) + m19806D();
    }

    private final boolean m19805C() {
        return this.bj > 0 || this.bb;
    }

    private final int m19806D() {
        return (m19805C() ? 1 : 0) + getLeadingSpacerCount();
    }

    public final void mo2963c(int i) {
        super.mo2963c(i);
        if (i >= 0) {
            m19807c(false);
        }
    }

    protected final boolean mo2964u() {
        return this.aH;
    }

    public final void m19812a(Bundle bundle) {
        bundle.putInt("HorizontalClusterRecyclerView.recyclerViewScrollPosition", getScrollPositionInternal());
    }

    private final void m19807c(boolean z) {
        int i = 1;
        if (this.be != null && getChildCount() > m19806D()) {
            int i2 = this.bk + (this.aI > 0.0f ? 1 : 0);
            if (getChildCount() <= 2) {
                i = -1;
            }
            int k;
            if (this.bn.dj().mo2294a(12631929)) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
                int j = linearLayoutManager.m3124j();
                k = linearLayoutManager.m3125k();
                int leadingSpacerCount = getLeadingSpacerCount();
                int i3 = (j - (i * i2)) - leadingSpacerCount;
                i = ((i * i2) + k) - leadingSpacerCount;
                this.be.mo4077a(z, i3, j, this);
                this.be.mo4077a(z, k + 1, i + 1, this);
                return;
            }
            k = getLeadingSpacerCount();
            this.be.mo4077a(z, (this.aL - (i * i2)) - k, ((i * i2) + (this.aL + i2)) - k, this);
        }
    }

    private final int m19809l(int i) {
        if (this.aG == 3) {
            return 0;
        }
        return this.ba * m19810m(i);
    }

    private final int m19810m(int i) {
        int i2;
        switch (this.aG) {
            case 0:
                i2 = i - (this.bj * 2);
                if (this.bn.dj().mo2294a(12644095)) {
                    return (int) (((float) C4293a.m19904a(this.bh, i2, this.aI)) * this.bc);
                }
                return (int) ((((float) i2) / (((float) this.bk) + this.aI)) * this.bc);
            case 1:
                return this.bd.mo4084a();
            case 2:
                i2 = this.bd.mo4084a();
                int i3 = i - this.bj;
                int i4 = i3 / i2;
                int size = this.bf.f21571a.size();
                i3 -= i4 * i2;
                int i5 = (int) (((float) i2) * this.aI);
                if (i3 > i5 || size == i4) {
                    return i2;
                }
                return i2 - ((i5 - i3) / i4);
            default:
                throw new UnsupportedOperationException("Can only be called for fixed policy");
        }
    }

    public final int mo4082j(int i) {
        View n = m19811n(i);
        if (n == null || m19808i(n)) {
            return 0;
        }
        return ((C4260a) this.bf.f21571a.get(i)).mo4073b(n);
    }

    private final View m19811n(int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int j = linearLayoutManager.m3124j();
        int k = linearLayoutManager.m3125k();
        int leadingSpacerCount = getLeadingSpacerCount() + i;
        if (leadingSpacerCount >= j && leadingSpacerCount <= k && getChildAt(leadingSpacerCount - j).getTag() == null) {
            return getChildAt(leadingSpacerCount - j);
        }
        leadingSpacerCount = j;
        while (leadingSpacerCount <= k) {
            if (leadingSpacerCount > getLeadingSpacerCount() && leadingSpacerCount < this.bf.f21571a.size() + getLeadingSpacerCount()) {
                return getChildAt(leadingSpacerCount - j);
            }
            leadingSpacerCount++;
        }
        return null;
    }

    public final int mo4083k(int i) {
        View n = m19811n(i);
        if (n == null || m19808i(n)) {
            return 0;
        }
        return ((C4260a) this.bf.f21571a.get(i)).mo4070a(n);
    }

    private static boolean m19808i(View view) {
        if (view.getTag() == null || !(view.getTag() instanceof String)) {
            return false;
        }
        return ((String) view.getTag()).equals("tagIsSpacer");
    }

    public int getLeadingPixelGap() {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        return m19809l(measuredWidth);
    }

    public int getSpacerExtraWidth() {
        int measuredWidth = getMeasuredWidth();
        if (this.bb) {
            return Math.max(0, ((measuredWidth - (this.bj * 2)) - (this.bi * (getAdapter().mo1039a() - 2))) / 2);
        }
        return 0;
    }

    public int getFixedChildWidth() {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        return m19810m(measuredWidth);
    }

    public int getAvailableContentHeight() {
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight == 0) {
            measuredHeight = this.bd.mo4085a(this.bi);
        }
        return (measuredHeight - getPaddingTop()) - getPaddingBottom();
    }
}
