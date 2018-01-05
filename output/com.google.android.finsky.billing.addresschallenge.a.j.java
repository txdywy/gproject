package com.google.android.finsky.billing.addresschallenge.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.addresschallenge.AddressAutoComplete;
import com.google.android.finsky.billing.addresschallenge.j;
import com.google.android.finsky.billing.addresschallenge.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.billing.addresschallenge.a.j implements AdapterView$OnItemSelectedListener
{

    public static final Map o;
    public static final Map p;
    public Context a;
    public com.google.android.finsky.billing.addresschallenge.j b;
    public LayoutInflater c;
    public com.google.android.finsky.billing.addresschallenge.a.r d;
    public final EnumMap e;
    public com.google.android.finsky.billing.addresschallenge.a.ab f;
    public com.google.android.finsky.billing.addresschallenge.a.af g;
    public com.google.android.finsky.billing.addresschallenge.a.ad h;
    public com.google.android.finsky.billing.addresschallenge.a.av i;
    public com.google.android.finsky.billing.addresschallenge.m j;
    public String k;
    public String l;
    public com.google.android.finsky.billing.addresschallenge.a.ao m;
    public String n;
    public com.google.android.finsky.billing.addresschallenge.a.a q;
    public Map r;
    public com.google.android.finsky.billing.addresschallenge.a.o s;
    public com.google.android.finsky.billing.addresschallenge.a.q t;
    public final Handler u;
    public ArrayList v;

    static {
        new com.google.android.finsky.billing.addresschallenge.a.ae().a();
        v0 = new HashMap(15);
        v0.put("area", Integer.valueOf(2131952268));
        v0.put("county", Integer.valueOf(2131952269));
        v0.put("department", Integer.valueOf(2131952270));
        v0.put("district", Integer.valueOf(2131952271));
        v0.put("do_si", Integer.valueOf(2131952272));
        v0.put("emirate", Integer.valueOf(2131952273));
        v0.put("island", Integer.valueOf(2131952274));
        v0.put("parish", Integer.valueOf(2131952277));
        v0.put("prefecture", Integer.valueOf(2131952279));
        v0.put("province", Integer.valueOf(2131952280));
        v0.put("state", Integer.valueOf(2131952282));
        com.google.android.finsky.billing.addresschallenge.a.j.o = Collections.unmodifiableMap(v0);
        v0 = new HashMap(15);
        v0.put("area", Integer.valueOf(2131952379));
        v0.put("county", Integer.valueOf(2131952380));
        v0.put("department", Integer.valueOf(2131952381));
        v0.put("district", Integer.valueOf(2131952382));
        v0.put("do_si", Integer.valueOf(2131952383));
        v0.put("emirate", Integer.valueOf(2131952385));
        v0.put("island", Integer.valueOf(2131952387));
        v0.put("parish", Integer.valueOf(2131952390));
        v0.put("prefecture", Integer.valueOf(2131952393));
        v0.put("province", Integer.valueOf(2131952394));
        v0.put("state", Integer.valueOf(2131952395));
        com.google.android.finsky.billing.addresschallenge.a.j.p = Collections.unmodifiableMap(v0);
    }

    j(Context p0, com.google.android.finsky.billing.addresschallenge.j p1, com.google.android.finsky.billing.addresschallenge.a.ad p2, com.google.android.finsky.billing.addresschallenge.a.w p3, String p4) {
        this.e = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.u = new Handler();
        this.v = new ArrayList();
        if (p4 != 0 && com.google.android.finsky.billing.addresschallenge.a.as.a.containsKey(p4))
            v0 = this;
        else if (p0 != 0) {
            p4 = ((TelephonyManager)p0.getSystemService("phone")).getSimCountryIso().toUpperCase();
            if (p4 != 0) {
                if (p4.length() == 2)
                    v0 = this;
                else {
                    p4 = "US";
                    v0 = this;
                }
            }
            else {
                p4 = "US";
                v0 = this;
            }
        }
        else {
            p4 = "US";
            v0 = this;
        }
        v0.k = p4;
        this.a = p0;
        this.b = p1;
        this.h = p2;
        this.d = new com.google.android.finsky.billing.addresschallenge.a.r(p3);
        this.c = (LayoutInflater)p0.getSystemService("layout_inflater");
        this.f = new com.google.android.finsky.billing.addresschallenge.a.ab(new com.google.android.finsky.billing.addresschallenge.a.x(this.d), this.l, this.k);
        this.g = new com.google.android.finsky.billing.addresschallenge.a.af(this.h);
        this.i = new com.google.android.finsky.billing.addresschallenge.a.av(new com.google.android.finsky.billing.addresschallenge.a.aa(new com.google.android.finsky.billing.addresschallenge.a.x(this.d)));
    }

    private final com.google.android.finsky.billing.addresschallenge.a.n a(View p0) {
        v2 = 0;
        while (true) {
            if (v2 >= ((ArrayList)this.v).size()) {
                v1 = 0;
                return v1;
            }
            v1 = ((ArrayList)this.v).get(v2);
            v2 = v2 + 1;
            v1 = (com.google.android.finsky.billing.addresschallenge.a.n)v1;
            if (v1.a == p0)
                return v1;
        }
    }

    final List a(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        v0 = this.b();
        if (this.f.a(v0.k)) {
            v1 = new com.google.android.finsky.billing.addresschallenge.a.b(v0);
            v1.b = 0;
            v0 = v1.a();
        }
        v0 = com.google.android.finsky.billing.addresschallenge.a.ab.a(v0).a(p0);
        if (v0 == 0) {
            v1 = String.valueOf(p0);
            Log.w(this.toString(), (String.valueOf(v1).length() + 77) + "Can't build key with parent field " + v1 + ". One of the ancestor fields might be empty");
            v0 = new ArrayList(1);
        }
        else
            v0 = this.f.a(v0);
        return v0;
    }

    public final void a() {
        this.l = com.google.android.finsky.billing.addresschallenge.a.az.a(Locale.getDefault(), this.k);
        this.f.c = this.l;
        if (com.google.android.finsky.billing.addresschallenge.a.az.a(this.l))
            v0 = com.google.android.finsky.billing.addresschallenge.a.ao.a;
        else
            v0 = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        this.m = v0;
        v0 = new com.google.android.finsky.billing.addresschallenge.a.b().a(this.k);
        v0.b = this.l;
        this.f.a(v0.a(), new com.google.android.finsky.billing.addresschallenge.a.l(this));
        this.b.d();
    }

    public final void a(Bundle p0) {
        p0.putSerializable("address_data", this.b());
        v3 = new HashMap();
        v4 = this.g.a(this.m, this.k).iterator();
        while (v4.hasNext()) {
            v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v4.next();
            v1 = (com.google.android.finsky.billing.addresschallenge.a.g)this.e.get(v0);
            if (v1 == 0)
                continue;
            if (v1.f == 0)
                continue;
            if (v1.b != com.google.android.finsky.billing.addresschallenge.a.h.a)
                continue;
            v1 = ((EditText)v1.f).getError();
            if (v1 == 0)
                continue;
            v3.put(v0, v1.toString());
        }
        v1 = new ArrayList();
        v2 = new ArrayList();
        v4 = v3.keySet().iterator();
        while (v4.hasNext()) {
            v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v4.next();
            v1.add(Integer.valueOf(v0.ordinal()));
            v2.add((String)v3.get(v0));
        }
        p0.putIntegerArrayList("address_error_fields", v1);
        p0.putStringArrayList("address_error_values", v2);
    }

    public final void a(com.google.android.finsky.billing.addresschallenge.a.a p0, boolean p1) {
 10:    v3 = this.g.a(this.m, this.k).iterator();
 18:    if (!v3.hasNext())
150:        return;
 24:    v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v3.next();
 32:    v1 = (com.google.android.finsky.billing.addresschallenge.a.g)this.e.get(v0);
 34:    if (v1 == 0) goto 14;
 36:    v0 = p0.a(v0);
 40:    if (v0 == 0)
 44:        v2 = "";
        else
151:        v2 = v0;
 47:    if (v1.f == 0) goto 14;
 53:    if (v1.b != com.google.android.finsky.billing.addresschallenge.a.h.b) goto 143;
 55:    v1 = this.a(v1.f);
 59:    if (v1 == 0) goto 14;
 61:    if (p1 == 0) goto 87;
 63:    v0 = v1.a(v2);
 67:    if (v0 != 0) {
 75:        v0 = v1.d.getPosition(v0.a());
 79:        if (v0 >= 0)
 83:            v1.a.setSelection(v0);
        }
 86:    goto 14;
 87:    v0 = v1.a(v2);
 91:    if (v0 != 0) goto 123;
 95:    v4 = v1.e.iterator();
103:    if (!v4.hasNext()) goto 141;
109:    v0 = (com.google.android.finsky.billing.addresschallenge.a.aq)v4.next();
119:    if (!v0.a().equalsIgnoreCase(v2)) goto 99;
121:    if (v0 == 0) goto 14;
129:    v0 = v1.d.getPosition(v0.a());
133:    if (v0 >= 0)
137:        v1.a.setSelection(v0);
140:    goto 14;
141:    v0 = 0;
142:    goto 121;
145:    ((EditText)v1.f).setText(v2);
148:    goto 14;
    }

    public final void a(com.google.android.finsky.billing.addresschallenge.m p0) {
        this.j = p0;
        v0 = this.b(com.google.android.finsky.billing.addresschallenge.a.d.e);
        if (v0 != 0 && v0 instanceof AddressAutoComplete)
            ((AddressAutoComplete)v0).setSuggestionProvider(this.j);
    }

    public final void a(Map p0) {
        v3 = p0.keySet().iterator();
        while (v3.hasNext()) {
            v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v3.next();
            v1 = (com.google.android.finsky.billing.addresschallenge.a.g)this.e.get(v0);
            if (v1 == 0)
                continue;
            if (v1.f == 0)
                continue;
            if (v1.b != com.google.android.finsky.billing.addresschallenge.a.h.a)
                continue;
            v0 = (String)p0.get(v0);
            if (v0 == 0)
                continue;
            com.google.android.finsky.bg.ae.a((EditText)v1.f, v1.a, v0);
        }
    }

    public final View b(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        v0 = this.e.get(p0);
        if ((com.google.android.finsky.billing.addresschallenge.a.g)v0 == 0)
            v0 = 0;
        else
            v0 = ((com.google.android.finsky.billing.addresschallenge.a.g)v0).f;
        return v0;
    }

    public final com.google.android.finsky.billing.addresschallenge.a.a b() {
  2:    v3 = new com.google.android.finsky.billing.addresschallenge.a.b();
  7:    v3.a(this.k);
 20:    v4 = this.g.a(this.m, this.k).iterator();
 28:    if (!v4.hasNext()) {
167:        v3.b = this.l;
173:        return v3.a();
        }
 34:    v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v4.next();
 42:    v1 = (com.google.android.finsky.billing.addresschallenge.a.g)this.e.get(v0);
 44:    if (v1 == 0) goto 24;
 48:    if (v1.f != 0) goto 122;
 56:    if (v1.c.size() == 0) goto 131;
 67:    v2 = ((com.google.android.finsky.billing.addresschallenge.a.aq)v1.c.get(0)).a();
 75:    if (v1.b != com.google.android.finsky.billing.addresschallenge.a.h.b) goto 118;
 81:    v1 = this.a(this.b(v0));
 85:    if (v1 == 0) goto 118;
 89:    v5 = v1.e.iterator();
 97:    if (!v5.hasNext()) goto 162;
103:    v1 = (com.google.android.finsky.billing.addresschallenge.a.aq)v5.next();
113:    if (!v1.a().endsWith(v2)) goto 93;
115:    v1 = v1.a;
117:    v2 = v1;
118:    v3.a(v0, v2);
121:    goto 24;
128:    switch (v1.b.ordinal()) {
            case 0:
128:            goto 149;
            case 1:
128:            goto 134;
            default:
        }
131:    v2 = "";
133:    goto 71;
138:    v2 = ((Spinner)v1.f).getSelectedItem();
142:    if (v2 == 0) goto 131;
144:    v2 = v2.toString();
148:    goto 71;
157:    v2 = ((EditText)v1.f).getText().toString();
161:    goto 71;
162:    v1 = "";
164:    goto 117;
    }

    public final void b(Bundle p0) {
        this.q = (com.google.android.finsky.billing.addresschallenge.a.a)p0.getSerializable("address_data");
        this.a(this.q, 1);
        v2 = p0.getIntegerArrayList("address_error_fields");
        v3 = p0.getStringArrayList("address_error_values");
        if (v2 != 0 && v3 != 0) {
            v4 = new HashMap();
            v1 = 0;
            while (v1 < v2.size()) {
                v4.put(com.google.android.finsky.billing.addresschallenge.a.d.values()[((Integer)v2.get(v1)).intValue()], (String)v3.get(v1));
                v1 = v1 + 1;
            }
            this.r = v4;
            this.a(v4);
        }
    }

    public final void onItemSelected(AdapterView p0, View p1, int p2, long p3) {
        v0 = this.a(p0);
        if (v0 != 0 && (v0.b == com.google.android.finsky.billing.addresschallenge.a.d.a || v0.b == com.google.android.finsky.billing.addresschallenge.a.d.b))
            this.f.a(this.b(), new com.google.android.finsky.billing.addresschallenge.a.k(this, v0.b));
    }

    public final void onNothingSelected(AdapterView p0) {
    }

}
