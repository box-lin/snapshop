package csc142project3;

public class EdgyFilter implements Filter {

	@Override
	public void filter(PixelImage pi) {
		int[][] weights = { {-1,-1,-1},
							{-1,9,-1},
							{-1,-1,-1}};
		pi.transformImage(weights);
		//transformImages is where the computation of the 
		// new pixels is done
	}

}