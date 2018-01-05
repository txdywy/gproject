package com.google.android.wallet.common.p376a;

import android.util.SparseArray;
import java.text.Collator;
import java.util.Comparator;

final class C6554g implements Comparator {
    public final /* synthetic */ Collator f32659a;
    public final /* synthetic */ SparseArray f32660b;

    C6554g(Collator collator, SparseArray sparseArray) {
        this.f32659a = collator;
        this.f32660b = sparseArray;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f32659a.compare((String) this.f32660b.get(((Integer) obj).intValue()), (String) this.f32660b.get(((Integer) obj2).intValue()));
    }
}
