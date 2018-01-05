package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C5190c implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        String str19 = null;
        String str20 = null;
        int i9 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        boolean z3 = false;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        boolean z4 = false;
        Bundle bundle2 = null;
        List list = null;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) C5129a.m23816a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 10:
                    str7 = C5129a.m23827h(parcel, readInt);
                    break;
                case 11:
                    str8 = C5129a.m23827h(parcel, readInt);
                    break;
                case 12:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 13:
                    str9 = C5129a.m23827h(parcel, readInt);
                    break;
                case 14:
                    str10 = C5129a.m23827h(parcel, readInt);
                    break;
                case 15:
                    str11 = C5129a.m23827h(parcel, readInt);
                    break;
                case 16:
                    str12 = C5129a.m23827h(parcel, readInt);
                    break;
                case 17:
                    str13 = C5129a.m23827h(parcel, readInt);
                    break;
                case 18:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                case 19:
                    strArr2 = C5129a.m23833n(parcel, readInt);
                    break;
                case 20:
                    strArr3 = C5129a.m23833n(parcel, readInt);
                    break;
                case 21:
                    str14 = C5129a.m23827h(parcel, readInt);
                    break;
                case 22:
                    str15 = C5129a.m23827h(parcel, readInt);
                    break;
                case 23:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 24:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 25:
                    i4 = C5129a.m23824e(parcel, readInt);
                    break;
                case 26:
                    i5 = C5129a.m23824e(parcel, readInt);
                    break;
                case 27:
                    i6 = C5129a.m23824e(parcel, readInt);
                    break;
                case 28:
                    str16 = C5129a.m23827h(parcel, readInt);
                    break;
                case 29:
                    str17 = C5129a.m23827h(parcel, readInt);
                    break;
                case 30:
                    str18 = C5129a.m23827h(parcel, readInt);
                    break;
                case 31:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 32:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 33:
                    i7 = C5129a.m23824e(parcel, readInt);
                    break;
                case 34:
                    i8 = C5129a.m23824e(parcel, readInt);
                    break;
                case 35:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 36:
                    str19 = C5129a.m23827h(parcel, readInt);
                    break;
                case 37:
                    str20 = C5129a.m23827h(parcel, readInt);
                    break;
                case 38:
                    i9 = C5129a.m23824e(parcel, readInt);
                    break;
                case 39:
                    str21 = C5129a.m23827h(parcel, readInt);
                    break;
                case 40:
                    str22 = C5129a.m23827h(parcel, readInt);
                    break;
                case 41:
                    str23 = C5129a.m23827h(parcel, readInt);
                    break;
                case 42:
                    str24 = C5129a.m23827h(parcel, readInt);
                    break;
                case 43:
                    str25 = C5129a.m23827h(parcel, readInt);
                    break;
                case 44:
                    str26 = C5129a.m23827h(parcel, readInt);
                    break;
                case 45:
                    str27 = C5129a.m23827h(parcel, readInt);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) C5129a.m23816a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = C5129a.m23827h(parcel, readInt);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) C5129a.m23820b(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = C5129a.m23833n(parcel, readInt);
                    break;
                case 50:
                    z3 = C5129a.m23822c(parcel, readInt);
                    break;
                case 51:
                    str29 = C5129a.m23827h(parcel, readInt);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) C5129a.m23816a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) C5129a.m23816a(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = C5129a.m23827h(parcel, readInt);
                    break;
                case 55:
                    z4 = C5129a.m23822c(parcel, readInt);
                    break;
                case 56:
                    bundle2 = C5129a.m23829j(parcel, readInt);
                    break;
                case 57:
                    list = C5129a.m23821c(parcel, readInt, RectF.CREATOR);
                    break;
                case 58:
                    z5 = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, list, z5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
