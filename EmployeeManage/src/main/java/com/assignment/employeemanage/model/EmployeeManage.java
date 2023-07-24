package com.assignment.employeemanage.model;


import org.springframework.data.mongodb.core.mapping.Document;



@Document(collation ="employee")
public class EmployeeManage {

	
	    private String id;
	    private String employeeName;
	    private String phoneNumber;
	    private String email;
	    private String reportsTo;
	    private String profileImage;
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getReportsTo() {
			return reportsTo;
		}
		public void setReportsTo(String reportsTo) {
			this.reportsTo = reportsTo;
		}
		public String getProfileImage() {
			return profileImage;
		}
		public void setProfileImage(String profileImage) {
			this.profileImage = profileImage;
		}
		public EmployeeManage(String employeeName, String phoneNumber, String email, String reportsTo,
				String profileImage) {
			super();
			this.employeeName = employeeName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.reportsTo = reportsTo;
			this.profileImage = profileImage;
		}
		public EmployeeManage() {
			
		}
		@Override
		public String toString() {
			return "EmployeeManage [id=" + id + ", employeeName=" + employeeName + ", phoneNumber=" + phoneNumber
					+ ", email=" + email + ", reportsTo=" + reportsTo + ", profileImage=" + profileImage + "]";
		}
		
	    
}
