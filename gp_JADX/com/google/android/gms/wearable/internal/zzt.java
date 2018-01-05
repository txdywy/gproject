package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzt extends zza {
    public static final Creator CREATOR = new ca();
    public int f28694a;
    public final String f28695b;
    public final String f28696c;
    public final String f28697d;
    public final String f28698e;
    public final String f28699f;
    public final String f28700g;
    public final byte f28701h;
    public final byte f28702i;
    public final byte f28703j;
    public final byte f28704k;
    public final String f28705l;

    public zzt(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f28694a = i;
        this.f28695b = str;
        this.f28696c = str2;
        this.f28697d = str3;
        this.f28698e = str4;
        this.f28699f = str5;
        this.f28700g = str6;
        this.f28701h = b;
        this.f28702i = b2;
        this.f28703j = b3;
        this.f28704k = b4;
        this.f28705l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzt com_google_android_gms_wearable_internal_zzt = (zzt) obj;
        return this.f28694a != com_google_android_gms_wearable_internal_zzt.f28694a ? false : this.f28701h != com_google_android_gms_wearable_internal_zzt.f28701h ? false : this.f28702i != com_google_android_gms_wearable_internal_zzt.f28702i ? false : this.f28703j != com_google_android_gms_wearable_internal_zzt.f28703j ? false : this.f28704k != com_google_android_gms_wearable_internal_zzt.f28704k ? false : !this.f28695b.equals(com_google_android_gms_wearable_internal_zzt.f28695b) ? false : (this.f28696c == null ? com_google_android_gms_wearable_internal_zzt.f28696c != null : !this.f28696c.equals(com_google_android_gms_wearable_internal_zzt.f28696c)) ? false : !this.f28697d.equals(com_google_android_gms_wearable_internal_zzt.f28697d) ? false : !this.f28698e.equals(com_google_android_gms_wearable_internal_zzt.f28698e) ? false : !this.f28699f.equals(com_google_android_gms_wearable_internal_zzt.f28699f) ? false : (this.f28700g == null ? com_google_android_gms_wearable_internal_zzt.f28700g != null : !this.f28700g.equals(com_google_android_gms_wearable_internal_zzt.f28700g)) ? false : this.f28705l != null ? this.f28705l.equals(com_google_android_gms_wearable_internal_zzt.f28705l) : com_google_android_gms_wearable_internal_zzt.f28705l == null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f28700g != null ? this.f28700g.hashCode() : 0) + (((((((((this.f28696c != null ? this.f28696c.hashCode() : 0) + ((((this.f28694a + 31) * 31) + this.f28695b.hashCode()) * 31)) * 31) + this.f28697d.hashCode()) * 31) + this.f28698e.hashCode()) * 31) + this.f28699f.hashCode()) * 31)) * 31) + this.f28701h) * 31) + this.f28702i) * 31) + this.f28703j) * 31) + this.f28704k) * 31;
        if (this.f28705l != null) {
            i = this.f28705l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        int i = this.f28694a;
        String str = this.f28695b;
        String str2 = this.f28696c;
        String str3 = this.f28697d;
        String str4 = this.f28698e;
        String str5 = this.f28699f;
        String str6 = this.f28700g;
        byte b = this.f28701h;
        byte b2 = this.f28702i;
        byte b3 = this.f28703j;
        byte b4 = this.f28704k;
        String str7 = this.f28705l;
        return new StringBuilder(((((((String.valueOf(str).length() + 211) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("AncsNotificationParcelable{, id=").append(i).append(", appId='").append(str).append("', dateTime='").append(str2).append("', notificationText='").append(str3).append("', title='").append(str4).append("', subtitle='").append(str5).append("', displayName='").append(str6).append("', eventId=").append(b).append(", eventFlags=").append(b2).append(", categoryId=").append(b3).append(", categoryCount=").append(b4).append(", packageName='").append(str7).append("'}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28694a);
        C5130b.m23844a(parcel, 3, this.f28695b);
        C5130b.m23844a(parcel, 4, this.f28696c);
        C5130b.m23844a(parcel, 5, this.f28697d);
        C5130b.m23844a(parcel, 6, this.f28698e);
        C5130b.m23844a(parcel, 7, this.f28699f);
        C5130b.m23844a(parcel, 8, this.f28700g == null ? this.f28695b : this.f28700g);
        C5130b.m23837a(parcel, 9, this.f28701h);
        C5130b.m23837a(parcel, 10, this.f28702i);
        C5130b.m23837a(parcel, 11, this.f28703j);
        C5130b.m23837a(parcel, 12, this.f28704k);
        C5130b.m23844a(parcel, 13, this.f28705l);
        C5130b.m23853b(parcel, a);
    }
}
