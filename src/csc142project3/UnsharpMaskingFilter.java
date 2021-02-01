package csc142project3;

public class UnsharpMaskingFilter implements Filter {

	@Override
	public void filter(PixelImage pi) {
		
		int[][] weights = { {-1,-2,-1},
							{-2,28,-2},
							{-1,-2,-1} };
		pi.transformImage(weights);
		
	}

}