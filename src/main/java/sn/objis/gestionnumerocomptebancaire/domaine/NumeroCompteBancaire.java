package sn.objis.gestionnumerocomptebancaire.domaine;

public class NumeroCompteBancaire {
	private long numEtablissement;
	private long numGuichet;
	private String numeroCompte;
	private long cleRib;
	
	public NumeroCompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumeroCompteBancaire(long numEtablissement, long numGuichet, String numeroCompte, long cleRib) {
		super();
		this.numEtablissement = numEtablissement;
		this.numGuichet = numGuichet;
		this.numeroCompte = numeroCompte;
		this.cleRib = cleRib;
	}

	public long getNumEtablissement() {
		return numEtablissement;
	}

	public void setNumEtablissement(long numEtablissement) {
		this.numEtablissement = numEtablissement;
	}

	public long getNumGuichet() {
		return numGuichet;
	}

	public void setNumGuichet(long numGuichet) {
		this.numGuichet = numGuichet;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public long getCleRib() {
		return cleRib;
	}

	public void setCleRib(long cleRib) {
		this.cleRib = cleRib;
	}
	
	

}
