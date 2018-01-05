package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class C5129a {
    public static int m23814a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = C5129a.m23815a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new zzc(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        readInt = dataPosition + a;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        throw new zzc("Size read is invalid start=" + dataPosition + " end=" + readInt, parcel);
    }

    public static int m23815a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static Parcelable m23816a(Parcel parcel, int i, Creator creator) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static void m23817a(Parcel parcel, int i, int i2) {
        int a = C5129a.m23815a(parcel, i);
        if (a != i2) {
            String toHexString = Integer.toHexString(a);
            throw new zzc(new StringBuilder(String.valueOf(toHexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(toHexString).append(")").toString(), parcel);
        }
    }

    public static void m23818b(Parcel parcel, int i) {
        parcel.setDataPosition(C5129a.m23815a(parcel, i) + parcel.dataPosition());
    }

    public static void m23819b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            throw new zzc(new StringBuilder(String.valueOf(toHexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(i).append(" (0x").append(toHexString).append(")").toString(), parcel);
        }
    }

    public static Object[] m23820b(Parcel parcel, int i, Creator creator) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList m23821c(Parcel parcel, int i, Creator creator) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static boolean m23822c(Parcel parcel, int i) {
        C5129a.m23817a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte m23823d(Parcel parcel, int i) {
        C5129a.m23817a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int m23824e(Parcel parcel, int i) {
        C5129a.m23817a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m23825f(Parcel parcel, int i) {
        C5129a.m23817a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long m23826g(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        if (a == 0) {
            return null;
        }
        C5129a.m23819b(parcel, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String m23827h(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m23828i(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m23829j(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m23830k(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static byte[][] m23831l(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    public static int[] m23832m(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static String[] m23833n(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList m23834o(Parcel parcel, int i) {
        int a = C5129a.m23815a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static void m23835p(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new zzc("Overread allowed size end=" + i, parcel);
        }
    }
}
