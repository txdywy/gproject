package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.support.v7.widget.ff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import com.android.vending.C0629a;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.recyclerview.C2575b;
import com.google.android.finsky.stream.base.C1418l;
import com.google.android.finsky.stream.base.view.C4293a;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.utils.C6324f;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class PlayClusterViewContentV2 extends C2575b implements C0657w, C1031w, y {
    public C1461c aI;
    public boolean aJ;
    public LayoutInflater ba;
    public int bb;
    public int bc;
    public C1158a bd;
    public C4290m be;
    public int bf;
    public boolean bg;
    public int[] bh;
    public C1164b bi;
    public float bj;
    public float bk;
    public int bl;
    public List bm;
    public Handler bn;
    public Runnable bo;
    public boolean bp;

    public PlayClusterViewContentV2(Context context) {
        this(context, null);
    }

    public PlayClusterViewContentV2(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        this.ba = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayClusterViewContent);
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ew linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.f2976w = 0;
        setLayoutManager(linearLayoutManager);
        m278a(new C4289l(this));
        if (this.aI == null || !this.aI.dj().mo2294a(12636850)) {
            int a = C6324f.m28966a(context);
            if (a == 4 || a == 3 || a == 2) {
                z = true;
            }
            if (z) {
                this.bn = new Handler(Looper.getMainLooper());
            }
        }
    }

    public void onFinishInflate() {
        ((C1418l) C3947d.m18649a(C1418l.class)).mo1918a(this);
        super.onFinishInflate();
        this.bc = getResources().getDimensionPixelSize(C7582R.dimen.flat_card_desired_width_in_grid);
    }

    public String getChildContentSourceId() {
        return this.bd.mo1480a();
    }

    public C1164b getClusterContentConfigurator() {
        return this.bi;
    }

    public float getPrimaryAspectRatio() {
        return this.bk;
    }

    public int getDefaultChildCardWidth() {
        return this.bl;
    }

    public final void Z_() {
        int i = 0;
        super.Z_();
        m17544A();
        em adapter = getAdapter();
        if (this.aI.dj().mo2294a(12642333)) {
            setItemViewCacheSize(0);
            setAdapter(null);
            setItemViewCacheSize(2);
            setAdapter(adapter);
        }
        if (adapter instanceof C4288k) {
            C4288k c4288k = (C4288k) adapter;
            if (!c4288k.f21649e.aI.dj().mo2294a(12642333)) {
                C1155g[] c1155gArr = (C1155g[]) c4288k.f21647c.toArray(new C1155g[c4288k.f21647c.size()]);
                while (i < c1155gArr.length) {
                    c4288k.m19899a(c1155gArr[i]);
                    i++;
                }
            }
        }
    }

    protected int getTrailingSpacerCount() {
        return ((C4288k) getAdapter()).m19900b() - getLeadingSpacerCount();
    }

    private final void m17544A() {
        if (this.bm != null) {
            for (x a : this.bm) {
                a.a();
            }
            this.bm.clear();
        }
        if (this.bn != null && this.bo != null) {
            this.bn.removeCallbacks(this.bo);
        }
    }

    public final void m17550a(x xVar) {
        this.bm.remove(xVar);
    }

    public final boolean mo3606i(int i) {
        if (this.bb == i) {
            return false;
        }
        this.bb = i;
        requestLayout();
        return true;
    }

    public int getContentHorizontalPadding() {
        return this.bb;
    }

    public final void m17549a(C1158a c1158a, C1164b c1164b, int i, boolean z, ff ffVar, Bundle bundle, int[] iArr, C4290m c4290m) {
        this.aU = false;
        this.bd = c1158a;
        this.aJ = false;
        this.bj = c1164b.mo1487a();
        this.bf = Math.round(((float) i) / this.bj);
        this.bg = z;
        this.bh = iArr;
        this.bi = c1164b;
        this.bp = ((double) c1164b.mo1496d()) > 0.0d;
        this.be = c4290m;
        this.bk = this.bi.mo1489a(this.bd);
        int i2 = -1;
        em adapter = getAdapter();
        if (adapter == null) {
            setAdapter(new C4288k(this));
            setRecycledViewPool(ffVar);
        } else {
            adapter.f3433a.m3638b();
            m17545B();
            i2 = 0;
        }
        if (bundle != null) {
            i2 = bundle.getInt("PlayClusterViewContentV2.recyclerViewScrollPosition", i2);
        }
        if (i2 != -1) {
            super.mo2963c(i2);
        }
        m17546c(true);
    }

    public final void mo2963c(int i) {
        super.mo2963c(i);
        if (i >= 0) {
            m17546c(false);
        }
    }

    public int getLeadingItemGap() {
        return 0;
    }

    public final int mo3605g(int i, int i2) {
        if (this.bi.mo1495c() == 3) {
            return 0;
        }
        return getLeadingItemGap() * m17553h(i, i2);
    }

    final int m17553h(int i, int i2) {
        int i3;
        switch (this.bi.mo1495c()) {
            case 0:
                i3 = i - (this.bb * 2);
                if (this.aI.dj().mo2294a(12644095)) {
                    return (int) (((float) C4293a.m19904a(this.bc, i3, this.bi.mo1496d())) * this.bi.mo1493b());
                }
                return (int) Math.ceil((double) ((((float) i3) / (((float) this.bf) + this.bi.mo1496d())) * this.bi.mo1493b()));
            case 1:
                return this.bi.mo1492a(i, i2);
            case 2:
                i3 = this.bi.mo1492a(i, i2);
                int i4 = i - this.bb;
                int i5 = i4 / i3;
                int c = this.bd.mo1486c();
                i4 -= i5 * i3;
                int d = (int) (((float) i3) * this.bi.mo1496d());
                if (i4 > d || c == i5) {
                    return i3;
                }
                return i3 - ((d - i4) / i5);
            default:
                throw new UnsupportedOperationException("Can only be called for fixed policy");
        }
    }

    protected final void mo2965v() {
        super.mo2965v();
        m17546c(false);
        if (this.be != null) {
            this.be.mo4098b(this.aL);
        }
    }

    private final void m17546c(boolean z) {
        if (this.bd != null && this.bn != null && getPreloadRadius() > 0) {
            m17544A();
            this.bo = new C4287j(this);
            if (z) {
                this.bn.postDelayed(this.bo, 500);
            } else {
                this.bo.run();
            }
        }
    }

    public int getPreloadRadius() {
        if (getChildCount() <= 2 || this.bj == 0.0f) {
            return -1;
        }
        return 1;
    }

    protected final void mo2966w() {
        super.mo2966w();
        mo2963c(getScrollPositionInternal());
    }

    public final void m17547a(Bundle bundle) {
        bundle.putInt("PlayClusterViewContentV2.recyclerViewScrollPosition", getScrollPositionInternal());
    }

    public final void mo1062a(VolleyError volleyError) {
        C4288k c4288k = (C4288k) getAdapter();
        c4288k.f21648d = 0;
        c4288k.f3433a.m3638b();
    }

    public final void m_() {
        m17545B();
        m17546c(false);
    }

    private final void m17545B() {
        C4288k c4288k = (C4288k) getAdapter();
        if (this.bd.mo1484b()) {
            c4288k.f21648d = 1;
            c4288k.f3433a.m3638b();
            return;
        }
        c4288k.f21648d = 0;
        c4288k.f3433a.m3638b();
    }

    protected final boolean mo2964u() {
        return this.bi != null && this.bi.mo1497e();
    }

    public void onMeasure(int i, int i2) {
        boolean z = false;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.bi == null || this.bd == null) {
            setMeasuredDimension(size, i2);
            return;
        }
        if (this.bi.mo1495c() != 3) {
            size2 = m17553h(size, size2);
        } else {
            size2 = 0;
        }
        this.bl = size2;
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            size2 = MeasureSpec.getSize(i2);
        } else {
            size2 = this.bi.mo1491a(this.bl, this.bk);
        }
        int g = mo3605g(size, size2) + this.bb;
        setLeadingGapForSnapping(g);
        setMeasuredDimension(size, size2);
        if (this.bl != 0 && this.bi.mo1495c() == 0 && mo3607z() < (size - g) - this.bb) {
            z = true;
        }
        this.aJ = z;
    }

    final int mo3607z() {
        int i = 0;
        if (this.bd == null || this.bi == null) {
            return 0;
        }
        if (!this.aI.dj().mo2294a(12638215)) {
            return this.bl * this.bd.mo1486c();
        }
        int i2 = 0;
        while (i < this.bd.mo1486c()) {
            float f = (float) i2;
            float f2 = (float) this.bl;
            i2 = (int) (f + (this.bi.mo1488a(this.bd.mo1477a(i)) * f2));
            i++;
        }
        return i2;
    }

    public final /* synthetic */ void b_(Object obj) {
        m17550a((x) obj);
    }
}
