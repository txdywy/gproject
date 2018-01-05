package com.google.android.finsky.settings;

import android.accounts.Account;
import android.app.Activity;
import android.app.backup.BackupManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.provider.SearchRecentSuggestions;
import android.support.v4.os.C0327a;
import android.support.v4.p030c.p031a.C0282a;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.billing.legacyauth.C1874a;
import com.google.android.finsky.billing.legacyauth.PurchaseAuthActivity;
import com.google.android.finsky.billing.p131e.C1814a;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.bu.C2181b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.contentfilterui.ContentFiltersActivity3;
import com.google.android.finsky.dc.C1465m;
import com.google.android.finsky.de.C2568a;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.instantapps.metrics.C3533f;
import com.google.android.finsky.instantapps.p213a.C3376a;
import com.google.android.finsky.instantapps.p220f.C3492q;
import com.google.android.finsky.notificationsettings.NotificationsSettingsActivity;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p112u.C1032a;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.feedback.C5189b;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.C5211b;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.wallet.ui.common.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.dl;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;

public class SettingsActivity extends C1032a implements OnSharedPreferenceChangeListener, ad, C4090k {
    public static Boolean f20462b = null;
    public String f20463A;
    public boolean f20464B;
    public ad f20465C;
    public C2495w f20466D;
    public ad f20467E;
    public Context f20468c;
    public C0988c f20469d;
    public C2910a f20470e;
    public C2471a f20471f;
    public C2127b f20472g;
    public C3982a f20473i;
    public C2838a f20474j;
    public C1461c f20475k;
    public C1500a f20476l;
    public C1556d f20477m;
    public C2181b f20478n;
    public C1287h f20479o;
    public C2568a f20480p;
    public C1506e f20481q;
    public C1465m f20482r;
    public SearchRecentSuggestions f20483s;
    public C2162a f20484t;
    public C1821j f20485u;
    public C2320a f20486v;
    public C2266a f20487w;
    public C3960a f20488x;
    public C1817e f20489y;
    public C1874a f20490z;

    private final void m19026b() {
        for (C2129c c2129c : this.f20472g.mo2658a()) {
            int i = c2129c.f10824r;
            if ((i & 32) != 0) {
                this.f20472g.mo2678e(c2129c.f10807a, i & -33);
            }
        }
    }

    public ce getPlayStoreUiElement() {
        return C2482j.m13283a(12);
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    protected void onCreate(Bundle bundle) {
        ((C1414v) C3947d.m18649a(C1414v.class)).mo1905a(this);
        this.f20489y = new C1817e(C0282a.m1599a(this.f20468c));
        super.onCreate(bundle);
        if (this.f20473i.mo3875b()) {
            this.f20473i.mo3879f();
            finish();
            return;
        }
        this.f20463A = this.f20469d.cZ();
        if (this.f20463A == null) {
            FinskyLog.m21659a("Exit SettingsActivity - no current account.", new Object[0]);
            finish();
            return;
        }
        addPreferencesFromResource(C7582R.xml.settings);
        C1552e dj = this.f20475k.dj();
        if (!this.f20481q.m8839b() || dj.mo2294a(12631494)) {
            m19023a("category-general", "receive-emails");
        }
        boolean a = this.f20474j.m14997a();
        boolean a2 = dj.mo2294a(12641184);
        if (!(a || a2)) {
            m19023a("category-general", "download-mode");
        }
        if (!this.f20489y.m9821a()) {
            m19023a("category-user-controls", "fingerprint-auth");
        }
        if (C0327a.m1722b() || this.f20476l.m8822b()) {
            m19023a("category-general", "auto-add-shortcuts");
        }
        if (dj.mo2294a(12627389)) {
            getPreferenceScreen().removePreference((PreferenceCategory) getPreferenceScreen().findPreference("category-notifications"));
        } else {
            m19023a("category-general", "notifications-settings");
        }
        Account cY = this.f20469d.cY();
        if (dj.mo2294a(12608225) && this.f20476l.m8819a(cY)) {
            m19023a("category-user-controls", "content-level");
        }
        if (!dj.mo2294a(12627941)) {
            m19023a("category-user-controls", "verify-parent");
        }
        if (!(this.f20477m.m9024c() && this.f20478n.mo2775c())) {
            m19023a("category-user-controls", "launcher-icon-counter");
        }
        if (C3492q.m17063a(this.f20463A, dj, (Integer) C0955b.jh.m28964b(), getPackageManager(), (Integer) C0955b.ji.m28964b())) {
            C3533f.m17116a(this, 2209);
        } else {
            m19023a("category-user-controls", "instant-apps");
            C3533f.m17116a(this, 2210);
        }
        this.f20466D = this.f20471f.m13180a(bundle, getIntent());
        this.f20465C = new C2473o(12);
        this.f20467E = new C2473o(HprofParser.ROOT_FINALIZING, this.f20465C);
        ad adVar = this.f20467E;
        if (C0954a.aI.m5760a() == null) {
            m19023a("category-about", "certification-status");
            adVar = this.f20465C;
        }
        if (bundle == null) {
            this.f20466D.m13370a(new C2488p().m13345b(adVar));
        }
        getListView().setCacheColorHint(getResources().getColor(C7582R.color.play_main_background));
        this.f20490z = new C1874a(cY, this.f20466D);
    }

    protected void onResume() {
        Object obj;
        super.onResume();
        this.f20464B = true;
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (!this.f20475k.dj().mo2294a(12627389)) {
            ((CheckBoxPreference) preferenceScreen.findPreference("update-notifications")).setChecked(((Boolean) C0968o.f5931h.m5760a()).booleanValue());
        }
        if (!this.f20475k.dj().mo2294a(12627389)) {
            ((CheckBoxPreference) preferenceScreen.findPreference("update-completion-notifications")).setChecked(((Boolean) C0968o.f5932i.m5760a()).booleanValue());
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("receive-emails");
        if (checkBoxPreference != null) {
            dl e = this.f20470e.m15195e(this.f20463A);
            if (e == null) {
                m19023a("category-general", "receive-emails");
            } else {
                checkBoxPreference.setChecked(e.b);
            }
        }
        SettingsListPreference settingsListPreference = (SettingsListPreference) preferenceScreen.findPreference("auto-update-mode");
        Object values = C4110t.values();
        boolean d = this.f20487w.m11722d();
        if (d) {
            obj = values;
        } else {
            obj = new C4110t[2];
            System.arraycopy(values, 0, obj, 0, 2);
        }
        int length = obj.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        CharSequence[] charSequenceArr2 = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            C4109x c4109x = obj[i];
            charSequenceArr[i] = settingsListPreference.getContext().getString(c4109x.mo3912a());
            charSequenceArr2[i] = c4109x.toString();
        }
        settingsListPreference.setEntries(charSequenceArr);
        settingsListPreference.setEntryValues(charSequenceArr2);
        settingsListPreference.setValue(m19025b(d).toString());
        settingsListPreference.setSummary(settingsListPreference.getEntry());
        if (this.f20488x.m18670c()) {
            C4109x a = C4110t.m19063a(d, this.f20488x.m18668a(), this.f20488x.m18669b());
            CharSequence string = getResources().getString(C7582R.string.controlled_by_administrator, new Object[]{getResources().getString(a.mo3912a())});
            settingsListPreference.setEnabled(false);
            settingsListPreference.setSummary(string);
        }
        m19022a(preferenceScreen);
        checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("auto-add-shortcuts");
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(((Boolean) C0968o.f5934k.m5760a()).booleanValue());
        }
        boolean booleanValue = ((Boolean) C0955b.f5882Z.m28964b()).booleanValue();
        Preference findPreference = preferenceScreen.findPreference("content-level");
        if (findPreference != null) {
            if (booleanValue) {
                preferenceScreen.removePreference(findPreference);
            } else {
                String str = (String) C0954a.f5834d.m5760a();
                if (TextUtils.isEmpty((String) C0954a.f5839i.m5760a()) && TextUtils.isEmpty(str)) {
                    findPreference.setSummary(getString(C7582R.string.disable_content_filters));
                } else {
                    findPreference.setSummary(getString(C7582R.string.enable_content_filters));
                }
            }
        }
        preferenceScreen.findPreference("purchase-auth").setSummary(m19028c().f20545e);
        checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("verify-parent");
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(((Boolean) C0954a.bs.m5760a()).booleanValue());
        }
        if (this.f20477m.m9024c()) {
            checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("launcher-icon-counter");
            if (checkBoxPreference != null) {
                checkBoxPreference.setChecked(this.f20478n.mo2774b());
            }
        }
        preferenceScreen.findPreference("build-version").setSummary(getString(C7582R.string.market_version, new Object[]{this.f20486v.mo2858f(this.f20468c.getPackageName())}));
        Preference findPreference2 = preferenceScreen.findPreference("certification-status");
        if (findPreference2 != null) {
            CharSequence string2;
            Boolean bool = (Boolean) C0954a.aI.m5760a();
            Resources resources = getResources();
            if (bool.booleanValue()) {
                string2 = resources.getString(C7582R.string.certification_status_certified);
            } else {
                string2 = resources.getString(C7582R.string.certification_status_uncertified);
            }
            findPreference2.setSummary(string2);
        }
        m19027b(preferenceScreen);
        preferenceScreen.getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (getIntent() != null && getIntent().hasExtra("setting-key-to-scroll")) {
            new Handler().post(new C4104o(this));
        }
    }

    private final void m19023a(String str, String str2) {
        PreferenceCategory preferenceCategory = (PreferenceCategory) getPreferenceScreen().findPreference(str);
        preferenceCategory.removePreference(preferenceCategory.findPreference(str2));
    }

    protected void onPause() {
        super.onPause();
        this.f20464B = false;
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    protected void onDestroy() {
        if (this.f20490z != null) {
            this.f20490z.m10010a();
        }
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        boolean z = false;
        String key = preference.getKey();
        if ("update-notifications".equals(key)) {
            C0968o.f5931h.m5763a(Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("update-completion-notifications".equals(key)) {
            C0968o.f5932i.m5763a(Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("auto-add-shortcuts".equals(key)) {
            C0968o.f5934k.m5763a(Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("clear-history".equals(key)) {
            this.f20483s.clearHistory();
        } else if ("content-level".equals(key)) {
            startActivityForResult(this.f20484t.mo2687a((Context) this, ContentFiltersActivity3.class, "authAccount", this.f20463A), 38);
        } else if ("os-licenses".equals(key)) {
            startActivity(new Intent(this, LicenseMenuActivity.class));
        } else if ("build-version".equals(key)) {
            this.f20466D.m13379b(new C2475d(this.f20465C).m13256a(282));
            if (((Boolean) C0955b.f5895k.m28964b()).booleanValue()) {
                if (f20462b != null) {
                    m19031a(f20462b.booleanValue());
                } else {
                    C1254c a = this.f20479o.mo2015a();
                    this.f20480p.m13571a(a, C2693e.m14552a(), new C4105p(this, a));
                }
            }
        } else if ("certification-status".equals(key)) {
            this.f20466D.m13372a(new C2475d(this.f20467E).m13259a(), null);
            this.f20484t.mo2698a((Activity) this, this.f20484t.mo2689a(Uri.parse((String) C0955b.gQ.m28964b())));
        } else if ("purchase-auth".equals(key)) {
            r0 = new Intent(this, PurchaseAuthActivity.class);
            r0.putExtra("purchase-auth-current", m19028c().f20544d);
            startActivityForResult(r0, 36);
        } else if ("fingerprint-auth".equals(key)) {
            m19024a(((CheckBoxPreference) preference).isChecked(), false);
        } else if ("download-mode".equals(key)) {
            C2495w c2495w = this.f20466D;
            Bundle bundle = new Bundle();
            bundle.putString("flex-time-window-offer-description", null);
            bundle.putString("flex-time-window-time-frame-description", null);
            c2495w.m13377a(bundle);
            C4092a c4092a = new C4092a();
            c4092a.setArguments(bundle);
            c4092a.show(getFragmentManager(), "SettingsActivity.downloadNetworkDialog");
        } else if ("notifications-settings".equals(key)) {
            r0 = this.f20484t.mo2687a((Context) this, NotificationsSettingsActivity.class, "authAccount", this.f20463A);
            this.f20466D.m13376a(r0);
            startActivity(r0);
        } else if ("verify-parent".equals(key)) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            C0954a.bs.m5763a(Boolean.valueOf(checkBoxPreference.isChecked()));
            if (!checkBoxPreference.isChecked()) {
                m19026b();
            }
            z = true;
        } else if (this.f20477m.m9024c() && "launcher-icon-counter".equals(key)) {
            int i;
            boolean isChecked = ((CheckBoxPreference) preference).isChecked();
            int i2 = this.f20478n.mo2774b() ? 1 : 0;
            this.f20478n.mo2771a(isChecked);
            if (isChecked) {
                i = 1;
            } else {
                i = 0;
            }
            this.f20466D.m13367a(new C2474c(421).m13243b(Integer.valueOf(i)).m13235a(Integer.valueOf(i2)));
        } else if ("instant-apps".equals(key)) {
            C3533f.m17116a(this, 2211);
            if (C0327a.m1722b()) {
                startActivity(new Intent().setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.SettingsActivity")));
            } else if (C3492q.m17062a(getPackageManager())) {
                startActivity(new Intent().setComponent(new ComponentName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.SettingsActivity")));
            } else {
                String str = this.f20463A;
                Resources resources = getResources();
                Uri parse = Uri.parse((String) C3376a.f17343c.mo1160a());
                GoogleHelp googleHelp = new GoogleHelp((String) C3376a.f17342b.mo1160a());
                googleHelp.f26280q = parse;
                C5189b c5189b = new C5189b();
                c5189b.f26203a = GoogleHelp.m23989a((Activity) this);
                GoogleHelp a2 = googleHelp.m23991a(c5189b.m23962a(), getCacheDir());
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.f26201a = 1;
                themeSettings.f26202b = resources.getColor(C7582R.color.instant_apps_settings_help_primary_color);
                a2.f26282s = themeSettings;
                if (str != null) {
                    a2.f26266c = new Account(str, "com.google");
                }
                new C5211b(this).m23993a(a2.m23990a());
            }
        }
        if (z) {
            new BackupManager(this).dataChanged();
        }
        return true;
    }

    public final void mo3908a() {
        m19022a(getPreferenceScreen());
    }

    final void m19031a(boolean z) {
        if (this.f20464B) {
            int i;
            a aVar = new a(this);
            if (z) {
                i = C7582R.string.settings_self_update_new_version_yes;
            } else {
                i = C7582R.string.settings_self_update_new_version_no;
            }
            aVar.b(i);
            aVar.a(C7582R.string.ok, null);
            aVar.a().show();
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        boolean z2 = true;
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if ("auto-update-mode".equals(str)) {
            SettingsListPreference settingsListPreference = (SettingsListPreference) preferenceScreen.findPreference(str);
            C4110t valueOf = C4110t.valueOf(settingsListPreference.getValue());
            switch (valueOf.ordinal()) {
                case 0:
                    z2 = false;
                    break;
                case 1:
                    break;
                case 2:
                    z = true;
                    break;
                default:
                    FinskyLog.m21669e("Unexpected list pref value %s", r3);
                    z2 = false;
                    break;
            }
            this.f20466D.m13367a(new C2474c(402).m13243b(Integer.valueOf(valueOf.ordinal())).m13235a(Integer.valueOf(m19025b(this.f20487w.m11722d()).ordinal())));
            C0954a.f5854x.m5763a(Boolean.valueOf(z2));
            C0954a.f5855y.m5763a(Boolean.valueOf(z));
            new BackupManager(this).dataChanged();
            settingsListPreference.setSummary(settingsListPreference.getEntry());
        } else if ("receive-emails".equals(str)) {
            this.f20470e.m15188a(this.f20463A, ((CheckBoxPreference) preferenceScreen.findPreference(str)).isChecked(), new C4106q());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i == 38 && i2 == -1) {
            setResult(40);
            finish();
        } else if (i == 32 && i2 == -1) {
            Bundle bundleExtra = intent.getBundleExtra("GaiaAuthActivity_extraParams");
            int i3 = bundleExtra.getInt("purchase-auth-previous", -1);
            int i4 = bundleExtra.getInt("purchase-auth-new", -1);
            if (i4 == -1) {
                FinskyLog.m21669e("Missing new value for PurchaseAuth", new Object[0]);
            } else {
                this.f20485u.m9833a(this.f20463A, i4, Integer.valueOf(i3), "settings-page", this.f20466D);
            }
        } else if (i == 36 && i2 == -1) {
            this.f20490z.m10012a(new C4107r(this, intent.getIntExtra("purchase-auth-current", -1), intent.getIntExtra("purchase-auth-new", -1)), false);
        } else {
            if (i == 37) {
                if (i2 == -1) {
                    z = true;
                }
                m19024a(z, true);
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    private final C4111u m19028c() {
        int b = C1821j.m9832b(this.f20463A);
        for (C4111u c4111u : C4111u.values()) {
            if (c4111u.f20544d == b) {
                return c4111u;
            }
        }
        throw new IllegalStateException("PurchaseAuth undefined in PurchaseAuthEntry: " + b);
    }

    private static C4110t m19025b(boolean z) {
        return C4110t.m19063a(z, ((Boolean) C0954a.f5854x.m5760a()).booleanValue(), ((Boolean) C0954a.f5855y.m5760a()).booleanValue());
    }

    private final void m19022a(PreferenceScreen preferenceScreen) {
        Preference findPreference = preferenceScreen.findPreference("download-mode");
        if (findPreference != null) {
            CharSequence string;
            int a;
            if (this.f20475k.dj().mo2294a(12641184)) {
                a = this.f20474j.m14996a(true);
                switch (a) {
                    case 1:
                        string = getString(C7582R.string.download_settings_value_download_always);
                        break;
                    case 2:
                        string = getString(C7582R.string.download_settings_value_ask_every_time);
                        break;
                    case 3:
                    case 4:
                        string = getString(C7582R.string.download_settings_value_wifi_only);
                        break;
                    default:
                        throw new IllegalStateException("Cannot recognize download network preference: " + a);
                }
            }
            a = this.f20474j.m14996a(false);
            boolean a2 = this.f20475k.dj().mo2294a(12604154);
            if (a == 4 || (!a2 && a == 3)) {
                C1789d.f9315b.m5763a(Integer.valueOf(1));
                new BackupManager(this).dataChanged();
                Toast.makeText(this, getString(C7582R.string.download_preference_not_available), 1).show();
                a = 1;
            }
            switch (a) {
                case 1:
                case 2:
                    string = getString(C7582R.string.download_settings_value_download_always);
                    break;
                case 3:
                    string = getString(C7582R.string.download_settings_value_wifi_only);
                    break;
                case 4:
                    string = getString(C7582R.string.download_settings_value_offpeak_or_wifi, new Object[]{null.c});
                    break;
                default:
                    throw new IllegalStateException("Cannot recognize download network preference: " + a);
            }
            findPreference.setSummary(string);
        }
    }

    private final void m19027b(PreferenceScreen preferenceScreen) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("fingerprint-auth");
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(((Boolean) C1814a.f9375e.m5777b(this.f20463A).m5760a()).booleanValue());
        }
    }

    private final void m19024a(boolean z, boolean z2) {
        if (z2 || !z) {
            if (z2) {
                this.f20489y.m9825d();
            }
            C1821j.m9831a(this.f20463A, z, "settings-page", this.f20466D);
            m19027b(getPreferenceScreen());
            return;
        }
        this.f20490z.m10012a(new C4108s(this), false);
    }
}
