package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class SearchpageScripts extends BaseTest{
	
	@Test
	public void Searchpage_BrandSearch() throws IOException, InterruptedException {
		TestDescription("Searchpage_BrandSearch",
				"To verify whether guest user able to search using the brand names");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "BrandSearch");
			String BrandSearchTermList = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.searchTerm(BrandSearchTermList);
			
		

			
	}	
	
}
