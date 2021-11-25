package com.sonata.TestSuitExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestCase;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestCase.class,
	testClass2.class
})
public class testUnit {

}
