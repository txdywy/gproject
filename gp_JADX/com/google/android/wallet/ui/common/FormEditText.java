package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v7.widget.ab;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.a.a.a.a.b.a.b.a.aa;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.z;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.C6540d;
import com.google.android.wallet.clientlog.C6542f;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6513c;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.p383e.C6626j;
import com.google.android.wallet.ui.common.p402c.C6739a;
import com.google.android.wallet.ui.common.p402c.C6761y;
import com.google.android.wallet.ui.common.p402c.C6764e;
import com.google.android.wallet.ui.common.p402c.C6765b;
import com.google.android.wallet.ui.common.p402c.ac;
import com.google.android.wallet.ui.common.p404b.C6762a;
import com.google.android.wallet.ui.common.p404b.C6763b;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class FormEditText extends ab implements OnFocusChangeListener, OnItemClickListener, C6511g, C6508h, C6542f, C6668c, cq, C6735n {
    public static final InputFilter[] au = new InputFilter[0];
    public static final Pattern f33215u = Pattern.compile("\\d*");
    public final C6764e f33216A;
    public C6762a f33217B;
    public ar f33218C;
    public aa f33219D;
    public C6735n f33220E;
    public aa f33221F;
    public boolean f33222G;
    public boolean f33223H;
    public boolean f33224I;
    public boolean f33225J;
    public boolean f33226K;
    public String f33227L;
    public int f33228M;
    public int f33229N;
    public boolean f33230O;
    public boolean f33231P;
    public ac f33232Q;
    public CharSequence f33233R;
    public int f33234S;
    public as f33235T;
    public C6512i f33236U;
    public at f33237V;
    public C6755v f33238W;
    public boolean aA;
    public boolean aB;
    public int aC;
    public C6540d aD;
    public C6513c aE;
    public final TextWatcher aF;
    public final TextWatcher aG;
    public final TextWatcher aH;
    public final TextWatcher aI;
    public ba aa;
    public C6757s ab;
    public View ac;
    public String ad;
    public int ae;
    public String af;
    public boolean ag;
    public boolean ah;
    public int ai;
    public int aj;
    public aa ak;
    public bn al;
    public String am;
    public final ArrayList an;
    public boolean ao;
    public boolean ap;
    public C6761y aq;
    public String ar;
    public String as;
    public CharSequence at;
    public boolean av;
    public long aw;
    public String ax;
    public LogContext ay;
    public TimedEvent az;
    public TextWatcher f33239v;
    public LinkedList f33240w;
    public LinkedList f33241x;
    public LinkedList f33242y;
    public final C6764e f33243z;

    public FormEditText(Context context) {
        super(context);
        this.f33239v = null;
        this.f33240w = new LinkedList();
        this.f33222G = true;
        this.f33223H = true;
        this.f33224I = true;
        this.f33225J = true;
        this.f33226K = false;
        this.f33227L = null;
        this.f33228M = -1;
        this.f33229N = -1;
        this.ad = "";
        this.ae = 1;
        this.af = "";
        this.ag = false;
        this.ah = false;
        this.ai = -1;
        this.aj = 0;
        this.an = new ArrayList();
        this.ax = "";
        this.aB = true;
        this.aD = new C6540d(this, 1);
        this.aF = new al(this);
        this.aG = new am(this);
        this.aH = new an(this);
        this.aI = new ao(this);
        this.f33243z = new C6765b(new C6739a[0]);
        this.f33216A = new C6765b(new C6739a[0]);
        this.f33219D = this;
        m30491a(context, null);
    }

    public FormEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33239v = null;
        this.f33240w = new LinkedList();
        this.f33222G = true;
        this.f33223H = true;
        this.f33224I = true;
        this.f33225J = true;
        this.f33226K = false;
        this.f33227L = null;
        this.f33228M = -1;
        this.f33229N = -1;
        this.ad = "";
        this.ae = 1;
        this.af = "";
        this.ag = false;
        this.ah = false;
        this.ai = -1;
        this.aj = 0;
        this.an = new ArrayList();
        this.ax = "";
        this.aB = true;
        this.aD = new C6540d(this, 1);
        this.aF = new al(this);
        this.aG = new am(this);
        this.aH = new an(this);
        this.aI = new ao(this);
        this.f33243z = new C6765b(new C6739a[0]);
        this.f33216A = new C6765b(new C6739a[0]);
        this.f33219D = this;
        m30491a(context, attributeSet);
    }

    public FormEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33239v = null;
        this.f33240w = new LinkedList();
        this.f33222G = true;
        this.f33223H = true;
        this.f33224I = true;
        this.f33225J = true;
        this.f33226K = false;
        this.f33227L = null;
        this.f33228M = -1;
        this.f33229N = -1;
        this.ad = "";
        this.ae = 1;
        this.af = "";
        this.ag = false;
        this.ah = false;
        this.ai = -1;
        this.aj = 0;
        this.an = new ArrayList();
        this.ax = "";
        this.aB = true;
        this.aD = new C6540d(this, 1);
        this.aF = new al(this);
        this.aG = new am(this);
        this.aH = new an(this);
        this.aI = new ao(this);
        this.f33243z = new C6765b(new C6739a[0]);
        this.f33216A = new C6765b(new C6739a[0]);
        this.f33219D = this;
        m30491a(context, attributeSet);
    }

    public void setUiReference(long j) {
        this.aw = j;
        this.aD.f32633c = j;
    }

    public void setName(String str) {
        this.ax = str;
        this.aD.f32635e = str;
    }

    public void setLogContext(LogContext logContext) {
        if (this.ay != null) {
            this.ay.m29672b(this);
        }
        this.ay = logContext;
        this.aD.f32632b = logContext;
        if (logContext != null && ai.a.t(this)) {
            logContext.m29668a((C6542f) this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.ay != null) {
            this.ay.m29668a((C6542f) this);
            if (this.aC != 0) {
                C6537a.m29692a(this.ay, this.ax, this.aw, this.aC, getValueLength());
                this.aC = 0;
            }
        }
        this.aD.m29713a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.ay != null) {
            this.ay.m29672b(this);
        }
    }

    public final void m30508a(C6735n c6735n, aa aaVar, boolean z) {
        if (this.f33217B == null || this.f33220E != c6735n || this.f33221F != aaVar) {
            this.f33217B = new C6762a(this, c6735n, aaVar);
            this.f33231P = z;
            this.f33220E = c6735n;
            this.f33221F = aaVar;
        }
    }

    private final void mo5627c() {
        this.f33217B = null;
        this.f33231P = false;
    }

    public final void mo5583a(bo boVar) {
        if (this.f33217B != null) {
            this.f33217B.m30735a(boVar, false);
        }
    }

    public final void mo5585b(bo boVar) {
        if (this.f33217B != null) {
            C6762a c6762a = this.f33217B;
            c6762a.f33543d.remove(boVar);
            if (c6762a.f33544e == boVar) {
                c6762a.f33544e = null;
            }
        }
    }

    public void setErrorHandler(C6755v c6755v) {
        this.f33238W = c6755v;
    }

    public void setHintHandler(ba baVar) {
        this.aa = baVar;
    }

    public void setDescriptionHandler(C6757s c6757s) {
        this.ab = c6757s;
    }

    public void setVisibilityMatchingView(View view) {
        this.ac = view;
    }

    public void setFieldDescription(CharSequence charSequence) {
        if (this.ab != null) {
            this.ab.setDescription(charSequence);
        } else {
            this.at = charSequence;
        }
    }

    public CharSequence getFieldDescription() {
        return this.ab != null ? this.ab.getDescription() : this.at;
    }

    public int getMaxFieldLength() {
        return this.f33228M;
    }

    private final void m30491a(Context context, AttributeSet attributeSet) {
        C6739a c6739a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843104, C6617a.internalUicAllowFullScreenIme});
        this.f33228M = obtainStyledAttributes.getInt(0, -1);
        this.f33230O = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.internalUicValidateFieldsWhenNotVisible});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicFormEditText);
        this.f33223H = obtainStyledAttributes2.getBoolean(C6626j.WalletUicFormEditText_internalUicRequired, true);
        this.f33226K = obtainStyledAttributes2.getBoolean(C6626j.WalletUicFormEditText_internalUicValidateWhenNotVisible, z);
        CharSequence string = obtainStyledAttributes2.getString(C6626j.WalletUicFormEditText_internalUicValidatorErrorString);
        C6739a abVar;
        switch (obtainStyledAttributes2.getInt(C6626j.WalletUicFormEditText_internalUicValidatorType, 0)) {
            case 1:
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(C6625i.wallet_uic_error_only_numeric_digits_allowed);
                }
                abVar = new com.google.android.wallet.ui.common.p402c.ab(string, f33215u);
                setInputType(2);
                c6739a = abVar;
                break;
            case 2:
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(C6625i.wallet_uic_error_email_address_invalid);
                }
                abVar = new com.google.android.wallet.ui.common.p402c.ab(string, Patterns.EMAIL_ADDRESS);
                setInputType(33);
                c6739a = abVar;
                break;
            case 3:
                c6739a = new com.google.android.wallet.ui.common.p402c.ab(string, Pattern.compile(obtainStyledAttributes2.getString(C6626j.WalletUicFormEditText_internalUicValidatorRegexp)));
                break;
            default:
                c6739a = null;
                break;
        }
        if (this.f33223H) {
            this.f33227L = obtainStyledAttributes2.getString(C6626j.WalletUicFormEditText_internalUicRequiredErrorString);
            if (TextUtils.isEmpty(this.f33227L)) {
                this.f33227L = context.getString(C6625i.wallet_uic_error_field_must_not_be_empty);
            }
            m30492b(false);
        }
        if (c6739a != null) {
            mo5622a(c6739a);
        }
        obtainStyledAttributes2.recycle();
        if (this.f33230O) {
            setImeOptions(getImeOptions());
        } else {
            setImeOptions((getImeOptions() | 33554432) | 268435456);
        }
        super.addTextChangedListener(this.aI);
        m30503a(this.aH);
        super.setOnItemClickListener(this);
        setThreshold(Integer.MAX_VALUE);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            aa aaVar = (aa) ParcelableProto.m29887a(bundle, "templateSpec");
            if (aaVar != this.ak) {
                setTemplateFormattingScheme(aaVar);
            }
            TextWatcher textWatcher = this.f33239v;
            boolean z = this.f33222G;
            this.f33239v = null;
            this.f33222G = false;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            this.f33239v = textWatcher;
            this.f33222G = z;
            C6764e c6764e = this.f33243z;
            Bundle bundle2 = bundle.getBundle("validationState");
            if (bundle2 != null) {
                int length;
                int i;
                long[] longArray = bundle2.getLongArray("enabledValidatorReferences");
                if (longArray != null) {
                    length = longArray.length;
                } else {
                    length = 0;
                }
                for (i = 0; i < length; i++) {
                    c6764e.m30787a(longArray[i], true);
                }
                long[] longArray2 = bundle2.getLongArray("disabledValidatorReferences");
                if (longArray2 != null) {
                    length = longArray2.length;
                } else {
                    length = 0;
                }
                for (i = 0; i < length; i++) {
                    c6764e.m30787a(longArray2[i], false);
                }
            }
            this.aD.m29714a(bundle.getBundle("impressionLoggerState"));
            this.aC = 0;
            if (bundle.getStringArray("savedSuggestions") != null) {
                setSuggestions(Arrays.asList(bundle.getStringArray("savedSuggestions")));
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("templateSpec", ParcelableProto.m29885a(this.ak));
        bundle.putBundle("validationState", this.f33243z.m30789b());
        bundle.putBundle("impressionLoggerState", this.aD.m29715b());
        if (getAdapter() != null && (getAdapter() instanceof bf)) {
            bf bfVar = (bf) getAdapter();
            bundle.putStringArray("savedSuggestions", (String[]) bfVar.f33558a.toArray(new String[bfVar.f33558a.size()]));
        }
        return bundle;
    }

    public void setShouldValidateWhenNotVisible(boolean z) {
        this.f33226K = z;
    }

    public String getTemplate() {
        return this.am;
    }

    public void setTemplateFormattingScheme(aa aaVar) {
        mo5642a(aaVar, true);
    }

    public void mo5642a(aa aaVar, boolean z) {
        if (this.ak != aaVar) {
            if (this.al != null && aaVar != null) {
                throw new IllegalArgumentException("Cannot set schemes for both number formatting and template formatting.");
            } else if (this.f33228M >= 0) {
                throw new IllegalStateException("Max length cannot be set before a template.");
            } else {
                CharSequence value = getValue();
                int cursorPositionInValue = getCursorPositionInValue();
                if (this.ak == null && aaVar != null) {
                    this.f33239v = this.aF;
                } else if (this.ak != null && aaVar == null) {
                    this.f33239v = null;
                }
                this.ak = aaVar;
                mo5627c();
                this.an.clear();
                if (this.aq != null) {
                    mo5624c(this.aq);
                }
                this.ar = null;
                this.as = null;
                if (aaVar == null) {
                    this.am = null;
                    if (z) {
                        m30517b(value, false);
                        setSelection(cursorPositionInValue);
                        return;
                    }
                    return;
                }
                int i;
                this.ao = aaVar.c;
                int length = aaVar.a.length;
                char[] cArr = new char[length];
                char[] cArr2 = new char[length];
                for (i = 0; i < length; i++) {
                    cArr[i] = aaVar.a[i].b.charAt(0);
                    cArr2[i] = this.ao ? aaVar.a[i].c.charAt(0) : '~';
                }
                char[] toCharArray = aaVar.b.toCharArray();
                int length2 = toCharArray.length;
                for (i = 0; i < length2; i++) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (toCharArray[i] == cArr[i2]) {
                            toCharArray[i] = cArr2[i2];
                            this.an.add(Integer.valueOf(i));
                            break;
                        }
                    }
                }
                if (this.an.isEmpty()) {
                    throw new IllegalArgumentException("The template formatting scheme must contain at least one input character");
                }
                this.am = String.valueOf(toCharArray);
                if (z) {
                    m30517b(value, false);
                    if (hasFocus()) {
                        setCursorPositionInValue(cursorPositionInValue);
                    }
                }
                m30508a(this, this, false);
                this.aq = new aj(this, this.an.size());
                mo5622a(this.aq);
            }
        }
    }

    public void setNumberFormattingScheme(z zVar) {
        if (this.al != null && this.al.f33574b == zVar) {
            return;
        }
        if (zVar == null) {
            this.al = null;
            this.f33239v = null;
            setFilters(au);
        } else if (this.ak != null) {
            throw new IllegalArgumentException("Cannot set schemes for both number formatting and template formatting.");
        } else if (this.f33228M > 0 || this.aq != null) {
            throw new IllegalArgumentException("Min/max length shouldn't be used with a number formatting scheme since we are using formatted numeric values.");
        } else {
            this.al = new bn(zVar);
            setFilters(new InputFilter[]{this.al});
            this.f33239v = this.aG;
        }
    }

    public void mo5641a(int i, int i2) {
        if (this.al == null) {
            if (this.am != null) {
                if (i2 != this.an.size()) {
                    throw new IllegalArgumentException("maxLength (" + i2 + ") must be equal to the number of input placeholder characters in the template (" + this.an.size() + ")");
                }
            } else if (i2 > 0) {
                setFilters(new InputFilter[]{new LengthFilter(i2)});
                m30508a(this, this, false);
                this.f33229N = i;
                this.f33228M = i2;
            }
            if (this.aq != null) {
                mo5624c(this.aq);
            }
            if (i > 0) {
                this.aq = new ak(this, i);
                mo5622a(this.aq);
            }
        } else if (i > 0 || i2 > 0) {
            throw new IllegalArgumentException("Min/max length shouldn't be used with a number formatting scheme since we are using formatted numeric values.");
        }
    }

    public void setShowTemplateWhenEmptyAndFocused(boolean z) {
        this.ap = z;
    }

    public String getValue() {
        int i = 0;
        String obj = this.ag ? this.ad : getText().toString();
        StringBuilder stringBuilder;
        if (this.al != null) {
            bn bnVar = this.al;
            if (TextUtils.isEmpty(obj)) {
                return "";
            }
            stringBuilder = new StringBuilder();
            String[] c = bnVar.m30767c(obj);
            String b = bnVar.m30766b(c[0]);
            stringBuilder.append(b);
            if (!TextUtils.isEmpty(c[1])) {
                if (b.length() == 0) {
                    stringBuilder.append('0');
                }
                stringBuilder.append('.');
                stringBuilder.append(c[1]);
            }
            return stringBuilder.toString();
        } else if (this.am == null) {
            return obj;
        } else {
            if (obj.equals(this.ar)) {
                return this.as;
            }
            if (this.ao && obj.isEmpty()) {
                obj = this.am;
            }
            this.ar = obj;
            int size = this.an.size();
            stringBuilder = new StringBuilder(size);
            int length = this.ar.length();
            while (i < size && ((Integer) this.an.get(i)).intValue() < length) {
                stringBuilder.append(this.ar.charAt(((Integer) this.an.get(i)).intValue()));
                i++;
            }
            this.as = stringBuilder.toString();
            return this.as;
        }
    }

    public void mo5626a(CharSequence charSequence, int i) {
        m30498p();
        m30517b(charSequence, m30493b(i));
        m30490a(i);
    }

    public final void m30517b(CharSequence charSequence, boolean z) {
        if (this.al != null) {
            charSequence = this.al.m30764a(charSequence);
        }
        Object obj = (this.ap && hasFocus()) ? 1 : null;
        if (this.am == null) {
            m30520c(charSequence, z);
        } else if (!TextUtils.isEmpty(charSequence) || obj != null) {
            char[] copyOf;
            CharSequence valueOf;
            char[] toCharArray = this.am.toCharArray();
            int size = this.an.size();
            int i = 0;
            Object obj2 = null;
            while (i < size) {
                if (i >= charSequence.length()) {
                    if (!this.ao) {
                        copyOf = Arrays.copyOf(toCharArray, ((Integer) this.an.get(i)).intValue());
                        if (obj == null || obj2 != null) {
                            valueOf = String.valueOf(copyOf);
                        } else {
                            valueOf = null;
                        }
                        m30520c(valueOf, z);
                    }
                    copyOf = toCharArray;
                    if (obj == null) {
                    }
                    valueOf = String.valueOf(copyOf);
                    m30520c(valueOf, z);
                } else {
                    Object obj3;
                    if (toCharArray[((Integer) this.an.get(i)).intValue()] != charSequence.charAt(i)) {
                        toCharArray[((Integer) this.an.get(i)).intValue()] = charSequence.charAt(i);
                        obj3 = 1;
                    } else {
                        obj3 = obj2;
                    }
                    i++;
                    obj2 = obj3;
                }
            }
            copyOf = toCharArray;
            if (obj == null) {
            }
            valueOf = String.valueOf(copyOf);
            m30520c(valueOf, z);
        } else if (!TextUtils.isEmpty(getText())) {
            m30520c(null, z);
        }
        if (!hasFocus() && this.ae != 1) {
            m30527k();
        }
    }

    public final void m30520c(CharSequence charSequence, boolean z) {
        TextWatcher textWatcher = this.f33239v;
        boolean z2 = this.f33222G;
        this.f33239v = null;
        if (!z) {
            this.f33222G = false;
        }
        this.aB = false;
        setText(charSequence);
        this.f33239v = textWatcher;
        this.f33222G = z2;
        this.aB = true;
    }

    public int getValueLength() {
        CharSequence text = getText();
        if (this.am == null) {
            return TextUtils.getTrimmedLength(text);
        }
        if (text.length() == 0) {
            return 0;
        }
        int size = this.an.size();
        int length = text.length();
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) this.an.get(i)).intValue();
            if (intValue >= length || text.charAt(intValue) == this.am.charAt(intValue)) {
                return i;
            }
        }
        return size;
    }

    public int getCursorPositionInValue() {
        int selectionStart = getSelectionStart();
        if (this.am == null) {
            return selectionStart;
        }
        selectionStart = Collections.binarySearch(this.an, Integer.valueOf(selectionStart));
        return selectionStart < 0 ? (-selectionStart) - 1 : selectionStart;
    }

    public void setCursorPositionInValue(int i) {
        if (this.am != null) {
            if (TextUtils.isEmpty(getText())) {
                i = 0;
            } else if (i < this.an.size()) {
                i = Math.min(((Integer) this.an.get(i)).intValue(), getText().length());
            } else {
                i = Math.min(((Integer) this.an.get(this.an.size() - 1)).intValue() + 1, getText().length());
            }
        }
        setSelection(i);
    }

    public final void m30516b(CharSequence charSequence, int i) {
        m30498p();
        this.av = true;
        if (isFocused()) {
            boolean b = m30493b(i);
            TextWatcher textWatcher = this.f33239v;
            boolean z = this.f33222G;
            this.f33239v = null;
            if (!b) {
                this.f33222G = false;
            }
            this.aB = false;
            replaceText(charSequence);
            this.f33239v = textWatcher;
            this.f33222G = z;
            this.aB = true;
        } else {
            m30520c(charSequence, m30493b(i));
        }
        this.av = false;
        m30490a(i);
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            m30528l();
        } else {
            m30527k();
        }
    }

    public String getRedactedValue() {
        return m30489a(false);
    }

    private final String m30489a(boolean z) {
        int i = 0;
        String value = getValue();
        if (this.ae == 1) {
            return value;
        }
        int i2;
        String stringBuilder;
        int ceil;
        if (this.ao) {
            int size = this.an.size();
            StringBuilder stringBuilder2 = new StringBuilder(size);
            for (i2 = 0; i2 < size; i2++) {
                if (this.am.charAt(((Integer) this.an.get(i2)).intValue()) != value.charAt(i2)) {
                    stringBuilder2.append(value.charAt(i2));
                }
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = value;
        }
        i2 = stringBuilder.length();
        if (this.ae == 2) {
            ceil = (int) Math.ceil(((double) i2) / 4.0d);
        } else {
            ceil = 0;
        }
        if (this.ae == 3 || r1 > 4) {
            ceil = Math.min(4, i2);
        }
        stringBuilder = stringBuilder.substring(i2 - ceil);
        if (z) {
            StringBuilder stringBuilder3 = new StringBuilder(i2);
            if (TextUtils.isEmpty(this.af)) {
                ceil = i2 - ceil;
                while (i < ceil) {
                    stringBuilder3.append('•');
                    i++;
                }
            } else if (i2 > 0) {
                stringBuilder3.append(this.af);
            }
            stringBuilder = stringBuilder3.append(stringBuilder).toString();
        }
        return stringBuilder;
    }

    public boolean enoughToFilter() {
        if (!this.av && getText().length() >= this.f33234S) {
            return true;
        }
        return false;
    }

    final LinkedList m30522f() {
        if (this.f33241x == null) {
            this.f33241x = new LinkedList();
        }
        return this.f33241x;
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        m30522f().addLast(textWatcher);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        m30522f().remove(textWatcher);
    }

    public final void m30503a(TextWatcher textWatcher) {
        m30522f().addFirst(textWatcher);
    }

    public final void m30513b(TextWatcher textWatcher) {
        this.f33240w.add(textWatcher);
    }

    public final void mo5622a(C6739a c6739a) {
        this.f33243z.m30788a(c6739a);
        if (c6739a.f33269j != 0) {
            long j = c6739a.f33269j;
            C6512i c6512i = this.aE;
            C6516f.m29562a(this, j, c6512i, c6512i);
        }
    }

    public final void m30515b(C6739a c6739a) {
        mo5622a(c6739a);
        this.f33216A.m30788a(c6739a);
    }

    public final void mo5624c(C6739a c6739a) {
        this.f33243z.m30790b(c6739a);
        this.f33216A.m30790b(c6739a);
        C6516f.m29561a((Object) this, c6739a.f33269j, this.aE);
    }

    public final boolean mo5581e() {
        return !(this.f33226K || getVisibility() == 0) || this.f33243z.m30546c(this);
    }

    public final boolean cQ_() {
        boolean e = mo5581e();
        CharSequence a = this.f33243z.mo5631a();
        if (e || a == null) {
            if (getError() != null) {
                setError(null);
            }
        } else if (!a.equals(getError())) {
            if (this.aj == 0) {
                m30526j();
            }
            setError(a);
        }
        return e;
    }

    private final String mo5663m() {
        CharSequence contentDescription = TextUtils.isEmpty(getHint()) ? getContentDescription() : getHint();
        return getResources().getString(C6625i.wallet_uic_accessibility_event_form_field_error, new Object[]{contentDescription, getError()});
    }

    @TargetApi(16)
    final void m30523g() {
        if (VERSION.SDK_INT >= 16 && C6589a.m29897a(getContext())) {
            announceForAccessibility(mo5663m());
        }
    }

    public final void cT_() {
        if (hasFocus()) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this, 1);
            }
        }
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
            m30523g();
        }
    }

    public void setRequired(boolean z) {
        this.f33223H = z;
        m30492b(false);
    }

    public void setFieldEnabled(boolean z) {
        if (this.f33224I != z) {
            this.f33224I = z;
            boolean z2 = this.f33225J && this.f33224I;
            super.setEnabled(z2);
        }
    }

    public void setEnabled(boolean z) {
        if (this.f33225J != z) {
            this.f33225J = z;
            boolean z2 = this.f33225J && this.f33224I;
            super.setEnabled(z2);
        }
    }

    public String getRequiredError() {
        return this.f33227L;
    }

    public void setRequiredError(String str) {
        this.f33227L = str;
        m30492b(true);
    }

    public void setOnOutOfFocusValidatable(aa aaVar) {
        this.f33219D = aaVar;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            m30524h().add(onFocusChangeListener);
        }
    }

    final LinkedList m30524h() {
        if (this.f33242y == null) {
            this.f33242y = new LinkedList();
        }
        return this.f33242y;
    }

    public final boolean m30525i() {
        if (!hasFocus() || !enoughToFilter() || getWindowVisibility() == 8 || getAdapter() == null) {
            return false;
        }
        performFiltering(getText(), 0);
        showDropDown();
        return true;
    }

    public final void mo5621a() {
        m30497o();
    }

    public final void cU_() {
        if (hasFocus()) {
            m30496n();
        }
    }

    @TargetApi(21)
    public void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        super.onFocusChanged(z, i, rect);
        if (this.ay != null) {
            if (z) {
                m30496n();
            } else {
                m30497o();
            }
        }
        m30525i();
        if (!(z || getError() != null || this.f33219D == null)) {
            this.f33219D.cQ_();
        }
        if (z && getError() != null) {
            m30523g();
        }
        if (this.f33242y != null) {
            Iterator it = this.f33242y.iterator();
            while (it.hasNext()) {
                ((OnFocusChangeListener) it.next()).onFocusChange(this, z);
            }
        }
        if (this.am != null && this.ap) {
            if (z && TextUtils.isEmpty(getText())) {
                m30517b((CharSequence) "", false);
                setSelection(((Integer) this.an.get(0)).intValue());
                if (VERSION.SDK_INT >= 16 && C6589a.m29897a(getContext())) {
                    announceForAccessibility(getHint());
                    z2 = true;
                    if (VERSION.SDK_INT >= 21 && hasFocus() && !isAccessibilityFocused() && !r0) {
                        sendAccessibilityEvent(32768);
                        return;
                    }
                    return;
                }
            } else if (!z && getValueLength() == 0) {
                m30517b((CharSequence) "", false);
            }
        }
        z2 = false;
        if (VERSION.SDK_INT >= 21) {
        }
    }

    private final void m30496n() {
        if (this.aw != 0) {
            this.az = C6537a.m29679a(this.ay, this.ax, this.aw);
            this.aA = false;
        }
    }

    private final void m30497o() {
        if (this.az != null) {
            m30498p();
            C6537a.m29688a(this.ay, this.az);
            this.az = null;
        }
    }

    private final void m30498p() {
        if (this.aA) {
            C6537a.m29692a(this.ay, this.ax, this.aw, 1, getValueLength());
            this.aA = false;
        }
    }

    private final void m30490a(int i) {
        if (i == 0) {
            return;
        }
        if (ai.a.t(this)) {
            C6537a.m29692a(this.ay, this.ax, this.aw, i, getValueLength());
            return;
        }
        this.aC = i;
    }

    final void m30526j() {
        m30498p();
        C6537a.m29699b(this.ay, 1, this.ax, this.aw);
    }

    private static boolean m30493b(int i) {
        return (i == 0 || i == 5) ? false : true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = (hasFocus() || !TextUtils.isEmpty(getText())) ? 0 : 1;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.am != null && this.ap && i != 0 && hasFocus()) {
            setSelection(((Integer) this.an.get(0)).intValue());
        }
        return onTouchEvent;
    }

    protected void onMeasure(int i, int i2) {
        Object obj = (!TextUtils.isEmpty(super.getHint()) || this.aa == null) ? null : 1;
        if (obj != null) {
            setHint(this.aa.m30736a());
        }
        super.onMeasure(i, i2);
        if (obj != null) {
            setHint(null);
        }
        setThreshold(this.f33234S);
    }

    public void setThreshold(int i) {
        Object obj = null;
        if (i < 0) {
            i = 0;
        }
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int i2 = (int) getResources().getDisplayMetrics().density;
        if (i2 != 0 && rect.height() / i2 > HprofParser.ROOT_REFERENCE_CLEANUP) {
            obj = 1;
        }
        if (obj != null) {
            this.f33234S = i;
            return;
        }
        this.f33234S = Integer.MAX_VALUE;
        dismissDropDown();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.ac != null) {
            this.ac.setVisibility(i);
        }
    }

    public void setOnErrorChangeListener(as asVar) {
        this.f33235T = asVar;
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        setError(charSequence);
        if (z) {
            C6537a.m29703c(this.ay, 1, this.ax, this.aw);
        }
    }

    public void setError(CharSequence charSequence, Drawable drawable) {
        if (this.f33238W != null) {
            this.f33238W.setError(charSequence);
        } else {
            super.setError(charSequence, drawable);
        }
        if (this.f33235T != null) {
            this.f33235T.m30732a();
        }
    }

    public CharSequence getError() {
        if (this.f33238W != null) {
            return this.f33238W.getError();
        }
        return super.getError();
    }

    public at getParentFormElement() {
        return this.f33237V;
    }

    public void setParentFormElement(at atVar) {
        this.f33237V = atVar;
    }

    public String mo5522a(String str) {
        Object obj = 1;
        if (mo5581e()) {
            int inputType = getInputType();
            if ((inputType & 1) == 1) {
                if ((inputType & 128) != 128) {
                    obj = null;
                }
            } else if ((inputType & 2) != 2) {
                obj = null;
            } else if ((inputType & 16) != 16) {
                obj = null;
            }
            if (obj == null) {
                return getText().toString();
            }
        }
        return "";
    }

    public CharSequence getHint() {
        CharSequence hint = super.getHint();
        return (!TextUtils.isEmpty(hint) || this.aa == null) ? hint : this.aa.m30736a();
    }

    public int getThreshold() {
        return this.f33234S;
    }

    private final void m30492b(boolean z) {
        if (z && this.f33232Q != null) {
            mo5624c(this.f33232Q);
            this.f33232Q = null;
        }
        if (this.f33223H && this.f33232Q == null) {
            this.f33232Q = new ac(this.f33227L);
            mo5622a(this.f33232Q);
        } else if (!this.f33223H && this.f33232Q != null) {
            mo5624c(this.f33232Q);
            this.f33232Q = null;
        }
    }

    final void m30527k() {
        if (!this.ag && this.ah) {
            this.ad = getText().toString();
            CharSequence a = m30489a(true);
            if (this.am == null && this.f33228M > 0) {
                this.ai = this.f33228M;
                mo5641a(this.f33229N, a.length());
            }
            m30520c(a, false);
            this.ag = true;
        }
    }

    final void m30528l() {
        if (this.ag) {
            if (this.am == null && this.f33228M > 0) {
                mo5641a(this.f33229N, this.ai);
            }
            mo5627c();
            m30520c(this.ad, false);
            m30508a(this, this, false);
            this.ag = false;
        }
    }

    public void beginBatchEdit() {
        if (getError() != null) {
            setError(getError());
        }
        super.beginBatchEdit();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new aq(this, onCreateInputConnection);
        }
        return null;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8 && getError() != null) {
            accessibilityEvent.setContentDescription(mo5663m());
        }
        return true;
    }

    public boolean mo5623b() {
        if (this.am != null) {
            if (getValueLength() >= this.an.size()) {
                return true;
            }
            return false;
        } else if (this.f33228M < 0 || getValueLength() < this.f33228M) {
            return false;
        } else {
            return true;
        }
    }

    public String getIncompleteErrorMessage() {
        return getContext().getString(C6625i.wallet_uic_error_field_must_be_complete);
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        boolean z = true;
        switch (lVar.c) {
            case 1:
                throw new IllegalArgumentException("FormEditText doesn't support ResultingActionReference action type SHOW_COMPONENT");
            case 2:
                if (getValueLength() > 0) {
                    mo5626a(null, 6);
                    return;
                }
                return;
            case 14:
                if (lVar.d() == null) {
                    throw new IllegalArgumentException("No updateFlagAction provided.");
                }
                long j = lVar.d;
                if (lVar.d().a.f35018a) {
                    boolean e = mo5581e();
                    this.f33243z.m30787a(j, true);
                    if (e && !mo5581e()) {
                        cQ_();
                        return;
                    }
                    return;
                }
                if (mo5581e() || TextUtils.isEmpty(getError())) {
                    z = false;
                }
                this.f33243z.m30787a(j, false);
                if (z) {
                    cQ_();
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown ResultingActionReference action type " + lVar.c);
        }
    }

    public void setTriggerListener(C6512i c6512i) {
        this.f33236U = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            if (c6515e.f32578a.d == 1) {
                this.f33240w.add(new C6763b(this, c6515e, this.f33236U));
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported trigger type: " + c6515e.f32578a.d);
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        if (tVar.d == 1) {
            return false;
        }
        throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
    }

    public ar getOnAutocompleteItemSelectedListener() {
        return this.f33218C;
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(m30499q());
        if (VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.setError(null);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if ((VERSION.SDK_INT >= 16 && accessibilityEvent.getEventType() == 32768) || (VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8)) {
            List text = accessibilityEvent.getText();
            if (!text.isEmpty()) {
                text.remove(0);
            }
            text.add(0, m30499q());
        }
    }

    private final String m30499q() {
        CharSequence a = ci.m30848a(!TextUtils.isEmpty(getHint()) ? getHint() : getContentDescription());
        CharSequence a2 = ci.m30848a(getText());
        CharSequence a3 = ci.m30848a(getFieldDescription());
        CharSequence a4 = ci.m30848a(getError());
        return getResources().getString(C6625i.wallet_uic_accessibility_event_form_field_description, new Object[]{a, a2, a3, a4}).trim();
    }

    public void setOnAutocompleteItemSelectedListener(ar arVar) {
        this.f33218C = arVar;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (this.f33218C != null && itemAtPosition != null) {
            this.f33218C.mo5617a(itemAtPosition);
        }
    }

    public void setSuggestions(List list) {
        if (list != null) {
            setThreshold(0);
            post(new ap(this, list));
        }
    }
}
