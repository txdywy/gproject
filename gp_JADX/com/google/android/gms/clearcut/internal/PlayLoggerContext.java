package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class PlayLoggerContext extends zza {
    public static final Creator CREATOR = new C5036n();
    public final String f25576a;
    public final int f25577b;
    public final int f25578c;
    public final String f25579d;
    public final String f25580e;
    public final boolean f25581f;
    public final String f25582g;
    public final boolean f25583h;
    public final int f25584i;

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.f25576a = (String) am.m23733a((Object) str);
        this.f25577b = i;
        this.f25578c = i2;
        this.f25582g = str2;
        this.f25579d = str3;
        this.f25580e = str4;
        this.f25581f = !z;
        this.f25583h = z;
        this.f25584i = i3;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f25576a = str;
        this.f25577b = i;
        this.f25578c = i2;
        this.f25579d = str2;
        this.f25580e = str3;
        this.f25581f = z;
        this.f25582g = str4;
        this.f25583h = z2;
        this.f25584i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return ad.m23722a(this.f25576a, playLoggerContext.f25576a) && this.f25577b == playLoggerContext.f25577b && this.f25578c == playLoggerContext.f25578c && ad.m23722a(this.f25582g, playLoggerContext.f25582g) && ad.m23722a(this.f25579d, playLoggerContext.f25579d) && ad.m23722a(this.f25580e, playLoggerContext.f25580e) && this.f25581f == playLoggerContext.f25581f && this.f25583h == playLoggerContext.f25583h && this.f25584i == playLoggerContext.f25584i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25576a, Integer.valueOf(this.f25577b), Integer.valueOf(this.f25578c), this.f25582g, this.f25579d, this.f25580e, Boolean.valueOf(this.f25581f), Boolean.valueOf(this.f25583h), Integer.valueOf(this.f25584i)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("package=").append(this.f25576a).append(',');
        stringBuilder.append("packageVersionCode=").append(this.f25577b).append(',');
        stringBuilder.append("logSource=").append(this.f25578c).append(',');
        stringBuilder.append("logSourceName=").append(this.f25582g).append(',');
        stringBuilder.append("uploadAccount=").append(this.f25579d).append(',');
        stringBuilder.append("loggingId=").append(this.f25580e).append(',');
        stringBuilder.append("logAndroidId=").append(this.f25581f).append(',');
        stringBuilder.append("isAnonymous=").append(this.f25583h).append(',');
        stringBuilder.append("qosTier=").append(this.f25584i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f25576a);
        C5130b.m23854b(parcel, 3, this.f25577b);
        C5130b.m23854b(parcel, 4, this.f25578c);
        C5130b.m23844a(parcel, 5, this.f25579d);
        C5130b.m23844a(parcel, 6, this.f25580e);
        C5130b.m23846a(parcel, 7, this.f25581f);
        C5130b.m23844a(parcel, 8, this.f25582g);
        C5130b.m23846a(parcel, 9, this.f25583h);
        C5130b.m23854b(parcel, 10, this.f25584i);
        C5130b.m23853b(parcel, a);
    }
}
