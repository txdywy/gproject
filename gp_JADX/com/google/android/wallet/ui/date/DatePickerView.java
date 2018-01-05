package com.google.android.wallet.ui.date;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.an;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.common.util.C6594f;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.ui.common.ci;
import com.google.protobuf.nano.i;
import java.util.GregorianCalendar;

public class DatePickerView extends LinearLayout implements OnDateSetListener, OnClickListener, C6511g, C6754a {
    public TextView f33730a;
    public TextView f33731b;
    public al f33732c;
    public an f33733d;
    public C6594f f33734e;
    public ab f33735f;
    public d f33736g;
    public DatePickerView f33737h;

    public DatePickerView(Context context) {
        super(context);
    }

    public DatePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DatePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33730a = (TextView) findViewById(C6622f.label);
        this.f33731b = (TextView) findViewById(C6622f.date_text);
        setOnClickListener(this);
    }

    public void setPartnerDatePicker(DatePickerView datePickerView) {
        this.f33737h = datePickerView;
    }

    public d getCurrentDate() {
        return this.f33736g;
    }

    public void setEnabled(boolean z) {
        if (this.f33732c.g) {
            z = false;
        }
        super.setEnabled(z);
        ci.m30886d(this, z);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("currentDate", ParcelableProto.m29885a(this.f33736g));
        bundle.putInt("viewVisibility", getVisibility());
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            this.f33736g = (d) ParcelableProto.m29887a(bundle, "currentDate");
            setVisibility(bundle.getInt("viewVisibility"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onClick(View view) {
        if (this.f33735f != null) {
            i currentDate;
            i iVar = this.f33733d.b;
            i iVar2 = this.f33733d.c;
            if (this.f33737h != null) {
                if (this.f33733d.g == 1) {
                    currentDate = this.f33737h.getCurrentDate();
                    if (!m30947a(iVar2) && (m30947a(currentDate) || new GregorianCalendar(iVar2.a, iVar2.b, iVar2.c).compareTo(new GregorianCalendar(currentDate.a, currentDate.b, currentDate.c)) <= 0)) {
                        currentDate = iVar2;
                    }
                    iVar2 = currentDate;
                } else if (this.f33733d.g == 2) {
                    currentDate = this.f33737h.getCurrentDate();
                    if (!m30947a(iVar) && (m30947a(currentDate) || new GregorianCalendar(iVar.a, iVar.b, iVar.c).compareTo(new GregorianCalendar(currentDate.a, currentDate.b, currentDate.c)) >= 0)) {
                        currentDate = iVar;
                    }
                    iVar = currentDate;
                }
            }
            currentDate = this.f33736g;
            Fragment c6803b = new C6803b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("initialDate", ParcelableProto.m29885a(currentDate));
            bundle.putParcelable("minDate", ParcelableProto.m29885a(iVar));
            bundle.putParcelable("maxDate", ParcelableProto.m29885a(iVar2));
            c6803b.f(bundle);
            c6803b.af = this;
            c6803b.a(this.f33735f, "DatePickerDialog");
            return;
        }
        throw new IllegalStateException("FragmentManager not set in DatePickerView.");
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        m30948a(i, i2 + 1, i3);
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                setVisibility(0);
                return;
            case 11:
                setVisibility(8);
                return;
            default:
                throw new IllegalArgumentException("Unknown ResultingActionReference action type " + lVar.c);
        }
    }

    public int getYear() {
        return this.f33736g.a;
    }

    public int getMonth() {
        return this.f33736g.b;
    }

    public int getDay() {
        return this.f33736g.c;
    }

    public final void m30948a(int i, int i2, int i3) {
        this.f33731b.setText(this.f33734e.m29921a(i3, i2, i));
        this.f33736g.a = i;
        this.f33736g.b = i2;
        this.f33736g.c = i3;
    }

    private static boolean m30947a(d dVar) {
        return dVar == null || (dVar.a == 0 && dVar.b == 0 && dVar.c == 0);
    }
}
