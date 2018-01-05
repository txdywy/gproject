package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.CardBubbleLinearLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.finsky.stream.controllers.minitopcharts.C4349c;
import com.google.android.finsky.stream.controllers.minitopcharts.C4456f;
import com.google.android.finsky.stream.controllers.minitopcharts.JpkrMiniTopChartsMoreFooterView;
import com.google.android.play.p203b.C6266d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class JpkrFlatMiniTopChartsClusterView extends C3688e implements bi, ad {
    public int f22907A;
    public ao f22908a;
    public Context f22909b;
    public LayoutInflater f22910c;
    public C3748a f22911j;
    public C2495w f22912k;
    public ad f22913l;
    public ce f22914m;
    public Document f22915n;
    public int f22916o;
    public ViewPager f22917p;
    public PlayInstalledAppsFilterToggle f22918q;
    public int f22919r;
    public TopChartsCategorySpinner f22920s;
    public JpkrMiniTopChartsMoreFooterView f22921t;
    public C4456f f22922u;
    public C4349c f22923v;
    public C4350k f22924w;
    public boolean f22925x;
    public C4351l f22926y;
    public CardBubbleLinearLayout f22927z;

    public JpkrFlatMiniTopChartsClusterView(Context context) {
        this(context, null);
    }

    public JpkrFlatMiniTopChartsClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22914m = C2482j.m13283a(451);
        this.f22909b = context;
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1952a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22917p = (ViewPager) findViewById(C7582R.id.chart_type_viewpager);
        this.f22917p.m1758a((bi) this);
        ViewStub viewStub = (ViewStub) findViewById(C7582R.id.cluster_title_extra_stub);
        viewStub.setLayoutResource(C7582R.layout.jpkr_flat_mini_top_charts_control_bar);
        viewStub.inflate();
        this.f22918q = (PlayInstalledAppsFilterToggle) findViewById(C7582R.id.installed_apps_filter);
        this.f22919r = this.f22909b.getResources().getColor(C7582R.color.jpkr_vertical_secondary);
        this.f22920s = (TopChartsCategorySpinner) findViewById(C7582R.id.category_spinner);
        this.f22921t = (JpkrMiniTopChartsMoreFooterView) findViewById(C7582R.id.footer_more);
        this.f22927z = (CardBubbleLinearLayout) findViewById(C7582R.id.toggle_tooltip);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21012a(com.google.android.finsky.stream.controllers.minitopcharts.C4456f r7, int r8, com.google.android.finsky.stream.controllers.minitopcharts.C4349c r9) {
        /*
        r6 = this;
        r4 = 1;
        r0 = 0;
        if (r7 == 0) goto L_0x0040;
    L_0x0004:
        r1 = r6.f22916o;
        r2 = r7.f22652b;
        if (r2 == 0) goto L_0x0015;
    L_0x000a:
        r2 = r7.f22652b;
        r2 = r2.length;
        if (r2 <= r8) goto L_0x0015;
    L_0x000f:
        r2 = r7.f22652b;
        r2 = r2[r8];
        if (r2 != 0) goto L_0x0028;
    L_0x0015:
        r1 = r0;
    L_0x0016:
        if (r1 == 0) goto L_0x0040;
    L_0x0018:
        r0 = r6.f22921t;
        r1 = r6.f22912k;
        r2 = r6.f22915n;
        r2 = r2.f14885a;
        r3 = r2.f12099f;
        r2 = r6;
        r5 = r9;
        r0.m20809a(r1, r2, r3, r4, r5);
        return;
    L_0x0028:
        r2 = r7.f22652b;
        r2 = r2[r8];
        r3 = r2.m14698m();
        if (r3 > r1) goto L_0x003c;
    L_0x0032:
        r3 = r2.m14698m();
        if (r3 != r1) goto L_0x003e;
    L_0x0038:
        r1 = r2.f14901t;
        if (r1 == 0) goto L_0x003e;
    L_0x003c:
        r1 = r4;
        goto L_0x0016;
    L_0x003e:
        r1 = r0;
        goto L_0x0016;
    L_0x0040:
        r4 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.stream.controllers.view.JpkrFlatMiniTopChartsClusterView.a(com.google.android.finsky.stream.controllers.minitopcharts.f, int, com.google.android.finsky.stream.controllers.minitopcharts.c):void");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22927z.clearAnimation();
    }

    public final void m21013b() {
        View findViewById = findViewById(C7582R.id.toggle_switch_button);
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f22927z.getLocationInWindow(iArr2);
        int height = ((iArr[1] + findViewById.getHeight()) - iArr2[1]) - getResources().getDimensionPixelOffset(C7582R.dimen.play_card_default_inset);
        int min = Math.min(Math.max((iArr[0] + (findViewById.getWidth() / 2)) - (iArr2[0] + (this.f22927z.getWidth() / 2)), (int) (-this.f22927z.getX())), (((View) this.f22927z.getParent()).getWidth() - this.f22927z.getWidth()) - ((int) this.f22927z.getX()));
        this.f22927z.setTranslationX((float) min);
        this.f22927z.setTranslationY((float) height);
        int width = (this.f22927z.getWidth() / 2) + (min + iArr2[0]);
        ((C6266d) this.f22927z.getCardViewGroupDelegate()).mo5367c(this.f22927z, ((findViewById.getWidth() / 2) + iArr[0]) - width);
        this.f22927z.setOnClickListener(new C4509h(this));
        this.f22927z.setAlpha(0.0f);
        this.f22927z.setVisibility(0);
        this.f22927z.animate().alpha(1.0f).setListener(null);
        this.f22927z.postDelayed(new C4510i(this), (long) getResources().getInteger(C7582R.integer.jpkr_mini_top_charts_tooltip_visible_time));
    }

    public final void mo179a(int i, float f, int i2) {
    }

    public final void mo180b(int i) {
        m21012a(this.f22922u, i, this.f22923v);
        this.f22924w.mo4146c(i);
    }

    public final void d_(int i) {
    }

    public ce getPlayStoreUiElement() {
        return this.f22914m;
    }

    public ad getParentNode() {
        return this.f22913l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
