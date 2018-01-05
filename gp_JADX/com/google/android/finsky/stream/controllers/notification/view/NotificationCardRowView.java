package com.google.android.finsky.stream.controllers.notification.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.notification.C3778a;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3817p;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class NotificationCardRowView extends ConstraintLayout implements ad, ae, C2625e {
    public final C4683n f22704k;
    public PlayActionButtonV2 f22705l;
    public PlayActionButtonV2 f22706m;
    public TextView f22707n;
    public TextView f22708o;
    public TextView f22709p;
    public ImageView f22710q;
    public Drawable f22711r;
    public Space f22712s;
    public int f22713t;
    public C3781e f22714u;
    public C4461f f22715v;
    public Drawable f22716w;
    public ad f22717x;
    public ce f22718y;
    public C3817p f22719z;

    public NotificationCardRowView(Context context) {
        this(context, null);
    }

    public NotificationCardRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NotificationCardRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22713t = 0;
        this.f22704k = new C4683n(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        ((C1439g) C3947d.m18649a(C1439g.class)).mo1943a(this);
        this.f22708o = (TextView) findViewById(C1592a.av.intValue());
        this.f22707n = (TextView) findViewById(C1592a.aw.intValue());
        this.f22709p = (TextView) findViewById(C1592a.ax.intValue());
        this.f22705l = (PlayActionButtonV2) findViewById(C1592a.ay.intValue());
        this.f22706m = (PlayActionButtonV2) findViewById(C1592a.az.intValue());
        this.f22710q = (ImageView) findViewById(C1592a.aA.intValue());
        this.f22712s = (Space) findViewById(C1592a.aB.intValue());
        this.f22715v = new C4469e();
        setOnClickListener(new C4465a(this));
    }

    public void setActionListener(C4461f c4461f) {
        this.f22715v = (C4461f) aj.m21700a(c4461f);
    }

    public final void Z_() {
        this.f22713t++;
        this.f22717x = null;
        this.f22718y = null;
    }

    public final void m20869a(C3778a c3778a, PlayActionButtonV2 playActionButtonV2, boolean z, String str) {
        if (c3778a == null || c3778a.f18986c == null) {
            playActionButtonV2.setVisibility(8);
            return;
        }
        OnClickListener c4467c;
        playActionButtonV2.setVisibility(0);
        String str2 = c3778a.f18984a;
        if (z) {
            c4467c = new C4467c(this);
        } else {
            c4467c = new C4468d(this);
        }
        playActionButtonV2.mo2588a(3, str2, c4467c);
        playActionButtonV2.setContentDescription(getContext().getString(C7582R.string.notification_center_action_description, new Object[]{str, c3778a.f18984a}));
    }

    public ce getPlayStoreUiElement() {
        return this.f22718y;
    }

    public ad getParentNode() {
        return this.f22717x;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
