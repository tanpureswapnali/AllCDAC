package org.fi.restmobiapp.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.fi.restmobiapp.dto.MobilePhoneDTO;
import org.fi.restmobiapp.entity.MobilePhone;
import org.fi.restmobiapp.repository.MobilePhoneRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class MobilePhoneServiceImpl implements MobilePhoneService {

     MobilePhoneRepository mobilePhoneRepository;

    @Autowired
    public MobilePhoneServiceImpl(MobilePhoneRepository mobilePhoneRepository) {
        this.mobilePhoneRepository = mobilePhoneRepository;
    }

    @Override
    public MobilePhoneDTO createMobilePhone(MobilePhoneDTO mobilePhoneDTO) {
        MobilePhone mobilePhone = new MobilePhone();
        BeanUtils.copyProperties(mobilePhoneDTO, mobilePhone);

        MobilePhone createdMobilePhone = mobilePhoneRepository.save(mobilePhone);

        MobilePhoneDTO createdMobilePhoneDTO = new MobilePhoneDTO();
        BeanUtils.copyProperties(createdMobilePhone, createdMobilePhoneDTO);

        return createdMobilePhoneDTO;
    }

    @Override
    public List<MobilePhoneDTO> getAllMobilePhones() {
        List<MobilePhone> mobilePhones = mobilePhoneRepository.findAll();

        return mobilePhones.stream()
                .map(mobilePhone -> {
                    MobilePhoneDTO mobilePhoneDTO = new MobilePhoneDTO();
                    BeanUtils.copyProperties(mobilePhone, mobilePhoneDTO);
                    return mobilePhoneDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public MobilePhoneDTO getMobilePhoneById(Long phoneId) {
        Optional<MobilePhone> mobilePhoneOptional = mobilePhoneRepository.findById(phoneId);

        if (mobilePhoneOptional.isPresent()) {
            MobilePhoneDTO mobilePhoneDTO = new MobilePhoneDTO();
            BeanUtils.copyProperties(mobilePhoneOptional.get(), mobilePhoneDTO);
            return mobilePhoneDTO;
        }

        return null;
    }

    @Override
    public MobilePhoneDTO updateMobilePhone(Long phoneId, MobilePhoneDTO updatedMobilePhoneDTO) {
        Optional<MobilePhone> mobilePhoneOptional = mobilePhoneRepository.findById(phoneId);

        if (mobilePhoneOptional.isPresent()) {
            MobilePhone mobilePhone = mobilePhoneOptional.get();
            BeanUtils.copyProperties(updatedMobilePhoneDTO, mobilePhone);

            MobilePhone updatedMobilePhone = mobilePhoneRepository.save(mobilePhone);

             updatedMobilePhoneDTO = new MobilePhoneDTO();
            BeanUtils.copyProperties(updatedMobilePhone, updatedMobilePhoneDTO);

            return updatedMobilePhoneDTO;
        }

        return null;
    }
}