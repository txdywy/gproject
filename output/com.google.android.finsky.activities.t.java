package com.google.android.finsky.activities;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.support.v4.os.a;
import android.support.v7.app.z;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ai.a;
import com.google.android.finsky.ai.b;
import com.google.android.finsky.al.a;
import com.google.android.finsky.al.b;
import com.google.android.finsky.al.c;
import com.google.android.finsky.al.d;
import com.google.android.finsky.al.e;
import com.google.android.finsky.al.i;
import com.google.android.finsky.al.k;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.f;
import com.google.android.finsky.api.l;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.bn.f;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.l;
import com.google.android.finsky.datasync.p;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.hygiene.v;
import com.google.android.finsky.installapi.PlayInstallService;
import com.google.android.finsky.installapi.a;
import com.google.android.finsky.instantapps.InstantAppHygieneService;
import com.google.android.finsky.m;
import com.google.android.finsky.u.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.finsky.volley.e;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;
import com.google.android.wallet.ui.common.a;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.bq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class com.google.android.finsky.activities.t extends com.google.android.finsky.u.a
{

    public static final Uri a;
    public Runnable b;
    public com.google.android.finsky.al.a c;
    public com.google.android.finsky.al.d d;
    public final com.google.android.finsky.dx.a e;
    public com.google.android.finsky.installapi.a f;
    public final ServiceConnection g;

    static {
        com.google.android.finsky.activities.t.a = Uri.parse("market://details?id=com.google.android.gms");
    }

    t() {
        com.google.android.finsky.u.a();
        this.e = com.google.android.finsky.m.a.au();
        this.g = new com.google.android.finsky.activities.ap(this);
    }

    private static String a(int p0) {
        switch (p0) {
            case 1:
                v0 = "EMPTY";
                break;
            case 2:
                v0 = "EXPIRED";
                break;
            case 3:
                v0 = "PARTIAL";
                break;
            case 4:
                v0 = "COMPLETED";
                break;
            default:
                v0 = "UNKNOWN";
                break;
        }
        return v0;
    }

    private static String a(long p0) {
        return SimpleDateFormat.getDateTimeInstance().format(new Date(p0));
    }

    public static void a(Context p0) {
        if (((Boolean)com.google.android.finsky.aa.b.h.b()).booleanValue())
            v0 = 1;
        else
            v0 = 2;
        p0.getPackageManager().setComponentEnabledSetting(new ComponentName(p0, DebugActivity), v0, 1);
    }

    static final void a(DialogInterface p0) {
        p0.dismiss();
    }

    private final void a(com.google.android.finsky.al.i p0, String p1, String p2, int p3, String p4) {
        com.google.android.finsky.m.a.bc();
        v2 = com.google.android.finsky.al.c.a(p1, p0);
        v2.a(p4, p0.b(0));
        if (v2.a < 0)
            v1 = v2.a().indexOf(p4);
        else
            v1 = v2.a;
        v3 = new com.google.android.wallet.ui.common.a(this);
        v3.a(p3);
        v0 = v2.a();
        v3.a((String[])v0.toArray(new String[v0.size()]), v1, new com.google.android.finsky.activities.an(this, p0, v2, p2));
        v3.a().show();
    }

    private final void a(String p0) {
  0:    v0 = 1;
  2:    v1 = this.getDatabasePath(p0);
 10:    if (!v1.exists()) goto 106;
 16:    if (!v1.canRead()) goto 106;
 29:    v8 = new FileInputStream(v1);
 34:    v9 = new FileOutputStream(new File(Environment.getExternalStorageDirectory(), p0));
 37:    v1 = v8.getChannel();
 41:    v6 = v9.getChannel();
 51:    v1.transferTo(0, v1.size(), v6);
 54:    v1.close();
 57:    v6.close();
 60:    v8.close();
 63:    v9.close();
 66:    if (v0 == 0) {
 70:        v0 = String.valueOf(p0);
 78:        if (v0.length() != 0)
 80:            v0 = "Unable to export ".concat(v0);
            else
110:            v0 = new String("Unable to export ");
 88:        Toast.makeText(this, v0, 0).show();
        }
 91:    return;
 95:    v0 = new Object[1];
101:    v0[0] = ex.getMessage();
103:    FinskyLog.d("Unable to export: %s", v0);
106:    v0 = 0;
107:    goto 66;
114:    try
            run 2...66
        catch (IOException ex) {
  2:        goto 92;
        }
    }

    private final void a(String p0, String p1) {
        v0 = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        v0.putExtra(p0, p1);
        this.sendBroadcast(v0);
    }

    private static String b(int p0) {
        switch (p0) {
            case 1:
                v0 = "IDLE";
                break;
            case 2:
                v0 = "JITTERING";
                break;
            case 3:
                v0 = "SCHEDULED";
                break;
            case 4:
                v0 = "SYNCING";
                break;
            case 5:
                v0 = "COMPLETED";
                break;
            default:
                v0 = "UNKNOWN";
                break;
        }
        return v0;
    }

    public static void c() {
        v1 = com.google.android.finsky.aa.a.aq.b(com.google.android.finsky.m.a.cZ());
        v2 = com.google.android.finsky.aa.a.Z.b(com.google.android.finsky.m.a.cZ());
        v3 = com.google.android.finsky.aa.a.ao.b(com.google.android.finsky.m.a.cZ());
        if (TextUtils.isEmpty((CharSequence)v3.a()) && !((Boolean)com.google.android.finsky.aa.a.ap.a()).booleanValue() && TextUtils.isEmpty((CharSequence)v2.a()))
            v1.c();
        else {
            v4 = new com.google.wireless.android.finsky.dfe.nano.bq();
            if (!TextUtils.isEmpty((CharSequence)v3.a())) {
                v0 = (String)v3.a();
                if (v0 == 0)
                    throw new NullPointerException();
                v4.a = v4.a | 1;
                v4.b = v0;
            }
            if (com.google.android.finsky.aa.a.ap.b()) {
                v4.a = v4.a | 2;
                v4.c = ((Boolean)com.google.android.finsky.aa.a.ap.a()).booleanValue();
            }
            if (!TextUtils.isEmpty((CharSequence)v2.a())) {
                v0 = (String)v2.a();
                if (v0 == 0)
                    throw new NullPointerException();
                v4.a = v4.a | 4;
                v4.d = v0;
            }
            v1.a(Base64.encodeToString(com.google.protobuf.nano.i.a(v4), 10));
        }
    }

    final void a(com.google.android.finsky.al.b p0) {
        this.a(com.google.android.finsky.api.f.g, p0.a);
        this.a(com.google.android.finsky.api.f.a, p0.b);
        this.a("wallet.mcc_mnc_override", p0.b);
    }

    final void a(com.google.android.finsky.al.e p0) {
        v0 = 0;
        if (p0 != 0) {
            if (p0.a != 0) {
                v0 = String.valueOf(com.google.android.finsky.m.a.aM().b);
                v0 = (String.valueOf(v0).length() + 9 + String.valueOf(p0.a).length()) + v0 + " rewrite " + p0.a;
            }
            v1 = p0.b;
            v2 = v0;
            v0 = p0.c;
        }
        else {
            v1 = 0;
            v2 = 0;
        }
        this.a("url:finsky_dfe_url", v2);
        this.a(com.google.android.finsky.aa.b.jq, v1);
        this.a(com.google.android.finsky.aa.b.iu, v0);
    }

    protected final void a(com.google.android.play.utils.b.a p0, String p1) {
        this.a(p0.b, p1);
    }

    protected final void a(boolean p0) {
        com.google.android.finsky.dx.a.b(com.google.android.finsky.m.a.cZ(), 7);
        com.google.android.finsky.m.a.bk().a(new com.google.android.finsky.activities.ao(this, p0), "debug_clear_cache");
    }

    protected abstract boolean a();

    final void b() {
        if (this.f != 0)
            v0 = 1;
        else
            v0 = 0;
        this.findPreference("instant_apps").setEnabled(v0);
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1:
                com.google.android.finsky.m.a.ai().a(new com.google.android.finsky.activities.ai(), "DebugActivity");
                break;
            default:
                break;
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (!((Boolean)com.google.android.finsky.aa.b.h.b()).booleanValue())
            this.finish();
        else {
            this.addPreferencesFromResource(2131296257);
            if (com.google.android.finsky.m.a.dj().k()) {
                this.addPreferencesFromResource(2131296258);
                this.addPreferencesFromResource(2131296259);
                this.addPreferencesFromResource(2131296260);
                ((CheckBoxPreference)this.findPreference("stream_debugging")).setChecked(((Boolean)com.google.android.finsky.aa.b.i.b()).booleanValue());
            }
            this.a();
            ((CheckBoxPreference)this.findPreference("image_debugging")).setChecked(((Boolean)com.google.android.play.utils.b.j.z.b()).booleanValue());
            ((CheckBoxPreference)this.findPreference("skip_all_caches")).setChecked(((Boolean)com.google.android.finsky.api.f.H.b()).booleanValue());
            if (((Boolean)com.google.android.play.utils.b.j.A.b()).booleanValue()) {
                switch (((Integer)com.google.android.play.utils.b.j.B.b()).intValue()) {
                    case 1:
                        v0 = "2G";
                        break;
                    case 2:
                        v0 = "3G";
                        break;
                    case 3:
                        v0 = "4G";
                        break;
                    case 4:
                        v0 = "WIFI";
                        break;
                    default:
                        this.a(com.google.android.play.utils.b.j.B, Integer.toString(1));
                        v0 = "2G";
                        break;
                }
                v0 = String.valueOf(v0);
                if (v0.length() != 0)
                    v0 = "Current overridden network type: ".concat(v0);
                else
                    v0 = new String("Current overridden network type: ");
                this.findPreference("force_network_type").setSummary(v0);
            }
            ((CheckBoxPreference)this.findPreference("show_staging_data")).setChecked(((Boolean)com.google.android.finsky.api.f.I.b()).booleanValue());
            ((CheckBoxPreference)this.findPreference("disable_personalization")).setChecked(((Boolean)com.google.android.finsky.api.f.J.b()).booleanValue());
            v0 = (CheckBoxPreference)this.findPreference("verbose_volley_logging");
            v0.setChecked(Log.isLoggable("Volley", 2));
            v0.setEnabled(0);
            ((CheckBoxPreference)this.findPreference("fake_item_rater")).setChecked(((Boolean)com.google.android.finsky.aa.a.ai.a()).booleanValue());
            this.b();
            v4 = new Object[2];
            v4[0] = com.google.android.finsky.activities.t.a(((Integer)com.google.android.finsky.ai.b.d.a()).intValue());
            v4[1] = com.google.android.finsky.activities.t.b(((Integer)com.google.android.finsky.ai.b.e.a()).intValue());
            this.findPreference("cache_and_sync_info").setSummary(this.getResources().getString(2131951967, v4));
            ((CheckBoxPreference)this.findPreference("force_dapper_trace")).setChecked(((Boolean)com.google.android.finsky.aa.a.ap.a()).booleanValue());
            this.c = new com.google.android.finsky.al.a(new com.google.android.finsky.activities.aw(this));
            this.d = new com.google.android.finsky.al.d(this, new com.google.android.finsky.activities.ax(this));
            this.getListView().setCacheColorHint(this.getResources().getColor(2131558698));
            this.b = new com.google.android.finsky.activities.x(this);
            if (this.f == 0)
                FinskyLog.a(37 + "Play Install Service connected: " + this.getApplicationContext().bindService(new Intent(this, PlayInstallService), this.g, 1), new Object[0]);
        }
    }

    protected void onDestroy() {
        if (this.f != 0)
            this.getApplicationContext().unbindService(this.g);
        this.f = 0;
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen p0, Preference p1) {
        v2 = 0;
        v6 = 1;
        v1 = p1.getKey();
        if ("image_debugging".equals(v1)) {
            if (!((Boolean)com.google.android.play.utils.b.j.z.b()).booleanValue())
                v0 = 1;
            else
                v0 = 0;
            this.a(com.google.android.play.utils.b.j.z, Boolean.toString(v0).toLowerCase());
        }
        else {
            if ("stream_debugging".equals(v1)) {
                if (!((Boolean)com.google.android.finsky.aa.b.i.b()).booleanValue())
                    v0 = 1;
                else
                    v0 = 0;
                this.a(com.google.android.finsky.aa.b.i, Boolean.toString(v0).toLowerCase());
                v1 = com.google.android.finsky.aa.a.Z.b(com.google.android.finsky.m.a.cZ());
                if (v0 != 0) {
                    v0 = new long[1];
                    v0[0] = 12633447;
                    v1.a(com.google.android.finsky.utils.k.a(v0));
                }
                else
                    v1.a("");
                new Handler(Looper.getMainLooper()).postDelayed(new com.google.android.finsky.activities.ar(this), 3000);
                return v6;
            }
            if ("skip_all_caches".equals(v1)) {
                if (!((Boolean)com.google.android.finsky.api.f.H.b()).booleanValue())
                    v0 = 1;
                else
                    v0 = 0;
                this.a(com.google.android.finsky.api.f.H, Boolean.toString(v0).toLowerCase());
            }
            if (!"force_network_type".equals(v1)) {
                if ("environments".equals(v1)) {
                    this.a(this.d, "marketenvs.csv", "Switching environment...", 2131953120, "Default");
                    return v6;
                }
                if ("clear_cache".equals(v1)) {
                    this.a(0);
                    return v6;
                }
                if ("show_staging_data".equals(v1)) {
                    if (!((Boolean)com.google.android.finsky.api.f.I.b()).booleanValue())
                        v0 = 1;
                    else
                        v0 = 0;
                    this.a(com.google.android.finsky.api.f.I, Boolean.toString(v0).toLowerCase());
                    this.a(0);
                    return v6;
                }
                if ("disable_personalization".equals(v1)) {
                    if (!((Boolean)com.google.android.finsky.api.f.J.b()).booleanValue())
                        v0 = 1;
                    else
                        v0 = 0;
                    this.a(com.google.android.finsky.api.f.J, Boolean.toString(v0));
                    this.a(0);
                    return v6;
                }
                if ("reset_all".equals(v1)) {
                    this.a(com.google.android.play.utils.b.j.z, "false");
                    this.a(com.google.android.finsky.al.e.d);
                    this.a(com.google.android.finsky.al.b.c);
                    com.google.android.finsky.aa.a.Z.b(com.google.android.finsky.m.a.cZ()).c();
                    this.a(0);
                    return v6;
                }
                if ("country".equals(v1)) {
                    this.a(this.c, "carriers.csv", "Switching country...", 2131953119, "Default");
                    return v6;
                }
                if ("play_country".equals(v1)) {
                    com.google.android.finsky.m.a.ap().f(0, new com.google.android.finsky.activities.y(this), new com.google.android.finsky.activities.z(this));
                    return v6;
                }
                if ("locale".equals(v1)) {
                    v0 = (String)com.google.android.finsky.aa.a.ao.b(com.google.android.finsky.m.a.cZ()).a();
                    if (TextUtils.isEmpty(v0))
                        v1 = Locale.getDefault().toString();
                    else
                        v1 = v0;
                    v3 = LayoutInflater.from(this).inflate(2130968726, 0);
                    if (TextUtils.isEmpty(v1))
                        v1 = "";
                    v5 = new Object[1];
                    v5[0] = v1;
                    ((TextView)v3.findViewById(2131755556)).setText(this.getString(2131951988, v5));
                    v0 = (EditText)v3.findViewById(2131755557);
                    v1 = new com.google.android.wallet.ui.common.a(this).a("Locale").a(v3).a(this.getString(2131952688), new com.google.android.finsky.activities.al(this, v0, (EditText)v3.findViewById(2131755558))).b(this.getString(2131951799), new com.google.android.finsky.activities.ak()).a();
                    v1.setOnShowListener(new com.google.android.finsky.activities.am(this, v0));
                    v1.show();
                    return v6;
                }
                if ("export_library".equals(v1)) {
                    this.a(com.google.android.finsky.bn.f.b(0));
                    v3 = com.google.android.finsky.bn.f.getDatabaseNodes(this);
                    v0 = 0;
                    v1 = 1;
                    while (v0 < v3.length) {
                        this.a(com.google.android.finsky.bn.f.b(v3[v0]));
                        v1 = v1 + 1;
                        v0 = v0 + 1;
                    }
                    this.a("library.db");
                    v3 = new Object[1];
                    v3[0] = Integer.valueOf(v1 + 1);
                    Toast.makeText(this, String.format("Finished %d database exports", v3), 0).show();
                    return v6;
                }
                if ("dump_library_state".equals(v1)) {
                    Log.d("FinskyLibrary", "------------ LIBRARY DUMP BEGIN");
                    com.google.android.finsky.m.a.ah().f();
                    com.google.android.finsky.m.a.ai().b();
                    Log.d("FinskyLibrary", "------------ LIBRARY DUMP END");
                    Toast.makeText(this, "Library state dumped to logcat.", 0).show();
                    return v6;
                }
                if ("fake_item_rater".equals(v1)) {
                    if (((Boolean)com.google.android.finsky.aa.a.ai.a()).booleanValue())
                        v6 = 0;
                    com.google.android.finsky.aa.a.ai.a(Boolean.valueOf(v6));
                }
                else if ("flush_eventlog".equals(v1)) {
                    com.google.android.finsky.m.a.aX().b();
                    Toast.makeText(this, "Flushing event logs", 0).show();
                }
                else if ("force_refresh_user_settings".equals(v1)) {
                    this.e.a();
                    Toast.makeText(this, "Refreshing user settings...", 0).show();
                }
                else if ("dump_family_status".equals(v1)) {
                    v0 = com.google.android.finsky.m.a.aY().c().p();
                    Log.i("Family", v0);
                    new com.google.android.wallet.ui.common.a(this).a("Family status").b(v0).b();
                }
                else if ("run_daily_hygiene".equals(v1)) {
                    FinskyLog.a("Manually trigger daily hygiene", new Object[0]);
                    com.google.android.finsky.m.a.aW().e();
                }
                else if ("gms_core_details".equals(v1))
                    this.startActivity(new Intent("android.intent.action.VIEW", com.google.android.finsky.activities.t.a));
                else if ("instant_apps".equals(v1)) {
                    if (this.f == 0)
                        Toast.makeText(this, "Play Install Service not connected", 0).show();
                    else {
                        try {
                            this.f.a(this.getPackageName(), "com.google.android.instantapps.supervisor", new Bundle());
                        }
                        catch (RemoteException ex) {
                            FinskyLog.a(ex, "Failed to install instant apps supervisor.", new Object[0]);
                            Toast.makeText(this, "Failed to install instant apps supervisor", 1).show();
                        }
                    }
                }
                else if ("cache_and_sync_info".equals(v1)) {
                    v4 = this.getLayoutInflater().inflate(2130968673, 0);
                    v5 = ((Integer)com.google.android.finsky.ai.b.d.a()).intValue();
                    ((TextView)v4.findViewById(2131755410)).setText(com.google.android.finsky.activities.t.a(v5));
                    ((TextView)v4.findViewById(2131755411)).setText(com.google.android.finsky.activities.t.b(((Integer)com.google.android.finsky.ai.b.e.a()).intValue()));
                    ((TextView)v4.findViewById(2131755412)).setText(com.google.android.finsky.activities.t.a(((Long)com.google.android.finsky.ai.b.j.a()).longValue()));
                    ((TextView)v4.findViewById(2131755413)).setText(com.google.android.finsky.activities.t.a(((Long)com.google.android.finsky.ai.b.t.a()).longValue()));
                    ((TextView)v4.findViewById(2131755414)).setText((CharSequence)com.google.android.finsky.ai.b.u.a());
                    if (v5 == 3) {
                        ((TextView)v4.findViewById(2131755416)).setText(com.google.android.finsky.activities.t.a(((Long)com.google.android.finsky.ai.b.h.a()).longValue()));
                        v3 = ((Integer)com.google.android.finsky.ai.b.m.a()).intValue();
                        v1 = ((Integer)com.google.android.finsky.ai.b.p.a()).intValue();
                    }
                    else {
                        v4.findViewById(2131755415).setVisibility(8);
                        v3 = ((Integer)com.google.android.finsky.ai.b.l.a()).intValue();
                        v1 = ((Integer)com.google.android.finsky.ai.b.o.a()).intValue();
                    }
                    v9 = new Object[1];
                    v9[0] = Integer.valueOf(v3);
                    ((TextView)v4.findViewById(2131755417)).setText(String.format(Locale.US, "%d", v9));
                    v6 = new Object[1];
                    v6[0] = Integer.valueOf(v1);
                    ((TextView)v4.findViewById(2131755418)).setText(String.format(Locale.US, "%d", v6));
                    if (v5 == 4) {
                        if (com.google.android.finsky.ai.a.a(com.google.android.finsky.m.a.dl()))
                            v1 = "Yes";
                        else
                            v1 = "No";
                        ((TextView)v4.findViewById(2131755420)).setText(v1);
                    }
                    else
                        v4.findViewById(2131755419).setVisibility(8);
                    new com.google.android.wallet.ui.common.a(this).a(this.getResources().getString(2131951962)).a(v4).b(this.getString(2131951799), new com.google.android.finsky.activities.aq()).a().show();
                }
                else if ("trigger_cache_and_sync".equals(v1)) {
                    FinskyLog.b("Manually trigger Cache and Sync and Restart.", new Object[0]);
                    this.a(com.google.android.finsky.aa.b.dB.b, "60");
                    this.a(com.google.android.finsky.aa.b.dC.b, "10");
                    this.a(com.google.android.finsky.aa.b.j.b, Boolean.TRUE.toString());
                    com.google.android.finsky.m.a.bk().a(0, "debug_clear_cache");
                    com.google.android.finsky.ai.b.s.c();
                    new com.google.android.finsky.datasync.p(com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.aT(), com.google.android.finsky.m.a.aN(), 1).a();
                    Toast.makeText(this, "Cache And Sync scheduled", 0).show();
                }
                else if ("upload_device_config".equals(v1)) {
                    v0 = com.google.android.finsky.deviceconfig.e.a();
                    v0.a(com.google.android.finsky.m.a.ap(), new com.google.android.finsky.activities.aj(this, v0), 1, 1);
                }
                else if ("run_instant_apps_hygiene".equals(v1)) {
                    if (android.support.v4.os.a.b()) {
                        if (InstantAppHygieneService.a(this))
                            Toast.makeText(this, "One off hygiene successfully scheduled", 0).show();
                        else
                            Toast.makeText(this, "One off hygiene failed to schedule", 0).show();
                    }
                    else
                        Toast.makeText(this, "Instant Apps hygiene service not supported on this device", 1).show();
                }
                else {
                    if (!"force_dapper_trace".equals(v1)) {
                        if ("override_server_experiments".equals(v1)) {
                            v2 = com.google.android.finsky.aa.a.Z.b(com.google.android.finsky.m.a.cZ());
                            v0 = (String)v2.a();
                            v3 = LayoutInflater.from(this).inflate(2130968728, 0);
                            v1 = (EditText)v3.findViewById(2131755566);
                            if (TextUtils.isEmpty(v0))
                                v0 = "";
                            v1.setText(v0);
                            v0 = new com.google.android.wallet.ui.common.a(this).a(this.getString(2131952002)).a(v3).a(this.getString(2131952688), new com.google.android.finsky.activities.au(this, v1, v2)).b(this.getString(2131951799), new com.google.android.finsky.activities.at());
                            v3 = this.getString(2131952012);
                            v4 = new com.google.android.finsky.activities.as(this, v2);
                            if (v0.b != 0)
                                v0.b.setNeutralButton(v3, v4);
                            else
                                v0.a.c(v3, v4);
                            v0 = v0.a();
                            v0.setOnShowListener(new com.google.android.finsky.activities.av(this, v1));
                            v0.show();
                            return v6;
                        }
                        if ("override_client_experiments".equals(v1)) {
                            new com.google.android.finsky.activities.ff().show(this.getFragmentManager(), this.getResources().getString(2131951996));
                            return v6;
                        }
                        if ("override_client_phenotype_experiments".equals(v1)) {
                            new com.google.android.finsky.activities.fl().show(this.getFragmentManager(), this.getResources().getString(2131951999));
                            return v6;
                        }
                        if ("clear_tos_preferences".equals(v1)) {
                            v0 = com.google.android.finsky.m.a.cZ();
                            com.google.android.finsky.aa.a.G.b(v0).c();
                            com.google.android.finsky.aa.a.D.b(v0).c();
                            com.google.android.finsky.aa.a.F.b(v0).c();
                            this.a(0);
                            Toast.makeText(this, "TOS preferences deleted", 0).show();
                            return v6;
                        }
                        if ("test_update_notification".equals(v1)) {
                            new com.google.android.finsky.activities.bc().show(this.getFragmentManager(), "debug-notification-assist-dialog");
                            return v6;
                        }
                        if (!"schedule_debug_jobs".equals(v1)) {
                            v6 = super.onPreferenceTreeClick(p0, p1);
                            return v6;
                        }
                        v1 = this.getLayoutInflater().inflate(2130969357, 0);
                        v4 = new String[4];
                        v4[0] = "None";
                        v4[1] = "Any";
                        v4[2] = "Unmetered";
                        v4[3] = "NotRoaming";
                        ((Spinner)v1.findViewById(2131756668)).setAdapter(new ArrayAdapter(this, 17367049, v4));
                        v1.findViewById(2131756669).setOnClickListener(new com.google.android.finsky.activities.u(this, v1));
                        v1.findViewById(2131756670).setOnClickListener(new com.google.android.finsky.activities.v(this));
                        new com.google.android.wallet.ui.common.a(this).a("Schedule Debug Jobs").a(v1).b(this.getString(2131951822), com.google.android.finsky.activities.w.a).a().show();
                        return v6;
                    }
                    if (com.google.android.finsky.aa.a.ap.b())
                        com.google.android.finsky.aa.a.ap.c();
                    else
                        com.google.android.finsky.aa.a.ap.a(Boolean.valueOf(1));
                    com.google.android.finsky.activities.t.c();
                }
                v6 = super.onPreferenceTreeClick(p0, p1);
                return v6;
            }
            v4 = new com.google.android.wallet.ui.common.a(this);
            v4.a(2131953122);
            v5 = this.getResources().getStringArray(2131427328);
            if (((Boolean)com.google.android.play.utils.b.j.A.b()).booleanValue()) {
                switch (((Integer)com.google.android.play.utils.b.j.B.b()).intValue()) {
                    case 1:
                        v2 = 3;
                        break;
                    case 2:
                        v2 = 2;
                        break;
                    case 3:
                        v2 = 1;
                        break;
                    case 4:
                        break;
                    default:
                        v2 = 3;
                        break;
                }
            }
            else
                v2 = v5.length - 1;
            v4.a(v5, v2, new com.google.android.finsky.activities.aa());
            v4.a(this.getString(2131952688), new com.google.android.finsky.activities.ab(this));
            v4.b(this.getString(2131951799), new com.google.android.finsky.activities.ac());
            v4.a().show();
        }
        return v6;
    }

}
