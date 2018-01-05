package com.google.android.wallet.ui.creditcard;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import com.google.a.a.a.a.b.a.a.c.b.a.w;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p383e.C6619c;
import com.google.android.wallet.ui.common.ci;
import java.util.ArrayList;

final class C6800d implements TextWatcher {
    public final /* synthetic */ CreditCardNumberEditText f33728a;

    C6800d(CreditCardNumberEditText creditCardNumberEditText) {
        this.f33728a = creditCardNumberEditText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length;
        String substring;
        Object obj;
        x cardType = this.f33728a.getCardType();
        View view = this.f33728a;
        String a = C6600l.m29944a(this.f33728a.getText().toString());
        if (!((view.f33716m == null && view.f33718o == null) || a.startsWith(view.f33708e))) {
            view.f33716m = null;
            view.f33718o = null;
        }
        if (view.f33716m == null && view.f33714k != null) {
            view.f33715l.clear();
            for (x xVar : view.f33714k) {
                String str = a;
                for (w wVar : xVar.b) {
                    if (wVar.b.length() < str.length()) {
                        length = wVar.b.length();
                    } else {
                        length = str.length();
                    }
                    str = str.substring(0, length);
                    String substring2 = wVar.b.substring(0, length);
                    substring = wVar.c.substring(0, length);
                    if (str.compareTo(substring2) >= 0 && str.compareTo(substring) <= 0) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    view.f33715l.add(xVar);
                }
            }
            if (view.f33715l.size() == 1) {
                x xVar2 = (x) view.f33715l.get(0);
                w a2 = CreditCardNumberEditText.m30930a(xVar2.b, a);
                if (a2 != null) {
                    view.f33716m = Pair.create(xVar2, a2);
                }
            }
        }
        if (view.f33718o == null) {
            view.f33718o = CreditCardNumberEditText.m30930a(view.f33717n, a);
        }
        length = view.mo5663m();
        if (a.length() > length) {
            substring = a.substring(0, length);
        } else {
            substring = a;
        }
        view.f33708e = substring;
        if (view.f33712i && view.mo5623b() && !view.mo5581e()) {
            view.setTextColor(view.getResources().getColor(C6619c.wallet_uic_error_color));
            ci.m30851a(view.getContext(), view);
        } else {
            view.setTextColor(view.f33709f);
        }
        x cardType2 = this.f33728a.getCardType();
        obj = !C6600l.m29951a(cardType, cardType2) ? 1 : null;
        if (this.f33728a.f33713j != null) {
            if (obj != null) {
                this.f33728a.f33713j.mo5569a(cardType2);
            }
            if (obj != null || cardType2 == null) {
                C6656e c6656e = this.f33728a.f33713j;
                ArrayList arrayList = this.f33728a.f33715l;
                c6656e.cR_();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        CharSequence b = this.f33728a.m30936b(this.f33728a.f33708e);
        if (!b.equals(editable.toString())) {
            editable.replace(0, editable.length(), b);
        }
    }
}
