package hibe_boiler.hibe_boiler.entity;
import java.time.LocalDate; 
import jakarta.persistence.*;

@Entity
@Table(name = "customer") 
public class Customer { 
		@Id
		private Integer customerId;
		private String customerName;
		private LocalDate dateOfBirth;
		private String address;
		@Column(name = "phoneNumber")
		private Long contactNumber;
		
	  //getters & setters
        
		public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setAddress(String address) {
            this.address = address; 
        }

}
