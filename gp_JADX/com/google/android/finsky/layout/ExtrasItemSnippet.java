package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.b;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public class ExtrasItemSnippet extends b implements ad {
    public PlayActionButtonV2 f18190a;
    public TextView f18191b;
    public TextView f18192c;
    public ViewStub f18193d;
    public View f18194e;
    public TextView f18195f;
    public HeroGraphicView f18196g;
    public Document f18197h;
    public aj f18198i;
    public final Runnable f18199j = new ag(this);
    public final Handler f18200k = new Handler(Looper.getMainLooper());
    public C3748a f18201l;
    public ce f18202m = C2482j.m13283a(2702);
    public ad f18203n;
    public C2495w f18204o;

    public ExtrasItemSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18197h.m14630S() == null) {
            setVisibility(8);
            return;
        }
        m17303a();
        setOnClickListener(new ah(this));
    }

    public final void m17303a() {
        lq S = this.f18197h.m14630S();
        this.f18192c.setText(this.f18197h.f14885a.f12100g);
        this.f18192c.setMaxLines(2);
        this.f18192c.setEllipsize(TruncateAt.END);
        Account a = C1473m.f7980a.mo2045Y().m11642a(this.f18197h, C1473m.f7980a.cY());
        if (a != null) {
            this.f18191b.setText(null);
            this.f18190a.setVisibility(0);
            this.f18190a.setDrawAsLabel(false);
            this.f18190a.setActionStyle(2);
            this.f18190a.setEnabled(true);
            this.f18190a.m6000a(4, (int) C7582R.string.play, new ai(this, a));
            return;
        }
        this.f18190a.setVisibility(8);
        this.f18191b.setText(S.f13038c.toUpperCase(Locale.getDefault()));
    }

    public Document getDocument() {
        return this.f18197h;
    }

    public final boolean m17306b() {
        return this.f18194e != null && this.f18194e.getVisibility() == 0;
    }

    public final void m17304a(int i) {
        if (this.f18194e == null) {
            this.f18194e = this.f18193d.inflate();
            this.f18195f = (TextView) findViewById(C7582R.id.episode_description);
            this.f18196g = (HeroGraphicView) findViewById(C7582R.id.episode_screencap);
        }
        this.f18194e.setVisibility(i);
        if (i == 8) {
            this.f18192c.setMaxLines(2);
            this.f18192c.setEllipsize(TruncateAt.END);
        } else {
            this.f18192c.setMaxLines(1000);
            this.f18192c.setEllipsize(null);
        }
        if (i == 0) {
            this.f18196g.m13591a(this.f18197h);
            CharSequence A = this.f18197h.m14612A();
            if (TextUtils.isEmpty(A)) {
                this.f18195f.setVisibility(8);
            } else {
                this.f18195f.setVisibility(0);
                this.f18195f.setText(A);
            }
        }
        if (this.f18198i != null) {
            this.f18198i.mo3003a(this);
        }
        this.f18200k.post(this.f18199j);
    }

    protected void onDetachedFromWindow() {
        this.f18200k.removeCallbacks(this.f18199j);
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18193d = (ViewStub) findViewById(C7582R.id.expanded_content_stub);
        this.f18190a = (PlayActionButtonV2) findViewById(C7582R.id.play_button);
        this.f18191b = (TextView) findViewById(C7582R.id.duration);
        this.f18192c = (TextView) findViewById(C7582R.id.extras_item_title);
        this.f18191b.setTextColor(getResources().getColor(C1608h.m9241a(4)));
    }

    public ce getPlayStoreUiElement() {
        return this.f18202m;
    }

    public ad getParentNode() {
        return this.f18203n;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
