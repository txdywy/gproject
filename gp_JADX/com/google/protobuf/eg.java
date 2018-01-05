package com.google.protobuf;

import java.nio.ByteBuffer;

abstract class eg {
    eg() {
    }

    abstract int mo6217a(int i, byte[] bArr, int i2, int i3);

    abstract int mo6218a(CharSequence charSequence, byte[] bArr, int i, int i2);

    abstract void mo6219a(CharSequence charSequence, ByteBuffer byteBuffer);

    final boolean m33451a(byte[] bArr, int i, int i2) {
        return mo6217a(0, bArr, i, i2) == 0;
    }

    static void m33447b(CharSequence charSequence, ByteBuffer byteBuffer) {
        char charAt;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                charAt = charSequence.charAt(i);
                if (charAt >= '') {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException e) {
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < '') {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 'ࠀ') {
                r2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(r2, (byte) ((charAt2 & 63) | 128));
                    position = r2;
                } catch (IndexOutOfBoundsException e2) {
                    position = r2;
                }
            } else if (charAt2 < '?' || '?' < charAt2) {
                r2 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> 12) | 224));
                position = r2 + 1;
                byteBuffer.put(r2, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & 63) | 128));
            } else {
                if (i + 1 != length) {
                    i++;
                    charAt = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        int i2 = position + 1;
                        try {
                            byteBuffer.put(position, (byte) ((toCodePoint >>> 18) | 240));
                            r2 = i2 + 1;
                            byteBuffer.put(i2, (byte) (((toCodePoint >>> 12) & 63) | 128));
                            position = r2 + 1;
                            byteBuffer.put(r2, (byte) (((toCodePoint >>> 6) & 63) | 128));
                            byteBuffer.put(position, (byte) ((toCodePoint & 63) | 128));
                        } catch (IndexOutOfBoundsException e3) {
                            position = i2;
                        }
                    }
                }
                throw new UnpairedSurrogateException(i, length);
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
        return;
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
    }
}
