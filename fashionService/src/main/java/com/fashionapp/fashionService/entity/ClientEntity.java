package com.fashionapp.fashionService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_Data")
public class ClientEntity 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "client_email", nullable = false)
    private String clientEmail;

    @Column(name = "client_phone_number")
    private String clientPhoneNumber;
    
    @Lob // Use @Lob annotation for large objects like images
    @Column(name="client_photo", columnDefinition="LONGBLOB")
    private byte[] clientPhoto;
    
    @Lob // Use @Lob annotation for large objects like images
    @Column(name="client_photo_flag1", columnDefinition="LONGBLOB")
    private byte[] clientPhotoFlag1;
    
    @Lob // Use @Lob annotation for large objects like images
    @Column(name="client_photo_flag2", columnDefinition="LONGBLOB")
    private byte[] clientPhotoFlag2;
    
    @Lob // Use @Lob annotation for large objects like images
    @Column(name="client_photo_flag3", columnDefinition="LONGBLOB")
    private byte[] clientPhotoFlag3;
    
    @Lob // Use @Lob annotation for large objects like images
    @Column(name="client_photo_flag4", columnDefinition="LONGBLOB")
    private byte[] clientPhotoFlag4;

    @Column(name = "client_address")
    private String clientAddress;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}

	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}

	public byte[] getClientPhoto() {
		return clientPhoto;
	}

	public void setClientPhoto(byte[] clientPhoto) {
		this.clientPhoto = clientPhoto;
	}

	public byte[] getClientPhotoFlag1() {
		return clientPhotoFlag1;
	}

	public void setClientPhotoFlag1(byte[] clientPhotoFlag1) {
		this.clientPhotoFlag1 = clientPhotoFlag1;
	}

	public byte[] getClientPhotoFlag2() {
		return clientPhotoFlag2;
	}

	public void setClientPhotoFlag2(byte[] clientPhotoFlag2) {
		this.clientPhotoFlag2 = clientPhotoFlag2;
	}

	public byte[] getClientPhotoFlag3() {
		return clientPhotoFlag3;
	}

	public void setClientPhotoFlag3(byte[] clientPhotoFlag3) {
		this.clientPhotoFlag3 = clientPhotoFlag3;
	}

	public byte[] getClientPhotoFlag4() {
		return clientPhotoFlag4;
	}

	public void setClientPhotoFlag4(byte[] clientPhotoFlag4) {
		this.clientPhotoFlag4 = clientPhotoFlag4;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
}
