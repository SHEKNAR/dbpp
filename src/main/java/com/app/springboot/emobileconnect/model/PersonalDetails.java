package com.app.springboot.emobileconnect.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "PersonalDetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class PersonalDetails implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column
	private String AdharNo;

	@Column
	private String name;

	@Column
	private String age;

	@Column
	private String fatherName;

}
