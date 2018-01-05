package com.google.android.youtube.player;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.youtube.player.internal.C6829a;
import com.google.android.youtube.player.internal.C6845q;
import com.google.android.youtube.player.internal.C6849u;
import com.google.android.youtube.player.internal.ae;
import com.google.android.youtube.player.internal.aj;
import com.google.android.youtube.player.internal.aq;

final class C6862o implements aj {
    public final /* synthetic */ Activity f33899a;
    public final /* synthetic */ C6861n f33900b;

    C6862o(C6861n c6861n, Activity activity) {
        this.f33900b = c6861n;
        this.f33899a = activity;
    }

    public final void mo5741a() {
        if (this.f33900b.f33891d != null) {
            C6861n c6861n = this.f33900b;
            try {
                c6861n.f33892e = new ae(c6861n.f33891d, C6829a.f33834a.mo5701a(this.f33899a, c6861n.f33891d, c6861n.f33897j));
                c6861n.f33893f = c6861n.f33892e.m31085g();
                c6861n.addView(c6861n.f33893f);
                c6861n.removeView(c6861n.f33894g);
                c6861n.f33890c.mo5740a();
                if (c6861n.f33896i != null) {
                    if (c6861n.f33895h != null) {
                        c6861n.f33892e.m31077a(c6861n.f33895h);
                        c6861n.f33895h = null;
                    }
                    c6861n.f33896i.m31059a(c6861n.f33892e);
                    c6861n.f33896i = null;
                }
            } catch (Throwable e) {
                aq.m31119a("Error creating YouTubePlayerView", e);
                c6861n.m31231a(C6821b.INTERNAL_ERROR);
            }
        }
        this.f33900b.f33891d = null;
    }

    public final void mo5742b() {
        if (!(this.f33900b.f33898k || this.f33900b.f33892e == null)) {
            try {
                this.f33900b.f33892e.f33842b.mo5726l();
            } catch (RemoteException e) {
                throw new C6845q(e);
            }
        }
        C6849u c6849u = this.f33900b.f33894g;
        c6849u.f33863a.setVisibility(8);
        c6849u.f33864b.setVisibility(8);
        if (this.f33900b.indexOfChild(this.f33900b.f33894g) < 0) {
            this.f33900b.addView(this.f33900b.f33894g);
            this.f33900b.removeView(this.f33900b.f33893f);
        }
        this.f33900b.f33893f = null;
        this.f33900b.f33892e = null;
        this.f33900b.f33891d = null;
    }
}
