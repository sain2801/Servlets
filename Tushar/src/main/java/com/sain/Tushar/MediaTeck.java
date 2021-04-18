package com.sain.Tushar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTeck implements MobileProcessor {

	public void print() {
		System.out.println("World 2nd best processor");
	}

}
