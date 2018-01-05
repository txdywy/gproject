package com.google.android.finsky.billing;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.m;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.c;
import com.google.wireless.android.finsky.dfe.nano.d;
import com.google.wireless.android.finsky.dfe.nano.g;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.o;
import com.google.wireless.android.finsky.dfe.nano.q;
import com.google.wireless.android.finsky.dfe.nano.r;
import com.squareup.leakcanary.C7582R;

public abstract class C1925w extends C1076h implements m {
    public final Runnable f9849a = new C2102x(this);
    public TextView af;
    public int ag = -1;
    public boolean ah;
    public final Handler f9850b = new Handler();
    public final C2492t f9851c = C1473m.f7980a.aP();
    public String f9852d;
    public String f9853e;
    public String f9854f;
    public l f9855g;
    public View f9856h;
    public TextView f9857i;

    public abstract void mo2540Y();

    public static int m10280a(k kVar) {
        if (kVar.c != null || kVar.d != null) {
            return C7582R.layout.message_only_success_step;
        }
        if (kVar.f != null) {
            return C7582R.layout.complex_success_step;
        }
        if (kVar.e != null) {
            return C7582R.layout.titled_success_step;
        }
        if (kVar.i != null) {
            return C7582R.layout.one_icon_message_success_step;
        }
        if (kVar.h != null) {
            return C7582R.layout.two_icon_messages_success_step;
        }
        return 0;
    }

    public static Bundle m10281a(k kVar, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Cannot create a SuccessStep with layoutId of 0.");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("SuccessStep.post_acquisition_prompt", ParcelableProto.m21671a((C0757i) kVar));
        bundle.putInt("SuccessStep.layout_id", i);
        return bundle;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle != null) {
            this.ah = bundle.getBoolean("SuccessStep.stepFragmentReadyLogged");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("SuccessStep.stepFragmentReadyLogged", this.ah);
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo970a(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.f760q;
        k kVar = (k) ParcelableProto.m21673a(bundle2, "SuccessStep.post_acquisition_prompt");
        this.f9856h = layoutInflater.inflate(bundle2.getInt("SuccessStep.layout_id"), viewGroup, false);
        if (kVar.c != null) {
            c cVar = kVar.c;
            String str = cVar.b;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Auto-dismiss template must have a message.");
            } else if (cVar.c <= 0) {
                throw new IllegalArgumentException(String.format("Invalid dismiss ms for auto-dismiss template: %d", new Object[]{Integer.valueOf(cVar.c)}));
            } else {
                this.f9857i = (TextView) this.f9856h.findViewById(C7582R.id.message);
                m10283a(str, (int) C7582R.id.message);
                this.f9852d = Html.fromHtml(str).toString();
                this.ag = cVar.c;
            }
        } else if (kVar.d != null) {
            o oVar = kVar.d;
            if (TextUtils.isEmpty(oVar.b)) {
                throw new IllegalArgumentException("Simple message template must have a message.");
            } else if (TextUtils.isEmpty(oVar.c)) {
                throw new IllegalArgumentException("Simple message template must have a button label.");
            } else {
                String str2 = oVar.b;
                this.f9857i = (TextView) this.f9856h.findViewById(C7582R.id.message);
                m10283a(str2, (int) C7582R.id.message);
                this.f9852d = Html.fromHtml(str2).toString();
                this.f9853e = oVar.c;
            }
        } else if (kVar.e != null) {
            q qVar = kVar.e;
            if (TextUtils.isEmpty(qVar.b)) {
                throw new IllegalArgumentException("Titled template must have a title.");
            } else if (TextUtils.isEmpty(qVar.c)) {
                throw new IllegalArgumentException("Titled template must have a message.");
            } else if (TextUtils.isEmpty(qVar.e)) {
                throw new IllegalArgumentException("Titled template must have a button label.");
            } else {
                this.f9857i = (TextView) this.f9856h.findViewById(C7582R.id.title);
                this.f9857i.setText(qVar.b);
                this.af = (TextView) this.f9856h.findViewById(C7582R.id.message);
                m10283a(qVar.c, (int) C7582R.id.message);
                this.f9852d = qVar.b;
                this.f9853e = qVar.e;
            }
        } else if (kVar.f != null) {
            d dVar = kVar.f;
            if (TextUtils.isEmpty(dVar.b)) {
                throw new IllegalArgumentException("Complex template must have a title.");
            } else if (TextUtils.isEmpty(dVar.g)) {
                throw new IllegalArgumentException("Complex template must have a button label.");
            } else {
                this.f9857i = (TextView) this.f9856h.findViewById(C7582R.id.title);
                this.f9857i.setText(dVar.b);
                if (!TextUtils.isEmpty(dVar.c)) {
                    ((TextView) this.f9856h.findViewById(C7582R.id.title_byline)).setText(dVar.c);
                }
                m10283a(dVar.d, (int) C7582R.id.message);
                if (dVar.e) {
                    this.f9856h.findViewById(C7582R.id.check_mark).setVisibility(0);
                }
                m10282a(dVar.f, (int) C7582R.id.thumbnail_image);
                this.f9852d = dVar.b;
                this.f9853e = dVar.g;
            }
        } else if (kVar.i != null) {
            g gVar = kVar.i;
            if (TextUtils.isEmpty(gVar.b)) {
                throw new IllegalArgumentException("One icon message template must have one title.");
            } else if (TextUtils.isEmpty(gVar.c)) {
                throw new IllegalArgumentException("One icon message template must have one subtitle.");
            } else if (gVar.d == null) {
                throw new IllegalArgumentException("One icon message template must have one icon message.");
            } else if (TextUtils.isEmpty(gVar.h)) {
                throw new IllegalArgumentException("One icon message template must have a button label.");
            } else {
                int i;
                ((TextView) this.f9856h.findViewById(C7582R.id.title)).setText(gVar.b);
                ((TextView) this.f9856h.findViewById(C7582R.id.subtitle)).setText(gVar.c);
                m10283a(gVar.d.d, (int) C7582R.id.message);
                m10282a(gVar.d.b, (int) C7582R.id.icon);
                View findViewById = this.f9856h.findViewById(C7582R.id.footer_html);
                if (!TextUtils.isEmpty(gVar.f)) {
                    m10283a(gVar.f, (int) C7582R.id.footer_html);
                    findViewById.setVisibility(0);
                }
                if ((gVar.a & 16) != 0) {
                    i = 1;
                } else {
                    boolean z = false;
                }
                if (i != 0) {
                    findViewById.setContentDescription(gVar.g);
                }
                this.f9852d = gVar.k;
                this.f9853e = gVar.h;
                this.f9854f = gVar.i;
                this.f9855g = gVar.j;
            }
        } else if (kVar.h != null) {
            mo2634a(kVar.h);
        }
        aa().an();
        return this.f9856h;
    }

    public final void g_() {
        super.g_();
        if (this.ag > 0) {
            this.f9850b.postDelayed(this.f9849a, (long) this.ag);
        }
    }

    public final void mo979u() {
        super.mo979u();
        if (this.f9852d == null) {
            throw new IllegalArgumentException("No text was specified for a11y announcements. Have you called SuccessStep.getLayoutResId()?");
        }
        C1601a.m9199a(this.f9856h.getContext(), this.f9852d, this.f9856h, false);
        if (!this.ah) {
            this.f9851c.m13358c(aa().am(), "purchase_fragment_success");
            this.ah = true;
        }
    }

    public final void mo1346w() {
        this.f9850b.removeCallbacks(this.f9849a);
        super.mo1346w();
    }

    public String mo1406a(Resources resources) {
        return this.f9853e;
    }

    public final String mo2536b(Resources resources) {
        return this.f9854f;
    }

    public void mo2634a(r rVar) {
        if (rVar.b == null) {
            throw new IllegalArgumentException("Two icon messages template must have at least one message.");
        } else if (TextUtils.isEmpty(rVar.e)) {
            throw new IllegalArgumentException("Two icon messages template must have a button label.");
        } else {
            String str = rVar.b.d;
            m10283a(str, (int) C7582R.id.message_1);
            m10282a(rVar.b.b, (int) C7582R.id.icon_1);
            if (rVar.c != null) {
                m10283a(rVar.c.d, (int) C7582R.id.message_2);
                m10282a(rVar.c.b, (int) C7582R.id.icon_2);
                this.f9856h.findViewById(C7582R.id.icon_message_2).setVisibility(0);
                UrlSpanUtils.a(((TextView) this.f9856h.findViewById(C7582R.id.message_2)).getText(), null, this);
            }
            if (!TextUtils.isEmpty(rVar.d)) {
                m10283a(rVar.d, (int) C7582R.id.footer_html);
                this.f9856h.findViewById(C7582R.id.footer_html).setVisibility(0);
            }
            this.f9852d = Html.fromHtml(str).toString();
            this.f9853e = rVar.e;
            this.f9854f = rVar.f;
            this.f9855g = rVar.g;
        }
    }

    private final void m10283a(String str, int i) {
        ae.m9217a((TextView) this.f9856h.findViewById(i), str);
    }

    private final void m10282a(bd bdVar, int i) {
        FifeImageView fifeImageView = (FifeImageView) this.f9856h.findViewById(i);
        if (bdVar != null) {
            C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
            fifeImageView.setVisibility(0);
        }
    }

    public final void m10287a(View view, String str) {
        Context context = view.getContext();
        Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.DEFAULT").setPackage(context.getPackageName()).setData(Uri.parse(str));
        if (context.getPackageManager().resolveActivity(data, 65536) == null) {
            data.setPackage(null);
        }
        m580a(data);
        aa().m6732h().finish();
    }
}
