package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.support.v4.widget.bg;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C3973p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.i;
import com.google.android.play.utils.j;
import com.squareup.leakcanary.C7582R;

public class ReviewItemLayout extends RelativeLayout implements i {
    public final Rect f18303a;
    public final int f18304b;
    public TextView f18305c;
    public ReviewItemHeaderLayout f18306d;
    public TextView f18307e;
    public TextView f18308f;
    public TextView f18309g;
    public PersonAvatarView f18310h;
    public View f18311i;
    public ImageView f18312j;
    public TextView f18313k;
    public TextView f18314l;
    public ViewStub f18315m;
    public ReviewReplyLayout f18316n;
    public TextView f18317o;
    public ImageView f18318p;
    public boolean f18319q;
    public bi f18320r;
    public ad f18321s;

    public ReviewItemLayout(Context context) {
        this(context, null);
    }

    public ReviewItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18303a = new Rect();
        this.f18304b = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_overflow_touch_extend) * 2;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18305c = (TextView) findViewById(C7582R.id.review_author);
        this.f18306d = (ReviewItemHeaderLayout) findViewById(C7582R.id.review_header);
        this.f18307e = (TextView) findViewById(C7582R.id.review_title);
        this.f18308f = (TextView) findViewById(C7582R.id.review_text);
        this.f18309g = (TextView) findViewById(C7582R.id.review_metadata);
        this.f18310h = (PersonAvatarView) findViewById(C7582R.id.user_profile_image);
        this.f18311i = findViewById(C7582R.id.action_container);
        this.f18317o = (TextView) findViewById(C7582R.id.main_action);
        this.f18312j = (ImageView) findViewById(C7582R.id.action_image);
        this.f18313k = (TextView) findViewById(C7582R.id.action_text);
        this.f18318p = (ImageView) findViewById(C7582R.id.review_action_overflow);
        this.f18314l = (TextView) findViewById(C7582R.id.your_review_label);
        this.f18315m = (ViewStub) findViewById(C7582R.id.review_reply_stub);
        this.f18316n = (ReviewReplyLayout) findViewById(C7582R.id.review_reply_container);
    }

    public final void m17338a(Document document, iu iuVar, int i, boolean z, boolean z2, boolean z3, boolean z4, ad adVar, C2495w c2495w) {
        CharSequence charSequence;
        this.f18321s = adVar;
        Context context = getContext();
        Resources resources = getResources();
        this.f18319q = !TextUtils.isEmpty(iuVar.f12715c);
        this.f18311i.setVisibility(this.f18319q ? 0 : 8);
        this.f18313k.setVisibility(8);
        this.f18314l.setVisibility(8);
        this.f18312j.setVisibility(8);
        if (this.f18319q) {
            long j;
            CharSequence quantityString;
            int i2;
            this.f18317o.setVisibility(0);
            this.f18311i.setFocusable(false);
            this.f18311i.setBackgroundDrawable(null);
            this.f18317o.setFocusable(true);
            int a = C1608h.m9243a(getContext(), document.f14885a.f12099f);
            if (z) {
                long j2 = iuVar.f12729q + 1;
                j = j2;
                quantityString = resources.getQuantityString(C7582R.plurals.review_feedback_unmark_helpful_icon_description, (int) j2, new Object[]{Long.valueOf(j2)});
                i2 = a;
            } else {
                j = iuVar.f12729q;
                quantityString = resources.getQuantityString(C7582R.plurals.review_feedback_helpful_icon_description, (int) j, new Object[]{Long.valueOf(j)});
                i2 = resources.getColor(C7582R.color.play_fg_secondary);
            }
            if (j > 0) {
                this.f18317o.setText(String.valueOf(j));
                this.f18317o.setContentDescription(quantityString);
                this.f18317o.setTextColor(i2);
            } else {
                this.f18317o.setText("");
                this.f18317o.setContentDescription(resources.getString(C7582R.string.review_feedback_mark_helpful_icon_description));
            }
            Drawable e = C0259a.m1526e(C0216d.m1112a(context, (int) C7582R.drawable.ic_thumb_up));
            if (z) {
                C0259a.m1514a(e.mutate(), a);
            }
            ai.m1823a(this.f18311i, this.f18311i.getPaddingLeft(), this.f18311i.getPaddingTop(), 0, this.f18311i.getPaddingBottom());
            bg.m2222a(this.f18317o, null, e, null, null);
            this.f18318p.setVisibility(0);
            this.f18318p.setOnClickListener(new bg(this, c2495w, z3, z4, z2));
            this.f18317o.setOnClickListener(new bf(this));
        }
        if (iuVar.f12716d == null || TextUtils.isEmpty(iuVar.f12716d.f12100g)) {
            this.f18305c.setVisibility(8);
        } else {
            this.f18305c.setText(iuVar.f12716d.f12100g);
            this.f18305c.setVisibility(0);
        }
        this.f18306d.setReviewInfo(iuVar);
        if (TextUtils.isEmpty(iuVar.f12719g)) {
            this.f18307e.setVisibility(8);
        } else {
            this.f18307e.setVisibility(0);
            this.f18307e.setText(Html.fromHtml(iuVar.f12719g));
        }
        if (TextUtils.isEmpty(iuVar.f12720h)) {
            this.f18308f.setVisibility(8);
        } else {
            this.f18308f.setVisibility(0);
            this.f18308f.setText(Html.fromHtml(iuVar.f12720h));
            this.f18308f.setMaxLines(i);
        }
        if (document.f14885a.f12099f != 3) {
            charSequence = null;
        } else {
            Object obj = iuVar.f12723k;
            CharSequence charSequence2 = iuVar.f12725m;
            Object obj2 = !TextUtils.isEmpty(obj) ? 1 : null;
            Object obj3 = !TextUtils.isEmpty(charSequence2) ? 1 : null;
            if (obj2 == null) {
                charSequence = obj3 != null ? charSequence2 : null;
            } else {
                C2441n N = document.m14625N();
                obj2 = (((N.f13161a & 4) != 0 ? 1 : null) == null || !obj.equals(N.f13164d)) ? null : 1;
                if (obj2 != null) {
                    charSequence = obj3 != null ? charSequence2 : null;
                } else {
                    Context context2 = getContext();
                    charSequence = obj3 != null ? context2.getString(C7582R.string.review_older_version_with_device_name, new Object[]{charSequence2}) : context2.getString(C7582R.string.review_older_version);
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f18309g.setVisibility(8);
        } else {
            this.f18309g.setVisibility(0);
            this.f18309g.setText(charSequence);
        }
        cv cvVar = iuVar.f12716d;
        if (cvVar != null) {
            this.f18310h.m17564a(cvVar, C1473m.f7980a.be());
            this.f18310h.setVisibility(0);
        } else {
            this.f18310h.setVisibility(8);
        }
        if (iuVar.m12828d()) {
            if (this.f18316n == null) {
                this.f18316n = (ReviewReplyLayout) this.f18315m.inflate();
            }
            this.f18316n.m17341a(document, iuVar);
        } else if (this.f18316n != null) {
            this.f18316n.setVisibility(8);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f18303a.isEmpty()) {
            this.f18317o.getHitRect(this.f18303a);
            this.f18303a.inset(-this.f18304b, -this.f18304b);
            ((ViewGroup) this.f18317o.getParent()).setTouchDelegate(new j(this.f18303a, this.f18317o));
        }
    }

    public void setActionClickListener(OnClickListener onClickListener) {
        this.f18311i.setOnClickListener(onClickListener);
    }

    public void setReviewFeedbackActionListener(bi biVar) {
        this.f18320r = biVar;
        if (biVar == null && this.f18318p != null) {
            this.f18318p.setOnClickListener(null);
        }
    }

    public final void m17337a(int i) {
        if (this.f18320r != null) {
            switch (i) {
                case 1:
                    this.f18320r.mo1513a(this, C3973p.SPAM);
                    return;
                case 2:
                    this.f18320r.mo1514b(this);
                    return;
                case 3:
                    this.f18320r.mo1513a(this, C3973p.INAPPROPRIATE);
                    return;
                default:
                    FinskyLog.m21669e("Unknown item selected on ReviewItemLayout overflow menu: %d", Integer.valueOf(i));
                    return;
            }
        }
    }
}
