
package com.my.bank.mappers;

import com.my.bank.models.Address;

public class AddressMapper {

	public static Address processAddress(String address) {
		String[] addressArray = address.split(",");

//		int temp = 0;
//		int arrayCount = 0;
//		int strLen = address.length();
//		for (int i = 0; i < strLen; i++) {
//			if (address.charAt(i) == ',') {
//				addressArray[arrayCount++] = address.substring(temp, i).trim();
//				temp = i + 1;
//			}
//		}
//		addressArray[arrayCount] = address.substring(temp, strLen);

		return new Address(addressArray[0].trim(), addressArray[1].trim(), addressArray[2].trim(),
				addressArray[3].trim(), Integer.parseInt(addressArray[0].trim()));
	}

}
