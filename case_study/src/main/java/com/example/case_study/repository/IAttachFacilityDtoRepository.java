package com.example.case_study.repository;

import com.example.case_study.dto.AttachFacilityDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAttachFacilityDtoRepository extends JpaRepository<AttachFacilityDto, Integer> {
    String getListContractDetail_sql = "select f.id ,f.name, f.unit, f.cost , e.quantity\n" +
            "            from customer a \n" +
            "            join customer_type b on a.id = b.id\n" +
            "            join contract c on a.id = c.customer_id\n" +
            "            left join facility d on c.facility_id = d.id\n" +
            "            left join contract_detail e on c.id = e.contract_id\n" +
            "            left join attach_facility f on e.attach_facility_id = f.id\n" +
            "            where c.id = ?";
    @Query(value =getListContractDetail_sql, countQuery = getListContractDetail_sql, nativeQuery = true)
    List<AttachFacilityDto> getFacilityDetailDtobyContractId(int contract_id);
}
