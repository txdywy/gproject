package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class ConnectionResult extends zza {
    public static final Creator CREATOR = new C5136j();
    public static final ConnectionResult f25609a = new ConnectionResult(0);
    public int f25610b;
    public final int f25611c;
    public final PendingIntent f25612d;
    public final String f25613e;

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f25610b = i;
        this.f25611c = i2;
        this.f25612d = pendingIntent;
        this.f25613e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    static String m23262a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public final boolean m23263a() {
        return (this.f25611c == 0 || this.f25612d == null) ? false : true;
    }

    public final boolean m23264b() {
        return this.f25611c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f25611c == connectionResult.f25611c && ad.m23722a(this.f25612d, connectionResult.f25612d) && ad.m23722a(this.f25613e, connectionResult.f25613e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25611c), this.f25612d, this.f25613e});
    }

    public final String toString() {
        return ad.m23721a(this).m23723a("statusCode", m23262a(this.f25611c)).m23723a("resolution", this.f25612d).m23723a("message", this.f25613e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25610b);
        C5130b.m23854b(parcel, 2, this.f25611c);
        C5130b.m23842a(parcel, 3, this.f25612d, i);
        C5130b.m23844a(parcel, 4, this.f25613e);
        C5130b.m23853b(parcel, a);
    }
}
