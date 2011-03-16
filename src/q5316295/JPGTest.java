package q5316295;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class JPGTest
{
	public static void compressImage(String filename, String fileExtension) {
	    BufferedImage img = null;
	    try {
	        File file = new File(filename);
	        img = ImageIO.read(file);

	        if (fileExtension.toLowerCase().equals(".png") || fileExtension.toLowerCase().equals(".gif")) {
	            //Since there might be transparent pixel, if I dont do this,
	            //the image will be all black.
	            for (int x = 0; x < img.getWidth(); x++) {
	                for (int y = 0; y < img.getHeight(); y++) {
	                    int rgb = img.getRGB(x, y);
	                    int alpha = (rgb >> 24) & 0xff;
	                    if (alpha != 255) {
	                        img.setRGB(x, y, -1); //set white
	                    }
	                }
	            }
	        }
	        Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("jpg");
	        //Then, choose the first image writer available
	        ImageWriter writer = iter.next();
	        //instantiate an ImageWriteParam object with default compression options
	        ImageWriteParam iwp = writer.getDefaultWriteParam();
	        //Set the compression quality
	        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
	        iwp.setCompressionQuality(0.8f);
	        //delete the file. If I dont the file size will stay the same
	        file.delete();
	        ImageOutputStream output = ImageIO.createImageOutputStream(new File(filename));
	        writer.setOutput(output);
	        IIOImage image = new IIOImage(img, null, null);
	        writer.write(null, image, iwp);
	        writer.dispose();
	    } catch (IOException ioe) {
	        ioe.printStackTrace();
	    }
	}
	public static void main(String[] args)
	{
		compressImage("/Users/mattball/Desktop/original.jpg", ".jpg");
	}

}
