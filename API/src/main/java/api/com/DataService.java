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
	 private List<Symptom> symptom=new ArrayList<Symptom>();
	 private List<SubSymptom> subsymptom=new ArrayList<SubSymptom>();
	 private List<Patient> patient=new ArrayList<Patient>();
	 
	 private static DataService ourInstance = new DataService();
	 public static DataService getInstance() 
	 { 
	        return ourInstance;
	 }
	 public CheckDoctors doctor(Doctors doctors) 
	 {
		 int newID=doctor.size()+1;
		 doctors.setDoctorid(newID);
	 	 CheckDoctors insert=new CheckDoctors();
	 	 doctor.add(doctors);
	 	 insert.setData(doctor);
	 	 insert.setMessage("success");
	 	 insert.setStatus("200");
		 return insert;
	 }

	  public CheckDoctors getdoctors() 
	  {
		  
		    
		    List<EducationDetail> educationdetail=new ArrayList<EducationDetail>();
		    EducationDetail ed=new EducationDetail();
		    ed.setDegree("MDS Periodotology");
		    ed.setInstitute("xtz");
		    ed.setPassingyear("1998");
		    educationdetail.add(ed);
		    
		    List<Package> packages=new ArrayList<Package>();
		    Package p1=new Package();
		    p1.setId(1);
		    p1.setName("plan of 2000rs");
		    packages.add(p1);
		    
		    List<ClinicId> clinicid=new ArrayList<ClinicId>();
		    ClinicId clinicids=new ClinicId();
		    clinicids.setId(0);
		    clinicid.add(clinicids);
		    
		    int newID=doctor.size()+1;
		  	
		  	 Doctors doctors1=new Doctors();
			 doctors1.setDoctorid(newID);
			 doctors1.setFirstname("Viral");;
			 doctors1.setMiddlename("Rahul");
			 doctors1.setLastname("Vyas");
			 doctors1.setDob("12/02/1995");
			 doctors1.setGender("Male");
			 doctors1.setBloodgroup("B+");
			 doctors1.setProfilpicurl("abc.jpg");
			 doctors1.setMobile("0978972891");
			 doctors1.setEmail("abc@gmail.com");
			 doctors1.setCurrentaddress("xyz");
			 doctors1.setCurrentcityid(0);
			 doctors1.setCurrentstateid(0);
			 doctors1.setCurrentcountryid(0);
			 doctors1.setPermaddress("xyz");
			 doctors1.setPermcityid(0);
			 doctors1.setPermstateid(0);
			 doctors1.setPermcountryid(0);
			 doctors1.setCurrentzip("400064");
			 doctors1.setPermzip("400064");
			 doctors1.setEducationdetails(educationdetail);
			 doctors1.setRegistrationno("121");
			 doctors1.setIdentitytype(0);
			 doctors1.setIdentitynumber("12");
			 doctors1.setIdentityproof("asjja");
			 doctors1.setPackages(packages);
			 doctors1.setCreateby(0);
			 doctors1.setCreateipaddress("79.65.1871.12");
			 doctors1.setClinicid(clinicid);
			 doctors1.setConsultationcharge(0);
			 doctors1.setSpecialityid(0);
			 doctors1.setOverview("Doctor is a practising general physician.Vyas is an esteemed member of indian society"
			 		+ "of gastroenterology");
			 
			 
			 doctor.add(doctors1);
		  	 CheckDoctors insert=new CheckDoctors();
		     insert.setData(doctor);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  public CheckDoctors getdoctorbyid(int id)
	  {
	        for (Doctors doctors : doctor) 
	        {
	            if (doctors.getDoctorid()==id) {
	            	
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
		  	 int newID=clinic.size()+1;
			 clinics.setClinicid(newID);
		 	 CheckClinic insert=new CheckClinic();
		 	 clinic.add(clinics);
		 	 insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  
	  
	   public CheckClinic getcliniclist() 
	   {
		   	 int newID=clinic.size()+1;  
		     Clinic clinic1=new Clinic();
		  	 clinic1.setClinicid(newID);
		  	 clinic1.setDoctorid(1);
		  	 clinic1.setClinicname("shreenathji");
		  	 clinic1.setRegistrationno("1234");
		  	 clinic1.setEmailid("jinal@gmail.com");
		  	 clinic1.setPhoneNumber("1234567890");
		  	 clinic1.setClinictype("dental");
		  	 clinic1.setYearsofpractice("12years");
		  	 clinic1.setAssociatedfacilites("abx");
			  	clinic1.setCurrentaddress("xyz");
			  	clinic1.setCurrentcityid(0);
			  	clinic1.setCurrentstateid(0);
			  	clinic1.setCurrentcountryid(0);
			  	clinic1.setPermaddress("xyz");
			 clinic1.setPermcityid(0);
			 clinic1.setPermstateid(0);
			 clinic1.setPermcountryid(0);
			 clinic1.setCurrentzip("400064");
			 clinic1.setPermzip("400064");
		  	 
		  	 clinic.add(clinic1);
		   	 CheckClinic insert=new CheckClinic();
		     insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		}
	 
	   public CheckClinic getClinicById(int id)
		 {
		        for (Clinic register : clinic) {
		            if (register.getClinicid()==id) 
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
	   
	   public CheckDoctors UpdateDoctordetails(int id,Doctors docs)
		 {
			 for (Doctors doc : doctor) { 
		            if(doc.getDoctorid()==id) 
		            {
		            	 doctor.add(docs);
			             CheckDoctors insert=new CheckDoctors();
			   		     insert.setData(doctor);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		     return insert;
			       }
			 }
			return null;
		 }
	   
	   public CheckDoctors GetDeleteDoctors(int id) 
		 {
		        for (Doctors doctors : doctor) {
		            if (doctors.getDoctorid()==id)
		            {
						 doctor.remove(doctors);
						 CheckDoctors insert=new CheckDoctors();
			   		     insert.setData(doctor);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		     return insert;
					 }
		            else
		            {
		            	 CheckDoctors insert=new CheckDoctors();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   		     return insert;
		            }
		        }
				return null;
		       
		    }
		 public CheckClinic getdeleteclinic(int id) 
		 {
		        for (Clinic clinics : clinic) {
		            if (clinics.getClinicid()==id)
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
		 public CheckClinic updateclinicdetails(int id,Clinic cds)
		 {
			 for (Clinic cd : clinic) { 
		            if (cd.getClinicid()==id) 
		            {
		            	 clinic.add(cds);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(clinic);
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
			 List<SubSymptom> sub=new ArrayList<SubSymptom>();
			 List<SubSymptoms> subs=new ArrayList<SubSymptoms>();
			 List<Report> rs=new ArrayList<Report>();
			 SubSymptoms ss=new SubSymptoms();
			 ss.setSubsymptomname("fever");
			 subs.add(ss);
			 SubSymptom s=new SubSymptom();
			 s.setSymptomid(1);
			 s.setSubsymptoms(subs);
			 sub.add(s);
			 
			 Report r=new Report();
			 r.setReportimgurl("abc.jpg");
			 rs.add(r);
			 
			 Appointment appointments=new Appointment();
		  	 appointments.setClinicid("1");
		  	 appointments.setDoctorid("1");
		  	 appointments.setPatientid("1");
		  	 appointments.setConsultationid("1");
		  	 appointments.setDate("12/01/2022");
		  	 appointments.setTimeslot("13:00 pm");
		  	 appointments.setAppointmentstatus("pending");
		  	 appointments.setConsultationstatus("approved");
		  	 appointments.setConsultationnumber("123");
		  	 appointments.setSymptoms(sub);
		  	 appointments.setIntensity("low");
		  	 appointments.setReportimg(rs);
		  	 appointments.setConsultationmode("online");
		  	 appointments.setDaysofsymptoms("1 week");
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
	    	obj.setPatientid(52562);
	    	obj.setPatientname("Hetasvi Bhatt");
	    	obj.setCondition("severe");
	    	obj.setDescription("consulted 2 days ago");
	    	obj.setDate("12/21/2021");
	    	obj.setTime("9:30 am to 11:00 am");
	    	obj.setAction("Follow up");
	    	ClosedAppointment obj1=null;
	    	obj1=new ClosedAppointment();
	    	
	    	obj1.setPatientid(52562);
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
     	 
		 public CheckClosedAppointment updateappointmentrequest(int patientid,String patientname,String description, String action,String data,String time)
		 {
			 for (ClosedAppointment closeappoint : closedappointment) { 
		            if (closeappoint.getPatientid()==patientid) 
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
		 public CheckClosedAppointment GetClosedAppointmentById(int id)
		 {
		        for (ClosedAppointment register : closedappointment) {
		            if (register.getPatientid()==id) 
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
		 public CheckPatient AddPatient(Patient patients) 
	     {
	    	 int newID=patient.size()+1;
			 patients.setPatientid(newID);
		 	 CheckPatient insert=new CheckPatient();
		 	 patient.add(patients);
		 	 insert.setData(patient);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		 }
		 
		 public CheckPatient GetPatient() 
	     {
	    	 int newID=patient.size()+1;
	    	 Patient patients=new Patient();
			 patients.setPatientid(newID);
			 patients.setName("abc");
			 patients.setGender("xyz");
			 patients.setBloodgroup("ab+");
			 patients.setPhone("27637869170");
			 patients.setAddress("duuj");
			 patients.setEmailid("abc@gmail.com");
			 patients.setStateid(1);
			 patients.setCountryid(1);
			 patients.setCityid(1);
			 patients.setzipcode(40064);
		 	 CheckPatient insert=new CheckPatient();
		 	 patient.add(patients);
		 	 insert.setData(patient);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		 }
		 
		 public CheckSymptom addsymptom(Symptom symptoms)
		  {
			 
			 int newID=symptom.size()+1;
			 symptoms.setSymptomid(newID);
		 	 CheckSymptom insert=new CheckSymptom();
		 	 symptom.add(symptoms);
		 	 insert.setData(symptom);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		  }
		 
		 public CheckSymptom getSymptom()
		 {
			 int newID=symptom.size()+1;
			 Symptom s=new Symptom();
			 s.setSymptomid(newID);
			 s.setSymptomname("fever");
			 symptom.add(s);
			 CheckSymptom insert=new CheckSymptom();
		 	 insert.setData(symptom);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		 }
		 
		 public CheckSubSymptoms subsymptom(SubSymptom subsymptoms)
		  { 
			 int newID=subsymptom.size()+1;
			 subsymptoms.setSymptomid(newID);
		 	 CheckSubSymptoms insert=new CheckSubSymptoms();
		 	 subsymptom.add(subsymptoms);
		 	 insert.setData(subsymptom);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
		  }
		 public CheckSubSymptoms getsubsymptoms()
		 {
			 int newID=subsymptom.size()+1;
		  	 List<SubSymptoms> sub=new ArrayList<SubSymptoms>();
		  	 SubSymptoms subs=new SubSymptoms();
		  	 subs.setSubsymptomname("avc");
		  	 sub.add(subs);
		  	 SubSymptom s=new SubSymptom();
		  	 s.setSymptomid(newID);
		  	 s.setSubsymptoms(sub);
		  	 subsymptom.add(s);
		 	 CheckSubSymptoms insert=new CheckSubSymptoms();
		 	 insert.setData(subsymptom);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert; 
		 }
		 
		
     
}
