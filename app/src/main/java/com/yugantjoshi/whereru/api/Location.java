package com.yugantjoshi.whereru.api;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("street")
	private String street;

	@SerializedName("additional")
	private String additional;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("name")
	private String name;

	@SerializedName("state_abbr")
	private String stateAbbr;

	@SerializedName("state")
	private String state;

	@SerializedName("postal_code")
	private String postalCode;

	@SerializedName("country_abbr")
	private String countryAbbr;

	@SerializedName("longitude")
	private String longitude;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setAdditional(String additional){
		this.additional = additional;
	}

	public String getAdditional(){
		return additional;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStateAbbr(String stateAbbr){
		this.stateAbbr = stateAbbr;
	}

	public String getStateAbbr(){
		return stateAbbr;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCountryAbbr(String countryAbbr){
		this.countryAbbr = countryAbbr;
	}

	public String getCountryAbbr(){
		return countryAbbr;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",street = '" + street + '\'' + 
			",additional = '" + additional + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",name = '" + name + '\'' + 
			",state_abbr = '" + stateAbbr + '\'' + 
			",state = '" + state + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",country_abbr = '" + countryAbbr + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}