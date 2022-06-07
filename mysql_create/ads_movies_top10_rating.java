// ORM class for table 'ads_movies_top10_rating'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri May 20 23:44:52 CST 2022
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

public class ads_movies_top10_rating extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("movie_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_id = (Integer)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.title = (String)value;
      }
    });
    setters.put("genres", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.genres = (String)value;
      }
    });
    setters.put("movie_avg_ratings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_avg_ratings = (Float)value;
      }
    });
    setters.put("movie_ratings_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_ratings_cnt = (Integer)value;
      }
    });
    setters.put("movie_ratings_dist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_ratings_dist = (String)value;
      }
    });
    setters.put("movie_tags_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_tags_cnt = (Integer)value;
      }
    });
    setters.put("movie_tags_dist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_tags_dist = (String)value;
      }
    });
    setters.put("movie_imdb_link", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_imdb_link = (String)value;
      }
    });
    setters.put("movie_tmdb_link", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ads_movies_top10_rating.this.movie_tmdb_link = (String)value;
      }
    });
  }
  public ads_movies_top10_rating() {
    init0();
  }
  private Integer movie_id;
  public Integer get_movie_id() {
    return movie_id;
  }
  public void set_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
  }
  public ads_movies_top10_rating with_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public ads_movies_top10_rating with_title(String title) {
    this.title = title;
    return this;
  }
  private String genres;
  public String get_genres() {
    return genres;
  }
  public void set_genres(String genres) {
    this.genres = genres;
  }
  public ads_movies_top10_rating with_genres(String genres) {
    this.genres = genres;
    return this;
  }
  private Float movie_avg_ratings;
  public Float get_movie_avg_ratings() {
    return movie_avg_ratings;
  }
  public void set_movie_avg_ratings(Float movie_avg_ratings) {
    this.movie_avg_ratings = movie_avg_ratings;
  }
  public ads_movies_top10_rating with_movie_avg_ratings(Float movie_avg_ratings) {
    this.movie_avg_ratings = movie_avg_ratings;
    return this;
  }
  private Integer movie_ratings_cnt;
  public Integer get_movie_ratings_cnt() {
    return movie_ratings_cnt;
  }
  public void set_movie_ratings_cnt(Integer movie_ratings_cnt) {
    this.movie_ratings_cnt = movie_ratings_cnt;
  }
  public ads_movies_top10_rating with_movie_ratings_cnt(Integer movie_ratings_cnt) {
    this.movie_ratings_cnt = movie_ratings_cnt;
    return this;
  }
  private String movie_ratings_dist;
  public String get_movie_ratings_dist() {
    return movie_ratings_dist;
  }
  public void set_movie_ratings_dist(String movie_ratings_dist) {
    this.movie_ratings_dist = movie_ratings_dist;
  }
  public ads_movies_top10_rating with_movie_ratings_dist(String movie_ratings_dist) {
    this.movie_ratings_dist = movie_ratings_dist;
    return this;
  }
  private Integer movie_tags_cnt;
  public Integer get_movie_tags_cnt() {
    return movie_tags_cnt;
  }
  public void set_movie_tags_cnt(Integer movie_tags_cnt) {
    this.movie_tags_cnt = movie_tags_cnt;
  }
  public ads_movies_top10_rating with_movie_tags_cnt(Integer movie_tags_cnt) {
    this.movie_tags_cnt = movie_tags_cnt;
    return this;
  }
  private String movie_tags_dist;
  public String get_movie_tags_dist() {
    return movie_tags_dist;
  }
  public void set_movie_tags_dist(String movie_tags_dist) {
    this.movie_tags_dist = movie_tags_dist;
  }
  public ads_movies_top10_rating with_movie_tags_dist(String movie_tags_dist) {
    this.movie_tags_dist = movie_tags_dist;
    return this;
  }
  private String movie_imdb_link;
  public String get_movie_imdb_link() {
    return movie_imdb_link;
  }
  public void set_movie_imdb_link(String movie_imdb_link) {
    this.movie_imdb_link = movie_imdb_link;
  }
  public ads_movies_top10_rating with_movie_imdb_link(String movie_imdb_link) {
    this.movie_imdb_link = movie_imdb_link;
    return this;
  }
  private String movie_tmdb_link;
  public String get_movie_tmdb_link() {
    return movie_tmdb_link;
  }
  public void set_movie_tmdb_link(String movie_tmdb_link) {
    this.movie_tmdb_link = movie_tmdb_link;
  }
  public ads_movies_top10_rating with_movie_tmdb_link(String movie_tmdb_link) {
    this.movie_tmdb_link = movie_tmdb_link;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_movies_top10_rating)) {
      return false;
    }
    ads_movies_top10_rating that = (ads_movies_top10_rating) o;
    boolean equal = true;
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.genres == null ? that.genres == null : this.genres.equals(that.genres));
    equal = equal && (this.movie_avg_ratings == null ? that.movie_avg_ratings == null : this.movie_avg_ratings.equals(that.movie_avg_ratings));
    equal = equal && (this.movie_ratings_cnt == null ? that.movie_ratings_cnt == null : this.movie_ratings_cnt.equals(that.movie_ratings_cnt));
    equal = equal && (this.movie_ratings_dist == null ? that.movie_ratings_dist == null : this.movie_ratings_dist.equals(that.movie_ratings_dist));
    equal = equal && (this.movie_tags_cnt == null ? that.movie_tags_cnt == null : this.movie_tags_cnt.equals(that.movie_tags_cnt));
    equal = equal && (this.movie_tags_dist == null ? that.movie_tags_dist == null : this.movie_tags_dist.equals(that.movie_tags_dist));
    equal = equal && (this.movie_imdb_link == null ? that.movie_imdb_link == null : this.movie_imdb_link.equals(that.movie_imdb_link));
    equal = equal && (this.movie_tmdb_link == null ? that.movie_tmdb_link == null : this.movie_tmdb_link.equals(that.movie_tmdb_link));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_movies_top10_rating)) {
      return false;
    }
    ads_movies_top10_rating that = (ads_movies_top10_rating) o;
    boolean equal = true;
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.genres == null ? that.genres == null : this.genres.equals(that.genres));
    equal = equal && (this.movie_avg_ratings == null ? that.movie_avg_ratings == null : this.movie_avg_ratings.equals(that.movie_avg_ratings));
    equal = equal && (this.movie_ratings_cnt == null ? that.movie_ratings_cnt == null : this.movie_ratings_cnt.equals(that.movie_ratings_cnt));
    equal = equal && (this.movie_ratings_dist == null ? that.movie_ratings_dist == null : this.movie_ratings_dist.equals(that.movie_ratings_dist));
    equal = equal && (this.movie_tags_cnt == null ? that.movie_tags_cnt == null : this.movie_tags_cnt.equals(that.movie_tags_cnt));
    equal = equal && (this.movie_tags_dist == null ? that.movie_tags_dist == null : this.movie_tags_dist.equals(that.movie_tags_dist));
    equal = equal && (this.movie_imdb_link == null ? that.movie_imdb_link == null : this.movie_imdb_link.equals(that.movie_imdb_link));
    equal = equal && (this.movie_tmdb_link == null ? that.movie_tmdb_link == null : this.movie_tmdb_link.equals(that.movie_tmdb_link));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.movie_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.genres = JdbcWritableBridge.readString(3, __dbResults);
    this.movie_avg_ratings = JdbcWritableBridge.readFloat(4, __dbResults);
    this.movie_ratings_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.movie_ratings_dist = JdbcWritableBridge.readString(6, __dbResults);
    this.movie_tags_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.movie_tags_dist = JdbcWritableBridge.readString(8, __dbResults);
    this.movie_imdb_link = JdbcWritableBridge.readString(9, __dbResults);
    this.movie_tmdb_link = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.movie_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.genres = JdbcWritableBridge.readString(3, __dbResults);
    this.movie_avg_ratings = JdbcWritableBridge.readFloat(4, __dbResults);
    this.movie_ratings_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.movie_ratings_dist = JdbcWritableBridge.readString(6, __dbResults);
    this.movie_tags_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.movie_tags_dist = JdbcWritableBridge.readString(8, __dbResults);
    this.movie_imdb_link = JdbcWritableBridge.readString(9, __dbResults);
    this.movie_tmdb_link = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(movie_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(genres, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(movie_avg_ratings, 4 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_ratings_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_ratings_dist, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_tags_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_tags_dist, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(movie_imdb_link, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(movie_tmdb_link, 10 + __off, 1, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(movie_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(genres, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeFloat(movie_avg_ratings, 4 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_ratings_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_ratings_dist, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_tags_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_tags_dist, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(movie_imdb_link, 9 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(movie_tmdb_link, 10 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.movie_id = null;
    } else {
    this.movie_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.genres = null;
    } else {
    this.genres = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.movie_avg_ratings = null;
    } else {
    this.movie_avg_ratings = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.movie_ratings_cnt = null;
    } else {
    this.movie_ratings_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.movie_ratings_dist = null;
    } else {
    this.movie_ratings_dist = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.movie_tags_cnt = null;
    } else {
    this.movie_tags_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.movie_tags_dist = null;
    } else {
    this.movie_tags_dist = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.movie_imdb_link = null;
    } else {
    this.movie_imdb_link = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.movie_tmdb_link = null;
    } else {
    this.movie_tmdb_link = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.genres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genres);
    }
    if (null == this.movie_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.movie_avg_ratings);
    }
    if (null == this.movie_ratings_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_ratings_cnt);
    }
    if (null == this.movie_ratings_dist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_ratings_dist);
    }
    if (null == this.movie_tags_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_tags_cnt);
    }
    if (null == this.movie_tags_dist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_tags_dist);
    }
    if (null == this.movie_imdb_link) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_imdb_link);
    }
    if (null == this.movie_tmdb_link) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_tmdb_link);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.genres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genres);
    }
    if (null == this.movie_avg_ratings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.movie_avg_ratings);
    }
    if (null == this.movie_ratings_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_ratings_cnt);
    }
    if (null == this.movie_ratings_dist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_ratings_dist);
    }
    if (null == this.movie_tags_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_tags_cnt);
    }
    if (null == this.movie_tags_dist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_tags_dist);
    }
    if (null == this.movie_imdb_link) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_imdb_link);
    }
    if (null == this.movie_tmdb_link) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_tmdb_link);
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
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genres==null?"null":genres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_avg_ratings==null?"null":"" + movie_avg_ratings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_ratings_cnt==null?"null":"" + movie_ratings_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_ratings_dist==null?"null":movie_ratings_dist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tags_cnt==null?"null":"" + movie_tags_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tags_dist==null?"null":movie_tags_dist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_imdb_link==null?"null":movie_imdb_link, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tmdb_link==null?"null":movie_tmdb_link, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genres==null?"null":genres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_avg_ratings==null?"null":"" + movie_avg_ratings, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_ratings_cnt==null?"null":"" + movie_ratings_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_ratings_dist==null?"null":movie_ratings_dist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tags_cnt==null?"null":"" + movie_tags_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tags_dist==null?"null":movie_tags_dist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_imdb_link==null?"null":movie_imdb_link, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_tmdb_link==null?"null":movie_tmdb_link, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.genres = null; } else {
      this.genres = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_avg_ratings = null; } else {
      this.movie_avg_ratings = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_ratings_cnt = null; } else {
      this.movie_ratings_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_ratings_dist = null; } else {
      this.movie_ratings_dist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_tags_cnt = null; } else {
      this.movie_tags_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_tags_dist = null; } else {
      this.movie_tags_dist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_imdb_link = null; } else {
      this.movie_imdb_link = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_tmdb_link = null; } else {
      this.movie_tmdb_link = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.genres = null; } else {
      this.genres = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_avg_ratings = null; } else {
      this.movie_avg_ratings = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_ratings_cnt = null; } else {
      this.movie_ratings_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_ratings_dist = null; } else {
      this.movie_ratings_dist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_tags_cnt = null; } else {
      this.movie_tags_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_tags_dist = null; } else {
      this.movie_tags_dist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_imdb_link = null; } else {
      this.movie_imdb_link = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_tmdb_link = null; } else {
      this.movie_tmdb_link = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_movies_top10_rating o = (ads_movies_top10_rating) super.clone();
    return o;
  }

  public void clone0(ads_movies_top10_rating o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("genres", this.genres);
    __sqoop$field_map.put("movie_avg_ratings", this.movie_avg_ratings);
    __sqoop$field_map.put("movie_ratings_cnt", this.movie_ratings_cnt);
    __sqoop$field_map.put("movie_ratings_dist", this.movie_ratings_dist);
    __sqoop$field_map.put("movie_tags_cnt", this.movie_tags_cnt);
    __sqoop$field_map.put("movie_tags_dist", this.movie_tags_dist);
    __sqoop$field_map.put("movie_imdb_link", this.movie_imdb_link);
    __sqoop$field_map.put("movie_tmdb_link", this.movie_tmdb_link);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("genres", this.genres);
    __sqoop$field_map.put("movie_avg_ratings", this.movie_avg_ratings);
    __sqoop$field_map.put("movie_ratings_cnt", this.movie_ratings_cnt);
    __sqoop$field_map.put("movie_ratings_dist", this.movie_ratings_dist);
    __sqoop$field_map.put("movie_tags_cnt", this.movie_tags_cnt);
    __sqoop$field_map.put("movie_tags_dist", this.movie_tags_dist);
    __sqoop$field_map.put("movie_imdb_link", this.movie_imdb_link);
    __sqoop$field_map.put("movie_tmdb_link", this.movie_tmdb_link);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
