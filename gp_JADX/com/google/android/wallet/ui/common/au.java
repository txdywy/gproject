package com.google.android.wallet.ui.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6619c;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6625i;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.List;

public abstract class au extends cv implements ab, ai {
    public i aD;
    public at aE;
    public C6528w aF;
    public boolean aG = true;

    public abstract h mo5521Z();

    public static Bundle m29850a(int i, i iVar, LogContext logContext) {
        Bundle a = C6522i.m29587a(i, logContext);
        a.putParcelable("formProto", ParcelableProto.m29885a(iVar));
        return a;
    }

    public void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        ao();
        if (bundle != null) {
            this.aG = bundle.getBoolean("shouldShowLastSeparator", true);
        }
    }

    protected final void mo5517a(Bundle bundle, View view) {
        super.mo5517a(bundle, view);
        h Z = mo5521Z();
        if (Z != null) {
            switch (Z.g) {
                case 0:
                case 2:
                    break;
                case 3:
                    view.setBackgroundColor(i().getColor(C6619c.wallet_uic_form_emphasis_color));
                    int dimensionPixelSize = i().getDimensionPixelSize(C6620d.wallet_uic_form_emphasis_extra_horizontal_padding);
                    view.setPadding(view.getPaddingLeft() + dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize + view.getPaddingRight(), view.getPaddingBottom());
                    break;
                default:
                    Log.e("FormFragment", "Ignoring unsupported Form DisplayType: " + Z.g);
                    break;
            }
        }
        mo5533W();
        mo5469a(1, Bundle.EMPTY);
    }

    public void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putBoolean("shouldShowLastSeparator", this.aG);
    }

    public void mo5469a(int i, Bundle bundle) {
        ((C6528w) av()).mo5469a(i, bundle);
        if (this.aF != null) {
            this.aF.mo5469a(i, bundle);
        }
    }

    public boolean mo5523a(String str, int i) {
        return false;
    }

    public boolean ae() {
        return false;
    }

    public void af() {
    }

    public String ag() {
        return null;
    }

    public boolean mo5524a(long[] jArr) {
        return mo5608a(jArr, true);
    }

    public final boolean mo5526b(long[] jArr) {
        return mo5608a(jArr, false);
    }

    public boolean mo5608a(long[] jArr, boolean z) {
        return C6749z.m30559a(aa(), jArr, z);
    }

    public final boolean mo5527c(long[] jArr) {
        return C6749z.m30558a(aa(), jArr);
    }

    public boolean cP_() {
        return C6749z.m30557a(aa());
    }

    public final boolean mo5529e() {
        List aa = aa();
        int size = aa.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) aa.get(i)).f33285e;
            if (obj instanceof ai) {
                if (((ai) obj).mo5529e()) {
                    return true;
                }
            } else if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (!TextUtils.isEmpty(aaVar.getError())) {
                    aaVar.cT_();
                    return true;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!TextUtils.isEmpty(cp.m30909b(view))) {
                    ci.m30875b(view);
                    return true;
                }
            } else {
                throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
            }
        }
        return false;
    }

    public final boolean mo5530f() {
        return C6749z.m30561c(aa());
    }

    public void r_(int i) {
        C6749z.m30555a(aa(), i);
    }

    public ArrayList ad() {
        return C6749z.m30562d(aa());
    }

    public View aj() {
        return C6749z.m30563e(aa());
    }

    public at getParentFormElement() {
        at av = this.aE != null ? this.aE : av();
        return av instanceof at ? av : null;
    }

    public String mo5522a(String str) {
        if (str == null) {
            str = i().getString(C6625i.wallet_uic_string_list_append_to_end);
        }
        return C6749z.m30554a(aa(), str);
    }

    public final void ao() {
        if (this.aD == null) {
            Bundle bundle = this.q;
            if (bundle.containsKey("formProto")) {
                this.aD = ParcelableProto.m29887a(bundle, "formProto");
                return;
            }
            throw new IllegalArgumentException("Form proto not provided in arguments.");
        }
    }

    public long mo5520Y() {
        if (mo5521Z() != null) {
            return mo5521Z().b;
        }
        return 0;
    }
}
