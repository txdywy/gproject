package com.google.android.wallet.ui.common;

import java.util.List;

final class ap implements Runnable {
    public List f33536a;
    public final /* synthetic */ FormEditText f33537b;

    ap(FormEditText formEditText, List list) {
        this.f33537b = formEditText;
        this.f33536a = list;
    }

    public final void run() {
        this.f33537b.setAdapter(new bf(this.f33537b.getContext(), this.f33536a));
    }
}
