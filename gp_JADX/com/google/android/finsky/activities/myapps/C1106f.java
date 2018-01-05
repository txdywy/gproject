package com.google.android.finsky.activities.myapps;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.layout.WarmWelcomeCardLegacyButton;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.fo;
import com.google.wireless.android.finsky.dfe.nano.fq;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C1106f extends Fragment implements C0657w, C0660x {
    public int f7005a = 0;
    public String f7006b;
    public RecyclerView f7007c;
    public em f7008d;
    public ProgressBar f7009e;
    public ArrayList f7010f;
    public long f7011g;
    public C1254c f7012h;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.my_apps_restore_select_device_dialog, viewGroup, false);
        this.f7006b = C1473m.f7980a.cZ();
        Account b = C1473m.f7980a.mo2041U().mo1183b(this.f7006b);
        if (b == null) {
            FinskyLog.m21667d("Received invalid account name: %s", FinskyLog.m21655a(r0));
        } else {
            this.f7012h = C1473m.f7980a.mo2112b(b.name);
            this.f7011g = SystemClock.elapsedRealtime();
            this.f7012h.mo1631c(this, this);
        }
        TextView textView = (TextView) inflate.findViewById(C7582R.id.alertBody);
        ((TextView) inflate.findViewById(C7582R.id.alert_Title)).setText(C7582R.string.restore_card_choose_device);
        textView.setText(C7582R.string.restore_card_choose_device_description);
        WarmWelcomeCardLegacyButton warmWelcomeCardLegacyButton = (WarmWelcomeCardLegacyButton) inflate.findViewById(C7582R.id.button_primary);
        WarmWelcomeCardLegacyButton warmWelcomeCardLegacyButton2 = (WarmWelcomeCardLegacyButton) inflate.findViewById(C7582R.id.button_secondary);
        Resources resources = m603h().getResources();
        warmWelcomeCardLegacyButton.m17353a(resources.getString(C7582R.string.restore_card_back), C7582R.color.play_apps_primary, 0);
        warmWelcomeCardLegacyButton2.m17353a(resources.getString(C7582R.string.restore_card_continue), C7582R.color.play_white, C7582R.color.play_apps_primary);
        warmWelcomeCardLegacyButton.setOnClickListener(new C1107g(this));
        warmWelcomeCardLegacyButton2.setOnClickListener(new C1108h());
        this.f7009e = (ProgressBar) inflate.findViewById(C7582R.id.loading_progress_bar);
        this.f7007c = (RecyclerView) inflate.findViewById(C7582R.id.device_list);
        return inflate;
    }

    private static void m6807a(int i, Throwable th, C1254c c1254c, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        bo e = C2482j.m13310e();
        e.m28992a(125);
        if (i != -1) {
            e.m28998b(i);
        }
        if (th != null) {
            e.m29000c(th.getClass().getSimpleName());
        }
        if (j != 0) {
            e.m28993a(elapsedRealtime);
        }
        C1473m.f7980a.mo2242f(c1254c.mo1636c()).m13319a(e, null);
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("%s: %s", "Unable to fetch backup devices", volleyError.getCause());
        C1106f.m6807a(1, r0, this.f7012h, this.f7011g);
    }

    public final /* synthetic */ void b_(Object obj) {
        fo[] foVarArr = ((fq) obj).a;
        if (foVarArr == null || foVarArr.length == 0) {
            FinskyLog.m21659a("getRestoreFlow returned empty", new Object[0]);
        } else {
            FinskyLog.m21659a("getBackupDeviceChoices returned %d devices", Integer.valueOf(foVarArr.length));
        }
        C1106f.m6807a(-1, null, this.f7012h, this.f7011g);
        if (!this.f739K) {
            this.f7007c.setLayoutManager(new LinearLayoutManager());
            this.f7010f = new ArrayList();
            int length = foVarArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                this.f7010f.add(new C1109i(this, z, foVarArr[i]));
                i++;
                z = false;
            }
            this.f7008d = new C1110j(this, m603h(), this.f7010f);
            this.f7007c.setAdapter(this.f7008d);
            this.f7008d.f3433a.m3638b();
            this.f7009e.setVisibility(8);
            this.f7007c.setVisibility(0);
        }
    }
}
