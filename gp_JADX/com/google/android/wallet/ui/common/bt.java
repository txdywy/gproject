package com.google.android.wallet.ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import com.google.a.a.a.a.b.a.a.f.k;
import com.google.a.a.a.a.b.a.a.f.l;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class bt extends LinearLayout implements TextWatcher, OnFocusChangeListener, OnItemSelectedListener, aa {
    public k f33578a;
    public FormSpinner f33579b;
    public FormEditText f33580c;
    public at f33581d;
    public int f33582e;
    public int f33583f = -1;
    public String f33584g = "";
    public View f33585h;

    public static bt m30768a(Activity activity, k kVar, Context context, int i) {
        int i2 = 0;
        TextWatcher btVar = new bt(context);
        btVar.setId(i);
        btVar.f33578a = kVar;
        btVar.f33580c.setHint(btVar.f33578a.b);
        if (btVar.m30775c()) {
            btVar.f33579b.setRequired(true);
            int length = btVar.f33578a.e.length;
            List arrayList = new ArrayList(length);
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(new C6790k(btVar.f33578a.e[i3], btVar.f33578a.d[i3]));
            }
            Collections.sort(arrayList, new C6791l(Collator.getInstance(Locale.getDefault())));
            SpinnerAdapter c6789j = new C6789j(btVar.getContext(), C6623g.view_row_spinner, C6622f.description, arrayList);
            c6789j.setDropDownViewResource(C6623g.view_spinner_dropdown);
            btVar.f33579b.setAdapter(c6789j);
            btVar.f33582e = btVar.m30771b(btVar.f33578a.f);
            if (btVar.f33582e == -1) {
                throw new IllegalStateException("Default region code must be in region codes.");
            }
            btVar.f33579b.setOnItemSelectedListener(btVar);
            btVar.f33580c.m30513b(btVar);
        }
        if (btVar.f33578a.c != null) {
            if (!btVar.m30775c() || TextUtils.isEmpty(btVar.f33578a.c.d)) {
                btVar.f33580c.setText(btVar.f33578a.c.e);
            } else {
                btVar.f33583f = btVar.m30776d(btVar.f33578a.c.d);
                btVar.f33579b.setNonUserInputSelection(btVar.f33583f);
                btVar.f33580c.setText(m30769a(btVar.f33578a.c.d, btVar.f33578a.c.e));
            }
        }
        if (TextUtils.isEmpty(btVar.f33580c.getText()) && ci.m30868a(activity, btVar.f33580c)) {
            String value = btVar.f33580c.getValue();
            if (!(!btVar.m30775c() || TextUtils.isEmpty(value) || value.charAt(0) == '+' || btVar.f33582e == -1 || !value.startsWith(btVar.f33579b.m30629a(btVar.f33582e)))) {
                btVar.f33580c.m30517b(String.format(Locale.US, "+%s", new Object[]{value}), false);
            }
        }
        FormSpinner formSpinner = btVar.f33579b;
        if (!btVar.m30770a()) {
            i2 = 8;
        }
        formSpinner.setVisibility(i2);
        btVar.setEnabled(true);
        return btVar;
    }

    private bt(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C6623g.layout_phone_form, this);
        this.f33579b = (FormSpinner) findViewById(C6622f.calling_code_spinner);
        this.f33580c = (FormEditText) findViewById(C6622f.phone_number_text);
        this.f33580c.setInputType(3);
        if (VERSION.SDK_INT >= 17) {
            this.f33580c.setTextDirection(3);
        }
        this.f33580c.setOnFocusChangeListener(this);
        this.f33580c.setBackground(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843602});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        ai.a(this, drawable);
    }

    public final k getPhoneForm() {
        return this.f33578a;
    }

    public final l getPhoneFormValue() {
        l lVar = new l();
        if (m30775c()) {
            String obj = this.f33580c.getText().toString();
            C6790k c6790k = (C6790k) this.f33579b.getItemAtPosition(this.f33583f);
            if (c6790k == null) {
                c6790k = (C6790k) this.f33579b.getItemAtPosition(this.f33582e);
            }
            lVar.d = c6790k.f33674a;
            lVar.e = m30772b(c6790k.f33677d, obj);
        } else {
            lVar.e = this.f33580c.getText().toString();
        }
        lVar.c = this.f33578a.a.c;
        lVar.a = this.f33578a.a.a;
        lVar.b = this.f33578a.a.b;
        return lVar;
    }

    public final FormEditText getPhoneNumberView() {
        return this.f33580c;
    }

    public final void setVisibilityMatchingView(View view) {
        this.f33585h = view;
    }

    protected final int[] onCreateDrawableState(int i) {
        if (this.f33580c == null || !this.f33580c.isFocused()) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int length = onCreateDrawableState.length;
        int i2 = 0;
        while (i2 < length && onCreateDrawableState[i2] != 16842908) {
            if (onCreateDrawableState[i2] == -16842908) {
                onCreateDrawableState[i2] = 16842908;
                return onCreateDrawableState;
            } else if (onCreateDrawableState[i2] == 0) {
                onCreateDrawableState[i2] = 16842908;
                return onCreateDrawableState;
            } else {
                i2++;
            }
        }
        return onCreateDrawableState;
    }

    public final void setEnabled(boolean z) {
        boolean z2 = this.f33578a != null ? z && !this.f33578a.g : z;
        super.setEnabled(z2);
        this.f33580c.setEnabled(z2);
        this.f33579b.setEnabled(z2);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f33585h != null) {
            this.f33585h.setVisibility(i);
        }
    }

    public final boolean cQ_() {
        return this.f33580c.cQ_();
    }

    public final boolean mo5581e() {
        return this.f33580c.mo5581e();
    }

    public final CharSequence getError() {
        return this.f33580c.getError();
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        this.f33580c.mo5578a(charSequence, z);
    }

    public final void cT_() {
        this.f33580c.cT_();
    }

    public final at getParentFormElement() {
        return this.f33581d;
    }

    public final void setParentFormElement(at atVar) {
        this.f33581d = atVar;
    }

    public final String mo5522a(String str) {
        return this.f33580c.mo5522a(str);
    }

    public final void onFocusChange(View view, boolean z) {
        String obj = this.f33580c.getText().toString();
        if (!(z || TextUtils.isEmpty(obj))) {
            if (m30775c() && m30773c(obj) == -1 && this.f33583f != this.f33582e) {
                this.f33583f = this.f33582e;
                this.f33579b.setNonUserInputSelection(this.f33583f);
            }
            String str = this.f33578a.f;
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().getCountry();
            }
            CharSequence a = ci.m30850a(obj, str);
            if (a != null) {
                this.f33580c.setText(a);
            }
        }
        if (m30770a()) {
            ci.m30862a(this.f33579b, true);
        } else {
            ci.m30877b(this.f33579b, false);
        }
        refreshDrawableState();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f33583f != i) {
            String obj = this.f33580c.getText().toString();
            int selectionStart = this.f33580c.getSelectionStart();
            int selectionEnd = this.f33580c.getSelectionEnd();
            String str = "";
            if (this.f33584g.length() > 0) {
                str = this.f33584g;
                this.f33584g = "";
            } else if (this.f33583f != -1) {
                str = ((C6790k) this.f33579b.getItemAtPosition(this.f33583f)).f33677d;
            }
            String b = m30772b(str, obj);
            int length = obj.length() - b.length();
            int max = Math.max(0, selectionStart - length);
            selectionStart = Math.max(0, selectionEnd - length);
            this.f33583f = i;
            CharSequence a = m30769a(((C6790k) this.f33579b.getItemAtPosition(this.f33583f)).f33674a, b);
            selectionEnd = a.length() - b.length();
            max += selectionEnd;
            selectionStart += selectionEnd;
            this.f33580c.setText(a);
            this.f33580c.setSelection(max, selectionStart);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        int c = m30773c(charSequence2);
        if (c == -1) {
            if (this.f33583f != -1 && this.f33584g.length() == 0) {
                this.f33584g = ((C6790k) this.f33579b.getItemAtPosition(this.f33583f)).f33677d;
            }
            this.f33584g = this.f33584g.substring(0, m30774c(this.f33584g, charSequence2));
            if (i3 == 0) {
                c = this.f33583f;
            } else {
                c = this.f33582e;
            }
        } else {
            this.f33584g = "";
        }
        if (c != this.f33583f) {
            this.f33583f = c;
            this.f33579b.setNonUserInputSelection(c);
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    private final boolean m30770a() {
        return m30775c() && (!TextUtils.isEmpty(this.f33580c.getText()) || this.f33580c.hasFocus());
    }

    private final boolean m30775c() {
        return this.f33578a != null && this.f33578a.d.length > 0 && this.f33578a.d.length == this.f33578a.e.length;
    }

    private static String m30769a(String str, String str2) {
        return String.format(Locale.US, "+%s %s", new Object[]{str, str2});
    }

    private final int m30771b(String str) {
        int count = this.f33579b.getCount();
        for (int i = 0; i < count; i++) {
            if (str.equals(((C6790k) this.f33579b.getItemAtPosition(i)).f33675b)) {
                return i;
            }
        }
        return -1;
    }

    private final int m30773c(String str) {
        int i = -1;
        int count = this.f33579b.getCount();
        int i2 = 0;
        int i3 = -1;
        while (i2 < count) {
            int i4;
            String str2 = ((C6790k) this.f33579b.getItemAtPosition(i2)).f33677d;
            if (i >= str2.length() || !str.startsWith(str2)) {
                i4 = i;
                i = i3;
            } else {
                i4 = str2.length();
                i = i2;
            }
            i2++;
            i3 = i;
            i = i4;
        }
        return i3;
    }

    private final int m30776d(String str) {
        int count = this.f33579b.getCount();
        for (int i = 0; i < count; i++) {
            if (str.equals(this.f33579b.m30629a(i))) {
                return i;
            }
        }
        return -1;
    }

    private static String m30772b(String str, String str2) {
        int c = m30774c(str, str2);
        int length = str2.length();
        while (c < length && Character.isWhitespace(str2.charAt(c))) {
            c++;
        }
        return str2.substring(c);
    }

    private static int m30774c(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }
}
