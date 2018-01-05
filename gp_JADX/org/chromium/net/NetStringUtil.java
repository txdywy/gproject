package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Locale;
import org.chromium.base.annotations.CalledByNative;

public class NetStringUtil {
    @CalledByNative
    private static String convertToUnicode(ByteBuffer byteBuffer, String str) {
        try {
            return Charset.forName(str).newDecoder().decode(byteBuffer).toString();
        } catch (Exception e) {
            return null;
        }
    }

    @CalledByNative
    private static String convertToUnicodeAndNormalize(ByteBuffer byteBuffer, String str) {
        CharSequence convertToUnicode = convertToUnicode(byteBuffer, str);
        if (convertToUnicode == null) {
            return null;
        }
        return Normalizer.normalize(convertToUnicode, Form.NFC);
    }

    @CalledByNative
    private static String convertToUnicodeWithSubstitutions(ByteBuffer byteBuffer, String str) {
        try {
            CharsetDecoder newDecoder = Charset.forName(str).newDecoder();
            newDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            newDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            newDecoder.replaceWith("�");
            return newDecoder.decode(byteBuffer).toString();
        } catch (Exception e) {
            return null;
        }
    }

    @CalledByNative
    private static String toUpperCase(String str) {
        try {
            return str.toUpperCase(Locale.getDefault());
        } catch (Exception e) {
            return null;
        }
    }
}
