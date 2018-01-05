package com.google.android.wallet.ui.address;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.wallet.common.p376a.C6549b;
import com.google.android.wallet.common.p376a.C6550c;
import com.google.android.wallet.common.p376a.C6551d;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.ui.common.aa;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;

final class C6727q extends AsyncTask {
    public final View f33176a;
    public final String f33177b;
    public final ArrayList f33178c;
    public final /* synthetic */ C6713c f33179d;

    public C6727q(C6713c c6713c, View view) {
        ArrayList arrayList;
        this.f33179d = c6713c;
        this.f33176a = view;
        this.f33177b = c6713c.m30447i();
        if (c6713c.f33124Q != null) {
            arrayList = new ArrayList(c6713c.f33124Q);
        } else {
            arrayList = new ArrayList();
        }
        this.f33178c = arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C7147b c7147b = (C7147b) obj;
        if (this.f33179d.ac != null) {
            super.onPostExecute(c7147b);
            if (c7147b != null) {
                View view;
                C6713c c6713c = this.f33179d;
                View view2 = this.f33176a;
                ArrayList arrayList = new ArrayList();
                int size = c6713c.f33152v.size();
                int i = 0;
                boolean z = false;
                while (i < size) {
                    boolean z2;
                    view = (View) c6713c.f33152v.get(i);
                    if (z || view != view2) {
                        z2 = z;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        char charValue = ((Character) view.getTag()).charValue();
                        String a = C6549b.m29722a(c7147b, charValue);
                        if (!TextUtils.isEmpty(a) || !C6553f.m29734a(charValue, c6713c.f33154x) || TextUtils.isEmpty(C6713c.m30409a(view))) {
                            c6713c.m30431a(view, a, true, 4);
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    i++;
                    z = z2;
                }
                if (z) {
                    View view3 = null;
                    int size2 = arrayList.size();
                    for (i = 0; i < size2; i++) {
                        view = (View) c6713c.f33152v.get(((Integer) arrayList.get(i)).intValue());
                        boolean isEmpty = TextUtils.isEmpty(C6713c.m30409a(view));
                        if (isEmpty || !(view instanceof aa) || ((aa) view).cQ_()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (view3 == null && (!r1 || isEmpty)) {
                            view3 = view;
                        }
                    }
                    if (view3 == null) {
                        boolean z3;
                        view = c6713c.f33145o.focusSearch(130);
                        if (view != null) {
                            view.requestFocus();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            c6713c.m30448j();
                            return;
                        }
                        return;
                    }
                    view3.requestFocus();
                    if (view3 instanceof EditText) {
                        EditText editText = (EditText) view3;
                        editText.setSelection(editText.getText().length());
                    }
                }
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C6551d c6551d = ((C6551d[]) objArr)[0];
        if (c6551d == null || c6551d.f32650g == null) {
            return null;
        }
        int size = this.f33178c.size();
        for (int i = 0; i < size; i++) {
            C6550c c6550c = (C6550c) this.f33178c.get(i);
            if (c6551d.f32650g.equals(c6550c.mo5511a())) {
                return c6550c.mo5510a(c6551d.f32651h, this.f33177b);
            }
        }
        return null;
    }
}
