package p4_student;

import cmsc131PhotoLibrary.Photograph;
import cmsc131PhotoLibrary.Pixel;

/**
 * This class will be written by the Student.  It provides various
 * static methods that take a photograph and produce a new one based
 * on it, but with various modifications.
 * 
 * See the project description for details of method implementations.
 * 
 * @author CMSC 131 Student
 *
 */
public class PhotoTools {


	//THIS METHOD IS PROVIDED AS A STARTING POINT.  PLEASE READ THROUGH
	//  IT AND THINK ABOUT WHAT IT DOES AND WHY - IF YOU AREN'T SURE OF
	//  SOMETHING, ASK US IN OFFICE HOURS!
	public static Photograph copy(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}






	public static Photograph isolateColor(Photograph photo, int type) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		if(type == 1){
			for (int x=0; x<photo.getWd(); x++) {
				for (int y=0; y<photo.getHt(); y++) {
					newPhoto.setPixel(x, y, new Pixel(0, 0, photo.getPixel(x, y).getBlue()));
				}
			}
		}
		if(type == 0){
			for (int x=0; x<photo.getWd(); x++) {
				for (int y=0; y<photo.getHt(); y++) {
					newPhoto.setPixel(x, y, new Pixel(photo.getPixel(x, y).getRed(), 0, 0));
				}
			}
		}
		return newPhoto;
	}





	public static Photograph makeGrayscale(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				int grayValue = (int)(photo.getPixel(x, y).getRed() * 0.3) + (int)(photo.getPixel(x, y).getGreen() * 0.6) + (int)(photo.getPixel(x, y).getBlue() * 0.1);
				newPhoto.setPixel(x, y, new Pixel(grayValue, grayValue, grayValue));
			}
		}
		return newPhoto;
	}



	public static Photograph makeArtistic(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				int grayValue = (int)(photo.getPixel(x, y).getRed()) + (int)(photo.getPixel(x, y).getGreen()) + (int)(photo.getPixel(x, y).getBlue());
				if(grayValue>=0 && grayValue<=153)
					newPhoto.setPixel(x, y, new Pixel(0, 0, 0));
				else if(grayValue>=154 && grayValue<=306)
					newPhoto.setPixel(x, y, new Pixel(63, 63, 63));
				else if(grayValue>=307 && grayValue<=459)
					newPhoto.setPixel(x, y, new Pixel(127, 127, 127));
				else if(grayValue>=460 && grayValue<=612)
					newPhoto.setPixel(x, y, new Pixel(191, 191, 191));
				else if(grayValue>=613 && grayValue<=765)
					newPhoto.setPixel(x, y, new Pixel(255, 255, 255));
			}
		}
		return newPhoto;
	}



	public static Photograph censorIt(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());

		for(int y=0; y<photo.getHt(); y+=10){
			for(int x=0; x<photo.getWd(); x+=10){
				int avgR=0, avgB=0, avgG=0;
				for(int i=x; i<x+10; i++)
					for(int j=y; j<y+10; j++){
						avgR += photo.getPixel(i, j).getRed();
						avgB += photo.getPixel(i, j).getBlue();
						avgG += photo.getPixel(i, j).getGreen();
					}
				avgR/=100; avgB/=100; avgG/=100;
				for(int i=x; i<x+10; i++)
					for(int j=y; j<y+10; j++)
						newPhoto.setPixel(i, j, new Pixel(avgR, avgG, avgB));
			}
		}
		//HINT: To deal with the edge cases, you'll want to 
		//      check you aren't going out of bounds in the
		//      middle of your nested nesting of loops...

		return newPhoto;
	}


	public static Photograph stretched(Photograph photo, int type) {
		Photograph newPhoto;
		//row times 2
		if(type == 1){
			newPhoto = new Photograph(photo.getWd(), photo.getHt()*2);
			for (int x=0; x<photo.getWd(); x++) {
				for (int y=0; y<newPhoto.getHt(); y+=2) {
					Pixel p = photo.getPixel(x, y/2);
					newPhoto.setPixel(x, y, p);
					newPhoto.setPixel(x, y+1, p);
				}
			}
			return newPhoto;
		}
		//column times 2
		else if(type == 0){
			newPhoto = new Photograph(photo.getWd()*2, photo.getHt());
			for (int y=0; y<photo.getHt(); y++) {
				for (int x=0; x<newPhoto.getWd(); x+=2) {
					Pixel p = photo.getPixel(x/2, y);
					newPhoto.setPixel(x, y, p);
					newPhoto.setPixel(x+1, y, p);
				}
			}
			return newPhoto;
		}
		else
			return new Photograph(photo.getWd(), photo.getHt());
	}



	public static Photograph mirrorIt(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		int width = photo.getWd()-1;
		for (int y=0; y<photo.getHt(); y++) {
			for (int x=0; x<photo.getWd(); x++) {
				Pixel p = photo.getPixel(x, y);
				newPhoto.setPixel(width-x, y, p);
			}
		}
		return newPhoto;
	}



	public static Photograph makeDoubleWithMirror(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd()*2, photo.getHt());
		Photograph rev = mirrorIt(photo);
		for (int x=0; x<newPhoto.getWd()/2; x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, rev.getPixel(x, y));
			}
		}
		for (int x=newPhoto.getWd()/2; x<newPhoto.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x%photo.getWd(), y));
			}
		}
		return newPhoto;
	}

	public static Photograph rotated(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getHt(), photo.getWd());
		for (int x=0; x<photo.getHt(); x++) {
			for (int y=0; y<photo.getWd(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(y, x));
			}
		}
		return upsideDown(newPhoto);
	}

	public static Photograph upsideDown(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		int height = photo.getHt()-1;
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, height-y));
			}
		}
		return mirrorIt(newPhoto);
	}



}
