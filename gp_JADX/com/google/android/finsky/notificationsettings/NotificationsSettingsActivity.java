package com.google.android.finsky.notificationsettings;

import android.app.backup.BackupManager;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.preference.TwoStatePreference;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p112u.C1032a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.bn;
import com.google.wireless.android.finsky.dfe.nano.bo;
import com.google.wireless.android.finsky.dfe.nano.bp;
import com.squareup.leakcanary.C7582R;

public class NotificationsSettingsActivity extends C1032a implements C1054h {
    public C2471a f19158a;
    public C0988c f19159b;
    public C2910a f19160c;
    public C3982a f19161d;
    public ad f19162e;
    public C2495w f19163f;
    public ad f19164g;
    public ad f19165i;
    public String f19166j;

    private static String m18273a(int i) {
        return "crm-setting:" + i;
    }

    protected void onCreate(Bundle bundle) {
        ((C1405a) C3947d.m18649a(C1405a.class)).mo1872a(this);
        super.onCreate(bundle);
        if (this.f19161d.mo3875b()) {
            this.f19161d.mo3879f();
            finish();
            return;
        }
        this.f19163f = this.f19158a.m13180a(bundle, getIntent());
        this.f19166j = this.f19159b.cZ();
        if (this.f19166j == null) {
            FinskyLog.m21659a("Exit NotificationsSettingsActivity - no current account.", new Object[0]);
            finish();
            return;
        }
        addPreferencesFromResource(C7582R.xml.notifications_settings);
        this.f19162e = new C2473o(6450);
        this.f19164g = new C2473o(6453, this.f19162e);
        this.f19165i = new C2473o(6454, this.f19162e);
        if (bundle == null) {
            this.f19163f.m13370a(new C2488p().m13345b(this.f19162e));
        }
        getListView().setCacheColorHint(getResources().getColor(C7582R.color.play_main_background));
    }

    protected void onResume() {
        super.onResume();
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        ((CheckBoxPreference) preferenceScreen.findPreference("update-notifications")).setChecked(((Boolean) C0968o.f5931h.m5760a()).booleanValue());
        ((CheckBoxPreference) preferenceScreen.findPreference("update-completion-notifications")).setChecked(((Boolean) C0968o.f5932i.m5760a()).booleanValue());
        m18274a(preferenceScreen);
        this.f19160c.m15182a((C1054h) this);
    }

    protected void onPause() {
        super.onPause();
        this.f19160c.m15191b((C1054h) this);
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        int i = 0;
        String key = preference.getKey();
        if ("update-notifications".equals(key)) {
            m18275a((CheckBoxPreference) preference, C0968o.f5931h, this.f19164g, 418);
            i = 1;
        } else if ("update-completion-notifications".equals(key)) {
            m18275a((CheckBoxPreference) preference, C0968o.f5932i, this.f19165i, 419);
            i = 1;
        } else if (key.startsWith("crm-setting")) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) preference;
            bn bnVar = (bn) ParcelableProto.m21673a(twoStatePreference.getExtras(), "crm-setting-bundle");
            if (bnVar == null) {
                key = twoStatePreference.getKey();
                FinskyLog.m21669e(new StringBuilder(String.valueOf(key).length() + 51).append("Preference for key ").append(key).append(" did not have a setting assigned").toString(), new Object[0]);
                twoStatePreference.setChecked(!twoStatePreference.isChecked());
            } else {
                int i2;
                int i3 = bnVar.c;
                byte[] bArr = bnVar.g;
                int i4 = bnVar.f;
                if (twoStatePreference.isChecked()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.f19160c.m15185a(this.f19166j, i3, i2, new C3824b(this, i2, i4, bArr), new C3825c(this, i3, twoStatePreference));
            }
        }
        if (i != 0) {
            new BackupManager(this).dataChanged();
        }
        return true;
    }

    private final void m18275a(TwoStatePreference twoStatePreference, C0957n c0957n, ad adVar, int i) {
        int i2;
        int i3 = 1;
        this.f19163f.m13372a(new C2475d(adVar).m13259a(), null);
        boolean booleanValue = ((Boolean) c0957n.m5760a()).booleanValue();
        c0957n.m5763a(Boolean.valueOf(twoStatePreference.isChecked()));
        C2495w c2495w = this.f19163f;
        C2474c c2474c = new C2474c(i);
        if (twoStatePreference.isChecked()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C2474c b = c2474c.m13243b(Integer.valueOf(i2));
        if (!booleanValue) {
            i3 = 0;
        }
        c2495w.m13367a(b.m13235a(Integer.valueOf(i3)));
    }

    private final void m18274a(PreferenceScreen preferenceScreen) {
        bo f = this.f19160c.m15196f(this.f19166j);
        if (f != null && f.a.length != 0) {
            PreferenceCategory preferenceCategory;
            PreferenceCategory preferenceCategory2 = (PreferenceCategory) preferenceScreen.findPreference("category-account");
            if (preferenceCategory2 == null) {
                Preference preferenceCategory3 = new PreferenceCategory(this);
                preferenceCategory3.setKey("category-account");
                preferenceScreen.addPreference(preferenceCategory3);
                preferenceCategory = preferenceCategory3;
            } else {
                preferenceCategory = preferenceCategory2;
            }
            preferenceCategory.setTitle(getString(C7582R.string.settings_notifications_account_header, new Object[]{this.f19166j}));
            for (bp bpVar : f.a) {
                for (C0757i c0757i : bpVar.d) {
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference(m18273a(c0757i.c));
                    if (checkBoxPreference == null) {
                        checkBoxPreference = new CheckBoxPreference(this);
                        checkBoxPreference.setKey(m18273a(c0757i.c));
                        preferenceCategory.addPreference(checkBoxPreference);
                        this.f19163f.m13370a(new C2488p().m13345b(new C2473o(6452, c0757i.g, this.f19162e)));
                    }
                    checkBoxPreference.setTitle(c0757i.d);
                    checkBoxPreference.setSummary(c0757i.e);
                    checkBoxPreference.setChecked(c0757i.f == 1);
                    checkBoxPreference.getExtras().putParcelable("crm-setting-bundle", ParcelableProto.m21671a(c0757i));
                }
            }
        }
    }

    public final void P_() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            m18274a(preferenceScreen);
        }
    }

    public final void ce_() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            m18274a(preferenceScreen);
        }
    }
}
