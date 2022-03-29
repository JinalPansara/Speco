package api.com;



import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



 @Path("/")
public class BaseClassApi 
{
	private DataService dataService = DataService.getInstance();
	
	
	@POST
	@Path("Doctor")
    @Consumes(MediaType.APPLICATION_JSON)
 	@Produces(MediaType.APPLICATION_JSON)
 	public Response getdoctors(Doctors doctor)
 	{
 		return Response.status(200).entity(dataService.doctor(doctor)).build();
 	}
	
	 @GET 
	 @Path("Doctor")
     @Produces(MediaType.APPLICATION_JSON)
     public CheckDoctors getdoctors() {
         return dataService.getdoctors();
     }
     
	 @GET
	 @Path("Doctor/{doctorid}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getdoctor(@PathParam("doctorid") int id) {
	        CheckDoctors doctor = dataService.getdoctorbyid(id);
	        if (doctor == null) {
	        	 return Response
	   			      .status(Response.Status.NOT_FOUND).entity(dataService.getdoctorbyid(id))
	   			      .build();
	        } else {
	            return Response.ok()
	                           .entity(doctor)
	                           .build();
	        }
	    }
	 
	 @PUT
     @Path("Doctor/{doctorid}")
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     public Response UpdateDoctorById(@PathParam("doctorid")int id,Doctors doc) {
         CheckDoctors cur = dataService.getdoctorbyid(id);
         if (cur == null) {
             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getdoctorbyid(id))
                       .build();
         } else {
        	 return Response.ok().entity(dataService.UpdateDoctordetails(id, doc)).build();
         }
     }
	 
	 @DELETE
     @Path("Doctor/{doctorid}")
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     public Response getdetail(@PathParam("doctorid") int id) {
         CheckDoctors del = dataService.GetDeleteDoctors(id);
         if (del == null) {
             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getdoctorbyid(id))
                       .build();
         } else {
        	 
             return Response.ok()
                            .entity(del)
                            .build();
         }
     }
     
	
	 @GET
	 @Path("Onboarding")
	 @Produces(MediaType.APPLICATION_JSON)
	 public CheckOnboarding getonboardingesponse() {
		 
		 	CheckOnboarding onboard=new CheckOnboarding();
		 	
		try
		{
			List<Onboarding> onboarding = new ArrayList<Onboarding>();
			
			Onboarding obj=null;
			obj=new Onboarding();
			obj.setTitle("Visual EMR  previous data");
			obj.setDescription("Get access to patient EMR from their previous consultation");
			obj.setImage("preview.jpg");
			
			Onboarding obj1=null;
			obj1=new Onboarding();
			obj1.setTitle("Manage appointments easily");
			obj1.setDescription("smart assistants prioritize appointments,facilitate consultation and schedule followups");
			obj1.setImage("images.png");
			
			Onboarding obj2=null;
			obj2=new Onboarding();
			obj2.setTitle("Seamless Data migration");
			obj2.setDescription("Access via app and web");
			obj2.setImage("preview.jpg");
			
			Onboarding obj4=null;
			obj4=new Onboarding();
			obj4.setTitle("Automate invoice and billing");
			obj4.setDescription("Leave your operation to us");
			obj4.setImage("image3.jpg");
			
			onboarding.add(obj);
			onboarding.add(obj1);
			onboarding.add(obj2);
			onboarding.add(obj4);
			
			onboard.setMessage("Success");
			onboard.setStatus("200");
			onboard.setData(onboarding);
			
			return onboard;
		}
		catch(Exception e)
		{
			onboard.setMessage(e.getMessage());
			onboard.setData(null);
			onboard.setStatus("400");
		}
		return onboard;
			 
		}
	 
	    @POST
		@Path("Clinic")
	    @Consumes(MediaType.APPLICATION_JSON)
	 	@Produces(MediaType.APPLICATION_JSON)
	 	
	     public CheckClinic getclinics() {
	         return dataService.getcliniclist();
	     }
	     
	     @GET
		 @Path("Clinic/{clinicid}")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response getclinicbyid(@PathParam("clinicid") int id) {
		        CheckClinic clinic = dataService.getClinicById(id);
		        if (clinic == null) {
		            return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
		                      .build();
		        } else {
		            return Response.ok()
		                           .entity(clinic)
		                           .build();
		        }
		    }
	     
	     @PUT
	     @Path("Clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getCustomer(@PathParam("clinicid") int id,Clinic cs) {
	         CheckClinic cur = dataService.getClinicById(id);
	         if (cur == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 return Response.ok()
	                            .entity(dataService.updateclinicdetails(id, cs))
	                            .build();
	         }
	     }
	     
	     @DELETE
	     @Path("Clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getdetails(@PathParam("clinicid")int id) {
	         CheckClinic del = dataService.getdeleteclinic(id);
	         if (del == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 
	             return Response.ok()
	                            .entity(del)
	                            .build();
	         }
	     }
	     
	     @GET
		 @Path("PaymentPlans")
		 @Produces(MediaType.APPLICATION_JSON)
		 public CheckPaymentplans getpaymentplansesponse() 
	     {
	    	CheckPaymentplans plans=new CheckPaymentplans();
	    	List<Paymentplans> plan=new ArrayList<Paymentplans>();
	    	List<PaymentPlansFeatures> feature=new ArrayList<PaymentPlansFeatures>();
	    	
	    	PaymentPlansFeatures f=new PaymentPlansFeatures();
	    	f.setFeatureno("1");
	    	f.setFeaturedescription("Advance Calendar-Manages appointment");
	    	PaymentPlansFeatures f1=new PaymentPlansFeatures();
	    	f1.setFeatureno("2");
	    	f1.setFeaturedescription("Professional billing");
	    	PaymentPlansFeatures f2=new PaymentPlansFeatures();
	    	f2.setFeatureno("3");
	    	f2.setFeaturedescription("Share records with patient");
	    	feature.add(f);
	    	feature.add(f1);
	    	feature.add(f2);
	    	
	    	
	    	Paymentplans obj=null;
	    	obj=new Paymentplans();
	    	
	    	obj.setTitle("Basic plan rs999/month");
	    	obj.setImage("image2.jpg");
	    	obj.setDescription(feature);
	    	
	    	Paymentplans obj1=null;
	    	obj1=new Paymentplans();
	    	
	    	obj1.setTitle("Business plan rs1499/month");
	    	obj1.setImage("image2.jpg");
	    	obj1.setDescription(feature);
	    	
	    	plan.add(obj);
	    	plan.add(obj1);
	    	
	    	plans.setMessage("Success");
	    	plans.setStatus("200");
	    	plans.setData(plan);
	    	
	    	
			return plans;
				
		 }
		 
	     @GET
		 @Path("FAQs")
		 @Produces("application/vnd.speco-v1+json")
		 public CheckFAQs getFAQsResponse() 
	     {
	    	CheckFAQs faqs=new CheckFAQs();
	    	List<FAQs> faq=new ArrayList<FAQs>();
	    	
	    	FAQs obj=null;
	    	obj=new FAQs();
	    	obj.setTopic("Topic 01");
	    	obj.setQuestion("What does speco do");
	    	obj.setAnswer("speco");
	    	
	    	FAQs obj1=null;
	    	obj1=new FAQs();
	    	
	    	obj1.setTopic("Topic 02");
	    	obj1.setQuestion("How does online consultation work");
	    	obj1.setAnswer("speco");
	    	
	    	faq.add(obj);
	    	faq.add(obj1);
	    	
	    	faqs.setMessage("Success");
	    	faqs.setStatus("200");
	    	faqs.setData(faq);
	    	
	    	
			return faqs;
				
		 }
	     
	     @GET
		 @Path("FAQs")
		 @Produces("application/vnd.speco-v2+json")
		 public CheckFAQs1 getFAQsResponse1() 
	     {
	    	CheckFAQs1 faqs=new CheckFAQs1();
	    	List<FAQs1> faq=new ArrayList<FAQs1>();
	    	
	    	FAQs1 obj=null;
	    	obj=new FAQs1();
	    	obj.setTopic("Topic 01");
	    	obj.setQuestion("What does speco do");
	    	obj.setAnswer("hey");
	    	obj.setWhy("yaa");
	    	
	    	FAQs1 obj1=null;
	    	obj1=new FAQs1();
	    	
	    	obj1.setTopic("Topic 02");
	    	obj1.setQuestion("How does online consultation work");
	    	obj1.setAnswer("speco");
	    	
	    	faq.add(obj);
	    	faq.add(obj1);
	    	
	    	faqs.setMessage("Success");
	    	faqs.setStatus("200");
	    	faqs.setData(faq);
	    	
	    	
			return faqs;
				
		 }
	     
	     	@POST
			@Path("Enquiry")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response GetEnquiryResponse(Enquiry enquiry)
		 	{
		    	return Response.status(200).entity(dataService.AddEnquiry(enquiry)).build();
		 	}
		    
	     	@POST
			@Path("Appointment")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response AddAppointment(Appointment appointment)
		 	{
		    	return Response.status(200).entity(dataService.AddAppointment(appointment)).build();
		 	}
	     	
	     	 @GET
			 @Path("Appointment")
		     @Produces(MediaType.APPLICATION_JSON)
		     public CheckAppointment getappointments() {
		         return dataService.GetAppointment();
		     }
	     	
	     	 
	     	 @GET
			 @Path("ClosedAppointment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckClosedAppointment GetClosedAppointment() 
		     {
		    	return dataService.GetClosedAppointment();
					
			 }
	     	 
	     	 
	     	 @PUT
		     @Path("ClosedAppointment/{patientid}")
		     @Produces(MediaType.APPLICATION_JSON)
		     @Consumes(MediaType.APPLICATION_JSON)
		     public Response UpdateClosedAppointment(@PathParam("patientid") int id,ClosedAppointment ca) {
		         CheckClosedAppointment cca = dataService.GetClosedAppointmentById(id);
		         if (cca == null) {
		             return Response.status(Response.Status.NOT_FOUND).entity(dataService.GetClosedAppointmentById(id))
		                       .build();
		         } else {
		        	 return Response.ok()
		                            .entity(dataService.updateappointmentrequest(id,ca.getPatientname(),ca.getDescription(),ca.getDate(),ca.getTime(),ca.getAction()))
		                            .build();
		         }
		     }
	     	 
	     	 @GET
			 @Path("CancelledAppointment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckCancelledAppointment GetCancelledAppointment() 
		     {
		    	return dataService.GetCancelledAppointment();
			 }
	     	 
	     	 @PUT
		     @Path("CancelledAppointment/{patientid}")
		     @Produces(MediaType.APPLICATION_JSON)
		     @Consumes(MediaType.APPLICATION_JSON)
		     public Response UpdateCancelledAppointment(@PathParam("patientid") String id,CancelledAppointment ca) {
		         CheckCancelledAppointment cca = dataService.GetCancelledAppointmentById(id);
		         if (cca == null) {
		             return Response.status(Response.Status.NOT_FOUND).entity(dataService.GetCancelledAppointmentById(id))
		                       .build();
		         } else {
		        	 return Response.ok()
		                            .entity(dataService.UpdateRejectAppointment(id,ca.getPatientname(),ca.getReason()))
		                            .build();
		         }
		     }
	     	 
	     	 @POST
			 @Path("Patient")
			 @Produces(MediaType.APPLICATION_JSON)
			 public Response AddPatient(Patient patients) 
		     {
		    	return Response.status(200).entity(dataService.AddPatient(patients)).build();					
			 }
	     	 
	     	 @GET
			 @Path("Patient")
			 @Produces(MediaType.APPLICATION_JSON)
			 public Response GetPatient() 
		     {
		    	return Response.status(200).entity(dataService.GetPatient()).build();					
			 }
	     	 
	     	 
	     	 @GET
			 @Path("Payment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckPayment GetPaymentResponse() 
		     {
		    	CheckPayment payments=new CheckPayment();
		    	List<Payment> payment=new ArrayList<Payment>();
		    	List<DetailOfCharges> detail=new ArrayList<DetailOfCharges>();
		    	DetailOfCharges charges=new DetailOfCharges();
		    	charges.setDetail("Visiting charges");
		    	charges.setUnitcost("600");
		    	charges.setQuantity("1");
		    	charges.setDiscount("100");
		    	charges.setCharges("1600");
		    	detail.add(charges);
		    	
		    	Payment obj=null;
		    	obj=new Payment();
		    	obj.setPatientid("52562");
		    	obj.setPatientname("Hetasvi Bhatt");
		    	obj.setDate("12 oct 2021");
		    	obj.setTime("11:00 am to 12:00 pm");
		    	obj.setCharges("3890 rs");
		    	obj.setDetails(detail);
		    	
		    	
		    	
		    	payment.add(obj);
		    	
		    	payments.setMessage("Success");
		    	payments.setStatus("200");
		    	payments.setData(payment);
		    	
		    	
				return payments;
					
			 }
	     	 
	     	 @GET
			 @Path("Consultation")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckConsultation GetConsultationResponse() 
		     {
		    	CheckConsultation emrs=new CheckConsultation();
		    	List<Consultation> emr=new ArrayList<Consultation>();
		    	
		    	List<Symptom> symptoms=new ArrayList<Symptom>();
		    	List<Findings> findings=new ArrayList<Findings>();
		    	List<Diagnosis> diagnosis=new ArrayList<Diagnosis>();
		    	List<FollowUps> followup=new ArrayList<FollowUps>();
		    	List<Prescription> prescription=new ArrayList<Prescription>();
		    	List<EMRGenerated> emrgenerated=new ArrayList<EMRGenerated>();
		    	List<InvoiceGenerated> invoicegenerated=new ArrayList<InvoiceGenerated>();
		    	List<WearableData> wearabledata=new ArrayList<WearableData>();
		    	List<PatientUploadData> patientuploaddata=new ArrayList<PatientUploadData>();
		    	List<PersonalDetail> personaldetail=new ArrayList<PersonalDetail>();
		    	List<PatientIllnessSummary> patientillnesssumary=new ArrayList<PatientIllnessSummary>();
		    	List<Examination> examination=new ArrayList<Examination>();
		    	List<Others> other=new ArrayList<Others>();
		    	List<Visit> visits=new ArrayList<Visit>();
		    	
		    	Symptom symptom1=new Symptom();
		    	symptom1.setSymptomname("Cough from 3 days,severe");
		    	Symptom symptom2=new Symptom();
		    	symptom2.setSymptomname("vomiting since 2 days");
		    	Symptom symptom3=new Symptom();
		    	symptom3.setSymptomname("cant eat properly");
		    	
		    	symptoms.add(symptom1);
		    	symptoms.add(symptom2);
		    	symptoms.add(symptom3);
		    	
		    	Findings finding1=new Findings();
		    	finding1.setFindings("urine output normal");
		    	Findings finding2=new Findings();
		    	finding2.setFindings("red throat");
		    	
		    	findings.add(finding1);
		    	findings.add(finding2);
		    	
		    	Diagnosis diagnosis1=new Diagnosis();
		    	diagnosis1.setDiagnosis("LRTI lower repository tract infection");
		    	Diagnosis diagnosis2=new Diagnosis();
		    	diagnosis2.setDiagnosis("viral infection");
		    	
		    	diagnosis.add(diagnosis1);
		    	diagnosis.add(diagnosis2);
		    	
		    	FollowUps followup1=new FollowUps();
		    	followup1.setDate("6th nov 2021");
		    	followup1.setTime("4pm to 6pm");
		    	followup1.setMode("online consulation");
		    	
		    	FollowUps followup2=new FollowUps();
		    	followup2.setDate("6th nov 2021");
		    	followup2.setTime("4pm to 6pm");
		    	followup2.setMode("online consulation");
		    	
		    	followup.add(followup1);
		    	followup.add(followup2);
		    	
		    	Prescription prescription1=new Prescription();
		    	prescription1.setMedicinename("Domstal");
		    	prescription1.setTimesaday("3 times a day");
		    	
		    	Prescription prescription2=new Prescription();
		    	prescription2.setMedicinename("Ecosprin");
		    	prescription2.setTimesaday("4tabs X times a day");
		    	
		    	prescription.add(prescription1);
		    	prescription.add(prescription2);
		    	
		    	EMRGenerated emrgenerated1=new EMRGenerated();
		    	emrgenerated1.setEmr("image1.jpg");
		    	emrgenerated1.setConsultedto("DR. John dsouza");
		    	emrgenerated1.setConcern("Headache,fever");
		    	emrgenerated1.setAppointmentdate("12 oct 2021");
		    	
		    	emrgenerated.add(emrgenerated1);
		    	
		    	InvoiceGenerated invoicegenerated1=new InvoiceGenerated();
		    	invoicegenerated1.setInvoice("image1.jpg");
		    	invoicegenerated1.setGeneratedby("Dr John souza");
		    	invoicegenerated1.setDate("12 oct 2021");
		    	invoicegenerated.add(invoicegenerated1);
		    	
		    	WearableData wearabledata1=new WearableData();
		    	wearabledata1.setWearabledata("img1.jpg");
		    	wearabledata1.setAppointmentdate("12/02/2021");
		    	wearabledata1.setConsultedto("Dr Abc");
		    	wearabledata1.setConcern("abc");
		    	wearabledata.add(wearabledata1);
		    	
		    	PatientUploadData patientuploaddata1=new PatientUploadData();
		    	patientuploaddata1.setFileuploaded("img1.jpg");
		    	patientuploaddata1.setAppointmentdate("12/02/2021");
		    	patientuploaddata1.setConcern("abc");
		    	patientuploaddata1.setConsultedto("Dr xyz");
		    	patientuploaddata.add(patientuploaddata1);
		    	
		    	PersonalDetail personaldetail1=new PersonalDetail();
		    	personaldetail1.setPersonalhistory("abcd");
		    	personaldetail1.setFamilyhistory("xyzj");
		    	personaldetail1.setSocioeconomicstatus("abcd");
		    	personaldetail.add(personaldetail1);
		    	
		    	PatientIllnessSummary patientillnesssummary1=new PatientIllnessSummary();
		    	patientillnesssummary1.setChiefcomplaint("dujhqk");
		    	patientillnesssummary1.setHistoryofpresentillness("asjs");
		    	patientillnesssummary1.setHistoryofpastillness("dccukhw");
		    	patientillnesssumary.add(patientillnesssummary1);
		    	
		    	Examination examination1=new Examination();
		    	examination1.setGeneralphysicalexamination("aduwas");
		    	examination1.setLocalexamination("sdhcukqka");
		    	examination1.setSystematicexamination("guqyasui");
		    	examination.add(examination1);
		    	
		    	Others other1=new Others();
		    	other1.setInvoices("img1.jpg");
		    	other1.setMedications("asudukj");
		    	other.add(other1);
		    	
		    	Visit visit1=new Visit();
		    	visit1.setVisit("01");
		    	visit1.setDate("12/02/201");
		    	visit1.setTime("12:00 pm to 1:00 pm");
		    	visits.add(visit1);
		    	
		    
		    	
		    	Consultation obj=null;
		    	obj=new Consultation();
		    	obj.setPatientname("Hetasvi Bhatt");
		    	obj.setConsultedto("Dr viral vyas");
		    	obj.setGender("Female");
		    	obj.setAge("23 years");
		    	obj.setSymptoms(symptoms);
		    	obj.setFinding(findings);
		    	obj.setDiagnosis(diagnosis);
		    	obj.setInstruction("careful");
		    	obj.setFollowup(followup);
		    	obj.setPrescription(prescription);
		    	obj.setEmrgenerated(emrgenerated);
		    	obj.setInvoicegenerated(invoicegenerated);
		    	obj.setConcern("severe");
		    	obj.setWearabledata(wearabledata);
		    	obj.setAllergies("Rashes");
		    	obj.setCurrentmedications("abc");
		    	obj.setDiseases("abc");
		    	obj.setSurgeries("xyz");
		    	obj.setPersonaldetail(personaldetail);
		    	obj.setPatientillnesssummary(patientillnesssumary);
		    	obj.setExamination(examination);
		    	obj.setOthers(other);
		    	obj.setPatientid("5332");
		    	obj.setVisits(visits);
		    	obj.setPhone("12738979263");
		    	obj.setConsultationfees("792");
		    	obj.setPatientuploaddata(patientuploaddata);
		    	
		    	Consultation obj1=null;
		    	obj1=new Consultation();
		    	obj1.setPatientname("Hetasvi Bhatt");
		    	obj1.setConsultedto("Dr viral vyas");
		    	obj1.setGender("Female");
		    	obj1.setAge("23 years");
		    	obj1.setSymptoms(symptoms);
		    	obj1.setFinding(findings);
		    	obj1.setDiagnosis(diagnosis);
		    	obj1.setInstruction("careful");
		    	obj1.setFollowup(followup);
		    	obj1.setPrescription(prescription);
		    	obj1.setEmrgenerated(emrgenerated);
		    	obj1.setInvoicegenerated(invoicegenerated);
		    	obj1.setConcern("severe");
		    	obj1.setWearabledata(wearabledata);
		    	obj1.setAllergies("Rashes");
		    	obj1.setCurrentmedications("abc");
		    	obj1.setDiseases("abc");
		    	obj1.setSurgeries("xyz");
		    	obj1.setPersonaldetail(personaldetail);
		    	obj1.setPatientillnesssummary(patientillnesssumary);
		    	obj1.setExamination(examination);
		    	obj1.setOthers(other);
		    	obj1.setPatientid("5332");
		    	obj1.setVisits(visits);
		    	obj1.setPhone("12738979263");
		    	obj1.setConsultationfees("792");
		    	
		    	
		    	emr.add(obj);
		    	emr.add(obj1);
		    	
		    	emrs.setMessage("Success");
		    	emrs.setStatus("200");
		    	emrs.setData(emr);
		    	
		    	
				return emrs;
					
			 }
	     	 
	     	
	     	@POST
			@Path("Symptom")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response AddSymptoms(Symptom symptoms)
		 	{
		    	return Response.status(200).entity(dataService.addsymptom(symptoms)).build();
		 	}
	     	
	     	@POST
			@Path("Consultation")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response AddConsultation(Consultation consultations)
		 	{
		    	return Response.status(200).entity(dataService.addconsultation(consultations)).build();
		 	}
	     	
	     	@GET
			@Path("Symptom")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response GetSymptoms()
		 	{
		    	return Response.status(200).entity(dataService.getSymptom()).build();
		 	}
	     	
	     	@POST
			@Path("SubSymptoms")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response AddSubSymptoms(SubSymptom subsymptom)
		 	{
		    	return Response.status(200).entity(dataService.subsymptom(subsymptom)).build();
		 	}
	     	
	     	@GET
			@Path("SubSymptoms")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response GetSubSymptoms()
		 	{
		    	return Response.status(200).entity(dataService.getsubsymptoms()).build();
		 	}
	     	
	     	@GET
	     	@Path("Dashboard")
	     	@Produces(MediaType.APPLICATION_JSON)
	     	public CheckDashboard getdashboardresponse()
	     	{
	     		CheckDashboard dashboarddetails=new CheckDashboard();
	     		try {
	     			
	     			List<TodayWeekMonthYear> todayweekmonthyear=new ArrayList<TodayWeekMonthYear>();
	     			TodayWeekMonthYear today=new TodayWeekMonthYear();
	     			today.setTotalpatients("20");
	     			today.setIncome("281763");
	     			today.setPatientstreated("12");
	     			today.setCancelledappointment("20");
	     			todayweekmonthyear.add(today);
	     			List<Dashboard> dashboard=new ArrayList<Dashboard>(); 
	     		    Dashboard details=null;
	     		    details=new Dashboard();
	     		    details.setPatientid("1");
	     		    details.setCondition("critical");
	     		    details.setSeverity("high");
	     		    details.setPatientname("raj");
	     		    details.setDoctor("raj vyas");
	     		    details.setCondition("offline");
	     		    details.setDate("12/03/2022");
	     		    details.setCharges("rs2000/-");
	     		    details.setStatus("pending");
	     		    details.setToday(todayweekmonthyear);
	     		    details.setWeek(todayweekmonthyear);
	     		    details.setMonth(todayweekmonthyear);
	     		    details.setYear(todayweekmonthyear);
	     		    dashboard.add(details);
	     		    dashboarddetails.setData(dashboard);
	     		    dashboarddetails.setMessage("Success");
	     		    dashboarddetails.setStatus("200");
	     			return dashboarddetails;
	     		}
	     		catch(Exception e)
	     		{
	     		dashboarddetails.setMessage(e.getMessage());
	     		dashboarddetails.setData(null);
	     		dashboarddetails.setStatus("400");
	     		}
				return dashboarddetails;
	     
				
	     	    }
	     	
	     	
}
