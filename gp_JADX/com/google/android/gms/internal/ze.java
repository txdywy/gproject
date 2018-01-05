package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.dynamic.C5165e;

@C5302b
public final class ze extends C5165e {
    public ze() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zf m26018a(Activity activity) {
        try {
            IBinder a = ((zh) m23908a((Context) activity)).mo4965a(C5164d.m23906a((Object) activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zf ? (zf) queryLocalInterface : new zg(a);
        } catch (Throwable e) {
            ap.m24194c("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            ap.m24194c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zh ? (zh) queryLocalInterface : new zi(iBinder);
    }
}
