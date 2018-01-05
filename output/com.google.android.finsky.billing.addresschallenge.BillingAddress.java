package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.addresschallenge.a.a;
import com.google.android.finsky.billing.addresschallenge.a.ab;
import com.google.android.finsky.billing.addresschallenge.a.ad;
import com.google.android.finsky.billing.addresschallenge.a.ae;
import com.google.android.finsky.billing.addresschallenge.a.ap;
import com.google.android.finsky.billing.addresschallenge.a.aw;
import com.google.android.finsky.billing.addresschallenge.a.d;
import com.google.android.finsky.billing.addresschallenge.a.e;
import com.google.android.finsky.billing.addresschallenge.a.f;
import com.google.android.finsky.billing.addresschallenge.a.g;
import com.google.android.finsky.billing.addresschallenge.a.h;
import com.google.android.finsky.billing.addresschallenge.a.j;
import com.google.android.finsky.billing.addresschallenge.a.q;
import com.google.android.finsky.billing.addresschallenge.placesapi.WhitelistedCountriesFlagParser;
import com.google.android.finsky.billing.addresschallenge.placesapi.a;
import com.google.android.finsky.billing.addresschallenge.placesapi.m;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.e;
import com.google.android.finsky.utils.h;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.ad;
import com.google.wireless.android.finsky.a.a.c;
import com.google.wireless.android.finsky.a.a.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BillingAddress extends LinearLayout implements com.google.android.finsky.billing.addresschallenge.s
{

    public EditText a;
    public EditText b;
    public EditText c;
    public Spinner d;
    public EditText e;
    public EditText f;
    public com.google.android.finsky.billing.addresschallenge.j g;
    public com.google.android.finsky.billing.addresschallenge.s h;
    public List i;
    public com.google.wireless.android.finsky.a.a.p j;
    public boolean k;
    public com.google.android.finsky.billing.addresschallenge.a.j l;
    public com.google.wireless.android.finsky.a.a.c m;
    public com.google.android.finsky.billing.addresschallenge.p n;
    public WhitelistedCountriesFlagParser o;
    public com.google.android.finsky.billing.addresschallenge.q p;

    BillingAddress(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.k = 0;
        ((LayoutInflater)p0.getSystemService("layout_inflater")).inflate(2130968644, this, 1);
    }

    private static void a(com.google.android.finsky.billing.addresschallenge.a.f p0, List p1) {
        v2 = p0.a.entrySet().iterator();
        while (v2.hasNext()) {
            v0 = (Map$Entry)v2.next();
            switch (((com.google.android.finsky.billing.addresschallenge.a.d)v0.getKey()).ordinal()) {
                case 0:
                    v0 = 8;
                    break;
                case 1:
                    v0 = 7;
                    break;
                case 2:
                    v4 = new Object[1];
                    v4[0] = v0.getKey();
                    FinskyLog.c("No equivalent for address widget field: %s", v4);
                    v0 = 13;
                    break;
                case 3:
                    v4 = new Object[1];
                    v4[0] = v0.getKey();
                    FinskyLog.c("No equivalent for address widget field: %s", v4);
                    v0 = 13;
                    break;
                case 4:
                    v0 = 5;
                    break;
                case 5:
                    v0 = 6;
                    break;
                case 6:
                    v0 = 11;
                    break;
                case 7:
                    v0 = 9;
                    break;
                case 8:
                    v4 = new Object[1];
                    v4[0] = v0.getKey();
                    FinskyLog.c("No equivalent for address widget field: %s", v4);
                    v0 = 13;
                    break;
                case 9:
                    v0 = 5;
                    break;
                case 10:
                    v0 = 10;
                    break;
                default:
                    v4 = new Object[1];
                    v4[0] = v0.getKey();
                    FinskyLog.c("No equivalent for address widget field: %s", v4);
                    v0 = 13;
                    break;
            }
            p1.add(com.google.android.finsky.billing.f.a(v0, 0));
        }
    }

    public final TextView a(com.google.wireless.android.finsky.a.a.ad p0) {
        v2 = this.getContext();
        switch (p0.c) {
            case 4:
                v3 = this.a;
                com.google.android.finsky.bg.ae.a(this.a, v2.getString(2131952596), p0.d);
                v1 = 0;
                break;
            case 5:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.e;
                v3 = 0;
                break;
            case 6:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.f;
                v3 = 0;
                break;
            case 7:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.b;
                v3 = 0;
                break;
            case 8:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.a;
                v3 = 0;
                break;
            case 9:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.h;
                v3 = 0;
                break;
            case 10:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.k;
                v3 = 0;
                break;
            case 11:
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.g;
                v3 = 0;
                break;
            case 12:
                v3 = this.e;
                com.google.android.finsky.bg.ae.a(this.e, v2.getString(2131952844), p0.d);
                v1 = 0;
                break;
            case 13:
                FinskyLog.a("Input error ADDR_WHOLE_ADDRESS. Displaying at ADDRESS_LINE_1.", new Object[0]);
                v1 = com.google.android.finsky.billing.addresschallenge.a.d.e;
                v3 = 0;
                break;
            case 14:
                v3 = new Object[2];
                v3[0] = Integer.valueOf(p0.c);
                v3[1] = p0.d;
                FinskyLog.a("InputValidationError that can't be displayed: type=%d, message=%s", v3);
                v1 = 0;
                v3 = 0;
                break;
            case 15:
                v3 = this.b;
                com.google.android.finsky.bg.ae.a(this.b, v2.getString(2131952202), p0.d);
                v1 = 0;
                break;
            case 16:
                v3 = this.c;
                com.google.android.finsky.bg.ae.a(this.c, v2.getString(2131952405), p0.d);
                v1 = 0;
                break;
            case 17:
                v3 = this.f;
                com.google.android.finsky.bg.ae.a(this.f, v2.getString(2131952105), p0.d);
                v1 = 0;
                break;
            default:
                v3 = new Object[2];
                v3[0] = Integer.valueOf(p0.c);
                v3[1] = p0.d;
                FinskyLog.a("InputValidationError that can't be displayed: type=%d, message=%s", v3);
                v1 = 0;
                v3 = 0;
                break;
        }
        if (v1 != 0) {
            if (this.l.b(v1) != 0) {
                v0 = (com.google.android.finsky.billing.addresschallenge.a.g)this.l.e.get(v1);
                if (v0 != 0 && v0.b == com.google.android.finsky.billing.addresschallenge.a.h.a) {
                    switch (v1.ordinal()) {
                        case 0:
                            v2 = ((Integer)com.google.android.finsky.billing.addresschallenge.a.j.p.get(this.l.n)).intValue();
                            break;
                        case 1:
                            v2 = 2131952388;
                            break;
                        case 2:
                            v2 = 2131952386;
                            break;
                        case 3:
                            v2 = 2131952386;
                            break;
                        case 4:
                            v2 = 2131952386;
                            break;
                        case 5:
                            v2 = 2131952386;
                            break;
                        case 6:
                            v2 = 2131952382;
                            break;
                        case 7:
                            if (this.l.t == com.google.android.finsky.billing.addresschallenge.a.q.b)
                                v2 = 2131952392;
                            else
                                v2 = 2131952397;
                            break;
                        default:
                            v2 = 2131952386;
                            break;
                    }
                    com.google.android.finsky.bg.ae.a((EditText)v0.f, v0.a, this.l.a.getString(v2));
                }
                v0 = v3;
            }
            else {
                v0 = this.a;
                com.google.android.finsky.bg.ae.a(this.a, v2.getString(2131952596), p0.d);
            }
        }
        else
            v0 = v3;
        return v0;
    }

    public final void a(float p0) {
        this.e.setTranslationY(p0);
        this.f.setTranslationY(p0);
        if (this.h != 0)
            this.h.a(p0);
    }

    public final void a(com.google.wireless.android.finsky.a.a.p p0, com.google.wireless.android.finsky.a.a.c p1, com.google.wireless.android.c.a.a.a p2) {
  2:    if (this.k == 0) {
  8:        v3 = this.i.iterator();
 12:        v2 = -1;
 13:        v1 = 0;
 14:        while (v3.hasNext()) {
 34:            if (p0.c.equals(((com.google.wireless.android.finsky.a.a.p)v3.next()).c))
 36:                v2 = v1;
 39:            v1 = v1 + 1;
            }
 41:        if (v2 >= 0) {
 45:            this.d.setSelection(v2);
 49:            this.k = 1;
            }
 54:        this.d.setVisibility(0);
        }
 57:    this.j = p0;
 59:    this.m = p1;
 64:    if (p1.b.length == 0) {
 69:        if (p1.a == 1) {
 73:            v0 = new int[8];
 77:            v0[0] = 4;
 82:            v0[1] = 10;
 87:            v0[2] = 9;
 91:            v0[3] = 5;
 95:            v0[4] = 6;
100:            v0[5] = 8;
104:            v0[6] = 7;
109:            v0[7] = 12;
            }
            else {
187:            v1 = ((Boolean)com.google.android.finsky.aa.b.X.b()).booleanValue();
191:            if (v1 != 0)
193:                v0 = 4;
                else
218:                v0 = 3;
194:            v0 = new int[v0];
198:            v0[0] = 4;
203:            v0[1] = 10;
208:            v0[2] = 9;
210:            if (v1 != 0)
215:                v0[3] = 12;
            }
111:        p1.b = v0;
        }
117:    v5 = new com.google.android.finsky.billing.addresschallenge.a.ae();
134:    v5.a(com.google.android.finsky.billing.addresschallenge.a.d.k).a(com.google.android.finsky.billing.addresschallenge.a.d.c).a(com.google.android.finsky.billing.addresschallenge.a.d.d);
137:    v6 = com.google.android.finsky.billing.addresschallenge.a.d.values();
143:    v3 = 0;
144:    if (v3 >= v6.length) {
248:        v3 = v5.a();
252:        v2 = 1;
253:        v1 = 1;
254:        v0 = 0;
255:        while (v0 < p1.b.length) {
264:            switch (p1.b[v0]) {
                    case 10:
307:                    v1 = 0;
544:                    break;
                    case 11:
544:                    break;
                    case 12:
305:                    v2 = 0;
544:                    break;
                    case 13:
544:                    break;
                    case 14:
544:                    break;
                    case 15:
281:                    this.a.setVisibility(8);
287:                    this.b.setVisibility(0);
544:                    break;
                    case 16:
295:                    this.a.setVisibility(8);
301:                    this.c.setVisibility(0);
544:                    break;
                    case 17:
273:                    this.f.setVisibility(0);
544:                    break;
                    default:
544:                    break;
                }
267:            v0 = v0 + 1;
            }
309:        if (v2 != 0)
315:            this.e.setVisibility(8);
318:        if (v1 != 0)
324:            this.d.setVisibility(8);
329:        if (this.l == 0) {
357:            this.l = new com.google.android.finsky.billing.addresschallenge.a.j(this.getContext(), this.g, v3, new com.google.android.finsky.billing.addresschallenge.l(com.google.android.finsky.m.a.dl()), this.j.c);
361:            this.l.a();
            }
364:        if (p2 != 0) {
372:            if (!TextUtils.isEmpty(p2.b))
378:                this.a.setText(p2.b);
387:            if (!TextUtils.isEmpty(p2.c))
393:                this.b.setText(p2.c);
402:            if (!TextUtils.isEmpty(p2.d))
408:                this.c.setText(p2.d);
417:            if (!TextUtils.isEmpty(p2.o))
423:                this.f.setText(p2.o);
432:            if (!TextUtils.isEmpty(p2.n))
438:                this.e.setText(p2.n);
443:            v1 = com.google.android.finsky.billing.addresschallenge.n.a(p2);
447:            if (v1 != 0) {
449:                this.l.q = v1;
453:                this.l.b.e();
                }
456:            this.l.a();
            }
461:        this.l.h = v3;
475:        if (!this.l.k.equalsIgnoreCase(this.j.c)) {
478:            this.l.q = 0;
480:            this.l.k = this.j.c;
486:            this.l.f.e = this.l.k;
488:            this.l.a();
            }
493:        this.g.setOnHeightOffsetChangedListener(this);
504:        if (this.o.a != 0 && this.o.a.contains(this.j.c))
514:            v0 = 1;
            else
533:            v0 = 0;
515:        if (v0 != 0) {
523:            this.n.c = this.j.c;
529:            this.l.a(this.n);
            }
            else
538:            this.l.a(0);
532:        return;
        }
153:    switch (v6[v3].ordinal()) {
            case 0:
153:            goto 220;
            case 1:
153:            goto 224;
            case 2:
153:            goto 156;
            case 3:
153:            goto 156;
            case 4:
153:            goto 227;
            case 5:
153:            goto 230;
            case 6:
153:            goto 233;
            case 7:
153:            goto 237;
            case 8:
153:            goto 156;
            case 9:
153:            goto 227;
            case 10:
153:            goto 241;
            default:
        }
157:    v2 = -1;
159:    if (v2 == -1) goto 542;
161:    v0 = 0;
163:    if (v0 >= p1.b.length) goto 542;
167:    if (p1.b[v0] != v2) goto 245;
169:    v0 = 0;
170:    if (v0 != 0)
172:        v5.a(v6[v3]);
177:    v3 = v3 + 1;
178:    goto 144;
222:    v2 = 8;
223:    goto 158;
225:    v2 = 7;
226:    goto 158;
228:    v2 = 5;
229:    goto 158;
231:    v2 = 6;
232:    goto 158;
235:    v2 = 11;
236:    goto 158;
239:    v2 = 9;
240:    goto 158;
243:    v2 = 10;
244:    goto 158;
245:    v0 = v0 + 1;
247:    goto 162;
542:    v0 = 1;
543:    goto 170;
    }

    public com.google.wireless.android.c.a.a.a getAddress() {
        v1 = 0;
        v3 = this.l.b();
        v5 = new com.google.wireless.android.c.a.a.a();
        v0 = 0;
        while (v0 < this.m.b.length) {
            switch (this.m.b[v0]) {
                case 4:
                    if (v3.j != 0)
                        v5.a(v3.j);
                    break;
                case 5:
                    if (v3.b != 0)
                        v5.b(v3.b);
                    break;
                case 6:
                    if (v3.c != 0)
                        v5.c(v3.c);
                    break;
                case 7:
                    if (v3.e != 0)
                        v5.d(v3.e);
                    break;
                case 8:
                    if (v3.d != 0)
                        v5.e(v3.d);
                    break;
                case 9:
                    if (v3.g != 0)
                        v5.f(v3.g);
                    break;
                case 10:
                    if (v3.a != 0) {
                        if (v3.a == 0)
                            throw new NullPointerException();
                        v5.a = v5.a | 256;
                        v5.j = v3.a;
                    }
                    break;
                case 11:
                    if (v3.f != 0) {
                        if (v3.f == 0)
                            throw new NullPointerException();
                        v5.a = v5.a | 512;
                        v5.k = v3.f;
                    }
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
        if (v3.h != 0) {
            if (v3.h == 0)
                throw new NullPointerException();
            v5.a = v5.a | 1024;
            v5.l = v3.h;
        }
        if (v3.k != 0) {
            if (v3.k == 0)
                throw new NullPointerException();
            v5.a = v5.a | 2048;
            v5.m = v3.k;
        }
        if (this.m.a != 1)
            v1 = 1;
        v5.a = v5.a | 16384;
        v5.p = v1;
        if (this.e.getVisibility() == 0) {
            v0 = this.e.getText().toString();
            if (v0 == 0)
                throw new NullPointerException();
            v5.a = v5.a | 4096;
            v5.n = v0;
        }
        if (this.a.getVisibility() == 0)
            v5.a(this.a.getText().toString());
        if (this.b.getVisibility() == 0) {
            v0 = this.b.getText().toString();
            if (v0 == 0)
                throw new NullPointerException();
            v5.a = v5.a | 2;
            v5.c = v0;
        }
        if (this.c.getVisibility() == 0) {
            v0 = this.c.getText().toString();
            if (v0 == 0)
                throw new NullPointerException();
            v5.a = v5.a | 4;
            v5.d = v0;
        }
        if (this.f.getVisibility() == 0) {
            v0 = this.f.getText().toString();
            if (v0 == 0)
                throw new NullPointerException();
            v5.a = v5.a | 8192;
            v5.o = v0;
        }
        return v5;
    }

    public List getAddressValidationErrors() {
        v1 = new ArrayList();
        v2 = new com.google.android.finsky.billing.addresschallenge.a.f();
        v5 = new com.google.android.finsky.billing.addresschallenge.a.ap(this.l.i);
        com.google.android.finsky.utils.e.a(new com.google.android.finsky.billing.addresschallenge.a.aw(this.l.i, this.l.b(), v2, v5)).start();
        try {
            v5.c();
        }
        catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        v2.a.keySet().removeAll(this.l.h.a);
        if (this.l.h.a(com.google.android.finsky.billing.addresschallenge.a.d.a) && (com.google.android.finsky.billing.addresschallenge.a.e)v2.a.get(com.google.android.finsky.billing.addresschallenge.a.d.h) != com.google.android.finsky.billing.addresschallenge.a.e.b)
            v2.a.remove(com.google.android.finsky.billing.addresschallenge.a.d.h);
        BillingAddress.a(v2, v1);
        if (this.a.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.a.getText()))
            v1.add(com.google.android.finsky.billing.f.a(4, this.getContext().getString(2131952389)));
        if (this.b.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.b.getText()))
            v1.add(com.google.android.finsky.billing.f.a(15, this.getContext().getString(2131952389)));
        if (this.c.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.c.getText()))
            v1.add(com.google.android.finsky.billing.f.a(16, this.getContext().getString(2131952389)));
        if (this.e.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.e.getText()))
            v1.add(com.google.android.finsky.billing.f.a(12, this.getContext().getString(2131952391)));
        if (this.f.getVisibility() == 0 && !Patterns.EMAIL_ADDRESS.matcher(this.f.getText()).matches())
            v1.add(com.google.android.finsky.billing.f.a(17, this.getContext().getString(2131952384)));
        return v1;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText)this.findViewById(2131755341);
        this.b = (EditText)this.findViewById(2131755369);
        this.c = (EditText)this.findViewById(2131755370);
        this.f = (EditText)this.findViewById(2131755373);
        this.d = (Spinner)this.findViewById(2131755371);
        this.e = (EditText)this.findViewById(2131755344);
        this.g = (com.google.android.finsky.billing.addresschallenge.j)this.findViewById(2131755372);
        this.n = new com.google.android.finsky.billing.addresschallenge.p(this, new com.google.android.finsky.billing.addresschallenge.placesapi.m((String)com.google.android.finsky.aa.b.cZ.b(), Locale.getDefault().getLanguage(), new com.google.android.finsky.billing.addresschallenge.placesapi.a(this.getContext())), com.google.android.finsky.m.a.bl());
        this.o = new WhitelistedCountriesFlagParser(this.getContext());
    }

    public void setBillingCountries(List p0) {
        this.i = p0;
        this.d = (Spinner)this.findViewById(2131755371);
        this.d.setPrompt(this.getResources().getText(2131953121));
        this.d.setOnItemSelectedListener(0);
        v1 = new ArrayAdapter(this.getContext(), 17367048);
        v1.setDropDownViewResource(17367049);
        v2 = this.i.iterator();
        while (v2.hasNext())
            v1.add(new com.google.android.finsky.billing.addresschallenge.r((com.google.wireless.android.finsky.a.a.p)v2.next()));
        this.d.setAdapter(v1);
        this.d.setOnItemSelectedListener(new com.google.android.finsky.billing.addresschallenge.o(this));
    }

    public void setBillingCountryChangeListener(com.google.android.finsky.billing.addresschallenge.q p0) {
        this.p = p0;
    }

    public void setEnabled(boolean p0) {
        this.a.setEnabled(p0);
        this.b.setEnabled(p0);
        this.c.setEnabled(p0);
        this.f.setEnabled(p0);
        this.d.setEnabled(p0);
        v1 = this.l.e.values().iterator();
        while (v1.hasNext()) {
            v0 = (com.google.android.finsky.billing.addresschallenge.a.g)v1.next();
            if (v0.f == 0)
                continue;
            v0.f.setEnabled(p0);
        }
        this.e.setEnabled(p0);
    }

}
