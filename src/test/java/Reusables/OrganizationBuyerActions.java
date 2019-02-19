package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.OrganizationBuyerRepo;
import pageObjectsRepo.RegisterationpageRepo;

public class OrganizationBuyerActions extends OrganizationBuyerRepo {

	public OrganizationBuyerActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void OrganizationValidations() throws IOException {

		ElementPresent(organizationInfo);
		ElementPresent(orgAddressDetailsEditMain);
		ElementPresent(orgContactInfoEditMain);
		ElementPresent(memberGroupEditMain);
		ElementPresent(orgRolesEditMain);
		logs("OrganizationValidations completed");
	}

	public void Organizationpage() {
		WaitUntilElementClickable(Organizations_Buyers);
		Organizations_Buyers.click();
		logs("Organizationpage buyer button clicked ");
		WaitUntilElementClickable(EditOrganization_Button);
		EditOrganization_Button.click();
		logs("Edit Organozation Clicked ");
		}

	public void AddressValidation() {
		WaitUntilElementClickable(orgAddressDetailsEditIcon);
		orgAddressDetailsEditIcon.click();
		WaitUntilElementClickable(address1);
		ElementPresent(address1);
		ElementPresent(city);
		ElementPresent(Input_state);
		ElementPresent(zipCode);
		ElementPresent(Input_country);
		ElementPresent(orgAddressDetails_save);
		ElementPresent(orgAddressDetails_Cancel);
		logs("AddressValidation  completed");
		orgAddressDetails_Cancel.click();

	}

	public void ContactValidation() {
		WaitUntilElementClickable(orgContactDetailsEditIcon);
		orgContactDetailsEditIcon.click();
		WaitUntilElementClickable(email1);
		ElementPresent(email1);
		ElementPresent(phone1);
		ElementPresent(fax1);
		ElementPresent(ContactValidation_Cancel);
		ElementPresent(ContactValidation_Save);
		logs("Contact validatios completed");
		ContactValidation_Cancel.click();
	}

	public void MemberValidations() {
		WaitUntilElementClickable(MemberEditIcon);
		MemberEditIcon.click();
		WaitUntilElementClickable(Orderapprovals_Checkbox);
		ElementPresent(Orderapprovals_Checkbox);
		ElementPresent(Buyerapprovals_Checkbox);
		ElementPresent(InheritBuyerapprovals_Checkbox);
		ElementPresent(InheritOrderapprovals_Checkbox);
		ElementPresent(MemberValidation_Cancel);
		ElementPresent(MemberValidation_Save);
		MemberValidation_Cancel.click();
		logs("MemberValidations completed");

	}


}
