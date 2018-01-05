package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.bg.C1625z;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.base.playcluster.C4284f;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterView;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayCardRateAndSuggestClusterView extends PlayCardClusterView implements C0657w, C1031w, ab {
    public static final boolean f23014l = (VERSION.SDK_INT >= 16);
    public C2721l f23015m;
    public C1287h f23016n;
    public Document f23017o;
    public int f23018p;
    public C1625z f23019q;
    public PlayCardRateAndSuggestContentScroller f23020r;
    public TextView f23021s;
    public int f23022t;
    public C2720j f23023u;
    public boolean f23024v;
    public ab f23025w;

    public PlayCardRateAndSuggestClusterView(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23022t = 0;
        this.f23018p = 0;
    }

    protected int getPlayStoreUiElementType() {
        return 413;
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1957a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f23020r = (PlayCardRateAndSuggestContentScroller) findViewById(C7582R.id.content_scroller);
        this.f23021s = (TextView) findViewById(C7582R.id.empty_sadface);
    }

    public void setClusterFadeOutListener(C1625z c1625z) {
        this.f23019q = c1625z;
    }

    final void m21037a(int i, boolean z) {
        this.f23022t = i;
        PlayCardRateAndSuggestClusterViewContent playCardRateAndSuggestClusterViewContent = (PlayCardRateAndSuggestClusterViewContent) this.a;
        playCardRateAndSuggestClusterViewContent.f23026q = this.f23022t;
        playCardRateAndSuggestClusterViewContent.m21044a(!z);
    }

    final void m21041a(boolean z) {
        this.f23024v = !z;
        int a = this.f23017o.m14638a();
        while (this.f23018p < a) {
            Document a2 = this.f23017o.m14641a(this.f23018p);
            if (a2 == null) {
                FinskyLog.m21669e("Got a null document at index " + this.f23018p, new Object[0]);
                this.f23018p++;
            } else {
                String str = a2.f14885a.f12096c;
                if (this.b.m22588a(str)) {
                    this.f23018p++;
                } else {
                    iu a3 = this.c.m18689a(str, null, false);
                    if (a3 == null) {
                        return;
                    }
                    if (a3.f12717e < ((Integer) C0955b.dO.m28964b()).intValue()) {
                        this.f23018p++;
                    } else {
                        boolean z2;
                        jf s = a2.m14664s();
                        if (s == null || TextUtils.isEmpty(s.f12778e)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            this.f23018p++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    final void m21042b(boolean z) {
        if (getCardChildCount() != 0) {
            int i = this.f23022t;
            if (this.f23018p >= this.f23017o.m14638a()) {
                m21037a(3, z);
                if (i != this.f23022t) {
                    boolean z2;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        this.f23020r.startAnimation(C1621v.m9307b(getContext(), 250, new ac(this)));
                        Animation a = C1621v.m9304a(getContext(), 250, null);
                        this.f23021s.setVisibility(0);
                        C1601a.m9199a(getContext(), this.f23021s.getText(), this.f23021s, true);
                        this.f23021s.startAnimation(a);
                        return;
                    }
                    this.f23020r.setVisibility(8);
                    this.f23021s.setVisibility(0);
                    return;
                }
                return;
            }
            Document a2 = this.f23017o.m14641a(this.f23018p);
            if (this.c.m18689a(a2.f14885a.f12096c, null, false) != null) {
                m21037a(2, z);
                jf s = this.f23017o.m14641a(this.f23018p).m14664s();
                if (z) {
                    this.f23020r.m21046b();
                    this.g.m19881a(s.f12776c, C4685p.m21831a(s.f12777d));
                }
                m21034c();
                this.f23023u = C2721l.m14733a(this.d, s.f12778e, false, true);
                this.f23023u.m11918a((C1031w) this);
                this.f23023u.m11917a((C0657w) this);
                this.f23023u.m14699n();
                return;
            }
            m21037a(0, z);
            this.a.m19875a(new ArrayList(Arrays.asList(new Document[]{this.f23017o.m14641a(this.f23018p)})), this.f23017o.f14885a.f12096c);
            PlayCardViewRate playCardViewRate = (PlayCardViewRate) m19866a(0);
            float a3 = C1617r.m9292a(a2.f14885a.f12098e);
            if (!z) {
                playCardViewRate.startAnimation(C1621v.m9307b(getContext(), 150, new C4519x(this, playCardViewRate, a3)));
            }
        }
    }

    public final void mo1448a(Document document, d dVar) {
        if (dVar.getCardType() == 13) {
            this.b.m22589b(document.f14885a.f12096c);
            m21041a(false);
            m21042b(false);
            return;
        }
        this.f23025w.mo1448a(document, dVar);
    }

    public final PlayCardClusterView mo4240a(Document document) {
        this.f23017o = document;
        this.a.setClusterLoggingDocument(this.f23017o);
        return this;
    }

    public final void mo4241a(C4281c c4281c, C4808a c4808a, C1254c c1254c, C3748a c3748a, ab abVar, C4283e c4283e, ad adVar, C2495w c2495w) {
        this.b = c4808a;
        this.c = c4808a.f25084a;
        m21041a(true);
        List arrayList = new ArrayList();
        if (this.f23018p < this.f23017o.m14638a()) {
            arrayList.add(this.f23017o.m14641a(this.f23018p));
        }
        this.a.m19875a(arrayList, this.f23017o.f14885a.f12096c);
        this.f23025w = abVar;
        super.mo4241a(c4281c, c4808a, c1254c, c3748a, this, c4283e, adVar, c2495w);
        m21042b(true);
        PlayCardViewRate playCardViewRate = (PlayCardViewRate) m19866a(0);
        playCardViewRate.setRateListener(new C4521z(this));
        playCardViewRate.setSkipListener(new aa(this, playCardViewRate, c2495w));
        playCardViewRate.setState(0);
    }

    protected void onDetachedFromWindow() {
        if (m19868b()) {
            ((PlayCardViewRate) m19866a(0)).setRateListener(null);
        }
        m21034c();
        super.onDetachedFromWindow();
    }

    private final void m21034c() {
        if (this.f23023u != null) {
            this.f23023u.m11922b((C1031w) this);
            this.f23023u.m11921b((C0657w) this);
            this.f23023u = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (!(this.g == null || this.g.getVisibility() == 8)) {
            this.g.measure(i, 0);
            paddingTop += this.g.getMeasuredHeight();
        }
        this.f23020r.measure(i, 0);
        paddingTop += this.f23020r.getMeasuredHeight();
        this.f23021s.measure(MeasureSpec.makeMeasureSpec(this.f23020r.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(this.f23020r.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, paddingTop);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (!(this.g == null || this.g.getVisibility() == 8)) {
            this.g.layout(0, paddingTop, width, this.g.getMeasuredHeight() + paddingTop);
            paddingTop += this.g.getMeasuredHeight();
        }
        int measuredHeight = this.f23020r.getMeasuredHeight();
        this.f23020r.layout(0, paddingTop, width, paddingTop + measuredHeight);
        paddingTop += (measuredHeight - this.f23021s.getMeasuredHeight()) / 2;
        this.f23021s.layout(0, paddingTop, width, this.f23021s.getMeasuredHeight() + paddingTop);
    }

    public final void mo1062a(VolleyError volleyError) {
        m21035d();
    }

    private final void m21035d() {
        Document a = this.f23017o.m14641a(this.f23018p);
        if (!(a == null || TextUtils.isEmpty(a.f14885a.f12096c))) {
            this.b.m22589b(a.f14885a.f12096c);
        }
        m21041a(false);
        m21042b(false);
    }

    public final void m_() {
        int m = this.f23023u.m14698m();
        if (m == 0) {
            m21035d();
            return;
        }
        List arrayList = new ArrayList();
        arrayList.add(this.f23017o.m14641a(this.f23018p));
        int min = Math.min(getCardChildCount() - 1, m);
        for (int i = 0; i < min; i++) {
            arrayList.add((Document) this.f23023u.m14694d(i));
        }
        this.a.m19875a(arrayList, this.f23017o.f14885a.f12096c);
        for (m = 1; m <= min; m++) {
            this.a.m19873a(m, m, m, this);
        }
        for (m = min + 1; m < getCardChildCount(); m++) {
            PlayCardClusterViewContent playCardClusterViewContent = this.a;
            d b = playCardClusterViewContent.m19876b(m);
            b.startAnimation(C1621v.m9307b(playCardClusterViewContent.getContext(), 250, new C4284f(b)));
        }
        jf s = this.f23017o.m14641a(this.f23018p).m14664s();
        if (!this.f23024v) {
            this.f23020r.m21046b();
            this.g.m19881a(s.f12776c, C4685p.m21831a(s.f12777d));
        } else if (this.a.getMetadata().f21626a <= 2) {
            this.f23020r.m21045a();
            this.g.m19881a(s.f12776c, C4685p.m21831a(s.f12777d));
        } else {
            new Handler(Looper.myLooper()).postDelayed(new ab(this, s), 750);
        }
        m21037a(2, false);
    }
}
