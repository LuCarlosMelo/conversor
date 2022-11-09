import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		
		Object [] converterOptions = {"Moeda", "Temperatura"}; 
		Object chosenConverter = JOptionPane.showInputDialog(null, "O que você deseja converter?", "Menu",
				JOptionPane.INFORMATION_MESSAGE ,null, converterOptions,converterOptions[0]);
		
		Object [] coinOption = {"De Reais a Dólares", "De Reais a Euros","De Reais a Libras","De Reais a Yenes",
				"De Reais a Won Coreano","De Dólares a Reais ", "De Euros a Reais ", "De Libras a Reais",
				"De Yenes a Reais ","De Won Coreano a Reais "};
		
		if(chosenConverter == converterOptions[0]) {
			JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter:","Menu",JOptionPane.INFORMATION_MESSAGE,null, coinOption,coinOption[0]);
		}
		
		
		
	}

}
