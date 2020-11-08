package com.app.springboot.emobileconnect.model;


import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "EMConnection")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class EMConnection implements Serializable{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long requestId;

	@Column
	private String status;

	@Column
	private PersonalDetails personalDetails;

	@Column
	private SupportiveDocs supportiveDocs;

	}
