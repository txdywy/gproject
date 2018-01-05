package com.google.android.finsky.billing.addresschallenge.a;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.text.Collator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class com.google.android.finsky.billing.addresschallenge.a.n
{

    public Spinner a;
    public com.google.android.finsky.billing.addresschallenge.a.d b;
    public com.google.android.finsky.billing.addresschallenge.a.d c;
    public ArrayAdapter d;
    public List e;

    n(Spinner p0, com.google.android.finsky.billing.addresschallenge.a.d p1, com.google.android.finsky.billing.addresschallenge.a.d p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    final com.google.android.finsky.billing.addresschallenge.a.aq a(String p0) {
        v1 = this.e.iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = (com.google.android.finsky.billing.addresschallenge.a.aq)v1.next();
            if (v0.a.equalsIgnoreCase(p0))
                return v0;
        }
    }

    public final void a(List p0, String p1) {
        this.e = p0;
        this.d.clear();
        v1 = p0.iterator();
        while (v1.hasNext())
            this.d.add(((com.google.android.finsky.billing.addresschallenge.a.aq)v1.next()).a());
        this.d.sort(Collator.getInstance(Locale.getDefault()));
        if (p1.length() == 0)
            this.a.setSelection(0);
        else
            this.a.setSelection(this.d.getPosition(p1));
    }

}
