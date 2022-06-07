// ORM class for table 'ads_overall_cnt'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 20 23:21:41 CST 2022
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

public class ads_overall_cnt extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("users_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_overall_cnt.this.users_cnt = (Integer)value;
      }
    });
    setters.put("genres_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_overall_cnt.this.genres_cnt = (Integer)value;
      }
    });
    setters.put("movies_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_overall_cnt.this.movies_cnt = (Integer)value;
      }
    });
    setters.put("ratings_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_overall_cnt.this.ratings_cnt = (Integer)value;
      }
    });
    setters.put("tags_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_overall_cnt.this.tags_cnt = (Integer)value;
      }
    });
  }
  public ads_overall_cnt() {
    init0();
  }
  private Integer users_cnt;
  public Integer get_users_cnt() {
    return users_cnt;
  }
  public void set_users_cnt(Integer users_cnt) {
    this.users_cnt = users_cnt;
  }
  public ads_overall_cnt with_users_cnt(Integer users_cnt) {
    this.users_cnt = users_cnt;
    return this;
  }
  private Integer genres_cnt;
  public Integer get_genres_cnt() {
    return genres_cnt;
  }
  public void set_genres_cnt(Integer genres_cnt) {
    this.genres_cnt = genres_cnt;
  }
  public ads_overall_cnt with_genres_cnt(Integer genres_cnt) {
    this.genres_cnt = genres_cnt;
    return this;
  }
  private Integer movies_cnt;
  public Integer get_movies_cnt() {
    return movies_cnt;
  }
  public void set_movies_cnt(Integer movies_cnt) {
    this.movies_cnt = movies_cnt;
  }
  public ads_overall_cnt with_movies_cnt(Integer movies_cnt) {
    this.movies_cnt = movies_cnt;
    return this;
  }
  private Integer ratings_cnt;
  public Integer get_ratings_cnt() {
    return ratings_cnt;
  }
  public void set_ratings_cnt(Integer ratings_cnt) {
    this.ratings_cnt = ratings_cnt;
  }
  public ads_overall_cnt with_ratings_cnt(Integer ratings_cnt) {
    this.ratings_cnt = ratings_cnt;
    return this;
  }
  private Integer tags_cnt;
  public Integer get_tags_cnt() {
    return tags_cnt;
  }
  public void set_tags_cnt(Integer tags_cnt) {
    this.tags_cnt = tags_cnt;
  }
  public ads_overall_cnt with_tags_cnt(Integer tags_cnt) {
    this.tags_cnt = tags_cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_overall_cnt)) {
      return false;
    }
    ads_overall_cnt that = (ads_overall_cnt) o;
    boolean equal = true;
    equal = equal && (this.users_cnt == null ? that.users_cnt == null : this.users_cnt.equals(that.users_cnt));
    equal = equal && (this.genres_cnt == null ? that.genres_cnt == null : this.genres_cnt.equals(that.genres_cnt));
    equal = equal && (this.movies_cnt == null ? that.movies_cnt == null : this.movies_cnt.equals(that.movies_cnt));
    equal = equal && (this.ratings_cnt == null ? that.ratings_cnt == null : this.ratings_cnt.equals(that.ratings_cnt));
    equal = equal && (this.tags_cnt == null ? that.tags_cnt == null : this.tags_cnt.equals(that.tags_cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_overall_cnt)) {
      return false;
    }
    ads_overall_cnt that = (ads_overall_cnt) o;
    boolean equal = true;
    equal = equal && (this.users_cnt == null ? that.users_cnt == null : this.users_cnt.equals(that.users_cnt));
    equal = equal && (this.genres_cnt == null ? that.genres_cnt == null : this.genres_cnt.equals(that.genres_cnt));
    equal = equal && (this.movies_cnt == null ? that.movies_cnt == null : this.movies_cnt.equals(that.movies_cnt));
    equal = equal && (this.ratings_cnt == null ? that.ratings_cnt == null : this.ratings_cnt.equals(that.ratings_cnt));
    equal = equal && (this.tags_cnt == null ? that.tags_cnt == null : this.tags_cnt.equals(that.tags_cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.users_cnt = JdbcWritableBridge.readInteger(1, __dbResults);
    this.genres_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.movies_cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.ratings_cnt = JdbcWritableBridge.readInteger(4, __dbResults);
    this.tags_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.users_cnt = JdbcWritableBridge.readInteger(1, __dbResults);
    this.genres_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.movies_cnt = JdbcWritableBridge.readInteger(3, __dbResults);
    this.ratings_cnt = JdbcWritableBridge.readInteger(4, __dbResults);
    this.tags_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(users_cnt, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(genres_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(movies_cnt, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ratings_cnt, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tags_cnt, 5 + __off, 4, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(users_cnt, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(genres_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(movies_cnt, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ratings_cnt, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tags_cnt, 5 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.users_cnt = null;
    } else {
    this.users_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.genres_cnt = null;
    } else {
    this.genres_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.movies_cnt = null;
    } else {
    this.movies_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ratings_cnt = null;
    } else {
    this.ratings_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tags_cnt = null;
    } else {
    this.tags_cnt = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.users_cnt);
    }
    if (null == this.genres_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.genres_cnt);
    }
    if (null == this.movies_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movies_cnt);
    }
    if (null == this.ratings_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ratings_cnt);
    }
    if (null == this.tags_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tags_cnt);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.users_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.users_cnt);
    }
    if (null == this.genres_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.genres_cnt);
    }
    if (null == this.movies_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movies_cnt);
    }
    if (null == this.ratings_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ratings_cnt);
    }
    if (null == this.tags_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tags_cnt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(users_cnt==null?"null":"" + users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genres_cnt==null?"null":"" + genres_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movies_cnt==null?"null":"" + movies_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ratings_cnt==null?"null":"" + ratings_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tags_cnt==null?"null":"" + tags_cnt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(users_cnt==null?"null":"" + users_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genres_cnt==null?"null":"" + genres_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movies_cnt==null?"null":"" + movies_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ratings_cnt==null?"null":"" + ratings_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tags_cnt==null?"null":"" + tags_cnt, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.users_cnt = null; } else {
      this.users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genres_cnt = null; } else {
      this.genres_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movies_cnt = null; } else {
      this.movies_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ratings_cnt = null; } else {
      this.ratings_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tags_cnt = null; } else {
      this.tags_cnt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.users_cnt = null; } else {
      this.users_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genres_cnt = null; } else {
      this.genres_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movies_cnt = null; } else {
      this.movies_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ratings_cnt = null; } else {
      this.ratings_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tags_cnt = null; } else {
      this.tags_cnt = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_overall_cnt o = (ads_overall_cnt) super.clone();
    return o;
  }

  public void clone0(ads_overall_cnt o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("users_cnt", this.users_cnt);
    __sqoop$field_map.put("genres_cnt", this.genres_cnt);
    __sqoop$field_map.put("movies_cnt", this.movies_cnt);
    __sqoop$field_map.put("ratings_cnt", this.ratings_cnt);
    __sqoop$field_map.put("tags_cnt", this.tags_cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("users_cnt", this.users_cnt);
    __sqoop$field_map.put("genres_cnt", this.genres_cnt);
    __sqoop$field_map.put("movies_cnt", this.movies_cnt);
    __sqoop$field_map.put("ratings_cnt", this.ratings_cnt);
    __sqoop$field_map.put("tags_cnt", this.tags_cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
