// ORM class for table 'ads_year_users'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 20 23:44:14 CST 2022
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

public class ads_year_users extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.year = (Integer)value;
      }
    });
    setters.put("annual_users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.annual_users_cnt = (Integer)value;
      }
    });
    setters.put("annual_rating_users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.annual_rating_users_cnt = (Integer)value;
      }
    });
    setters.put("annual_tag_users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.annual_tag_users_cnt = (Integer)value;
      }
    });
    setters.put("first_use_users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.first_use_users_cnt = (Integer)value;
      }
    });
    setters.put("recent_use_users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_year_users.this.recent_use_users_cnt = (Integer)value;
      }
    });
  }
  public ads_year_users() {
    init0();
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public ads_year_users with_year(Integer year) {
    this.year = year;
    return this;
  }
  private Integer annual_users_cnt;
  public Integer get_annual_users_cnt() {
    return annual_users_cnt;
  }
  public void set_annual_users_cnt(Integer annual_users_cnt) {
    this.annual_users_cnt = annual_users_cnt;
  }
  public ads_year_users with_annual_users_cnt(Integer annual_users_cnt) {
    this.annual_users_cnt = annual_users_cnt;
    return this;
  }
  private Integer annual_rating_users_cnt;
  public Integer get_annual_rating_users_cnt() {
    return annual_rating_users_cnt;
  }
  public void set_annual_rating_users_cnt(Integer annual_rating_users_cnt) {
    this.annual_rating_users_cnt = annual_rating_users_cnt;
  }
  public ads_year_users with_annual_rating_users_cnt(Integer annual_rating_users_cnt) {
    this.annual_rating_users_cnt = annual_rating_users_cnt;
    return this;
  }
  private Integer annual_tag_users_cnt;
  public Integer get_annual_tag_users_cnt() {
    return annual_tag_users_cnt;
  }
  public void set_annual_tag_users_cnt(Integer annual_tag_users_cnt) {
    this.annual_tag_users_cnt = annual_tag_users_cnt;
  }
  public ads_year_users with_annual_tag_users_cnt(Integer annual_tag_users_cnt) {
    this.annual_tag_users_cnt = annual_tag_users_cnt;
    return this;
  }
  private Integer first_use_users_cnt;
  public Integer get_first_use_users_cnt() {
    return first_use_users_cnt;
  }
  public void set_first_use_users_cnt(Integer first_use_users_cnt) {
    this.first_use_users_cnt = first_use_users_cnt;
  }
  public ads_year_users with_first_use_users_cnt(Integer first_use_users_cnt) {
    this.first_use_users_cnt = first_use_users_cnt;
    return this;
  }
  private Integer recent_use_users_cnt;
  public Integer get_recent_use_users_cnt() {
    return recent_use_users_cnt;
  }
  public void set_recent_use_users_cnt(Integer recent_use_users_cnt) {
    this.recent_use_users_cnt = recent_use_users_cnt;
  }
  public ads_year_users with_recent_use_users_cnt(Integer recent_use_users_cnt) {
    this.recent_use_users_cnt = recent_use_users_cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_year_users)) {
      return false;
    }
    ads_year_users that = (ads_year_users) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.annual_users_cnt == null ? that.annual_users_cnt == null : this.annual_users_cnt.equals(that.annual_users_cnt));
    equal = equal && (this.annual_rating_users_cnt == null ? that.annual_rating_users_cnt == null : this.annual_rating_users_cnt.equals(that.annual_rating_users_cnt));
    equal = equal && (this.annual_tag_users_cnt == null ? that.annual_tag_users_cnt == null : this.annual_tag_users_cnt.equals(that.annual_tag_users_cnt));
    equal = equal && (this.first_use_users_cnt == null ? that.first_use_users_cnt == null : this.first_use_users_cnt.equals(that.first_use_users_cnt));
    equal = equal && (this.recent_use_users_cnt == null ? that.recent_use_users_cnt == null : this.recent_use_users_cnt.equals(that.recent_use_users_cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_year_users)) {
      return false;
    }
    ads_year_users that = (ads_year_users) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.annual_users_cnt == null ? that.annual_users_cnt == null : this.annual_users_cnt.equals(that.annual_users_cnt));
    equal = equal && (this.annual_rating_users_cnt == null ? that.annual_rating_users_cnt == null : this.annual_rating_users_cnt.equals(that.annual_rating_users_cnt));
    equal = equal && (this.annual_tag_users_cnt == null ? that.annual_tag_users_cnt == null : this.annual_tag_users_cnt.equals(that.annual_tag_users_cnt));
    equal = equal && (this.first_use_users_cnt == null ? that.first_use_users_cnt == null : this.first_use_users_cnt.equals(that.first_use_users_cnt));
    equal = equal && (this.recent_use_users_cnt == null ? that.recent_use_users_cnt == null : this.recent_use_users_cnt.equals(that.recent_use_users_cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.annual_users_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.annual_rating_users_cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.annual_tag_users_cnt = JdbcWritableBridge.readInteger(4, __dbResults);
    this.first_use_users_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.recent_use_users_cnt = JdbcWritableBridge.readInteger(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.annual_users_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.annual_rating_users_cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.annual_tag_users_cnt = JdbcWritableBridge.readInteger(4, __dbResults);
    this.first_use_users_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.recent_use_users_cnt = JdbcWritableBridge.readInteger(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(year, 1 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_users_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_rating_users_cnt, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_tag_users_cnt, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(first_use_users_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recent_use_users_cnt, 6 + __off, 4, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(year, 1 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_users_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_rating_users_cnt, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(annual_tag_users_cnt, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(first_use_users_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recent_use_users_cnt, 6 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.annual_users_cnt = null;
    } else {
    this.annual_users_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.annual_rating_users_cnt = null;
    } else {
    this.annual_rating_users_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.annual_tag_users_cnt = null;
    } else {
    this.annual_tag_users_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.first_use_users_cnt = null;
    } else {
    this.first_use_users_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recent_use_users_cnt = null;
    } else {
    this.recent_use_users_cnt = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.annual_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_users_cnt);
    }
    if (null == this.annual_rating_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_rating_users_cnt);
    }
    if (null == this.annual_tag_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_tag_users_cnt);
    }
    if (null == this.first_use_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_use_users_cnt);
    }
    if (null == this.recent_use_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recent_use_users_cnt);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.annual_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_users_cnt);
    }
    if (null == this.annual_rating_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_rating_users_cnt);
    }
    if (null == this.annual_tag_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.annual_tag_users_cnt);
    }
    if (null == this.first_use_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.first_use_users_cnt);
    }
    if (null == this.recent_use_users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recent_use_users_cnt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_users_cnt==null?"null":"" + annual_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_rating_users_cnt==null?"null":"" + annual_rating_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_tag_users_cnt==null?"null":"" + annual_tag_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_use_users_cnt==null?"null":"" + first_use_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_use_users_cnt==null?"null":"" + recent_use_users_cnt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_users_cnt==null?"null":"" + annual_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_rating_users_cnt==null?"null":"" + annual_rating_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_tag_users_cnt==null?"null":"" + annual_tag_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_use_users_cnt==null?"null":"" + first_use_users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recent_use_users_cnt==null?"null":"" + recent_use_users_cnt, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_users_cnt = null; } else {
      this.annual_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_rating_users_cnt = null; } else {
      this.annual_rating_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_tag_users_cnt = null; } else {
      this.annual_tag_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_use_users_cnt = null; } else {
      this.first_use_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recent_use_users_cnt = null; } else {
      this.recent_use_users_cnt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_users_cnt = null; } else {
      this.annual_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_rating_users_cnt = null; } else {
      this.annual_rating_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_tag_users_cnt = null; } else {
      this.annual_tag_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.first_use_users_cnt = null; } else {
      this.first_use_users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recent_use_users_cnt = null; } else {
      this.recent_use_users_cnt = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_year_users o = (ads_year_users) super.clone();
    return o;
  }

  public void clone0(ads_year_users o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("annual_users_cnt", this.annual_users_cnt);
    __sqoop$field_map.put("annual_rating_users_cnt", this.annual_rating_users_cnt);
    __sqoop$field_map.put("annual_tag_users_cnt", this.annual_tag_users_cnt);
    __sqoop$field_map.put("first_use_users_cnt", this.first_use_users_cnt);
    __sqoop$field_map.put("recent_use_users_cnt", this.recent_use_users_cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("annual_users_cnt", this.annual_users_cnt);
    __sqoop$field_map.put("annual_rating_users_cnt", this.annual_rating_users_cnt);
    __sqoop$field_map.put("annual_tag_users_cnt", this.annual_tag_users_cnt);
    __sqoop$field_map.put("first_use_users_cnt", this.first_use_users_cnt);
    __sqoop$field_map.put("recent_use_users_cnt", this.recent_use_users_cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
