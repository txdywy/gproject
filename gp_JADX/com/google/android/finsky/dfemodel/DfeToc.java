package com.google.android.finsky.dfemodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DfeToc extends C2335k implements Parcelable {
    public static final Creator CREATOR = new C2725p();
    public final gp f14881a;
    public final Map f14882b = new LinkedHashMap();
    public List f14883c;

    public DfeToc(gp gpVar) {
        this.f14881a = gpVar;
        for (gj gjVar : this.f14881a.f31759b) {
            this.f14882b.put(Integer.valueOf(gjVar.c), gjVar);
        }
        this.f14883c = new ArrayList();
        this.f14883c.addAll(this.f14882b.keySet());
    }

    public final gj m14606a(int i) {
        return (gj) this.f14882b.get(Integer.valueOf(i));
    }

    public final gj m14607a(String str) {
        for (gj gjVar : this.f14881a.f31759b) {
            if (gjVar.e.equals(str)) {
                return gjVar;
            }
        }
        return null;
    }

    public final List m14609b() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.f14882b.values());
        return arrayList;
    }

    public final String m14610c() {
        String str = this.f14881a.f31780w;
        if (TextUtils.isEmpty(str)) {
            return (String) C0955b.jo.m28964b();
        }
        return str;
    }

    public final boolean mo2861a() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f14881a), 0);
    }
}
