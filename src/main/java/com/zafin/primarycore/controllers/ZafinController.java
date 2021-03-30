package com.zafin.primarycore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafin.primarycore.domain.RdCEntityAttribute;
import com.zafin.primarycore.service.ZafinService;

@RestController
@RequestMapping("/")
public class ZafinController {

	@Autowired
	private ZafinService zs;

	@GetMapping("zafin/rcount")
	public ResponseEntity<Long> findARDCounts() {

		return zs.getAllARDCounts();
	}

	@GetMapping("zafin/data")
	public ResponseEntity<Iterable<RdCEntityAttribute>> findAllARDData() {

		return (zs.getAllARDData());
	}

}
