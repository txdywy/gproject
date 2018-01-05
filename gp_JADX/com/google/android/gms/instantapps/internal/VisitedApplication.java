package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VisitedApplication extends zza {
    public static final Creator CREATOR = new aa();
    public BitmapTeleporter f26447a;
    public String f26448b;
    public String f26449c;
    public String f26450d;
    public String f26451e;
    public ArrayList f26452f;
    public ContentRating f26453g;

    public VisitedApplication(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection collection, ContentRating contentRating) {
        this.f26447a = bitmapTeleporter;
        this.f26448b = str;
        this.f26449c = str2;
        this.f26450d = str3;
        this.f26451e = str4;
        this.f26452f = new ArrayList(collection == null ? 0 : collection.size());
        if (collection != null) {
            this.f26452f.addAll(collection);
        }
        this.f26453g = contentRating;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23842a(parcel, 2, this.f26447a, i);
        C5130b.m23844a(parcel, 3, this.f26448b);
        C5130b.m23844a(parcel, 4, this.f26449c);
        C5130b.m23844a(parcel, 5, this.f26450d);
        C5130b.m23844a(parcel, 6, this.f26451e);
        C5130b.m23845a(parcel, 7, Collections.unmodifiableList(this.f26452f));
        C5130b.m23842a(parcel, 8, this.f26453g, i);
        C5130b.m23853b(parcel, a);
    }
}
