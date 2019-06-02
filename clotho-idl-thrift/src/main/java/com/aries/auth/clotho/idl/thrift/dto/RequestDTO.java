/**
 * Autogenerated by Thrift Compiler (0.12.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.aries.auth.clotho.idl.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-06-15")
public class RequestDTO implements org.apache.thrift.TBase<RequestDTO, RequestDTO._Fields>, java.io.Serializable, Cloneable, Comparable<RequestDTO> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RequestDTO");

    private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short) 1);
    private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RequestDTOStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RequestDTOTupleSchemeFactory();

    public long userId; // required
    public @org.apache.thrift.annotation.Nullable
    java.lang.String url; // required

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        USER_ID((short) 1, "userId"),
        URL((short) 2, "url");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // USER_ID
                    return USER_ID;
                case 2: // URL
                    return URL;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByName(java.lang.String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __USERID_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RequestDTO.class, metaDataMap);
    }

    public RequestDTO() {
    }

    public RequestDTO(
            long userId,
            java.lang.String url) {
        this();
        this.userId = userId;
        setUserIdIsSet(true);
        this.url = url;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public RequestDTO(RequestDTO other) {
        __isset_bitfield = other.__isset_bitfield;
        this.userId = other.userId;
        if (other.isSetUrl()) {
            this.url = other.url;
        }
    }

    public RequestDTO deepCopy() {
        return new RequestDTO(this);
    }

    @Override
    public void clear() {
        setUserIdIsSet(false);
        this.userId = 0;
        this.url = null;
    }

    public long getUserId() {
        return this.userId;
    }

    public RequestDTO setUserId(long userId) {
        this.userId = userId;
        setUserIdIsSet(true);
        return this;
    }

    public void unsetUserId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    /**
     * Returns true if field userId is set (has been assigned a value) and false otherwise
     */
    public boolean isSetUserId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    public void setUserIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.String getUrl() {
        return this.url;
    }

    public RequestDTO setUrl(@org.apache.thrift.annotation.Nullable java.lang.String url) {
        this.url = url;
        return this;
    }

    public void unsetUrl() {
        this.url = null;
    }

    /**
     * Returns true if field url is set (has been assigned a value) and false otherwise
     */
    public boolean isSetUrl() {
        return this.url != null;
    }

    public void setUrlIsSet(boolean value) {
        if (!value) {
            this.url = null;
        }
    }

    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
        switch (field) {
            case USER_ID:
                if (value == null) {
                    unsetUserId();
                } else {
                    setUserId((java.lang.Long) value);
                }
                break;

            case URL:
                if (value == null) {
                    unsetUrl();
                } else {
                    setUrl((java.lang.String) value);
                }
                break;

        }
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case USER_ID:
                return getUserId();

            case URL:
                return getUrl();

        }
        throw new java.lang.IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case USER_ID:
                return isSetUserId();
            case URL:
                return isSetUrl();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof RequestDTO)
            return this.equals((RequestDTO) that);
        return false;
    }

    public boolean equals(RequestDTO that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_userId = true;
        boolean that_present_userId = true;
        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (this.userId != that.userId)
                return false;
        }

        boolean this_present_url = true && this.isSetUrl();
        boolean that_present_url = true && that.isSetUrl();
        if (this_present_url || that_present_url) {
            if (!(this_present_url && that_present_url))
                return false;
            if (!this.url.equals(that.url))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(userId);

        hashCode = hashCode * 8191 + ((isSetUrl()) ? 131071 : 524287);
        if (isSetUrl())
            hashCode = hashCode * 8191 + url.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(RequestDTO other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetUrl()).compareTo(other.isSetUrl());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUrl()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, other.url);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @org.apache.thrift.annotation.Nullable
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestDTO(");
        boolean first = true;

        sb.append("userId:");
        sb.append(this.userId);
        first = false;
        if (!first) sb.append(", ");
        sb.append("url:");
        if (this.url == null) {
            sb.append("null");
        } else {
            sb.append(this.url);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
        if (url == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'url' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class RequestDTOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public RequestDTOStandardScheme getScheme() {
            return new RequestDTOStandardScheme();
        }
    }

    private static class RequestDTOStandardScheme extends org.apache.thrift.scheme.StandardScheme<RequestDTO> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, RequestDTO struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // USER_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.userId = iprot.readI64();
                            struct.setUserIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // URL
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.url = iprot.readString();
                            struct.setUrlIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            if (!struct.isSetUserId()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, RequestDTO struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(USER_ID_FIELD_DESC);
            oprot.writeI64(struct.userId);
            oprot.writeFieldEnd();
            if (struct.url != null) {
                oprot.writeFieldBegin(URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class RequestDTOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public RequestDTOTupleScheme getScheme() {
            return new RequestDTOTupleScheme();
        }
    }

    private static class RequestDTOTupleScheme extends org.apache.thrift.scheme.TupleScheme<RequestDTO> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, RequestDTO struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeI64(struct.userId);
            oprot.writeString(struct.url);
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, RequestDTO struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.userId = iprot.readI64();
            struct.setUserIdIsSet(true);
            struct.url = iprot.readString();
            struct.setUrlIsSet(true);
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

