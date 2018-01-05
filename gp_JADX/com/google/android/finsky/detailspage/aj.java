package com.google.android.finsky.detailspage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aj {
    public final List f14242a;
    public int f14243b;

    public aj(List list) {
        this.f14242a = Collections.unmodifiableList(list);
    }

    public aj(Class cls) {
        this.f14242a = Collections.unmodifiableList(Arrays.asList(new Class[]{cls}));
    }
}
