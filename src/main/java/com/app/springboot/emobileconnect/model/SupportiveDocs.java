package com.app.springboot.emobileconnect.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "SupportiveDocs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class SupportiveDocs implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long requestId;
	@Column
	private String Adharcard;
	@Column
	private String pancard;
	
	

}
