package model.entities;

public class Coin {

	private Double real = 3.0;
	private Double dolar = 2.0;
	private Double euro = 3.0;
	private Double libras = 4.0;
	private Double yene = 5.0;
	private Double won = 6.0;

	public Coin() {

	}

	public Coin(Double real, Double dolar, Double euro, Double libras, Double yene, Double won) {
		super();
		this.real = real;
		this.dolar = dolar;
		this.euro = euro;
		this.libras = libras;
		this.yene = yene;
		this.won = won;
	}

	public Double getReal() {
		return real;
	}

	public void setReal(Double real) {
		this.real = real;
	}

	public Double getDolar() {
		return dolar;
	}

	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}

	public Double getEuro() {
		return euro;
	}

	public void setEuro(Double euro) {
		this.euro = euro;
	}

	public Double getLibras() {
		return libras;
	}

	public void setLibras(Double libras) {
		this.libras = libras;
	}

	public Double getYene() {
		return yene;
	}

	public void setYene(Double yene) {
		this.yene = yene;
	}

	public Double getWon() {
		return won;
	}

	public void setWon(Double won) {
		this.won = won;
	}

	public double converterCoin(Object value, Double inputValue) {

		if (value == "De Reais a Dolares") {
			return inputValue *= dolar;
		} else if (value == "De Reais a Euros") {
			return inputValue *= euro;
		} else if (value == "De Reais a libras") {
			return inputValue *= libras;
		} else if (value == "De Reais a Yenes") {
			return inputValue *= yene;
		} else if (value == "De Reais a Won Coreano") {
			return inputValue *= won;
		} else if (value == "De Dólares a Reais ") {
			return inputValue /= real;
		} else if (value == "De Euros a Reais ") {
			return inputValue /= real;
		} else if (value == "De Libras a Reais") {
			return inputValue /= real;
		} else if (value == "De Yenes a Reais ") {
			return inputValue /= real;
		} else if (value == "De Won Coreano a Reais ") {
			return inputValue /= real;
		}
		return inputValue;

	}

}
