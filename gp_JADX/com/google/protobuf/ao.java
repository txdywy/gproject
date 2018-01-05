package com.google.protobuf;

public enum ao {
    DOUBLE(0, ap.SCALAR, bi.DOUBLE),
    FLOAT(1, ap.SCALAR, bi.FLOAT),
    INT64(2, ap.SCALAR, bi.LONG),
    UINT64(3, ap.SCALAR, bi.LONG),
    INT32(4, ap.SCALAR, bi.INT),
    FIXED64(5, ap.SCALAR, bi.LONG),
    FIXED32(6, ap.SCALAR, bi.INT),
    BOOL(7, ap.SCALAR, bi.BOOLEAN),
    STRING(8, ap.SCALAR, bi.STRING),
    MESSAGE(9, ap.SCALAR, bi.MESSAGE),
    BYTES(10, ap.SCALAR, bi.BYTE_STRING),
    UINT32(11, ap.SCALAR, bi.INT),
    ENUM(12, ap.SCALAR, bi.ENUM),
    SFIXED32(13, ap.SCALAR, bi.INT),
    SFIXED64(14, ap.SCALAR, bi.LONG),
    SINT32(15, ap.SCALAR, bi.INT),
    SINT64(16, ap.SCALAR, bi.LONG),
    GROUP(17, ap.SCALAR, bi.MESSAGE),
    DOUBLE_LIST(18, ap.VECTOR, bi.DOUBLE),
    FLOAT_LIST(19, ap.VECTOR, bi.FLOAT),
    INT64_LIST(20, ap.VECTOR, bi.LONG),
    UINT64_LIST(21, ap.VECTOR, bi.LONG),
    INT32_LIST(22, ap.VECTOR, bi.INT),
    FIXED64_LIST(23, ap.VECTOR, bi.LONG),
    FIXED32_LIST(24, ap.VECTOR, bi.INT),
    BOOL_LIST(25, ap.VECTOR, bi.BOOLEAN),
    STRING_LIST(26, ap.VECTOR, bi.STRING),
    MESSAGE_LIST(27, ap.VECTOR, bi.MESSAGE),
    BYTES_LIST(28, ap.VECTOR, bi.BYTE_STRING),
    UINT32_LIST(29, ap.VECTOR, bi.INT),
    ENUM_LIST(30, ap.VECTOR, bi.ENUM),
    SFIXED32_LIST(31, ap.VECTOR, bi.INT),
    SFIXED64_LIST(32, ap.VECTOR, bi.LONG),
    SINT32_LIST(33, ap.VECTOR, bi.INT),
    SINT64_LIST(34, ap.VECTOR, bi.LONG),
    DOUBLE_LIST_PACKED(35, ap.PACKED_VECTOR, bi.DOUBLE),
    FLOAT_LIST_PACKED(36, ap.PACKED_VECTOR, bi.FLOAT),
    INT64_LIST_PACKED(37, ap.PACKED_VECTOR, bi.LONG),
    UINT64_LIST_PACKED(38, ap.PACKED_VECTOR, bi.LONG),
    INT32_LIST_PACKED(39, ap.PACKED_VECTOR, bi.INT),
    FIXED64_LIST_PACKED(40, ap.PACKED_VECTOR, bi.LONG),
    FIXED32_LIST_PACKED(41, ap.PACKED_VECTOR, bi.INT),
    BOOL_LIST_PACKED(42, ap.PACKED_VECTOR, bi.BOOLEAN),
    UINT32_LIST_PACKED(43, ap.PACKED_VECTOR, bi.INT),
    ENUM_LIST_PACKED(44, ap.PACKED_VECTOR, bi.ENUM),
    SFIXED32_LIST_PACKED(45, ap.PACKED_VECTOR, bi.INT),
    SFIXED64_LIST_PACKED(46, ap.PACKED_VECTOR, bi.LONG),
    SINT32_LIST_PACKED(47, ap.PACKED_VECTOR, bi.INT),
    SINT64_LIST_PACKED(48, ap.PACKED_VECTOR, bi.LONG),
    GROUP_LIST(49, ap.VECTOR, bi.MESSAGE),
    MAP(50, ap.MAP, bi.VOID);
    
    public static final ao[] aa = null;
    public final int f35168Z;

    private ao(int i, ap apVar, bi biVar) {
        this.f35168Z = i;
        Class cls;
        switch (apVar.ordinal()) {
            case 1:
                cls = biVar.f35223k;
                break;
            case 3:
                cls = biVar.f35223k;
                break;
        }
        if (apVar == ap.SCALAR) {
            biVar.ordinal();
        }
    }

    static {
        ao[] values = values();
        aa = new ao[values.length];
        int length = values.length;
        int i;
        while (i < length) {
            ao aoVar = values[i];
            aa[aoVar.f35168Z] = aoVar;
            i++;
        }
    }
}
