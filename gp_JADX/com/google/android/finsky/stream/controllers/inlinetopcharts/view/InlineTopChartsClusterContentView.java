package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.ea.C2964d;
import com.google.android.finsky.ea.C2965g;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.inlinetopcharts.C1433d;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.image.C1294w;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.finsky.dfe.nano.cr;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class InlineTopChartsClusterContentView extends FrameLayout implements bi, C1043h, C4421f {
    public C2116a f22458a;
    public C1294w f22459b;
    public ao f22460c;
    public Context f22461d;
    public C3748a f22462e;
    public C4418b f22463f;
    public C1043h f22464g;
    public C3166e f22465h;
    public ViewPager f22466i;
    public TabLayout f22467j;
    public C4426e f22468k;
    public C2964d f22469l;
    public View f22470m;
    public int f22471n;
    public cr[] f22472o;

    public InlineTopChartsClusterContentView(Context context) {
        this(context, null);
    }

    public InlineTopChartsClusterContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
        this.f22461d = context;
    }

    protected void onFinishInflate() {
        ((C1433d) C3947d.m18649a(C1433d.class)).mo1935a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        if (this.f22458a.m11021a() && this.f22458a.m11023b() == 4) {
            this.f22471n = getResources().getDimensionPixelSize(C7582R.dimen.ia2_subnav_height);
        }
        this.f22465h = new C3166e(findViewById(C7582R.id.inline_top_charts_cluster_content_view), C7582R.id.content_data_view, C7582R.id.content_page_error_indicator, C7582R.id.content_lists_loading_indicator, this, 0);
        ViewGroup viewGroup = this.f22465h.f16387f;
        this.f22466i = (ViewPager) viewGroup.findViewById(C7582R.id.inline_top_charts_content_viewpager);
        this.f22466i.m1758a((bi) this);
        this.f22468k = new C4426e(this.f22461d, this, this.f22458a.m11028g());
        this.f22466i.setAdapter(this.f22468k);
        this.f22466i.m1758a(new C4422a(this.f22468k));
        this.f22469l = C2965g.m15376a();
        this.f22467j = (TabLayout) viewGroup.findViewById(C7582R.id.inline_top_charts_content_tab_layout);
        this.f22467j.setupWithViewPager(this.f22466i);
        this.f22470m = viewGroup.findViewById(C7582R.id.inline_top_charts_content_tab_layout_divider);
    }

    public void onMeasure(int i, int i2) {
        if (this.f22471n > 0 && this.f22462e != null && this.f22462e.mo3680a() && this.f22472o != null) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) - this.f22471n, MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        super.onMeasure(i, i2);
    }

    public final void mo179a(int i, float f, int i2) {
    }

    public final void mo180b(int i) {
        this.f22463f.mo4197b(C5872c.m27301a(this.f22466i.getAdapter(), i));
    }

    public final void d_(int i) {
    }

    public final void n_() {
        this.f22464g.n_();
    }

    public final void mo4198a() {
        this.f22463f.mo4196b();
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }
}
