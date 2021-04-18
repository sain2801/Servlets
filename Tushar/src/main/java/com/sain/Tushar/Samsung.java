package com.sain.Tushar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	@Qualifier("mediaTeck")
	MobileProcessor cp;
     public MobileProcessor getCp() {
		return cp;
	}
	public void setCp(MobileProcessor cp) {
		this.cp = cp;
	}
	public void config(){
    	 System.out.println("Samsung configurations");
    	 cp.print();
     }
}
