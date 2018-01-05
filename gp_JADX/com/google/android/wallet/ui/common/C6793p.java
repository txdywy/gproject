package com.google.android.wallet.ui.common;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.android.wallet.common.util.C6594f;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.p402c.C6739a;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class C6793p extends C6739a {
    public static final TimeZone f33690a = TimeZone.getTimeZone("UTC");
    public final DateEditText f33691b;
    public final C6594f f33692c;
    public final GregorianCalendar f33693d;
    public final GregorianCalendar f33694e;
    public final CharSequence f33695f = this.f33691b.getFieldDescription();
    public final String f33696g;
    public final String f33697h;

    public C6793p(DateEditText dateEditText, d dVar, d dVar2) {
        this.f33691b = dateEditText;
        this.f33692c = dateEditText.getDateFormatter();
        this.f33696g = this.f33692c.m29921a(dVar.c, dVar.b, dVar.a);
        this.f33697h = this.f33692c.m29921a(dVar2.c, dVar2.b, dVar2.a);
        this.f33693d = new GregorianCalendar(dVar.a, dVar.b - 1, dVar.c);
        this.f33693d.setTimeZone(f33690a);
        this.f33693d.setLenient(false);
        try {
            this.f33693d.getTime();
            this.f33694e = new GregorianCalendar(dVar2.a, dVar2.b - 1, dVar2.c);
            this.f33694e.setTimeZone(f33690a);
            this.f33694e.setLenient(false);
            try {
                this.f33694e.getTime();
            } catch (Throwable e) {
                throw new IllegalArgumentException("Invalid maximum date, check the date component order?", e);
            }
        } catch (Throwable e2) {
            throw new IllegalArgumentException("Invalid minimum date, check the date component order?", e2);
        }
    }

    public final boolean mo5632a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText())) {
            return true;
        }
        switch (m30926a(this.f33691b.getDay(), this.f33691b.getMonth(), this.f33691b.getYear())) {
            case 0:
                this.i = null;
                return true;
            case 1:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_day_must_not_be_empty);
                return false;
            case 2:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_month_must_not_be_empty);
                return false;
            case 3:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_year_must_not_be_empty);
                return false;
            case 4:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_day_invalid);
                return false;
            case 5:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_month_invalid);
                return false;
            case 6:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_year_invalid);
                return false;
            case 7:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_date_invalid, new Object[]{this.f33695f});
                return false;
            case 8:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_date_before_min_date, new Object[]{this.f33696g});
                return false;
            case 9:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_date_after_max_date, new Object[]{this.f33697h});
                return false;
            case 10:
                this.i = this.f33691b.getContext().getString(C6625i.wallet_uic_error_year_length);
                return false;
            default:
                String valueOf = String.valueOf(textView.getText());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected date error: ").append(valueOf).toString());
        }
    }

    private final int m30926a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (TextUtils.isEmpty(this.f33691b.f33330h)) {
            i4 = 3;
            i5 = 1;
        } else if (this.f33692c.f32733d != 4 || i3 >= 1000) {
            i5 = 0;
            i4 = 0;
        } else {
            i4 = 10;
            i5 = 1;
        }
        if (TextUtils.isEmpty(this.f33691b.f33329g)) {
            i5++;
            i4 = 2;
        } else if (i2 <= 0 || i2 > 12) {
            i5++;
            i4 = 5;
        }
        if (TextUtils.isEmpty(this.f33691b.f33328f)) {
            i4 = i5 + 1;
            i5 = 1;
        } else {
            int i6 = i5;
            i5 = i4;
            i4 = i6;
        }
        if (i4 > 1 && !TextUtils.isEmpty(this.f33695f)) {
            return 7;
        }
        if (i4 == 1) {
            return i5;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i3, i2 - 1, 1);
        gregorianCalendar.setTimeZone(f33690a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(5, i);
        try {
            gregorianCalendar.get(5);
            if (gregorianCalendar.compareTo(this.f33693d) < 0) {
                return 8;
            }
            if (gregorianCalendar.compareTo(this.f33694e) > 0) {
                return 9;
            }
            return 0;
        } catch (IllegalArgumentException e) {
            return 4;
        }
    }
}
