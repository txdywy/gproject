package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.feedback.C5188a;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.ej;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class GoogleHelp extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5214e();
    public boolean f26257A;
    public boolean f26258B;
    public int f26259C;
    public String f26260D;
    public boolean f26261E;
    public C5210a f26262F;
    public C5188a f26263G;
    public int f26264a;
    public String f26265b;
    public Account f26266c;
    public Bundle f26267d;
    public String f26268e;
    public String f26269f;
    public Bitmap f26270g;
    public boolean f26271h;
    public boolean f26272i;
    public List f26273j;
    @Deprecated
    public Bundle f26274k;
    @Deprecated
    public Bitmap f26275l;
    @Deprecated
    public byte[] f26276m;
    @Deprecated
    public int f26277n;
    @Deprecated
    public int f26278o;
    public String f26279p;
    public Uri f26280q;
    public List f26281r;
    public ThemeSettings f26282s;
    public List f26283t;
    public boolean f26284u;
    public ErrorReport f26285v;
    public TogglingData f26286w;
    public int f26287x;
    public PendingIntent f26288y;
    public int f26289z;

    GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        GoogleHelp googleHelp;
        this.f26285v = new ErrorReport();
        this.f26264a = i;
        this.f26289z = i6;
        this.f26257A = z4;
        this.f26258B = z5;
        this.f26259C = i7;
        this.f26260D = str5;
        this.f26265b = str;
        this.f26266c = account;
        this.f26267d = bundle;
        this.f26268e = str2;
        this.f26269f = str3;
        this.f26270g = bitmap;
        this.f26271h = z;
        this.f26272i = z2;
        this.f26261E = z6;
        this.f26273j = list;
        this.f26288y = pendingIntent;
        this.f26274k = bundle2;
        this.f26275l = bitmap2;
        this.f26276m = bArr;
        this.f26277n = i2;
        this.f26278o = i3;
        this.f26279p = str4;
        this.f26280q = uri;
        this.f26281r = list2;
        if (this.f26264a < 4) {
            themeSettings = new ThemeSettings();
            themeSettings.f26201a = i4;
            googleHelp = this;
        } else if (themeSettings == null) {
            themeSettings = new ThemeSettings();
            googleHelp = this;
        } else {
            googleHelp = this;
        }
        googleHelp.f26282s = themeSettings;
        this.f26283t = list3;
        this.f26284u = z3;
        this.f26285v = errorReport;
        if (this.f26285v != null) {
            this.f26285v.f26152X = "GoogleHelp";
        }
        this.f26286w = togglingData;
        this.f26287x = i5;
    }

    public GoogleHelp(String str) {
        this(13, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
    }

    public static Bitmap m23989a(Activity activity) {
        Throwable e;
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Config.RGB_565);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Exception e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        }
        Log.w("GOOGLEHELP_GoogleHelp", "Get screenshot failed!", e);
        return null;
    }

    public final Intent m23990a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final GoogleHelp m23991a(FeedbackOptions feedbackOptions, File file) {
        if (feedbackOptions != null) {
            this.f26263G = feedbackOptions.f26193m;
        }
        this.f26285v = ei.m24333a(feedbackOptions, file);
        this.f26285v.f26152X = "GoogleHelp";
        return this;
    }

    public final GoogleHelp m23992a(List list) {
        this.f26267d = ej.m24337a(list);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f26264a);
        C5130b.m23844a(parcel, 2, this.f26265b);
        C5130b.m23842a(parcel, 3, this.f26266c, i);
        C5130b.m23840a(parcel, 4, this.f26267d);
        C5130b.m23846a(parcel, 5, this.f26271h);
        C5130b.m23846a(parcel, 6, this.f26272i);
        C5130b.m23845a(parcel, 7, this.f26273j);
        C5130b.m23840a(parcel, 10, this.f26274k);
        C5130b.m23842a(parcel, 11, this.f26275l, i);
        C5130b.m23844a(parcel, 14, this.f26279p);
        C5130b.m23842a(parcel, 15, this.f26280q, i);
        C5130b.m23855b(parcel, 16, this.f26281r);
        C5130b.m23854b(parcel, 17, 0);
        C5130b.m23855b(parcel, 18, this.f26283t);
        C5130b.m23847a(parcel, 19, this.f26276m);
        C5130b.m23854b(parcel, 20, this.f26277n);
        C5130b.m23854b(parcel, 21, this.f26278o);
        C5130b.m23846a(parcel, 22, this.f26284u);
        C5130b.m23842a(parcel, 23, this.f26285v, i);
        C5130b.m23842a(parcel, 25, this.f26282s, i);
        C5130b.m23844a(parcel, 28, this.f26268e);
        C5130b.m23842a(parcel, 31, this.f26286w, i);
        C5130b.m23854b(parcel, 32, this.f26287x);
        C5130b.m23842a(parcel, 33, this.f26288y, i);
        C5130b.m23844a(parcel, 34, this.f26269f);
        C5130b.m23842a(parcel, 35, this.f26270g, i);
        C5130b.m23854b(parcel, 36, this.f26289z);
        C5130b.m23846a(parcel, 37, this.f26257A);
        C5130b.m23846a(parcel, 38, this.f26258B);
        C5130b.m23854b(parcel, 39, this.f26259C);
        C5130b.m23844a(parcel, 40, this.f26260D);
        C5130b.m23846a(parcel, 41, this.f26261E);
        C5130b.m23853b(parcel, a);
    }
}
