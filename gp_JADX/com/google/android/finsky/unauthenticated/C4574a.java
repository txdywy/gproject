package com.google.android.finsky.unauthenticated;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C4574a extends Fragment implements OnMenuItemClickListener, ah {
    public C1463g f23383a;
    public C2471a f23384b;
    public Handler f23385c;
    public long f23386d = C2482j.m13315j();
    public C2495w f23387e;
    public ce f23388f;
    public ImageView f23389g;

    public static C4574a m21211a(C2495w c2495w) {
        Fragment c4574a = new C4574a();
        Bundle bundle = new Bundle();
        c2495w.m13377a(bundle);
        c4574a.m600f(bundle);
        return c4574a;
    }

    public final void mo1292a(Activity activity) {
        ((C1447e) C3947d.m18649a(C1447e.class)).mo1965a(this);
        this.f23385c = new Handler(activity.getMainLooper());
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f23388f = C2482j.m13283a(30);
        if (bundle == null) {
            this.f23387e = this.f23384b.m13179a(this.f760q);
        } else {
            this.f23387e = this.f23384b.m13179a(bundle);
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.unauthenticated_home_fragment, viewGroup, false);
        this.f23389g = (ImageView) inflate.findViewById(C7582R.id.unauth_home_overflow);
        View findViewById = inflate.findViewById(C7582R.id.unauth_home_sign_in_view);
        TextView textView = (TextView) findViewById.findViewById(C7582R.id.unauth_home_sign_in_message);
        Button button = (Button) findViewById.findViewById(C7582R.id.unauth_home_sign_in_button);
        ImageView imageView = this.f23389g;
        imageView.setOnClickListener(new C4576c(this, imageView));
        imageView.setVisibility(0);
        textView.setText(m605i().getString(C7582R.string.unauth_sign_in_message_text));
        button.setText(m605i().getString(C7582R.string.unauth_sign_in_button_text).toUpperCase());
        button.setTextColor(m605i().getColor(C7582R.color.play_white));
        button.setBackgroundColor(m605i().getColor(C7582R.color.play_apps_primary));
        button.setOnClickListener(new C4577d(this));
        return inflate;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        this.f23387e.m13377a(bundle);
    }

    public final void mo979u() {
        super.mo979u();
        C2482j.m13305c(this);
        this.f23387e.m13373a(new C2488p().m13341a(this.f23386d).m13342a((ad) this).m13344a(), null);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = 0;
        if (menuItem.getItemId() != C7582R.id.auto_update_option) {
            return false;
        }
        int i2;
        boolean isChecked = menuItem.isChecked();
        boolean z = !isChecked;
        C0954a.f5854x.m5763a(Boolean.valueOf(z));
        menuItem.setChecked(z);
        this.f23389g.setImageResource(C7582R.drawable.play_overflow_menu);
        C2495w c2495w = this.f23387e;
        C2474c c2474c = new C2474c(423);
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C2474c b = c2474c.m13243b(Integer.valueOf(i2));
        if (isChecked) {
            i = 1;
        }
        c2495w.m13367a(b.m13235a(Integer.valueOf(i)));
        return true;
    }

    public final ad getParentNode() {
        return null;
    }

    public final C2495w mo1224n() {
        return this.f23387e;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f23385c, this.f23386d, this, adVar, this.f23387e);
    }

    public final void o_() {
        this.f23386d = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f23385c, this.f23386d, (ah) this, this.f23387e);
    }

    public final ce getPlayStoreUiElement() {
        return this.f23388f;
    }
}
