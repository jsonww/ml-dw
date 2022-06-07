// ORM class for table 'ads_users_rating_top100'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 02 15:52:42 CST 2022
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

public class ads_users_rating_top100 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("user_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_id = (Integer)value;
      }
    });
    setters.put("user_avg_ratings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_avg_ratings = (Float)value;
      }
    });
    setters.put("user_last_rating_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_last_rating_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("user_ratings_cnt_all", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_ratings_cnt_all = (Integer)value;
      }
    });
    setters.put("user_ratings_cnt_last1year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_ratings_cnt_last1year = (Integer)value;
      }
    });
    setters.put("user_ratings_cnt_last3year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_ratings_cnt_last3year = (Integer)value;
      }
    });
    setters.put("user_last_tag_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_last_tag_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("user_tags_cnt_all", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_tags_cnt_all = (Integer)value;
      }
    });
    setters.put("user_tags_cnt_last1year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_tags_cnt_last1year = (Integer)value;
      }
    });
    setters.put("user_tags_cnt_last3year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_users_rating_top100.this.user_tags_cnt_last3year = (Integer)value;
      }
    });
  }
  public ads_users_rating_top100() {
    init0();
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public ads_users_rating_top100 with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private Float user_avg_ratings;
  public Float get_user_avg_ratings() {
    return user_avg_ratings;
  }
  public void set_user_avg_ratings(Float user_avg_ratings) {
    this.user_avg_ratings = user_avg_ratings;
  }
  public ads_users_rating_top100 with_user_avg_ratings(Float user_avg_ratings) {
    this.user_avg_ratings = user_avg_ratings;
    return this;
  }
  private java.sql.Timestamp user_last_rating_time;
  public java.sql.Timestamp get_user_last_rating_time() {
    return user_last_rating_time;
  }
  public void set_user_last_rating_time(java.sql.Timestamp user_last_rating_time) {
    this.user_last_rating_time = user_last_rating_time;
  }
  public ads_users_rating_top100 with_user_last_rating_time(java.sql.Timestamp user_last_rating_time) {
    this.user_last_rating_time = user_last_rating_time;
    return this;
  }
  private Integer user_ratings_cnt_all;
  public Integer get_user_ratings_cnt_all() {
    return user_ratings_cnt_all;
  }
  public void set_user_ratings_cnt_all(Integer user_ratings_cnt_all) {
    this.user_ratings_cnt_all = user_ratings_cnt_all;
  }
  public ads_users_rating_top100 with_user_ratings_cnt_all(Integer user_ratings_cnt_all) {
    this.user_ratings_cnt_all = user_ratings_cnt_all;
    return this;
  }
  private Integer user_ratings_cnt_last1year;
  public Integer get_user_ratings_cnt_last1year() {
    return user_ratings_cnt_last1year;
  }
  public void set_user_ratings_cnt_last1year(Integer user_ratings_cnt_last1year) {
    this.user_ratings_cnt_last1year = user_ratings_cnt_last1year;
  }
  public ads_users_rating_top100 with_user_ratings_cnt_last1year(Integer user_ratings_cnt_last1year) {
    this.user_ratings_cnt_last1year = user_ratings_cnt_last1year;
    return this;
  }
  private Integer user_ratings_cnt_last3year;
  public Integer get_user_ratings_cnt_last3year() {
    return user_ratings_cnt_last3year;
  }
  public void set_user_ratings_cnt_last3year(Integer user_ratings_cnt_last3year) {
    this.user_ratings_cnt_last3year = user_ratings_cnt_last3year;
  }
  public ads_users_rating_top100 with_user_ratings_cnt_last3year(Integer user_ratings_cnt_last3year) {
    this.user_ratings_cnt_last3year = user_ratings_cnt_last3year;
    return this;
  }
  private java.sql.Timestamp user_last_tag_time;
  public java.sql.Timestamp get_user_last_tag_time() {
    return user_last_tag_time;
  }
  public void set_user_last_tag_time(java.sql.Timestamp user_last_tag_time) {
    this.user_last_tag_time = user_last_tag_time;
  }
  public ads_users_rating_top100 with_user_last_tag_time(java.sql.Timestamp user_last_tag_time) {
    this.user_last_tag_time = user_last_tag_time;
    return this;
  }
  private Integer user_tags_cnt_all;
  public Integer get_user_tags_cnt_all() {
    return user_tags_cnt_all;
  }
  public void set_user_tags_cnt_all(Integer user_tags_cnt_all) {
    this.user_tags_cnt_all = user_tags_cnt_all;
  }
  public ads_users_rating_top100 with_user_tags_cnt_all(Integer user_tags_cnt_all) {
    this.user_tags_cnt_all = user_tags_cnt_all;
    return this;
  }
  private Integer user_tags_cnt_last1year;
  public Integer get_user_tags_cnt_last1year() {
    return user_tags_cnt_last1year;
  }
  public void set_user_tags_cnt_last1year(Integer user_tags_cnt_last1year) {
    this.user_tags_cnt_last1year = user_tags_cnt_last1year;
  }
  public ads_users_rating_top100 with_user_tags_cnt_last1year(Integer user_tags_cnt_last1year) {
    this.user_tags_cnt_last1year = user_tags_cnt_last1year;
    return this;
  }
  private Integer user_tags_cnt_last3year;
  public Integer get_user_tags_cnt_last3year() {
    return user_tags_cnt_last3year;
  }
  public void set_user_tags_cnt_last3year(Integer user_tags_cnt_last3year) {
    this.user_tags_cnt_last3year = user_tags_cnt_last3year;
  }
  public ads_users_rating_top100 with_user_tags_cnt_last3year(Integer user_tags_cnt_last3year) {
    this.user_tags_cnt_last3year = user_tags_cnt_last3year;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_users_rating_top100)) {
      return false;
    }
    ads_users_rating_top100 that = (ads_users_rating_top100) o;
    boolean equal = true;
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_avg_ratings == null ? that.user_avg_ratings == null : this.user_avg_ratings.equals(that.user_avg_ratings));
    equal = equal && (this.user_last_rating_time == null ? that.user_last_rating_time == null : this.user_last_rating_time.equals(that.user_last_rating_time));
    equal = equal && (this.user_ratings_cnt_all == null ? that.user_ratings_cnt_all == null : this.user_ratings_cnt_all.equals(that.user_ratings_cnt_all));
    equal = equal && (this.user_ratings_cnt_last1year == null ? that.user_ratings_cnt_last1year == null : this.user_ratings_cnt_last1year.equals(that.user_ratings_cnt_last1year));
    equal = equal && (this.user_ratings_cnt_last3year == null ? that.user_ratings_cnt_last3year == null : this.user_ratings_cnt_last3year.equals(that.user_ratings_cnt_last3year));
    equal = equal && (this.user_last_tag_time == null ? that.user_last_tag_time == null : this.user_last_tag_time.equals(that.user_last_tag_time));
    equal = equal && (this.user_tags_cnt_all == null ? that.user_tags_cnt_all == null : this.user_tags_cnt_all.equals(that.user_tags_cnt_all));
    equal = equal && (this.user_tags_cnt_last1year == null ? that.user_tags_cnt_last1year == null : this.user_tags_cnt_last1year.equals(that.user_tags_cnt_last1year));
    equal = equal && (this.user_tags_cnt_last3year == null ? that.user_tags_cnt_last3year == null : this.user_tags_cnt_last3year.equals(that.user_tags_cnt_last3year));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_users_rating_top100)) {
      return false;
    }
    ads_users_rating_top100 that = (ads_users_rating_top100) o;
    boolean equal = true;
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.user_avg_ratings == null ? that.user_avg_ratings == null : this.user_avg_ratings.equals(that.user_avg_ratings));
    equal = equal && (this.user_last_rating_time == null ? that.user_last_rating_time == null : this.user_last_rating_time.equals(that.user_last_rating_time));
    equal = equal && (this.user_ratings_cnt_all == null ? that.user_ratings_cnt_all == null : this.user_ratings_cnt_all.equals(that.user_ratings_cnt_all));
    equal = equal && (this.user_ratings_cnt_last1year == null ? that.user_ratings_cnt_last1year == null : this.user_ratings_cnt_last1year.equals(that.user_ratings_cnt_last1year));
    equal = equal && (this.user_ratings_cnt_last3year == null ? that.user_ratings_cnt_last3year == null : this.user_ratings_cnt_last3year.equals(that.user_ratings_cnt_last3year));
    equal = equal && (this.user_last_tag_time == null ? that.user_last_tag_time == null : this.user_last_tag_time.equals(that.user_last_tag_time));
    equal = equal && (this.user_tags_cnt_all == null ? that.user_tags_cnt_all == null : this.user_tags_cnt_all.equals(that.user_tags_cnt_all));
    equal = equal && (this.user_tags_cnt_last1year == null ? that.user_tags_cnt_last1year == null : this.user_tags_cnt_last1year.equals(that.user_tags_cnt_last1year));
    equal = equal && (this.user_tags_cnt_last3year == null ? that.user_tags_cnt_last3year == null : this.user_tags_cnt_last3year.equals(that.user_tags_cnt_last3year));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.user_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_avg_ratings = JdbcWritableBridge.readFloat(2, __dbResults);
    this.user_last_rating_time = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.user_ratings_cnt_all = JdbcWritableBridge.readInteger(4, __dbResults);
    this.user_ratings_cnt_last1year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.user_ratings_cnt_last3year = JdbcWritableBridge.readInteger(6, __dbResults);
    this.user_last_tag_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.user_tags_cnt_all = JdbcWritableBridge.readInteger(8, __dbResults);
    this.user_tags_cnt_last1year = JdbcWritableBridge.readInteger(9, __dbResults);
    this.user_tags_cnt_last3year = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.user_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_avg_ratings = JdbcWritableBridge.readFloat(2, __dbResults);
    this.user_last_rating_time = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.user_ratings_cnt_all = JdbcWritableBridge.readInteger(4, __dbResults);
    this.user_ratings_cnt_last1year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.user_ratings_cnt_last3year = JdbcWritableBridge.readInteger(6, __dbResults);
    this.user_last_tag_time = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.user_tags_cnt_all = JdbcWritableBridge.readInteger(8, __dbResults);
    this.user_tags_cnt_last1year = JdbcWritableBridge.readInteger(9, __dbResults);
    this.user_tags_cnt_last3year = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(user_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(user_avg_ratings, 2 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_last_rating_time, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_all, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_last1year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_last3year, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_last_tag_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_all, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_last1year, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_last3year, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(user_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(user_avg_ratings, 2 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_last_rating_time, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_all, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_last1year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_ratings_cnt_last3year, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(user_last_tag_time, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_all, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_last1year, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_tags_cnt_last3year, 10 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_avg_ratings = null;
    } else {
    this.user_avg_ratings = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.user_last_rating_time = null;
    } else {
    this.user_last_rating_time = new Timestamp(__dataIn.readLong());
    this.user_last_rating_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_ratings_cnt_all = null;
    } else {
    this.user_ratings_cnt_all = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_ratings_cnt_last1year = null;
    } else {
    this.user_ratings_cnt_last1year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_ratings_cnt_last3year = null;
    } else {
    this.user_ratings_cnt_last3year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_last_tag_time = null;
    } else {
    this.user_last_tag_time = new Timestamp(__dataIn.readLong());
    this.user_last_tag_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_tags_cnt_all = null;
    } else {
    this.user_tags_cnt_all = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_tags_cnt_last1year = null;
    } else {
    this.user_tags_cnt_last1year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_tags_cnt_last3year = null;
    } else {
    this.user_tags_cnt_last3year = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.user_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.user_avg_ratings);
    }
    if (null == this.user_last_rating_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_last_rating_time.getTime());
    __dataOut.writeInt(this.user_last_rating_time.getNanos());
    }
    if (null == this.user_ratings_cnt_all) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_all);
    }
    if (null == this.user_ratings_cnt_last1year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_last1year);
    }
    if (null == this.user_ratings_cnt_last3year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_last3year);
    }
    if (null == this.user_last_tag_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_last_tag_time.getTime());
    __dataOut.writeInt(this.user_last_tag_time.getNanos());
    }
    if (null == this.user_tags_cnt_all) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_all);
    }
    if (null == this.user_tags_cnt_last1year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_last1year);
    }
    if (null == this.user_tags_cnt_last3year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_last3year);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.user_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.user_avg_ratings);
    }
    if (null == this.user_last_rating_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_last_rating_time.getTime());
    __dataOut.writeInt(this.user_last_rating_time.getNanos());
    }
    if (null == this.user_ratings_cnt_all) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_all);
    }
    if (null == this.user_ratings_cnt_last1year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_last1year);
    }
    if (null == this.user_ratings_cnt_last3year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_ratings_cnt_last3year);
    }
    if (null == this.user_last_tag_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_last_tag_time.getTime());
    __dataOut.writeInt(this.user_last_tag_time.getNanos());
    }
    if (null == this.user_tags_cnt_all) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_all);
    }
    if (null == this.user_tags_cnt_last1year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_last1year);
    }
    if (null == this.user_tags_cnt_last3year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_tags_cnt_last3year);
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
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_avg_ratings==null?"null":"" + user_avg_ratings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_last_rating_time==null?"null":"" + user_last_rating_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_all==null?"null":"" + user_ratings_cnt_all, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_last1year==null?"null":"" + user_ratings_cnt_last1year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_last3year==null?"null":"" + user_ratings_cnt_last3year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_last_tag_time==null?"null":"" + user_last_tag_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_all==null?"null":"" + user_tags_cnt_all, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_last1year==null?"null":"" + user_tags_cnt_last1year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_last3year==null?"null":"" + user_tags_cnt_last3year, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_avg_ratings==null?"null":"" + user_avg_ratings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_last_rating_time==null?"null":"" + user_last_rating_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_all==null?"null":"" + user_ratings_cnt_all, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_last1year==null?"null":"" + user_ratings_cnt_last1year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ratings_cnt_last3year==null?"null":"" + user_ratings_cnt_last3year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_last_tag_time==null?"null":"" + user_last_tag_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_all==null?"null":"" + user_tags_cnt_all, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_last1year==null?"null":"" + user_tags_cnt_last1year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_tags_cnt_last3year==null?"null":"" + user_tags_cnt_last3year, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_avg_ratings = null; } else {
      this.user_avg_ratings = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_last_rating_time = null; } else {
      this.user_last_rating_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_all = null; } else {
      this.user_ratings_cnt_all = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_last1year = null; } else {
      this.user_ratings_cnt_last1year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_last3year = null; } else {
      this.user_ratings_cnt_last3year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_last_tag_time = null; } else {
      this.user_last_tag_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_all = null; } else {
      this.user_tags_cnt_all = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_last1year = null; } else {
      this.user_tags_cnt_last1year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_last3year = null; } else {
      this.user_tags_cnt_last3year = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_avg_ratings = null; } else {
      this.user_avg_ratings = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_last_rating_time = null; } else {
      this.user_last_rating_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_all = null; } else {
      this.user_ratings_cnt_all = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_last1year = null; } else {
      this.user_ratings_cnt_last1year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ratings_cnt_last3year = null; } else {
      this.user_ratings_cnt_last3year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_last_tag_time = null; } else {
      this.user_last_tag_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_all = null; } else {
      this.user_tags_cnt_all = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_last1year = null; } else {
      this.user_tags_cnt_last1year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_tags_cnt_last3year = null; } else {
      this.user_tags_cnt_last3year = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_users_rating_top100 o = (ads_users_rating_top100) super.clone();
    o.user_last_rating_time = (o.user_last_rating_time != null) ? (java.sql.Timestamp) o.user_last_rating_time.clone() : null;
    o.user_last_tag_time = (o.user_last_tag_time != null) ? (java.sql.Timestamp) o.user_last_tag_time.clone() : null;
    return o;
  }

  public void clone0(ads_users_rating_top100 o) throws CloneNotSupportedException {
    o.user_last_rating_time = (o.user_last_rating_time != null) ? (java.sql.Timestamp) o.user_last_rating_time.clone() : null;
    o.user_last_tag_time = (o.user_last_tag_time != null) ? (java.sql.Timestamp) o.user_last_tag_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_avg_ratings", this.user_avg_ratings);
    __sqoop$field_map.put("user_last_rating_time", this.user_last_rating_time);
    __sqoop$field_map.put("user_ratings_cnt_all", this.user_ratings_cnt_all);
    __sqoop$field_map.put("user_ratings_cnt_last1year", this.user_ratings_cnt_last1year);
    __sqoop$field_map.put("user_ratings_cnt_last3year", this.user_ratings_cnt_last3year);
    __sqoop$field_map.put("user_last_tag_time", this.user_last_tag_time);
    __sqoop$field_map.put("user_tags_cnt_all", this.user_tags_cnt_all);
    __sqoop$field_map.put("user_tags_cnt_last1year", this.user_tags_cnt_last1year);
    __sqoop$field_map.put("user_tags_cnt_last3year", this.user_tags_cnt_last3year);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("user_avg_ratings", this.user_avg_ratings);
    __sqoop$field_map.put("user_last_rating_time", this.user_last_rating_time);
    __sqoop$field_map.put("user_ratings_cnt_all", this.user_ratings_cnt_all);
    __sqoop$field_map.put("user_ratings_cnt_last1year", this.user_ratings_cnt_last1year);
    __sqoop$field_map.put("user_ratings_cnt_last3year", this.user_ratings_cnt_last3year);
    __sqoop$field_map.put("user_last_tag_time", this.user_last_tag_time);
    __sqoop$field_map.put("user_tags_cnt_all", this.user_tags_cnt_all);
    __sqoop$field_map.put("user_tags_cnt_last1year", this.user_tags_cnt_last1year);
    __sqoop$field_map.put("user_tags_cnt_last3year", this.user_tags_cnt_last3year);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
