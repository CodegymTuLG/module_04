package com.example.case_study.repository;

import com.example.case_study.model.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAttachFacilityRepository extends JpaRepository<AttachFacility, Integer> {
    @Query(value =     "select f.accompaniedservice, f.unit, f.price ,e.count\n" +
            "from customer_info a join customertype_master b on a.customertype_id = b.customertype_id \n" +
            "join contract c on a.customer_id = c.customer_id\n" +
            "left join service d on c.service_id = d.service_id\n" +
            "left join contract_detail e on c.contract_id = e.contract_id\n" +
            "left join accompaniedservice_master f on e.accompaniedservice_id = f.accompaniedservice_id\n" +
            "where c.contract_id = ?", nativeQuery = true)
    List<AttachFacility> getContractDetailbyContractId(int contract_id);
    List<AttachFacility> findAll();
}
