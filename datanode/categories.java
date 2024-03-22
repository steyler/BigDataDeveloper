// ORM class for table 'categories'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
<<<<<<< HEAD
// Generated date: Wed Mar 20 01:26:28 UTC 2024
=======
// Generated date: Fri Mar 22 00:28:04 UTC 2024
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class categories extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
<<<<<<< HEAD
    setters.put("category_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        categories.this.category_id = (Integer)value;
      }
    });
=======
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    setters.put("category_department_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        categories.this.category_department_id = (Integer)value;
      }
    });
<<<<<<< HEAD
=======
    setters.put("category_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        categories.this.category_id = (Integer)value;
      }
    });
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    setters.put("category_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        categories.this.category_name = (String)value;
      }
    });
  }
  public categories() {
    init0();
  }
<<<<<<< HEAD
  private Integer category_id;
  public Integer get_category_id() {
    return category_id;
  }
  public void set_category_id(Integer category_id) {
    this.category_id = category_id;
  }
  public categories with_category_id(Integer category_id) {
    this.category_id = category_id;
    return this;
  }
=======
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
  private Integer category_department_id;
  public Integer get_category_department_id() {
    return category_department_id;
  }
  public void set_category_department_id(Integer category_department_id) {
    this.category_department_id = category_department_id;
  }
  public categories with_category_department_id(Integer category_department_id) {
    this.category_department_id = category_department_id;
    return this;
  }
<<<<<<< HEAD
=======
  private Integer category_id;
  public Integer get_category_id() {
    return category_id;
  }
  public void set_category_id(Integer category_id) {
    this.category_id = category_id;
  }
  public categories with_category_id(Integer category_id) {
    this.category_id = category_id;
    return this;
  }
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
  private String category_name;
  public String get_category_name() {
    return category_name;
  }
  public void set_category_name(String category_name) {
    this.category_name = category_name;
  }
  public categories with_category_name(String category_name) {
    this.category_name = category_name;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof categories)) {
      return false;
    }
    categories that = (categories) o;
    boolean equal = true;
<<<<<<< HEAD
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
    equal = equal && (this.category_department_id == null ? that.category_department_id == null : this.category_department_id.equals(that.category_department_id));
=======
    equal = equal && (this.category_department_id == null ? that.category_department_id == null : this.category_department_id.equals(that.category_department_id));
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    equal = equal && (this.category_name == null ? that.category_name == null : this.category_name.equals(that.category_name));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof categories)) {
      return false;
    }
    categories that = (categories) o;
    boolean equal = true;
<<<<<<< HEAD
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
    equal = equal && (this.category_department_id == null ? that.category_department_id == null : this.category_department_id.equals(that.category_department_id));
=======
    equal = equal && (this.category_department_id == null ? that.category_department_id == null : this.category_department_id.equals(that.category_department_id));
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    equal = equal && (this.category_name == null ? that.category_name == null : this.category_name.equals(that.category_name));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
<<<<<<< HEAD
    this.category_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.category_department_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.category_name = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.category_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.category_department_id = JdbcWritableBridge.readInteger(2, __dbResults);
=======
    this.category_department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.category_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.category_name = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.category_department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.category_id = JdbcWritableBridge.readInteger(2, __dbResults);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    this.category_name = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
<<<<<<< HEAD
    JdbcWritableBridge.writeInteger(category_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(category_department_id, 2 + __off, 4, __dbStmt);
=======
    JdbcWritableBridge.writeInteger(category_department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(category_id, 2 + __off, 4, __dbStmt);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    JdbcWritableBridge.writeString(category_name, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
<<<<<<< HEAD
    JdbcWritableBridge.writeInteger(category_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(category_department_id, 2 + __off, 4, __dbStmt);
=======
    JdbcWritableBridge.writeInteger(category_department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(category_id, 2 + __off, 4, __dbStmt);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    JdbcWritableBridge.writeString(category_name, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
<<<<<<< HEAD
        this.category_id = null;
    } else {
    this.category_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
=======
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
        this.category_department_id = null;
    } else {
    this.category_department_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
<<<<<<< HEAD
=======
        this.category_id = null;
    } else {
    this.category_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
        this.category_name = null;
    } else {
    this.category_name = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
<<<<<<< HEAD
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
=======
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    if (null == this.category_department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_department_id);
    }
<<<<<<< HEAD
=======
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    if (null == this.category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_name);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
<<<<<<< HEAD
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
=======
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    if (null == this.category_department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_department_id);
    }
<<<<<<< HEAD
=======
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    if (null == this.category_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category_name);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
<<<<<<< HEAD
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_department_id==null?"null":"" + category_department_id, delimiters));
    __sb.append(fieldDelim);
=======
    __sb.append(FieldFormatter.escapeAndEnclose(category_department_id==null?"null":"" + category_department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    __sb.append(FieldFormatter.escapeAndEnclose(category_name==null?"null":category_name, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
<<<<<<< HEAD
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_department_id==null?"null":"" + category_department_id, delimiters));
    __sb.append(fieldDelim);
=======
    __sb.append(FieldFormatter.escapeAndEnclose(category_department_id==null?"null":"" + category_department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    __sb.append(FieldFormatter.escapeAndEnclose(category_name==null?"null":category_name, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
<<<<<<< HEAD
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
=======
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_department_id = null; } else {
      this.category_department_id = Integer.valueOf(__cur_str);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
<<<<<<< HEAD
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_department_id = null; } else {
      this.category_department_id = Integer.valueOf(__cur_str);
=======
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_name = null; } else {
      this.category_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
<<<<<<< HEAD
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
=======
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_department_id = null; } else {
      this.category_department_id = Integer.valueOf(__cur_str);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
<<<<<<< HEAD
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_department_id = null; } else {
      this.category_department_id = Integer.valueOf(__cur_str);
=======
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category_name = null; } else {
      this.category_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    categories o = (categories) super.clone();
    return o;
  }

  public void clone0(categories o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
<<<<<<< HEAD
    __sqoop$field_map.put("category_id", this.category_id);
    __sqoop$field_map.put("category_department_id", this.category_department_id);
=======
    __sqoop$field_map.put("category_department_id", this.category_department_id);
    __sqoop$field_map.put("category_id", this.category_id);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    __sqoop$field_map.put("category_name", this.category_name);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
<<<<<<< HEAD
    __sqoop$field_map.put("category_id", this.category_id);
    __sqoop$field_map.put("category_department_id", this.category_department_id);
=======
    __sqoop$field_map.put("category_department_id", this.category_department_id);
    __sqoop$field_map.put("category_id", this.category_id);
>>>>>>> 84c3c794dfc4b59c99cb784fbdb419dbb48b729e
    __sqoop$field_map.put("category_name", this.category_name);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
