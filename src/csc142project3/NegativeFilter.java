package csc142project3;

public class NegativeFilter implements Filter {
	
	@Override
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		for (int a = 0;a<pi.getHeight();a++){
			for(int b = 0; b<pi.getWidth();b++){
				//subtracting the original rgb value from 255
				int negativeR = 255-data[a][b].red;  
				int negativeG = 255-data[a][b].green;
				int negativeB = 255-data[a][b].blue;
				// set color negative
				data[a][b].red = negativeR;
				data[a][b].green = negativeG;
				data[a][b].blue = negativeB;
			}
		}
		pi.setData(data);
	}

}