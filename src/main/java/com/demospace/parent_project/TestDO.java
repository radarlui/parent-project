package com.demospace.parent_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TestDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer testValue1;
	private String resultValue;

	private java.lang.Integer testValue2;

	public TestDO() {
	}

	public java.lang.Integer getTestValue1() {
		return this.testValue1;
	}

	public void setTestValue1(java.lang.Integer testValue1) {
		this.testValue1 = testValue1;
	}

	public java.lang.Integer getTestValue2() {
		return this.testValue2;
	}

	public void setTestValue2(java.lang.Integer testValue2) {
		this.testValue2 = testValue2;
	}

	public java.lang.String getResultValue() {
		return this.resultValue;
	}

	public void setResultValue(java.lang.String resultValue) {
		this.resultValue = resultValue;
	}

	public TestDO(java.lang.Integer testValue1, java.lang.String resultValue,
			java.lang.Integer testValue2) {
		this.testValue1 = testValue1;
		this.resultValue = resultValue;
		this.testValue2 = testValue2;
	}
	

	public void cloneTo(TestDO testDO)
	{
	    testDO.testValue1 = this.testValue1;
		testDO.resulttValue = this.resultValue;
		testDO.testValue2 = this.testValue2;
	}


}