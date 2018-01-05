package com.google.android.wallet.ui.common;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.p402c.C6739a;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class C6796x extends C6739a {
    public static final TimeZone f33703a = TimeZone.getTimeZone("UTC");
    public final DateEditText f33704b;
    public final GregorianCalendar f33705c;
    public final GregorianCalendar f33706d;

    public C6796x(DateEditText dateEditText, d dVar, d dVar2) {
        this.f33704b = dateEditText;
        this.f33705c = new GregorianCalendar(dVar.a, dVar.b - 1, 1);
        this.f33705c.setTimeZone(f33703a);
        this.f33705c.setLenient(false);
        try {
            this.f33705c.getTime();
            this.f33706d = new GregorianCalendar(dVar2.a, dVar2.b - 1, 1);
            this.f33706d.setTimeZone(f33703a);
            this.f33706d.setLenient(false);
            try {
                this.f33706d.getTime();
            } catch (Throwable e) {
                throw new IllegalArgumentException("Invalid maximum date, check the date component order?", e);
            }
        } catch (Throwable e2) {
            throw new IllegalArgumentException("Invalid minimum date, check the date component order?", e2);
        }
    }

    protected final boolean mo5632a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText())) {
            return true;
        }
        boolean z;
        int month = this.f33704b.getMonth();
        int year = this.f33704b.getYear();
        if (month <= 0 || month > 12) {
            z = true;
        } else if (year == 0) {
            z = true;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month - 1, 1);
            gregorianCalendar.setTimeZone(f33703a);
            if (gregorianCalendar.compareTo(this.f33705c) < 0) {
                z = true;
            } else if (gregorianCalendar.compareTo(this.f33706d) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        switch (z) {
            case true:
                this.i = this.f33704b.getContext().getString(C6625i.wallet_uic_error_expired_credit_card);
                return false;
            case false:
                this.i = null;
                return true;
            case true:
                this.i = this.f33704b.getContext().getString(C6625i.wallet_uic_error_year_invalid);
                return false;
            case true:
                this.i = this.f33704b.getContext().getString(C6625i.wallet_uic_error_month_invalid);
                return false;
            default:
                this.i = this.f33704b.getContext().getString(C6625i.wallet_uic_error_year_must_not_be_empty);
                return false;
        }
    }
}
