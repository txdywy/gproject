package com.google.android.finsky.stream.controllers.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.gf;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.notification.C2281m;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3800x;
import com.google.android.finsky.notification.C3813k;
import com.google.android.finsky.notification.C3814l;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3823y;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.ac;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.controllers.notification.view.C4461f;
import com.google.android.finsky.stream.controllers.notification.view.C4466b;
import com.google.android.finsky.stream.controllers.notification.view.NotificationCardRowView;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.l;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class C4462b extends C4250b implements ad, C2281m, C4461f {
    public ce f22695a;
    public List f22696b = new ArrayList();
    public final C1461c f22697o;
    public C3800x f22698p;
    public ac f22699q;
    public C3813k f22700r;
    public ab f22701s;

    public C4462b(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C1461c c1461c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        ((C1438a) C3947d.m18649a(C1438a.class)).mo1942a(this);
        this.f22697o = c1461c;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.D = new C4464d();
        this.f22695a = C2482j.m13283a(475);
        C2482j.m13285a(this.f22695a, this.g.f14908a.f14885a.f12087D);
        this.f22700r.m18250a(this);
        C3813k c3813k = this.f22700r;
        c3813k.f19134a.mo3759a(c3813k.f19135b.cZ()).mo4398a(new C3814l(c3813k));
    }

    public final void mo4061q() {
        this.f22700r.m18251b(this);
        super.mo4061q();
    }

    public final int mo1508a() {
        if (!m20854b() || this.f22696b.size() <= 0) {
            return this.f22696b.size();
        }
        return this.f22696b.size() + 1;
    }

    public final int mo1509a(int i) {
        Integer num;
        if (i == this.f22696b.size()) {
            num = C1592a.au;
        } else {
            num = C1592a.at;
        }
        return num.intValue();
    }

    public final void mo1510a(View view, int i) {
        if (!m20854b() || i != this.f22696b.size()) {
            NotificationCardRowView notificationCardRowView = (NotificationCardRowView) view;
            if (notificationCardRowView != null) {
                Drawable drawable;
                CharSequence string;
                int dimensionPixelSize;
                ce ceVar;
                C3781e c3781e = (C3781e) this.f22696b.get(i);
                notificationCardRowView.f22708o.setText(c3781e.f18987a.f18991c);
                if (c3781e.f18987a.f18996h == 0) {
                    if (notificationCardRowView.f22711r == null) {
                        notificationCardRowView.f22711r = notificationCardRowView.getResources().getDrawable(C1592a.aD.intValue());
                    }
                    drawable = notificationCardRowView.f22711r;
                    string = notificationCardRowView.getContext().getString(C7582R.string.notification_center_new_notification_card_description, new Object[]{c3781e.f18987a.f18991c});
                } else {
                    drawable = null;
                    string = null;
                }
                l.a(notificationCardRowView.f22708o, drawable, true);
                notificationCardRowView.f22708o.setContentDescription(string);
                notificationCardRowView.f22714u = c3781e;
                notificationCardRowView.f22707n.setText(Html.fromHtml(c3781e.f18987a.f18992d).toString());
                long j = c3781e.f18987a.f18995g;
                long a = C4678i.m21812a();
                if (j <= 0 || j > a) {
                    notificationCardRowView.f22709p.setVisibility(8);
                } else {
                    TextView textView = notificationCardRowView.f22709p;
                    C4683n c4683n = notificationCardRowView.f22704k;
                    long j2 = a - j;
                    if (j2 < 60000) {
                        string = c4683n.f24068e.getResources().getString(C7582R.string.relative_time_span_now);
                    } else {
                        long j3;
                        if (j2 < 3600000) {
                            j3 = 60000;
                        } else if (j2 < 86400000) {
                            j3 = 3600000;
                        } else if (j2 < 604800000) {
                            j3 = 86400000;
                        } else {
                            j3 = 604800000;
                        }
                        string = DateUtils.getRelativeTimeSpanString(j, a, j3).toString();
                    }
                    textView.setText(string);
                    notificationCardRowView.f22709p.setVisibility(0);
                }
                notificationCardRowView.m20869a(c3781e.f18987a.f18999k, notificationCardRowView.f22705l, true, c3781e.f18987a.f18991c);
                notificationCardRowView.m20869a(c3781e.f18987a.f19000l, notificationCardRowView.f22706m, false, c3781e.f18987a.f18991c);
                notificationCardRowView.setClickable(c3781e.f18987a.f18997i != null);
                LayoutParams layoutParams = notificationCardRowView.f22712s.getLayoutParams();
                if (c3781e.f18987a.f18999k == null && c3781e.f18987a.f19000l == null) {
                    dimensionPixelSize = notificationCardRowView.getResources().getDimensionPixelSize(C7582R.dimen.notification_center_card_no_buttons_bottom_margin);
                } else {
                    dimensionPixelSize = notificationCardRowView.getResources().getDimensionPixelSize(C7582R.dimen.notification_center_card_with_buttons_bottom_margin);
                }
                layoutParams.height = dimensionPixelSize;
                notificationCardRowView.f22719z.m18259a(c3781e.f18987a.f18994f, c3781e.f18987a.f18989a, new C4466b(notificationCardRowView, notificationCardRowView.f22713t));
                notificationCardRowView.f22717x = this;
                if (c3781e.f18987a.f19001m == null) {
                    ceVar = null;
                } else {
                    ceVar = C2482j.m13283a(c3781e.f18987a.f19001m.intValue());
                    C2482j.m13285a(ceVar, c3781e.f18987a.f19002n);
                    cf cfVar = new cf();
                    cfVar.b(i);
                    ceVar.e = cfVar;
                }
                notificationCardRowView.f22718y = ceVar;
                if (notificationCardRowView.f22718y != null) {
                    notificationCardRowView.f22717x.mo1219a(notificationCardRowView);
                }
                notificationCardRowView.setActionListener(this);
            }
        }
    }

    public final void mo1511b(View view, int i) {
        if (!m20854b() || (view instanceof NotificationCardRowView)) {
            ((NotificationCardRowView) view).Z_();
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f22695a;
    }

    public final ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo4216a(C3781e c3781e) {
        m20853a(c3781e.f18987a.f18997i, c3781e.f18987a.f18989a);
    }

    public final void mo4217b(C3781e c3781e) {
        m20853a(c3781e.f18987a.f18999k.f18986c, c3781e.f18987a.f18989a);
    }

    public final void mo4218c(C3781e c3781e) {
        m20853a(c3781e.f18987a.f19000l.f18986c, c3781e.f18987a.f18989a);
    }

    private final void m20853a(C3820u c3820u, String str) {
        PendingIntent a = this.f22698p.mo3770a(C3820u.m18262a(c3820u).m18269a("from_notification_center", true).m18265a(), str.hashCode(), this.i);
        if (a == null) {
            FinskyLog.m21669e("Failed to generate pending intent for data '%s', notification %s", r0, str);
            return;
        }
        try {
            a.send();
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to send notification card pending intent for data '%s', notification %s", r0, str);
        }
    }

    public final void mo2834a(List list) {
        int i = 0;
        this.f22696b = list;
        if (this.f22697o.dj().mo2294a(12641819)) {
            List asList = Arrays.asList(this.g.f14908a.bb().f12458a);
            for (int i2 = 0; i2 < asList.size(); i2++) {
                this.f22696b.add(this.f22699q.mo3760a((gf) asList.get(i2)));
            }
        }
        Collections.sort(this.f22696b, C4463c.f22702a);
        this.f22696b.subList(this.f22696b.size() - Math.max(this.f22696b.size() - ((Integer) C0955b.jF.m28964b()).intValue(), 0), this.f22696b.size()).clear();
        if (((C4464d) this.D).f22703a != null) {
            for (int i3 = 0; i3 < this.f22696b.size(); i3++) {
                C3781e c3781e = (C3781e) this.f22696b.get(i3);
                if (((C4464d) this.D).f22703a.contains(new C3823y(c3781e.f18987a.f18989a, c3781e.f18987a.f18990b))) {
                    this.f22696b.set(i3, C3781e.m18029a(c3781e).m18032a(0).m18031a());
                }
            }
        }
        this.C.mo4086a(this, 0, this.f22696b.size());
        List arrayList = new ArrayList(this.f22696b.size());
        while (i < this.f22696b.size()) {
            arrayList.add(new C3823y(((C3781e) this.f22696b.get(i)).f18987a.f18989a, ((C3781e) this.f22696b.get(i)).f18987a.f18990b));
            i++;
        }
        this.f22701s.mo3797a(arrayList);
        this.h.mo1219a(this);
    }

    private final boolean m20854b() {
        return this.f22697o.dj().mo2294a(12644768);
    }

    public final /* synthetic */ C4255t mo4062s() {
        ((C4464d) this.D).f22703a = new HashSet();
        for (int i = 0; i < this.f22696b.size(); i++) {
            C3781e c3781e = (C3781e) this.f22696b.get(i);
            if (c3781e.f18987a.f18996h == 0) {
                ((C4464d) this.D).f22703a.add(new C3823y(c3781e.f18987a.f18989a, c3781e.f18987a.f18990b));
            }
        }
        return (C4464d) super.mo4062s();
    }

    public final /* synthetic */ void mo4052a(C4255t c4255t) {
        super.mo4052a((C4255t) (C4464d) c4255t);
    }
}
