package com.fameden.bean.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * This hibernate bean is responsible of storing the user detailed information.
 * This is a child table of fameden user table.
 * This table will store details like alternative email Id, user's full Name,
 * user's interests etc.
 */

@Entity
@Table(name = "FAMEDEN_USER_INFO")
public class FamedenUserInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "famden_user_info_id")
	private int famedenUserInfoId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "famdenExternalUserId")
	private FamedenUserBean famedenUserBean;
	private String fullName;
	private String alternateEmailAddress;
	private String userInterests;
	private Date dob;
	private String profileImageURL;
	private FameDenMeter famedenMeter;
	private SocialNetworkDetail socialNetworkDetail;
	private List<Address> userAddress;

	public int getFamedenUserInfoId() {
		return famedenUserInfoId;
	}

	public void setFamedenUserInfoId(int famedenUserInfoId) {
		this.famedenUserInfoId = famedenUserInfoId;
	}

	public FamedenUserBean getFamedenUserBean() {
		return famedenUserBean;
	}

	public void setFamedenUserBean(FamedenUserBean famedenUserBean) {
		this.famedenUserBean = famedenUserBean;
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

	public FameDenMeter getFamedenMeter() {
		return famedenMeter;
	}

	public void setFamedenMeter(FameDenMeter famedenMeter) {
		this.famedenMeter = famedenMeter;
	}

	public SocialNetworkDetail getSocialNetworkDetail() {
		return socialNetworkDetail;
	}

	public void setSocialNetworkDetail(SocialNetworkDetail socialNetworkDetail) {
		this.socialNetworkDetail = socialNetworkDetail;
	}

	public List<Address> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}

}
