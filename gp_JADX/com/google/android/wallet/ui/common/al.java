package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

final class al implements TextWatcher {
    public StringBuilder f33525a;
    public int f33526b;
    public final /* synthetic */ FormEditText f33527c;

    al(FormEditText formEditText) {
        this.f33527c = formEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 0;
        this.f33525a = new StringBuilder(charSequence.length());
        this.f33526b = -1;
        FormEditText formEditText = this.f33527c;
        if (!(formEditText.getSelectionStart() == formEditText.getSelectionEnd() && i2 == 1 && i3 == 0)) {
            i4 = 0;
        }
        int i6;
        if (i4 != 0) {
            int size = this.f33527c.an.size();
            for (i6 = 0; i6 < size; i6++) {
                i4 = ((Integer) this.f33527c.an.get(i6)).intValue();
                if (this.f33526b < 0 && i4 >= i + 1) {
                    if (this.f33525a.length() > 0) {
                        this.f33526b = this.f33525a.length() - 1;
                        this.f33525a.deleteCharAt(this.f33526b);
                    } else {
                        this.f33526b = 0;
                    }
                }
                if (i4 >= charSequence.length()) {
                    break;
                }
                this.f33525a.append(charSequence.charAt(i4));
            }
            if (this.f33526b < 0) {
                this.f33526b = this.f33525a.length() - 1;
                this.f33525a.deleteCharAt(this.f33526b);
                return;
            }
            return;
        }
        i6 = this.f33527c.an.size();
        while (i5 < i6) {
            i4 = ((Integer) this.f33527c.an.get(i5)).intValue();
            if (i4 < i) {
                this.f33525a.append(charSequence.charAt(i4));
            } else {
                if (this.f33526b < 0) {
                    this.f33526b = this.f33525a.length();
                }
                if (i4 >= charSequence.length()) {
                    return;
                }
                if (i4 >= i + i2) {
                    this.f33525a.append(charSequence.charAt(i4));
                }
            }
            i5++;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f33526b >= 0) {
            this.f33525a.insert(this.f33526b, charSequence, i, i + i3);
            this.f33526b += i3;
        }
    }

    public final void afterTextChanged(Editable editable) {
        this.f33527c.m30517b(this.f33525a, false);
        if (this.f33526b < 0 || this.f33526b > this.f33527c.an.size()) {
            this.f33526b = this.f33527c.an.size();
        }
        this.f33527c.setCursorPositionInValue(this.f33526b);
    }
}
