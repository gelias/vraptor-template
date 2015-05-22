package cc.juris.model;

import static cc.juris.model.type.EnvironmentCreationStatusType.getByStatus;
import static javax.persistence.FetchType.LAZY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

import cc.juris.model.type.EnvironmentCreationStatusType;
import cc.juris.model.type.EnvironmentType;


@Entity(name = "customer")
public class Customer implements ModelEntity {

	@Id
	@Column(name = "codigo")
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "cli_ativo")
	@Type(type = "me.umov.auth.model.type.BooleanCharacterType")
	private Boolean active;
	
//	@ManyToOne(fetch = LAZY)
//	@JoinColumn(name = "customer")
//	private AppVersion process;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDomain() {
		return name;
	}

	public void setDomain(String domain) {
		this.name = domain;
	}
}
