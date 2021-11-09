package exec;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClasseExec extends JDialog {

	public static void main(String[] args) {

	Construcao construcao = new Construcao();
	String tipo = "default";
	String tipoReforma;
	String tipoIss;
	String forro = "default";
	double issEng;
	double visa;
	double valorMetro;
	double maoObra;
	
	
	for (int i=0;i <1;) {
		tipo = JOptionPane.showInputDialog("Digite o tipo de construção: casa, comercio ou reforma");
		if (tipo.equals("casa") || tipo.equals("comercio") || tipo.equals("reforma")){
			i++;
		}
	}
	
	
	construcao.setTipoIss(tipo);
		
	if (tipo.equals("reforma")) {
	
		for (int i=0;i <1;) {
			tipoReforma = JOptionPane.showInputDialog("Reforma sobre casa ou comercio?");
			if (tipoReforma.equals("casa") || tipoReforma.equals("comercio")){
				i++;
				construcao.setTipo(tipoReforma);
				tipo = tipoReforma;
			}
		}	
		
//		tipoReforma = JOptionPane.showInputDialog("Reforma sobre casa ou comercio?");
//		construcao.setTipo(tipoReforma);
//		tipo = tipoReforma;
	} else {
		construcao.setTipo(tipo);
	}
	
	for (int i=0;i <1;) {
		forro = JOptionPane.showInputDialog("Tipo de forro: 1 - Madeira/PVC | 2 - Especial");
		if (forro.equals("1") || forro.equals("2")){
			i++;
		}
	}	
	
			
	String metr = JOptionPane.showInputDialog("Digite a metragem da construção selecionada");
	double metragem = Double.parseDouble(metr.replace(',', '.'));
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	
	construcao.setOpcao(Integer.valueOf(forro));
	construcao.setMetragem(metragem);
	valorMetro = metragem*construcao.getTipoValor();
	issEng = construcao.getIssEng();
	maoObra = construcao.getMaoObra(Integer.valueOf(forro));
	visa = construcao.getVisa();
	double valorTotal = (valorMetro+(maoObra*0.03) + (issEng*0.03)+visa + 43.83);
	
	/*
	
	System.out.println("---VALORES PARA SISTEMA---");
	System.out.println("Valor total do metro: "+df.format(valorMetro));
	System.out.println("Valor da mão de Obra: "+df.format(maoObra));
	System.out.println("ISS do Engenheiro: "+df.format(issEng));
	System.out.println("Taxa da ViSa: "+df.format(visa));
	
	System.out.println("\n---VALOR DA TAXA EM REAIS---");
	System.out.println("Total: "+df.format(valorTotal));
	*/
	
	  JFrame janela = new JFrame("Construção 2021");
	  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  
	  
	  JPanel jPanel = new JPanel();
//	  janela.setLocationRelativeTo(null);
	  janela.add(jPanel);
	  
//	ESQUERDO
	  
		JLabel v1 = new JLabel("---VALORES PARA SISTEMA---");
		JLabel vMetro = new JLabel("Valor total do metro:");
		JLabel vMaoObra = new JLabel("Valor da mão de Obra:");
		JLabel vIss = new JLabel("ISS do Engenheiro:");
		JLabel vVisa = new JLabel("Taxa da ViSa:");
		JLabel valorTaxas = new JLabel("Taxas de Prot/Req/Exp");
		JLabel v2 = new JLabel("---VALOR DA TAXA EM REAIS---");
		JLabel vTotal = new JLabel("Total:");
		
//	DIREITO
		
		JLabel numMetro = new JLabel(df.format(valorMetro));
		JLabel numMaoObra = new JLabel(df.format(maoObra));
		JLabel numIss = new JLabel(df.format(issEng));
		JLabel numVisa = new JLabel(df.format(visa));
		JLabel numTaxas = new JLabel("43,83");
		JLabel numTotal = new JLabel(df.format(valorTotal));
		
		
	  jPanel.setBackground(Color.white);
	  jPanel.setLayout(null);
	  jPanel.setPreferredSize(new Dimension(500,500));
	  
	  
	  jPanel.add(v1);
	  v1.setBounds(200, 0, 500, 50);
	  
 
	  jPanel.add(vMetro);
	  vMetro.setBounds(20, 100, 200, 50);
	  
	  jPanel.add(numMetro);
	  numMetro.setBounds(200, 100, 200, 50);
	  
	  jPanel.add(new JLabel("--------------------------------"
		  		+ "------------------------------------------")).setBounds(0, 125, 800, 50); 
	  
	  
	  jPanel.add(vMaoObra);
	  vMaoObra.setBounds(20, 150, 200, 50);
	  
	  jPanel.add(numMaoObra);
	  numMaoObra.setBounds(200, 150, 200, 50);
	  
	  jPanel.add(new JLabel("--------------------------------"
		  		+ "------------------------------------------")).setBounds(0, 175, 800, 50);
	  
	  jPanel.add(vIss);
	  vIss.setBounds(20, 200, 200, 50);
	  
	  jPanel.add(numIss);
	  numIss.setBounds(200, 200, 200, 50);
	  
	  jPanel.add(new JLabel("--------------------------------"
		  		+ "------------------------------------------")).setBounds(0, 225, 800, 50);
	  
	  jPanel.add(vVisa);
	  vVisa.setBounds(20, 250, 200, 50);
	  
	  jPanel.add(numVisa);
	  numVisa.setBounds(200, 250, 200, 50);
	  
	  jPanel.add(new JLabel("--------------------------------"
		  		+ "------------------------------------------")).setBounds(0, 275, 800, 50);
	  
	  jPanel.add(valorTaxas);
	  valorTaxas.setBounds(20, 300, 200, 50);	
	
	  jPanel.add(numTaxas);
	  numTaxas.setBounds(200, 300, 200, 50);  
	  
	  jPanel.add(v2);
	  v2.setBounds(200, 350, 500, 50);	  
	  
	  jPanel.add(vTotal);
	  vTotal.setBounds(20, 400, 200, 50);	  
	  
	  jPanel.add(numTotal);
	  numTotal.setBounds(200, 400, 200, 50);
	  
	  jPanel.add(new JLabel("VALEU")).setBounds(200, 500, 500, 50);
	  
	  janela.pack();
	  janela.setVisible(true);
	
	
	
	
	
		
	}

}
