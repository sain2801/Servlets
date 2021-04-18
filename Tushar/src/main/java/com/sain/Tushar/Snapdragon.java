package com.sain.Tushar;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void print() {
		System.out.println("World best Processor");
	}

}
