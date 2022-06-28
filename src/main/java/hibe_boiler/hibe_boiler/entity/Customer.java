package hibe_boiler.hibe_boiler.entity;
import java.time.LocalDate; 

import jakarta.persistence.*;
public class Customer {
	@Entity
	@Table(name = "customer")
	public class CustomerEntity {
		@Id
		private Integer customerId;
		private String customerName;
		private LocalDate dateOfBirth;
		private String address;
		@Column(name = "phoneNumber")
		private Long contactNumber;
	  //getters & setters
	}
}
