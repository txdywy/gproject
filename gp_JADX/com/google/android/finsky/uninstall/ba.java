package com.google.android.finsky.uninstall;

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

public final class ba extends C1137h implements C4589e {
    public ArrayList f23528c = new ArrayList();
    public ArrayList f23529d = new ArrayList();
    public Comparator f23530e;
    public Context f23531f;
    public LayoutInflater f23532g;
    public bb f23533h;
    public int f23534i;
    public ad f23535j;

    public ba(Context context, ad adVar) {
        this.f23531f = context;
        this.f23532g = LayoutInflater.from(context);
        this.f23530e = new bc();
        this.f23535j = adVar;
        this.f23534i = 1;
        b_(false);
    }

    public final void m21348a(ac acVar) {
        acVar.m21688a("uninstall_manager__adapter_docs", this.f23528c);
        acVar.m21688a("uninstall_manager__adapter_checked", this.f23529d);
    }

    public final void m21352b(ac acVar) {
        this.f23528c = (ArrayList) acVar.m21690b("uninstall_manager__adapter_docs");
        this.f23529d = (ArrayList) acVar.m21690b("uninstall_manager__adapter_checked");
    }

    public static boolean m21342c(ac acVar) {
        return acVar != null && acVar.m21689a("uninstall_manager__adapter_docs");
    }

    public final int mo1039a() {
        return this.f23528c.size();
    }

    public final int mo1040a(int i) {
        switch (this.f23534i) {
            case 2:
                return 2;
            default:
                return 1;
        }
    }

    private final boolean m21343e(int i) {
        return ((Boolean) this.f23529d.get(i)).booleanValue();
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    public final void m21349a(List list) {
        int i = 0;
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (int i2 = 0; i2 < this.f23528c.size(); i2++) {
            String str = ((C4604s) this.f23528c.get(i2)).f23653a;
            hashMap.put(str, (C4604s) this.f23528c.get(i2));
            hashMap2.put(str, (Boolean) this.f23529d.get(i2));
        }
        this.f23529d.clear();
        this.f23528c.clear();
        if (list != null) {
            this.f23528c.addAll(list);
        }
        Collections.sort(this.f23528c, this.f23530e);
        while (i < this.f23528c.size()) {
            String str2 = ((C4604s) this.f23528c.get(i)).f23653a;
            if (hashMap.containsKey(str2)) {
                this.f23529d.add(i, (Boolean) hashMap2.get(str2));
                hashMap2.remove(str2);
            } else {
                this.f23529d.add(i, Boolean.FALSE);
            }
            i++;
        }
        this.f3433a.m3638b();
    }

    public final List m21351b() {
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f23529d.size(); i++) {
            if (((Boolean) this.f23529d.get(i)).booleanValue()) {
                arrayList.add((C4604s) this.f23528c.get(i));
            }
        }
        return arrayList;
    }

    public final void o_(int i) {
        if (i != -1) {
            boolean z = !m21343e(i);
            this.f23529d.set(i, Boolean.valueOf(z));
            if (this.f23533h == null) {
                return;
            }
            if (((C4604s) this.f23528c.get(i)).f23655c != -1) {
                this.f23533h.mo4276a(z, ((C4604s) this.f23528c.get(i)).f23655c);
            } else {
                this.f23533h.mo4276a(z, 0);
            }
        }
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        C4604s c4604s = (C4604s) this.f23528c.get(i);
        switch (c1155g.f3216f) {
            case 1:
                C4592d c4592d = (C4592d) c1155g;
                boolean e = m21343e(i);
                c4592d.f23594y.setText(c4604s.f23654b);
                c4592d.f23595z.setText(Formatter.formatFileSize(c4592d.f23590u, c4604s.f23655c));
                if (bl.m21377a().m21384c()) {
                    CharSequence string;
                    bl a = bl.m21377a();
                    String str = c4604s.f23653a;
                    Context context = c4592d.f23590u;
                    long toDays = TimeUnit.MILLISECONDS.toDays(a.m21378a(str));
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
                    c4592d.f23587A.setText(string);
                    c4592d.f23587A.setVisibility(0);
                } else {
                    c4592d.f23587A.setVisibility(8);
                }
                c4592d.f23588B.setChecked(e);
                try {
                    c4592d.f23593x.setImageDrawable(c4592d.f23590u.getPackageManager().getApplicationIcon(c4604s.f23653a));
                } catch (NameNotFoundException e2) {
                    FinskyLog.m21667d("%s not found in PackageManager", c4604s.f23653a);
                    c4592d.f23593x.a();
                }
                c4592d.f23592w = C2482j.m13283a(5524);
                c4592d.f23592w.e = new cf();
                c4592d.f23592w.e.a(c4604s.f23653a);
                c4592d.f23591v.mo1219a(c4592d);
                return;
            case 2:
                View view = c1155g.a;
                ((TextView) view.findViewById(C7582R.id.uninstall_row_title)).setText(c4604s.f23654b);
                FifeImageView fifeImageView = (FifeImageView) view.findViewById(C7582R.id.uninstall_row_icon);
                try {
                    fifeImageView.setImageDrawable(this.f23531f.getPackageManager().getApplicationIcon(c4604s.f23653a));
                    return;
                } catch (NameNotFoundException e3) {
                    FinskyLog.m21667d("%s not found in PackageManager", c4604s.f23653a);
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
                fr c4592d = new C4592d(this.f23532g.inflate(C7582R.layout.uninstall_manager_selector_row, viewGroup, false), this.f23531f, this.f23535j);
                c4592d.f23589t = this;
                return c4592d;
            case 2:
                return new C1155g(this.f23532g.inflate(C7582R.layout.uninstall_manager_confirmation_row, viewGroup, false));
            default:
                FinskyLog.m21669e("Uninstall Manager unknown ViewHolder type requested", new Object[0]);
                return null;
        }
    }
}
