package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

final class am implements TextWatcher {
    public int f33528a = -1;
    public String f33529b = null;
    public Character f33530c = null;
    public final /* synthetic */ FormEditText f33531d;

    am(FormEditText formEditText) {
        this.f33531d = formEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object obj = 1;
        FormEditText formEditText = this.f33531d;
        if (!(formEditText.getSelectionStart() == formEditText.getSelectionEnd() && i2 == 1 && i3 == 0)) {
            obj = null;
        }
        this.f33530c = obj != null ? Character.valueOf(charSequence.charAt(i)) : null;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f33528a = i + i3;
        this.f33529b = charSequence.toString();
    }

    public final void afterTextChanged(Editable editable) {
        String a = this.f33531d.al.m30764a((CharSequence) editable);
        if (!editable.toString().equals(a)) {
            int length;
            this.f33531d.m30520c(a, false);
            bn bnVar = this.f33531d.al;
            String str = this.f33529b;
            int i = this.f33528a;
            Character ch = this.f33530c;
            int length2 = a.length();
            if (bnVar.f33574b.d && a.startsWith(bnVar.f33574b.c)) {
                length = bnVar.f33574b.c.length() + 0;
            } else if (bnVar.f33574b.d || !a.endsWith(bnVar.f33574b.c)) {
                length = 0;
            } else {
                length2 -= bnVar.f33574b.c.length();
                length = 0;
            }
            int length3 = str.length();
            int i2 = 0;
            while (i2 <= i && i2 < length3 && length < length2) {
                Character valueOf = Character.valueOf(str.charAt(i2));
                Character valueOf2 = Character.valueOf(a.charAt(length));
                if (ch == null || i2 != i || !ch.equals(valueOf2)) {
                    int i3;
                    if (Character.isDigit(valueOf.charValue())) {
                        valueOf2 = Character.valueOf(a.charAt(length));
                        while (valueOf2 != null && !bnVar.m30765a(valueOf2)) {
                            Character valueOf3;
                            i3 = length + 1;
                            if (i3 < length2) {
                                valueOf3 = Character.valueOf(a.charAt(i3));
                            } else {
                                valueOf3 = null;
                            }
                            Character ch2 = valueOf3;
                            length = i3;
                            valueOf2 = ch2;
                        }
                    } else if (valueOf.equals(bnVar.f33576d)) {
                        i3 = a.indexOf(bnVar.f33576d.charValue(), length);
                        if (i3 >= length) {
                            length = i3;
                        }
                    }
                    if (length >= length2) {
                        break;
                    }
                    if (valueOf.equals(Character.valueOf(a.charAt(length))) && i2 != i) {
                        length++;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.f33531d.setSelection(length);
        }
    }
}
