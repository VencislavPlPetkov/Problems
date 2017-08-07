package Task2_Classes;

import java.time.Year;

public class Car {

	String manufacturer;
	String model;
	int horsePower;
	int manufactureYear;

	public int insuranceCategory(int manufactureYear) {

		int currentYear = Year.now().getValue();

		int carAge = currentYear - manufactureYear;

		int carCategory = 0;

		if (carAge <= 8)
			carCategory = 1;
		if (carAge > 8 && carAge <= 15)
			carCategory = 2;
		if (carAge > 15 && carAge <= 25)
			carCategory = 3;
		if (carAge > 25)
			carCategory = 4;

		return carCategory;
	}

	public double taxesToPay(int manufactureYear, int horsePower) {

		double carTaxes = 0;

		int carCategory = insuranceCategory(manufactureYear);

		if (carCategory == 1)
			carTaxes = 150;
		if (carCategory == 2)
			carTaxes = 200;
		if (carCategory == 3)
			carTaxes = 300;
		if (carCategory == 4)
			carTaxes = 500;

		if (horsePower <= 80) {
			double taxesIncrease = (double) (carTaxes * 20f / 100f);
			carTaxes += taxesIncrease;
		}
		if (horsePower >= 140) {
			double taxesIncrease = (double) (carTaxes * 45f / 100f);
			carTaxes += taxesIncrease;
		}

		return carTaxes;
	}

}
