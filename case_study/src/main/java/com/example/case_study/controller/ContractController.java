package com.example.case_study.controller;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.*;
import com.example.case_study.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IAttachFacilityService attachFacilityService;
    @ModelAttribute("pulldownEmployeeName")
    public List<Employee> getPulldownEmployeeName(){
        return employeeService.findAll();
    }
    @ModelAttribute("pulldownCustomerName")
    public List<Customer> getPulldownCustomerName(){
        return customerService.findAll();
    }
    @ModelAttribute("pulldownFacilityName")
    public List<Facility> getPulldownFacilityName(){
        return facilityService.findAll();
    }
    @ModelAttribute("pulldownAttachFacilityName")
    public List<AttachFacility> getPulldownAttachFacilityName(){
        return attachFacilityService.findAll();
    }
    @PostMapping("/getContractDetail")
    private String getContractDetail(@RequestParam int facilityId, Model model) {
        List<AttachFacility> listContractDetail = attachFacilityService.getContractDetailbyContractId(facilityId);
        int listContractDetailSize = listContractDetail.size();
        model.addAttribute("listContractDetailSize",listContractDetailSize);
        model.addAttribute("listContractDetail",listContractDetail);
        model.addAttribute("flag",1);
        return "/contract";
    }

    @GetMapping("/contract")
    public String showList(Model model,
                           @RequestParam(defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,5);
        Page<ContractDto> pages = null;
        pages = contractService.findAllContract(pageable);
        model.addAttribute("pages",pages);
        return "contract";
    }
}
