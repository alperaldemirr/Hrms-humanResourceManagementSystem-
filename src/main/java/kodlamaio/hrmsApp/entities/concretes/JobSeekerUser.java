package kodlamaio.hrmsApp.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
public class JobSeekerUser{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_seeker_id")
	int jobSeekerId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="nationality_id")
	String nationalityId;
	
	@Column(name="birth_date")
	Date birthDate;
	
	@Column(name="mail")
    String eMail;
    
    @Column(name="password")
    String password;
    
    @Column(name="password_repeat")
    String passwordRepeat;	
	
}
