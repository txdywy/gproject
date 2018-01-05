package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.bg.C1625z;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterView;
import com.google.android.play.layout.d;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardRateClusterView extends PlayCardClusterView implements ab {
    public TextView f23030l;
    public C1625z f23031m;
    public boolean f23032n;

    public PlayCardRateClusterView(Context context) {
        this(context, null);
    }

    public PlayCardRateClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int getPlayStoreUiElementType() {
        return 412;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f23030l = (TextView) findViewById(C7582R.id.empty_done);
    }

    public void setClusterFadeOutListener(C1625z c1625z) {
        this.f23031m = c1625z;
    }

    public final void mo1448a(Document document, d dVar) {
        this.b.m22589b(document.f14885a.f12096c);
        m21048a((PlayCardViewRate) dVar);
    }

    public final void mo4241a(C4281c c4281c, C4808a c4808a, C1254c c1254c, C3748a c3748a, ab abVar, C4283e c4283e, ad adVar, C2495w c2495w) {
        super.mo4241a(c4281c, c4808a, c1254c, c3748a, this, c4283e, adVar, c2495w);
        int cardChildCount = getCardChildCount();
        for (int i = 0; i < cardChildCount; i++) {
            PlayCardViewRate playCardViewRate = (PlayCardViewRate) m19866a(i);
            playCardViewRate.setRateListener(new ae(this, playCardViewRate));
            playCardViewRate.setState(0);
        }
        if (!((PlayCardRateClusterViewContent) this.a).m21054c()) {
            m21050a(false);
        }
        this.f23032n = false;
    }

    final void m21048a(PlayCardViewRate playCardViewRate) {
        playCardViewRate.startAnimation(C1621v.m9307b(getContext(), 150, new af(this, playCardViewRate)));
    }

    final void m21050a(boolean z) {
        if (z) {
            this.a.startAnimation(C1621v.m9307b(getContext(), 250, new aj(this)));
            Animation a = C1621v.m9304a(getContext(), 250, null);
            this.f23030l.setVisibility(0);
            C1601a.m9199a(getContext(), this.f23030l.getText(), this.f23030l, true);
            this.f23030l.startAnimation(a);
            return;
        }
        this.a.setVisibility(4);
        this.f23030l.setVisibility(0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f23032n || super.onInterceptTouchEvent(motionEvent);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (!(this.g == null || this.g.getVisibility() == 8)) {
            this.g.measure(i, 0);
            paddingTop += this.g.getMeasuredHeight();
        }
        this.a.measure(i, 0);
        paddingTop += this.a.getMeasuredHeight();
        this.f23030l.measure(MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, paddingTop);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (!(this.g == null || this.g.getVisibility() == 8)) {
            this.g.layout(0, paddingTop, width, this.g.getMeasuredHeight() + paddingTop);
            paddingTop += this.g.getMeasuredHeight();
        }
        int measuredHeight = this.a.getMeasuredHeight();
        this.a.layout(0, paddingTop, width, paddingTop + measuredHeight);
        paddingTop += (measuredHeight - this.f23030l.getMeasuredHeight()) / 2;
        this.f23030l.layout(0, paddingTop, width, this.f23030l.getMeasuredHeight() + paddingTop);
    }
}
