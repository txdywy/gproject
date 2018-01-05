package com.google.android.wallet.ui.common;

import java.text.Collator;
import java.util.Comparator;

public final /* synthetic */ class C6791l implements Comparator {
    public final Collator f33679a;

    public C6791l(Collator collator) {
        this.f33679a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f33679a.compare(((C6790k) obj).f33676c, ((C6790k) obj2).f33676c);
    }
}
