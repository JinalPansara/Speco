package api.com;

import java.util.ArrayList;
import java.util.List;

public class DataService 
{
	 private List<Doctors> doctor = new ArrayList<Doctors>();
	 private List<Clinic> clinic = new ArrayList<Clinic>();
	 private List<Enquiry> enquiry=new ArrayList<Enquiry>();
	 private List<Appointment> appointment=new ArrayList<Appointment>();
	 private List<ClosedAppointment> closedappointment=new ArrayList<ClosedAppointment>();
	 private List<CancelledAppointment> cancelledappointment=new ArrayList<CancelledAppointment>();
	 
	 private static DataService ourInstance = new DataService();
	 public static DataService getInstance() 
	 {
	        return ourInstance;
	 }
	 public CheckDoctors doctor(Doctors doctors) 
	 {
		 Doctors doctors1=new Doctors();
		 doctors1.setId("1");
		 doctors1.setName("Dr Viral Vyas");
		 doctors1.setRegistrationno("94561902");
		 doctors1.setPractice("M.D,Physician");
		 doctors1.setInstitute("Medical Institute");
		 doctors1.setExperience("12yrs");
		 doctors1.setQualification("M.B.B.S");
		 doctors1.setPhone("123456789");
		 doctors1.setProcurement("2018");
		 doctors1.setOverview("Doctor with great experience");
		 doctors1.setStatus("today");
		 doctors1.setImg("image2.jpg");
		 doctors1.setOngoingpatient("12+");
		 doctors1.setTreatedpatient("13+");
		 doctor.add(doctors1);
		 String newID=Integer.toString(doctor.size()+1);
		 doctors.setId(newID);
	 	 CheckDoctors insert=new CheckDoctors();
	 	 doctor.add(doctors);
	 	 insert.setData(doctor);
	 	 insert.setMessage("success");
	 	 insert.setStatus("200");
		 return insert;
	 }

	  public CheckDoctors getdoctors() 
	  {
		     Doctors doctors1=new Doctors();
			 doctors1.setId("1");
			 doctors1.setName("Dr Viral Vyas");
			 doctors1.setRegistrationno("94561902");
			 doctors1.setPractice("M.D,Physician");
			 doctors1.setInstitute("Medical Institute");
			 doctors1.setExperience("12yrs");
			 doctors1.setQualification("M.B.B.S");
			 doctors1.setPhone("123456789");
			 doctors1.setProcurement("2018");
			 doctors1.setOverview("Doctor with great experience");
			 doctors1.setStatus("today");
			 doctors1.setImg("image2.jpg");
			 doctors1.setOngoingpatient("12+");
			 doctors1.setTreatedpatient("13+");
			 doctor.add(doctors1);
		  	 CheckDoctors insert=new CheckDoctors();
		     insert.setData(doctor);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  public CheckDoctors getdoctorbyid(String id)
	  {
	        for (Doctors doctors : doctor) 
	        {
	            if (doctors.getId().equals(id)) {
	            	
	            	 List<Doctors> getbyid=new ArrayList<Doctors>();
		             getbyid.add(doctors);
		             CheckDoctors insert=new CheckDoctors();
		   		     insert.setData(getbyid);
		   		 	 insert.setMessage("success");
		   		 	 insert.setStatus("200");
		   			 return insert;
		         }
	            else
	            {
	            	 CheckDoctors insert=new CheckDoctors();
		   		     insert.setData(null);
		   		 	 insert.setMessage("No such data in lists");
		   		 	 insert.setStatus("404");
		   			 return insert;
	            }
	               
	        }

	        return null;
	  }
	  
	  public CheckClinic clinic(Clinic clinics)
	  {
		 
		  	 
		  	 String newID=Integer.toString(clinic.size()+1);
			 clinics.setId(newID);
		 	 CheckClinic insert=new CheckClinic();
		 	 clinic.add(clinics);
		 	 insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  
	  
	   public CheckClinic getcliniclist() 
	   {
		     Clinic clinic1=new Clinic();
		  	 clinic1.setId("1");
		  	 clinic1.setClinicname("shreenathji");
		  	 clinic1.setRegistrationno("1234");
		  	 clinic1.setLocation("malad");
		  	 clinic1.setAadharcard("123456789");
		  	 clinic1.setEmailid("jinal@gmail.com");
		  	 clinic1.setQualificationname("MBA");
		  	 clinic1.setPhoneNumber("1234567890");
		  	 clinic1.setInstitutename("abc");
		  	 clinic1.setClinictype("dental");
		  	 clinic1.setProcurementyear("2020");
		  	 clinic1.setYearsofpractice("12years");
		  	 clinic1.setAssociatedfacilites("abx");
		  	 clinic1.setClinicregistration("link");
		  	 clinic1.setDocname("abc");
		  	 clinic.add(clinic1);
		   	 CheckClinic insert=new CheckClinic();
		     insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	   }
	 
	   public CheckClinic getClinicById(String id)
		 {
		        for (Clinic register : clinic) {
		            if (register.getId().equals(id)) 
		            {
		                
		            	 List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(register);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   			 return insert;
		              }
		            else
		            {
		            	 CheckClinic insert=new CheckClinic();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   			 return insert;	
		            }
		        }
	
		        return null;
		 }
		 public CheckClinic getdeleteclinic(String id) 
		 {
		        for (Clinic clinics : clinic) {
		            if (clinics.getId().equals(id))
		            {
						 clinic.remove(clinics);
						 CheckClinic insert=new CheckClinic();
			   		     insert.setData(clinic);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		     return insert;
					 }
		            else
		            {
		            	 CheckClinic insert=new CheckClinic();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   		     return insert;
		            }
		        }
				return null;
		       
		    }
		 public CheckClinic updateclinicdetails(String id,String clinicname, String registrationno, String location
				    ,String aadharcardno,String emailid,String qualificationname,String phoneno,String institutename,
				    String clinictype,String procurementyear,String yearsofpractice,String associatedfacilites,
				    String clinicregistration,String docname)
		 {
			 for (Clinic cd : clinic) { 
		            if (cd.getId().equals(id)) 
		            {
		            	cd.setClinicname(clinicname);
		            	cd.setRegistrationno(registrationno);
		            	cd.setLocation(location);
				        cd.setAadharcard(aadharcardno);
				        cd.setEmailid(emailid);
				        cd.setQualificationname(qualificationname);
				        cd.setPhoneNumber(phoneno);
				        cd.setInstitutename(institutename);
				        cd.setClinictype(clinictype);
				        cd.setProcurementyear(procurementyear);
				        cd.setYearsofpractice(yearsofpractice);
				        cd.setAssociatedfacilites(associatedfacilites);
				        cd.setClinicregistration(clinicregistration);
				        cd.setDocname(docname);
				        
				         List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(cd);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
			                  }
			 }
			return null;
		 }
		 
		 public CheckEnquiry AddEnquiry(Enquiry enquirys)
		  {
			 CheckEnquiry insert=new CheckEnquiry();
		 	 enquiry.add(enquirys);
		 	 insert.setData(enquiry);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		  }
		 
		 public CheckAppointment AddAppointment(Appointment appointments)
		 {
			 CheckAppointment addappointment=new CheckAppointment();
			 appointment.add(appointments);
			 addappointment.setData(appointment);
			 addappointment.setMessage("success");
			 addappointment.setStatus("200");
			 return addappointment;
		 }
		 
		 public CheckAppointment GetAppointment() 
		  {
			     
				 Appointment appointments=new Appointment();
			  	 appointments.setPatientid("123");
			  	 appointments.setPatientname("Vyas");
			  	 appointments.setDescription("xyz");
			  	 appointments.setCondition("severe");
			  	 appointments.setAction("consult");
			  	 appointment.add(appointments);
			  	 CheckAppointment view=new CheckAppointment();
			     view.setData(appointment);
			 	 view.setMessage("success");
			 	 view.setStatus("200");
				 return view;
		  }
		 
		 public CheckClosedAppointment GetClosedAppointment() 
	     {
	    	CheckClosedAppointment closed=new CheckClosedAppointment();
	    	
	    	ClosedAppointment obj=null;
	    	obj=new ClosedAppointment();
	    	obj.setPatientid("52562");
	    	obj.setPatientname("Hetasvi Bhatt");
	    	obj.setCondition("severe");
	    	obj.setDescription("consulted 2 days ago");
	    	obj.setDate("12/21/2021");
	    	obj.setTime("9:30 am to 11:00 am");
	    	obj.setAction("Follow up");
	    	
	    	ClosedAppointment obj1=null;
	    	obj1=new ClosedAppointment();
	    	
	    	obj1.setPatientid("52562");
	    	obj1.setPatientname("Vikas sharma");
	    	obj1.setDescription("follow up is scheduled on");
	    	obj1.setDate("01/02/2022");
	    	obj1.setCondition("severe");
	    	obj1.setTime("9:30 am to 11:00 am");
	    	obj1.setAction("followup");
	    	obj1.setAction("consult");
	    	
	    	
	    	closedappointment.add(obj);
	    	closedappointment.add(obj1);
	    	
	    	closed.setMessage("Success");
	    	closed.setStatus("200");
	    	closed.setData(closedappointment);
	    	return closed;
				
		 }
     	 
		 public CheckClosedAppointment updateappointmentrequest(String patientid,String patientname,String description, String action,String data,String time)
		 {
			 for (ClosedAppointment closeappoint : closedappointment) { 
		            if (closeappoint.getPatientid().equals(patientid)) 
		            {
		            	closeappoint.setPatientid(patientid);
		            	closeappoint.setPatientname(patientname);
		            	closeappoint.setDescription(description);
		            	closeappoint.setDate(data);
		            	closeappoint.setTime(time);
		            	closeappoint.setAction(action);
				         List<ClosedAppointment> getbyid=new ArrayList<ClosedAppointment>();
			             getbyid.add(closeappoint);
			             CheckClosedAppointment insert=new CheckClosedAppointment();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
			         }
			 }
			return null;
		 }
		 public CheckClosedAppointment GetClosedAppointmentById(String id)
		 {
		        for (ClosedAppointment register : closedappointment) {
		            if (register.getPatientid().equals(id)) 
		            {
		                
		            	 List<ClosedAppointment> getbyid=new ArrayList<ClosedAppointment>();
			             getbyid.add(register);
			             CheckClosedAppointment insert=new CheckClosedAppointment();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   			 return insert;
		              }
		            else
		            {
		            	 CheckClosedAppointment insert=new CheckClosedAppointment();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   			 return insert;	
		            }
		        }
				return null;
		 }	 
		 
		 public CheckCancelledAppointment GetCancelledAppointmentById(String id)
		 {
		        for (CancelledAppointment register : cancelledappointment) {
		            if (register.getPatientid().equals(id)) 
		            {
		                
		            	 List<CancelledAppointment> getbyid=new ArrayList<CancelledAppointment>();
			             getbyid.add(register);
			             CheckCancelledAppointment insert=new CheckCancelledAppointment();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   			 return insert;
		              }
		            else
		            {
		            	 CheckCancelledAppointment insert=new CheckCancelledAppointment();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   			 return insert;	
		            }
		        }
				return null;
		 }
		 
		 
		 public CheckCancelledAppointment GetCancelledAppointment() 
	     {
	    	CheckCancelledAppointment cancelled=new CheckCancelledAppointment();
	    	
	    	CancelledAppointment obj=null;
	    	obj=new CancelledAppointment();
	    	obj.setPatientid("52562");
	    	obj.setPatientname("Hetasvi Bhatt");
	    	obj.setReason("xyz");
	    	
	    	CancelledAppointment obj1=null;
	    	obj1=new CancelledAppointment();
	    	
	    	obj1.setPatientid("52562");
	    	obj1.setPatientname("Vikas sharma");
	    	obj1.setReason("abcd");
	    	
	    	cancelledappointment.add(obj);
	    	cancelledappointment.add(obj1);
	    	
	    	cancelled.setMessage("Success");
	    	cancelled.setStatus("200");
	    	cancelled.setData(cancelledappointment);
	    	return cancelled;
				
		 }
     	
		 
		 
		 public CheckCancelledAppointment UpdateRejectAppointment(String patientid,String patientname,String reason)
		 {
			 for (CancelledAppointment cancelappoint : cancelledappointment) { 
		            if (cancelappoint.getPatientid().equals(patientid)) 
		            {
		            	cancelappoint.setPatientid(patientid);
		            	cancelappoint.setPatientname(patientname);
		            	cancelappoint.setReason(reason);
		            	 List<CancelledAppointment> getbyid=new ArrayList<CancelledAppointment>();
			             getbyid.add(cancelappoint);
			             CheckCancelledAppointment insert=new CheckCancelledAppointment();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
			         }
			 }
			return null;
		 }
		 public CheckPatient GetPatient() 
	     {
	    	CheckPatient patient=new CheckPatient();
	    	List<Patient> viewpatient=new ArrayList<Patient>();
	    	List<FollowUps> followup=new ArrayList<FollowUps>();
	    	List<EMRGenerated> emr=new ArrayList<EMRGenerated>();
	    	List<PatientUploadData> patientuploaddata=new ArrayList<PatientUploadData>();
	    	
	    	FollowUps followups=new FollowUps();
	    	followups.setDate("6th aug");
	    	followups.setTime("4:00 pm to 6:00 pm");
	    	followups.setMode("Online consultation");
	    	followup.add(followups);
	    	
	    	EMRGenerated emrs=new EMRGenerated();
	    	emrs.setEmr("image1.jpg");
	    	emrs.setConsultedto("Dr john D'souza");
	    	emrs.setConcern("headache,fever");
	    	emrs.setAppointmentdate("12 oct 2021");
	    	EMRGenerated emrs1=new EMRGenerated();
	    	emrs1.setEmr("image1.jpg");
	    	emrs1.setConsultedto("Dr john D'souza");
	    	emrs1.setConcern("headache,fever");
	    	emrs1.setAppointmentdate("12 oct 2021");
	    	emr.add(emrs);
	    	emr.add(emrs1);
	    	
	    	PatientUploadData patientuploaddatas=new PatientUploadData();
	    	patientuploaddatas.setFileuploaded("image2.jpg");
	    	patientuploaddatas.setConsultedto("Dr vyas");
	    	patientuploaddatas.setConcern("fever");
	    	patientuploaddatas.setAppointmentdate("12 oct 2021");
	    	patientuploaddata.add(patientuploaddatas);
	    	
	    	Patient obj=null;
	    	obj=new Patient();
	    	obj.setPatientid("52562");
	    	obj.setPatientname("Hetasvi Bhatt");
	    	obj.setSex("female");
	    	obj.setAge("23 years");
	    	obj.setFollowup(followup);
	    	obj.setEmrgenerated(emr);
	    	obj.setPatientuploadeddata(patientuploaddata);
	    	obj.setSurgeries("xyz");
	    	obj.setWearabledata("abc");
	    	obj.setPersonalhistory("abc");
	    	obj.setFamilyhistory("def");
	    	obj.setSocioeconomicstatus("xyz");
	    	obj.setAllergies("rashes");
	    	obj.setDiseases("xyz");
	    	obj.setSurgeries("abc");
	    	obj.setContact("1233556657");
	    	
	    	
	    	viewpatient.add(obj);
	    	
	    	patient.setMessage("Success");
	    	patient.setStatus("200");
	    	patient.setData(viewpatient);
	    	return patient;
				
		 }
     
}
