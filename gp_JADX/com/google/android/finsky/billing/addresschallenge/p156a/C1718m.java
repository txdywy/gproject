package com.google.android.finsky.billing.addresschallenge.p156a;

import android.support.v7.widget.eq;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.finsky.billing.addresschallenge.AddressAutoComplete;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

final class C1718m implements Runnable {
    public final /* synthetic */ C1717l f8989a;

    C1718m(C1717l c1717l) {
        this.f8989a = c1717l;
    }

    public final void run() {
        C1715j c1715j = this.f8989a.f8988a;
        C1714i b = new C1729x(c1715j.f8969d).mo2422b(new am(an.DATA).m9555a(new C1707b().m9586a(c1715j.f8976k).m9584a()).m9554a().toString());
        C1712g c1712g = new C1712g(C1709d.ADMIN_AREA);
        String b2 = b.m9591b(C1708c.STATE_NAME_TYPE);
        c1715j.f8979n = b2;
        Integer num = (Integer) C1715j.f8964o.get(b2);
        if (num == null) {
            num = Integer.valueOf(C7582R.string.i18n_province);
        }
        c1712g.f8954a = c1715j.f8966a.getString(num.intValue());
        c1715j.f8970e.put(C1709d.ADMIN_AREA, c1712g);
        C1712g c1712g2 = new C1712g(C1709d.LOCALITY);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_locality_label);
        c1715j.f8970e.put(C1709d.LOCALITY, c1712g2);
        c1712g2 = new C1712g(C1709d.DEPENDENT_LOCALITY);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_dependent_locality_label);
        c1715j.f8970e.put(C1709d.DEPENDENT_LOCALITY, c1712g2);
        c1712g2 = new C1712g(C1709d.ADDRESS_LINE_1);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_address_line1_label);
        c1715j.f8970e.put(C1709d.ADDRESS_LINE_1, c1712g2);
        c1715j.f8970e.put(C1709d.STREET_ADDRESS, c1712g2);
        c1712g2 = new C1712g(C1709d.ADDRESS_LINE_2);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_address_line2_label);
        c1715j.f8970e.put(C1709d.ADDRESS_LINE_2, c1712g2);
        c1712g2 = new C1712g(C1709d.ORGANIZATION);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_organization_label);
        c1715j.f8970e.put(C1709d.ORGANIZATION, c1712g2);
        c1712g2 = new C1712g(C1709d.RECIPIENT);
        c1712g2.f8954a = c1715j.f8966a.getString(C7582R.string.i18n_recipient_label);
        c1715j.f8970e.put(C1709d.RECIPIENT, c1712g2);
        c1712g = new C1712g(C1709d.POSTAL_CODE);
        if (b.m9591b(C1708c.ZIP_NAME_TYPE) == null) {
            c1715j.f8983t = C1722q.POSTAL;
            b2 = c1715j.f8966a.getString(C7582R.string.i18n_postal_code_label);
        } else {
            c1715j.f8983t = C1722q.ZIP;
            b2 = c1715j.f8966a.getString(C7582R.string.i18n_zip_code_label);
        }
        c1712g.f8954a = b2;
        c1715j.f8970e.put(C1709d.POSTAL_CODE, c1712g);
        c1712g2 = new C1712g(C1709d.SORTING_CODE);
        c1712g2.f8954a = "CEDEX";
        c1715j.f8970e.put(C1709d.SORTING_CODE, c1712g2);
        ((C1712g) c1715j.f8970e.get(C1709d.ADMIN_AREA)).m9589a(c1715j.m9593a(C1709d.COUNTRY));
        ((C1712g) c1715j.f8970e.get(C1709d.LOCALITY)).m9589a(c1715j.m9593a(C1709d.ADMIN_AREA));
        List arrayList = new ArrayList();
        boolean z = true;
        for (C1709d c1709d : c1715j.f8972g.m9540a(c1715j.f8978m, c1715j.f8976k)) {
            boolean z2;
            if (!c1715j.f8973h.m9533a(c1709d)) {
                Object obj;
                ViewGroup viewGroup = c1715j.f8967b;
                C1712g c1712g3 = (C1712g) c1715j.f8970e.get(c1709d);
                String str = "";
                boolean contains = c1715j.f8973h.f8815b.contains(c1709d);
                CharSequence charSequence = c1712g3.f8954a;
                if (z && !contains && c1712g3.f8955b.equals(C1713h.EDIT) && c1712g3.f8957d == C1709d.ADDRESS_LINE_1 && c1715j.f8975j != null) {
                    obj = (AddressAutoComplete) c1715j.f8968c.inflate(C7582R.layout.address_autocomplete, viewGroup, false);
                    c1712g3.f8959f = obj;
                    obj.setHint(charSequence);
                    obj.setSuggestionProvider(c1715j.f8975j);
                } else if (c1712g3.f8955b.equals(C1713h.EDIT)) {
                    r0 = c1715j.f8968c.inflate(C7582R.layout.address_edittext, viewGroup, false);
                    c1712g3.f8959f = r0;
                    EditText editText = (EditText) r0;
                    editText.setEnabled(!contains);
                    if (charSequence.length() > 0) {
                        editText.setHint(charSequence);
                    }
                    if (c1712g3.f8957d == C1709d.POSTAL_CODE) {
                        editText.setInputType(editText.getInputType() | eq.FLAG_APPEARED_IN_PRE_LAYOUT);
                    }
                } else if (c1712g3.f8955b.equals(C1713h.SPINNER)) {
                    r0 = c1715j.f8968c.inflate(C7582R.layout.address_spinner, viewGroup, false);
                    c1712g3.f8959f = r0;
                    Spinner spinner = (Spinner) r0;
                    C1719n c1719n = new C1719n(spinner, c1712g3.f8957d, c1712g3.f8958e);
                    c1719n.f8993d = new ArrayAdapter(c1715j.f8966a, 17367048);
                    c1719n.f8993d.setDropDownViewResource(17367049);
                    spinner.setAdapter(c1719n.f8993d);
                    c1719n.m9607a(c1712g3.f8956c, str);
                    if (charSequence.length() > 0) {
                        spinner.setPrompt(charSequence);
                    }
                    spinner.setOnItemSelectedListener(c1715j);
                    c1715j.f8985v.add(c1719n);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    arrayList.add(obj);
                    z2 = false;
                    z = z2;
                }
            }
            z2 = z;
            z = z2;
        }
        c1715j.f8967b.setFields(arrayList);
        if (c1715j.f8980q != null) {
            c1715j.m9596a(c1715j.f8980q, true);
        }
        if (c1715j.f8981r != null) {
            c1715j.m9598a(c1715j.f8981r);
        }
        c1715j.f8967b.mo2406c();
        if (this.f8989a.f8988a.f8982s != null) {
            this.f8989a.f8988a.f8982s.m9608a();
        }
    }
}
