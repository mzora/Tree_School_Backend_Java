package SequentialToParallel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Parallel extends Thread {
    private int H_start,H_end;
    private BufferedImage inputImage;
    public BufferedImage outputImage;
    private static Color black = new Color(0,0,0);
    private static Color white = new Color(255,255,255);

    public Parallel(int h_start,int h_end, BufferedImage inputImage, BufferedImage outputImage){
        this.H_start=h_start;
        this.H_end=h_end;
        this.inputImage=inputImage;
        this.outputImage = outputImage;
    }

    private static double  colorDistance(Color c1, Color c2){
        int redDifference = c1.getRed() - c2.getRed();
        int greenDifference = c1.getGreen() - c2.getGreen();
        int blueDifference = c1.getBlue() - c2.getBlue();
        return Math.sqrt(Math.pow(redDifference, 2) + Math.pow(greenDifference, 2) + Math.pow(blueDifference, 2));
    }

    @Override
    public void run() {
        for(int i = 0; i < inputImage.getWidth(); i++)
            for(int j = H_start; j < H_end; j++)
            {
                double sumNeighboors = 0;
                Color currentPixel = new Color(inputImage.getRGB(i,j));

                for(int internalI = -1; internalI < 2; internalI++)
                    for(int internalJ = -1; internalJ < 2; internalJ++)
                    {
                        if(internalI == 0 && internalI == internalJ)
                            continue;

                        int neighboorI = i + internalI;
                        if(neighboorI < 0 || neighboorI >= inputImage.getWidth())
                            continue;

                        int neighboorJ = j + internalJ;
                        if(neighboorJ < 0 || neighboorJ >= inputImage.getHeight())
                            continue;

                        Color pendingPixel = new Color(inputImage.getRGB(neighboorI,neighboorJ));
                        sumNeighboors += colorDistance(currentPixel, pendingPixel);
                    }

                if (sumNeighboors > 255)
                    outputImage.setRGB(i,j,black.getRGB());
                else
                    outputImage.setRGB(i,j, white.getRGB());
            }
    }
}
