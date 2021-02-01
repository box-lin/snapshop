package csc142project3;

public class BlackAndWhiteFilter implements Filter {
	
	@Override
	public void filter(PixelImage pi) {
 
		Pixel[][] data = pi.getData();
		
		for (int x = 0;x<pi.getHeight();x++){
			for(int y = 0; y<pi.getWidth();y++){
				//average the three colors for each .
				data[x][y].red = (data[x][y].red+data[x][y].green+data[x][y].blue)/3;
				data[x][y].green = (data[x][y].red+data[x][y].green+data[x][y].blue)/3;
				data[x][y].blue = (data[x][y].red+data[x][y].green+data[x][y].blue)/3;
			}
		}
		pi.setData(data);
	}

}

