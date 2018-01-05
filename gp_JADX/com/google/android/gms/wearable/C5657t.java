package com.google.android.gms.wearable;

import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C5159n;
import com.google.android.gms.wearable.internal.ar;
import com.google.android.gms.wearable.internal.bw;
import com.google.android.gms.wearable.internal.zzai;
import com.google.android.gms.wearable.internal.zzaq;
import com.google.android.gms.wearable.internal.zzfc;
import com.google.android.gms.wearable.internal.zzfn;
import com.google.android.gms.wearable.internal.zzl;
import com.google.android.gms.wearable.internal.zzt;
import java.util.List;

final class C5657t extends ar {
    public volatile int f28716a = -1;
    public final /* synthetic */ C4779q f28717b;

    C5657t(C4779q c4779q) {
        this.f28717b = c4779q;
    }

    public final void mo5094a(DataHolder dataHolder) {
        Runnable c5662y = new C5662y(this, dataHolder);
        try {
            String valueOf = String.valueOf(dataHolder);
            if (!m26841a(c5662y, "onDataItemChanged", new StringBuilder(String.valueOf(valueOf).length() + 18).append(valueOf).append(", rows=").append(dataHolder.f25956h).toString())) {
            }
        } finally {
            dataHolder.close();
        }
    }

    public final void mo5095a(zzai com_google_android_gms_wearable_internal_zzai) {
        m26841a(new ad(), "onConnectedCapabilityChanged", com_google_android_gms_wearable_internal_zzai);
    }

    public final void mo5096a(zzaq com_google_android_gms_wearable_internal_zzaq) {
        m26841a(new ag(com_google_android_gms_wearable_internal_zzaq), "onChannelEvent", com_google_android_gms_wearable_internal_zzaq);
    }

    public final void mo5097a(zzfc com_google_android_gms_wearable_internal_zzfc) {
        m26841a(new C5663z(this, com_google_android_gms_wearable_internal_zzfc), "onMessageReceived", com_google_android_gms_wearable_internal_zzfc);
    }

    public final void mo5098a(zzfn com_google_android_gms_wearable_internal_zzfn) {
        m26841a(new aa(), "onPeerConnected", com_google_android_gms_wearable_internal_zzfn);
    }

    public final void mo5099a(zzl com_google_android_gms_wearable_internal_zzl) {
        m26841a(new af(), "onEntityUpdate", com_google_android_gms_wearable_internal_zzl);
    }

    public final void mo5100a(zzt com_google_android_gms_wearable_internal_zzt) {
        m26841a(new ae(), "onNotificationReceived", com_google_android_gms_wearable_internal_zzt);
    }

    public final void mo5101a(List list) {
        m26841a(new ac(), "onConnectedNodes", list);
    }

    public final void mo5102b(zzfn com_google_android_gms_wearable_internal_zzfn) {
        m26841a(new ab(), "onPeerDisconnected", com_google_android_gms_wearable_internal_zzfn);
    }

    private final boolean m26841a(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", new Object[]{str, this.f28717b.f24747a.toString(), obj}));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f28716a) {
            callingUid = 1;
        } else if (bw.m26784a(this.f28717b).m26789a("com.google.android.wearable.app.cn") && C5159n.m23896a(this.f28717b, callingUid, "com.google.android.wearable.app.cn")) {
            this.f28716a = callingUid;
            callingUid = 1;
        } else if (C5159n.m23895a(this.f28717b, callingUid)) {
            this.f28716a = callingUid;
            callingUid = 1;
        } else {
            Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
            boolean z = false;
        }
        if (callingUid == 0) {
            return false;
        }
        synchronized (this.f28717b.f24752f) {
            if (this.f28717b.f24753g) {
                return false;
            }
            this.f28717b.f24748b.post(runnable);
            return true;
        }
    }
}
