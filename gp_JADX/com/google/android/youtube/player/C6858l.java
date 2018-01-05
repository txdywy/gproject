package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.internal.C6829a;
import com.google.android.youtube.player.internal.C6838b;
import com.google.android.youtube.player.internal.C6845q;
import com.google.android.youtube.player.internal.C6849u;

public class C6858l extends Fragment {
    public String af;
    public C6827h ag;
    public boolean ah;
    public final C6860m f33885g = new C6860m();
    public Bundle f33886h;
    public C6861n f33887i;

    public View m31220a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33887i = new C6861n(h(), this.f33885g);
        m31219W();
        return this.f33887i;
    }

    public final void m31221a(String str, C6827h c6827h) {
        this.af = C6838b.m31129a(str, (Object) "Developer key cannot be null or empty");
        this.ag = c6827h;
        m31219W();
    }

    public final void m31222b(Bundle bundle) {
        super.b(bundle);
        this.f33886h = bundle != null ? bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE") : null;
    }

    public void m31223d() {
        this.f33887i.m31232a(h().isFinishing());
        this.f33887i = null;
        super.d();
    }

    private final void m31219W() {
        if (this.f33887i != null && this.ag != null) {
            C6861n c6861n = this.f33887i;
            boolean z = this.ah;
            if (!z || VERSION.SDK_INT >= 14) {
                c6861n.f33897j = z;
            } else {
                Log.w("YouTubeAndroidPlayerAPI", String.format("Could not enable TextureView because API level is lower than 14", new Object[0]));
                c6861n.f33897j = false;
            }
            C6861n c6861n2 = this.f33887i;
            Object h = h();
            String str = this.af;
            Object obj = this.ag;
            Bundle bundle = this.f33886h;
            if (c6861n2.f33892e == null && c6861n2.f33896i == null) {
                C6838b.m31128a(h, (Object) "activity cannot be null");
                C6838b.m31128a((Object) this, (Object) "provider cannot be null");
                c6861n2.f33896i = (C6827h) C6838b.m31128a(obj, (Object) "listener cannot be null");
                c6861n2.f33895h = bundle;
                C6849u c6849u = c6861n2.f33894g;
                c6849u.f33863a.setVisibility(0);
                c6849u.f33864b.setVisibility(8);
                c6861n2.f33891d = C6829a.f33834a.mo5700a(c6861n2.getContext(), str, new C6862o(c6861n2, h), new C6863p(c6861n2));
                c6861n2.f33891d.mo5733e();
            }
            this.f33886h = null;
            this.ag = null;
        }
    }

    public final void g_() {
        super.g_();
        C6861n c6861n = this.f33887i;
        if (c6861n.f33892e != null) {
            try {
                c6861n.f33892e.f33842b.mo5722h();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
    }

    public final void m31225u() {
        super.u();
        C6861n c6861n = this.f33887i;
        if (c6861n.f33892e != null) {
            try {
                c6861n.f33892e.f33842b.mo5723i();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
    }

    public final void m31226v() {
        C6861n c6861n = this.f33887i;
        if (c6861n.f33892e != null) {
            try {
                c6861n.f33892e.f33842b.mo5724j();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
        super.v();
    }

    public void m31224e(Bundle bundle) {
        Bundle h;
        super.e(bundle);
        if (this.f33887i != null) {
            C6861n c6861n = this.f33887i;
            h = c6861n.f33892e == null ? c6861n.f33895h : c6861n.f33892e.m31086h();
        } else {
            h = this.f33886h;
        }
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", h);
    }

    public final void h_() {
        C6861n c6861n = this.f33887i;
        if (c6861n.f33892e != null) {
            try {
                c6861n.f33892e.f33842b.mo5725k();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
        super.h_();
    }

    public final void m31227w() {
        if (this.f33887i != null) {
            Activity h = h();
            C6861n c6861n = this.f33887i;
            boolean z = h == null || h.isFinishing();
            if (c6861n.f33892e != null) {
                try {
                    c6861n.f33892e.f33842b.mo5715b(z);
                    c6861n.m31232a(z);
                } catch (RemoteException e) {
                    throw new C6845q(e);
                }
            }
        }
        super.w();
    }
}
