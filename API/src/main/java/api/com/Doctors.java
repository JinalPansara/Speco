package api.com;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Doctors 
{
	@JsonProperty("DoctorId")
	private int doctorid;
	@JsonProperty("FirstName")
	private String firstname;
	@JsonProperty("MiddleName")
	private String middlename;
	@JsonProperty("LastName")
	private String lastname;
	@JsonProperty("DOB")
	private String dob;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("BloodGroup")
	private String bloodgroup;
	@JsonProperty("ProfilePicUrl")
	private String profilpicurl;
	@JsonProperty("Mobile")
	private String mobile;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("CurrentAddress")
	private String currentaddress;
	@JsonProperty("CurrentCityId")
	private int currentcityid;
	@JsonProperty("CurrentStateId")
	private int currentstateid;
	@JsonProperty("CurrentCountryId")
	private int currentcountryid;
	@JsonProperty("PermAddress")
	private String permaddress;
	@JsonProperty("PermCityId")
	private int permcityid;
	@JsonProperty("PermStateId")
	private int permstateid;
	@JsonProperty("PermCountryId")
	private int permcountryid;
	@JsonProperty("CurrentZip")
	private String currentzip;
	@JsonProperty("PermZip")
	private String permzip;
	@JsonProperty("EducationDetail")
	private List<EducationDetail> educationdetails;
	@JsonProperty("RegistrationNo")
	private String registrationno;
	@JsonProperty("IdentityType")
	private int identitytype;
	@JsonProperty("IdentityNumber")
	private String identitynumber;
	@JsonProperty("IdentityProof")
	private String identityproof;
	@JsonProperty("Package")
	private List<Package> packages;
	@JsonProperty("CreateBy")
	private int createby;
	@JsonProperty("CreateDate")
	private String createdate;
	@JsonProperty("CreateIpAddress")
	private String createipaddress;
	@JsonProperty("UpdateBy")
	private int updateby;
	@JsonProperty("UpdateDate")
	private String updatedate;
	@JsonProperty("UpdateIpAddress")
	private String updateipaddress;
	@JsonProperty("IsActive")
	private int isactive;
	@JsonProperty("ClinicId")
	private List<ClinicId> clinicid;
	@JsonProperty("ConsultationCharge")
	private int consultationcharge;
	@JsonProperty("SpecialityId")
	private int specialityid;
	@JsonProperty("OverView")
	private String overview;
	
	
	public Doctors()
	{
		
	}
	

		
	public String getRegistrationno() {
		return registrationno;
	}
	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}
	
	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getProfilpicurl() {
		return profilpicurl;
	}

	public void setProfilpicurl(String profilpicurl) {
		this.profilpicurl = profilpicurl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrentaddress() {
		return currentaddress;
	}

	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}

	public int getCurrentcityid() {
		return currentcityid;
	}

	public void setCurrentcityid(int currentcityid) {
		this.currentcityid = currentcityid;
	}

	public String getPermaddress() {
		return permaddress;
	}

	public void setPermaddress(String permaddress) {
		this.permaddress = permaddress;
	}

	public int getPermcityid() {
		return permcityid;
	}

	public void setPermcityid(int permcityid) {
		this.permcityid = permcityid;
	}

	public int getPermstateid() {
		return permstateid;
	}

	public void setPermstateid(int permstateid) {
		this.permstateid = permstateid;
	}

	public int getPermcountryid() {
		return permcountryid;
	}

	public void setPermcountryid(int permcountryid) {
		this.permcountryid = permcountryid;
	}

	public String getCurrentzip() {
		return currentzip;
	}

	public void setCurrentzip(String currentzip) {
		this.currentzip = currentzip;
	}

	public String getPermzip() {
		return permzip;
	}

	public void setPermzip(String permzip) {
		this.permzip = permzip;
	}


	public int getIdentitytype() {
		return identitytype;
	}

	public void setIdentitytype(int identitytype) {
		this.identitytype = identitytype;
	}

	public String getIdentitynumber() {
		return identitynumber;
	}

	public void setIdentitynumber(String identitynumber) {
		this.identitynumber = identitynumber;
	}

	public String getIdentityproof() {
		return identityproof;
	}

	public void setIdentityproof(String identityproof) {
		this.identityproof = identityproof;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	public int getCreateby() {
		return createby;
	}

	public void setCreateby(int createby) {
		this.createby = createby;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getCreateipaddress() {
		return createipaddress;
	}

	public void setCreateipaddress(String createipaddress) {
		this.createipaddress = createipaddress;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getUpdateipaddress() {
		return updateipaddress;
	}

	public void setUpdateipaddress(String updateipaddress) {
		this.updateipaddress = updateipaddress;
	}

	public int getIsactive() {
		return isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public List<ClinicId> getClinicid() {
		return clinicid;
	}

	public void setClinicid(List<ClinicId> clinicid) {
		this.clinicid = clinicid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getCurrentstateid() {
		return currentstateid;
	}

	public void setCurrentstateid(int currentstateid) {
		this.currentstateid = currentstateid;
	}

	public int getCurrentcountryid() {
		return currentcountryid;
	}

	public void setCurrentcountryid(int currentcountryid) {
		this.currentcountryid = currentcountryid;
	}

	
	public int getUpdateby() {
		return updateby;
	}

	public void setUpdateby(int updateby) {
		this.updateby = updateby;
	}

	public int getConsultationcharge() {
		return consultationcharge;
	}

	public void setConsultationcharge(int consultationcharge) {
		this.consultationcharge = consultationcharge;
	}

	public int getSpecialityid() {
		return specialityid;
	}

	public void setSpecialityid(int specialityid) {
		this.specialityid = specialityid;
	}



	public int getDoctorid() {
		return doctorid;
	}



	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public List<EducationDetail> getEducationdetails() {
		return educationdetails;
	}



	public void setEducationdetails(List<EducationDetail> educationdetails) {
		this.educationdetails = educationdetails;
	}



	public String getOverview() {
		return overview;
	}



	public void setOverview(String overview) {
		this.overview = overview;
	}
	

}
