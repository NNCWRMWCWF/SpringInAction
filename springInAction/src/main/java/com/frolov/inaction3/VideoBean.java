package com.frolov.inaction3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VideoBean {

	Object mBean;
	
	@Autowired
	@Cold
	public void setMBean(Object mBean) {
		this.mBean = mBean;
	}
}
