package exec;

public class Construcao {
	
	private String tipoIss;
	private String tipo; 
	private double maoObra;
	private double metragem;
	private double issEng;
	private double visa;
	private double tipoValor;
	private double opcao;
	
	public void setTipoIss(String tipoIss) {
		this.tipoIss = tipoIss;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getMetragem() {
		return metragem;
	}
	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
	public double getMaoObra(int forro) {
		switch (forro) {
		case 1:
			if (metragem >0 && metragem <=99.00) {
				maoObra = 241.45;
			} else if (metragem >99.00 && metragem <=199.00){
				maoObra = 301.81;
			} else if (metragem >199.00 && metragem <=299.00) {
				maoObra = 362.17;
			} else if (metragem >299.00 && metragem <=499.00) {
				maoObra = 422.52;
			} else if (metragem >499.00) {
				maoObra = 482.90;
			}
			break;
			
		case 2:
			if (metragem >0 && metragem <=99.00) {
				maoObra = 362.17;
			} else if (metragem >99.00 && metragem <=199.00){
				maoObra = 422.52;
			} else if (metragem >199.00 && metragem <=299.00) {
				maoObra = 482.90;
			} else if (metragem >299.00 && metragem <=499.00) {
				maoObra = 543.26;
			} else if (metragem >499.00) {
				maoObra = 603.61;
			}
			break;
		default:
			break;
		}
		return maoObra*metragem;
	}
	public double getIssEng() {
		switch (tipo) {
		case "casa":
			if (metragem >0 && metragem <=70.00) {
				issEng = 1212;
			} else if (metragem >70.00 && metragem <=99.00){
				issEng = (metragem * 16.30);
			} else if (metragem >99.00) {
				issEng = (metragem * 20.52);
			}
			break;
		case "comercio":
			if (metragem >0 && metragem <=70.00) {
				issEng = 1212;
			} else if (metragem >70.00 && metragem <=99.00){
				issEng = (metragem * 18.12);
			} else if (metragem >99.00) {
				issEng = (metragem * 21.74);
			}
			break;
		default:
			break;
		}
		return issEng;
	}
	public double getVisa() {
		if (metragem >0 && metragem <=99.00) {
			visa = 103.71;
		} else if (metragem >99.00 && metragem <=199.00){
			visa = 156.39;
		} else if (metragem >199.00 && metragem <=299.00) {
			visa = 207.98;
		} else if (metragem >299.00 && metragem <=499.00) {
			visa = 260.66;
		} else if (metragem >499.00 && metragem <=999.00) {
			visa = 366.57;
		} else if (metragem >999.00 && metragem <=1999.00) {
			visa = 417.05;
		} else if (metragem >1999.00 && metragem <=2999.00) {
			visa = 491.68;
		} else if (metragem >2999.00 && metragem <=3999.00) {
			visa = 567.41;
		} else if (metragem >3999.00 && metragem <=4999.00) {
			visa = 648.62;
		} else if (metragem >4999.00) {
			visa = 717.22;
		}
		return visa;
	}
	public double getTipoValor() {
			if (tipoIss.equals("casa")) {
				tipoValor=6.64;
			} else if (tipoIss.equals("comercio")) {
				tipoValor=3.29;
			} else {
				tipoValor=2.20;
			}
		return tipoValor;
	}
	public void setOpcao(double opcao) {
		this.opcao = opcao;
	}
	@Override
	public String toString() {
		return "Casa [maoObra=" + maoObra + ", metragem=" + metragem + ", issEng=" + issEng + ", visa=" + visa
				+ ", opcao=" + opcao + "]";
	}


	
	
	
}
