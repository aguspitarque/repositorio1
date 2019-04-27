package ar.edu.unlam.disco;

public class Disco {
	private Integer radioInterior;
	private Integer radioExterior;
	private Integer perimetroInterior;
	private Integer perimetroExterior;
	private Integer superficie;
	
	public Disco(Integer radioInterior, Integer radioExterior, Integer perimetroInterior, Integer perimetroExterior, Integer superficie) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		this.perimetroInterior = perimetroInterior;
		this.perimetroExterior = perimetroExterior;
		this.superficie = superficie;
	}
	
	public void verificarDiscoValido() {
		if(radioInterior>radioExterior||radioInterior==radioExterior|| perimetroInterior>perimetroExterior || perimetroInterior==perimetroExterior) {
			System.out.print("El disco esta mal especificado");
		}
	}

	public Integer getRadioInterior() {
		return radioInterior;
	}
	
	public void setRadioInterior(Integer radioInterior) {
		this.radioInterior = radioInterior;
	}


	public Integer getRadioExterior() {
		return radioExterior;
	}
	
	public void setRadioExterior(Integer radioExterior) {
		this.radioExterior = radioExterior;
	}
	

	public Integer getPerimetroInterior() {
		return perimetroInterior;
	}

	public Integer getPerimetroExterior() {
		return perimetroExterior;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perimetroExterior == null) ? 0 : perimetroExterior.hashCode());
		result = prime * result + ((perimetroInterior == null) ? 0 : perimetroInterior.hashCode());
		result = prime * result + ((radioExterior == null) ? 0 : radioExterior.hashCode());
		result = prime * result + ((radioInterior == null) ? 0 : radioInterior.hashCode());
		result = prime * result + ((superficie == null) ? 0 : superficie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disco other = (Disco) obj;
		if (perimetroExterior == null) {
			if (other.perimetroExterior != null)
				return false;
		} else if (!perimetroExterior.equals(other.perimetroExterior))
			return false;
		if (perimetroInterior == null) {
			if (other.perimetroInterior != null)
				return false;
		} else if (!perimetroInterior.equals(other.perimetroInterior))
			return false;
		if (radioExterior == null) {
			if (other.radioExterior != null)
				return false;
		} else if (!radioExterior.equals(other.radioExterior))
			return false;
		if (radioInterior == null) {
			if (other.radioInterior != null)
				return false;
		} else if (!radioInterior.equals(other.radioInterior))
			return false;
		if (superficie == null) {
			if (other.superficie != null)
				return false;
		} else if (!superficie.equals(other.superficie))
			return false;
		return true;
	}
	
	
	
	
	
}
