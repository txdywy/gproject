package com.google.android.finsky.billing.addresschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.view.MenuItem;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.layout.actionbar.C3658a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.i;
import com.squareup.leakcanary.C7582R;

public class AddressChallengeActivity extends C1036b implements C1701d {
    public final C3748a f8753G = C1473m.f7980a.mo2252k().mo3728c(this);
    public C1733c f8754H;
    public final C2471a f8755t = C1473m.f7980a.aR();

    public static Intent m9491a(int i, i iVar, Bundle bundle, C2495w c2495w) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, AddressChallengeActivity.class);
        intent.putExtra("backend", i);
        intent.putExtra("challenge", ParcelableProto.m21671a((C0757i) iVar));
        intent.putExtra("extra_parameters", bundle);
        c2495w.m13365a().m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.billing_challenge_frame);
        C3658a c3658a = new C3658a(this.f8753G, this);
        c3658a.m17381a(getIntent().getIntExtra("backend", 0), false);
        c3658a.m17387a(false, -1);
        this.f8754H = new C1733c(this, (i) ParcelableProto.m21672a(getIntent(), "challenge"), getIntent().getBundleExtra("extra_parameters"), this.f8755t.m13180a(bundle, getIntent()));
        if (bundle != null) {
            C1733c c1733c = this.f8754H;
            if (bundle.containsKey("address_widget")) {
                c1733c.f9027h = (C1734e) c1733c.f9021b.mo2400a(bundle, "address_widget");
                if (c1733c.f9027h != null) {
                    c1733c.f9027h.f9031d = c1733c;
                }
            }
            c1733c.f9026g = c1733c.f9020a.m13182a(bundle, c1733c.f9026g);
            return;
        }
        C1733c c1733c2 = this.f8754H;
        String string = c1733c2.f9023d.getString("authAccount");
        C0757i c0757i = c1733c2.f9022c;
        Bundle bundle2 = c1733c2.f9023d.getBundle("AddressChallengeFlow.previousState");
        C2495w c2495w = c1733c2.f9026g;
        Fragment c1734e = new C1734e();
        Bundle bundle3 = new Bundle();
        bundle3.putString("authAccount", string);
        bundle3.putParcelable("address_challenge", ParcelableProto.m21671a(c0757i));
        c2495w.m13380b(string).m13377a(bundle3);
        c1734e.m600f(bundle3);
        c1734e.f9030c = bundle2;
        c1733c2.f9027h = c1734e;
        c1733c2.f9027h.f9031d = c1733c2;
        c1733c2.f9021b.mo2403b(c1733c2.f9027h);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f8754H != null) {
            C1733c c1733c = this.f8754H;
            if (c1733c.f9027h != null) {
                c1733c.f9021b.mo2401a(bundle, "address_widget", c1733c.f9027h);
            }
            c1733c.f9026g.m13377a(bundle);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f8753G.mo3695b(this.f8755t.m13184a(null), true);
        return true;
    }

    public final void mo2403b(Fragment fragment) {
        aw a = H_().mo284a();
        a.mo325a((int) C7582R.id.content_frame, fragment);
        a.mo336d();
    }

    public final void mo2401a(Bundle bundle, String str, Fragment fragment) {
        H_().mo285a(bundle, str, fragment);
    }

    public final Fragment mo2400a(Bundle bundle, String str) {
        return H_().mo282a(bundle, str);
    }

    public final void mo2402a(boolean z, Bundle bundle) {
        if (z) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("challenge_response", bundle);
        setResult(-1, intent);
        finish();
    }

    public final void mo1276k() {
        setResult(0);
        finish();
    }
}
