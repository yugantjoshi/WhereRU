package com.yugantjoshi.whereru.api;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class WhereRUAPI{

	@SerializedName("building_id")
	private String buildingId;

	@SerializedName("campus_code")
	private String campusCode;

	@SerializedName("offices")
	private List<String> offices;

	@SerializedName("description")
	private String description;

	@SerializedName("building_code")
	private String buildingCode;

	@SerializedName("location")
	private Location location;

	@SerializedName("campus_name")
	private String campusName;

	@SerializedName("title")
	private String title;

	@SerializedName("building_number")
	private String buildingNumber;

	@SerializedName("cid")
	private String cid;

	public void setBuildingId(String buildingId){
		this.buildingId = buildingId;
	}

	public String getBuildingId(){
		return buildingId;
	}

	public void setCampusCode(String campusCode){
		this.campusCode = campusCode;
	}

	public String getCampusCode(){
		return campusCode;
	}

	public void setOffices(List<String> offices){
		this.offices = offices;
	}

	public List<String> getOffices(){
		return offices;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setBuildingCode(String buildingCode){
		this.buildingCode = buildingCode;
	}

	public String getBuildingCode(){
		return buildingCode;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setCampusName(String campusName){
		this.campusName = campusName;
	}

	public String getCampusName(){
		return campusName;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBuildingNumber(String buildingNumber){
		this.buildingNumber = buildingNumber;
	}

	public String getBuildingNumber(){
		return buildingNumber;
	}

	public void setCid(String cid){
		this.cid = cid;
	}

	public String getCid(){
		return cid;
	}

	@Override
 	public String toString(){
		return 
			"WhereRUAPI{" + 
			"building_id = '" + buildingId + '\'' + 
			",campus_code = '" + campusCode + '\'' + 
			",offices = '" + offices + '\'' + 
			",description = '" + description + '\'' + 
			",building_code = '" + buildingCode + '\'' + 
			",location = '" + location + '\'' + 
			",campus_name = '" + campusName + '\'' + 
			",title = '" + title + '\'' + 
			",building_number = '" + buildingNumber + '\'' + 
			",cid = '" + cid + '\'' + 
			"}";
		}
}