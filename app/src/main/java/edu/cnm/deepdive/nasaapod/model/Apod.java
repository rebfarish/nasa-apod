package edu.cnm.deepdive.nasaapod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class Apod implements Parcelable {

  public static final Creator CREATOR = new Creator();

  @Expose
  private Date date;

  @Expose
  private String title;

  @Expose
  private String explanation;

  @Expose
  private String copyright;

  @Expose
  private String url;

  @Expose
  @SerializedName("media_type")
  private String mediaType;

  @Expose
  @SerializedName("hdurl")
  private String hdUrl;

  @Expose
  @SerializedName("service_version")
  private String serviceVersion;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public String getHdUrl() {
    return hdUrl;
  }

  public void setHdUrl(String hdUrl) {
    this.hdUrl = hdUrl;
  }

  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
//TODO write fields to dest
  }

  private static class Creator implements Parcelable.Creator<Apod> {

    @Override
    public Apod createFromParcel(Parcel source) {
      //TODO create APod object and populate its fields from source
      return null;
    }

    @Override
    public Apod[] newArray(int size) {
      return new Apod[size];
    }
  }
}
