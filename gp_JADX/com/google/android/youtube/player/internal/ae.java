package com.google.android.youtube.player.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.C6824e;
import com.google.android.youtube.player.C6826g;
import com.google.android.youtube.player.C6828i;
import com.google.android.youtube.player.C6856j;
import com.google.android.youtube.player.C6857k;

public final class ae implements C6824e {
    public C6840d f33841a;
    public C6841g f33842b;

    public ae(C6840d c6840d, C6841g c6841g) {
        this.f33841a = (C6840d) C6838b.m31128a((Object) c6840d, (Object) "connectionClient cannot be null");
        this.f33842b = (C6841g) C6838b.m31128a((Object) c6841g, (Object) "embeddedPlayer cannot be null");
    }

    public final void mo5675a() {
        try {
            this.f33842b.mo5702a();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5676a(int i) {
        try {
            this.f33842b.mo5703a(i);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5677a(C6826g c6826g) {
        try {
            this.f33842b.mo5705a(new af(c6826g));
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5678a(C6828i c6828i) {
        try {
            this.f33842b.mo5706a(new ah(c6828i));
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5679a(C6856j c6856j) {
        try {
            this.f33842b.mo5707a(new ag(c6856j));
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5680a(C6857k c6857k) {
        try {
            this.f33842b.mo5714b(c6857k.name());
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final boolean m31076a(int i, KeyEvent keyEvent) {
        try {
            return this.f33842b.mo5710a(i, keyEvent);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final boolean m31077a(Bundle bundle) {
        try {
            return this.f33842b.mo5711a(bundle);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5682b() {
        try {
            this.f33842b.mo5712b();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5683b(int i) {
        try {
            this.f33842b.mo5713b(i);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final boolean m31080b(int i, KeyEvent keyEvent) {
        try {
            return this.f33842b.mo5716b(i, keyEvent);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final int mo5684c() {
        try {
            return this.f33842b.mo5717c();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final int mo5685d() {
        try {
            return this.f33842b.mo5718d();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5686e() {
        try {
            this.f33842b.mo5719e();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5687f() {
        try {
            this.f33842b.mo5720f();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final View m31085g() {
        try {
            return (View) ao.m31117a(this.f33842b.mo5728n());
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final Bundle m31086h() {
        try {
            return this.f33842b.mo5727m();
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }

    public final void mo5681a(String str) {
        try {
            this.f33842b.mo5708a(str);
        } catch (RemoteException e) {
            throw new C6845q(e);
        }
    }
}
