package com.google.android.finsky.billing.common;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.widget.TextView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.fe;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class PurchaseFlowConfig implements Parcelable {
    public static final Creator CREATOR = new C1796l();
    public static final PurchaseFlowConfig f9283a = new PurchaseFlowConfig(new fe[0]);
    public final Map f9284b;

    public PurchaseFlowConfig(fe[] feVarArr) {
        this.f9284b = new HashMap();
        for (fe feVar : feVarArr) {
            if (!this.f9284b.containsKey(feVar.c)) {
                this.f9284b.put(feVar.c, new HashMap());
            }
            ((Map) this.f9284b.get(feVar.c)).put(feVar.d, feVar.e);
        }
    }

    public PurchaseFlowConfig(HashMap hashMap) {
        this.f9284b = hashMap;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f9284b);
    }

    public final boolean m9745a(String str, String str2) {
        return this.f9284b.containsKey(str) && ((Map) this.f9284b.get(str)).containsKey(str2);
    }

    public final int m9746b(String str, String str2) {
        if (!m9745a(str, str2)) {
            return -1;
        }
        try {
            return Color.parseColor((String) ((Map) this.f9284b.get(str)).get(str2));
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Invalid color format in Purchase Flow configurations.", new Object[0]);
            return -1;
        }
    }

    public static Typeface m9744a(String str, TextView textView) {
        int i = -1;
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    i = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    i = 2;
                    break;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    i = 0;
                    break;
                }
                break;
            case 1734741290:
                if (str.equals("bold_italic")) {
                    i = 3;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                return Typeface.create(textView.getTypeface(), 1);
            case 1:
                return Typeface.create(textView.getTypeface(), 2);
            case 2:
                return Typeface.create(textView.getTypeface(), 0);
            case 3:
                return Typeface.create(textView.getTypeface(), 3);
            default:
                return null;
        }
    }
}
