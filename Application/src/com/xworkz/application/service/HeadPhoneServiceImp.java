package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Colour;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import static com.xworkz.application.util.ValidateHeadPhoneUtil.*;

public class HeadPhoneServiceImp implements HeadPhoneService {

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {
		System.out.println("running service:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mfgDate = dto.getMfgDate();
			int warrantyPeriod = dto.getWarrantyPeriod();
			Brand brand = dto.getBrand();
			Colour colour = dto.getColour();
			TypeAndWeight typeAndWeight = dto.getTypeAndWeight();

			boolean validModel = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validCustomer = false;
			boolean validInvoice = false;
			boolean validMfg = false;
			boolean validWarranty = false;
			boolean validBrand = false;
			boolean validColour = false;
			boolean validtypeAndWeight = false;

			if (validString(modelNo)) {
				System.out.println("modelNo is valid");
				validModel = true;
			} else {
				System.out.println("modelNo is invalid");
			}
			if (validPrice(price)) {
				System.out.println("Price is valid");
				validPrice = true;
			} else {
				System.out.println("Price is invalid");
			}
			if (bass) {
				System.out.println("bass is valid");
				validBass = true;
			} else {
				System.out.println("bass is invalid");
			}
			if (validString(customerName)) {
				System.out.println("customerName is valid");
				validCustomer = true;
			} else {
				System.out.println("customerName is invalid");
			}
			if (validInt(invoiceNo)) {
				System.out.println("invoiceNo is valid");
				validInvoice = true;
			} else {
				System.out.println("invoiceNo is invalid");
			}
			if (validInt(warrantyPeriod)) {
				System.out.println("warrantyPeriod is valid");
				validWarranty = true;
			} else {
				System.out.println("warrantyPeriod is invalid");
			}
			if (brand != null) {
				System.out.println("brand is valid");
				validBrand = true;
			} else {
				System.out.println("brand is invalid");
			}
			if (colour != null) {
				System.out.println("colour is valid");
				validColour = true;
			} else {
				System.out.println("colour is invalid");
			}
			if (typeAndWeight != null) {
				System.out.println("typeAndWeight is valid");
				validtypeAndWeight = true;
			} else {
				System.out.println("typeAndWeight is invalid");
			}
			if (validDate(mfgDate, LocalDate.of(2020, 1, 1))) {
				System.out.println("Mfg is valid");
				validMfg = true;
			} else {
				System.out.println("Mfg is invalid");
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
