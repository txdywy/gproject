package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.app.C0254u;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.frameworkviews.ac;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.C3971j;
import com.google.android.finsky.utils.C4682m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public class PlayCardViewRate extends d implements ac {
    public String f19516a;
    public C0988c f19517b;
    public C3964c f19518d;
    public View f19519e;
    public PlayRatingBar f19520f;
    public PlayCardViewRateOverlay f19521g;
    public TextView f19522h;
    public ck f19523i;
    public cl f19524j;
    public C2495w f19525k;
    public int f19526l;

    public PlayCardViewRate(Context context) {
        this(context, null);
    }

    public PlayCardViewRate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19526l = 0;
    }

    public void setRateListener(ck ckVar) {
        this.f19523i = ckVar;
    }

    public void setState(int i) {
        boolean z = true;
        if (this.f19526l != i) {
            boolean z2;
            this.f19526l = i;
            this.f19521g.setVisibility(this.f19526l == 1 ? 0 : 8);
            PlayRatingBar playRatingBar = this.f19520f;
            if (this.f19526l != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            playRatingBar.setEnabled(z2);
            TextView textView = this.f19522h;
            if (this.f19526l == 1) {
                z = false;
            }
            textView.setEnabled(z);
        }
    }

    public void setSkipListener(cl clVar) {
        this.f19524j = clVar;
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1888a(this);
        super.onFinishInflate();
        this.f19519e = findViewById(C7582R.id.rate_separator);
        this.f19520f = (PlayRatingBar) findViewById(C7582R.id.rate_bar);
        this.f19521g = (PlayCardViewRateOverlay) findViewById(C7582R.id.content_overlay);
        this.f19522h = (TextView) findViewById(C7582R.id.skip_rating);
        this.f19522h.setText(this.f19522h.getText().toString().toUpperCase(Locale.getDefault()));
        this.f19522h.setOnClickListener(new cg(this));
        if (!P) {
            setNextFocusDownId(C7582R.id.star3);
            this.f19520f.findViewById(C7582R.id.star3).setNextFocusUpId(C7582R.id.play_card);
        }
    }

    public int getCardType() {
        return 13;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int measuredWidth;
        int measuredHeight;
        int i3;
        if (this.Q == null || this.R != 3) {
            obj = null;
        } else {
            obj = 1;
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = (size - paddingLeft) - paddingRight;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.aj.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.f19520f.getLayoutParams();
        MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.f19519e.getLayoutParams();
        if (this.f19520f.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams8 = (MarginLayoutParams) this.f19522h.getLayoutParams();
            this.f19522h.measure(0, 0);
            measuredWidth = marginLayoutParams8.rightMargin + (this.f19522h.getMeasuredWidth() + marginLayoutParams8.leftMargin);
            this.f19520f.measure(MeasureSpec.makeMeasureSpec(i4 - measuredWidth, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            measuredHeight = (marginLayoutParams6.bottomMargin + (marginLayoutParams6.topMargin + this.f19520f.getMeasuredHeight())) + marginLayoutParams7.bottomMargin;
            if (obj != null) {
                measuredHeight += marginLayoutParams7.height + marginLayoutParams7.topMargin;
            }
        } else {
            measuredHeight = 0;
        }
        measuredHeight = ((size2 - paddingTop) - paddingBottom) - measuredHeight;
        measuredWidth = (int) Math.min(((float) measuredHeight) / this.am, (float) ((((size - paddingLeft) - paddingRight) * 2) / 3));
        this.U.measure(MeasureSpec.makeMeasureSpec(measuredWidth, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
        measuredWidth = (i4 - measuredWidth) - marginLayoutParams.rightMargin;
        if (this.f19520f.getVisibility() != 8) {
            if (obj != null) {
                i3 = (i4 - marginLayoutParams7.leftMargin) - marginLayoutParams7.rightMargin;
            } else {
                i3 = (measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams2.leftMargin;
            }
            this.f19519e.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams7.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        this.ah.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
        i3 = (this.ah.getMeasuredWidth() + marginLayoutParams4.leftMargin) + marginLayoutParams4.rightMargin;
        this.af.measure(0, 0);
        this.V.measure(MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        i3 = ((measuredWidth - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin) - i3;
        this.ab.measure(0, 0);
        if (this.ab.getMeasuredWidth() > i3) {
            this.ab.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        }
        if (this.aj.getVisibility() != 8) {
            this.aj.measure(MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        if (this.f19521g.getVisibility() != 8) {
            if (obj == null || this.f19520f == null) {
                i3 = measuredHeight;
            } else {
                i3 = (this.f19519e.getMeasuredHeight() + marginLayoutParams7.topMargin) + measuredHeight;
            }
            this.f19521g.measure(MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        this.al.measure(0, 0);
        setMeasuredDimension(size, size2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int a;
        int i5;
        int i6;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.af.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.aj.getLayoutParams();
        if (this.f19520f.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.f19519e.getLayoutParams();
            MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.f19520f.getLayoutParams();
            MarginLayoutParams marginLayoutParams8 = (MarginLayoutParams) this.f19522h.getLayoutParams();
            measuredWidth = this.f19522h.getMeasuredWidth();
            int b = C0361r.m2051b(marginLayoutParams8);
            int measuredWidth2 = this.f19520f.getMeasuredWidth();
            int measuredHeight = this.f19520f.getMeasuredHeight();
            a = k.a(width, measuredWidth2, z2, (((((((width - l) - m) - measuredWidth2) - measuredWidth) - C0361r.m2049a(marginLayoutParams8)) - b) / 2) + l);
            int i7 = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - measuredHeight;
            this.f19520f.layout(a, i7, measuredWidth2 + a, i7 + measuredHeight);
            a = this.f19519e.getMeasuredWidth();
            measuredWidth2 = this.f19519e.getMeasuredHeight();
            int b2 = k.b(width, a, z2, C0361r.m2051b(marginLayoutParams6) + m);
            i5 = ((i7 - marginLayoutParams7.topMargin) - marginLayoutParams6.bottomMargin) - measuredWidth2;
            this.f19519e.layout(b2, i5, a + b2, this.f19519e.getMeasuredHeight() + i5);
            i5 = this.f19522h.getMeasuredHeight();
            i6 = ((measuredHeight - i5) / 2) + i7;
            a = k.b(width, measuredWidth, z2, m + b);
            this.f19522h.layout(a, i6, measuredWidth + a, i5 + i6);
        }
        i5 = this.U.getMeasuredHeight();
        i6 = this.U.getMeasuredWidth();
        a = C0361r.m2049a(marginLayoutParams) + l;
        measuredWidth = k.a(width, i6, z2, a);
        this.U.layout(measuredWidth, marginLayoutParams.topMargin + paddingTop, measuredWidth + i6, (marginLayoutParams.topMargin + paddingTop) + i5);
        int i8 = a + i6;
        i5 = this.V.getMeasuredWidth();
        i6 = marginLayoutParams2.topMargin + paddingTop;
        i8 += C0361r.m2049a(marginLayoutParams2);
        int a2 = k.a(width, i5, z2, i8);
        this.V.layout(a2, i6, i5 + a2, this.V.getMeasuredHeight() + i6);
        i5 = this.af.getMeasuredWidth();
        i6 += marginLayoutParams3.topMargin;
        int b3 = k.b(width, i5, z2, C0361r.m2051b(marginLayoutParams3) + m);
        this.af.layout(b3, i6, i5 + b3, this.af.getMeasuredHeight() + i6);
        b3 = this.ah.getMeasuredWidth();
        i5 = this.ah.getMeasuredHeight();
        i6 = this.V.getBottom() + marginLayoutParams4.topMargin;
        int b4 = k.b(width, b3, z2, C0361r.m2051b(marginLayoutParams4) + m);
        this.ah.layout(b4, i6, b3 + b4, i5 + i6);
        b3 = (this.ah.getBaseline() + i6) - this.ab.getBaseline();
        b4 = this.ab.getMeasuredWidth();
        i8 = k.a(width, b4, z2, i8);
        this.ab.layout(i8, b3, b4 + i8, this.ab.getMeasuredHeight() + b3);
        if (this.aj.getVisibility() != 8) {
            i8 = this.aj.getMeasuredWidth();
            b3 = this.U.getBottom() - marginLayoutParams5.bottomMargin;
            a2 = k.a(width, i8, z2, a2 + C0361r.m2049a(marginLayoutParams5));
            this.aj.layout(a2, b3 - this.aj.getMeasuredHeight(), i8 + a2, b3);
        }
        if (this.f19521g.getVisibility() != 8) {
            i8 = this.f19521g.getMeasuredWidth();
            a2 = k.a(width, i8, z2, l);
            this.f19521g.layout(a2, paddingTop, i8 + a2, this.f19521g.getMeasuredHeight() + paddingTop);
        }
        i8 = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
        a2 = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        this.al.layout(i8, a2, this.al.getMeasuredWidth() + i8, this.al.getMeasuredHeight() + a2);
    }

    public final void m18469b() {
        super.b();
        if (this.f19519e != null) {
            this.f19519e.setVisibility(8);
        }
        if (this.f19520f != null) {
            this.f19520f.setVisibility(8);
        }
    }

    public final void mo1472a(PlayRatingBar playRatingBar, int i) {
        m18467a((float) i, false);
        this.f19525k.m13379b(new C2475d((ad) getLoggingData()).m13256a(1208));
        if (playRatingBar.getContext() instanceof C0254u) {
            C0254u c0254u = (C0254u) C4682m.m21821a(playRatingBar.getContext(), C0254u.class);
            C3964c c3964c = this.f19518d;
            c3964c.m18679a(c0254u, new C3971j(c3964c, this.f19517b.cZ(), this.f19516a, Math.round((float) i), new ch(this), c0254u), true);
            return;
        }
        FinskyLog.m21669e("View context is not a fragment activity in Rate Card", new Object[0]);
    }

    final void m18467a(float f, boolean z) {
        int round = Math.round(f);
        if (round > 0) {
            if (this.f19523i != null) {
                this.f19523i.mo4254a(z);
            }
            this.f19520f.setRating(round);
            if (round > 0) {
                C1601a.m9199a(getContext(), getResources().getQuantityString(C7582R.plurals.content_description_rated, round, new Object[]{Integer.valueOf(round)}), this.f19520f, false);
            }
            if (this.f19526l == 0) {
                setState(1);
                Animation a = C1621v.m9304a(getContext(), 100, null);
                this.f19521g.setVisibility(0);
                PlayCardViewRateOverlay playCardViewRateOverlay = this.f19521g;
                int i = this.R;
                playCardViewRateOverlay.f19532f = Integer.toString(round);
                playCardViewRateOverlay.f19533g = playCardViewRateOverlay.getResources().getQuantityString(C7582R.plurals.stars_without_numbers, round);
                round = C1608h.m9243a(playCardViewRateOverlay.getContext(), i);
                playCardViewRateOverlay.f19527a.setColor(round);
                playCardViewRateOverlay.f19528b.setColor(round);
                playCardViewRateOverlay.f19527a.getTextBounds(playCardViewRateOverlay.f19532f, 0, playCardViewRateOverlay.f19532f.length(), playCardViewRateOverlay.f19529c);
                playCardViewRateOverlay.f19528b.getTextBounds(playCardViewRateOverlay.f19533g, 0, playCardViewRateOverlay.f19533g.length(), playCardViewRateOverlay.f19530d);
                this.f19521g.startAnimation(a);
            }
            invalidate();
        }
    }

    public final void au_() {
        if (this.f19523i != null) {
            this.f19523i.mo4253a();
        }
        this.f19520f.setRating(0);
        if (this.f19526l == 1) {
            this.f19521g.startAnimation(C1621v.m9307b(getContext(), 250, new ci(this)));
        }
        invalidate();
    }

    public void setVisibility(int i) {
        if (this.f19526l != 2 || i != 0) {
            super.setVisibility(i);
        }
    }
}
