package com.google.android.finsky.dialogbuilder.layout;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.GregorianCalendar;

final class C2804e implements OnItemSelectedListener {
    public final /* synthetic */ DateSpinner f15151a;

    C2804e(DateSpinner dateSpinner) {
        this.f15151a = dateSpinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DateSpinner dateSpinner = this.f15151a;
        if (!(dateSpinner.f15132a.getSelectedItem() == null && dateSpinner.f15134c.getSelectedItem() == null)) {
            int intValue;
            if (dateSpinner.f15134c.getSelectedItem() != null) {
                intValue = ((Integer) dateSpinner.f15134c.getSelectedItem()).intValue();
            } else {
                intValue = 2016;
            }
            int actualMaximum = new GregorianCalendar(intValue, dateSpinner.f15132a.getSelectedItemPosition() - 1, 1).getActualMaximum(5);
            if (dateSpinner.f15133b.getSelectedItem() != null && actualMaximum < ((Integer) dateSpinner.f15133b.getSelectedItem()).intValue()) {
                dateSpinner.f15133b.setSelection(0, true);
            }
            ((C2811m) dateSpinner.f15133b.getAdapter()).f15171e = actualMaximum;
        }
        if (this.f15151a.f15135d != null) {
            this.f15151a.f15135d.mo2545Y();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
