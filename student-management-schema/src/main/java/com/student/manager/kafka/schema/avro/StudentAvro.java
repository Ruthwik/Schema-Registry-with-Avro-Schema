/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.student.manager.kafka.schema.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** This Schema describes about student */
@org.apache.avro.specific.AvroGenerated
public class StudentAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7511922240628084132L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StudentAvro\",\"namespace\":\"com.student.manager.kafka.schema.avro\",\"doc\":\"This Schema describes about student\",\"fields\":[{\"name\":\"student_id\",\"type\":\"string\"},{\"name\":\"first_name\",\"type\":\"string\"},{\"name\":\"last_name\",\"type\":\"string\"},{\"name\":\"dob\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"address\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<StudentAvro> ENCODER =
      new BinaryMessageEncoder<StudentAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StudentAvro> DECODER =
      new BinaryMessageDecoder<StudentAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<StudentAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<StudentAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StudentAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this StudentAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a StudentAvro from a ByteBuffer. */
  public static StudentAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence student_id;
   private java.lang.CharSequence first_name;
   private java.lang.CharSequence last_name;
   private java.lang.CharSequence dob;
   private java.lang.CharSequence email;
   private java.lang.CharSequence address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StudentAvro() {}

  /**
   * All-args constructor.
   * @param student_id The new value for student_id
   * @param first_name The new value for first_name
   * @param last_name The new value for last_name
   * @param dob The new value for dob
   * @param email The new value for email
   * @param address The new value for address
   */
  public StudentAvro(java.lang.CharSequence student_id, java.lang.CharSequence first_name, java.lang.CharSequence last_name, java.lang.CharSequence dob, java.lang.CharSequence email, java.lang.CharSequence address) {
    this.student_id = student_id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.dob = dob;
    this.email = email;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return student_id;
    case 1: return first_name;
    case 2: return last_name;
    case 3: return dob;
    case 4: return email;
    case 5: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: student_id = (java.lang.CharSequence)value$; break;
    case 1: first_name = (java.lang.CharSequence)value$; break;
    case 2: last_name = (java.lang.CharSequence)value$; break;
    case 3: dob = (java.lang.CharSequence)value$; break;
    case 4: email = (java.lang.CharSequence)value$; break;
    case 5: address = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'student_id' field.
   * @return The value of the 'student_id' field.
   */
  public java.lang.CharSequence getStudentId() {
    return student_id;
  }

  /**
   * Sets the value of the 'student_id' field.
   * @param value the value to set.
   */
  public void setStudentId(java.lang.CharSequence value) {
    this.student_id = value;
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return The value of the 'first_name' field.
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }

  /**
   * Sets the value of the 'first_name' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return The value of the 'last_name' field.
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }

  /**
   * Sets the value of the 'last_name' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'dob' field.
   * @return The value of the 'dob' field.
   */
  public java.lang.CharSequence getDob() {
    return dob;
  }

  /**
   * Sets the value of the 'dob' field.
   * @param value the value to set.
   */
  public void setDob(java.lang.CharSequence value) {
    this.dob = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Creates a new StudentAvro RecordBuilder.
   * @return A new StudentAvro RecordBuilder
   */
  public static com.student.manager.kafka.schema.avro.StudentAvro.Builder newBuilder() {
    return new com.student.manager.kafka.schema.avro.StudentAvro.Builder();
  }

  /**
   * Creates a new StudentAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StudentAvro RecordBuilder
   */
  public static com.student.manager.kafka.schema.avro.StudentAvro.Builder newBuilder(com.student.manager.kafka.schema.avro.StudentAvro.Builder other) {
    return new com.student.manager.kafka.schema.avro.StudentAvro.Builder(other);
  }

  /**
   * Creates a new StudentAvro RecordBuilder by copying an existing StudentAvro instance.
   * @param other The existing instance to copy.
   * @return A new StudentAvro RecordBuilder
   */
  public static com.student.manager.kafka.schema.avro.StudentAvro.Builder newBuilder(com.student.manager.kafka.schema.avro.StudentAvro other) {
    return new com.student.manager.kafka.schema.avro.StudentAvro.Builder(other);
  }

  /**
   * RecordBuilder for StudentAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StudentAvro>
    implements org.apache.avro.data.RecordBuilder<StudentAvro> {

    private java.lang.CharSequence student_id;
    private java.lang.CharSequence first_name;
    private java.lang.CharSequence last_name;
    private java.lang.CharSequence dob;
    private java.lang.CharSequence email;
    private java.lang.CharSequence address;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.student.manager.kafka.schema.avro.StudentAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.student_id)) {
        this.student_id = data().deepCopy(fields()[0].schema(), other.student_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.first_name)) {
        this.first_name = data().deepCopy(fields()[1].schema(), other.first_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.last_name)) {
        this.last_name = data().deepCopy(fields()[2].schema(), other.last_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dob)) {
        this.dob = data().deepCopy(fields()[3].schema(), other.dob);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.email)) {
        this.email = data().deepCopy(fields()[4].schema(), other.email);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StudentAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.student.manager.kafka.schema.avro.StudentAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.student_id)) {
        this.student_id = data().deepCopy(fields()[0].schema(), other.student_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.first_name)) {
        this.first_name = data().deepCopy(fields()[1].schema(), other.first_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.last_name)) {
        this.last_name = data().deepCopy(fields()[2].schema(), other.last_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dob)) {
        this.dob = data().deepCopy(fields()[3].schema(), other.dob);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.email)) {
        this.email = data().deepCopy(fields()[4].schema(), other.email);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'student_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentId() {
      return student_id;
    }

    /**
      * Sets the value of the 'student_id' field.
      * @param value The value of 'student_id'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setStudentId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.student_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'student_id' field has been set.
      * @return True if the 'student_id' field has been set, false otherwise.
      */
    public boolean hasStudentId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'student_id' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearStudentId() {
      student_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'first_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.first_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'first_name' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.last_name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'last_name' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'dob' field.
      * @return The value.
      */
    public java.lang.CharSequence getDob() {
      return dob;
    }

    /**
      * Sets the value of the 'dob' field.
      * @param value The value of 'dob'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setDob(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.dob = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'dob' field has been set.
      * @return True if the 'dob' field has been set, false otherwise.
      */
    public boolean hasDob() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'dob' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearDob() {
      dob = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.email = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearEmail() {
      email = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.address = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.student.manager.kafka.schema.avro.StudentAvro.Builder clearAddress() {
      address = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StudentAvro build() {
      try {
        StudentAvro record = new StudentAvro();
        record.student_id = fieldSetFlags()[0] ? this.student_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.first_name = fieldSetFlags()[1] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.last_name = fieldSetFlags()[2] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.dob = fieldSetFlags()[3] ? this.dob : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.email = fieldSetFlags()[4] ? this.email : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.address = fieldSetFlags()[5] ? this.address : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StudentAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<StudentAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StudentAvro>
    READER$ = (org.apache.avro.io.DatumReader<StudentAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
