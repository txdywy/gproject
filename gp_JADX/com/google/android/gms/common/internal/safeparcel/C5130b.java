package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class C5130b {
    public static int m23836a(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m23837a(Parcel parcel, int i, byte b) {
        C5130b.m23838a(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m23838a(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void m23839a(Parcel parcel, int i, long j) {
        C5130b.m23838a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m23840a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeBundle(bundle);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23841a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23842a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = C5130b.m23836a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23843a(Parcel parcel, int i, Long l) {
        if (l != null) {
            C5130b.m23838a(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void m23844a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeString(str);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23845a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeStringList(list);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23846a(Parcel parcel, int i, boolean z) {
        C5130b.m23838a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m23847a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeByteArray(bArr);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23848a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeIntArray(iArr);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23849a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C5130b.m23852a(parcel, parcelable, i2);
                }
            }
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23850a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeStringArray(strArr);
            C5130b.m23853b(parcel, a);
        }
    }

    public static void m23851a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = C5130b.m23836a(parcel, i);
            parcel.writeInt(r2);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            C5130b.m23853b(parcel, a);
        }
    }

    private static void m23852a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void m23853b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void m23854b(Parcel parcel, int i, int i2) {
        C5130b.m23838a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m23855b(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = C5130b.m23836a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C5130b.m23852a(parcel, parcelable, 0);
                }
            }
            C5130b.m23853b(parcel, a);
        }
    }
}
