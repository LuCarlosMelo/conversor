import javax.swing.*;
import model.entities.Coin;

public class Program {
	public static void main(String[] args) {
		
		Double escolha;

		
		do {
		JFrame frame = new JFrame();

		Object[] converterOptions = { "Moeda", "Temperatura" };

		JOptionPane.showInputDialog(null, "O que você deseja converter?", "Menu", JOptionPane.INFORMATION_MESSAGE, null,
				converterOptions, converterOptions[0]);

		Object[] coinOption = { "De Reais a Dolares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
				"De Reais a Won Coreano", "De Dólares a Reais ", "De Euros a Reais ", "De Libras a Reais",
				"De Yenes a Reais ", "De Won Coreano a Reais " };
		Object value = JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter:", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, coinOption, coinOption[0]);
		try {
			Object objInputValue = JOptionPane.showInputDialog("Insira um valor: ");
			String strInputValue = objInputValue.toString();
			Double inputValue = Double.valueOf(strInputValue).doubleValue();

			Object objResult = new Coin().converterCoin(value, inputValue);
			String result = objResult.toString();

			JOptionPane.showMessageDialog(frame, "O valor " + value + " é : " + result, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}

		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, "Valor inválido", "Message", JOptionPane.ERROR_MESSAGE);
		}
		
		Object objEscolha = JOptionPane.showConfirmDialog(null, "Escolha um: ", "Escolha um", JOptionPane.YES_NO_CANCEL_OPTION);
		String strEscolha = objEscolha.toString();
		Double doubleEscolha = Double.valueOf(strEscolha).doubleValue();
		escolha = doubleEscolha;
		}
		while(escolha == 0);
	
		if(escolha == 1 || escolha == -1) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			JOptionPane.showMessageDialog(null, "Programa concluído");

		}
		
	
	

}
}