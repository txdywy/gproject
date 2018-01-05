package com.google.android.finsky.br.a;

import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.activities.inlineappinstaller.InlineConsumptionAppInstallerActivity;
import com.google.android.finsky.api.l;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.l.a;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.m;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.ui.common.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.br.a.a implements com.google.android.finsky.br.a
{

    public final Context a;
    public final com.google.android.finsky.d.a b;
    public final com.google.android.finsky.br.b c;
    public final com.google.android.finsky.by.c d;
    public final com.google.android.finsky.l.a e;
    public final com.google.android.finsky.cn.a f;
    public final com.google.android.finsky.ba.c g;
    public final PackageManager h;
    public final com.google.android.finsky.notification.ab i;
    public final com.google.android.finsky.by.o j;
    public final com.google.android.finsky.br.a.h k;
    public final com.google.android.finsky.br.a.h l;
    public final com.google.android.finsky.br.a.h m;
    public final com.google.android.finsky.br.a.h n;
    public final com.google.android.finsky.br.a.h o;
    public final com.google.android.finsky.br.a.h p;

    static {
        new ArrayList().add(Integer.valueOf(2));
    }

    a(Context p0, com.google.android.finsky.d.a p1, com.google.android.finsky.br.b p2, com.google.android.finsky.by.c p3, com.google.android.finsky.l.a p4, com.google.android.finsky.cn.a p5, com.google.android.finsky.ba.c p6, PackageManager p7, com.google.android.finsky.notification.ab p8, com.google.android.finsky.by.o p9) {
        this.k = new com.google.android.finsky.br.a.b(this);
        this.l = new com.google.android.finsky.br.a.c(this);
        this.m = new com.google.android.finsky.br.a.d();
        this.n = new com.google.android.finsky.br.a.e();
        this.o = new com.google.android.finsky.br.a.f();
        this.p = new com.google.android.finsky.br.a.g();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p7;
        this.i = p8;
        this.j = p9;
    }

    private static boolean a(PackageManager p0, String p1) {
        v0 = 0;
        v1 = p0.getLaunchIntentForPackage(p1);
        if (v1 != 0) {
            v1 = p0.queryIntentActivities(v1, 65536);
            if (v1 != 0 && !v1.isEmpty())
                v0 = 1;
        }
        return v0;
    }

    private final Intent b(Context p0, Document p1, Account p2) {
        v0 = 0;
        if (p1 == 0)
            return v0;
        if (p1.a.d == 0)
            return v0;
        switch (p1.a.f) {
            case 1:
                v0 = this.a(p0, p1, p2.name);
                break;
            case 2:
                v0 = this.a(p0, p1, p2.name);
                break;
            case 3:
                v0 = this.a(p0, p1, p2.name);
                break;
            case 4:
                v0 = this.a(p0, p1, p2.name);
                break;
            case 5:
                throw new IllegalStateException(47 + "Cannot open an item from the corpus " + p1.a.f);
            case 6:
                v0 = this.a(p0, p1, p2.name);
                break;
            default:
                throw new IllegalStateException(47 + "Cannot open an item from the corpus " + p1.a.f);
        }
    }

    public static Intent b(PackageManager p0, Intent p1) {
        if (p0.resolveActivity(p1, 65536) == 0) {
            v0 = new Intent(p1.getAction(), p1.getData());
            v0.setFlags(p1.getFlags());
            p1 = v0;
        }
        return p1;
    }

    private final boolean b(PackageManager p0) {
        if (com.google.android.finsky.br.a.a.a(p0, "com.google.android.videos")) {
            if (this.f.a("com.google.android.videos").d >= ((Integer)com.google.android.finsky.aa.b.bv.b()).intValue())
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    private final boolean c(PackageManager p0) {
        if (com.google.android.finsky.br.a.a.a(p0, "com.google.android.apps.magazines")) {
            if (this.f.a("com.google.android.apps.magazines").d < ((Integer)com.google.android.finsky.aa.b.dK.b()).intValue())
                v0 = 1;
            else
                v0 = 0;
            if (v0 == 0)
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    private final com.google.android.finsky.br.a.h f(int p0) {
        switch (p0) {
            case 1:
                v0 = this.k;
                break;
            case 2:
                v0 = this.o;
                break;
            case 3:
                v0 = this.l;
                break;
            case 4:
                v0 = this.m;
                break;
            case 5:
                throw new IllegalStateException(27 + "Unknown backend " + p0);
            case 6:
                v0 = this.n;
                break;
            default:
                throw new IllegalStateException(27 + "Unknown backend " + p0);
        }
        return v0;
    }

    private final com.google.android.finsky.br.a.h g(int p0) {
        switch (p0) {
            case 1:
                v0 = this.p;
                break;
            case 2:
                v0 = this.k;
                break;
            case 3:
                v0 = this.n;
                break;
            case 4:
                v0 = this.o;
                break;
            case 5:
                v0 = this.m;
                break;
            default:
                throw new IllegalStateException(28 + "Unknown app type " + p0);
        }
        return v0;
    }

    public final Intent a(int p0, String p1, String p2) {
        return this.f(p0).a(p1, p2);
    }

    public final Intent a(Context p0, int p1, String p2) {
        return this.f(p1).a(p0, p2);
    }

    public final Intent a(Context p0, Intent p1) {
        v0 = this.a(p0, com.google.android.finsky.br.a.j.a(), "authAccount", p1.getStringExtra("authAccount"));
        v0.setData(p1.getData());
        v0.setAction("android.intent.action.VIEW");
        return v0;
    }

    public final Intent a(Context p0, Document p1, String p2) {
        return this.f(p1.a.f).a(p0, p1, p2);
    }

    public final Intent a(Context p0, Class p1, String p2, String p3) {
        v0 = new Intent(p0, p1);
        v0.putExtra(p2, p3);
        return v0;
    }

    public final Intent a(PackageManager p0, Uri p1, String p2) {
        if (p1 != 0)
            p1 = Uri.parse(p1.toString().trim());
        v0 = new Intent("android.intent.action.VIEW", p1);
        v0.setPackage("com.google.android.youtube");
        v0.putExtra("authAccount", p2);
        v0.putExtra("force_fullscreen", 1);
        v0.putExtra("finish_on_ended", 1);
        v0.setFlags(524288);
        return com.google.android.finsky.br.a.a.b(p0, v0);
    }

    public final Intent a(Uri p0) {
        if (p0.getScheme() == 0) {
            v0 = String.valueOf(p0.toString());
            if (v0.length() != 0)
                v0 = "http://".concat(v0);
            else
                v0 = new String("http://");
            p0 = Uri.parse(v0);
        }
        v0 = new Intent("android.intent.action.VIEW", p0);
        v0.setFlags(524288);
        return v0;
    }

    public final Intent a(Uri p0, String p1) {
        v0 = this.a(p0);
        if (!TextUtils.isEmpty(p1))
            v0.setPackage(p1);
        return v0;
    }

    public final Intent a(String p0, String p1) {
        v0 = new Intent("android.intent.action.VIEW");
        v1 = new Uri$Builder();
        v1.scheme("market");
        v1.authority("details");
        v1.appendQueryParameter("id", p0);
        v1.appendQueryParameter("url", p1);
        v0.setData(v1.build());
        v0.addCategory("android.intent.category.DEFAULT");
        v0.setPackage("com.android.vending");
        return v0;
    }

    public final String a() {
        if (this.g.dj().a(12620775))
            v0 = (String)com.google.android.finsky.aa.b.ed.b();
        else
            v0 = (String)com.google.android.finsky.aa.b.ea.b();
        return v0;
    }

    public final String a(int p0) {
        switch (p0) {
            case 1:
                v0 = "com.google.android.apps.books";
                break;
            case 2:
                v0 = "com.google.android.music";
                break;
            case 3:
                v0 = "com.android.vending";
                break;
            case 4:
                v0 = "com.google.android.videos";
                break;
            case 5:
                v0 = 0;
                break;
            case 6:
                v0 = "com.google.android.apps.magazines";
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final void a(Context p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.d.w p2, String p3, boolean p4, String p5) {
        this.a(p0, p3, p4, p5);
        p2.b(new com.google.android.finsky.d.d(p1).a(202));
    }

    public final void a(Context p0, String p1, int p2, int p3, android.support.v4.app.ab p4, Fragment p5) {
        if (TextUtils.isEmpty(p1))
            Toast.makeText(p0, p0.getString(2131952406), 0).show();
        else if (p4.a("app_needed_dialog") == 0) {
            v0 = new Bundle();
            v0.putString("dialog_details_url", com.google.android.finsky.api.l.a(p1));
            v1 = new com.google.android.finsky.at.k();
            v1.a(p2).d(2131952688).e(2131951799);
            v1.a(p5, p3, v0);
            v1.a().a(p4, "app_needed_dialog");
        }
    }

    public final void a(Context p0, String p1, boolean p2, String p3) {
        v0 = new Intent("android.intent.action.SEND");
        v0.setType("text/plain");
        v0.setFlags(524288);
        v0.putExtra("android.intent.extra.TEXT", p1);
        if (p2 != 0) {
            v3 = new Object[1];
            v3[0] = p3;
            v0.putExtra("android.intent.extra.SUBJECT", p0.getString(2131953180, v3));
        }
        else {
            v3 = new Object[1];
            v3[0] = p3;
            v0.putExtra("android.intent.extra.SUBJECT", p0.getString(2131953179, v3));
        }
        v2 = new Object[1];
        v2[0] = p3;
        p0.startActivity(Intent.createChooser(v0, p0.getString(2131953178, v2)));
    }

    public final boolean a(int p0, Intent p1) {
        if (!this.a(this.h, p0))
            v0 = 0;
        else {
            v2 = this.a(p0);
            if (TextUtils.isEmpty(v2)) {
                v0 = 0;
                return v0;
            }
            v3 = this.h.queryIntentActivities(p1, 65536).iterator();
            while (v3.hasNext()) {
                if (v2.equals(((ResolveInfo)v3.next()).activityInfo.packageName)) {
                    v0 = 1;
                    return v0;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public final boolean a(Activity p0, Intent p1) {
        v2 = 0;
        if (Build$VERSION.SDK_INT >= 23 && this.g.dj().a(12611636))
            p1.setData(Uri.parse("https:"));
        p1.setComponent(0);
        v3 = p0.getPackageManager().queryIntentActivities(p1, 0);
        p1.setData(p1.getData());
        v1 = 0;
        while (v1 < v3.size()) {
            v0 = ((ResolveInfo)v3.get(v1)).activityInfo;
            if (!v0.packageName.equals(p0.getPackageName())) {
                p1.setPackage(v0.packageName);
                p0.startActivity(p1);
                v2 = 1;
                return v2;
            }
            v1 = v1 + 1;
        }
        v0 = new com.google.android.wallet.ui.common.a(p0);
        v0.b(2131952638);
        v0.a(2131952688, 0);
        v0.a().show();
        return v2;
    }

    public final boolean a(Context p0, Account p1, Document p2, android.support.v4.app.ab p3, Fragment p4, int p5) {
  5:    if (!this.a(p0, p2, p1)) {
100:        v0 = 0;
101:        return v0;
        }
 13:    v1 = com.google.android.finsky.utils.m.a(p0, Activity);
 30:    if (!this.g.dj().a(12603704)) goto 83;
 32:    if (p2.a.f == 1) goto 37;
 35:    if (p2.a.f == 6 && v1 != 0) {
 56:        v3 = new Intent(com.google.android.finsky.m.a.b, InlineConsumptionAppInstallerActivity);
 61:        v3.putExtra("account", p1);
 70:        v3.putExtra("mediaDoc", ParcelableProto.a(p2.a));
 73:        this.b.a(0).a(v3);
 78:        v1.startActivityForResult(v3, 25);
        }
        else
 96:        this.a(p0, this.a(p2.a.f), this.c(p2.a.f), p5, p3, p4);
 81:    v0 = 1;
 82:    return v0;
    }

    public final boolean a(Context p0, Account p1, Document p2, android.support.v4.app.ab p3, Fragment p4, int p5, PurchaseParams p6) {
        v0 = 0;
        if (this.a(p0, p1, p2, p3, p4, p5))
            v0 = 1;
        else {
            v1 = this.b(p0, p2, p1);
            if (v1 != 0 && p0.getPackageManager().resolveActivity(v1, 0) != 0) {
                if (p2.N() != 0)
                    this.i.a(p2.N().k);
                if (p6 != 0) {
                    v1.putExtra("backend", p6.a.d);
                    v1.putExtra("backend_docid", p6.a.b);
                    v1.putExtra("document_type", p6.a.c);
                    v1.putExtra("full_docid", p6.b);
                    v1.putExtra("calling_package", p6.k);
                }
                p0.startActivity(v1);
            }
            else
                Toast.makeText(p0, p0.getString(2131952406), 0).show();
        }
        return v0;
    }

    public final boolean a(Context p0, Document p1, Account p2) {
        v3 = this.a(p1.a.f);
        if (TextUtils.isEmpty(v3))
            v0 = 0;
        else {
            v4 = this.f.a(v3);
            if (v4 == 0)
                v0 = 0;
            else if ("com.google.android.videos".equals(v3) && v4.d < ((Integer)com.google.android.finsky.aa.b.bv.b()).intValue())
                v0 = 0;
            else if ("com.google.android.apps.magazines".equals(v3) && v4.d < ((Integer)com.google.android.finsky.aa.b.dK.b()).intValue())
                v0 = 0;
            else if (p1 != 0 && "com.google.android.apps.magazines".equals(v3) && p1.a.n != 0 && p1.a.n.length > 0 && p1.a.e == 15 && p1.a.n[0].n == 0 && v4.d < ((Integer)com.google.android.finsky.aa.b.dL.b()).intValue())
                v0 = 0;
            else
                v0 = 1;
            if (v0 == 0)
                v0 = 1;
            else {
                v0 = this.b(p0, p1, p2);
                if (v0 == 0)
                    v0 = 1;
                else if (!this.a(p0.getPackageManager(), v0))
                    v0 = 1;
                else
                    v0 = 0;
            }
        }
        return v0;
    }

    public final boolean a(PackageManager p0) {
        if (com.google.android.finsky.br.a.a.a(p0, "com.google.android.music")) {
            if (this.f.a("com.google.android.music").d < ((Integer)com.google.android.finsky.aa.b.bw.b()).intValue())
                v0 = 1;
            else
                v0 = 0;
            if (v0 == 0)
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(PackageManager p0, int p1) {
        switch (p1) {
            case 1:
                v0 = com.google.android.finsky.br.a.a.a(p0, "com.google.android.apps.books");
                break;
            case 2:
                v0 = this.a(p0);
                break;
            case 3:
                v0 = 0;
                break;
            case 4:
                v0 = this.b(p0);
                break;
            case 5:
                v0 = 0;
                break;
            case 6:
                v0 = this.c(p0);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final boolean a(PackageManager p0, Intent p1) {
        v0 = 0;
        v1 = p0.queryIntentActivities(p1, 0);
        if (v1 != 0 && !v1.isEmpty())
            v0 = 1;
        return v0;
    }

    public final Intent b(int p0, String p1, String p2) {
        return this.g(p0).a(p1, p2);
    }

    public final Intent b(Context p0, int p1, String p2) {
        return this.g(p1).a(p0, p2);
    }

    public final Intent b(Context p0, Document p1, String p2) {
        return this.f(p1.a.f).b(p0, p1, p2);
    }

    public final Intent b(Context p0, Class p1, String p2, String p3) {
        v0 = new Intent(p0, p1);
        v0.setData(new Uri$Builder().scheme(p2).authority(p3).build());
        return v0;
    }

    public final Intent b(PackageManager p0, Uri p1, String p2) {
        if (com.google.android.finsky.br.a.a.a(p0, "com.google.android.videos")) {
            if (this.f.a("com.google.android.videos").d >= ((Integer)com.google.android.finsky.aa.b.dJ.b()).intValue())
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        if (v0 != 0) {
            v0 = new Intent("com.google.android.videos.intent.action.trailers.VIEW", p1);
            v0.putExtra("authAccount", p2);
            v0.setPackage("com.google.android.videos");
            v0.setFlags(524288);
            v0 = com.google.android.finsky.br.a.a.b(p0, v0);
        }
        else
            v0 = this.a(p0, p1, p2);
        return v0;
    }

    public final Intent b(Uri p0) {
        v0 = new Intent("android.intent.action.SENDTO", p0);
        v0.setFlags(524288);
        return v0;
    }

    public final String b(int p0) {
        switch (p0) {
            case 1:
                v0 = "com.google.android.play.games";
                break;
            case 2:
                v0 = "com.google.android.apps.books";
                break;
            case 3:
                v0 = "com.google.android.apps.magazines";
                break;
            case 4:
                v0 = "com.google.android.music";
                break;
            case 5:
                v0 = "com.google.android.videos";
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final boolean b(int p0, Intent p1) {
        if (p1 == 0)
            v0 = 0;
        else {
            if (!this.b(this.h, p0)) {
                v0 = 0;
                return v0;
            }
            v2 = this.b(p0);
            if (TextUtils.isEmpty(v2)) {
                v0 = 0;
                return v0;
            }
            v3 = this.h.queryIntentActivities(p1, 65536).iterator();
            while (v3.hasNext()) {
                if (v2.equals(((ResolveInfo)v3.next()).activityInfo.packageName)) {
                    v0 = 1;
                    return v0;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public final boolean b(PackageManager p0, int p1) {
        switch (p1) {
            case 1:
                if (com.google.android.finsky.br.a.a.a(p0, "com.google.android.play.games")) {
                    if (this.f.a("com.google.android.play.games").d < ((Integer)com.google.android.finsky.aa.b.bx.b()).intValue())
                        v0 = 1;
                    else
                        v0 = 0;
                    if (v0 == 0)
                        v0 = 1;
                    else
                        v0 = 0;
                }
                else
                    v0 = 0;
                break;
            case 2:
                v0 = com.google.android.finsky.br.a.a.a(p0, "com.google.android.apps.books");
                break;
            case 3:
                v0 = this.c(p0);
                break;
            case 4:
                v0 = this.a(p0);
                break;
            case 5:
                v0 = this.b(p0);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final boolean b(String p0, String p1) {
        v0 = 0;
        v1 = this.a.getPackageManager();
        if (this.a(v1, 2)) {
            v1 = v1.queryIntentActivities(this.a(2, p0, p1), 65536);
            if (v1 != 0 && !v1.isEmpty())
                v0 = 1;
        }
        return v0;
    }

    public final int c(int p0) {
        switch (p0) {
            case 1:
                v0 = 2131951774;
                break;
            case 2:
                v0 = 2131952526;
                break;
            case 3:
                v0 = -1;
                break;
            case 4:
                v0 = 2131953381;
                break;
            case 5:
                v0 = -1;
                break;
            case 6:
                v0 = 2131952616;
                break;
            case 7:
                v0 = -1;
                break;
            case 8:
                v0 = -1;
                break;
            case 9:
                v0 = 2131952255;
                break;
            default:
                v0 = -1;
                break;
        }
        return v0;
    }

    public final Intent c(String p0, String p1) {
        return this.a(2, p0, p1);
    }

    public final int d(int p0) {
        switch (p0) {
            case 1:
                v0 = 2131952238;
                break;
            case 2:
                v0 = 2131951774;
                break;
            case 3:
                v0 = 2131952616;
                break;
            case 4:
                v0 = 2131952526;
                break;
            case 5:
                v0 = 2131953381;
                break;
            default:
                v0 = -1;
                break;
        }
        return v0;
    }

    public final int e(int p0) {
        switch (p0) {
            case 1:
                v0 = 2131951775;
                break;
            case 6:
                v0 = 2131952617;
                break;
            default:
                v0 = this.c(p0);
                break;
        }
        return v0;
    }

}
