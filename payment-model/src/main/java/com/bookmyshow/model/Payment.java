package com.bookmyshow.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity(name = "PAYMENT")
public class Payment {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private Long paymentId;
    
	@OneToOne(fetch = FetchType.LAZY)
	private Booking booking;
    
	@OneToOne(fetch = FetchType.LAZY)
    private User user;

	@Column(name = "method")
    private String method;
	
	@Column(name = "amount")
    private BigDecimal amount;
	
    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

	@Override
	public int hashCode() {
		return Objects.hash(paymentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return paymentId == other.paymentId;
	}
}
