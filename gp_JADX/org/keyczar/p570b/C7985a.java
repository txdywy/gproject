package org.keyczar.p570b;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class C7985a {
    public static ResourceBundle f40992a = ResourceBundle.getBundle("org.keyczar.i18n.messages");

    public static String m38177a(String str, Object... objArr) {
        try {
            return MessageFormat.format(f40992a.getString(str), objArr);
        } catch (MissingResourceException e) {
            return new StringBuilder(String.valueOf(str).length() + 2).append('!').append(str).append('!').toString();
        }
    }
}
