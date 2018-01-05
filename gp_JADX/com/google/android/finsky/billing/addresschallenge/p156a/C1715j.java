package com.google.android.finsky.billing.addresschallenge.p156a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.addresschallenge.AddressAutoComplete;
import com.google.android.finsky.billing.addresschallenge.C1702j;
import com.google.android.finsky.billing.addresschallenge.C1741m;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class C1715j implements OnItemSelectedListener {
    public static final Map f8964o;
    public static final Map f8965p;
    public Context f8966a;
    public C1702j f8967b;
    public LayoutInflater f8968c;
    public C1723r f8969d;
    public final EnumMap f8970e = new EnumMap(C1709d.class);
    public ab f8971f;
    public af f8972g;
    public ad f8973h;
    public av f8974i;
    public C1741m f8975j;
    public String f8976k;
    public String f8977l;
    public ao f8978m;
    public String f8979n;
    public C1704a f8980q;
    public Map f8981r;
    public C1720o f8982s;
    public C1722q f8983t;
    public final Handler f8984u = new Handler();
    public ArrayList f8985v = new ArrayList();

    private final C1719n m9592a(View view) {
        ArrayList arrayList = this.f8985v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1719n c1719n = (C1719n) obj;
            if (c1719n.f8990a == view) {
                return c1719n;
            }
        }
        return null;
    }

    public final void m9594a() {
        this.f8977l = az.m9575a(Locale.getDefault(), this.f8976k);
        this.f8971f.f8807c = this.f8977l;
        this.f8978m = az.m9579a(this.f8977l) ? ao.LATIN : ao.LOCAL;
        C1707b a = new C1707b().m9586a(this.f8976k);
        a.f8915b = this.f8977l;
        this.f8971f.m9526a(a.m9584a(), new C1717l(this));
        this.f8967b.mo2407d();
    }

    final List m9593a(C1709d c1709d) {
        C1704a b = m9600b();
        if (this.f8971f.m9528a(b.f8794k)) {
            C1707b c1707b = new C1707b(b);
            c1707b.f8915b = null;
            b = c1707b.m9584a();
        }
        al a = ab.m9521a(b).m9553a(c1709d);
        if (a != null) {
            return this.f8971f.m9525a(a);
        }
        String obj = toString();
        String valueOf = String.valueOf(c1709d);
        Log.w(obj, new StringBuilder(String.valueOf(valueOf).length() + 77).append("Can't build key with parent field ").append(valueOf).append(". One of the ancestor fields might be empty").toString());
        return new ArrayList(1);
    }

    public C1715j(Context context, C1702j c1702j, ad adVar, C1706w c1706w, String str) {
        C1715j c1715j;
        if (str == null || !as.f8852a.containsKey(str)) {
            String str2 = "US";
            if (context != null) {
                str = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso().toUpperCase();
                if (str != null && str.length() == 2) {
                    c1715j = this;
                }
            }
            str = str2;
            c1715j = this;
        } else {
            c1715j = this;
        }
        c1715j.f8976k = str;
        this.f8966a = context;
        this.f8967b = c1702j;
        this.f8973h = adVar;
        this.f8969d = new C1723r(c1706w);
        this.f8968c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8971f = new ab(new C1729x(this.f8969d), this.f8977l, this.f8976k);
        this.f8972g = new af(this.f8973h);
        this.f8974i = new av(new aa(new C1729x(this.f8969d)));
    }

    public final void m9596a(C1704a c1704a, boolean z) {
        for (C1709d c1709d : this.f8972g.m9540a(this.f8978m, this.f8976k)) {
            C1712g c1712g = (C1712g) this.f8970e.get(c1709d);
            if (c1712g != null) {
                CharSequence charSequence;
                String a = c1704a.m9517a(c1709d);
                if (a == null) {
                    charSequence = "";
                } else {
                    Object obj = a;
                }
                View view = c1712g.f8959f;
                if (view != null) {
                    if (c1712g.f8955b == C1713h.SPINNER) {
                        C1719n a2 = m9592a(view);
                        if (a2 != null) {
                            aq a3;
                            int position;
                            if (z) {
                                a3 = a2.m9606a(charSequence);
                                if (a3 != null) {
                                    position = a2.f8993d.getPosition(a3.m9559a());
                                    if (position >= 0) {
                                        a2.f8990a.setSelection(position);
                                    }
                                }
                            } else {
                                a3 = a2.m9606a(charSequence);
                                if (a3 == null) {
                                    for (aq a32 : a2.f8994e) {
                                        if (a32.m9559a().equalsIgnoreCase(charSequence)) {
                                            break;
                                        }
                                    }
                                    a32 = null;
                                    if (a32 == null) {
                                    }
                                }
                                position = a2.f8993d.getPosition(a32.m9559a());
                                if (position >= 0) {
                                    a2.f8990a.setSelection(position);
                                }
                            }
                        }
                    } else {
                        ((EditText) view).setText(charSequence);
                    }
                }
            }
        }
    }

    public final void m9598a(Map map) {
        for (C1709d c1709d : map.keySet()) {
            C1712g c1712g = (C1712g) this.f8970e.get(c1709d);
            if (c1712g != null) {
                View view = c1712g.f8959f;
                if (view != null && c1712g.f8955b == C1713h.EDIT) {
                    String str = (String) map.get(c1709d);
                    if (str != null) {
                        ae.m9219a((EditText) view, c1712g.f8954a, str);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.finsky.billing.addresschallenge.p156a.C1704a m9600b() {
        /*
        r7 = this;
        r3 = new com.google.android.finsky.billing.addresschallenge.a.b;
        r3.<init>();
        r0 = r7.f8976k;
        r3.m9586a(r0);
        r0 = r7.f8972g;
        r1 = r7.f8978m;
        r2 = r7.f8976k;
        r0 = r0.m9540a(r1, r2);
        r4 = r0.iterator();
    L_0x0018:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00a5;
    L_0x001e:
        r0 = r4.next();
        r0 = (com.google.android.finsky.billing.addresschallenge.p156a.C1709d) r0;
        r1 = r7.f8970e;
        r1 = r1.get(r0);
        r1 = (com.google.android.finsky.billing.addresschallenge.p156a.C1712g) r1;
        if (r1 == 0) goto L_0x0018;
    L_0x002e:
        r2 = r1.f8959f;
        if (r2 != 0) goto L_0x007a;
    L_0x0032:
        r2 = r1.f8956c;
        r2 = r2.size();
        if (r2 == 0) goto L_0x0083;
    L_0x003a:
        r2 = r1.f8956c;
        r5 = 0;
        r2 = r2.get(r5);
        r2 = (com.google.android.finsky.billing.addresschallenge.p156a.aq) r2;
        r2 = r2.m9559a();
    L_0x0047:
        r1 = r1.f8955b;
        r5 = com.google.android.finsky.billing.addresschallenge.p156a.C1713h.SPINNER;
        if (r1 != r5) goto L_0x0076;
    L_0x004d:
        r1 = r7.m9599b(r0);
        r1 = r7.m9592a(r1);
        if (r1 == 0) goto L_0x0076;
    L_0x0057:
        r1 = r1.f8994e;
        r5 = r1.iterator();
    L_0x005d:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x00a2;
    L_0x0063:
        r1 = r5.next();
        r1 = (com.google.android.finsky.billing.addresschallenge.p156a.aq) r1;
        r6 = r1.m9559a();
        r6 = r6.endsWith(r2);
        if (r6 == 0) goto L_0x005d;
    L_0x0073:
        r1 = r1.f8849a;
    L_0x0075:
        r2 = r1;
    L_0x0076:
        r3.m9585a(r0, r2);
        goto L_0x0018;
    L_0x007a:
        r2 = r1.f8955b;
        r2 = r2.ordinal();
        switch(r2) {
            case 0: goto L_0x0095;
            case 1: goto L_0x0086;
            default: goto L_0x0083;
        };
    L_0x0083:
        r2 = "";
        goto L_0x0047;
    L_0x0086:
        r2 = r1.f8959f;
        r2 = (android.widget.Spinner) r2;
        r2 = r2.getSelectedItem();
        if (r2 == 0) goto L_0x0083;
    L_0x0090:
        r2 = r2.toString();
        goto L_0x0047;
    L_0x0095:
        r2 = r1.f8959f;
        r2 = (android.widget.EditText) r2;
        r2 = r2.getText();
        r2 = r2.toString();
        goto L_0x0047;
    L_0x00a2:
        r1 = "";
        goto L_0x0075;
    L_0x00a5:
        r0 = r7.f8977l;
        r3.f8915b = r0;
        r0 = r3.m9584a();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.addresschallenge.a.j.b():com.google.android.finsky.billing.addresschallenge.a.a");
    }

    public final View m9599b(C1709d c1709d) {
        C1712g c1712g = (C1712g) this.f8970e.get(c1709d);
        if (c1712g == null) {
            return null;
        }
        return c1712g.f8959f;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1719n a = m9592a((View) adapterView);
        if (a != null) {
            C1709d c1709d = a.f8991b;
            if (c1709d == C1709d.ADMIN_AREA || c1709d == C1709d.LOCALITY) {
                this.f8971f.m9526a(m9600b(), new C1716k(this, c1709d));
            }
        }
    }

    public final void m9597a(C1741m c1741m) {
        this.f8975j = c1741m;
        View b = m9599b(C1709d.ADDRESS_LINE_1);
        if (b != null && (b instanceof AddressAutoComplete)) {
            ((AddressAutoComplete) b).setSuggestionProvider(this.f8975j);
        }
    }

    public final void m9595a(Bundle bundle) {
        bundle.putSerializable("address_data", m9600b());
        Map hashMap = new HashMap();
        for (C1709d c1709d : this.f8972g.m9540a(this.f8978m, this.f8976k)) {
            C1712g c1712g = (C1712g) this.f8970e.get(c1709d);
            if (c1712g != null) {
                View view = c1712g.f8959f;
                if (view != null && c1712g.f8955b == C1713h.EDIT) {
                    CharSequence error = ((EditText) view).getError();
                    if (error != null) {
                        hashMap.put(c1709d, error.toString());
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1709d c1709d2 : hashMap.keySet()) {
            arrayList.add(Integer.valueOf(c1709d2.ordinal()));
            arrayList2.add((String) hashMap.get(c1709d2));
        }
        bundle.putIntegerArrayList("address_error_fields", arrayList);
        bundle.putStringArrayList("address_error_values", arrayList2);
    }

    public final void m9601b(Bundle bundle) {
        this.f8980q = (C1704a) bundle.getSerializable("address_data");
        m9596a(this.f8980q, true);
        ArrayList integerArrayList = bundle.getIntegerArrayList("address_error_fields");
        ArrayList stringArrayList = bundle.getStringArrayList("address_error_values");
        if (integerArrayList != null && stringArrayList != null) {
            Map hashMap = new HashMap();
            for (int i = 0; i < integerArrayList.size(); i++) {
                String str = (String) stringArrayList.get(i);
                hashMap.put(C1709d.values()[((Integer) integerArrayList.get(i)).intValue()], str);
            }
            this.f8981r = hashMap;
            m9598a(hashMap);
        }
    }

    static {
        new ae().m9535a();
        Map hashMap = new HashMap(15);
        hashMap.put("area", Integer.valueOf(C7582R.string.i18n_area));
        hashMap.put("county", Integer.valueOf(C7582R.string.i18n_county_label));
        hashMap.put("department", Integer.valueOf(C7582R.string.i18n_department));
        hashMap.put("district", Integer.valueOf(C7582R.string.i18n_dependent_locality_label));
        hashMap.put("do_si", Integer.valueOf(C7582R.string.i18n_do_si));
        hashMap.put("emirate", Integer.valueOf(C7582R.string.i18n_emirate));
        hashMap.put("island", Integer.valueOf(C7582R.string.i18n_island));
        hashMap.put("parish", Integer.valueOf(C7582R.string.i18n_parish));
        hashMap.put("prefecture", Integer.valueOf(C7582R.string.i18n_prefecture));
        hashMap.put("province", Integer.valueOf(C7582R.string.i18n_province));
        hashMap.put("state", Integer.valueOf(C7582R.string.i18n_state_label));
        f8964o = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap(15);
        hashMap.put("area", Integer.valueOf(C7582R.string.invalid_area));
        hashMap.put("county", Integer.valueOf(C7582R.string.invalid_county_label));
        hashMap.put("department", Integer.valueOf(C7582R.string.invalid_department));
        hashMap.put("district", Integer.valueOf(C7582R.string.invalid_dependent_locality_label));
        hashMap.put("do_si", Integer.valueOf(C7582R.string.invalid_do_si));
        hashMap.put("emirate", Integer.valueOf(C7582R.string.invalid_emirate));
        hashMap.put("island", Integer.valueOf(C7582R.string.invalid_island));
        hashMap.put("parish", Integer.valueOf(C7582R.string.invalid_parish));
        hashMap.put("prefecture", Integer.valueOf(C7582R.string.invalid_prefecture));
        hashMap.put("province", Integer.valueOf(C7582R.string.invalid_province));
        hashMap.put("state", Integer.valueOf(C7582R.string.invalid_state_label));
        f8965p = Collections.unmodifiableMap(hashMap);
    }
}
