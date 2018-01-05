package com.google.android.play.headerlist;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.support.v4.view.bi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.libraries.bind.b.c;
import com.google.android.play.d;
import com.google.android.play.g;
import com.google.android.play.h;
import java.lang.ref.WeakReference;

public class PlayHeaderListTabStrip extends FrameLayout {
    public HorizontalScrollView f31868l;
    public PlayHeaderListTabContainer f31869m;
    public ViewPager f31870n;
    public final C6357w f31871o;
    public WeakReference f31872p;
    public bi f31873q;
    public boolean f31874r;
    public float f31875s;
    public int f31876t;
    public boolean f31877u;
    public C6348n f31878v;
    public int f31879w;
    public boolean f31880x;
    public int f31881y;
    public boolean f31882z;

    public PlayHeaderListTabStrip(Context context) {
        this(context, null, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31871o = new C6357w(this);
        this.f31874r = true;
        this.f31875s = getResources().getDisplayMetrics().density * 5.0f;
    }

    final void m29110d(int i) {
        if (this.f31881y != i) {
            this.f31881y = i;
            int childCount = this.f31869m.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f31869m.getChildAt(i2).setBackgroundResource(i);
            }
        }
    }

    public void onFinishInflate() {
        m29108c();
        this.f31869m.setSelectedIndicatorColor(getResources().getColor(d.play_header_list_tab_underline_color));
    }

    final void m29108c() {
        this.f31868l = (HorizontalScrollView) findViewById(g.play_header_list_tab_scroll);
        this.f31869m = (PlayHeaderListTabContainer) findViewById(g.play_header_list_tab_container);
    }

    public void setSelectedUnderlineThickness(int i) {
        this.f31869m.setSelectedUnderlineThickness(i);
    }

    public void setSelectedTriangleBase(int i) {
        this.f31869m.setSelectedTriangleBaseWidth(i);
    }

    public void setSelectedTriangleHeight(int i) {
        this.f31869m.setSelectedTriangleHeight(i);
    }

    public void setSelectedTabIndicator(int i) {
        this.f31869m.setSelectedIndicator(i);
    }

    public void setAnimateOnTabClick(boolean z) {
        this.f31882z = z;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f31870n != null) {
            this.f31870n.setOnPageChangeListener(null);
        }
        this.f31870n = viewPager;
        if (this.f31870n != null) {
            this.f31870n.setOnPageChangeListener(this.f31871o);
        }
        m29109d();
    }

    public final void m29109d() {
        af afVar;
        af adapter = this.f31870n == null ? null : this.f31870n.getAdapter();
        if (this.f31872p != null) {
            afVar = (af) this.f31872p.get();
        } else {
            afVar = null;
        }
        if (afVar != null) {
            afVar.b(this.f31871o);
            this.f31872p = null;
        }
        if (adapter != null) {
            adapter.a(this.f31871o);
            this.f31872p = new WeakReference(adapter);
        }
        m29111e();
    }

    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (size > 0) {
            PlayHeaderListTabContainer playHeaderListTabContainer = this.f31869m;
            if (!(playHeaderListTabContainer.f31866m == size && playHeaderListTabContainer.f31867n)) {
                playHeaderListTabContainer.f31866m = size;
                playHeaderListTabContainer.m29101a();
            }
        }
        super.onMeasure(i, i2);
    }

    final void m29111e() {
        this.f31869m.removeAllViews();
        af adapter = this.f31870n == null ? null : this.f31870n.getAdapter();
        if (adapter != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int a = adapter.a();
            for (int i = 0; i < a; i++) {
                int a2 = c.a(adapter, i);
                View a3 = m29103a(from, this.f31869m, a2);
                TextView textView = (TextView) a3;
                textView.setText(adapter.a(a2));
                textView.setOnClickListener(m29107c(c.b(adapter, a2)));
                this.f31869m.addView(a3);
            }
            this.f31869m.getViewTreeObserver().addOnGlobalLayoutListener(new C6355u(this));
            m29112f();
            this.f31869m.f31867n = false;
        }
    }

    @TargetApi(14)
    public View m29103a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        TextView textView = (TextView) layoutInflater.inflate(h.play_header_list_tab_text, viewGroup, false);
        textView.setMaxWidth(getMaxTabWidth());
        m29106a(textView, this.f31880x);
        textView.setBackgroundResource(this.f31881y);
        return textView;
    }

    public void m29106a(TextView textView, boolean z) {
        if (z) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(getResources().getColorStateList(d.play_header_list_tab_text_color));
        }
    }

    protected int getMaxTabWidth() {
        if (this.f31879w == 0) {
            this.f31879w = getResources().getDisplayMetrics().widthPixels;
        }
        return this.f31879w;
    }

    public OnClickListener m29107c(int i) {
        return new C6356v(this, i);
    }

    public String getCurrentTabTitle() {
        if (this.f31870n == null || this.f31870n.getAdapter() == null) {
            return null;
        }
        return (String) this.f31870n.getAdapter().a(this.f31870n.getCurrentItem());
    }

    final void m29104a(int i, int i2, boolean z) {
        if (this.f31868l != null) {
            int childCount = this.f31869m.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                View childAt = this.f31869m.getChildAt(i);
                if (childAt != null && childAt.getMeasuredWidth() != 0) {
                    int left = ((childAt.getLeft() + i2) - (getWidth() / 2)) + (childAt.getWidth() / 2);
                    if (left != this.f31876t) {
                        if ((((float) Math.abs(left - this.f31868l.getScrollX())) > this.f31875s ? 1 : 0) == 0 || !z) {
                            this.f31868l.smoothScrollBy(0, 0);
                            this.f31868l.smoothScrollBy(0, 0);
                            this.f31868l.scrollTo(left, 0);
                        } else {
                            this.f31868l.smoothScrollTo(left, 0);
                        }
                        this.f31876t = left;
                    }
                }
            }
        }
    }

    protected final void m29112f() {
        if (this.f31870n != null) {
            m29105a(this.f31870n.getCurrentItem(), false);
        }
    }

    protected final void m29105a(int i, boolean z) {
        m29104a(i, 0, z);
        for (int i2 = 0; i2 < this.f31869m.getChildCount(); i2++) {
            boolean z2;
            View childAt = this.f31869m.getChildAt(i2);
            if (i2 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            childAt.setSelected(z2);
        }
    }

    @TargetApi(12)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a = this.f31877u ? m29102a() : 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f31868l.getScrollX() != this.f31876t) {
            this.f31868l.scrollTo(this.f31876t, 0);
        }
        if (this.f31877u) {
            m29112f();
            if (VERSION.SDK_INT >= 12) {
                int a2 = m29102a();
                if (a2 != a) {
                    this.f31869m.setTranslationX((float) (-(a2 - a)));
                    this.f31869m.animate().translationX(0.0f).setDuration(200);
                }
            }
        }
    }

    private final int m29102a() {
        if (this.f31870n == null) {
            return 0;
        }
        View childAt = this.f31869m.getChildAt(this.f31870n.getCurrentItem());
        if (childAt != null) {
            return childAt.getLeft() - this.f31868l.getScrollX();
        }
        return 0;
    }

    public ViewPager getPager() {
        return this.f31870n;
    }
}
