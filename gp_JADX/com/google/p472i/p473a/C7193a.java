package com.google.p472i.p473a;

import java.util.regex.Pattern;

public final class C7193a {
    public static final Pattern f35077a = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|(photos\\-image\\-(dev|qa)(-auth)?\\.corp\\.google\\.com)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-(dev|qa)\\-lighthouse(-auth)?\\.sandbox\\.google\\.com(\\/image)?))\\/");

    public static boolean m32572a(String str) {
        if ((str != null ? 1 : null) != null) {
            return f35077a.matcher(str).find();
        }
        throw new IllegalArgumentException();
    }
}
