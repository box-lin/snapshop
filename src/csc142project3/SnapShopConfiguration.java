package csc142project3;

//Write your short report here (-2 if there is no report)

/*	<<Report>>
 * 
 *  Have multiple tries at the beginning when working on Vertical filter, hold the first intuition that Vertical flip shall be opposite to the given 
 * 	Horizontal flip. The first misconception we have wrongly substituted the width into the for-loop "rows" and height into for-loop "columns", it just flip 
 *  a partial image and looks strange, then finally find out to achieved opposite as given horizontal flip, we need have to swap the part of the "2D 
 *  array interchanging" in HorizontalFilter. 
 *  
 * 	The most difficult part for us is to create a new pixel average weighted method. We first defining out every each pixel point one by one and that 
 * 	just make the whole method looks so heavy, we have an intuition that we actually can do the steps in all one step by just get it for-loop 4 times 
 * 	to get that all 9 pixel point defined, sum up its RGB, and divide that with the input weight total to get the average.  
 * 
 *  Lastly, we have add an additional transformation - black and white. This idea of method was discover on Youtube video, with the given formula: 
 *  "Avg= (R+G+B)/3", and we have try multiple times to inserting our own 2D array into the filter, we had came out as what we named: Low bright 
 *  and shaking filter, because we found out the more 1 we insert we will have the less brightness effect to the photo and the more difference between
 *  digits the photo seems more unstable, likewise, the photo looks like is shaking.
 *  
 * 
 */


/**
* A class to configure the SnapShop application
*
* @author (Boxiang Lin & Dalong Xue)
* @version (11/23/2019)
*/
public class SnapShopConfiguration{
/**
* Method to configure the SnapShop.  Call methods like addFilter
* and setDefaultFilename here.
* @param theShop A pointer to the application
*/
	public static void configure(SnapShop theShop){

		theShop.setDefaultFilename("c:/User/Destop/images.jpg");
		theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
		theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
		theShop.addFilter(new NegativeFilter(), "Negative");
		theShop.addFilter(new GaussianFilter(), "Gaussian");
		theShop.addFilter(new LaplacianFilter(), "Laplacian");
		theShop.addFilter(new UnsharpMaskingFilter(), "Unsharp Masking");
		theShop.addFilter(new EdgyFilter(), "Edgy");
		theShop.addFilter(new BlackAndWhiteFilter(), "Black&White Test01");
		// add your other filters below
	}
}