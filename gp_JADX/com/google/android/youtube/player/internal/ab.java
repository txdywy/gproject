package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.youtube.player.C6821b;
import java.util.ArrayList;

public final class ab extends aa {
    public final C6821b f33836b;
    public final IBinder f33837c;
    public final /* synthetic */ C6850x f33838d;

    public ab(C6850x c6850x, String str, IBinder iBinder) {
        this.f33838d = c6850x;
        super(c6850x, Boolean.valueOf(true));
        this.f33836b = C6850x.m31195a(str);
        this.f33837c = iBinder;
    }

    protected final /* synthetic */ void mo5673a(Object obj) {
        boolean z = true;
        if (((Boolean) obj) != null) {
            switch (C6854y.f33879a[this.f33836b.ordinal()]) {
                case 1:
                    try {
                        if (this.f33838d.mo5738b().equals(this.f33837c.getInterfaceDescriptor())) {
                            this.f33838d.f33867g = this.f33838d.mo5735a(this.f33837c);
                            if (this.f33838d.f33867g != null) {
                                C6850x c6850x = this.f33838d;
                                synchronized (c6850x.f33868h) {
                                    C6838b.m31130a(!c6850x.f33870j);
                                    c6850x.f33866f.removeMessages(4);
                                    c6850x.f33870j = true;
                                    if (c6850x.f33869i.size() != 0) {
                                        z = false;
                                    }
                                    C6838b.m31130a(z);
                                    ArrayList arrayList = c6850x.f33868h;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size && c6850x.f33874n && c6850x.m31203f(); i++) {
                                        if (!c6850x.f33869i.contains(arrayList.get(i))) {
                                            ((aj) arrayList.get(i)).mo5741a();
                                        }
                                    }
                                    c6850x.f33869i.clear();
                                    c6850x.f33870j = false;
                                }
                                return;
                            }
                        }
                    } catch (RemoteException e) {
                    }
                    this.f33838d.m31204g();
                    this.f33838d.m31197a(C6821b.INTERNAL_ERROR);
                    return;
                default:
                    this.f33838d.m31197a(this.f33836b);
                    return;
            }
        }
    }
}
