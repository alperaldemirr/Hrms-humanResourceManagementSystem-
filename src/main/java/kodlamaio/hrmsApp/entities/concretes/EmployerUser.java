package kodlamaio.hrmsApp.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employess")
public class EmployerUser{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	int employeeId;
	
	@Column(name="company_name")
    String companyName;
	
	@Column(name="company_website")
    String webSiteAddress;
	
	@Column(name="home_phone")	
    String phone;
	
	@Column(name="mail")
    String mail;
    
    @Column(name="password")
    String password;
    
    @Column(name="password_repeat")
    String passwordRepeat;
}
