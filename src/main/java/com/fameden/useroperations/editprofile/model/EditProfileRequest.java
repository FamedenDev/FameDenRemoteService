package com.fameden.useroperations.editprofile.model;

import java.util.Date;
import java.util.List;

import com.fameden.common.model.CommonRequestAttributes;
import com.fameden.useroperations.viewprofile.model.FameDenMeterDetails;
import com.fameden.useroperations.viewprofile.model.FameDenUserAddress;

public class EditProfileRequest extends CommonRequestAttributes {

	private String famedenUserId;
	private String emailAddress;
	private String mobileNumber;
	private String fullName;
	private String alternateEmailAddress;
	private String userInterests;
	private Date dob;
	private String profileImageURL;
	private FameDenMeterDetails famdenUserMeterDetails;
	private List<FameDenUserAddress> addressList;
	private SocialNetworkDetail socialNetworkDetails;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}

	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}

	public String getUserInterests() {
		return userInterests;
	}

	public void setUserInterests(String userInterests) {
		this.userInterests = userInterests;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getProfileImageURL() {
		return profileImageURL;
	}

	public void setProfileImageURL(String profileImageURL) {
		this.profileImageURL = profileImageURL;
	}

	public FameDenMeterDetails getFamdenUserMeterDetails() {
		return famdenUserMeterDetails;
	}

	public void setFamdenUserMeterDetails(
			FameDenMeterDetails famdenUserMeterDetails) {
		this.famdenUserMeterDetails = famdenUserMeterDetails;
	}

	public List<FameDenUserAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<FameDenUserAddress> addressList) {
		this.addressList = addressList;
	}

	public SocialNetworkDetail getSocialNetworkDetails() {
		return socialNetworkDetails;
	}

	public void setSocialNetworkDetails(SocialNetworkDetail socialNetworkDetails) {
		this.socialNetworkDetails = socialNetworkDetails;
	}

	public String getFamedenUserId() {
		return famedenUserId;
	}

	public void setFamedenUserId(String famedenUserId) {
		this.famedenUserId = famedenUserId;
	}

}
