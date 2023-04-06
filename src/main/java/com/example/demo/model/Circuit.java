package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "circuits")
public class Circuit {

  @Id
  @GeneratedValue
  private Long circuitId;
  private String circuitRef;
  private String name;
  private String location;
  private String country;
  private double lat;
  private double lng;
  private String url;

  public Circuit() {
  }

  public long getCircuitId() {
    return circuitId;
  }

  public void setCircuitId(long circuitId) {
    this.circuitId = circuitId;
  }


  public String getCircuitRef() {
    return circuitRef;
  }

  public void setCircuitRef(String circuitRef) {
    this.circuitRef = circuitRef;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }


  public double getLng() {
    return lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
