// ORM class for table 'ads_genres_cnt'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 20 23:43:35 CST 2022
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

public class ads_genres_cnt extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("genre", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_genres_cnt.this.genre = (String)value;
      }
    });
    setters.put("genre_movies_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_genres_cnt.this.genre_movies_cnt = (Integer)value;
      }
    });
    setters.put("genre_avg_ratings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_genres_cnt.this.genre_avg_ratings = (Float)value;
      }
    });
  }
  public ads_genres_cnt() {
    init0();
  }
  private String genre;
  public String get_genre() {
    return genre;
  }
  public void set_genre(String genre) {
    this.genre = genre;
  }
  public ads_genres_cnt with_genre(String genre) {
    this.genre = genre;
    return this;
  }
  private Integer genre_movies_cnt;
  public Integer get_genre_movies_cnt() {
    return genre_movies_cnt;
  }
  public void set_genre_movies_cnt(Integer genre_movies_cnt) {
    this.genre_movies_cnt = genre_movies_cnt;
  }
  public ads_genres_cnt with_genre_movies_cnt(Integer genre_movies_cnt) {
    this.genre_movies_cnt = genre_movies_cnt;
    return this;
  }
  private Float genre_avg_ratings;
  public Float get_genre_avg_ratings() {
    return genre_avg_ratings;
  }
  public void set_genre_avg_ratings(Float genre_avg_ratings) {
    this.genre_avg_ratings = genre_avg_ratings;
  }
  public ads_genres_cnt with_genre_avg_ratings(Float genre_avg_ratings) {
    this.genre_avg_ratings = genre_avg_ratings;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_genres_cnt)) {
      return false;
    }
    ads_genres_cnt that = (ads_genres_cnt) o;
    boolean equal = true;
    equal = equal && (this.genre == null ? that.genre == null : this.genre.equals(that.genre));
    equal = equal && (this.genre_movies_cnt == null ? that.genre_movies_cnt == null : this.genre_movies_cnt.equals(that.genre_movies_cnt));
    equal = equal && (this.genre_avg_ratings == null ? that.genre_avg_ratings == null : this.genre_avg_ratings.equals(that.genre_avg_ratings));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_genres_cnt)) {
      return false;
    }
    ads_genres_cnt that = (ads_genres_cnt) o;
    boolean equal = true;
    equal = equal && (this.genre == null ? that.genre == null : this.genre.equals(that.genre));
    equal = equal && (this.genre_movies_cnt == null ? that.genre_movies_cnt == null : this.genre_movies_cnt.equals(that.genre_movies_cnt));
    equal = equal && (this.genre_avg_ratings == null ? that.genre_avg_ratings == null : this.genre_avg_ratings.equals(that.genre_avg_ratings));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.genre = JdbcWritableBridge.readString(1, __dbResults);
    this.genre_movies_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.genre_avg_ratings = JdbcWritableBridge.readFloat(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.genre = JdbcWritableBridge.readString(1, __dbResults);
    this.genre_movies_cnt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.genre_avg_ratings = JdbcWritableBridge.readFloat(3, __dbResults);
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
    JdbcWritableBridge.writeString(genre, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(genre_movies_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(genre_avg_ratings, 3 + __off, 7, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(genre, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(genre_movies_cnt, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(genre_avg_ratings, 3 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.genre = null;
    } else {
    this.genre = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.genre_movies_cnt = null;
    } else {
    this.genre_movies_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.genre_avg_ratings = null;
    } else {
    this.genre_avg_ratings = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.genre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genre);
    }
    if (null == this.genre_movies_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.genre_movies_cnt);
    }
    if (null == this.genre_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.genre_avg_ratings);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.genre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genre);
    }
    if (null == this.genre_movies_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.genre_movies_cnt);
    }
    if (null == this.genre_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.genre_avg_ratings);
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
    __sb.append(FieldFormatter.escapeAndEnclose(genre==null?"null":genre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre_movies_cnt==null?"null":"" + genre_movies_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre_avg_ratings==null?"null":"" + genre_avg_ratings, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(genre==null?"null":genre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre_movies_cnt==null?"null":"" + genre_movies_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre_avg_ratings==null?"null":"" + genre_avg_ratings, delimiters));
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
    if (__cur_str.equals("null")) { this.genre = null; } else {
      this.genre = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genre_movies_cnt = null; } else {
      this.genre_movies_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genre_avg_ratings = null; } else {
      this.genre_avg_ratings = Float.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.genre = null; } else {
      this.genre = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genre_movies_cnt = null; } else {
      this.genre_movies_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.genre_avg_ratings = null; } else {
      this.genre_avg_ratings = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_genres_cnt o = (ads_genres_cnt) super.clone();
    return o;
  }

  public void clone0(ads_genres_cnt o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("genre", this.genre);
    __sqoop$field_map.put("genre_movies_cnt", this.genre_movies_cnt);
    __sqoop$field_map.put("genre_avg_ratings", this.genre_avg_ratings);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("genre", this.genre);
    __sqoop$field_map.put("genre_movies_cnt", this.genre_movies_cnt);
    __sqoop$field_map.put("genre_avg_ratings", this.genre_avg_ratings);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
