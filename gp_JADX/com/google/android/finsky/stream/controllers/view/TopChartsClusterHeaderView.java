package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout;
import android.widget.Spinner;
import com.google.android.finsky.adapters.C1166i;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.finsky.stream.controllers.minitopcharts.C4452a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class TopChartsClusterHeaderView extends FrameLayout implements OnItemSelectedListener, ak, ao {
    public Spinner f22473c;
    public PlayInstalledAppsFilterToggle f22474d;
    public TopChartsCategorySpinner f22475e;
    public ap f22476f;
    public C1166i f22477g;
    public int f22478h;
    public int f22479i;
    public int f22480j;

    public TopChartsClusterHeaderView(Context context) {
        super(context);
    }

    public TopChartsClusterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo2007j();
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22473c = (Spinner) findViewById(C7582R.id.section_corpus_spinner);
        this.f22474d = (PlayInstalledAppsFilterToggle) findViewById(C7582R.id.installed_apps_filter);
        ai.m1823a(this.f22474d, 0, 0, 0, 0);
        this.f22475e = (TopChartsCategorySpinner) findViewById(C7582R.id.category_spinner);
        this.f22477g = new C1166i(getContext(), new ArrayList());
        this.f22473c.setAdapter(this.f22477g);
        Resources resources = getResources();
        this.f22479i = resources.getDimensionPixelSize(C7582R.dimen.top_charts_header_vertical_distance_between_child_views);
        this.f22480j = resources.getDimensionPixelSize(C7582R.dimen.top_charts_header_child_views_rearrange_vpadding);
    }

    public final void m20714a(boolean z, int i, boolean z2, int i2, jj jjVar, boolean z3, boolean z4, Document document, ap apVar, int i3, ad adVar, C2495w c2495w) {
        this.f22476f = apVar;
        setContentHorizontalPadding(i3);
        mo4199a(z, i, document);
        if (!z2 || jjVar == null || jjVar.f12788a.length <= 0) {
            this.f22475e.setVisibility(8);
        } else {
            this.f22475e.m21062a(C4452a.m20810a(getContext(), jjVar, document.f14885a.f12099f, C7582R.layout.jpkr_top_charts_landing_spinner_label), i2, this, adVar, c2495w);
            this.f22475e.setVisibility(0);
        }
        if (z3) {
            this.f22474d.m21057a(!z4, this, C1608h.m9243a(getContext(), document.f14885a.f12099f), adVar, c2495w);
            this.f22474d.setVisibility(0);
            return;
        }
        this.f22474d.setVisibility(8);
    }

    public void mo4199a(boolean z, int i, Document document) {
        if (z) {
            this.f22477g.clear();
            this.f22477g.addAll(document.m14661p());
            this.f22477g.notifyDataSetChanged();
            this.f22473c.setSelection(i);
            this.f22473c.setOnItemSelectedListener(this);
            this.f22473c.setVisibility(0);
            return;
        }
        this.f22473c.setVisibility(8);
    }

    public void setContentHorizontalPadding(int i) {
        ai.m1823a(this, i, getPaddingTop(), i, getPaddingBottom());
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredHeight;
        int measuredHeight2;
        int i5 = this.f22474d.getVisibility() == 0 ? 1 : 0;
        if (this.f22473c.getVisibility() == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.f22475e.getVisibility() == 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0 && i5 != 0) {
            m20709a(this.f22474d);
        }
        super.onMeasure(i, i2);
        int measuredWidth4 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.f22478h = 0;
        if (i5 != 0) {
            measuredWidth = this.f22474d.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (i3 != 0) {
            measuredWidth2 = this.f22473c.getMeasuredWidth();
        } else {
            measuredWidth2 = 0;
        }
        if (i4 != 0) {
            measuredWidth3 = this.f22475e.getMeasuredWidth();
        } else {
            measuredWidth3 = 0;
        }
        int i6 = (measuredWidth + measuredWidth2) + measuredWidth3;
        if (i5 != 0) {
            measuredHeight = this.f22474d.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (i3 != 0) {
            measuredWidth2 = this.f22473c.getMeasuredHeight();
        } else {
            measuredWidth2 = 0;
        }
        if (i4 != 0) {
            measuredHeight2 = this.f22475e.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        measuredHeight2 += measuredHeight + measuredWidth2;
        if (i4 != 0 && i5 == 0) {
            FinskyLog.m21669e("Installed apps toggle is not visible on top charts header when category spinner is visible. Add code to handle this case.", new Object[0]);
        }
        if (i4 == 0 || i3 == 0) {
            if (i4 != 0) {
                if (i6 <= measuredWidth4) {
                    this.f22478h = 6;
                    return;
                }
                this.f22478h = 2;
                m20708a(this.f22479i + measuredHeight2);
            } else if (i3 == 0 && i5 != 0) {
                this.f22478h = 7;
            } else if (i3 != 0 && i6 > measuredWidth4) {
                this.f22478h = 1;
                m20708a(this.f22479i + measuredHeight2);
            }
        } else if (i6 <= measuredWidth4) {
            this.f22478h = 3;
        } else if (measuredWidth + measuredWidth3 <= measuredWidth4) {
            this.f22478h = 4;
            m20708a((measuredHeight + measuredWidth2) + this.f22479i);
        } else {
            this.f22478h = 5;
            m20708a((this.f22479i * 2) + measuredHeight2);
        }
    }

    private final void m20708a(int i) {
        int measuredHeight = getMeasuredHeight();
        int i2 = (this.f22480j * 2) + i;
        if (measuredHeight > i2) {
            measuredHeight = (((measuredHeight - i2) - getPaddingTop()) - getPaddingBottom()) / 2;
            ai.m1823a(this, ai.f1848a.mo401l(this), getPaddingTop() + measuredHeight, ai.f1848a.mo402m(this), measuredHeight + getPaddingBottom());
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i2 + (getPaddingTop() + getPaddingBottom()));
        ai.m1823a(this, ai.f1848a.mo401l(this), getPaddingTop() + this.f22480j, ai.f1848a.mo402m(this), getPaddingBottom() + this.f22480j);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f22478h == 0) {
            super.onLayout(z, i, i2, i3, i4);
        } else if (this.f22478h == 1) {
            m20710a(this.f22473c, 8388659);
            super.onLayout(z, i, i2, i3, i4);
            m20711a(this.f22474d, this.f22473c);
        } else if (this.f22478h == 2) {
            m20710a(this.f22474d, 8388659);
            super.onLayout(z, i, i2, i3, i4);
            m20711a(this.f22475e, this.f22474d);
        } else if (this.f22478h == 3) {
            m20710a(this.f22474d, 8388627);
            super.onLayout(z, i, i2, i3, i4);
            View view = this.f22475e;
            View view2 = this.f22473c;
            int right = this.f22474d.getRight();
            int left = ((view.getLeft() - right) - view2.getMeasuredWidth()) / 2;
            view2.layout(right + left, view2.getTop(), (left + right) + view2.getMeasuredWidth(), view2.getBottom());
        } else if (this.f22478h == 4) {
            m20710a(this.f22474d, 8388659);
            m20710a(this.f22475e, 8388661);
            super.onLayout(z, i, i2, i3, i4);
            m20711a(this.f22473c, this.f22474d);
        } else if (this.f22478h == 5) {
            m20710a(this.f22474d, 8388659);
            super.onLayout(z, i, i2, i3, i4);
            m20711a(this.f22473c, this.f22474d);
            m20711a(this.f22475e, this.f22473c);
        } else if (this.f22478h == 6) {
            m20710a(this.f22474d, 8388627);
            super.onLayout(z, i, i2, i3, i4);
        } else if (this.f22478h == 7) {
            m20709a(this.f22474d);
            super.onLayout(z, i, i2, i3, i4);
        } else {
            FinskyLog.m21669e("Unhandled layout format(%d) in top charts header", Integer.valueOf(this.f22478h));
        }
    }

    private static void m20709a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
    }

    private final void m20711a(View view, View view2) {
        int left = (view2.getLeft() + view2.getPaddingLeft()) - view.getPaddingLeft();
        int bottom = view2.getBottom() + this.f22479i;
        view.layout(left, bottom, view.getMeasuredWidth() + left, view.getMeasuredHeight() + bottom);
    }

    private static void m20710a(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f22476f != null) {
            this.f22476f.mo4168c(i);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public final void mo4143a(boolean z) {
        if (this.f22476f != null) {
            this.f22476f.mo4164a(z);
        }
    }

    public final void mo4144b(int i) {
        if (this.f22476f != null) {
            this.f22476f.mo4169d(i);
        }
    }
}
