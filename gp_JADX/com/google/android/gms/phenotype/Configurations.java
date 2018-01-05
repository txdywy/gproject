package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configurations extends zza {
    public static final Creator CREATOR = new C5566y();
    public final String f28286a;
    public final String f28287b;
    public final Configuration[] f28288c;
    public final boolean f28289d;
    public final byte[] f28290e;
    public final Map f28291f = new TreeMap();

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr) {
        this.f28286a = str;
        this.f28287b = str2;
        this.f28288c = configurationArr;
        this.f28289d = z;
        this.f28290e = bArr;
        for (Configuration configuration : configurationArr) {
            this.f28291f.put(Integer.valueOf(configuration.f28282a), configuration);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Configurations)) {
            return false;
        }
        Configurations configurations = (Configurations) obj;
        return C5549h.m26526a(this.f28286a, configurations.f28286a) && C5549h.m26526a(this.f28287b, configurations.f28287b) && this.f28291f.equals(configurations.f28291f) && this.f28289d == configurations.f28289d && Arrays.equals(this.f28290e, configurations.f28290e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28286a, this.f28287b, this.f28291f, Boolean.valueOf(this.f28289d), this.f28290e});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configurations('");
        stringBuilder.append(this.f28286a);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('\'');
        stringBuilder.append(this.f28287b);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('(');
        for (Configuration append : this.f28291f.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        stringBuilder.append(", ");
        stringBuilder.append(this.f28289d);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28290e == null ? "null" : Base64.encodeToString(this.f28290e, 3));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28286a);
        C5130b.m23844a(parcel, 3, this.f28287b);
        C5130b.m23849a(parcel, 4, this.f28288c, i);
        C5130b.m23846a(parcel, 5, this.f28289d);
        C5130b.m23847a(parcel, 6, this.f28290e);
        C5130b.m23853b(parcel, a);
    }
}
