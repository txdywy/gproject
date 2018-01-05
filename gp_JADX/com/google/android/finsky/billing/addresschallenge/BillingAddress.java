package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.addresschallenge.p156a.C1704a;
import com.google.android.finsky.billing.addresschallenge.p156a.C1709d;
import com.google.android.finsky.billing.addresschallenge.p156a.C1710e;
import com.google.android.finsky.billing.addresschallenge.p156a.C1711f;
import com.google.android.finsky.billing.addresschallenge.p156a.C1712g;
import com.google.android.finsky.billing.addresschallenge.p156a.C1713h;
import com.google.android.finsky.billing.addresschallenge.p156a.C1715j;
import com.google.android.finsky.billing.addresschallenge.p156a.C1722q;
import com.google.android.finsky.billing.addresschallenge.p156a.ad;
import com.google.android.finsky.billing.addresschallenge.p156a.ae;
import com.google.android.finsky.billing.addresschallenge.p156a.ap;
import com.google.android.finsky.billing.addresschallenge.p156a.av;
import com.google.android.finsky.billing.addresschallenge.p156a.aw;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1745a;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1757m;
import com.google.android.finsky.billing.addresschallenge.placesapi.WhitelistedCountriesFlagParser;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.C4677h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.c;
import com.google.wireless.android.finsky.a.a.p;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public class BillingAddress extends LinearLayout implements C1703s {
    public EditText f8768a;
    public EditText f8769b;
    public EditText f8770c;
    public Spinner f8771d;
    public EditText f8772e;
    public EditText f8773f;
    public C1702j f8774g;
    public C1703s f8775h;
    public List f8776i;
    public p f8777j;
    public boolean f8778k = false;
    public C1715j f8779l;
    public c f8780m;
    public C1744p f8781n;
    public WhitelistedCountriesFlagParser f8782o;
    public C1736q f8783p;

    public BillingAddress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C7582R.layout.billing_address_fields, this, true);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8768a = (EditText) findViewById(C7582R.id.name_entry);
        this.f8769b = (EditText) findViewById(C7582R.id.first_name);
        this.f8770c = (EditText) findViewById(C7582R.id.last_name);
        this.f8773f = (EditText) findViewById(C7582R.id.email_address);
        this.f8771d = (Spinner) findViewById(C7582R.id.country);
        this.f8772e = (EditText) findViewById(C7582R.id.phone_number);
        this.f8774g = (C1702j) findViewById(C7582R.id.address_widget);
        this.f8781n = new C1744p(this, new C1757m((String) C0955b.cZ.m28964b(), Locale.getDefault().getLanguage(), new C1745a(getContext())), C1473m.f7980a.bl());
        this.f8782o = new WhitelistedCountriesFlagParser(getContext());
    }

    public void setEnabled(boolean z) {
        this.f8768a.setEnabled(z);
        this.f8769b.setEnabled(z);
        this.f8770c.setEnabled(z);
        this.f8773f.setEnabled(z);
        this.f8771d.setEnabled(z);
        for (C1712g c1712g : this.f8779l.f8970e.values()) {
            if (c1712g.f8959f != null) {
                c1712g.f8959f.setEnabled(z);
            }
        }
        this.f8772e.setEnabled(z);
    }

    public void setBillingCountryChangeListener(C1736q c1736q) {
        this.f8783p = c1736q;
    }

    public void setBillingCountries(List list) {
        this.f8776i = list;
        this.f8771d = (Spinner) findViewById(C7582R.id.country);
        this.f8771d.setPrompt(getResources().getText(C7582R.string.select_location));
        this.f8771d.setOnItemSelectedListener(null);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(getContext(), 17367048);
        arrayAdapter.setDropDownViewResource(17367049);
        for (p c1758r : this.f8776i) {
            arrayAdapter.add(new C1758r(c1758r));
        }
        this.f8771d.setAdapter(arrayAdapter);
        this.f8771d.setOnItemSelectedListener(new C1743o(this));
    }

    public final void m9516a(p pVar, c cVar, a aVar) {
        int i;
        Object obj;
        C1715j c1715j;
        if (!this.f8778k) {
            i = -1;
            int i2 = 0;
            for (p pVar2 : this.f8776i) {
                if (pVar.c.equals(pVar2.c)) {
                    i = i2;
                }
                i2++;
            }
            if (i >= 0) {
                this.f8771d.setSelection(i);
                this.f8778k = true;
            }
            this.f8771d.setVisibility(0);
        }
        this.f8777j = pVar;
        this.f8780m = cVar;
        if (cVar.b.length == 0) {
            int[] iArr;
            if (cVar.a == 1) {
                iArr = new int[]{4, 10, 9, 5, 6, 8, 7, 12};
            } else {
                boolean booleanValue = ((Boolean) C0955b.f5880X.m28964b()).booleanValue();
                iArr = new int[(booleanValue ? 4 : 3)];
                iArr[0] = 4;
                iArr[1] = 10;
                iArr[2] = 9;
                if (booleanValue) {
                    iArr[3] = 12;
                }
            }
            cVar.b = iArr;
        }
        int[] iArr2 = cVar.b;
        ae aeVar = new ae();
        aeVar.m9536a(C1709d.COUNTRY).m9536a(C1709d.RECIPIENT).m9536a(C1709d.ORGANIZATION);
        for (C1709d c1709d : C1709d.values()) {
            int i3;
            switch (c1709d.ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 7;
                    break;
                case 4:
                case 9:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 11;
                    break;
                case 7:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                i3 = 0;
                while (i3 < iArr2.length) {
                    if (iArr2[i3] == i) {
                        obj = null;
                        if (obj != null) {
                            aeVar.m9536a(c1709d);
                        }
                    } else {
                        i3++;
                    }
                }
            }
            i3 = 1;
            if (obj != null) {
                aeVar.m9536a(c1709d);
            }
        }
        ad a = aeVar.m9535a();
        Object obj2 = 1;
        Object obj3 = 1;
        for (int i4 : cVar.b) {
            switch (i4) {
                case 10:
                    obj3 = null;
                    break;
                case 12:
                    obj2 = null;
                    break;
                case 15:
                    this.f8768a.setVisibility(8);
                    this.f8769b.setVisibility(0);
                    break;
                case 16:
                    this.f8768a.setVisibility(8);
                    this.f8770c.setVisibility(0);
                    break;
                case 17:
                    this.f8773f.setVisibility(0);
                    break;
                default:
                    break;
            }
        }
        if (obj2 != null) {
            this.f8772e.setVisibility(8);
        }
        if (obj3 != null) {
            this.f8771d.setVisibility(8);
        }
        if (this.f8779l == null) {
            this.f8779l = new C1715j(getContext(), this.f8774g, a, new C1740l(C1473m.f7980a.dl()), this.f8777j.c);
            this.f8779l.m9594a();
        }
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.b)) {
                this.f8768a.setText(aVar.b);
            }
            if (!TextUtils.isEmpty(aVar.c)) {
                this.f8769b.setText(aVar.c);
            }
            if (!TextUtils.isEmpty(aVar.d)) {
                this.f8770c.setText(aVar.d);
            }
            if (!TextUtils.isEmpty(aVar.o)) {
                this.f8773f.setText(aVar.o);
            }
            if (!TextUtils.isEmpty(aVar.n)) {
                this.f8772e.setText(aVar.n);
            }
            c1715j = this.f8779l;
            C1704a a2 = C1742n.m9644a(aVar);
            if (a2 != null) {
                c1715j.f8980q = a2;
                c1715j.f8967b.mo2408e();
            }
            c1715j.m9594a();
        }
        this.f8779l.f8973h = a;
        c1715j = this.f8779l;
        String str = this.f8777j.c;
        if (!c1715j.f8976k.equalsIgnoreCase(str)) {
            c1715j.f8980q = null;
            c1715j.f8976k = str;
            c1715j.f8971f.f8809e = c1715j.f8976k;
            c1715j.m9594a();
        }
        this.f8774g.setOnHeightOffsetChangedListener(this);
        WhitelistedCountriesFlagParser whitelistedCountriesFlagParser = this.f8782o;
        obj = (whitelistedCountriesFlagParser.f9048a == null || !whitelistedCountriesFlagParser.f9048a.contains(this.f8777j.c)) ? null : 1;
        if (obj != null) {
            this.f8781n.f9046c = this.f8777j.c;
            this.f8779l.m9597a(this.f8781n);
            return;
        }
        this.f8779l.m9597a(null);
    }

    public final TextView m9514a(com.google.wireless.android.finsky.a.a.ad adVar) {
        TextView textView;
        C1709d c1709d;
        Context context = getContext();
        String str = adVar.d;
        switch (adVar.c) {
            case 4:
                textView = this.f8768a;
                com.google.android.finsky.bg.ae.m9219a(this.f8768a, context.getString(C7582R.string.name), str);
                c1709d = null;
                break;
            case 5:
                break;
            case 6:
                c1709d = C1709d.ADDRESS_LINE_2;
                textView = null;
                break;
            case 7:
                c1709d = C1709d.LOCALITY;
                textView = null;
                break;
            case 8:
                c1709d = C1709d.ADMIN_AREA;
                textView = null;
                break;
            case 9:
                c1709d = C1709d.POSTAL_CODE;
                textView = null;
                break;
            case 10:
                c1709d = C1709d.COUNTRY;
                textView = null;
                break;
            case 11:
                c1709d = C1709d.DEPENDENT_LOCALITY;
                textView = null;
                break;
            case 12:
                textView = this.f8772e;
                com.google.android.finsky.bg.ae.m9219a(this.f8772e, context.getString(C7582R.string.phone_number), str);
                c1709d = null;
                break;
            case 13:
                FinskyLog.m21659a("Input error ADDR_WHOLE_ADDRESS. Displaying at ADDRESS_LINE_1.", new Object[0]);
                break;
            case 15:
                textView = this.f8769b;
                com.google.android.finsky.bg.ae.m9219a(this.f8769b, context.getString(C7582R.string.first_name), str);
                c1709d = null;
                break;
            case 16:
                textView = this.f8770c;
                com.google.android.finsky.bg.ae.m9219a(this.f8770c, context.getString(C7582R.string.last_name), str);
                c1709d = null;
                break;
            case 17:
                textView = this.f8773f;
                com.google.android.finsky.bg.ae.m9219a(this.f8773f, context.getString(C7582R.string.email_address), str);
                c1709d = null;
                break;
            default:
                FinskyLog.m21659a("InputValidationError that can't be displayed: type=%d, message=%s", Integer.valueOf(adVar.c), adVar.d);
                c1709d = null;
                textView = null;
                break;
        }
        c1709d = C1709d.ADDRESS_LINE_1;
        textView = null;
        if (c1709d == null) {
            return textView;
        }
        if (this.f8779l.m9599b(c1709d) != null) {
            C1715j c1715j = this.f8779l;
            C1712g c1712g = (C1712g) c1715j.f8970e.get(c1709d);
            if (c1712g != null && c1712g.f8955b == C1713h.EDIT) {
                int intValue;
                switch (c1709d.ordinal()) {
                    case 0:
                        intValue = ((Integer) C1715j.f8965p.get(c1715j.f8979n)).intValue();
                        break;
                    case 1:
                        intValue = C7582R.string.invalid_locality_label;
                        break;
                    case 6:
                        intValue = C7582R.string.invalid_dependent_locality_label;
                        break;
                    case 7:
                        if (c1715j.f8983t != C1722q.POSTAL) {
                            intValue = C7582R.string.invalid_zip_code_label;
                            break;
                        }
                        intValue = C7582R.string.invalid_postal_code_label;
                        break;
                    default:
                        intValue = C7582R.string.invalid_entry;
                        break;
                }
                com.google.android.finsky.bg.ae.m9219a((EditText) c1712g.f8959f, c1712g.f8954a, c1715j.f8966a.getString(intValue));
            }
            return textView;
        }
        TextView textView2 = this.f8768a;
        com.google.android.finsky.bg.ae.m9219a(this.f8768a, context.getString(C7582R.string.name), str);
        return textView2;
    }

    private static void m9513a(C1711f c1711f, List list) {
        for (Entry key : c1711f.f8953a.entrySet()) {
            int i;
            switch (((C1709d) key.getKey()).ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 7;
                    break;
                case 4:
                case 9:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 11;
                    break;
                case 7:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                default:
                    FinskyLog.m21665c("No equivalent for address widget field: %s", ((Entry) r2.next()).getKey());
                    i = 13;
                    break;
            }
            list.add(C1833f.m9859a(i, null));
        }
    }

    public List getAddressValidationErrors() {
        List arrayList = new ArrayList();
        C1715j c1715j = this.f8779l;
        C1711f c1711f = new C1711f();
        C1704a b = c1715j.m9600b();
        av avVar = c1715j.f8974i;
        Object apVar = new ap(avVar);
        C4674e.m21809a(new aw(avVar, b, c1711f, apVar)).start();
        try {
            apVar.m9558c();
            c1711f.f8953a.keySet().removeAll(c1715j.f8973h.f8814a);
            if (c1715j.f8973h.m9533a(C1709d.ADMIN_AREA)) {
                if (((C1710e) c1711f.f8953a.get(C1709d.POSTAL_CODE)) != C1710e.MISSING_REQUIRED_FIELD) {
                    c1711f.f8953a.remove(C1709d.POSTAL_CODE);
                }
            }
            m9513a(c1711f, arrayList);
            if (this.f8768a.getVisibility() == 0 && C4677h.m21811a(this.f8768a.getText())) {
                arrayList.add(C1833f.m9859a(4, getContext().getString(C7582R.string.invalid_name)));
            }
            if (this.f8769b.getVisibility() == 0 && C4677h.m21811a(this.f8769b.getText())) {
                arrayList.add(C1833f.m9859a(15, getContext().getString(C7582R.string.invalid_name)));
            }
            if (this.f8770c.getVisibility() == 0 && C4677h.m21811a(this.f8770c.getText())) {
                arrayList.add(C1833f.m9859a(16, getContext().getString(C7582R.string.invalid_name)));
            }
            if (this.f8772e.getVisibility() == 0 && C4677h.m21811a(this.f8772e.getText())) {
                arrayList.add(C1833f.m9859a(12, getContext().getString(C7582R.string.invalid_phone)));
            }
            if (this.f8773f.getVisibility() == 0) {
                if (!Patterns.EMAIL_ADDRESS.matcher(this.f8773f.getText()).matches()) {
                    arrayList.add(C1833f.m9859a(17, getContext().getString(C7582R.string.invalid_email)));
                }
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public a getAddress() {
        String str;
        boolean z = false;
        C1704a b = this.f8779l.m9600b();
        int[] iArr = this.f8780m.b;
        a aVar = new a();
        for (int i : iArr) {
            String str2;
            switch (i) {
                case 4:
                    if (b.f8793j == null) {
                        break;
                    }
                    aVar.a(b.f8793j);
                    break;
                case 5:
                    if (b.f8785b == null) {
                        break;
                    }
                    aVar.b(b.f8785b);
                    break;
                case 6:
                    if (b.f8786c == null) {
                        break;
                    }
                    aVar.c(b.f8786c);
                    break;
                case 7:
                    if (b.f8788e == null) {
                        break;
                    }
                    aVar.d(b.f8788e);
                    break;
                case 8:
                    if (b.f8787d == null) {
                        break;
                    }
                    aVar.e(b.f8787d);
                    break;
                case 9:
                    if (b.f8790g == null) {
                        break;
                    }
                    aVar.f(b.f8790g);
                    break;
                case 10:
                    if (b.f8784a != null) {
                        str2 = b.f8784a;
                        if (str2 != null) {
                            aVar.a |= 256;
                            aVar.j = str2;
                            break;
                        }
                        throw new NullPointerException();
                    }
                    continue;
                case 11:
                    if (b.f8789f != null) {
                        str2 = b.f8789f;
                        if (str2 != null) {
                            aVar.a |= 512;
                            aVar.k = str2;
                            break;
                        }
                        throw new NullPointerException();
                    }
                    continue;
                default:
                    break;
            }
        }
        if (b.f8791h != null) {
            str = b.f8791h;
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            aVar.l = str;
        }
        if (b.f8794k != null) {
            str = b.f8794k;
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= eq.FLAG_MOVED;
            aVar.m = str;
        }
        if (this.f8780m.a != 1) {
            z = true;
        }
        aVar.a |= 16384;
        aVar.p = z;
        if (this.f8772e.getVisibility() == 0) {
            str = this.f8772e.getText().toString();
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
            aVar.n = str;
        }
        if (this.f8768a.getVisibility() == 0) {
            aVar.a(this.f8768a.getText().toString());
        }
        if (this.f8769b.getVisibility() == 0) {
            str = this.f8769b.getText().toString();
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= 2;
            aVar.c = str;
        }
        if (this.f8770c.getVisibility() == 0) {
            str = this.f8770c.getText().toString();
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= 4;
            aVar.d = str;
        }
        if (this.f8773f.getVisibility() == 0) {
            str = this.f8773f.getText().toString();
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.a |= 8192;
            aVar.o = str;
        }
        return aVar;
    }

    public final void mo2412a(float f) {
        this.f8772e.setTranslationY(f);
        this.f8773f.setTranslationY(f);
        if (this.f8775h != null) {
            this.f8775h.mo2412a(f);
        }
    }
}
