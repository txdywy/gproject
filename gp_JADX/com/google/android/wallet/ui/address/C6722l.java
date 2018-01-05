package com.google.android.wallet.ui.address;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.wallet.common.p376a.C6549b;
import com.google.android.wallet.common.p376a.C6551d;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.aa;
import com.google.android.wallet.ui.common.ar;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;

final class C6722l implements ar {
    public final /* synthetic */ FormEditText f33165a;
    public final /* synthetic */ C6713c f33166b;

    C6722l(C6713c c6713c, FormEditText formEditText) {
        this.f33166b = c6713c;
        this.f33165a = formEditText;
    }

    public final void mo5617a(Object obj) {
        if (obj instanceof C6551d) {
            C6551d c6551d = (C6551d) obj;
            C7147b c7147b = c6551d.f32648e;
            CharSequence charSequence = c6551d.f32647d == null ? "" : c6551d.f32647d;
            View view;
            Object obj2;
            if (c7147b != null) {
                C6713c c6713c = this.f33166b;
                View view2 = this.f33165a;
                Object obj3 = null;
                ArrayList arrayList = new ArrayList();
                int size = c6713c.f33152v.size();
                int i = 0;
                while (i < size) {
                    Object obj4;
                    view = (View) c6713c.f33152v.get(i);
                    if (obj3 == null && view == view2) {
                        obj4 = 1;
                    } else {
                        obj4 = obj3;
                    }
                    if (obj4 != null) {
                        char charValue = ((Character) view.getTag()).charValue();
                        String a = C6549b.m29722a(c7147b, charValue);
                        if (!TextUtils.isEmpty(a) || !C6553f.m29734a(charValue, c6713c.f33154x) || TextUtils.isEmpty(C6713c.m30409a(view))) {
                            c6713c.m30431a(view, a, true, 4);
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    i++;
                    obj3 = obj4;
                }
                if (obj3 != null) {
                    View view3 = null;
                    int size2 = arrayList.size();
                    for (i = 0; i < size2; i++) {
                        view = (View) c6713c.f33152v.get(((Integer) arrayList.get(i)).intValue());
                        boolean isEmpty = TextUtils.isEmpty(C6713c.m30409a(view));
                        obj3 = (isEmpty || !(view instanceof aa) || ((aa) view).cQ_()) ? 1 : null;
                        if (view3 == null && (obj3 == null || isEmpty)) {
                            view3 = view;
                        }
                    }
                    if (view3 == null) {
                        view = c6713c.f33145o.focusSearch(130);
                        if (view != null) {
                            view.requestFocus();
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
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
            } else if (TextUtils.isEmpty(c6551d.f32651h)) {
                this.f33165a.m30516b(charSequence, 4);
                if (this.f33165a.cQ_()) {
                    C6713c c6713c2 = this.f33166b;
                    view = this.f33165a;
                    if (view != null) {
                        view = view.focusSearch(130);
                        if (view != null) {
                            view.requestFocus();
                            obj2 = 1;
                            if (obj2 == null) {
                                c6713c2.m30448j();
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 == null) {
                        c6713c2.m30448j();
                    }
                }
            } else {
                this.f33165a.m30516b(charSequence, 0);
                new C6727q(this.f33166b, this.f33165a).execute(new C6551d[]{c6551d});
            }
        }
    }
}
