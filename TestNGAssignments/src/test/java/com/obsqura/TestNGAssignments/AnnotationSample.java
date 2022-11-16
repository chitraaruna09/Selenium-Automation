package com.obsqura.TestNGAssignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSample {
	@Test
	public void testCase2() {
		System.out.println("Executed Test Case 2");
	}
	@Test
	public void testCase1() {
		System.out.println("Executed Test Case 1");
	}
	@BeforeMethod
	public void beforeMethodSample() {
		System.out.println("Executed Before Every Method");
	}
	@AfterMethod
	public void afterMethodSample() {
		System.out.println("Executed After Every Method");
	}
	@BeforeClass
	public void beforeClassSample() {
		System.out.println("Executed Before Class Method");
	}
	@AfterClass
	public void afterClassSample() {
		System.out.println("Executed After Class Method");
	}
	@BeforeTest
	public void beforeTestSample() {
		System.out.println("Executed Before Test Method");
	}
	@AfterTest
	public void afterTestSample() {
		System.out.println("Executed After Test Method");
	}
	@BeforeSuite
	public void beforeSuiteSample() {
		System.out.println("Executed Before Test Suite Method");
	}
	@AfterSuite
	public void afterSuiteSample() {
		System.out.println("Executed After Test Suite Method");
	}
}
