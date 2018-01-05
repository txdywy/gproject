package com.firebase.jobdispatcher;

import android.text.TextUtils;
import java.util.List;

public final class ValidationEnforcer implements ak {
    public final ak f4646a;

    public final class ValidationException extends RuntimeException {
        public ValidationException(String str, List list) {
            String join = TextUtils.join("\n  - ", list);
            super(new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(join).length()).append(str).append(": ").append(join).toString());
        }
    }

    public ValidationEnforcer(ak akVar) {
        this.f4646a = akVar;
    }

    public final List mo1109a(C0751z c0751z) {
        return this.f4646a.mo1109a(c0751z);
    }
}
