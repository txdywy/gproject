package com.google.android.finsky.billing.common;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.widget.TextView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.fe;
import java.util.HashMap;
import java.util.Map;

public class PurchaseFlowConfig implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public static final PurchaseFlowConfig a;
    public final Map b;

    static {
        PurchaseFlowConfig.a = new PurchaseFlowConfig(new fe[0]);
        PurchaseFlowConfig.CREATOR = new com.google.android.finsky.billing.common.l();
    }

    PurchaseFlowConfig(HashMap p0) {
        this.b = p0;
    }

    PurchaseFlowConfig(fe[] p0) {
        this.b = new HashMap();
        v1 = 0;
        while (v1 < p0.length) {
            if (!this.b.containsKey(p0[v1].c))
                this.b.put(p0[v1].c, new HashMap());
            ((Map)this.b.get(p0[v1].c)).put(p0[v1].d, p0[v1].e);
            v1 = v1 + 1;
        }
    }

    public static Typeface a(String p0, TextView p1) {
        v0 = -1;
        switch (p0.hashCode()) {
            case -1178781136:
                if (p0.equals("italic"))
                    v0 = 1;
                break;
            case -1039745817:
                if (p0.equals("normal"))
                    v0 = 2;
                break;
            case 3029637:
                if (p0.equals("bold"))
                    v0 = 0;
                break;
            case 1734741290:
                if (p0.equals("bold_italic"))
                    v0 = 3;
                break;
            default:
                break;
        }
        switch (v0) {
            case 0:
                v0 = Typeface.create(p1.getTypeface(), 1);
                break;
            case 1:
                v0 = Typeface.create(p1.getTypeface(), 2);
                break;
            case 2:
                v0 = Typeface.create(p1.getTypeface(), 0);
                break;
            case 3:
                v0 = Typeface.create(p1.getTypeface(), 3);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final boolean a(String p0, String p1) {
        if (this.b.containsKey(p0) && ((Map)this.b.get(p0)).containsKey(p1))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int b(String p0, String p1) {
        if (!this.a(p0, p1))
            v0 = -1;
        else {
            try {
                v0 = Color.parseColor((String)((Map)this.b.get(p0)).get(p1));
            }
            catch (IllegalArgumentException ex) {
                FinskyLog.b(ex, "Invalid color format in Purchase Flow configurations.", new Object[0]);
                v0 = -1;
            }
        }
        return v0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeMap(this.b);
    }

}
