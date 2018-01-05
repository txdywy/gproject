package com.google.android.finsky.uninstall.v2a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.v7.widget.fr;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class aa extends C1137h implements C4609b {
    public ArrayList f23698c = new ArrayList();
    public ArrayList f23699d = new ArrayList();
    public Comparator f23700e;
    public Context f23701f;
    public LayoutInflater f23702g;
    public ab f23703h;
    public int f23704i;
    public ad f23705j;
    public ao f23706k;

    public aa(Context context, ad adVar, ao aoVar) {
        this.f23701f = context;
        this.f23702g = LayoutInflater.from(context);
        this.f23700e = new ac();
        this.f23705j = adVar;
        this.f23704i = 1;
        this.f23706k = aoVar;
        b_(false);
    }

    public final void m21442a(ac acVar) {
        acVar.m21688a("uninstall_manager__adapter_docs", this.f23698c);
        acVar.m21688a("uninstall_manager__adapter_checked", this.f23699d);
    }

    public final void m21446b(ac acVar) {
        this.f23698c = (ArrayList) acVar.m21690b("uninstall_manager__adapter_docs");
        this.f23699d = (ArrayList) acVar.m21690b("uninstall_manager__adapter_checked");
    }

    public static boolean m21436c(ac acVar) {
        return acVar != null && acVar.m21689a("uninstall_manager__adapter_docs");
    }

    public final int mo1039a() {
        return this.f23698c.size();
    }

    public final int mo1040a(int i) {
        switch (this.f23704i) {
            case 2:
                return 2;
            default:
                return 1;
        }
    }

    private final boolean m21437e(int i) {
        return ((Boolean) this.f23699d.get(i)).booleanValue();
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    public final void m21443a(List list) {
        int i = 0;
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (int i2 = 0; i2 < this.f23698c.size(); i2++) {
            String str = ((am) this.f23698c.get(i2)).f23734a;
            hashMap.put(str, (am) this.f23698c.get(i2));
            hashMap2.put(str, (Boolean) this.f23699d.get(i2));
        }
        this.f23699d.clear();
        this.f23698c.clear();
        if (list != null) {
            this.f23698c.addAll(list);
        }
        Collections.sort(this.f23698c, this.f23700e);
        while (i < this.f23698c.size()) {
            String str2 = ((am) this.f23698c.get(i)).f23734a;
            if (hashMap.containsKey(str2)) {
                this.f23699d.add(i, (Boolean) hashMap2.get(str2));
                hashMap2.remove(str2);
            } else {
                this.f23699d.add(i, Boolean.FALSE);
            }
            i++;
        }
        this.f3433a.m3638b();
    }

    public final List m21445b() {
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f23699d.size(); i++) {
            if (((Boolean) this.f23699d.get(i)).booleanValue()) {
                arrayList.add((am) this.f23698c.get(i));
            }
        }
        return arrayList;
    }

    public final void p_(int i) {
        if (i != -1) {
            boolean z = !m21437e(i);
            this.f23699d.set(i, Boolean.valueOf(z));
            if (this.f23703h == null) {
                return;
            }
            if (((am) this.f23698c.get(i)).f23736c != -1) {
                this.f23703h.mo4286a(z, ((am) this.f23698c.get(i)).f23736c);
            } else {
                this.f23703h.mo4286a(z, 0);
            }
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        am amVar = (am) this.f23698c.get(i);
        switch (c1155g.f3216f) {
            case 1:
                C4608a c4608a = (C4608a) c1155g;
                boolean e = m21437e(i);
                int d = this.f23706k.mo4290d();
                c4608a.f23696y.setText(amVar.f23735b);
                if (amVar.f23736c > 0) {
                    c4608a.f23697z.setText(Formatter.formatFileSize(c4608a.f23692u, amVar.f23736c));
                    c4608a.f23697z.setVisibility(0);
                } else {
                    c4608a.f23697z.setVisibility(8);
                }
                if (af.m21457a().m21463c()) {
                    CharSequence string;
                    af a = af.m21457a();
                    String str = amVar.f23734a;
                    Context context = c4608a.f23692u;
                    long toDays = TimeUnit.MILLISECONDS.toDays(a.m21458a(str));
                    Resources resources = context.getResources();
                    if (toDays == 0) {
                        string = resources.getString(C7582R.string.uinstall_manager_last_used_today);
                    } else if (toDays < 30) {
                        string = resources.getQuantityString(C7582R.plurals.uninstall_manager_last_used_days, (int) toDays, new Object[]{Integer.valueOf((int) toDays)});
                    } else if (toDays < 365) {
                        string = resources.getQuantityString(C7582R.plurals.uninstall_manager_last_used_months, ((int) toDays) / 30, new Object[]{Integer.valueOf(((int) toDays) / 30)});
                    } else {
                        string = resources.getString(C7582R.string.uninstall_manager_last_use_unknown);
                    }
                    c4608a.f23689A.setText(string);
                    c4608a.f23689A.setVisibility(0);
                } else {
                    c4608a.f23689A.setVisibility(8);
                }
                c4608a.f23690B.setChecked(e);
                try {
                    c4608a.f23695x.setImageDrawable(c4608a.f23692u.getPackageManager().getApplicationIcon(amVar.f23734a));
                } catch (NameNotFoundException e2) {
                    FinskyLog.m21667d("%s not found in PackageManager", amVar.f23734a);
                    c4608a.f23695x.a();
                }
                c4608a.f23694w = C2482j.m13283a(d);
                c4608a.f23694w.e = new cf();
                c4608a.f23694w.e.a(amVar.f23734a);
                c4608a.f23693v.mo1219a(c4608a);
                return;
            case 2:
                View view = c1155g.a;
                ((TextView) view.findViewById(C7582R.id.uninstall_row_title)).setText(amVar.f23735b);
                FifeImageView fifeImageView = (FifeImageView) view.findViewById(C7582R.id.uninstall_row_icon);
                try {
                    fifeImageView.setImageDrawable(this.f23701f.getPackageManager().getApplicationIcon(amVar.f23734a));
                    return;
                } catch (NameNotFoundException e3) {
                    FinskyLog.m21667d("%s not found in PackageManager", amVar.f23734a);
                    fifeImageView.a();
                    return;
                }
            default:
                FinskyLog.m21669e("Uninstall Manager binding ViewHolder of unknown type", new Object[0]);
                return;
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                fr c4608a = new C4608a(this.f23702g.inflate(C7582R.layout.uninstall_manager_selector_row, viewGroup, false), this.f23701f, this.f23705j);
                c4608a.f23691t = this;
                return c4608a;
            case 2:
                return new C1155g(this.f23702g.inflate(C7582R.layout.uninstall_manager_confirmation_row, viewGroup, false));
            default:
                FinskyLog.m21669e("Uninstall Manager unknown ViewHolder type requested", new Object[0]);
                return null;
        }
    }
}
