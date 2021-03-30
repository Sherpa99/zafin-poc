package com.zafin.primarycore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zafin.primarycore.data.IRdCEntityAttribute;
import com.zafin.primarycore.domain.RdCEntityAttribute;

@Service
public class ZafinService {
	
	@Autowired
	private IRdCEntityAttribute zdata;
	
	public ResponseEntity<Long> getAllARDCounts() {
		System.out.println("######Getting all RdCEntityAttribute count******");
		return ResponseEntity.ok(zdata.count());
		
	}
	
	public ResponseEntity<Iterable<RdCEntityAttribute>> getAllARDData() {
		System.out.println("######Getting all RdCEntityAttribute Data******");
		return ResponseEntity.ok(zdata.findAll());
		
	}

}
