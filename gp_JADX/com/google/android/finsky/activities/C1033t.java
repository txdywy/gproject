package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ai.C1188a;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.al.C1216i;
import com.google.android.finsky.al.C1217a;
import com.google.android.finsky.al.C1218b;
import com.google.android.finsky.al.C1219c;
import com.google.android.finsky.al.C1220d;
import com.google.android.finsky.al.C1221e;
import com.google.android.finsky.al.C1225k;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.bn.C2132f;
import com.google.android.finsky.datasync.C2530p;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.installapi.C3267a;
import com.google.android.finsky.installapi.PlayInstallService;
import com.google.android.finsky.instantapps.InstantAppHygieneService;
import com.google.android.finsky.p112u.C1032a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.p354b.C6321a;
import com.google.android.play.utils.p354b.C6322j;
import com.google.android.wallet.ui.common.a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.bq;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public abstract class C1033t extends C1032a {
    public static final Uri f6306a = Uri.parse("market://details?id=com.google.android.gms");
    public Runnable f6307b;
    public C1217a f6308c;
    public C1220d f6309d;
    public final C2910a f6310e = C1473m.f7980a.au();
    public C3267a f6311f;
    public final ServiceConnection f6312g = new ap(this);

    protected abstract boolean mo1228a();

    public static void m6037a(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (((Boolean) C0955b.f5891h.m28964b()).booleanValue()) {
            i = 1;
        } else {
            i = 2;
        }
        packageManager.setComponentEnabledSetting(new ComponentName(context, DebugActivity.class), i, 1);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((Boolean) C0955b.f5891h.m28964b()).booleanValue()) {
            String valueOf;
            addPreferencesFromResource(C7582R.xml.debug);
            if (C1473m.f7980a.dj().mo2304k()) {
                addPreferencesFromResource(C7582R.xml.debug_experiment_overrides);
                addPreferencesFromResource(C7582R.xml.debug_phenotype);
                addPreferencesFromResource(C7582R.xml.debug_stream);
                ((CheckBoxPreference) findPreference("stream_debugging")).setChecked(((Boolean) C0955b.f5892i.m28964b()).booleanValue());
            }
            mo1228a();
            ((CheckBoxPreference) findPreference("image_debugging")).setChecked(((Boolean) C6322j.f31612z.m28964b()).booleanValue());
            ((CheckBoxPreference) findPreference("skip_all_caches")).setChecked(((Boolean) C1285f.f7590H.m28964b()).booleanValue());
            Preference findPreference = findPreference("force_network_type");
            if (((Boolean) C6322j.f31571A.m28964b()).booleanValue()) {
                Object obj;
                CharSequence concat;
                switch (((Integer) C6322j.f31572B.m28964b()).intValue()) {
                    case 1:
                        obj = "2G";
                        break;
                    case 2:
                        obj = "3G";
                        break;
                    case 3:
                        obj = "4G";
                        break;
                    case 4:
                        obj = "WIFI";
                        break;
                    default:
                        m6046a(C6322j.f31572B, Integer.toString(1));
                        obj = "2G";
                        break;
                }
                String str = "Current overridden network type: ";
                valueOf = String.valueOf(obj);
                if (valueOf.length() != 0) {
                    concat = str.concat(valueOf);
                } else {
                    concat = new String(str);
                }
                findPreference.setSummary(concat);
            }
            ((CheckBoxPreference) findPreference("show_staging_data")).setChecked(((Boolean) C1285f.f7591I.m28964b()).booleanValue());
            ((CheckBoxPreference) findPreference("disable_personalization")).setChecked(((Boolean) C1285f.f7592J.m28964b()).booleanValue());
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("verbose_volley_logging");
            checkBoxPreference.setChecked(Log.isLoggable("Volley", 2));
            checkBoxPreference.setEnabled(false);
            ((CheckBoxPreference) findPreference("fake_item_rater")).setChecked(((Boolean) C0954a.ai.m5760a()).booleanValue());
            m6049b();
            String a = C1033t.m6035a(((Integer) C1189b.f7268d.m5760a()).intValue());
            valueOf = C1033t.m6042b(((Integer) C1189b.f7269e.m5760a()).intValue());
            findPreference("cache_and_sync_info").setSummary(getResources().getString(C7582R.string.debug_cache_and_sync_pref_summary, new Object[]{a, valueOf}));
            ((CheckBoxPreference) findPreference("force_dapper_trace")).setChecked(((Boolean) C0954a.ap.m5760a()).booleanValue());
            this.f6308c = new C1217a(new aw(this));
            this.f6309d = new C1220d(this, new ax(this));
            getListView().setCacheColorHint(getResources().getColor(C7582R.color.play_main_background));
            this.f6307b = new C1133x(this);
            if (this.f6311f == null) {
                FinskyLog.m21659a("Play Install Service connected: " + getApplicationContext().bindService(new Intent(this, PlayInstallService.class), this.f6312g, 1), new Object[0]);
                return;
            }
            return;
        }
        finish();
    }

    protected void onDestroy() {
        if (this.f6311f != null) {
            getApplicationContext().unbindService(this.f6312g);
        }
        this.f6311f = null;
        super.onDestroy();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                C1473m.f7980a.ai().mo2799a(new ai(), "DebugActivity");
                return;
            default:
                return;
        }
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        int i = 0;
        boolean z = true;
        String key = preference.getKey();
        C6321a c6321a;
        boolean z2;
        if ("image_debugging".equals(key)) {
            c6321a = C6322j.f31612z;
            if (((Boolean) C6322j.f31612z.m28964b()).booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m6046a(c6321a, Boolean.toString(z2).toLowerCase());
            return true;
        } else if ("stream_debugging".equals(key)) {
            z2 = !((Boolean) C0955b.f5892i.m28964b()).booleanValue();
            m6046a(C0955b.f5892i, Boolean.toString(z2).toLowerCase());
            r1 = C0954a.f5830Z.m5777b(C1473m.f7980a.cZ());
            if (z2) {
                r1.m5763a(C4680k.m21816a(new long[]{12633447}));
            } else {
                r1.m5763a((Object) "");
            }
            new Handler(Looper.getMainLooper()).postDelayed(new ar(this), 3000);
            return true;
        } else {
            if ("skip_all_caches".equals(key)) {
                m6046a(C1285f.f7590H, Boolean.toString(!((Boolean) C1285f.f7590H.m28964b()).booleanValue()).toLowerCase());
            }
            int length;
            if ("force_network_type".equals(key)) {
                a aVar = new a(this);
                aVar.a(C7582R.string.select_your_network_type);
                CharSequence[] stringArray = getResources().getStringArray(C7582R.array.debug_available_network_types);
                length = stringArray.length - 1;
                if (((Boolean) C6322j.f31571A.m28964b()).booleanValue()) {
                    switch (((Integer) C6322j.f31572B.m28964b()).intValue()) {
                        case 1:
                            i = 3;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            break;
                        default:
                            i = 3;
                            break;
                    }
                }
                i = length;
                aVar.a(stringArray, i, new aa());
                aVar.a(getString(C7582R.string.ok), new ab(this));
                aVar.b(getString(C7582R.string.cancel), new ac());
                aVar.a().show();
                return true;
            } else if ("environments".equals(key)) {
                m6039a(this.f6309d, "marketenvs.csv", "Switching environment...", C7582R.string.select_environment, "Default");
                return true;
            } else if ("clear_cache".equals(key)) {
                m6047a(false);
                return true;
            } else if ("show_staging_data".equals(key)) {
                c6321a = C1285f.f7591I;
                if (((Boolean) C1285f.f7591I.m28964b()).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                m6046a(c6321a, Boolean.toString(z2).toLowerCase());
                m6047a(false);
                return true;
            } else if ("disable_personalization".equals(key)) {
                c6321a = C1285f.f7592J;
                if (((Boolean) C1285f.f7592J.m28964b()).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                m6046a(c6321a, Boolean.toString(z2));
                m6047a(false);
                return true;
            } else if ("reset_all".equals(key)) {
                m6046a(C6322j.f31612z, "false");
                m6045a(C1221e.f7348d);
                m6044a(C1218b.f7342c);
                C0954a.f5830Z.m5777b(C1473m.f7980a.cZ()).m5765c();
                m6047a(false);
                return true;
            } else if ("country".equals(key)) {
                m6039a(this.f6308c, "carriers.csv", "Switching country...", C7582R.string.select_carrier, "Default");
                return true;
            } else if ("play_country".equals(key)) {
                C1473m.f7980a.ap().mo1649f(null, new C1134y(this), new C1135z(this));
                return true;
            } else if ("locale".equals(key)) {
                CharSequence locale;
                r0 = (String) C0954a.ao.m5777b(C1473m.f7980a.cZ()).m5760a();
                if (TextUtils.isEmpty(r0)) {
                    locale = Locale.getDefault().toString();
                } else {
                    Object obj = r0;
                }
                r3 = LayoutInflater.from(this).inflate(C7582R.layout.debug_locale_dialog, null);
                TextView textView = (TextView) r3.findViewById(C7582R.id.current);
                if (TextUtils.isEmpty(locale)) {
                    locale = "";
                }
                textView.setText(getString(C7582R.string.debug_locale_override_current, new Object[]{locale}));
                EditText editText = (EditText) r3.findViewById(C7582R.id.edit_language);
                Dialog a = new a(this).a("Locale").a(r3).a(getString(C7582R.string.ok), new al(this, editText, (EditText) r3.findViewById(C7582R.id.edit_country))).b(getString(C7582R.string.cancel), new ak()).a();
                a.setOnShowListener(new am(this, editText));
                a.show();
                return true;
            } else if ("export_library".equals(key)) {
                m6040a(C2132f.m11165b(null));
                length = 1;
                for (String b : C2132f.getDatabaseNodes(this)) {
                    m6040a(C2132f.m11165b(b));
                    length++;
                }
                m6040a("library.db");
                int i2 = length + 1;
                Toast.makeText(this, String.format("Finished %d database exports", new Object[]{Integer.valueOf(i2)}), 0).show();
                return true;
            } else if ("dump_library_state".equals(key)) {
                Log.d("FinskyLibrary", "------------ LIBRARY DUMP BEGIN");
                C1473m.f7980a.ah().mo2823f();
                C1473m.f7980a.ai().mo2800b();
                Log.d("FinskyLibrary", "------------ LIBRARY DUMP END");
                Toast.makeText(this, "Library state dumped to logcat.", 0).show();
                return true;
            } else {
                if ("fake_item_rater".equals(key)) {
                    r1 = C0954a.ai;
                    if (((Boolean) C0954a.ai.m5760a()).booleanValue()) {
                        z = false;
                    }
                    r1.m5763a(Boolean.valueOf(z));
                } else if ("flush_eventlog".equals(key)) {
                    C1473m.f7980a.aX().m16009b();
                    Toast.makeText(this, "Flushing event logs", 0).show();
                } else if ("force_refresh_user_settings".equals(key)) {
                    this.f6310e.m15181a();
                    Toast.makeText(this, "Refreshing user settings...", 0).show();
                } else if ("dump_family_status".equals(key)) {
                    r0 = C1473m.f7980a.aY().mo2313c().mo2335p();
                    Log.i("Family", r0);
                    new a(this).a("Family status").b(r0).b();
                } else if ("run_daily_hygiene".equals(key)) {
                    FinskyLog.m21659a("Manually trigger daily hygiene", new Object[0]);
                    C1473m.f7980a.aW().mo3367e();
                } else if ("gms_core_details".equals(key)) {
                    startActivity(new Intent("android.intent.action.VIEW", f6306a));
                } else if ("instant_apps".equals(key)) {
                    if (this.f6311f == null) {
                        Toast.makeText(this, "Play Install Service not connected", 0).show();
                    } else {
                        try {
                            this.f6311f.mo3401a(getPackageName(), "com.google.android.instantapps.supervisor", new Bundle());
                        } catch (Throwable e) {
                            FinskyLog.m21660a(e, "Failed to install instant apps supervisor.", new Object[0]);
                            Toast.makeText(this, "Failed to install instant apps supervisor", 1).show();
                        }
                    }
                } else if ("cache_and_sync_info".equals(key)) {
                    int intValue;
                    View inflate = getLayoutInflater().inflate(C7582R.layout.cache_and_sync_state_dialog, null);
                    int intValue2 = ((Integer) C1189b.f7268d.m5760a()).intValue();
                    length = ((Integer) C1189b.f7269e.m5760a()).intValue();
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_cache_state)).setText(C1033t.m6035a(intValue2));
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_sync_state)).setText(C1033t.m6042b(length));
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_last_sync_completed_time)).setText(C1033t.m6036a(((Long) C1189b.f7274j.m5760a()).longValue()));
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_last_cache_clear_time)).setText(C1033t.m6036a(((Long) C1189b.f7284t.m5760a()).longValue()));
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_last_cache_clear_reason)).setText((CharSequence) C1189b.f7285u.m5760a());
                    if (intValue2 == 3) {
                        ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_sync_start_time)).setText(C1033t.m6036a(((Long) C1189b.f7272h.m5760a()).longValue()));
                        intValue = ((Integer) C1189b.f7277m.m5760a()).intValue();
                        length = ((Integer) C1189b.f7280p.m5760a()).intValue();
                    } else {
                        inflate.findViewById(C7582R.id.debug_cache_and_sync_sync_start_time_container).setVisibility(8);
                        intValue = ((Integer) C1189b.f7276l.m5760a()).intValue();
                        length = ((Integer) C1189b.f7279o.m5760a()).intValue();
                    }
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_dfe_entries_expected)).setText(String.format(Locale.US, "%d", new Object[]{Integer.valueOf(intValue)}));
                    ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_dfe_entries_synced)).setText(String.format(Locale.US, "%d", new Object[]{Integer.valueOf(length)}));
                    if (intValue2 == 4) {
                        ((TextView) inflate.findViewById(C7582R.id.cache_and_sync_marker_entry_in_cache)).setText(C1188a.m7140a(C1473m.f7980a.dl()) ? "Yes" : "No");
                    } else {
                        inflate.findViewById(C7582R.id.debug_cache_and_sync_marker_entry_in_cache_container).setVisibility(8);
                    }
                    new a(this).a(getResources().getString(C7582R.string.debug_cache_and_sync_info_title)).a(inflate).b(getString(C7582R.string.cancel), new aq()).a().show();
                } else if ("trigger_cache_and_sync".equals(key)) {
                    FinskyLog.m21662b("Manually trigger Cache and Sync and Restart.", new Object[0]);
                    m6041a(C0955b.dB.f31570b, "60");
                    m6041a(C0955b.dC.f31570b, "10");
                    m6041a(C0955b.f5894j.f31570b, Boolean.TRUE.toString());
                    C1473m.f7980a.bk().mo4380a(null, "debug_clear_cache");
                    C1189b.f7283s.m5765c();
                    new C2530p(C1473m.f7980a.f7981b, C1473m.f7980a.aT(), C1473m.f7980a.aN(), true).m13472a();
                    Toast.makeText(this, "Cache And Sync scheduled", 0).show();
                } else if ("upload_device_config".equals(key)) {
                    C2693e a2 = C2693e.m14552a();
                    a2.m14562a(C1473m.f7980a.ap(), new aj(this, a2), true, true);
                } else if ("run_instant_apps_hygiene".equals(key)) {
                    if (!C0327a.m1722b()) {
                        Toast.makeText(this, "Instant Apps hygiene service not supported on this device", 1).show();
                    } else if (InstantAppHygieneService.m16862a((Context) this)) {
                        Toast.makeText(this, "One off hygiene successfully scheduled", 0).show();
                    } else {
                        Toast.makeText(this, "One off hygiene failed to schedule", 0).show();
                    }
                } else if ("force_dapper_trace".equals(key)) {
                    if (C0954a.ap.m5764b()) {
                        C0954a.ap.m5765c();
                    } else {
                        C0954a.ap.m5763a(Boolean.valueOf(true));
                    }
                    C1033t.m6043c();
                } else if ("override_server_experiments".equals(key)) {
                    C0957n b2 = C0954a.f5830Z.m5777b(C1473m.f7980a.cZ());
                    r0 = (String) b2.m5760a();
                    r3 = LayoutInflater.from(this).inflate(C7582R.layout.debug_override_server_experiments, null);
                    EditText editText2 = (EditText) r3.findViewById(C7582R.id.edit);
                    if (TextUtils.isEmpty(r0)) {
                        r0 = "";
                    }
                    editText2.setText(r0);
                    a b3 = new a(this).a(getString(C7582R.string.debug_override_server_experiments_title)).a(r3).a(getString(C7582R.string.ok), new au(this, editText2, b2)).b(getString(C7582R.string.cancel), new at());
                    CharSequence string = getString(C7582R.string.debug_reset);
                    OnClickListener asVar = new as(this, b2);
                    if (b3.b != null) {
                        b3.b.setNeutralButton(string, asVar);
                    } else {
                        b3.a.m2646c(string, asVar);
                    }
                    Dialog a3 = b3.a();
                    a3.setOnShowListener(new av(this, editText2));
                    a3.show();
                    return true;
                } else if ("override_client_experiments".equals(key)) {
                    new ff().show(getFragmentManager(), getResources().getString(C7582R.string.debug_override_client_experiments_title));
                    return true;
                } else if ("override_client_phenotype_experiments".equals(key)) {
                    new fl().show(getFragmentManager(), getResources().getString(C7582R.string.debug_override_phenotype_experiments_title));
                    return true;
                } else if ("clear_tos_preferences".equals(key)) {
                    r0 = C1473m.f7980a.cZ();
                    C0954a.f5811G.m5777b(r0).m5765c();
                    C0954a.f5808D.m5777b(r0).m5765c();
                    C0954a.f5810F.m5777b(r0).m5765c();
                    m6047a(false);
                    Toast.makeText(this, "TOS preferences deleted", 0).show();
                    return true;
                } else if ("test_update_notification".equals(key)) {
                    new bc().show(getFragmentManager(), "debug-notification-assist-dialog");
                    return true;
                } else if ("schedule_debug_jobs".equals(key)) {
                    View inflate2 = getLayoutInflater().inflate(C7582R.layout.schedule_debug_job_dialog, null);
                    ((Spinner) inflate2.findViewById(C7582R.id.network_selector)).setAdapter(new ArrayAdapter(this, 17367049, new String[]{"None", "Any", "Unmetered", "NotRoaming"}));
                    inflate2.findViewById(C7582R.id.schedule_job).setOnClickListener(new C1130u(this, inflate2));
                    inflate2.findViewById(C7582R.id.cancel_job).setOnClickListener(new C1131v(this));
                    new a(this).a("Schedule Debug Jobs").a(inflate2).b(getString(C7582R.string.close), C1132w.f7088a).a().show();
                    return true;
                }
                return super.onPreferenceTreeClick(preferenceScreen, preference);
            }
        }
    }

    private final void m6040a(String str) {
        int i = 1;
        try {
            File databasePath = getDatabasePath(str);
            if (databasePath.exists() && databasePath.canRead()) {
                File file = new File(Environment.getExternalStorageDirectory(), str);
                FileInputStream fileInputStream = new FileInputStream(databasePath);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                FileChannel channel = fileInputStream.getChannel();
                Object channel2 = fileOutputStream.getChannel();
                channel.transferTo(0, channel.size(), channel2);
                channel.close();
                channel2.close();
                fileInputStream.close();
                fileOutputStream.close();
                if (i == 0) {
                    String str2 = "Unable to export ";
                    String valueOf = String.valueOf(str);
                    Toast.makeText(this, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), 0).show();
                }
            }
        } catch (IOException e) {
            FinskyLog.m21667d("Unable to export: %s", e.getMessage());
        }
        i = 0;
        if (i == 0) {
            String str22 = "Unable to export ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() == 0) {
            }
            Toast.makeText(this, valueOf2.length() == 0 ? str22.concat(valueOf2) : new String(str22), 0).show();
        }
    }

    final void m6049b() {
        findPreference("instant_apps").setEnabled(this.f6311f != null);
    }

    private static String m6035a(int i) {
        switch (i) {
            case 1:
                return "EMPTY";
            case 2:
                return "EXPIRED";
            case 3:
                return "PARTIAL";
            case 4:
                return "COMPLETED";
            default:
                return "UNKNOWN";
        }
    }

    private static String m6042b(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "JITTERING";
            case 3:
                return "SCHEDULED";
            case 4:
                return "SYNCING";
            case 5:
                return "COMPLETED";
            default:
                return "UNKNOWN";
        }
    }

    private static String m6036a(long j) {
        return SimpleDateFormat.getDateTimeInstance().format(new Date(j));
    }

    private final void m6039a(C1216i c1216i, String str, String str2, int i, String str3) {
        int indexOf;
        C1473m.f7980a.bc();
        C1225k a = C1219c.m7207a(str, c1216i);
        a.m7215a(str3, c1216i.mo1531b(null));
        int i2 = a.f7360a;
        if (i2 < 0) {
            indexOf = a.m7214a().indexOf(str3);
        } else {
            indexOf = i2;
        }
        a aVar = new a(this);
        aVar.a(i);
        List a2 = a.m7214a();
        aVar.a((String[]) a2.toArray(new String[a2.size()]), indexOf, new an(this, c1216i, a, str2));
        aVar.a().show();
    }

    final void m6045a(C1221e c1221e) {
        String str;
        String str2;
        String str3 = null;
        if (c1221e != null) {
            if (c1221e.f7349a != null) {
                str3 = String.valueOf(C1473m.f7980a.aM().f7683b);
                str = c1221e.f7349a;
                str3 = new StringBuilder((String.valueOf(str3).length() + 9) + String.valueOf(str).length()).append(str3).append(" rewrite ").append(str).toString();
            }
            str2 = c1221e.f7350b;
            str = str2;
            str2 = str3;
            str3 = c1221e.f7351c;
        } else {
            str = null;
            str2 = null;
        }
        m6041a("url:finsky_dfe_url", str2);
        m6046a(C0955b.jq, str);
        m6046a(C0955b.iu, str3);
    }

    final void m6044a(C1218b c1218b) {
        m6046a(C1285f.f7610g, c1218b.f7343a);
        m6046a(C1285f.f7604a, c1218b.f7344b);
        m6041a("wallet.mcc_mnc_override", c1218b.f7344b);
    }

    protected final void m6046a(C6321a c6321a, String str) {
        m6041a(c6321a.f31570b, str);
    }

    private final void m6041a(String str, String str2) {
        Intent intent = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        intent.putExtra(str, str2);
        sendBroadcast(intent);
    }

    protected final void m6047a(boolean z) {
        C2910a.m15176b(C1473m.f7980a.cZ(), 7);
        C1473m.f7980a.bk().mo4380a(new ao(this, z), "debug_clear_cache");
    }

    public static void m6043c() {
        C0957n b = C0954a.aq.m5777b(C1473m.f7980a.cZ());
        C0957n b2 = C0954a.f5830Z.m5777b(C1473m.f7980a.cZ());
        C0957n b3 = C0954a.ao.m5777b(C1473m.f7980a.cZ());
        if (TextUtils.isEmpty((CharSequence) b3.m5760a()) && !((Boolean) C0954a.ap.m5760a()).booleanValue() && TextUtils.isEmpty((CharSequence) b2.m5760a())) {
            b.m5765c();
            return;
        }
        String str;
        C0757i bqVar = new bq();
        if (!TextUtils.isEmpty((CharSequence) b3.m5760a())) {
            str = (String) b3.m5760a();
            if (str == null) {
                throw new NullPointerException();
            }
            bqVar.a |= 1;
            bqVar.b = str;
        }
        if (C0954a.ap.m5764b()) {
            boolean booleanValue = ((Boolean) C0954a.ap.m5760a()).booleanValue();
            bqVar.a |= 2;
            bqVar.c = booleanValue;
        }
        if (!TextUtils.isEmpty((CharSequence) b2.m5760a())) {
            str = (String) b2.m5760a();
            if (str == null) {
                throw new NullPointerException();
            }
            bqVar.a |= 4;
            bqVar.d = str;
        }
        b.m5763a(Base64.encodeToString(C0757i.m4909a(bqVar), 10));
    }
}
