package com.google.android.finsky.billing.acquire;

public enum C1691g {
    RESULT_OK(0),
    RESULT_USER_CANCELED(1),
    RESULT_SERVICE_UNAVAILABLE(2);
    
    public final int f8744d;

    private C1691g(int i) {
        this.f8744d = i;
    }

    public final String toString() {
        return new StringBuilder(super.toString()).append('(').append(this.f8744d).append(')').toString();
    }
}
