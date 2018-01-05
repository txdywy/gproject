package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class Flag extends zza implements Comparable {
    public static final Creator CREATOR = new ag();
    public final String f28302a;
    public long f28303b;
    public boolean f28304c;
    public double f28305d;
    public String f28306e;
    public byte[] f28307f;
    public final int f28308g;
    public final int f28309h;

    static {
        af afVar = new af();
    }

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f28302a = str;
        this.f28303b = j;
        this.f28304c = z;
        this.f28305d = d;
        this.f28306e = str2;
        this.f28307f = bArr;
        this.f28308g = i;
        this.f28309h = i2;
    }

    private static int m26411a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public final String m26412a(StringBuilder stringBuilder) {
        stringBuilder.append("Flag(");
        stringBuilder.append(this.f28302a);
        stringBuilder.append(", ");
        switch (this.f28308g) {
            case 1:
                stringBuilder.append(this.f28303b);
                break;
            case 2:
                stringBuilder.append(this.f28304c);
                break;
            case 3:
                stringBuilder.append(this.f28305d);
                break;
            case 4:
                stringBuilder.append("'");
                stringBuilder.append(this.f28306e);
                stringBuilder.append("'");
                break;
            case 5:
                if (this.f28307f != null) {
                    stringBuilder.append("'");
                    stringBuilder.append(Base64.encodeToString(this.f28307f, 3));
                    stringBuilder.append("'");
                    break;
                }
                stringBuilder.append("null");
                break;
            default:
                String str = this.f28302a;
                throw new AssertionError(new StringBuilder(String.valueOf(str).length() + 27).append("Invalid type: ").append(str).append(", ").append(this.f28308g).toString());
        }
        stringBuilder.append(", ");
        stringBuilder.append(this.f28308g);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28309h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (!C5549h.m26526a(this.f28302a, flag.f28302a) || this.f28308g != flag.f28308g || this.f28309h != flag.f28309h) {
            return false;
        }
        switch (this.f28308g) {
            case 1:
                return this.f28303b == flag.f28303b;
            case 2:
                return this.f28304c == flag.f28304c;
            case 3:
                return this.f28305d == flag.f28305d;
            case 4:
                return C5549h.m26526a(this.f28306e, flag.f28306e);
            case 5:
                return Arrays.equals(this.f28307f, flag.f28307f);
            default:
                throw new AssertionError("Invalid enum value: " + this.f28308g);
        }
    }

    public String toString() {
        return m26412a(new StringBuilder());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28302a);
        C5130b.m23839a(parcel, 3, this.f28303b);
        C5130b.m23846a(parcel, 4, this.f28304c);
        double d = this.f28305d;
        C5130b.m23838a(parcel, 5, 8);
        parcel.writeDouble(d);
        C5130b.m23844a(parcel, 6, this.f28306e);
        C5130b.m23847a(parcel, 7, this.f28307f);
        C5130b.m23854b(parcel, 8, this.f28308g);
        C5130b.m23854b(parcel, 9, this.f28309h);
        C5130b.m23853b(parcel, a);
    }

    public /* synthetic */ int compareTo(Object obj) {
        int i = 0;
        Flag flag = (Flag) obj;
        int compareTo = this.f28302a.compareTo(flag.f28302a);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = m26411a(this.f28308g, flag.f28308g);
        if (compareTo != 0) {
            return compareTo;
        }
        switch (this.f28308g) {
            case 1:
                long j = this.f28303b;
                long j2 = flag.f28303b;
                if (j < j2) {
                    return -1;
                }
                if (j != j2) {
                    return 1;
                }
                return 0;
            case 2:
                boolean z = this.f28304c;
                if (z != flag.f28304c) {
                    return z ? 1 : -1;
                } else {
                    return 0;
                }
            case 3:
                return Double.compare(this.f28305d, flag.f28305d);
            case 4:
                String str = this.f28306e;
                String str2 = flag.f28306e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                return str2 == null ? 1 : str.compareTo(str2);
            case 5:
                if (this.f28307f == flag.f28307f) {
                    return 0;
                }
                if (this.f28307f == null) {
                    return -1;
                }
                if (flag.f28307f == null) {
                    return 1;
                }
                while (i < Math.min(this.f28307f.length, flag.f28307f.length)) {
                    compareTo = this.f28307f[i] - flag.f28307f[i];
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    i++;
                }
                return m26411a(this.f28307f.length, flag.f28307f.length);
            default:
                throw new AssertionError("Invalid enum value: " + this.f28308g);
        }
    }
}
