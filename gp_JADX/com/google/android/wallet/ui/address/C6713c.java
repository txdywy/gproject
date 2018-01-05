package com.google.android.wallet.ui.address;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.volley.r;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.a.f.b;
import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.u;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.C6547k;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p367c.C6573a;
import com.google.android.wallet.common.p376a.C6549b;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6555h;
import com.google.android.wallet.common.p376a.C6556i;
import com.google.android.wallet.common.p376a.C6559k;
import com.google.android.wallet.common.p376a.C6560l;
import com.google.android.wallet.common.p376a.C6561n;
import com.google.android.wallet.common.p376a.C6562o;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.C6598j;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6528w;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.CheckboxView;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormSpinner;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.aa;
import com.google.android.wallet.ui.common.av;
import com.google.android.wallet.ui.common.ax;
import com.google.android.wallet.ui.common.bp;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.bv;
import com.google.android.wallet.ui.common.bx;
import com.google.android.wallet.ui.common.bz;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cq;
import com.google.android.wallet.ui.common.cr;
import com.google.android.wallet.ui.common.p402c.C6739a;
import com.google.android.wallet.ui.common.p402c.C6764e;
import com.google.android.wallet.ui.common.p402c.C6765b;
import com.google.android.wallet.ui.common.p402c.ab;
import com.google.p440g.p441a.p442a.C7147b;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class C6713c extends av implements OnClickListener, OnFocusChangeListener, OnItemSelectedListener, OnCheckedChangeListener, C6508h, C6655w {
    public static final SparseBooleanArray f33105a;
    public static final SparseBooleanArray f33106b;
    public static final Comparator f33107c = new C6714d();
    public boolean f33108A;
    public LogContext f33109B;
    public C6651s f33110C;
    public bv f33111D;
    public C6654r f33112E;
    public C6655w f33113F;
    public bp f33114G;
    public C6528w f33115H;
    public OnCheckedChangeListener f33116I;
    public bq f33117J;
    public int f33118K;
    public boolean f33119L;
    public c f33120M;
    public int[] f33121N;
    public JSONObject f33122O;
    public C6764e f33123P;
    public ArrayList f33124Q;
    public ArrayList f33125R;
    public C7147b f33126S;
    public int f33127T;
    public a f33128U;
    public C6512i f33129V;
    public final TextWatcher f33130W = new C6718h(this);
    public final TextWatcher f33131X = new C6719i(this);
    public final OnItemSelectedListener f33132Y = new C6720j(this);
    public C6556i f33133Z;
    public Account aa;
    public C7178b ab;
    public final C6506n f33134d = new C6506n(1667);
    public LayoutInflater f33135e;
    public ContextThemeWrapper f33136f;
    public boolean f33137g;
    public boolean f33138h;
    public int f33139i;
    public ax f33140j;
    public final ArrayList f33141k = new ArrayList();
    public final ArrayList f33142l = new ArrayList();
    public LinearLayout f33143m;
    public TextView f33144n;
    public DynamicAddressFieldsLayout f33145o;
    public CheckboxView f33146p;
    public RegionCodeView f33147q;
    public TextView f33148r;
    public View f33149s;
    public TextView f33150t;
    public ImageButton f33151u;
    public ArrayList f33152v = new ArrayList();
    public int f33153w;
    public JSONObject f33154x;
    public String f33155y = Locale.getDefault().toString();
    public boolean f33156z;

    protected final String m30426a(c cVar) {
        List arrayList = new ArrayList();
        for (int indexOfValue : this.f33128U.w) {
            int indexOfValue2 = C6553f.f32655d.indexOfValue(indexOfValue2);
            if (indexOfValue2 >= 0) {
                arrayList.add(Character.valueOf((char) C6553f.f32655d.keyAt(indexOfValue2)));
            }
        }
        String a = C6549b.m29724a(cVar.d, "\n", null, C6591c.m29908a(arrayList));
        if (!this.f33128U.t || C6591c.m29906a(this.f33128U.w, 8)) {
            return a;
        }
        String valueOf = String.valueOf(a);
        a = String.valueOf("\n");
        valueOf = String.valueOf(a.length() != 0 ? valueOf.concat(a) : new String(valueOf));
        a = String.valueOf(cVar.e);
        return a.length() != 0 ? valueOf.concat(a) : new String(valueOf);
    }

    public final void m30433a(C7147b c7147b, int i) {
        boolean z = true;
        if (c7147b == null) {
            if (this.f33143m == null) {
                this.f33126S = null;
                this.f33127T = 0;
                this.f33153w = 0;
                this.f33155y = Locale.getDefault().toString();
                return;
            }
            c7147b = new C7147b();
        }
        int a = C6563p.m29792a(c7147b.f34899a);
        this.f33126S = c7147b;
        this.f33127T = i;
        if (!TextUtils.isEmpty(this.f33126S.f34902d)) {
            this.f33155y = this.f33126S.f34902d;
        }
        if (this.f33143m == null) {
            this.f33153w = a;
        } else if (a == this.f33153w) {
            if (!m30440b()) {
                if (this.f33154x != null) {
                    String e = C6553f.m29751e(this.f33154x, this.f33155y);
                    if (TextUtils.isEmpty(e)) {
                        Object a2 = C6553f.m29732a(this.f33154x, "id");
                        if (!(TextUtils.isEmpty(a2) || !a2.contains("--") || C6553f.m29737a(C6553f.m29732a(this.f33154x, "lang"), this.f33155y))) {
                            m30429a(this.f33153w, this.f33155y, null, m30452n());
                        }
                    } else {
                        m30429a(this.f33153w, this.f33155y, e, m30452n());
                    }
                    if (!z) {
                        m30413b(this.f33126S, this.f33127T);
                        this.f33126S = null;
                        this.f33127T = 0;
                    }
                }
                z = false;
                if (!z) {
                    m30413b(this.f33126S, this.f33127T);
                    this.f33126S = null;
                    this.f33127T = 0;
                }
            }
        } else if (this.f33153w == 0) {
            this.f33153w = a;
        } else {
            m30430a(a, false);
        }
    }

    public final void m30430a(int i, boolean z) {
        if (i != this.f33153w) {
            this.f33153w = i;
            m30427a();
            if (i != 0) {
                if (z && this.f33129V != null) {
                    C6516f.m29560a(this.f33129V, this.f33142l, null);
                }
                if (this.f33111D != null) {
                    this.f33111D.mo5568a(i, this.f33139i, z);
                }
            }
        }
    }

    final void m30427a() {
        if (!C6598j.m29927a(C6563p.m29793a(this.f33153w), this.f33120M.d.f34899a)) {
            String str;
            Bundle bundle = new Bundle();
            String str2 = "EventListener.EXTRA_FORM_ID";
            if (this.f33128U.a != null) {
                str = this.f33128U.a.a;
            } else {
                str = this.f33128U.b;
            }
            bundle.putString(str2, str);
            bundle.putInt("EventListener.EXTRA_FIELD_ID", 1);
            if (this.f33115H != null) {
                this.f33115H.mo5469a(3, bundle);
            }
        }
        if (this.f33129V != null) {
            C6516f.m29560a(this.f33129V, this.f33141k, C6563p.m29793a(this.f33153w));
        }
        this.f33147q.m30671a(this.f33153w);
        if (C6553f.m29730a(this.f33154x) == this.f33153w) {
            m30436a(this.f33154x);
        } else {
            m30429a(this.f33153w, this.f33155y, null, m30452n());
        }
    }

    public final boolean m30440b() {
        return this.f33118K > 0;
    }

    final void m30436a(JSONObject jSONObject) {
        int a = C6553f.m29730a(jSONObject);
        if (a == this.f33153w) {
            SparseArray c;
            if (this.f33126S == null) {
                c = m30441c();
            } else {
                c = null;
            }
            this.f33154x = jSONObject;
            this.f33124Q = new ArrayList();
            if (!(!C6591c.m29906a(this.f33128U.B, 2) || this.f33125R == null || this.f33125R.isEmpty())) {
                this.f33124Q.add(new C6561n(this.ac, this.f33125R));
            }
            if (C6591c.m29906a(this.f33128U.B, 1)) {
                this.f33124Q.add(new C6559k(this.ac));
            }
            if (C6591c.m29906a(this.f33128U.B, 3) && C6560l.m29777a(this.f33153w)) {
                this.f33124Q.add(new C6560l(this.ac, m30443e()));
            }
            if (C6591c.m29906a(this.f33128U.B, 5)) {
                this.f33124Q.add(new C6562o(this.ac, this.ab, this.aa, m30443e()));
            }
            m30416q();
            m30412b(c);
            if (this.f33126S != null && C6563p.m29794b(this.f33126S.f34899a) == a) {
                m30413b(this.f33126S, this.f33127T);
                this.f33126S = null;
                this.f33127T = 0;
            }
            View b = m30411b('S');
            if (b instanceof Spinner) {
                Spinner spinner = (Spinner) b;
                if (spinner.getSelectedItemPosition() == 0 && ((C6726p) spinner.getItemAtPosition(1)).f33171b) {
                    if (spinner instanceof FormSpinner) {
                        ((FormSpinner) spinner).setNonUserInputSelection(1);
                    } else {
                        spinner.setSelection(1);
                    }
                }
            }
            this.f33145o.m30371a();
            m30421v();
        }
    }

    final SparseArray m30441c() {
        SparseArray d = m30442d();
        for (int size = d.size() - 1; size >= 0; size--) {
            char keyAt = (char) d.keyAt(size);
            if (m30411b(keyAt) instanceof Spinner) {
                d.remove(keyAt);
            }
        }
        return d;
    }

    final SparseArray m30442d() {
        if (this.f33143m == null) {
            return null;
        }
        int size = this.f33152v.size();
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            View view = (View) this.f33152v.get(i);
            Character ch = (Character) view.getTag();
            sparseArray.put(ch.charValue(), C6713c.m30409a(view));
        }
        if (this.f33153w != 0) {
            sparseArray.put(82, C6563p.m29793a(this.f33153w));
        }
        return sparseArray;
    }

    static String m30409a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("Input must not be null");
        } else if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        } else {
            if (view instanceof Spinner) {
                Object selectedItem = ((Spinner) view).getSelectedItem();
                if (selectedItem instanceof bx) {
                    return ((bx) selectedItem).mo5618a();
                }
                if (selectedItem != null) {
                    return String.valueOf(selectedItem);
                }
                return null;
            }
            String valueOf = String.valueOf(view.getClass());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown input type: ").append(valueOf).toString());
        }
    }

    private final View m30411b(char c) {
        int c2 = m30414c(c);
        if (c2 >= 0) {
            return (View) this.f33152v.get(c2);
        }
        return null;
    }

    private final int m30414c(char c) {
        int size = this.f33152v.size();
        for (int i = 0; i < size; i++) {
            Character ch = (Character) ((View) this.f33152v.get(i)).getTag();
            if (ch != null && ch.charValue() == c) {
                return i;
            }
        }
        return -1;
    }

    public final r m30443e() {
        return C6573a.m29820a(this.ac.getApplicationContext());
    }

    private final void m30416q() {
        String r = m30417r();
        String a = C6553f.m29732a(this.f33154x, "require");
        ArrayList arrayList = new ArrayList(r.length());
        this.f33152v = new ArrayList(r.length());
        int length = r.length();
        for (int i = 0; i < length; i++) {
            char charAt = r.charAt(i);
            char[] toCharArray = r.substring(i).toCharArray();
            if (charAt == 'N') {
                if (this.f33144n instanceof FormEditText) {
                    m30410a('N', toCharArray, a, (FormEditText) this.f33144n);
                    this.f33144n.setEnabled(this.f33137g);
                }
                this.f33152v.add(this.f33144n);
            } else {
                View a2 = m30407a(charAt, toCharArray, a, null);
                arrayList.add(a2);
                this.f33152v.add(a2);
            }
        }
        m30418s();
        this.f33145o.setFields(arrayList);
        if (this.f33114G != null) {
            this.f33114G.an();
        }
        if (this.f33115H != null) {
            this.f33115H.mo5469a(12, Bundle.EMPTY);
        }
        m30421v();
        m30423x();
    }

    private final String m30417r() {
        int i = 0;
        String str = null;
        if (C6553f.m29750d(this.f33154x, this.f33155y)) {
            str = C6553f.m29732a(this.f33154x, "lfmt");
        }
        if (TextUtils.isEmpty(str)) {
            str = C6553f.m29732a(this.f33154x, "fmt");
        }
        char[] a = C6553f.m29738a(str);
        String[] strArr = this.f33128U.s;
        String a2 = C6563p.m29793a(this.f33153w);
        int length = strArr != null ? strArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (C6598j.m29927a(strArr[i2], a2)) {
                length = i2;
                break;
            }
        }
        length = -1;
        if (length >= 0) {
            length = 1;
        } else {
            length = 0;
        }
        StringBuilder stringBuilder = new StringBuilder(a.length);
        stringBuilder.append('N');
        int length2 = a.length;
        while (i < length2) {
            char c = a[i];
            if (f33105a.get(c) && (r0 == 0 || f33106b.get(c))) {
                stringBuilder.append(c);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private final void m30410a(char c, char[] cArr, String str, FormEditText formEditText) {
        int i;
        if (this.f33124Q != null && !this.f33124Q.isEmpty()) {
            switch (c) {
                case '2':
                case '3':
                case 'X':
                    i = 0;
                    break;
                default:
                    i = 1;
                    break;
            }
        }
        i = 0;
        if (i != 0) {
            formEditText.setAdapter(new C6728u(this.f33136f, C6623g.view_row_address_hint_spinner, this.f33153w, m30447i(), c, cArr, str, this.f33124Q));
            formEditText.setThreshold(0);
            formEditText.setOnAutocompleteItemSelectedListener(new C6722l(this, formEditText));
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            view.post(new C6723m(this));
        }
    }

    public final void onClick(View view) {
        if (view == this.f33151u) {
            if (this.f33128U.y == 4) {
                m30444f();
            } else {
                m30445g();
            }
        } else if (view == this.f33150t) {
            m30445g();
        }
    }

    public final void m30444f() {
        if (!this.f33156z || this.f33119L) {
            C7147b c7147b = new C7147b();
            c7147b.f34899a = C6563p.m29793a(this.f33153w);
            c7147b.f34902d = this.f33155y;
            m30433a(c7147b, 8);
            if (this.f33128U.t) {
                m30434a("", 8);
            }
            m30445g();
        }
    }

    protected final boolean m30445g() {
        if (!this.f33156z || !this.f33119L) {
            return false;
        }
        this.f33156z = false;
        this.f33119L = false;
        m30451m();
        this.f33143m.requestFocus(130);
        return true;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m30451m();
        if (this.f33112E != null) {
            this.f33112E.mo5570a(!z);
        }
        m30418s();
        if (this.f33116I != null) {
            this.f33116I.onCheckedChanged(compoundButton, z);
        }
    }

    private final void m30418s() {
        ArrayList h = m30446h();
        int size = h.size();
        int i = 0;
        while (i < size) {
            Object obj = h.get(i);
            i++;
            C6749z c6749z = (C6749z) obj;
            if (c6749z.f33285e instanceof aa) {
                ((aa) c6749z.f33285e).mo5578a(null, false);
            }
        }
    }

    public final ArrayList m30446h() {
        ArrayList arrayList = new ArrayList(this.f33152v.size());
        C7147b c7147b = this.f33120M.d;
        int size = this.f33152v.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f33152v.get(i);
            C6549b.m29722a(c7147b, ((Character) view.getTag()).charValue());
            arrayList.add(new C6749z(0, view));
        }
        if (this.f33148r != null) {
            arrayList.add(new C6749z(0, this.f33148r));
        }
        return arrayList;
    }

    public final void mo5567a(float f) {
        if (this.f33148r != null && this.f33148r.getVisibility() == 0) {
            this.f33148r.setTranslationY(f);
        }
        if (this.f33113F != null) {
            this.f33113F.mo5567a(f);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getTag() instanceof Character) {
            char charValue = ((Character) adapterView.getTag()).charValue();
            if (charValue == 'S') {
                if (this.f33114G != null) {
                    this.f33114G.am();
                }
                if (this.f33153w != 0) {
                    m30421v();
                    C6726p w = m30422w();
                    if (this.f33122O == null || !C6598j.m29927a(C6553f.m29732a(this.f33122O, "key"), w.f33170a)) {
                        this.f33122O = w.f33175f;
                        m30450l();
                        if (m30411b('C') != null) {
                            w = m30422w();
                            if (w.f33171b && w.f33175f == null) {
                                this.f33133Z = new C6556i(this.f33153w, w.f33170a, new C6725o(this, w), new C6715e(this));
                                m30443e().a(this.f33133Z);
                                return;
                            }
                            m30449k();
                            return;
                        }
                        return;
                    }
                    w.f33175f = this.f33122O;
                }
            } else if (charValue == 'C' && this.f33114G != null) {
                this.f33114G.am();
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final C6506n getUiElement() {
        return this.f33134d;
    }

    public final List getChildren() {
        return null;
    }

    final String m30447i() {
        if (C6553f.m29750d(this.f33154x, this.f33155y)) {
            return this.f33155y;
        }
        return C6553f.m29732a(this.f33154x, "lang");
    }

    final void m30431a(View view, String str, boolean z, int i) {
        if (view == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        if (view instanceof FormEditText) {
            FormEditText formEditText = (FormEditText) view;
            if (!(i == 5 && TextUtils.isEmpty(str))) {
                formEditText.m30516b((CharSequence) str, i);
            }
        } else if (view instanceof TextView) {
            ((TextView) view).setText(str);
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (str == null) {
                if (!(spinner instanceof FormSpinner) || z) {
                    spinner.setSelection(0);
                } else {
                    ((FormSpinner) spinner).setNonUserInputSelection(0);
                }
            } else if (spinner.getAdapter() instanceof ArrayAdapter) {
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                if (!arrayAdapter.isEmpty()) {
                    int i2;
                    int count = arrayAdapter.getCount();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < count) {
                        int i5;
                        Object item = arrayAdapter.getItem(i3);
                        if ((item instanceof bx) && str.equalsIgnoreCase(((bx) item).mo5618a())) {
                            i5 = 1;
                        } else if (item == null || !str.equalsIgnoreCase(item.toString())) {
                            i5 = i4;
                        } else {
                            i5 = 1;
                        }
                        if (i5 != 0) {
                            if (!(spinner instanceof FormSpinner) || z) {
                                spinner.setSelection(i3);
                                i2 = i5;
                            } else {
                                ((FormSpinner) spinner).setNonUserInputSelection(i3);
                                i2 = i5;
                            }
                            if (i2 == 0) {
                                if ((spinner instanceof FormSpinner) || z) {
                                    spinner.setSelection(0);
                                } else {
                                    ((FormSpinner) spinner).setNonUserInputSelection(0);
                                }
                            }
                        } else {
                            i3++;
                            i4 = i5;
                        }
                    }
                    i2 = i4;
                    if (i2 == 0) {
                        if (spinner instanceof FormSpinner) {
                        }
                        spinner.setSelection(0);
                    }
                }
            }
        } else {
            String valueOf = String.valueOf(view.getClass());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown input type: ").append(valueOf).toString());
        }
        if (this.f33114G != null) {
            this.f33114G.am();
        }
    }

    final boolean m30448j() {
        View findFocus = this.f33145o.findFocus();
        if (findFocus == null) {
            return false;
        }
        ci.m30879b(this.ac, findFocus);
        return true;
    }

    @TargetApi(17)
    private final View m30407a(char c, char[] cArr, String str, View view) {
        View view2;
        if (view == null || Character.valueOf(c).equals(view.getTag())) {
            view2 = view;
        } else {
            view2 = null;
        }
        if (c == 'N') {
            throw new IllegalArgumentException("Recipient name should not be created dynamically");
        }
        View inflate;
        boolean a = C6553f.m29734a(c, this.f33154x);
        Object a2 = m30425a(c);
        LayoutInflater layoutInflater = this.f33135e;
        View view3 = null;
        int i = C6553f.f32655d.get(c);
        if (C6591c.m29906a(this.f33128U.v, i)) {
            inflate = layoutInflater.inflate(C6623g.view_form_non_editable_text, null);
        } else if (c == 'S') {
            List t = m30419t();
            if (!(t == null || t.isEmpty())) {
                if (view2 instanceof FormSpinner) {
                    view3 = (FormSpinner) view2;
                } else {
                    view3 = this.f33140j.mo5662a(layoutInflater);
                }
                view3.setLogContext(this.f33109B);
                view3.setUiReference(m30424a(i));
                view3.setRequired(a);
                view3.setPrompt(a2);
                view3.setLabel(a2);
                SpinnerAdapter c6730x = new C6730x(this.f33136f, C6623g.view_row_spinner, C6622f.description, t, new C6726p(null, false, null, a2, null));
                c6730x.setDropDownViewResource(C6623g.view_spinner_dropdown);
                view3.setAdapter(c6730x);
                view3.setOnItemSelectedListener(this);
                view3.m30631a(this.f33132Y);
            }
            inflate = view3;
        } else {
            if (c == 'C') {
                List u = m30420u();
                if (!(u == null || u.isEmpty())) {
                    View view4;
                    SpinnerAdapter crVar = new cr(this.f33136f, C6623g.view_row_spinner, C6622f.description, u);
                    crVar.setDropDownViewResource(C6623g.view_spinner_dropdown);
                    if (view2 instanceof FormSpinner) {
                        view4 = (FormSpinner) view2;
                    } else {
                        view4 = this.f33140j.mo5662a(this.f33135e);
                    }
                    view4.setLogContext(this.f33109B);
                    view4.setUiReference(m30424a(i));
                    view4.setRequired(a);
                    view4.setPrompt(a2);
                    view4.setLabel(a2);
                    view4.setAdapter(crVar);
                    view4.setOnItemSelectedListener(this);
                    view4.m30631a(this.f33132Y);
                    inflate = view4;
                }
            }
            inflate = null;
        }
        if (inflate == null) {
            if (view2 instanceof FormEditText) {
                view2 = (FormEditText) view2;
            } else {
                view2 = (FormEditText) layoutInflater.inflate(C6623g.view_form_edit_text, null);
            }
            view2.setLogContext(this.f33109B);
            view2.setUiReference(m30424a(i));
            m30410a(c, cArr, str, (FormEditText) view2);
            view2.setRequired(a);
            view2.setHint(a2);
            m30432a((FormEditText) view2, i);
            int i2 = 1;
            switch (c) {
                case '1':
                case '2':
                case '3':
                case 'A':
                    i2 = 8305;
                    break;
                case 'C':
                    i2 = 8193;
                    break;
                case 'S':
                    i2 = 8193;
                    break;
                case 'Z':
                    if (!C6553f.m29747c(this.f33154x)) {
                        i2 = 528385;
                        break;
                    }
                    i2 = 3;
                    if (VERSION.SDK_INT >= 17) {
                        view2.setTextDirection(3);
                        break;
                    }
                    break;
            }
            view2.setInputType(i2);
            if (this.f33128U.z) {
                view2.setOnFocusChangeListener(this);
            }
            view2.m30513b(this.f33131X);
            inflate = view2;
        }
        boolean a3 = C6591c.m29906a(this.f33128U.w, i);
        if (a3) {
            inflate.setVisibility(8);
        }
        if (inflate instanceof FormEditText) {
            ((FormEditText) inflate).setShouldValidateWhenNotVisible(!a3);
        } else if (inflate instanceof FormSpinner) {
            ((FormSpinner) inflate).setShouldValidateWhenNotVisible(!a3);
        }
        inflate.setId(C6553f.m29728a(c));
        inflate.setTag(Character.valueOf(c));
        inflate.setEnabled(this.f33137g);
        return inflate;
    }

    public final long m30424a(int i) {
        if (i == 1 && this.f33128U.E != 0) {
            return this.f33128U.E;
        }
        if (i == 2 && this.f33128U.D != 0) {
            return this.f33128U.D;
        }
        if (i == 11 && this.f33128U.C != 0) {
            return this.f33128U.C;
        }
        return C6547k.m29719a(this.f33128U.a != null ? this.f33128U.a.b : this.f33128U.c, i);
    }

    final String m30425a(char c) {
        switch (c) {
            case 'N':
                return this.f33128U.u;
            default:
                return C6553f.m29731a(this.ac, c, this.f33154x);
        }
    }

    final void m30432a(FormEditText formEditText, int i) {
        for (b bVar : this.f33128U.x) {
            if (bVar.b == i && !TextUtils.isEmpty(bVar.c)) {
                formEditText.setFieldDescription(bVar.c);
            }
        }
    }

    private final ArrayList m30419t() {
        boolean d = C6553f.m29750d(this.f33154x, this.f33155y);
        String[] b = C6553f.m29744b(this.f33154x, "sub_keys");
        String[] b2 = C6553f.m29744b(this.f33154x, "sub_mores");
        String[] strArr = null;
        if (d) {
            strArr = C6553f.m29744b(this.f33154x, "sub_lnames");
        }
        if (strArr == null) {
            strArr = b;
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (d) {
            strArr2 = strArr;
        } else {
            strArr2 = C6553f.m29744b(this.f33154x, "sub_names");
        }
        if (strArr2 == null || strArr2.length != strArr.length) {
            strArr3 = strArr;
        } else {
            strArr3 = strArr2;
        }
        strArr2 = C6553f.m29744b(this.f33154x, "sub_zips");
        if (strArr2 == null || strArr2.length == strArr.length) {
            strArr4 = strArr2;
        } else {
            strArr4 = null;
        }
        if (b == null || b.length == strArr.length) {
            strArr2 = b2;
            strArr5 = b;
        } else {
            strArr2 = null;
            strArr5 = null;
        }
        if (strArr2 == null || strArr2.length == strArr.length) {
            strArr6 = strArr2;
        } else {
            strArr6 = null;
        }
        List arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            boolean z = strArr6 != null && Boolean.parseBoolean(strArr6[i]);
            arrayList.add(new C6726p(strArr5 != null ? strArr5[i] : null, z, strArr[i], strArr3[i], strArr4 != null ? strArr4[i] : null));
            i++;
        }
        if (d) {
            Collections.sort(arrayList, f33107c);
        }
        return arrayList;
    }

    private final ArrayList m30420u() {
        String[] b;
        boolean d = C6553f.m29750d(this.f33154x, this.f33155y);
        if (d) {
            b = C6553f.m29744b(this.f33122O, "sub_lnames");
        } else {
            b = null;
        }
        if (b == null) {
            b = C6553f.m29744b(this.f33122O, "sub_keys");
        }
        if (b == null || b.length == 0) {
            return null;
        }
        String[] strArr;
        if (d) {
            strArr = b;
        } else {
            strArr = C6553f.m29744b(this.f33122O, "sub_names");
        }
        if (strArr == null || strArr.length != b.length) {
            strArr = b;
        }
        List arrayList = new ArrayList(b.length);
        for (int i = 0; i < b.length; i++) {
            arrayList.add(new bz(b[i], strArr[i]));
        }
        if (d) {
            Collections.sort(arrayList, f33107c);
        }
        return arrayList;
    }

    private final void m30421v() {
        View b = m30411b('Z');
        if (b instanceof aa) {
            cq cqVar = (cq) b;
            if (this.f33123P != null) {
                cqVar.mo5624c(this.f33123P);
                this.f33123P = null;
            }
            this.f33123P = new C6765b(new C6739a[0]);
            CharSequence string = this.f33136f.getString(C6625i.wallet_uic_error_address_field_invalid, new Object[]{m30425a('Z')});
            Pattern b2 = C6553f.m29743b(this.f33154x);
            if (b2 != null) {
                this.f33123P.m30788a(new ab(string, b2));
            }
            C6726p w = m30422w();
            if (w != null) {
                b2 = C6553f.m29742b(w.f33174e);
                if (b2 != null) {
                    this.f33123P.m30788a(new ab(string, b2));
                }
            }
            if (this.f33123P.f33600a.isEmpty()) {
                this.f33123P = null;
                return;
            }
            cqVar.mo5622a(this.f33123P);
            if (cqVar instanceof TextView) {
                TextView textView = (TextView) cqVar;
                if (!TextUtils.isEmpty(textView.getText()) || !TextUtils.isEmpty(textView.getError())) {
                    cqVar.cQ_();
                    return;
                }
                return;
            }
            cqVar.cQ_();
            return;
        }
        this.f33123P = null;
    }

    private final C6726p m30422w() {
        View b = m30411b('S');
        if (b == null) {
            return null;
        }
        return b instanceof Spinner ? (C6726p) ((Spinner) b).getSelectedItem() : null;
    }

    final void m30449k() {
        int c = m30414c('C');
        View view = (View) this.f33152v.get(c);
        String a = C6713c.m30409a(view);
        View a2 = m30407a('C', m30417r().substring(c).toCharArray(), C6553f.m29732a(this.f33154x, "require"), view);
        if (a2 != view) {
            this.f33145o.m30372a(view, a2);
            this.f33152v.set(c, a2);
            m30423x();
        }
        m30431a(a2, a, false, 0);
    }

    private final void m30423x() {
        View view = null;
        int size = this.f33152v.size();
        int i = 0;
        while (i < size) {
            View view2 = (View) this.f33152v.get(i);
            if (!view2.isFocusableInTouchMode()) {
                view2 = view;
            } else if (view != null) {
                view.setNextFocusForwardId(view2.getId());
                view2.setNextFocusForwardId(-1);
            }
            i++;
            view = view2;
        }
        if (view != null && this.f33148r != null && this.f33148r.isFocusableInTouchMode()) {
            view.setNextFocusForwardId(this.f33148r.getId());
            this.f33148r.setNextFocusForwardId(-1);
        }
    }

    public final void m30450l() {
        if (this.f33133Z != null) {
            this.f33133Z.f();
            this.f33133Z = null;
        }
    }

    private final void m30412b(SparseArray sparseArray) {
        if (this.f33143m != null && sparseArray != null) {
            int size = this.f33152v.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f33152v.get(i);
                String str = (String) sparseArray.get(((Character) view.getTag()).charValue());
                if (str != null) {
                    m30431a(view, str, false, 0);
                }
            }
        }
    }

    private final void m30413b(C7147b c7147b, int i) {
        if (this.f33143m != null) {
            int size = this.f33152v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f33152v.get(i2);
                m30431a(view, C6549b.m29722a(c7147b, ((Character) view.getTag()).charValue()), false, i);
            }
        }
    }

    public final void m30451m() {
        int i = (this.f33146p.getVisibility() == 0 && this.f33146p.isChecked()) ? 1 : 0;
        if (i != 0 || this.f33156z || C6591c.m29906a(this.f33128U.w, 2)) {
            this.f33144n.setVisibility(8);
        } else {
            this.f33144n.setVisibility(0);
        }
        if (i != 0 || this.f33156z || C6591c.m29906a(this.f33128U.w, 1)) {
            this.f33147q.setVisibility(8);
        } else {
            this.f33147q.setVisibility(0);
        }
        if (i != 0 || this.f33156z) {
            this.f33145o.setVisibility(8);
        } else {
            this.f33145o.setVisibility(0);
        }
        if (this.f33128U.t) {
            if (i != 0 || this.f33156z || C6591c.m29906a(this.f33128U.w, 8)) {
                this.f33148r.setVisibility(8);
            } else {
                this.f33148r.setVisibility(0);
            }
        }
        if (i == 0 && this.f33156z) {
            this.f33149s.setVisibility(0);
        } else {
            this.f33149s.setVisibility(8);
        }
        if (this.f33114G != null) {
            this.f33114G.an();
        }
        if (this.f33115H != null) {
            this.f33115H.mo5469a(12, Bundle.EMPTY);
        }
    }

    public final ArrayList m30452n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f33126S);
        if (this.f33125R != null) {
            arrayList.addAll(this.f33125R);
        }
        return arrayList;
    }

    final void m30429a(int i, String str, String str2, ArrayList arrayList) {
        this.f33122O = null;
        m30450l();
        C6555h c6555h = new C6555h(m30443e(), i, str, new C6716f(this, arrayList), new C6717g(this));
        m30437a(true);
        DynamicAddressFieldsLayout dynamicAddressFieldsLayout = this.f33145o;
        switch (dynamicAddressFieldsLayout.f33087d) {
            case 2:
                dynamicAddressFieldsLayout.f33087d = 3;
                dynamicAddressFieldsLayout.f33090g.setVisibility(0);
                dynamicAddressFieldsLayout.f33086c.setFloatValues(new float[]{1.0f, 0.0f});
                dynamicAddressFieldsLayout.f33086c.setStartDelay(200);
                dynamicAddressFieldsLayout.f33086c.setCurrentPlayTime(0);
                dynamicAddressFieldsLayout.f33086c.start();
                break;
            case 4:
                dynamicAddressFieldsLayout.f33087d = 3;
                dynamicAddressFieldsLayout.f33086c.reverse();
                break;
        }
        c6555h.m29753a(str2);
    }

    static C7147b m30408a(SparseArray sparseArray) {
        C7147b c7147b = new C7147b();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            char keyAt = (char) sparseArray.keyAt(i);
            Object obj = (String) sparseArray.valueAt(i);
            if (obj != null) {
                switch (keyAt) {
                    case '1':
                    case '2':
                        c7147b.f34916r = (String[]) C6591c.m29910a(c7147b.f34916r, obj);
                        break;
                    case 'C':
                        c7147b.f34905g = obj;
                        break;
                    case 'N':
                        c7147b.f34918t = obj;
                        break;
                    case 'O':
                        c7147b.f34917s = obj;
                        break;
                    case 'R':
                        c7147b.f34899a = obj;
                        break;
                    case 'S':
                        c7147b.f34903e = obj;
                        break;
                    case 'X':
                        c7147b.f34912n = obj;
                        break;
                    case 'Z':
                        c7147b.f34910l = obj.toUpperCase(Locale.getDefault());
                        break;
                    default:
                        break;
                }
            }
        }
        return c7147b;
    }

    final void m30437a(boolean z) {
        this.f33118K = Math.max(0, (z ? 1 : -1) + this.f33118K);
        if ((z && this.f33118K == 1) || (!z && this.f33118K == 0)) {
            m30439b(this.f33137g);
        }
    }

    public final void m30439b(boolean z) {
        int i = 0;
        this.f33137g = z;
        if (this.f33143m != null) {
            boolean z2 = this.f33137g && !m30440b();
            this.f33146p.setEnabled(z2);
            this.f33147q.setEnabled(z2);
            int size = this.f33152v.size();
            while (i < size) {
                ((View) this.f33152v.get(i)).setEnabled(z2);
                i++;
            }
            if (this.f33148r != null) {
                this.f33148r.setEnabled(z2);
            }
        }
    }

    public final void m30434a(String str, int i) {
        ci.m30866a(this.f33148r, str, i);
    }

    public static boolean m30415o() {
        return true;
    }

    protected final boolean m30453p() {
        return this.f33146p.getVisibility() == 0 && this.f33146p.isChecked();
    }

    public final void setTriggerListener(C6512i c6512i) {
        this.f33129V = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        long a = m30424a(1);
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C6515e c6515e = (C6515e) obj;
            if (c6515e.f32578a.c == a) {
                switch (c6515e.f32578a.d) {
                    case 1:
                    case 4:
                        this.f33141k.add(c6515e);
                        break;
                    case 3:
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger type %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
                }
            } else if (c6515e.f32578a.c == this.f33128U.c) {
                switch (c6515e.f32578a.d) {
                    case 1:
                        if (c6515e.f32578a.c().a == null) {
                            this.f33142l.add(c6515e);
                            break;
                        }
                        throw new IllegalArgumentException("Address form only supports value changed triggers with null newValue");
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger type %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger component %d", new Object[]{Long.valueOf(c6515e.f32578a.c)}));
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        if (tVar.c == m30424a(1)) {
            CharSequence a = C6563p.m29793a(this.f33153w);
            if (C6516f.m29567b(tVar)) {
                u c = C6516f.m29568c(tVar);
                if (c != null && !TextUtils.isEmpty(c.b)) {
                    return Pattern.matches(c.b, a);
                }
                throw new IllegalStateException("Trigger needs set of values to check against.");
            }
            throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
        } else if (tVar.c == this.f33128U.c) {
            return false;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid trigger component %d", new Object[]{Long.valueOf(tVar.c)}));
        }
    }

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(7);
        f33105a = sparseBooleanArray;
        sparseBooleanArray.put(83, true);
        f33105a.put(82, true);
        f33105a.put(67, true);
        f33105a.put(49, true);
        f33105a.put(50, true);
        f33105a.put(90, true);
        f33105a.put(88, true);
        sparseBooleanArray = new SparseBooleanArray(2);
        f33106b = sparseBooleanArray;
        sparseBooleanArray.put(82, true);
        f33106b.put(90, true);
    }
}
