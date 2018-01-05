package com.google.android.gms.ocr;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class CreditCardOcrResult extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5345b();
    public String f27845a;
    public int f27846b;
    public int f27847c;
    public int f27848d;
    public String f27849e;
    public String f27850f;
    public boolean f27851g;
    public String f27852h;
    public String f27853i;
    public String f27854j;
    public String f27855k;

    public CreditCardOcrResult(String str, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        this.f27845a = str;
        this.f27846b = i;
        this.f27847c = i2;
        this.f27848d = i3;
        this.f27849e = str2;
        this.f27850f = str3;
        this.f27851g = z;
        this.f27852h = str4;
        this.f27853i = str5;
        this.f27854j = str6;
        this.f27855k = str7;
    }

    public static CreditCardOcrResult m26066a(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            return null;
        }
        intent.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
        return (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f27845a);
        C5130b.m23854b(parcel, 3, this.f27846b);
        C5130b.m23854b(parcel, 4, this.f27847c);
        C5130b.m23854b(parcel, 5, this.f27848d);
        C5130b.m23844a(parcel, 6, this.f27849e);
        C5130b.m23844a(parcel, 7, this.f27850f);
        C5130b.m23846a(parcel, 8, this.f27851g);
        C5130b.m23844a(parcel, 9, this.f27852h);
        C5130b.m23844a(parcel, 10, this.f27853i);
        C5130b.m23844a(parcel, 11, this.f27854j);
        C5130b.m23844a(parcel, 12, this.f27855k);
        C5130b.m23853b(parcel, a);
    }
}
