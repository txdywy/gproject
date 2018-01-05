package com.google.android.finsky.ia2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.wireless.android.finsky.dfe.nano.z;
import com.squareup.leakcanary.C7582R;

public class Ia2SubNavView extends LinearLayout implements C3222b, C3223k {
    public RecyclerView f16561a;
    public C3245z f16562b;
    public C3224a f16563c;
    public C1072x f16564d;
    public int f16565e;
    public int f16566f;
    public Handler f16567g;
    public Animation f16568h;
    public Animation f16569i;
    public LinearLayoutManager f16570j;
    public boolean f16571k;
    public boolean f16572l;

    public Ia2SubNavView(Context context) {
        this(context, null);
    }

    public Ia2SubNavView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        int i;
        int i2 = 1;
        super.onFinishInflate();
        ai.m1838b((View) this, 1);
        this.f16567g = new Handler();
        this.f16568h = AnimationUtils.loadAnimation(getContext(), C7582R.anim.ia2_subnav_item_out);
        this.f16569i = AnimationUtils.loadAnimation(getContext(), C7582R.anim.ia2_subnav_item_in);
        this.f16561a = (RecyclerView) findViewById(C7582R.id.ia2_subnav_items_container);
        getContext();
        this.f16570j = new LinearLayoutManager(0, ai.f1848a.mo400k(this) == 1);
        this.f16561a.setLayoutManager(this.f16570j);
        this.f16562b = new C3245z(this, getContext(), this);
        this.f16561a.setAdapter(this.f16562b);
        boolean a = C1473m.f7980a.dj().mo2294a(12617586);
        Resources resources = getResources();
        if (a) {
            i = C7582R.dimen.ia2_jpkr_subnav_item_max_width;
        } else {
            i = C7582R.dimen.ia2_subnav_item_max_width;
        }
        this.f16565e = resources.getDimensionPixelOffset(i);
        resources = getResources();
        if (a) {
            i = C7582R.dimen.ia2_jpkr_subnav_item_min_width;
        } else {
            i = C7582R.dimen.ia2_subnav_item_min_width;
        }
        i = resources.getDimensionPixelOffset(i);
        int l = ai.f1848a.mo401l(this.f16561a);
        this.f16572l = getResources().getBoolean(C7582R.bool.ia2_subnav_use_forced_peaking);
        int i3 = this.f16565e;
        if (!this.f16572l) {
            i2 = 0;
        }
        this.f16563c = new C3224a(l, i, i3, i2);
        if (this.f16572l) {
            setGravity(8388611);
        } else {
            setGravity(17);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1;
        int i4 = 0;
        super.onMeasure(i, i2);
        if (!(this.f16572l && this.f16571k)) {
            C3224a c3224a = this.f16563c;
            int measuredWidth = getMeasuredWidth();
            int i5 = c3224a.f16574b;
            int peekableChildCount = getPeekableChildCount();
            if (peekableChildCount > 0) {
                if (c3224a.f16577e == 1) {
                    while (true) {
                        i5 += c3224a.f16576d;
                        if (i5 > measuredWidth) {
                            break;
                        }
                        i4++;
                    }
                } else if (c3224a.f16577e == 0) {
                    int i6 = i5;
                    i5 = 0;
                    while (i5 < peekableChildCount) {
                        i6 += c3224a.f16576d;
                        if (i6 <= measuredWidth) {
                            i5++;
                        } else {
                            if (!(i5 == peekableChildCount - 1 && getTotalChildCount() <= getPeekableChildCount() && c3224a.m16277a(measuredWidth, getPeekableChildCount()))) {
                                i4 = 1;
                            }
                            i3 = i4;
                            i4 = i5;
                        }
                    }
                    i3 = 0;
                    i4 = i5;
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    int i7;
                    C3222b c3222b = this;
                    C3224a c3224a2 = c3224a;
                    while (true) {
                        float f = (float) (measuredWidth - c3224a2.f16574b);
                        mo3377a();
                        i7 = (int) ((f + (0.0f * (0.5f - c3224a2.f16573a))) / (((float) i4) + 0.5f));
                        if (i7 <= c3224a2.f16576d) {
                            break;
                        }
                        i4++;
                    }
                    if (c3224a2.f16577e == 0 && getTotalChildCount() == i4 + 1 && c3224a2.m16277a(measuredWidth, getTotalChildCount())) {
                        c3224a2.m16276a(c3222b, measuredWidth);
                    } else {
                        setChildWidth(i7);
                    }
                } else {
                    c3224a.m16276a((C3222b) this, measuredWidth);
                }
            }
        }
        measureChildren(i, i2);
    }

    public final void m16274a(z[] zVarArr, int i, int i2, C1072x c1072x, int i3) {
        this.f16564d = c1072x;
        em emVar = this.f16562b;
        emVar.f16734d = zVarArr;
        emVar.f16736f = i;
        emVar.f16737g = i2;
        emVar.f16735e = i3;
        if (!(emVar.f16740j.f16572l && emVar.f16740j.f16571k)) {
            emVar.f16740j.f16566f = emVar.f16740j.f16565e;
        }
        emVar.f3433a.m3638b();
        emVar.f16738h = emVar.f16740j.getResources().getString(C1608h.m9252b(emVar.f16736f, emVar.f16737g));
        post(new C3243w(this));
        if (this.f16564d != null) {
            this.f16564d.mo1392b(i3, 0);
        }
    }

    public int getPeekableChildCount() {
        return this.f16570j.m3125k() + 1;
    }

    public int getTotalChildCount() {
        return this.f16562b.mo1039a();
    }

    public void setChildWidth(int i) {
        if (!this.f16572l || !this.f16571k) {
            this.f16566f = i;
            int j = this.f16570j.m3124j();
            int k = this.f16570j.m3125k();
            for (int i2 = j; i2 <= k; i2++) {
                View b = this.f16570j.mo736b(i2);
                ((Ia2SubNavItemView) b).setItemWidth(this.f16566f);
                LayoutParams layoutParams = b.getLayoutParams();
                layoutParams.width = this.f16566f;
                b.setLayoutParams(layoutParams);
            }
            this.f16571k = true;
        }
    }

    public final int mo3377a() {
        return 0;
    }

    public final void mo3378a(int i) {
        m16273a(i, true, 1);
    }

    public final void m16273a(int i, boolean z, int i2) {
        int i3 = this.f16562b.f16735e;
        if (i3 != i && this.f16562b != null) {
            this.f16562b.f16735e = i;
            this.f16562b.m3631c(i);
            this.f16562b.m3631c(i3);
            if (z) {
                m16275b(i);
            }
            if (this.f16564d != null) {
                this.f16564d.mo1392b(i, i2);
            }
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("ia2_subnav.parent_instance_state", super.onSaveInstanceState());
        if (this.f16562b != null) {
            bundle.putInt("ia2_subnav.selected_pos", this.f16562b.f16735e);
        }
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            m16273a(bundle.getInt("ia2_subnav.selected_pos"), false, 0);
            parcelable = bundle.getParcelable("ia2_subnav.parent_instance_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    final void m16275b(int i) {
        String str;
        this.f16570j.m3094a(i, (this.f16561a.getWidth() - this.f16566f) / 2);
        Resources resources = getResources();
        Object[] objArr = new Object[2];
        objArr[0] = this.f16562b.f16738h;
        C3245z c3245z = this.f16562b;
        if (c3245z.f16734d == null || i >= c3245z.f16734d.length) {
            str = null;
        } else {
            str = c3245z.f16734d[i].c;
        }
        objArr[1] = str;
        str = resources.getString(C7582R.string.content_description_item_subtitle, objArr);
        C1601a.m9199a(getContext(), getResources().getString(C7582R.string.accessibility_event_tab_selected, new Object[]{str}), this, false);
    }
}
