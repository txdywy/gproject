package com.google.android.finsky.at;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.wallet.ui.common.a;

public class C1128e extends C0141p {
    public C2471a ah;
    public C2495w ai;
    public ad aj;
    public boolean ak = false;
    public C1516l al = null;

    public Dialog mo143a(Bundle bundle) {
        ((C1343a) C3947d.m18649a(C1343a.class)).mo1709a(this);
        Bundle bundle2 = this.f760q;
        this.ai = this.ah.m13179a(bundle2);
        this.aj = null;
        if (bundle2.containsKey("impression_type")) {
            this.aj = new C2473o(bundle2.getInt("impression_type"), bundle2.getByteArray("impression_cookie"), null);
        }
        if (bundle == null && this.aj != null) {
            this.ai.m13370a(new C2488p().m13345b(this.aj));
        }
        a aVar = new a(m603h());
        if (bundle2.containsKey("title")) {
            aVar.a(bundle2.getString("title"));
        } else if (bundle2.containsKey("title_id")) {
            aVar.a(bundle2.getInt("title_id"));
        }
        if (bundle2.containsKey("icon_id")) {
            int i = bundle2.getInt("icon_id");
            if (aVar.b != null) {
                aVar.b.setIcon(i);
            } else {
                aVar.a.f2507a.f2469c = i;
            }
        }
        if (bundle2.containsKey("message_id")) {
            aVar.b(bundle2.getInt("message_id"));
        } else if (bundle2.containsKey("message")) {
            aVar.b(bundle2.getString("message"));
        } else if (bundle2.containsKey("messageHtml")) {
            aVar.b(Html.fromHtml(bundle2.getString("messageHtml")));
        } else if (bundle2.containsKey("messageCharSeq")) {
            aVar.b(bundle2.getCharSequence("messageCharSeq"));
        }
        if (bundle2.containsKey("positive_id")) {
            aVar.a(bundle2.getInt("positive_id"), new C1511f(this));
        } else if (bundle2.containsKey("positive_label")) {
            aVar.a(bundle2.getString("positive_label"), new C1512g(this));
        }
        if (bundle2.containsKey("negative_id")) {
            aVar.b(bundle2.getInt("negative_id"), new C1513h(this));
        } else if (bundle2.containsKey("negative_label")) {
            aVar.b(bundle2.getString("negative_label"), new C1514i(this));
        }
        if (bundle2.containsKey("force_inverse_background")) {
            boolean z = bundle2.getBoolean("force_inverse_background");
            if (aVar.b != null) {
                aVar.b.setInverseBackgroundForced(z);
            } else if (aVar.a == null) {
                throw null;
            }
        }
        if (bundle2.containsKey("layoutId")) {
            View inflate = LayoutInflater.from(m603h()).inflate(bundle2.getInt("layoutId"), null);
            aVar.a(inflate);
            if (inflate instanceof C1516l) {
                this.al = (C1516l) inflate;
                if (bundle2.containsKey("config_arguments")) {
                    this.al.mo3298a(bundle2.getBundle("config_arguments"));
                }
            }
        }
        Dialog a = aVar.a();
        if (!bundle2.containsKey("layoutId")) {
            a.setOnShowListener(new C1515j(a));
        }
        if (bundle2.containsKey("cancel_on_touch_outside")) {
            a.setCanceledOnTouchOutside(bundle2.getBoolean("cancel_on_touch_outside"));
        }
        return a;
    }

    protected final Bundle m6864X() {
        return this.f760q.getBundle("extra_arguments");
    }

    protected final int m6865Y() {
        return this.f760q.getInt("target_request_code");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.f760q.getBoolean("cancel_does_negative_action", true)) {
            aa();
        }
    }

    public final void m6866Z() {
        m626a(false);
        if (!this.ak) {
            this.ak = true;
            Bundle bundle = this.f760q;
            int Y = m6865Y();
            Bundle m = m6862m(m6864X());
            int i = bundle.getInt("click_event_type_positive", -1);
            if (i != -1) {
                this.ai.m13379b(new C2475d(this.aj).m13256a(i));
            }
            C0998m ac = ac();
            if (ac != null) {
                ac.mo1202a(Y, m);
            }
            ab();
        }
    }

    public final void aa() {
        m626a(false);
        if (!this.ak) {
            this.ak = true;
            Bundle bundle = this.f760q;
            int Y = m6865Y();
            Bundle m = m6862m(m6864X());
            int i = bundle.getInt("click_event_type_negative", -1);
            if (i != -1) {
                this.ai.m13379b(new C2475d(this.aj).m13256a(i));
            }
            C0998m ac = ac();
            if (ac != null) {
                ac.mo1211b(Y, m);
            }
            mo968W();
        }
    }

    private final Bundle m6862m(Bundle bundle) {
        if (this.al != null) {
            Bundle result = this.al.getResult();
            if (result != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putAll(result);
            }
        }
        return bundle;
    }

    public void ab() {
    }

    public void mo968W() {
    }

    protected final C0998m ac() {
        Fragment fragment = this.f761r;
        if (fragment instanceof C0998m) {
            return (C0998m) fragment;
        }
        C0254u h = m603h();
        if (h instanceof C0998m) {
            return (C0998m) h;
        }
        return null;
    }
}
