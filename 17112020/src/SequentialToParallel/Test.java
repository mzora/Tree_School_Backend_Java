package SequentialToParallel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BufferedImage inputImage = null;

        try {
            inputImage = ImageIO.read(new File("17112020/gris.png"));
        } catch (IOException e) {

        }

        BufferedImage outputCompleteImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);

        Parallel p = new Parallel(0,inputImage.getHeight()/2,inputImage, outputCompleteImage);
        Parallel p2 = new Parallel(inputImage.getHeight()/2,inputImage.getHeight(),inputImage, outputCompleteImage);
        p.start();
        p2.start();

        try{
            p.join();
            p2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            try {
                ImageIO.write(outputCompleteImage, "png", new File("17112020/outputImage.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis() - startTime);
        }

    }
}
