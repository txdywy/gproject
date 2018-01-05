package com.google.android.finsky.billing.iab;

public enum C1868x {
    RESULT_OK(0),
    RESULT_USER_CANCELED(1),
    RESULT_SERVICE_UNAVAILABLE(2),
    RESULT_BILLING_UNAVAILABLE(3),
    RESULT_ITEM_UNAVAILABLE(4),
    RESULT_DEVELOPER_ERROR(5),
    RESULT_ERROR(6),
    RESULT_ITEM_ALREADY_OWNED(7),
    RESULT_ITEM_NOT_OWNED(8),
    RESULT_PROMO_ELIGIBLE(9),
    RESULT_NOT_PROMO_ELIGIBLE(10);
    
    public final int f9566l;

    private C1868x(int i) {
        this.f9566l = i;
    }

    public final String toString() {
        return new StringBuilder(super.toString()).append('(').append(this.f9566l).append(')').toString();
    }
}
