package com.example.case_study.controller;

import com.example.case_study.dto.AttachFacilityDto;
import com.example.case_study.dto.ContractDto;
import com.example.case_study.dto.ContractNewDto;
import com.example.case_study.dto.EmployeeDto;
import com.example.case_study.model.*;
import com.example.case_study.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
public class ManagerController {
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
    @Autowired
    private IAttachFacilityDtoService attachFacilityDtoService;

    //GET LIST
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
    //GET DATA

    @GetMapping("/getContractDetail")
    private String getContractDetail(@RequestParam int id, @RequestParam(defaultValue = "0") int page, RedirectAttributes re) {
        Pageable pageable = PageRequest.of(page,10);
        List<AttachFacilityDto> listContractDetail = attachFacilityDtoService.getFacilityDetailDtobyContractId(id);
        re.addFlashAttribute("pages",contractService.findAllContract(pageable));
        re.addFlashAttribute("page",pageable.getPageNumber());
        re.addFlashAttribute("listContractDetail",listContractDetail);
        re.addFlashAttribute("flag",1);
        return "redirect:/contract?page=" + pageable.getPageNumber();
    }

    @GetMapping("/getNewContractDetail")
    private String getAddContractDetail(@RequestParam int id, @RequestParam(defaultValue = "0") int page, RedirectAttributes re) {
        Pageable pageable = PageRequest.of(page,10);
        re.addFlashAttribute("pages",contractService.findAllContract(pageable));
        re.addFlashAttribute("page",pageable.getPageNumber());
        re.addFlashAttribute("flagAdd",1);
        re.addFlashAttribute("newId",id);
        return "redirect:/contract?page=" + pageable.getPageNumber();
    }
    @GetMapping("/contract")
    public String showListContract(Model model, @RequestParam(defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<ContractDto> pages = null;
        pages = contractService.findAllContract(pageable);
        model.addAttribute("currentPage",pageable.getPageNumber());
        model.addAttribute("pages",pages);
        return "contract";
    }
    @GetMapping("/employee")
    public String showListEmployee(Model model, @RequestParam(defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,10);
        Page<Employee> pages = null;
        pages = employeeService.findAllEmployee(pageable);
        model.addAttribute("currentPage",pageable.getPageNumber());
        model.addAttribute("pages",pages);
        return "employee";
    }
    @GetMapping("/create/employee")
    public String showCreateNewEmployee(@Validated @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult, Model model, @RequestParam(defaultValue = "0") int page){
        new EmployeeDto().validate(employeeDto, bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "createEmployee";
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employeeService.save(employee);
        Pageable pageable = PageRequest.of(page,10);
        Page<Employee> pages = null;
        pages = employeeService.findAllEmployee(pageable);
        showListEmployee(model.addAttribute("pages", pages),0);
        return "createEmployee";
    }
//    @PostMapping("/song/create")
//    public String save(@Validated  @ModelAttribute SongDto songDto, BindingResult bindingResult, Model model, RedirectAttributes attributes){
//        new SongDto().validate(songDto, bindingResult);
//        if (bindingResult.hasFieldErrors()){
//            return "views/create";
//        }
//        Song song = new Song();
//        BeanUtils.copyProperties(songDto, song);
//        service.save(song);
//        model.addAttribute("songList", service.findAll());
//        return "redirect:/song";
//    }
}
