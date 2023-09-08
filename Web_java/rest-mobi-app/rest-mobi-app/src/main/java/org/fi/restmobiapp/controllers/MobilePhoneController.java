package org.fi.restmobiapp.controllers;

import java.util.List;

import org.fi.restmobiapp.dto.MobilePhoneDTO;
import org.fi.restmobiapp.entity.MobilePhone;
import org.fi.restmobiapp.services.MobilePhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mobile_PRN")
public class MobilePhoneController {
	@Autowired
	MobilePhoneService  mobilePhoneService;
	
	@PostMapping("/create_PRN")
    public MobilePhoneDTO createMobilePhone(@RequestBody MobilePhoneDTO mobilePhoneDTO) {
        return mobilePhoneService.createMobilePhone(mobilePhoneDTO);
    }
	@GetMapping("/getAllMobiles_PRN")
    public List<MobilePhoneDTO> getAllMobilePhones() {
        return mobilePhoneService.getAllMobilePhones();
    }
	
	@GetMapping("/getMobileDetail_PRN/{mobileid}")
    public MobilePhone getMobilePhoneById(@PathVariable("mobileid") int phoneId) {
        return mobilePhoneService.getMobilePhoneById(phoneId);
    }
	
 /*@PostMapping("/updateMobileDetail_PRN/{mobileid}")
    public MobilePhoneDTO updateMobilePhone(@PathVariable("mobileid") Long phoneId,
                                            @RequestBody MobilePhoneDTO updatedMobilePhonOeDTO){
        return mobilePhoneService.updateMobilePhone(phoneId, updatedMobilePhoneDTO);
    }*/
}











