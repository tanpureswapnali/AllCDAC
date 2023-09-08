package org.fi.restmobiapp.services;

import java.util.List;

import org.fi.restmobiapp.dto.MobilePhoneDTO;
import org.fi.restmobiapp.entity.MobilePhone;

public interface MobilePhoneService {
	 MobilePhone createMobilePhone(int phoneId,String phoneName,String phoneMemroy,String phoneOs,String phoneSize); 
      
	 List<MobilePhoneDTO> getAllMobilePhones();
	 MobilePhone getMobilePhoneById(int phoneId);
	 
	MobilePhoneDTO createMobilePhoneDTO(int phoneId, String phoneName, String phoneMemory, String phoneOs,
			String phoneSize);

	MobilePhoneDTO createMobilePhone(MobilePhoneDTO mobilePhoneDTO);

	MobilePhoneDTO updateMobilePhone(Long phoneId, MobilePhoneDTO updatedMobilePhoneDTO);

	MobilePhoneDTO getMobilePhoneById(Long phoneId);
}
