package ma.ismo.crjj.efm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etablissement")
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_etab;

	@Column
	private String Nom_Etab;

	@Column
	private String Adresse_etab;

	@Column
	private String Tel_etab;

	public Etablissement() {
		super();
	}

	public Etablissement(int code_etab, String nom_Etab, String adresse_etab, String tel_etab) {
		super();
		this.code_etab = code_etab;
		Nom_Etab = nom_Etab;
		Adresse_etab = adresse_etab;
		Tel_etab = tel_etab;
	}

	public int getCode_etab() {
		return code_etab;
	}

	public void setCode_etab(int code_etab) {
		this.code_etab = code_etab;
	}

	public String getNom_Etab() {
		return Nom_Etab;
	}

	public void setNom_Etab(String nom_Etab) {
		Nom_Etab = nom_Etab;
	}

	public String getAdresse_etab() {
		return Adresse_etab;
	}

	public void setAdresse_etab(String adresse_etab) {
		Adresse_etab = adresse_etab;
	}

	public String getTel_etab() {
		return Tel_etab;
	}

	public void setTel_etab(String tel_etab) {
		Tel_etab = tel_etab;
	}

}
