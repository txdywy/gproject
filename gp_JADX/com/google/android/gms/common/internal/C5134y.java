package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

public final class C5134y {
    public static ApiException m23859a(Status status) {
        return (status.f25633i != null ? 1 : null) != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
