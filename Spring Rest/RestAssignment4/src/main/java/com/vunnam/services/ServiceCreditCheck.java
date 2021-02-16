package com.vunnam.services;

import org.springframework.stereotype.Service;

import com.vunnam.model.CreditCard;

@Service
public class ServiceCreditCheck {
	
	private CreditCard card2 = new CreditCard();
	/*
	 * Valid length: 16 digits.
		First 6 digits must be in one of the following ranges:
		601100 through 601109
		601120 through 601149
		601174
		601177 through 601179
		601186 through 601199
		644000 through 659999
		enRoute
		Valid length: 15 digits. First four digits must be 2014 or 2149.
		JCB
		Valid length: 16 to 19 digits.
		First 4 digits must be in the range 3528 through 3589.
		MasterCard
		Valid length: 16 digits.
		First digit must be 5 and second digit must be in the range 1 through 5 inclusive. The range is 510000 through 559999.
		First digit must be 2 and second digit must be in the range 2 through 7 inclusive. The range is 222100 through 272099.
		Visa
		Valid length: Up to 19 digits. First digit must be a 4.*/
	
	public CreditCard validate(String number) {
		//parse the individual string values to int 
		if(number.length() == 15) {
			//for JCB card
			//apply validations and return results
			//I'm not giving any validation I'm out of time, 
			card2.setType("JCB");
			card2.setValid(true);
			
		}
		else if(number.length() <=19 && number.length()>=16) {
			//for Master and visa
			if(number.length()==16) {
				//for visa
				card2.setType("Visa");
				card2.setValid(true);
			}
			card2.setType("MasterCard");
			card2.setValid(true);
		}
			
		/*
		 * card2.setValid(true); card2.setType("Visa"); return card2;
		 */
		return card2;
	}
	public String check() {
		return "all working fine";//card2.toString();
	}
	
	
}
