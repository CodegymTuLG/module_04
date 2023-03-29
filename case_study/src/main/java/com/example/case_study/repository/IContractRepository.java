package com.example.case_study.repository;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IContractRepository extends JpaRepository<Contract, Integer> {
    String selectAllContract_sql = "select c.id id, a.name customer, d.name facility, c.startdate startDate, c.enddate endDate,\n" +
            "            ifnull(sum(if(c.enddate=c.startdate,1,datediff(c.enddate,c.startdate))*d.cost)+\n" +
            "            sum(f.cost* e.quantity),sum(if(c.enddate=c.startdate,1,datediff(c.enddate,c.startdate))*d.cost)) payment,\n" +
            "            c.deposit deposit from customer a\n" +
            "            join customer_type b on a.customer_type_id = b.id\n" +
            "            join contract c on a.id = c.customer_id\n" +
            "            left join facility d on c.facility_id = d.id\n" +
            "            left join contract_detail e on c.id = e.contract_id\n" +
            "            left join attach_facility f on e.attach_facility_id = f.id\n" +
            "            group by c.id\n" +
            "            order by c.id";
    @Query(value =selectAllContract_sql, countQuery = selectAllContract_sql, nativeQuery = true)
    Page<ContractDto> findAllContract(Pageable pageable);
}
