package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.wallet.common.util.C6600l;

final class C6792o implements TextWatcher {
    public boolean f33680a;
    public StringBuilder f33681b;
    public int f33682c;
    public boolean f33683d = false;
    public String f33684e;
    public boolean f33685f;
    public int f33686g;
    public int f33687h;
    public int f33688i;
    public final /* synthetic */ DateEditText f33689j;

    C6792o(DateEditText dateEditText) {
        this.f33689j = dateEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f33683d) {
            boolean z;
            this.f33684e = charSequence.toString();
            this.f33689j.f33331i = false;
            this.f33686g = -1;
            this.f33687h = -1;
            this.f33688i = -1;
            this.f33680a = false;
            this.f33681b = new StringBuilder(charSequence);
            this.f33682c = i;
            if (i2 == 1 && i3 == 0) {
                this.f33680a = true;
                if (this.f33689j.f33327e.equals(charSequence.subSequence(i, i + i2).toString())) {
                    z = true;
                    if (z) {
                        this.f33681b.delete(i, i + i2);
                        return;
                    }
                    if (i > 0) {
                        this.f33681b.deleteCharAt(i - 1);
                        this.f33682c--;
                        this.f33685f = true;
                        this.f33686g = i - 1;
                        this.f33687h = 0;
                        this.f33688i = 1;
                    }
                    this.f33689j.f33331i = true;
                }
            }
            z = false;
            if (z) {
                this.f33681b.delete(i, i + i2);
                return;
            }
            if (i > 0) {
                this.f33681b.deleteCharAt(i - 1);
                this.f33682c--;
                this.f33685f = true;
                this.f33686g = i - 1;
                this.f33687h = 0;
                this.f33688i = 1;
            }
            this.f33689j.f33331i = true;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f33683d) {
            this.f33681b.insert(this.f33682c, charSequence, i, i + i3);
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.f33683d) {
            DateEditText dateEditText = this.f33689j;
            String[] split = dateEditText.f33326d.split(this.f33681b, dateEditText.f33335m);
            CharSequence charSequence = "";
            String str = "";
            String str2 = "";
            String str3 = "";
            int i = 0;
            int i2 = 0;
            while (i2 <= split.length) {
                String a = i2 < split.length ? C6600l.m29944a(split[i2]) : "";
                if (!TextUtils.isEmpty(a) || !TextUtils.isEmpty(charSequence)) {
                    int length = a.length();
                    String str4 = "";
                    String a2;
                    String valueOf;
                    Object obj;
                    if (i2 == dateEditText.f33332j) {
                        a2 = DateEditText.m30595a(a, true);
                        if (length - a2.length() == 1) {
                            str3 = a.substring(length - 1);
                        } else {
                            str3 = str4;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            str4 = String.valueOf(charSequence);
                            a = String.valueOf(a2);
                            if (Integer.parseInt(a.length() != 0 ? str4.concat(a) : new String(str4)) <= 31) {
                                String valueOf2 = String.valueOf(charSequence);
                                valueOf = String.valueOf(a2);
                                valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                                i = 1;
                                String str5 = str3;
                                str3 = valueOf;
                                charSequence = str5;
                            }
                        }
                        obj = str3;
                        str3 = a2;
                    } else if (i2 == dateEditText.f33333k) {
                        a2 = DateEditText.m30595a(a, false);
                        if (length - a2.length() == 1) {
                            str4 = a.substring(length - 1);
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            a = String.valueOf(charSequence);
                            str2 = String.valueOf(a2);
                            if (Integer.parseInt(str2.length() != 0 ? a.concat(str2) : new String(a)) <= 12) {
                                str2 = String.valueOf(charSequence);
                                valueOf = String.valueOf(a2);
                                i = 1;
                                str2 = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                                obj = str4;
                            }
                        }
                        obj = str4;
                        str2 = a2;
                    } else if (i2 != dateEditText.f33334l) {
                        obj = str4;
                    } else if (length > dateEditText.f33336n) {
                        if (length == 4 && dateEditText.f33336n == 2) {
                            str = a.substring(2);
                            obj = str4;
                        } else {
                            if (length - dateEditText.f33336n == 1) {
                                str4 = a.substring(dateEditText.f33336n);
                            }
                            str = a.substring(0, dateEditText.f33336n);
                            obj = str4;
                        }
                    } else if (length >= dateEditText.f33336n || TextUtils.isEmpty(charSequence)) {
                        obj = str4;
                        str = a;
                    } else {
                        str = String.valueOf(charSequence);
                        valueOf = String.valueOf(a);
                        i = 1;
                        str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                        obj = str4;
                    }
                }
                i2++;
            }
            dateEditText.f33329g = str2;
            dateEditText.f33328f = str3;
            dateEditText.f33330h = str;
            charSequence = this.f33689j.mo5627c();
            this.f33683d = true;
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!charSequence.equals(editable.toString())) {
                editable.replace(0, editable.length(), charSequence);
            }
            if (this.f33685f) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16);
                obtain.setBeforeText(this.f33684e);
                obtain.setFromIndex(this.f33686g);
                obtain.setAddedCount(this.f33687h);
                obtain.setRemovedCount(this.f33688i);
                this.f33689j.sendAccessibilityEventUnchecked(obtain);
            }
            this.f33683d = false;
            this.f33685f = false;
            if (selectionStart == selectionEnd) {
                this.f33689j.m30599a(selectionStart + i, this.f33680a);
            }
        }
    }
}
