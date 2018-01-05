package com.squareup.leakcanary;

import java.io.Serializable;

public final class Exclusion implements Serializable {
    public final boolean alwaysExclude;
    public final String matching;
    public final String name;
    public final String reason;

    Exclusion(ParamsBuilder paramsBuilder) {
        this.name = paramsBuilder.name;
        this.reason = paramsBuilder.reason;
        this.alwaysExclude = paramsBuilder.alwaysExclude;
        this.matching = paramsBuilder.matching;
    }
}
