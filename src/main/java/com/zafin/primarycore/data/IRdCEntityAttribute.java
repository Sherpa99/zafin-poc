package com.zafin.primarycore.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zafin.primarycore.domain.RdCEntityAttribute;


public interface IRdCEntityAttribute extends PagingAndSortingRepository<RdCEntityAttribute, String> {

	@Query("select c from RdCEntityAttribute c")
	Page<RdCEntityAttribute> findAllPage(Pageable pageable);
}
