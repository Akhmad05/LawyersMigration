package ru.scli.lawyersmigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.scli.lawyersmigration.model.db1.*;
import ru.scli.lawyersmigration.service.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Autowired
    LawyerService lawyerService;

    @Autowired
    RegionsService regionService;

    @Autowired
    CountriesService countriesService;

    @Autowired
    CancelledCertificatesService cancelledCertificatesService;

    @Autowired
    CancelledCertificatesForeignService cancelledCertificatesForeignService;

    @Autowired
    ChangeFioFilterService changeFioFilterService;

    @Autowired
    ForeignLawyersService foreignLawyersService;


    public void getAllLawyer(){
        List<Lawyer> lawyerList = lawyerService.getAllLawyer();
        List<Lawyer> lawyerList2 = new ArrayList<>();
        for (Lawyer val : lawyerList) {
            Lawyer lawyer = new Lawyer();
            lawyer.setId(val.getId());
            lawyer.setAddress(val.getAddress());
            lawyer.setLawChamber(val.getLawChamber());
            lawyer.setDistrictCode(val.getDistrictCode());
            lawyer.setDistrictName(val.getDistrictName());
            lawyer.setEmail(val.getEmail());
            lawyer.setFio(val.getFio());
            lawyer.setIdentityCard(val.getIdentityCard());
            lawyer.setOrgForm(val.getOrgForm());
            lawyer.setOrgName(val.getOrgName());

            if(val.getPhone() != null) {
                byte[] ch = val.getPhone().getBytes();
                int i = 0;
                for (byte bt : ch) {
                    if (bt == 0)
                        ch[i] = 32;
                    i++;
                }
                String phoneNumber = new String(ch);

                lawyer.setPhone(phoneNumber);
            }else {
                lawyer.setPhone(val.getPhone());
            }

            lawyer.setRegCaption(val.getRegCaption());
            lawyer.setRegCode(val.getRegCode());
            lawyer.setRegisterNumber(val.getRegisterNumber());
            lawyer.setSerialNumber(val.getSerialNumber());
            lawyer.setStatus(val.getStatus());
            lawyerList2.add(lawyer);
            //System.out.println(val.getAddress());
        }
        lawyerService.saveAllLawyer(lawyerList2);

    }


    public void getAllRegions(){
        List<Regions> regionsList = regionService.getAllRegions();
        List<Regions> regionsList2 = new ArrayList<>();

        for(Regions val : regionsList) {
            Regions regions = new Regions();
            regions.setRegCode(val.getRegCode());
            regions.setRegCaption(val.getRegCaption());
            regionsList2.add(regions);
//            System.out.println(val.getRegCode());
        }
        regionService.saveAllRegions(regionsList2);
    }

    public void getAllCountries(){
        List<Countries> countriesList = countriesService.getAllCountries();
        List<Countries> countries2List = new ArrayList<>();
        for(Countries val : countriesList) {
            Countries countries = new Countries();
            countries.setCode(val.getCode());
            countries.setName(val.getName());
            countries2List.add(countries);
//            System.out.println(val.getName());
        }
        countriesService.saveAllCountries(countries2List);
    }


    public void getAllCancelledCertificates(){

        List<CancelledCertificates> cancelledCertificatesList = cancelledCertificatesService.getAllCancelledCertificates();
        List<CancelledCertificates> cancelledCertificates2List = new ArrayList<>();
        for(CancelledCertificates val : cancelledCertificatesList) {
            CancelledCertificates cancelledCertificates = new CancelledCertificates();
            cancelledCertificates.setId(val.getId());
            cancelledCertificates.setCertDate(val.getCertDate());
            cancelledCertificates.setCertNumber(val.getCertNumber());
            cancelledCertificates.setFio(val.getFio());
            cancelledCertificates.setLawyerId(val.getLawyerId());
            cancelledCertificates.setNotReturned(val.getNotReturned());
            cancelledCertificates.setReasonId(val.getReasonId());
            cancelledCertificates.setRegCaption(val.getRegCaption());
            cancelledCertificates.setRegCode(val.getRegCode());

            cancelledCertificates2List.add(cancelledCertificates);
//            System.out.println(val.getCertDate());
        }
        cancelledCertificatesService.saveAllCancelledCertificates(cancelledCertificates2List);

    }

    public void getAllCancelledCertificatesForeign(){

        List<CancelledCertificatesForeign> cancelledCertificatesForeignList = cancelledCertificatesForeignService.getAllCancelledCertificatesForeign();
        List<CancelledCertificatesForeign> cancelledCertificatesForeign2List = new ArrayList<>();

        for(CancelledCertificatesForeign val : cancelledCertificatesForeignList){
            CancelledCertificatesForeign cancelledCertificatesForeign = new CancelledCertificatesForeign();
            cancelledCertificatesForeign.setId(val.getId());
            cancelledCertificatesForeign.setCountry(val.getCountry());
            cancelledCertificatesForeign.setCountryCode(val.getCountryCode());
            cancelledCertificatesForeign.setDateNullification(val.getDateNullification());
            cancelledCertificatesForeign.setForeign_lawyer_id(val.getForeign_lawyer_id());
            cancelledCertificatesForeign.setNotReturned(val.getNotReturned());
            cancelledCertificatesForeign2List.add(cancelledCertificatesForeign);
//            System.out.println(val.getFio());
        }
        cancelledCertificatesForeignService.saveAllCancelledCertificatesForeign(cancelledCertificatesForeign2List);
    }

    public void getAllChangeFioFilter(){
        List<ChangeFioFilter> changeFioFilterList = changeFioFilterService.getAllChangeFioFilter();
        List<ChangeFioFilter> changeFioFilterList2 = new ArrayList<>();

        for(ChangeFioFilter val : changeFioFilterList){
            ChangeFioFilter changeFioFilter = new ChangeFioFilter();
            changeFioFilter.setId(val.getId());
            changeFioFilter.setLawyerId(val.getLawyerId());
            changeFioFilter.setNewFio(val.getNewFio());
            changeFioFilter.setOldFio(val.getOldFio());
            changeFioFilter.setOrderName(val.getOrderName());
            changeFioFilterList2.add(changeFioFilter);
//            System.out.println(val.getOldFio());
        }
        changeFioFilterService.saveAllChangeFioFilter(changeFioFilterList2);
    }

    public void getAllForeignLawyers(){

        List<ForeignLawyers> foreignLawyersList = foreignLawyersService.getAllForeignLawyers();
        List<ForeignLawyers> foreignLawyersList2 = new ArrayList<>();

        for (ForeignLawyers val : foreignLawyersList){
            ForeignLawyers foreignLawyers = new ForeignLawyers();
            foreignLawyers.setId(val.getId());
            foreignLawyers.setCountryCaption(val.getCountryCaption());
            foreignLawyers.setCountryCode(val.getCountryCode());
            foreignLawyers.setFio(val.getFio());
            foreignLawyers.setRegisterNumber(val.getRegisterNumber());
            foreignLawyers.setStatus(val.getStatus());
            foreignLawyersList2.add(foreignLawyers);
//            System.out.println(val.getCountryCode());
        }
        foreignLawyersService.saveAllForeignLawyers(foreignLawyersList2);
    }


    @Override
    public void run(String... args) throws Exception {
        getAllLawyer();
        getAllRegions();
        getAllCountries();
        getAllCancelledCertificates();
        getAllCancelledCertificatesForeign();
        getAllChangeFioFilter();
        getAllForeignLawyers();
    }

}
