package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzaq extends zza {
    public static final Creator CREATOR = new C5627d();
    public zzas f28629a;
    public int f28630b;
    public int f28631c;
    public int f28632d;

    public zzaq(zzas com_google_android_gms_wearable_internal_zzas, int i, int i2, int i3) {
        this.f28629a = com_google_android_gms_wearable_internal_zzas;
        this.f28630b = i;
        this.f28631c = i2;
        this.f28632d = i3;
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f28629a);
        int i = this.f28630b;
        switch (i) {
            case 1:
                str = "CHANNEL_OPENED";
                break;
            case 2:
                str = "CHANNEL_CLOSED";
                break;
            case 3:
                str = "INPUT_CLOSED";
                break;
            case 4:
                str = "OUTPUT_CLOSED";
                break;
            default:
                str = Integer.toString(i);
                break;
        }
        int i2 = this.f28631c;
        switch (i2) {
            case 0:
                str2 = "CLOSE_REASON_NORMAL";
                break;
            case 1:
                str2 = "CLOSE_REASON_DISCONNECTED";
                break;
            case 2:
                str2 = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case 3:
                str2 = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                str2 = Integer.toString(i2);
                break;
        }
        return new StringBuilder(((String.valueOf(valueOf).length() + 81) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("ChannelEventParcelable[, channel=").append(valueOf).append(", type=").append(str).append(", closeReason=").append(str2).append(", appErrorCode=").append(this.f28632d).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f28629a, i);
        C5130b.m23854b(parcel, 3, this.f28630b);
        C5130b.m23854b(parcel, 4, this.f28631c);
        C5130b.m23854b(parcel, 5, this.f28632d);
        C5130b.m23853b(parcel, a);
    }
}
