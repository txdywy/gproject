package com.google.android.finsky.uninstall;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v7.p045f.C0445b;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aj.C1190a;
import com.google.android.finsky.aj.C1194e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p142j.C3632i;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bd extends C1137h implements C4589e, C4590g {
    public C3632i f23536c;
    public boolean f23537d;
    public ArrayList f23538e = new ArrayList();
    public ArrayList f23539f = new ArrayList();
    public Context f23540g;
    public LayoutInflater f23541h;
    public be f23542i;
    public OnClickListener f23543j;
    public ad f23544k;
    public C3640a f23545l;
    public final C3741b f23546m;
    public final C1190a f23547n;

    public bd(Context context, ad adVar, C3640a c3640a, C3741b c3741b, C1190a c1190a) {
        this.f23540g = context;
        this.f23541h = LayoutInflater.from(context);
        this.f23544k = adVar;
        this.f23545l = c3640a;
        this.f23546m = c3741b;
        this.f23547n = c1190a;
        this.f23537d = ((Boolean) C0954a.aY.m5760a()).booleanValue();
        if (this.f23537d) {
            C0954a.aY.m5763a(Boolean.valueOf(false));
        }
        b_(false);
    }

    public final int mo1039a() {
        return (this.f23538e.size() + m21362d()) + 1;
    }

    public final int mo1040a(int i) {
        if (this.f23537d) {
            if (i == 0) {
                return 3;
            }
            if (i == 1) {
                return 4;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 1;
            }
            if (i == mo1039a() - 1) {
                return 4;
            }
            return 0;
        } else if (i == 0) {
            return 3;
        } else {
            if (i == 1) {
                return 4;
            }
            if (i == 2) {
                return 1;
            }
            if (i == mo1039a() - 1) {
                return 4;
            }
            return 0;
        }
    }

    private final boolean m21353e(int i) {
        return ((Boolean) this.f23539f.get(i)).booleanValue();
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    final void m21358a(boolean z, List list) {
        int i = 0;
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (int i2 = 0; i2 < this.f23538e.size(); i2++) {
            String cf = ((Document) this.f23538e.get(i2)).cf();
            hashMap.put(cf, (Document) this.f23538e.get(i2));
            hashMap2.put(cf, (Boolean) this.f23539f.get(i2));
        }
        this.f23539f.clear();
        List arrayList = new ArrayList(this.f23538e);
        if (!z) {
            this.f23538e.clear();
            if (list != null) {
                this.f23538e.addAll(list);
            }
        }
        Collections.sort(this.f23538e, this.f23536c.f18000j);
        while (i < this.f23538e.size()) {
            cf = ((Document) this.f23538e.get(i)).cf();
            if (hashMap.containsKey(cf)) {
                this.f23539f.add(i, (Boolean) hashMap2.get(cf));
                hashMap2.remove(cf);
            } else {
                this.f23539f.add(i, Boolean.FALSE);
            }
            i++;
        }
        C0445b.m2667b(new bf(this, arrayList, this.f23538e)).m2679a((em) this);
    }

    public final List m21360b() {
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f23539f.size(); i++) {
            if (((Boolean) this.f23539f.get(i)).booleanValue()) {
                arrayList.add((Document) this.f23538e.get(i));
            }
        }
        return arrayList;
    }

    public final long m21361c() {
        long j = 0;
        for (int i = 0; i < this.f23539f.size(); i++) {
            if (((Boolean) this.f23539f.get(i)).booleanValue()) {
                long a = this.f23545l.m17234a(((Document) this.f23538e.get(i)).cf());
                if (a != -1) {
                    j += a;
                }
            }
        }
        return j;
    }

    public final void o_(int i) {
        if (i != -1) {
            int d = i - m21362d();
            this.f23539f.set(d, Boolean.valueOf(!m21353e(d)));
            if (this.f23542i != null) {
                this.f23545l.m17234a(((Document) this.f23538e.get(d)).cf());
                this.f23542i.ao();
            }
        }
    }

    final int m21362d() {
        return this.f23537d ? 5 : 3;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        Object obj = null;
        C1155g c1155g = (C1155g) frVar;
        switch (c1155g.f3216f) {
            case 0:
                CharSequence a;
                Document document = (Document) this.f23538e.get(i - m21362d());
                C4593f c4593f = (C4593f) c1155g;
                switch (this.f23536c.ordinal()) {
                    case 4:
                        C1473m.f7980a.mo2043W();
                        Context context = this.f23540g;
                        C1194e a2 = this.f23547n.m7142a(document.cf());
                        if (a2 != null) {
                            if (a2.f7297b < ((Long) C0955b.hF.m28964b()).longValue()) {
                                obj = context.getString(C7582R.string.uninstall_manager_row_mobile_data_used_none);
                                break;
                            }
                            obj = context.getString(C7582R.string.uninstall_manager_row_mobile_data_used, new Object[]{Formatter.formatFileSize(context, a2.f7297b)});
                            break;
                        }
                        break;
                    default:
                        C1473m.f7980a.mo2043W();
                        obj = ab.m21145a(this.f23540g, document, this.f23546m);
                        if (TextUtils.isEmpty(obj)) {
                            obj = this.f23540g.getString(C7582R.string.uninstall_manager_last_use_unknown);
                            break;
                        }
                        break;
                }
                if (TextUtils.isEmpty(obj)) {
                    C1473m.f7980a.mo2043W();
                    a = ab.m21143a(this.f23540g, document, this.f23545l);
                } else {
                    C1473m.f7980a.mo2043W();
                    String a3 = ab.m21143a(this.f23540g, document, this.f23545l);
                    String string = this.f23540g.getString(C7582R.string.myapps_card_info_delimiter);
                    a = new StringBuilder(((String.valueOf(a3).length() + 2) + String.valueOf(string).length()) + String.valueOf(obj).length()).append(a3).append(" ").append(string).append(" ").append(obj).toString();
                }
                boolean e = m21353e(i - m21362d());
                c4593f.f23602y.setText(document.f14885a.f12100g);
                c4593f.f23603z.setText(a);
                c4593f.f23596A.setChecked(e);
                try {
                    c4593f.f23601x.setImageDrawable(c4593f.f23598u.getPackageManager().getApplicationIcon(document.cf()));
                } catch (NameNotFoundException e2) {
                    FinskyLog.m21667d("%s not found in PackageManager", document.cf());
                    c4593f.f23601x.a();
                }
                c4593f.f23600w = C2482j.m13283a(5531);
                c4593f.f23600w.e = new cf();
                c4593f.f23600w.e.a(document.cf());
                c4593f.f23599v.mo1219a(c4593f);
                return;
            case 1:
                bi biVar = (bi) c1155g;
                CharSequence string2 = this.f23540g.getString(C7582R.string.myapps_cluster_title_with_count_format, new Object[]{this.f23540g.getString(C7582R.string.uninstall_manager_all_apps), Integer.valueOf(this.f23538e.size())});
                CharSequence a4 = this.f23536c.m17227a(this.f23540g);
                OnClickListener onClickListener = this.f23543j;
                biVar.f23564v.setText(string2);
                if (TextUtils.isEmpty(null)) {
                    biVar.f23565w.setVisibility(8);
                } else {
                    biVar.f23565w.setVisibility(0);
                    biVar.f23565w.setText(null);
                }
                if (onClickListener != null) {
                    biVar.f23566x.setVisibility(8);
                    biVar.f23567y.setVisibility(0);
                    biVar.f23567y.setText(a4);
                    biVar.f23567y.setOnClickListener(onClickListener);
                    biVar.f23563u.setNextFocusRightId(C7582R.id.header_sort_action);
                    biVar.f23567y.setNextFocusLeftId(C7582R.id.cluster_header);
                    return;
                }
                biVar.f23566x.setVisibility(8);
                biVar.f23567y.setVisibility(8);
                return;
            case 2:
                bk bkVar = (bk) c1155g;
                bkVar.f23569t.setText(this.f23540g.getString(C7582R.string.uninstall_manager_callout));
                return;
            case 3:
                ((bj) c1155g).m21376c(FinskyHeaderListLayout.m16068a(this.f23540g, 2, 0));
                return;
            case 4:
                ((bj) c1155g).m21376c(this.f23540g.getResources().getDimensionPixelSize(C7582R.dimen.uninstall_manager_card_look_edge_margins));
                return;
            default:
                FinskyLog.m21669e("Uninstall Manager binding ViewHolder of unknown type", new Object[0]);
                return;
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                fr c4593f = new C4593f(this.f23541h.inflate(C7582R.layout.uninstall_manager_selector_row_v3, viewGroup, false), this.f23540g, this.f23544k);
                c4593f.f23597t = this;
                return c4593f;
            case 1:
                return new bi(this.f23541h.inflate(C7582R.layout.uninstall_manager_selector_header_sort_v3, viewGroup, false), this.f23540g);
            case 2:
                return new bk(this.f23541h.inflate(C7582R.layout.uninstall_manager_selector_header_text_v3, viewGroup, false));
            case 3:
                return new bj(this.f23541h.inflate(C7582R.layout.header_list_spacer, viewGroup, false));
            case 4:
                return new bj(this.f23541h.inflate(C7582R.layout.vertical_spacer, viewGroup, false));
            default:
                FinskyLog.m21669e("Uninstall Manager unknown ViewHolder type requested", new Object[0]);
                return null;
        }
    }
}
