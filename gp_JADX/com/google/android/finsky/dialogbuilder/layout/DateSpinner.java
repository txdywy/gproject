package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DateSpinner extends LinearLayout {
    public Spinner f15132a;
    public Spinner f15133b;
    public Spinner f15134c;
    public C1939f f15135d;

    public DateSpinner(Context context) {
        super(context);
        m14909a(C7582R.layout.date_spinner);
    }

    public DateSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14909a(C7582R.layout.date_spinner);
    }

    public DateSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14909a(C7582R.layout.date_spinner);
    }

    public DateSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m14909a(C7582R.layout.date_spinner);
    }

    public final void m14909a(int i) {
        inflate(getContext(), i, this);
        Calendar instance = GregorianCalendar.getInstance();
        Map displayNames = instance.getDisplayNames(2, 2, getResources().getConfiguration().locale);
        HashMap hashMap = new HashMap(displayNames.size());
        for (Entry entry : displayNames.entrySet()) {
            hashMap.put((Integer) entry.getValue(), (String) entry.getKey());
        }
        List arrayList = new ArrayList(hashMap.size());
        for (int i2 = 0; i2 < hashMap.size(); i2++) {
            arrayList.add((String) hashMap.get(Integer.valueOf(i2)));
        }
        OnItemSelectedListener c2804e = new C2804e(this);
        SpinnerAdapter c2810l = new C2810l(getContext(), arrayList);
        this.f15132a = (Spinner) findViewById(C7582R.id.birthday_month);
        this.f15132a.setAdapter(c2810l);
        this.f15132a.setOnItemSelectedListener(c2804e);
        SpinnerAdapter c2811m = new C2811m(getContext(), C7582R.string.day, 1, 31, 1);
        this.f15133b = (Spinner) findViewById(C7582R.id.birthday_day);
        this.f15133b.setAdapter(c2811m);
        this.f15133b.setOnItemSelectedListener(c2804e);
        c2811m = new C2811m(getContext(), C7582R.string.year, instance.get(1), 1900, -1);
        this.f15134c = (Spinner) findViewById(C7582R.id.birthday_year);
        this.f15134c.setAdapter(c2811m);
        this.f15134c.setOnItemSelectedListener(c2804e);
    }

    public Calendar getCalendarDate() {
        if (this.f15132a.getSelectedItem() == null || this.f15133b.getSelectedItem() == null || this.f15134c.getSelectedItem() == null) {
            return null;
        }
        return new GregorianCalendar(((Integer) this.f15134c.getSelectedItem()).intValue(), this.f15132a.getSelectedItemPosition() - 1, ((Integer) this.f15133b.getSelectedItem()).intValue());
    }

    public final boolean m14910a() {
        return (this.f15132a.getSelectedItem() == null && this.f15133b.getSelectedItem() == null && this.f15134c.getSelectedItem() == null) ? false : true;
    }

    public void setCalendarDate(Calendar calendar) {
        setDay(calendar.get(5));
        setMonth(calendar.get(2));
        setYear(calendar.get(1));
    }

    public void setDay(int i) {
        if (i < this.f15133b.getAdapter().getCount()) {
            this.f15133b.setSelection(i);
        }
    }

    public void setMonth(int i) {
        int i2 = i + 1;
        if (i2 < this.f15132a.getAdapter().getCount()) {
            this.f15132a.setSelection(i2);
        }
    }

    public void setYear(int i) {
        int i2 = (GregorianCalendar.getInstance().get(1) - i) + 1;
        if (i2 < this.f15134c.getAdapter().getCount()) {
            this.f15134c.setSelection(i2);
        }
    }

    public void setOnDateChangedListener(C1939f c1939f) {
        this.f15135d = c1939f;
    }
}
