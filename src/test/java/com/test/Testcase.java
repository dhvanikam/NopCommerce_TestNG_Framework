package com.test;

import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.pages.Page;

public class Testcase extends BaseClass{
Page page=new Page();

@Test
public void getURL() {
	page.getURL();
}
}
	
