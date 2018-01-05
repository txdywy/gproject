package com.firebase.jobdispatcher;

import android.text.TextUtils;
import java.util.List;

public class ValidationEnforcer$ValidationException extends RuntimeException
{

    ValidationEnforcer$ValidationException(String p0, List p1) {
        v0 = TextUtils.join("\n  - ", p1);
        RuntimeException((String.valueOf(p0).length() + 2 + String.valueOf(v0).length()) + p0 + ": " + v0);
    }

}
