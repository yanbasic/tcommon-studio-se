 package com.talend.tac.cases.executionTask;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.talend.tac.cases.Login;
@Test(groups={"DeleteTask"},dependsOnGroups={"DuplicateTask"})
public class TestDeteleTask  extends Login {
    
	
	@Test
	public void testCancleDeleteTask() {
		this.clickWaitForElementPresent("!!!menu.executionTasks.element!!!");
		selenium.setSpeed(MID_SPEED);
	    Assert.assertTrue(selenium.isElementPresent("//div[text()='"+rb.getString("menu.jobConductor")+"']"));
		selenium.setSpeed(MIN_SPEED);
	    selenium.click("idSubModuleRefreshButton");//click "Refresh"
		selenium.mouseDown("//span[text()='testTaskNotChooseActive']");//select a exist task
		selenium.chooseCancelOnNextConfirmation();
		selenium.click("idSubModuleDeleteButton");//clcik "Delete"
		selenium.setSpeed(MID_SPEED);
		Assert.assertTrue(selenium.getConfirmation().matches(other.getString("delete.plan.warning")));
		Assert.assertTrue(selenium.isElementPresent("//span[text()='testTaskNotChooseActive']"));
		selenium.setSpeed(MIN_SPEED);
		
	}
	
	@Test(dependsOnMethods={"testCancleDeleteTask"})
	public void testDeleteTask() {
		this.clickWaitForElementPresent("!!!menu.executionTasks.element!!!");
		selenium.setSpeed(MID_SPEED);
	    Assert.assertTrue(selenium.isElementPresent("//div[text()='"+rb.getString("menu.jobConductor")+"']"));
		selenium.setSpeed(MIN_SPEED);
	    selenium.click("idSubModuleRefreshButton"); //click "Refresh"
		selenium.mouseDown("//span[text()='testTaskNotChooseActive']");//select a exist task
		selenium.chooseOkOnNextConfirmation();
		selenium.click("idSubModuleDeleteButton");//clcik "Delete"
		Assert.assertTrue(selenium.getConfirmation().matches(other.getString("delete.plan.warning")));
		selenium.setSpeed(MID_SPEED);
		Assert.assertFalse(selenium.isElementPresent("//span[text()='testTaskNotChooseActive']"));//the plan cannot appear
		selenium.setSpeed(MIN_SPEED);
		
	}
}
