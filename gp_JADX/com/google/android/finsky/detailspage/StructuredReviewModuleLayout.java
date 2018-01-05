package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v4.widget.bg;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.adapters.C1181z;
import com.google.android.finsky.adapters.ac;
import com.google.android.finsky.adapters.p121a.C1140e;
import com.google.android.finsky.adapters.p121a.C1146d;
import com.google.android.finsky.adapters.p121a.C1147f;
import com.google.android.finsky.adapters.p121a.C1150h;
import com.google.android.finsky.adapters.p121a.C1153j;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.layout.play.ReviewQuestionsRecyclerView;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.widget.ScalingPageIndicator;
import com.squareup.leakcanary.C7582R;

public class StructuredReviewModuleLayout extends LinearLayout implements C1147f, ac, C2621k {
    public ReviewQuestionsRecyclerView f14064a;
    public C1181z f14065b;
    public PersonAvatarView f14066c;
    public ScalingPageIndicator f14067d;
    public Button f14068e;
    public Button f14069f;
    public boolean f14070g;
    public int f14071h;
    public LinearLayoutManager f14072i;
    public ad f14073j;
    public fc f14074k;
    public boolean f14075l;

    public StructuredReviewModuleLayout(Context context) {
        this(context, null);
    }

    public StructuredReviewModuleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StructuredReviewModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14064a = (ReviewQuestionsRecyclerView) findViewById(C7582R.id.questions_widget);
        this.f14066c = (PersonAvatarView) findViewById(C7582R.id.my_avatar);
        this.f14067d = (ScalingPageIndicator) findViewById(C7582R.id.page_indicator);
        getContext();
        this.f14072i = new ey(this, ai.f1848a.mo400k(this) == 1);
        this.f14064a.setLayoutManager(this.f14072i);
        this.f14064a.setItemAnimator(null);
        this.f14064a.mo2951a(new ez(this));
        this.f14067d.setSelectedColorResId(C1608h.m9251b(3));
        this.f14067d.setUnselectedColorResId(C7582R.color.play_disabled_grey);
        this.f14068e = (Button) findViewById(C7582R.id.review_continue_button);
        this.f14069f = (Button) findViewById(C7582R.id.review_back_button);
        bg.m2222a(this.f14069f, m13787c(C7582R.raw.ic_chevron_left_24dp), null, null, null);
        bg.m2222a(this.f14068e, null, null, m13787c(C7582R.raw.ic_chevron_right_24dp), null);
    }

    public final void mo3013a(int i) {
        this.f14070g = false;
        this.f14067d.setSelectedPage(i);
        this.f14064a.mo5181e(i);
    }

    public final void mo3012a() {
        if (this.f14068e.getVisibility() == 0) {
            this.f14068e.setText(this.f14065b.m7130e(this.f14071h).mo1461e());
            this.f14068e.setEnabled(true);
        }
        if (this.f14065b.mo1039a() > 1) {
            this.f14067d.setVisibility(0);
        }
    }

    private final Drawable m13787c(int i) {
        Resources resources = getResources();
        try {
            return C0722q.m4782a(resources, i, new as().m4593b(resources.getColor(C7582R.color.play_fg_secondary)));
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Bad svg resource: %d", Integer.valueOf(i));
            return null;
        }
    }

    final void m13791b(int i) {
        boolean z = true;
        this.f14065b.m7130e(this.f14071h).mo1455a((C1147f) this);
        this.f14069f.setVisibility(8);
        int i2 = ((this.f14065b.m7130e(i) instanceof C1146d) || m13788d(i)) ? true : 0;
        if (i2 != 0) {
            this.f14068e.setVisibility(0);
            boolean d = m13788d(i);
            Button button;
            if (i == this.f14065b.mo1039a() - 1 || d) {
                if (i == this.f14065b.mo1039a() - 1) {
                    this.f14068e.setText(C7582R.string.structured_review_question_finish);
                } else {
                    this.f14068e.setText(this.f14065b.m7130e(i).mo1461e());
                }
                button = this.f14068e;
                if (this.f14070g || !this.f14075l) {
                    z = false;
                }
                button.setEnabled(z);
                bg.m2222a(this.f14068e, null, null, null, null);
                return;
            }
            this.f14068e.setText(this.f14065b.m7130e(i).mo1461e());
            bg.m2222a(this.f14068e, null, null, m13787c(C7582R.raw.ic_chevron_right_24dp), null);
            button = this.f14068e;
            if (this.f14070g) {
                z = false;
            }
            button.setEnabled(z);
            return;
        }
        this.f14068e.setVisibility(8);
    }

    private final boolean m13788d(int i) {
        C1140e e = this.f14065b.m7130e(i);
        return (e instanceof C1150h) && !(e instanceof C1153j);
    }
}
