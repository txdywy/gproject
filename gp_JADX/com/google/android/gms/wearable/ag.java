package com.google.android.gms.wearable;

import android.util.Log;
import com.google.android.gms.wearable.internal.zzaq;

final class ag implements Runnable {
    public /* synthetic */ zzaq f28572a;

    ag(zzaq com_google_android_gms_wearable_internal_zzaq) {
        this.f28572a = com_google_android_gms_wearable_internal_zzaq;
    }

    public final void run() {
        zzaq com_google_android_gms_wearable_internal_zzaq = this.f28572a;
        switch (com_google_android_gms_wearable_internal_zzaq.f28630b) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            default:
                Log.w("ChannelEventParcelable", "Unknown type: " + com_google_android_gms_wearable_internal_zzaq.f28630b);
                return;
        }
    }
}
