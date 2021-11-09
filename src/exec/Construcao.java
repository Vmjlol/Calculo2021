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
				maoObra = 217.48;
			} else if (metragem >99.00 && metragem <=199.00){
				maoObra = 271.85;
			} else if (metragem >199.00 && metragem <=299.00) {
				maoObra = 326.22;
			} else if (metragem >299.00 && metragem <=499.00) {
				maoObra = 380.58;
			} else if (metragem >499.00) {
				maoObra = 434.96;
			}
			break;
			
		case 2:
			if (metragem >0 && metragem <=99.00) {
				maoObra = 326.22;
			} else if (metragem >99.00 && metragem <=199.00){
				maoObra = 380.58;
			} else if (metragem >199.00 && metragem <=299.00) {
				maoObra = 434.96;
			} else if (metragem >299.00 && metragem <=499.00) {
				maoObra = 489.33;
			} else if (metragem >499.00) {
				maoObra = 543.69;
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
				issEng = 1100;
			} else if (metragem >70.00 && metragem <=99.00){
				issEng = (metragem * 14.68);
			} else if (metragem >99.00) {
				issEng = (metragem * 18.48);
			}
			break;
		case "comercio":
			if (metragem >0 && metragem <=70.00) {
				issEng = 1100;
			} else if (metragem >70.00 && metragem <=99.00){
				issEng = (metragem * 16.32);
			} else if (metragem >99.00) {
				issEng = (metragem * 19.58);
			}
			break;
		default:
			break;
		}
		return issEng;
	}
	public double getVisa() {
		if (metragem >0 && metragem <=99.00) {
			visa = 93.50;
		} else if (metragem >99.00 && metragem <=199.00){
			visa = 141.00;
		} else if (metragem >199.00 && metragem <=299.00) {
			visa = 187.50;
		} else if (metragem >299.00 && metragem <=499.00) {
			visa = 234.99;
		} else if (metragem >499.00 && metragem <=999.00) {
			visa = 330.47;
		} else if (metragem >999.00 && metragem <=1999.00) {
			visa = 375.99;
		} else if (metragem >1999.00 && metragem <=2999.00) {
			visa = 443.27;
		} else if (metragem >2999.00 && metragem <=3999.00) {
			visa = 511.54;
		} else if (metragem >3999.00 && metragem <=4999.00) {
			visa = 584.76;
		} else if (metragem >4999.00) {
			visa = 646.60;
		}
		return visa;
	}
	public double getTipoValor() {
			if (tipoIss.equals("casa")) {
				tipoValor=5.99;
			} else if (tipoIss.equals("comercio")) {
				tipoValor=2.97;
			} else {
				tipoValor=1.98;
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
