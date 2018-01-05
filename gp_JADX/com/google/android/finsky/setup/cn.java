package com.google.android.finsky.setup;

import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;

public final class cn extends em {
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20936c;

    public cn(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity) {
        this.f20936c = setupWizardSelectAppsForDeviceActivity;
    }

    public final fr mo1041a(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f20936c.getLayoutInflater();
        switch (i) {
            case 0:
                TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.setup_wizard_restore_apps_for_device_header_view, viewGroup, false);
                textView.setText(this.f20936c.getResources().getString(C7582R.string.setup_wizard_select_apps_for_device_instructions, new Object[]{Integer.valueOf(this.f20936c.f20637q.length), this.f20936c.f20636p.d}));
                return new cq(textView);
            case 1:
                return new co(this.f20936c, layoutInflater.inflate(C7582R.layout.setup_wizard_restore_device_app_item_view, viewGroup, false));
            case 3:
                this.f20936c.f20634C = new cp(this.f20936c, layoutInflater.inflate(C7582R.layout.setup_wizard_restore_apps_for_device_footer_view, viewGroup, false));
                return this.f20936c.f20634C;
            default:
                return new cm(this.f20936c, layoutInflater.inflate(C7582R.layout.setup_wizard_restore_device_app_item_view, viewGroup, false));
        }
    }

    public final int mo1040a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                if (cs.m19406b() && i == mo1039a() - 1) {
                    return 3;
                }
                return 2;
        }
    }

    public final void mo1042a(fr frVar, int i) {
        boolean z = false;
        switch (i) {
            case 0:
                return;
            case 1:
                CharSequence string;
                co coVar = (co) frVar;
                int g = coVar.f20943z.m19120g();
                if (g == 0) {
                    string = coVar.f20943z.getResources().getString(C7582R.string.setup_wizard_setup_restore_no_apps);
                } else if (g == coVar.f20943z.f20637q.length) {
                    string = coVar.f20943z.getResources().getString(C7582R.string.setup_wizard_setup_restore_all_apps, new Object[]{Integer.valueOf(coVar.f20943z.f20637q.length)});
                } else {
                    string = coVar.f20943z.getResources().getQuantityString(C7582R.plurals.setup_wizard_restore_selected_apps, g, new Object[]{Integer.valueOf(g)});
                }
                coVar.f20938u.setText(string);
                coVar.f20939v.setImageDrawable(coVar.f20943z.f20645y ? coVar.f20940w : coVar.f20941x);
                View view = coVar.f20942y;
                if (coVar.f20943z.f20645y) {
                    g = 8;
                } else {
                    g = 0;
                }
                view.setVisibility(g);
                return;
            default:
                if (!cs.m19406b() || i != mo1039a() - 1) {
                    int i2 = i - 3;
                    cm cmVar = (cm) frVar;
                    fp fpVar = i2 >= 0 ? this.f20936c.f20637q[i2] : null;
                    cmVar.f20931v = fpVar;
                    cmVar.f20932w = i2;
                    if (fpVar == null) {
                        cmVar.f20933x = true;
                        if (cmVar.f20935z.m19120g() == cmVar.f20935z.f20637q.length) {
                            z = true;
                        }
                        cmVar.f20934y = z;
                        cmVar.f20930u.setChecked(cmVar.f20934y);
                        cmVar.f20929t.setText(C7582R.string.setup_wizard_select_all_apps);
                        return;
                    }
                    cmVar.f20933x = false;
                    cmVar.f20930u.setChecked(cmVar.f20935z.f20639s[i2]);
                    cmVar.f20929t.setText(cmVar.f20931v.f);
                    return;
                }
                return;
        }
    }

    public final int mo1039a() {
        int i = 0;
        if (this.f20936c.f20637q == null) {
            return 0;
        }
        int length;
        if (this.f20936c.f20645y) {
            length = this.f20936c.f20637q.length + 3;
        } else {
            length = 2;
        }
        if (cs.m19406b()) {
            i = 1;
        }
        return i + length;
    }
}
