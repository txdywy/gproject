package com.google.android.finsky.billing.addresschallenge.p156a;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.text.Collator;
import java.util.List;
import java.util.Locale;

final class C1719n {
    public Spinner f8990a;
    public C1709d f8991b;
    public C1709d f8992c;
    public ArrayAdapter f8993d;
    public List f8994e;

    public C1719n(Spinner spinner, C1709d c1709d, C1709d c1709d2) {
        this.f8990a = spinner;
        this.f8991b = c1709d;
        this.f8992c = c1709d2;
    }

    public final void m9607a(List list, String str) {
        this.f8994e = list;
        this.f8993d.clear();
        for (aq a : list) {
            this.f8993d.add(a.m9559a());
        }
        this.f8993d.sort(Collator.getInstance(Locale.getDefault()));
        if (str.length() == 0) {
            this.f8990a.setSelection(0);
            return;
        }
        this.f8990a.setSelection(this.f8993d.getPosition(str));
    }

    final aq m9606a(String str) {
        for (aq aqVar : this.f8994e) {
            if (aqVar.f8849a.equalsIgnoreCase(str)) {
                return aqVar;
            }
        }
        return null;
    }
}
