package com.google.android.finsky.unauthenticated;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.p013b.p014a.C0259a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.HashSet;

public final class C4579g extends Fragment implements ah {
    public static final HashSet f23395a = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(0)}));
    public static final HashSet f23396b = new HashSet(Arrays.asList(new String[]{"auto_update", "daily_hygiene", "wifi_checker"}));
    public C2495w af;
    public TextView ag;
    public ce ah;
    public final C1003o f23397c = new C4581i(this);
    public C3340g f23398d;
    public C2471a f23399e;
    public C4573n f23400f;
    public C0978f f23401g;
    public Handler f23402h;
    public long f23403i = C2482j.m13315j();

    public final void mo1292a(Activity activity) {
        ((C1447e) C3947d.m18649a(C1447e.class)).mo1966a(this);
        super.mo1292a(activity);
        this.f23402h = new Handler(activity.getMainLooper());
        this.f23400f = (C4573n) m603h();
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.ah = C2482j.m13283a(31);
        if (bundle == null) {
            this.af = this.f23399e.m13179a(this.f760q);
        } else {
            this.af = this.f23399e.m13179a(bundle);
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.unauthenticated_updates_cancellation_fragment, viewGroup, false);
        this.ag = (TextView) inflate.findViewById(C7582R.id.unauth_cancellation_update_progress_text);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C7582R.id.unauth_cancellation_update_progress_bar);
        Button button = (Button) inflate.findViewById(C7582R.id.positive_button);
        Button button2 = (Button) inflate.findViewById(C7582R.id.negative_button);
        button.setText(m605i().getString(C7582R.string.unauth_updates_cancellation_next_button_text).toUpperCase());
        button.setEnabled(true);
        button.setOnClickListener(new C4582j(this));
        button2.setText(m605i().getString(C7582R.string.unauth_updates_cancellation_cancel_button_text).toUpperCase());
        button2.setEnabled(true);
        button2.setOnClickListener(new C4583k(this, button2, button));
        progressBar.setScaleY(3.0f);
        C0259a.m1514a(progressBar.getProgressDrawable(), m605i().getColor(C7582R.color.play_apps_primary));
        m21223a(this.ag);
        return inflate;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        this.af.m13377a(bundle);
    }

    public final void mo979u() {
        super.mo979u();
        C2482j.m13305c(this);
        this.af.m13373a(new C2488p().m13341a(this.f23403i).m13342a((ad) this).m13344a(), null);
        this.f23398d.mo3481a(this.f23397c);
    }

    public final void mo980v() {
        this.f23398d.mo3484b(this.f23397c);
        super.mo980v();
    }

    final void m21223a(TextView textView) {
        this.f23398d.mo3479a(new C3363f().m16804b(f23395a).m16802a(f23396b).m16800a()).mo4398a(new C4580h(this, textView));
    }

    public final ad getParentNode() {
        return null;
    }

    public final C2495w mo1224n() {
        return this.af;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f23402h, this.f23403i, this, adVar, this.af);
    }

    public final void o_() {
        this.f23403i = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f23402h, this.f23403i, (ah) this, this.af);
    }

    public final ce getPlayStoreUiElement() {
        return this.ah;
    }
}
